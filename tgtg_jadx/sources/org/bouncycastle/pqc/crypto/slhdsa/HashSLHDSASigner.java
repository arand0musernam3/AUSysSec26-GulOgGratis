package org.bouncycastle.pqc.crypto.slhdsa;

import com.braze.h2;
import i4.a;
import j4.s;
import java.io.IOException;
import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithContext;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.DigestUtils;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class HashSLHDSASigner implements Signer {
    private Digest digest;
    private byte[] msgPrefix;
    private SLHDSAPrivateKeyParameters privKey;
    private SLHDSAPublicKeyParameters pubKey;
    private SecureRandom random;

    private static Digest createDigest(SLHDSAParameters sLHDSAParameters) {
        int type = sLHDSAParameters.getType();
        if (type == 0) {
            return sLHDSAParameters.getName().startsWith("sha2") ? (SLHDSAParameters.sha2_128f == sLHDSAParameters || SLHDSAParameters.sha2_128s == sLHDSAParameters) ? SHA256Digest.newInstance() : new SHA512Digest() : (SLHDSAParameters.shake_128f == sLHDSAParameters || SLHDSAParameters.shake_128s == sLHDSAParameters) ? new SHAKEDigest(128) : new SHAKEDigest(256);
        }
        if (type == 1) {
            return SHA256Digest.newInstance();
        }
        if (type == 2) {
            return new SHA512Digest();
        }
        if (type == 3) {
            return new SHAKEDigest(128);
        }
        if (type == 4) {
            return new SHAKEDigest(256);
        }
        a.f("unknown parameters type");
        return null;
    }

    private void initDigest(SLHDSAParameters sLHDSAParameters, ParametersWithContext parametersWithContext) {
        Digest digestCreateDigest = createDigest(sLHDSAParameters);
        this.digest = digestCreateDigest;
        try {
            byte[] encoded = DigestUtils.getDigestOid(digestCreateDigest.getAlgorithmName()).getEncoded(ASN1Encoding.DER);
            int contextLength = parametersWithContext == null ? 0 : parametersWithContext.getContextLength();
            int i11 = contextLength + 2;
            byte[] bArr = new byte[encoded.length + i11];
            this.msgPrefix = bArr;
            bArr[0] = 1;
            bArr[1] = (byte) contextLength;
            if (parametersWithContext != null) {
                parametersWithContext.copyContextTo(bArr, 2, contextLength);
            }
            System.arraycopy(encoded, 0, this.msgPrefix, i11, encoded.length);
        } catch (IOException e5) {
            h2.b(s.g(e5, new StringBuilder("oid encoding failed: ")));
        }
    }

    private static byte[] internalGenerateSignature(SLHDSAPrivateKeyParameters sLHDSAPrivateKeyParameters, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SLHDSAEngine engine = sLHDSAPrivateKeyParameters.getParameters().getEngine();
        engine.init(sLHDSAPrivateKeyParameters.f33608pk.seed);
        Fors fors = new Fors(engine);
        byte[] bArrPRF_msg = engine.PRF_msg(sLHDSAPrivateKeyParameters.f33609sk.prf, bArr3, bArr, bArr2);
        PK pk2 = sLHDSAPrivateKeyParameters.f33608pk;
        IndexedDigest indexedDigestH_msg = engine.H_msg(bArrPRF_msg, pk2.seed, pk2.root, bArr, bArr2);
        byte[] bArr4 = indexedDigestH_msg.digest;
        long j9 = indexedDigestH_msg.idx_tree;
        int i11 = indexedDigestH_msg.idx_leaf;
        ADRS adrs = new ADRS();
        adrs.setTypeAndClear(3);
        adrs.setTreeAddress(j9);
        adrs.setKeyPairAddress(i11);
        SIG_FORS[] sig_forsArrSign = fors.sign(bArr4, sLHDSAPrivateKeyParameters.f33609sk.seed, sLHDSAPrivateKeyParameters.f33608pk.seed, adrs);
        ADRS adrs2 = new ADRS();
        adrs2.setTypeAndClear(3);
        adrs2.setTreeAddress(j9);
        adrs2.setKeyPairAddress(i11);
        byte[] bArrPkFromSig = fors.pkFromSig(sig_forsArrSign, bArr4, sLHDSAPrivateKeyParameters.f33608pk.seed, adrs2);
        new ADRS().setTypeAndClear(2);
        byte[] bArrSign = new HT(engine, sLHDSAPrivateKeyParameters.getSeed(), sLHDSAPrivateKeyParameters.getPublicSeed()).sign(bArrPkFromSig, j9, i11);
        int length = sig_forsArrSign.length;
        byte[][] bArr5 = new byte[length + 2][];
        int i12 = 0;
        bArr5[0] = bArrPRF_msg;
        while (i12 != sig_forsArrSign.length) {
            int i13 = i12 + 1;
            SIG_FORS sig_fors = sig_forsArrSign[i12];
            bArr5[i13] = Arrays.concatenate(sig_fors.f33594sk, Arrays.concatenate(sig_fors.authPath));
            i12 = i13;
        }
        bArr5[length + 1] = bArrSign;
        return Arrays.concatenate(bArr5);
    }

    private static boolean internalVerifySignature(SLHDSAPublicKeyParameters sLHDSAPublicKeyParameters, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SLHDSAEngine engine = sLHDSAPublicKeyParameters.getParameters().getEngine();
        engine.init(sLHDSAPublicKeyParameters.getSeed());
        ADRS adrs = new ADRS();
        int i11 = engine.K;
        int i12 = engine.A;
        int i13 = ((i12 + 1) * i11) + 1 + engine.H;
        int i14 = engine.D;
        int i15 = engine.WOTS_LEN;
        int i16 = (i14 * i15) + i13;
        int i17 = engine.N;
        if (i16 * i17 != bArr3.length) {
            return false;
        }
        SIG sig = new SIG(i17, i11, i12, i14, engine.H_PRIME, i15, bArr3);
        byte[] r11 = sig.getR();
        SIG_FORS[] sig_fors = sig.getSIG_FORS();
        SIG_XMSS[] sig_ht = sig.getSIG_HT();
        IndexedDigest indexedDigestH_msg = engine.H_msg(r11, sLHDSAPublicKeyParameters.getSeed(), sLHDSAPublicKeyParameters.getRoot(), bArr, bArr2);
        byte[] bArr4 = indexedDigestH_msg.digest;
        long j9 = indexedDigestH_msg.idx_tree;
        int i18 = indexedDigestH_msg.idx_leaf;
        adrs.setTypeAndClear(3);
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j9);
        adrs.setKeyPairAddress(i18);
        byte[] bArrPkFromSig = new Fors(engine).pkFromSig(sig_fors, bArr4, sLHDSAPublicKeyParameters.getSeed(), adrs);
        adrs.setTypeAndClear(2);
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j9);
        adrs.setKeyPairAddress(i18);
        return new HT(engine, null, sLHDSAPublicKeyParameters.getSeed()).verify(bArrPkFromSig, sig_ht, sLHDSAPublicKeyParameters.getSeed(), j9, i18, sLHDSAPublicKeyParameters.getRoot());
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws DataLengthException, CryptoException {
        SLHDSAEngine engine = this.privKey.getParameters().getEngine();
        engine.init(this.privKey.f33608pk.seed);
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        int i11 = engine.N;
        byte[] bArr2 = new byte[i11];
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr2);
        } else {
            System.arraycopy(this.privKey.f33608pk.seed, 0, bArr2, 0, i11);
        }
        return internalGenerateSignature(this.privKey, this.msgPrefix, bArr, bArr2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z11, CipherParameters cipherParameters) {
        ParametersWithContext parametersWithContext;
        SLHDSAParameters parameters;
        if (cipherParameters instanceof ParametersWithContext) {
            ParametersWithContext parametersWithContext2 = (ParametersWithContext) cipherParameters;
            CipherParameters parameters2 = parametersWithContext2.getParameters();
            if (parametersWithContext2.getContextLength() > 255) {
                a.f("context too long");
                return;
            } else {
                parametersWithContext = parametersWithContext2;
                cipherParameters = parameters2;
            }
        } else {
            parametersWithContext = null;
        }
        if (z11) {
            this.pubKey = null;
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.privKey = (SLHDSAPrivateKeyParameters) parametersWithRandom.getParameters();
                this.random = parametersWithRandom.getRandom();
            } else {
                this.privKey = (SLHDSAPrivateKeyParameters) cipherParameters;
                this.random = null;
            }
            parameters = this.privKey.getParameters();
        } else {
            SLHDSAPublicKeyParameters sLHDSAPublicKeyParameters = (SLHDSAPublicKeyParameters) cipherParameters;
            this.pubKey = sLHDSAPublicKeyParameters;
            this.privKey = null;
            this.random = null;
            parameters = sLHDSAPublicKeyParameters.getParameters();
        }
        initDigest(parameters, parametersWithContext);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b8) {
        this.digest.update(b8);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        return internalVerifySignature(this.pubKey, this.msgPrefix, bArr2, bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i11, int i12) {
        this.digest.update(bArr, i11, i12);
    }

    public boolean internalVerifySignature(byte[] bArr, byte[] bArr2) {
        return internalVerifySignature(this.pubKey, null, bArr, bArr2);
    }

    public byte[] internalGenerateSignature(byte[] bArr, byte[] bArr2) {
        return internalGenerateSignature(this.privKey, null, bArr, bArr2);
    }
}

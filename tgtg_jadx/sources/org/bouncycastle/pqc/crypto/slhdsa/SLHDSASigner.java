package org.bouncycastle.pqc.crypto.slhdsa;

import i4.a;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithContext;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class SLHDSASigner implements MessageSigner {
    private static final byte[] DEFAULT_PREFIX = {0, 0};
    private byte[] msgPrefix;
    private SLHDSAPrivateKeyParameters privKey;
    private SLHDSAPublicKeyParameters pubKey;
    private SecureRandom random;

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

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        SLHDSAEngine engine = this.privKey.getParameters().getEngine();
        engine.init(this.privKey.f33608pk.seed);
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

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z11, CipherParameters cipherParameters) {
        String str;
        SLHDSAParameters parameters;
        if (cipherParameters instanceof ParametersWithContext) {
            ParametersWithContext parametersWithContext = (ParametersWithContext) cipherParameters;
            CipherParameters parameters2 = parametersWithContext.getParameters();
            int contextLength = parametersWithContext.getContextLength();
            if (contextLength > 255) {
                str = "context too long";
                a.f(str);
            }
            byte[] bArr = new byte[contextLength + 2];
            this.msgPrefix = bArr;
            bArr[0] = 0;
            bArr[1] = (byte) contextLength;
            parametersWithContext.copyContextTo(bArr, 2, contextLength);
            cipherParameters = parameters2;
        } else {
            this.msgPrefix = DEFAULT_PREFIX;
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
        if (parameters.isPreHash()) {
            str = "\"pure\" slh-dsa must use non pre-hash parameters";
            a.f(str);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        return internalVerifySignature(this.pubKey, this.msgPrefix, bArr, bArr2);
    }

    public boolean internalVerifySignature(byte[] bArr, byte[] bArr2) {
        return internalVerifySignature(this.pubKey, null, bArr, bArr2);
    }

    public byte[] internalGenerateSignature(byte[] bArr, byte[] bArr2) {
        return internalGenerateSignature(this.privKey, null, bArr, bArr2);
    }
}

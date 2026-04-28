package org.bouncycastle.pqc.legacy.crypto.mceliece;

import com.braze.h2;
import i4.a;
import java.security.SecureRandom;
import m0.i1;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.prng.DigestRandomGenerator;
import org.bouncycastle.pqc.crypto.MessageEncryptor;
import org.bouncycastle.pqc.legacy.math.linearalgebra.ByteUtils;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Vector;

/* JADX INFO: loaded from: classes3.dex */
public class McEliecePointchevalCipher implements MessageEncryptor {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2.2";
    private boolean forEncryption;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33703k;
    McElieceCCA2KeyParameters key;
    private Digest messDigest;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f33704n;

    /* JADX INFO: renamed from: sr, reason: collision with root package name */
    private SecureRandom f33705sr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f33706t;

    private void initCipherDecrypt(McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters) {
        this.messDigest = Utils.getDigest(mcElieceCCA2PrivateKeyParameters.getDigest());
        this.f33704n = mcElieceCCA2PrivateKeyParameters.getN();
        this.f33703k = mcElieceCCA2PrivateKeyParameters.getK();
        this.f33706t = mcElieceCCA2PrivateKeyParameters.getT();
    }

    private void initCipherEncrypt(McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters) {
        this.messDigest = Utils.getDigest(mcElieceCCA2PublicKeyParameters.getDigest());
        this.f33704n = mcElieceCCA2PublicKeyParameters.getN();
        this.f33703k = mcElieceCCA2PublicKeyParameters.getK();
        this.f33706t = mcElieceCCA2PublicKeyParameters.getT();
    }

    public int decryptOutputSize(int i11) {
        return 0;
    }

    public int encryptOutputSize(int i11) {
        return 0;
    }

    public int getKeySize(McElieceCCA2KeyParameters mcElieceCCA2KeyParameters) throws IllegalArgumentException {
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PublicKeyParameters) {
            return ((McElieceCCA2PublicKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PrivateKeyParameters) {
            return ((McElieceCCA2PrivateKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        a.f("unsupported type");
        return 0;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forEncryption = z11;
        if (!z11) {
            McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters = (McElieceCCA2PrivateKeyParameters) cipherParameters;
            this.key = mcElieceCCA2PrivateKeyParameters;
            initCipherDecrypt(mcElieceCCA2PrivateKeyParameters);
        } else {
            if (!(cipherParameters instanceof ParametersWithRandom)) {
                this.f33705sr = CryptoServicesRegistrar.getSecureRandom();
                McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = (McElieceCCA2PublicKeyParameters) cipherParameters;
                this.key = mcElieceCCA2PublicKeyParameters;
                initCipherEncrypt(mcElieceCCA2PublicKeyParameters);
                return;
            }
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f33705sr = parametersWithRandom.getRandom();
            McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters2 = (McElieceCCA2PublicKeyParameters) parametersWithRandom.getParameters();
            this.key = mcElieceCCA2PublicKeyParameters2;
            initCipherEncrypt(mcElieceCCA2PublicKeyParameters2);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) throws InvalidCipherTextException {
        if (this.forEncryption) {
            h2.b("cipher initialised for decryption");
            return null;
        }
        int i11 = (this.f33704n + 7) >> 3;
        int length = bArr.length - i11;
        byte[][] bArrSplit = ByteUtils.split(bArr, i11);
        byte[] bArr2 = bArrSplit[0];
        byte[] bArr3 = bArrSplit[1];
        GF2Vector[] gF2VectorArrDecryptionPrimitive = McElieceCCA2Primitives.decryptionPrimitive((McElieceCCA2PrivateKeyParameters) this.key, GF2Vector.OS2VP(this.f33704n, bArr2));
        byte[] encoded = gF2VectorArrDecryptionPrimitive[0].getEncoded();
        GF2Vector gF2Vector = gF2VectorArrDecryptionPrimitive[1];
        DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
        digestRandomGenerator.addSeedMaterial(encoded);
        byte[] bArr4 = new byte[length];
        digestRandomGenerator.nextBytes(bArr4);
        for (int i12 = 0; i12 < length; i12++) {
            bArr4[i12] = (byte) (bArr4[i12] ^ bArr3[i12]);
        }
        this.messDigest.update(bArr4, 0, length);
        byte[] bArr5 = new byte[this.messDigest.getDigestSize()];
        this.messDigest.doFinal(bArr5, 0);
        if (Conversions.encode(this.f33704n, this.f33706t, bArr5).equals(gF2Vector)) {
            return ByteUtils.split(bArr4, length - (this.f33703k >> 3))[0];
        }
        i1.i("Bad Padding: Invalid ciphertext.");
        return null;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) {
        if (!this.forEncryption) {
            h2.b("cipher initialised for decryption");
            return null;
        }
        int i11 = this.f33703k >> 3;
        byte[] bArr2 = new byte[i11];
        this.f33705sr.nextBytes(bArr2);
        GF2Vector gF2Vector = new GF2Vector(this.f33703k, this.f33705sr);
        byte[] encoded = gF2Vector.getEncoded();
        byte[] bArrConcatenate = ByteUtils.concatenate(bArr, bArr2);
        this.messDigest.update(bArrConcatenate, 0, bArrConcatenate.length);
        byte[] bArr3 = new byte[this.messDigest.getDigestSize()];
        this.messDigest.doFinal(bArr3, 0);
        byte[] encoded2 = McElieceCCA2Primitives.encryptionPrimitive((McElieceCCA2PublicKeyParameters) this.key, gF2Vector, Conversions.encode(this.f33704n, this.f33706t, bArr3)).getEncoded();
        DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
        digestRandomGenerator.addSeedMaterial(encoded);
        byte[] bArr4 = new byte[bArr.length + i11];
        digestRandomGenerator.nextBytes(bArr4);
        for (int i12 = 0; i12 < bArr.length; i12++) {
            bArr4[i12] = (byte) (bArr4[i12] ^ bArr[i12]);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int length = bArr.length + i13;
            bArr4[length] = (byte) (bArr4[length] ^ bArr2[i13]);
        }
        return ByteUtils.concatenate(encoded2, bArr4);
    }
}

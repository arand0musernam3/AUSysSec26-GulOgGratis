package org.bouncycastle.pqc.crypto.mlkem;

import i4.a;
import java.security.SecureRandom;
import org.bouncycastle.pqc.crypto.mlkem.Symmetric;
import org.bouncycastle.util.Arrays;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
class MLKEMEngine {
    private static final int KyberEta2 = 2;
    private static final int KyberIndCpaMsgBytes = 32;
    public static final int KyberN = 256;
    public static final int KyberPolyBytes = 384;
    public static final int KyberQ = 3329;
    public static final int KyberQinv = 62209;
    private static final int KyberSharedSecretBytes = 32;
    public static final int KyberSymBytes = 32;
    private final int CryptoBytes;
    private final int CryptoCipherTextBytes;
    private final int CryptoPublicKeyBytes;
    private final int CryptoSecretKeyBytes;
    private final int KyberCipherTextBytes;
    private final int KyberEta1;
    private final int KyberIndCpaBytes;
    private final int KyberIndCpaPublicKeyBytes;
    private final int KyberIndCpaSecretKeyBytes;
    private final int KyberK;
    private final int KyberPolyCompressedBytes;
    private final int KyberPolyVecBytes;
    private final int KyberPolyVecCompressedBytes;
    private final int KyberPublicKeyBytes;
    private final int KyberSecretKeyBytes;
    private MLKEMIndCpa indCpa;
    private SecureRandom random;
    private final int sessionKeyLength;
    private final Symmetric symmetric;

    public MLKEMEngine(int i11) {
        this.KyberK = i11;
        if (i11 == 2) {
            this.KyberEta1 = 3;
        } else {
            if (i11 != 3) {
                if (i11 != 4) {
                    a.f(k.h(i11, "K: ", " is not supported for Crystals Kyber"));
                    throw null;
                }
                this.KyberEta1 = 2;
                this.KyberPolyCompressedBytes = 160;
                this.KyberPolyVecCompressedBytes = i11 * 352;
                this.sessionKeyLength = 32;
                int i12 = i11 * KyberPolyBytes;
                this.KyberPolyVecBytes = i12;
                int i13 = i12 + 32;
                this.KyberIndCpaPublicKeyBytes = i13;
                this.KyberIndCpaSecretKeyBytes = i12;
                int i14 = this.KyberPolyVecCompressedBytes + this.KyberPolyCompressedBytes;
                this.KyberIndCpaBytes = i14;
                this.KyberPublicKeyBytes = i13;
                int i15 = i12 + i13 + 64;
                this.KyberSecretKeyBytes = i15;
                this.KyberCipherTextBytes = i14;
                this.CryptoBytes = 32;
                this.CryptoSecretKeyBytes = i15;
                this.CryptoPublicKeyBytes = i13;
                this.CryptoCipherTextBytes = i14;
                this.symmetric = new Symmetric.ShakeSymmetric();
                this.indCpa = new MLKEMIndCpa(this);
            }
            this.KyberEta1 = 2;
        }
        this.KyberPolyCompressedBytes = 128;
        this.KyberPolyVecCompressedBytes = i11 * 320;
        this.sessionKeyLength = 32;
        int i122 = i11 * KyberPolyBytes;
        this.KyberPolyVecBytes = i122;
        int i132 = i122 + 32;
        this.KyberIndCpaPublicKeyBytes = i132;
        this.KyberIndCpaSecretKeyBytes = i122;
        int i142 = this.KyberPolyVecCompressedBytes + this.KyberPolyCompressedBytes;
        this.KyberIndCpaBytes = i142;
        this.KyberPublicKeyBytes = i132;
        int i152 = i122 + i132 + 64;
        this.KyberSecretKeyBytes = i152;
        this.KyberCipherTextBytes = i142;
        this.CryptoBytes = 32;
        this.CryptoSecretKeyBytes = i152;
        this.CryptoPublicKeyBytes = i132;
        this.CryptoCipherTextBytes = i142;
        this.symmetric = new Symmetric.ShakeSymmetric();
        this.indCpa = new MLKEMIndCpa(this);
    }

    private void cmov(byte[] bArr, byte[] bArr2, int i11, boolean z11) {
        if (z11) {
            System.arraycopy(bArr2, 0, bArr, 0, i11);
        } else {
            System.arraycopy(bArr, 0, bArr, 0, i11);
        }
    }

    public static int getKyberEta2() {
        return 2;
    }

    public static int getKyberIndCpaMsgBytes() {
        return 32;
    }

    public byte[][] generateKemKeyPair() {
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[32];
        this.random.nextBytes(bArr);
        this.random.nextBytes(bArr2);
        return generateKemKeyPairInternal(bArr, bArr2);
    }

    public byte[][] generateKemKeyPairInternal(byte[] bArr, byte[] bArr2) {
        byte[][] bArrGenerateKeyPair = this.indCpa.generateKeyPair(bArr);
        int i11 = this.KyberIndCpaSecretKeyBytes;
        byte[] bArr3 = new byte[i11];
        System.arraycopy(bArrGenerateKeyPair[1], 0, bArr3, 0, i11);
        byte[] bArr4 = new byte[32];
        this.symmetric.hash_h(bArr4, bArrGenerateKeyPair[0], 0);
        int i12 = this.KyberIndCpaPublicKeyBytes;
        byte[] bArr5 = new byte[i12];
        System.arraycopy(bArrGenerateKeyPair[0], 0, bArr5, 0, i12);
        int i13 = i12 - 32;
        return new byte[][]{Arrays.copyOfRange(bArr5, 0, i13), Arrays.copyOfRange(bArr5, i13, i12), bArr3, bArr4, bArr2, Arrays.concatenate(bArr, bArr2)};
    }

    public int getCryptoBytes() {
        return this.CryptoBytes;
    }

    public int getCryptoCipherTextBytes() {
        return this.CryptoCipherTextBytes;
    }

    public int getCryptoPublicKeyBytes() {
        return this.CryptoPublicKeyBytes;
    }

    public int getCryptoSecretKeyBytes() {
        return this.CryptoSecretKeyBytes;
    }

    public int getKyberCipherTextBytes() {
        return this.KyberCipherTextBytes;
    }

    public int getKyberEta1() {
        return this.KyberEta1;
    }

    public int getKyberIndCpaBytes() {
        return this.KyberIndCpaBytes;
    }

    public int getKyberIndCpaPublicKeyBytes() {
        return this.KyberIndCpaPublicKeyBytes;
    }

    public int getKyberIndCpaSecretKeyBytes() {
        return this.KyberIndCpaSecretKeyBytes;
    }

    public int getKyberK() {
        return this.KyberK;
    }

    public int getKyberPolyCompressedBytes() {
        return this.KyberPolyCompressedBytes;
    }

    public int getKyberPolyVecBytes() {
        return this.KyberPolyVecBytes;
    }

    public int getKyberPolyVecCompressedBytes() {
        return this.KyberPolyVecCompressedBytes;
    }

    public int getKyberPublicKeyBytes() {
        return this.KyberPublicKeyBytes;
    }

    public int getKyberSecretKeyBytes() {
        return this.KyberSecretKeyBytes;
    }

    public void getRandomBytes(byte[] bArr) {
        this.random.nextBytes(bArr);
    }

    public Symmetric getSymmetric() {
        return this.symmetric;
    }

    public void init(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    public byte[] kemDecrypt(byte[] bArr, byte[] bArr2) {
        return kemDecryptInternal(bArr, bArr2);
    }

    public byte[] kemDecryptInternal(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[64];
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.KyberIndCpaSecretKeyBytes, bArr.length);
        System.arraycopy(this.indCpa.decrypt(bArr, bArr2), 0, bArr3, 0, 32);
        System.arraycopy(bArr, this.KyberSecretKeyBytes - 64, bArr3, 32, 32);
        this.symmetric.hash_g(bArr4, bArr3);
        byte[] bArr5 = new byte[this.KyberCipherTextBytes + 32];
        System.arraycopy(bArr, this.KyberSecretKeyBytes - 32, bArr5, 0, 32);
        System.arraycopy(bArr2, 0, bArr5, 32, this.KyberCipherTextBytes);
        this.symmetric.kdf(bArr5, bArr5);
        cmov(bArr4, bArr5, 32, !Arrays.constantTimeAreEqual(bArr2, this.indCpa.encrypt(bArrCopyOfRange, Arrays.copyOfRange(bArr3, 0, 32), Arrays.copyOfRange(bArr4, 32, 64))));
        return Arrays.copyOfRange(bArr4, 0, this.sessionKeyLength);
    }

    public byte[][] kemEncrypt(byte[] bArr, byte[] bArr2) {
        String str;
        if (bArr.length == this.KyberIndCpaPublicKeyBytes) {
            PolyVec polyVec = new PolyVec(this);
            if (Arrays.areEqual(this.indCpa.packPublicKey(polyVec, this.indCpa.unpackPublicKey(polyVec, bArr)), bArr)) {
                return kemEncryptInternal(bArr, bArr2);
            }
            str = "Input validation: Modulus check failed for ml-kem encapsulation";
        } else {
            str = "Input validation Error: Type check failed for ml-kem encapsulation";
        }
        a.f(str);
        return null;
    }

    public byte[][] kemEncryptInternal(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[64];
        System.arraycopy(bArr2, 0, bArr3, 0, 32);
        this.symmetric.hash_h(bArr3, bArr, 32);
        this.symmetric.hash_g(bArr4, bArr3);
        byte[] bArrEncrypt = this.indCpa.encrypt(bArr, Arrays.copyOfRange(bArr3, 0, 32), Arrays.copyOfRange(bArr4, 32, 64));
        int i11 = this.sessionKeyLength;
        byte[] bArr5 = new byte[i11];
        System.arraycopy(bArr4, 0, bArr5, 0, i11);
        return new byte[][]{bArr5, bArrEncrypt};
    }
}

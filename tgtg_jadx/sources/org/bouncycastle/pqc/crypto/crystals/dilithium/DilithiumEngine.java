package org.bouncycastle.pqc.crypto.crystals.dilithium;

import a40.d0;
import i4.a;
import java.security.SecureRandom;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric;
import org.bouncycastle.util.Arrays;
import r8.k;
import w2.l1;

/* JADX INFO: loaded from: classes3.dex */
class DilithiumEngine {
    public static final int CrhBytes = 64;
    public static final int DilithiumD = 13;
    public static final int DilithiumN = 256;
    public static final int DilithiumPolyT0PackedBytes = 416;
    public static final int DilithiumPolyT1PackedBytes = 320;
    public static final int DilithiumQ = 8380417;
    public static final int DilithiumQinv = 58728449;
    public static final int DilithiumRootOfUnity = 1753;
    public static final int RndBytes = 32;
    public static final int SeedBytes = 32;
    public static final int TrBytes = 64;
    private final int CryptoBytes;
    private final int CryptoPublicKeyBytes;
    private final int CryptoSecretKeyBytes;
    private final int DilithiumBeta;
    private final int DilithiumCTilde;
    private final int DilithiumEta;
    private final int DilithiumGamma1;
    private final int DilithiumGamma2;
    private final int DilithiumK;
    private final int DilithiumL;
    private final int DilithiumMode;
    private final int DilithiumOmega;
    private final int DilithiumPolyEtaPackedBytes;
    private final int DilithiumPolyVecHPackedBytes;
    private final int DilithiumPolyW1PackedBytes;
    private final int DilithiumPolyZPackedBytes;
    private final int DilithiumTau;
    private final int PolyUniformGamma1NBlocks;
    private final SecureRandom random;
    private final SHAKEDigest shake256Digest = new SHAKEDigest(256);
    private final Symmetric symmetric;

    public DilithiumEngine(int i11, SecureRandom secureRandom, boolean z11) {
        int i12;
        int i13;
        this.DilithiumMode = i11;
        if (i11 == 2) {
            this.DilithiumK = 4;
            this.DilithiumL = 4;
            this.DilithiumEta = 2;
            this.DilithiumTau = 39;
            this.DilithiumBeta = 78;
            this.DilithiumGamma1 = 131072;
            this.DilithiumGamma2 = 95232;
            this.DilithiumOmega = 80;
            this.DilithiumPolyZPackedBytes = 576;
            this.DilithiumPolyW1PackedBytes = BERTags.PRIVATE;
            this.DilithiumPolyEtaPackedBytes = 96;
            this.DilithiumCTilde = 32;
        } else if (i11 == 3) {
            this.DilithiumK = 6;
            this.DilithiumL = 5;
            this.DilithiumEta = 4;
            this.DilithiumTau = 49;
            this.DilithiumBeta = 196;
            this.DilithiumGamma1 = 524288;
            this.DilithiumGamma2 = 261888;
            this.DilithiumOmega = 55;
            this.DilithiumPolyZPackedBytes = 640;
            this.DilithiumPolyW1PackedBytes = 128;
            this.DilithiumPolyEtaPackedBytes = 128;
            this.DilithiumCTilde = 48;
        } else {
            if (i11 != 5) {
                a.f(k.h(i11, "The mode ", "is not supported by Crystals Dilithium!"));
                throw null;
            }
            this.DilithiumK = 8;
            this.DilithiumL = 7;
            this.DilithiumEta = 2;
            this.DilithiumTau = 60;
            this.DilithiumBeta = 120;
            this.DilithiumGamma1 = 524288;
            this.DilithiumGamma2 = 261888;
            this.DilithiumOmega = 75;
            this.DilithiumPolyZPackedBytes = 640;
            this.DilithiumPolyW1PackedBytes = 128;
            this.DilithiumPolyEtaPackedBytes = 96;
            this.DilithiumCTilde = 64;
        }
        this.symmetric = z11 ? new Symmetric.AesSymmetric() : new Symmetric.ShakeSymmetric();
        this.random = secureRandom;
        int i14 = this.DilithiumOmega;
        int i15 = this.DilithiumK;
        int i16 = i14 + i15;
        this.DilithiumPolyVecHPackedBytes = i16;
        this.CryptoPublicKeyBytes = (i15 * 320) + 32;
        int i17 = this.DilithiumL;
        int i18 = this.DilithiumPolyEtaPackedBytes;
        this.CryptoSecretKeyBytes = (i15 * 416) + (i18 * i15) + (i17 * i18) + 128;
        this.CryptoBytes = l1.a(i17, this.DilithiumPolyZPackedBytes, this.DilithiumCTilde, i16);
        int i19 = this.DilithiumGamma1;
        if (i19 == 131072) {
            i12 = this.symmetric.stream256BlockBytes;
            i13 = i12 + 575;
        } else {
            if (i19 != 524288) {
                d0.k("Wrong Dilithium Gamma1!");
                throw null;
            }
            i12 = this.symmetric.stream256BlockBytes;
            i13 = i12 + 639;
        }
        this.PolyUniformGamma1NBlocks = i13 / i12;
    }

    public Symmetric GetSymmetric() {
        return this.symmetric;
    }

    public byte[][] generateKeyPair() {
        byte[] bArr = new byte[32];
        this.random.nextBytes(bArr);
        return generateKeyPairInternal(bArr);
    }

    public byte[][] generateKeyPairInternal(byte[] bArr) {
        byte[] bArr2 = new byte[128];
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[64];
        byte[] bArr6 = new byte[32];
        PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
        PolyVecL polyVecL = new PolyVecL(this);
        PolyVecK polyVecK = new PolyVecK(this);
        PolyVecK polyVecK2 = new PolyVecK(this);
        PolyVecK polyVecK3 = new PolyVecK(this);
        this.shake256Digest.update(bArr, 0, 32);
        this.shake256Digest.update((byte) this.DilithiumK);
        this.shake256Digest.update((byte) this.DilithiumL);
        this.shake256Digest.doFinal(bArr2, 0, 128);
        System.arraycopy(bArr2, 0, bArr4, 0, 32);
        System.arraycopy(bArr2, 32, bArr5, 0, 64);
        System.arraycopy(bArr2, 96, bArr6, 0, 32);
        polyVecMatrix.expandMatrix(bArr4);
        polyVecL.uniformEta(bArr5, (short) 0);
        polyVecK.uniformEta(bArr5, (short) this.DilithiumL);
        PolyVecL polyVecL2 = new PolyVecL(this);
        polyVecL.copyPolyVecL(polyVecL2);
        polyVecL2.polyVecNtt();
        polyVecMatrix.pointwiseMontgomery(polyVecK2, polyVecL2);
        polyVecK2.reduce();
        polyVecK2.invNttToMont();
        polyVecK2.addPolyVecK(polyVecK);
        polyVecK2.conditionalAddQ();
        polyVecK2.power2Round(polyVecK3);
        byte[] bArrPackPublicKey = Packing.packPublicKey(polyVecK2, this);
        this.shake256Digest.update(bArr4, 0, 32);
        this.shake256Digest.update(bArrPackPublicKey, 0, bArrPackPublicKey.length);
        this.shake256Digest.doFinal(bArr3, 0, 64);
        byte[][] bArrPackSecretKey = Packing.packSecretKey(bArr4, bArr3, bArr6, polyVecK3, polyVecL, polyVecK, this);
        return new byte[][]{bArrPackSecretKey[0], bArrPackSecretKey[1], bArrPackSecretKey[2], bArrPackSecretKey[3], bArrPackSecretKey[4], bArrPackSecretKey[5], bArrPackPublicKey};
    }

    public int getCryptoBytes() {
        return this.CryptoBytes;
    }

    public int getCryptoPublicKeyBytes() {
        return this.CryptoPublicKeyBytes;
    }

    public int getCryptoSecretKeyBytes() {
        return this.CryptoSecretKeyBytes;
    }

    public int getDilithiumBeta() {
        return this.DilithiumBeta;
    }

    public int getDilithiumCTilde() {
        return this.DilithiumCTilde;
    }

    public int getDilithiumEta() {
        return this.DilithiumEta;
    }

    public int getDilithiumGamma1() {
        return this.DilithiumGamma1;
    }

    public int getDilithiumGamma2() {
        return this.DilithiumGamma2;
    }

    public int getDilithiumK() {
        return this.DilithiumK;
    }

    public int getDilithiumL() {
        return this.DilithiumL;
    }

    public int getDilithiumMode() {
        return this.DilithiumMode;
    }

    public int getDilithiumOmega() {
        return this.DilithiumOmega;
    }

    public int getDilithiumPolyEtaPackedBytes() {
        return this.DilithiumPolyEtaPackedBytes;
    }

    public int getDilithiumPolyVecHPackedBytes() {
        return this.DilithiumPolyVecHPackedBytes;
    }

    public int getDilithiumPolyW1PackedBytes() {
        return this.DilithiumPolyW1PackedBytes;
    }

    public int getDilithiumPolyZPackedBytes() {
        return this.DilithiumPolyZPackedBytes;
    }

    public int getDilithiumTau() {
        return this.DilithiumTau;
    }

    public int getPolyUniformGamma1NBlocks() {
        return this.PolyUniformGamma1NBlocks;
    }

    public SHAKEDigest getShake256Digest() {
        return this.shake256Digest;
    }

    public byte[] sign(byte[] bArr, int i11, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        return signSignature(bArr, i11, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7);
    }

    public boolean signOpen(byte[] bArr, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4) {
        return signVerify(bArr2, i11, bArr, bArr.length, bArr3, bArr4);
    }

    public byte[] signSignature(byte[] bArr, int i11, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        byte[] bArr8 = new byte[32];
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr8);
        }
        return signSignatureInternal(bArr, i11, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8);
    }

    public byte[] signSignatureInternal(byte[] bArr, int i11, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8) {
        PolyVecK polyVecK;
        byte[] bArr9 = new byte[this.CryptoBytes + i11];
        byte[] bArr10 = new byte[64];
        byte[] bArr11 = new byte[64];
        PolyVecL polyVecL = new PolyVecL(this);
        PolyVecL polyVecL2 = new PolyVecL(this);
        PolyVecL polyVecL3 = new PolyVecL(this);
        PolyVecK polyVecK2 = new PolyVecK(this);
        PolyVecK polyVecK3 = new PolyVecK(this);
        PolyVecK polyVecK4 = new PolyVecK(this);
        PolyVecK polyVecK5 = new PolyVecK(this);
        PolyVecK polyVecK6 = new PolyVecK(this);
        Poly poly = new Poly(this);
        PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
        PolyVecK polyVecK7 = polyVecK6;
        Poly poly2 = poly;
        Packing.unpackSecretKey(polyVecK2, polyVecL, polyVecK3, bArr5, bArr6, bArr7, this);
        this.shake256Digest.update(bArr4, 0, 64);
        this.shake256Digest.update(bArr, 0, i11);
        this.shake256Digest.doFinal(bArr10, 0, 64);
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, 128);
        System.arraycopy(bArr8, 0, bArrCopyOf, 32, 32);
        System.arraycopy(bArr10, 0, bArrCopyOf, 64, 64);
        this.shake256Digest.update(bArrCopyOf, 0, 128);
        this.shake256Digest.doFinal(bArr11, 0, 64);
        PolyVecMatrix polyVecMatrix2 = polyVecMatrix;
        polyVecMatrix2.expandMatrix(bArr2);
        polyVecL.polyVecNtt();
        polyVecK3.polyVecNtt();
        polyVecK2.polyVecNtt();
        int i12 = 0;
        short s7 = 0;
        while (i12 < 1000) {
            int i13 = i12 + 1;
            short s8 = (short) (s7 + 1);
            polyVecL2.uniformGamma1(bArr11, s7);
            polyVecL2.copyPolyVecL(polyVecL3);
            polyVecL3.polyVecNtt();
            polyVecMatrix2.pointwiseMontgomery(polyVecK4, polyVecL3);
            polyVecK4.reduce();
            polyVecK4.invNttToMont();
            polyVecK4.conditionalAddQ();
            polyVecK4.decompose(polyVecK5);
            System.arraycopy(polyVecK4.packW1(), 0, bArr9, 0, this.DilithiumK * this.DilithiumPolyW1PackedBytes);
            this.shake256Digest.update(bArr10, 0, 64);
            PolyVecMatrix polyVecMatrix3 = polyVecMatrix2;
            this.shake256Digest.update(bArr9, 0, this.DilithiumK * this.DilithiumPolyW1PackedBytes);
            this.shake256Digest.doFinal(bArr9, 0, this.DilithiumCTilde);
            Poly poly3 = poly2;
            poly3.challenge(Arrays.copyOfRange(bArr9, 0, this.DilithiumCTilde));
            poly3.polyNtt();
            polyVecL3.pointwisePolyMontgomery(poly3, polyVecL);
            polyVecL3.invNttToMont();
            polyVecL3.addPolyVecL(polyVecL2);
            polyVecL3.reduce();
            if (polyVecL3.checkNorm(this.DilithiumGamma1 - this.DilithiumBeta)) {
                polyVecK = polyVecK7;
            } else {
                polyVecK = polyVecK7;
                polyVecK.pointwisePolyMontgomery(poly3, polyVecK3);
                polyVecK.invNttToMont();
                polyVecK5.subtract(polyVecK);
                polyVecK5.reduce();
                if (polyVecK5.checkNorm(this.DilithiumGamma2 - this.DilithiumBeta)) {
                    continue;
                } else {
                    polyVecK.pointwisePolyMontgomery(poly3, polyVecK2);
                    polyVecK.invNttToMont();
                    polyVecK.reduce();
                    if (polyVecK.checkNorm(this.DilithiumGamma2)) {
                        continue;
                    } else {
                        polyVecK5.addPolyVecK(polyVecK);
                        polyVecK5.conditionalAddQ();
                        if (polyVecK.makeHint(polyVecK5, polyVecK4) <= this.DilithiumOmega) {
                            return Packing.packSignature(bArr9, polyVecL3, polyVecK, this);
                        }
                    }
                }
            }
            i12 = i13;
            polyVecK7 = polyVecK;
            poly2 = poly3;
            s7 = s8;
            polyVecMatrix2 = polyVecMatrix3;
        }
        return null;
    }

    public boolean signVerify(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte[] bArr4) {
        return signVerifyInternal(bArr, i11, bArr2, i12, bArr3, bArr4);
    }

    public boolean signVerifyInternal(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = new byte[64];
        byte[] bArr6 = new byte[this.DilithiumCTilde];
        Poly poly = new Poly(this);
        PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
        PolyVecL polyVecL = new PolyVecL(this);
        PolyVecK polyVecK = new PolyVecK(this);
        PolyVecK polyVecK2 = new PolyVecK(this);
        PolyVecK polyVecK3 = new PolyVecK(this);
        if (i11 != this.CryptoBytes) {
            return false;
        }
        PolyVecK polyVecKUnpackPublicKey = Packing.unpackPublicKey(polyVecK, bArr4, this);
        if (!Packing.unpackSignature(polyVecL, polyVecK3, bArr, this)) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, this.DilithiumCTilde);
        if (polyVecL.checkNorm(getDilithiumGamma1() - getDilithiumBeta())) {
            return false;
        }
        this.shake256Digest.update(bArr3, 0, bArr3.length);
        this.shake256Digest.update(bArr4, 0, bArr4.length);
        this.shake256Digest.doFinal(bArr5, 0, 64);
        this.shake256Digest.update(bArr5, 0, 64);
        this.shake256Digest.update(bArr2, 0, i12);
        this.shake256Digest.doFinal(bArr5, 0);
        poly.challenge(Arrays.copyOfRange(bArrCopyOfRange, 0, this.DilithiumCTilde));
        polyVecMatrix.expandMatrix(bArr3);
        polyVecL.polyVecNtt();
        polyVecMatrix.pointwiseMontgomery(polyVecK2, polyVecL);
        poly.polyNtt();
        polyVecKUnpackPublicKey.shiftLeft();
        polyVecKUnpackPublicKey.polyVecNtt();
        polyVecKUnpackPublicKey.pointwisePolyMontgomery(poly, polyVecKUnpackPublicKey);
        polyVecK2.subtract(polyVecKUnpackPublicKey);
        polyVecK2.reduce();
        polyVecK2.invNttToMont();
        polyVecK2.conditionalAddQ();
        polyVecK2.useHint(polyVecK2, polyVecK3);
        byte[] bArrPackW1 = polyVecK2.packW1();
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr5, 0, 64);
        sHAKEDigest.update(bArrPackW1, 0, this.DilithiumK * this.DilithiumPolyW1PackedBytes);
        sHAKEDigest.doFinal(bArr6, 0, this.DilithiumCTilde);
        return Arrays.constantTimeAreEqual(bArrCopyOfRange, bArr6);
    }
}

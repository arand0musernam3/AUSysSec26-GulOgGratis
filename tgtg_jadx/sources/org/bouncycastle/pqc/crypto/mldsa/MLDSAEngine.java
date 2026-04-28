package org.bouncycastle.pqc.crypto.mldsa;

import a40.d0;
import i4.a;
import java.security.SecureRandom;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.mldsa.Symmetric;
import org.bouncycastle.util.Arrays;
import r8.k;
import w2.l1;

/* JADX INFO: loaded from: classes3.dex */
class MLDSAEngine {
    public static final int CrhBytes = 64;
    public static final int DilithiumD = 13;
    public static final int DilithiumN = 256;
    public static final int DilithiumPolyT0PackedBytes = 416;
    public static final int DilithiumPolyT1PackedBytes = 320;
    public static final int DilithiumQ = 8380417;
    public static final int DilithiumQinv = 58728449;
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
    final SHAKEDigest shake256Digest = new SHAKEDigest(256);
    private final Symmetric symmetric;

    public MLDSAEngine(int i11, SecureRandom secureRandom) {
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
        Symmetric.ShakeSymmetric shakeSymmetric = new Symmetric.ShakeSymmetric();
        this.symmetric = shakeSymmetric;
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
            i12 = shakeSymmetric.stream256BlockBytes;
            i13 = i12 + 575;
        } else {
            if (i19 != 524288) {
                d0.k("Wrong Dilithium Gamma1!");
                throw null;
            }
            i12 = shakeSymmetric.stream256BlockBytes;
            i13 = i12 + 639;
        }
        this.PolyUniformGamma1NBlocks = i13 / i12;
    }

    private boolean doVerifyInternal(byte[] bArr, byte[] bArr2, int i11, SHAKEDigest sHAKEDigest, byte[] bArr3, byte[] bArr4) {
        if (i11 != this.CryptoBytes) {
            return false;
        }
        PolyVecK polyVecK = new PolyVecK(this);
        PolyVecL polyVecL = new PolyVecL(this);
        if (!Packing.unpackSignature(polyVecL, polyVecK, bArr2, this) || polyVecL.checkNorm(getDilithiumGamma1() - getDilithiumBeta())) {
            return false;
        }
        Poly poly = new Poly(this);
        PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
        PolyVecK polyVecK2 = new PolyVecK(this);
        PolyVecK polyVecK3 = new PolyVecK(this);
        PolyVecK polyVecKUnpackPublicKey = Packing.unpackPublicKey(polyVecK2, bArr4, this);
        poly.challenge(bArr2, 0, this.DilithiumCTilde);
        polyVecMatrix.expandMatrix(bArr3);
        polyVecL.polyVecNtt();
        polyVecMatrix.pointwiseMontgomery(polyVecK3, polyVecL);
        poly.polyNtt();
        polyVecKUnpackPublicKey.shiftLeft();
        polyVecKUnpackPublicKey.polyVecNtt();
        polyVecKUnpackPublicKey.pointwisePolyMontgomery(poly, polyVecKUnpackPublicKey);
        polyVecK3.subtract(polyVecKUnpackPublicKey);
        polyVecK3.reduce();
        polyVecK3.invNttToMont();
        polyVecK3.conditionalAddQ();
        polyVecK3.useHint(polyVecK3, polyVecK);
        polyVecK3.packW1(this, bArr, 64);
        sHAKEDigest.update(bArr, 0, (this.DilithiumK * this.DilithiumPolyW1PackedBytes) + 64);
        sHAKEDigest.doFinal(bArr, 0, this.DilithiumCTilde);
        return Arrays.constantTimeAreEqual(this.DilithiumCTilde, bArr2, 0, bArr, 0);
    }

    public Symmetric GetSymmetric() {
        return this.symmetric;
    }

    public void absorbCtx(boolean z11, byte[] bArr) {
        if (bArr != null) {
            this.shake256Digest.update(z11 ? (byte) 1 : (byte) 0);
            this.shake256Digest.update((byte) bArr.length);
            this.shake256Digest.update(bArr, 0, bArr.length);
        }
    }

    public byte[] deriveT1(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
        PolyVecL polyVecL = new PolyVecL(this);
        PolyVecK polyVecK = new PolyVecK(this);
        PolyVecK polyVecK2 = new PolyVecK(this);
        PolyVecK polyVecK3 = new PolyVecK(this);
        Packing.unpackSecretKey(polyVecK3, polyVecL, polyVecK, bArr6, bArr4, bArr5, this);
        polyVecMatrix.expandMatrix(bArr);
        PolyVecL polyVecL2 = new PolyVecL(this);
        polyVecL.copyTo(polyVecL2);
        polyVecL2.polyVecNtt();
        polyVecMatrix.pointwiseMontgomery(polyVecK2, polyVecL2);
        polyVecK2.reduce();
        polyVecK2.invNttToMont();
        polyVecK2.addPolyVecK(polyVecK);
        polyVecK2.conditionalAddQ();
        polyVecK2.power2Round(polyVecK3);
        return Packing.packPublicKey(polyVecK2, this);
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
        polyVecL.copyTo(polyVecL2);
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
        return new byte[][]{bArrPackSecretKey[0], bArrPackSecretKey[1], bArrPackSecretKey[2], bArrPackSecretKey[3], bArrPackSecretKey[4], bArrPackSecretKey[5], bArrPackPublicKey, bArr};
    }

    public byte[] generateMu(SHAKEDigest sHAKEDigest) {
        byte[] bArr = new byte[64];
        sHAKEDigest.doFinal(bArr, 0, 64);
        return bArr;
    }

    public byte[] generateSignature(byte[] bArr, SHAKEDigest sHAKEDigest, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        PolyVecK polyVecK;
        PolyVecL polyVecL;
        byte[] bArr8 = new byte[this.CryptoBytes];
        byte[] bArr9 = new byte[64];
        PolyVecL polyVecL2 = new PolyVecL(this);
        PolyVecL polyVecL3 = new PolyVecL(this);
        PolyVecL polyVecL4 = new PolyVecL(this);
        PolyVecK polyVecK2 = new PolyVecK(this);
        PolyVecK polyVecK3 = new PolyVecK(this);
        PolyVecK polyVecK4 = new PolyVecK(this);
        PolyVecK polyVecK5 = new PolyVecK(this);
        PolyVecK polyVecK6 = new PolyVecK(this);
        Poly poly = new Poly(this);
        PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
        PolyVecK polyVecK7 = polyVecK6;
        Poly poly2 = poly;
        Packing.unpackSecretKey(polyVecK2, polyVecL2, polyVecK3, bArr4, bArr5, bArr6, this);
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, 128);
        int i11 = 0;
        PolyVecK polyVecK8 = polyVecK2;
        System.arraycopy(bArr7, 0, bArrCopyOf, 32, 32);
        System.arraycopy(bArr, 0, bArrCopyOf, 64, 64);
        sHAKEDigest.update(bArrCopyOf, 0, 128);
        sHAKEDigest.doFinal(bArr9, 0, 64);
        polyVecMatrix.expandMatrix(bArr2);
        polyVecL2.polyVecNtt();
        polyVecK3.polyVecNtt();
        polyVecK8.polyVecNtt();
        int i12 = 0;
        short s7 = 0;
        while (i12 < 1000) {
            int i13 = i12 + 1;
            short s8 = (short) (s7 + 1);
            polyVecL3.uniformGamma1(bArr9, s7);
            polyVecL3.copyTo(polyVecL4);
            polyVecL4.polyVecNtt();
            polyVecMatrix.pointwiseMontgomery(polyVecK4, polyVecL4);
            polyVecK4.reduce();
            polyVecK4.invNttToMont();
            polyVecK4.conditionalAddQ();
            polyVecK4.decompose(polyVecK5);
            polyVecK4.packW1(this, bArr8, i11);
            sHAKEDigest.update(bArr, i11, 64);
            sHAKEDigest.update(bArr8, i11, this.DilithiumK * this.DilithiumPolyW1PackedBytes);
            sHAKEDigest.doFinal(bArr8, i11, this.DilithiumCTilde);
            Poly poly3 = poly2;
            poly3.challenge(bArr8, i11, this.DilithiumCTilde);
            poly3.polyNtt();
            polyVecL4.pointwisePolyMontgomery(poly3, polyVecL2);
            polyVecL4.invNttToMont();
            polyVecL4.addPolyVecL(polyVecL3);
            polyVecL4.reduce();
            if (polyVecL4.checkNorm(this.DilithiumGamma1 - this.DilithiumBeta)) {
                polyVecL = polyVecL2;
                polyVecK = polyVecK7;
            } else {
                polyVecK = polyVecK7;
                polyVecK.pointwisePolyMontgomery(poly3, polyVecK3);
                polyVecK.invNttToMont();
                polyVecK5.subtract(polyVecK);
                polyVecK5.reduce();
                polyVecL = polyVecL2;
                if (polyVecK5.checkNorm(this.DilithiumGamma2 - this.DilithiumBeta)) {
                    continue;
                } else {
                    PolyVecK polyVecK9 = polyVecK8;
                    polyVecK.pointwisePolyMontgomery(poly3, polyVecK9);
                    polyVecK.invNttToMont();
                    polyVecK.reduce();
                    if (polyVecK.checkNorm(this.DilithiumGamma2)) {
                        polyVecK8 = polyVecK9;
                    } else {
                        polyVecK5.addPolyVecK(polyVecK);
                        polyVecK5.conditionalAddQ();
                        polyVecK8 = polyVecK9;
                        if (polyVecK.makeHint(polyVecK5, polyVecK4) <= this.DilithiumOmega) {
                            Packing.packSignature(bArr8, polyVecL4, polyVecK, this);
                            return bArr8;
                        }
                    }
                }
            }
            polyVecL2 = polyVecL;
            polyVecK7 = polyVecK;
            poly2 = poly3;
            s7 = s8;
            i11 = 0;
            i12 = i13;
        }
        return null;
    }

    public int getCryptoPublicKeyBytes() {
        return this.CryptoPublicKeyBytes;
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

    public int getDilithiumOmega() {
        return this.DilithiumOmega;
    }

    public int getDilithiumPolyEtaPackedBytes() {
        return this.DilithiumPolyEtaPackedBytes;
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
        return new SHAKEDigest(this.shake256Digest);
    }

    public void initSign(byte[] bArr, boolean z11, byte[] bArr2) {
        this.shake256Digest.update(bArr, 0, 64);
        absorbCtx(z11, bArr2);
    }

    public void initVerify(byte[] bArr, byte[] bArr2, boolean z11, byte[] bArr3) {
        byte[] bArr4 = new byte[64];
        this.shake256Digest.update(bArr, 0, bArr.length);
        this.shake256Digest.update(bArr2, 0, bArr2.length);
        this.shake256Digest.doFinal(bArr4, 0, 64);
        this.shake256Digest.update(bArr4, 0, 64);
        absorbCtx(z11, bArr3);
    }

    public byte[] signInternal(byte[] bArr, int i11, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(this.shake256Digest);
        sHAKEDigest.update(bArr, 0, i11);
        return generateSignature(generateMu(sHAKEDigest), sHAKEDigest, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7);
    }

    public boolean verifyInternal(byte[] bArr, int i11, SHAKEDigest sHAKEDigest, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[Math.max((this.DilithiumK * this.DilithiumPolyW1PackedBytes) + 64, this.DilithiumCTilde)];
        sHAKEDigest.doFinal(bArr4, 0);
        return doVerifyInternal(bArr4, bArr, i11, sHAKEDigest, bArr2, bArr3);
    }

    public boolean verifyInternalMu(byte[] bArr) {
        byte[] bArr2 = new byte[64];
        this.shake256Digest.doFinal(bArr2, 0);
        return Arrays.constantTimeAreEqual(bArr2, bArr);
    }

    public boolean verifyInternalMuSignature(byte[] bArr, byte[] bArr2, int i11, SHAKEDigest sHAKEDigest, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = new byte[Math.max((this.DilithiumK * this.DilithiumPolyW1PackedBytes) + 64, this.DilithiumCTilde)];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        return doVerifyInternal(bArr5, bArr2, i11, sHAKEDigest, bArr3, bArr4);
    }
}

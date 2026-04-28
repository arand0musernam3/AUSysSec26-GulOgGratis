package org.bouncycastle.pqc.crypto.mldsa;

import a40.d0;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* JADX INFO: loaded from: classes3.dex */
class Poly {
    private static final int DilithiumN = 256;
    private int[] coeffs = new int[256];
    private final MLDSAEngine engine;
    private final int polyUniformNBlocks;
    private final Symmetric symmetric;

    public Poly(MLDSAEngine mLDSAEngine) {
        this.engine = mLDSAEngine;
        Symmetric symmetricGetSymmetric = mLDSAEngine.GetSymmetric();
        this.symmetric = symmetricGetSymmetric;
        int i11 = symmetricGetSymmetric.stream128BlockBytes;
        this.polyUniformNBlocks = (i11 + 767) / i11;
    }

    private static int rejectEta(Poly poly, int i11, int i12, byte[] bArr, int i13, int i14) {
        int i15 = 0;
        int i16 = 0;
        while (i15 < i12 && i16 < i13) {
            byte b8 = bArr[i16];
            int i17 = b8 & 15;
            i16++;
            int i18 = (b8 & 255) >> 4;
            if (i14 == 2) {
                if (i17 < 15) {
                    poly.setCoeffIndex(i11 + i15, 2 - (i17 - (((i17 * 205) >> 10) * 5)));
                    i15++;
                }
                if (i18 < 15 && i15 < i12) {
                    poly.setCoeffIndex(i11 + i15, 2 - (i18 - (((i18 * 205) >> 10) * 5)));
                    i15++;
                }
            } else if (i14 == 4) {
                if (i17 < 9) {
                    poly.setCoeffIndex(i11 + i15, 4 - i17);
                    i15++;
                }
                if (i18 < 9 && i15 < i12) {
                    poly.setCoeffIndex(i11 + i15, 4 - i18);
                    i15++;
                }
            }
        }
        return i15;
    }

    private static int rejectUniform(Poly poly, int i11, int i12, byte[] bArr, int i13) {
        int i14 = 0;
        int i15 = 0;
        while (i14 < i12 && i15 + 3 <= i13) {
            int i16 = i15 + 2;
            int i17 = ((bArr[i15 + 1] & 255) << 8) | (bArr[i15] & 255);
            i15 += 3;
            int i18 = (i17 | ((bArr[i16] & 255) << 16)) & 8388607;
            if (i18 < 8380417) {
                poly.setCoeffIndex(i11 + i14, i18);
                i14++;
            }
        }
        return i14;
    }

    private void unpackZ(byte[] bArr) {
        int dilithiumGamma1 = this.engine.getDilithiumGamma1();
        int i11 = 0;
        if (dilithiumGamma1 != 131072) {
            if (dilithiumGamma1 != 524288) {
                d0.k("Wrong Dilithiumn Gamma1!");
                return;
            }
            while (i11 < 128) {
                int i12 = i11 * 2;
                int i13 = i11 * 5;
                int i14 = i13 + 2;
                setCoeffIndex(i12, ((bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i14] & 255) << 16)) & 1048575);
                int i15 = i12 + 1;
                setCoeffIndex(i15, (((bArr[i13 + 4] & 255) << 12) | ((bArr[i14] & 255) >> 4) | ((bArr[i13 + 3] & 255) << 4)) & 1048575);
                setCoeffIndex(i12, dilithiumGamma1 - getCoeffIndex(i12));
                setCoeffIndex(i15, dilithiumGamma1 - getCoeffIndex(i15));
                i11++;
            }
            return;
        }
        while (i11 < 64) {
            int i16 = i11 * 4;
            int i17 = i11 * 9;
            int i18 = i17 + 2;
            setCoeffIndex(i16, ((bArr[i17] & 255) | ((bArr[i17 + 1] & 255) << 8) | ((bArr[i18] & 255) << 16)) & 262143);
            int i19 = i16 + 1;
            int i21 = i17 + 4;
            setCoeffIndex(i19, (((bArr[i18] & 255) >> 2) | ((bArr[i17 + 3] & 255) << 6) | ((bArr[i21] & 255) << 14)) & 262143);
            int i22 = i16 + 2;
            int i23 = i17 + 6;
            setCoeffIndex(i22, (((bArr[i21] & 255) >> 4) | ((bArr[i17 + 5] & 255) << 4) | ((bArr[i23] & 255) << 12)) & 262143);
            int i24 = i16 + 3;
            setCoeffIndex(i24, (((bArr[i17 + 8] & 255) << 10) | ((bArr[i23] & 255) >> 6) | ((bArr[i17 + 7] & 255) << 2)) & 262143);
            setCoeffIndex(i16, dilithiumGamma1 - getCoeffIndex(i16));
            setCoeffIndex(i19, dilithiumGamma1 - getCoeffIndex(i19));
            setCoeffIndex(i22, dilithiumGamma1 - getCoeffIndex(i22));
            setCoeffIndex(i24, dilithiumGamma1 - getCoeffIndex(i24));
            i11++;
        }
    }

    public void addPoly(Poly poly) {
        for (int i11 = 0; i11 < 256; i11++) {
            setCoeffIndex(i11, getCoeffIndex(i11) + poly.getCoeffIndex(i11));
        }
    }

    public void challenge(byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        byte[] bArr2 = new byte[this.symmetric.stream256BlockBytes];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr, i11, i12);
        sHAKEDigest.doOutput(bArr2, 0, this.symmetric.stream256BlockBytes);
        long j9 = 0;
        int i16 = 0;
        while (true) {
            i13 = 8;
            if (i16 >= 8) {
                break;
            }
            j9 |= ((long) (bArr2[i16] & 255)) << (i16 * 8);
            i16++;
        }
        for (int i17 = 0; i17 < 256; i17++) {
            setCoeffIndex(i17, 0);
        }
        int dilithiumTau = 256 - this.engine.getDilithiumTau();
        while (dilithiumTau < 256) {
            while (true) {
                int i18 = this.symmetric.stream256BlockBytes;
                if (i13 >= i18) {
                    sHAKEDigest.doOutput(bArr2, 0, i18);
                    i13 = 0;
                }
                i14 = i13 + 1;
                i15 = bArr2[i13] & 255;
                if (i15 <= dilithiumTau) {
                    break;
                } else {
                    i13 = i14;
                }
            }
            setCoeffIndex(dilithiumTau, getCoeffIndex(i15));
            setCoeffIndex(i15, (int) (1 - ((j9 & 1) * 2)));
            j9 >>= 1;
            dilithiumTau++;
            i13 = i14;
        }
    }

    public boolean checkNorm(int i11) {
        if (i11 > 1047552) {
            return true;
        }
        for (int i12 = 0; i12 < 256; i12++) {
            if (getCoeffIndex(i12) - ((getCoeffIndex(i12) >> 31) & (getCoeffIndex(i12) * 2)) >= i11) {
                return true;
            }
        }
        return false;
    }

    public void conditionalAddQ() {
        for (int i11 = 0; i11 < 256; i11++) {
            setCoeffIndex(i11, Reduce.conditionalAddQ(getCoeffIndex(i11)));
        }
    }

    public void copyTo(Poly poly) {
        System.arraycopy(this.coeffs, 0, poly.coeffs, 0, 256);
    }

    public void decompose(Poly poly) {
        int dilithiumGamma2 = this.engine.getDilithiumGamma2();
        for (int i11 = 0; i11 < 256; i11++) {
            int[] iArrDecompose = Rounding.decompose(getCoeffIndex(i11), dilithiumGamma2);
            setCoeffIndex(i11, iArrDecompose[1]);
            poly.setCoeffIndex(i11, iArrDecompose[0]);
        }
    }

    public int getCoeffIndex(int i11) {
        return this.coeffs[i11];
    }

    public int[] getCoeffs() {
        return this.coeffs;
    }

    public void invNttToMont() {
        setCoeffs(Ntt.invNttToMont(getCoeffs()));
    }

    public void packW1(byte[] bArr, int i11) {
        int i12 = 0;
        if (this.engine.getDilithiumGamma2() != 95232) {
            if (this.engine.getDilithiumGamma2() == 261888) {
                while (i12 < 128) {
                    int i13 = i12 * 2;
                    bArr[i11 + i12] = (byte) ((getCoeffIndex(i13 + 1) << 4) | getCoeffIndex(i13));
                    i12++;
                }
                return;
            }
            return;
        }
        while (i12 < 64) {
            int i14 = (i12 * 3) + i11;
            int i15 = i12 * 4;
            int i16 = i15 + 1;
            bArr[i14] = (byte) (((byte) getCoeffIndex(i15)) | (getCoeffIndex(i16) << 6));
            int i17 = i15 + 2;
            bArr[i14 + 1] = (byte) (((byte) (getCoeffIndex(i16) >> 2)) | (getCoeffIndex(i17) << 4));
            bArr[i14 + 2] = (byte) ((getCoeffIndex(i15 + 3) << 2) | ((byte) (getCoeffIndex(i17) >> 4)));
            i12++;
        }
    }

    public void pointwiseAccountMontgomery(PolyVecL polyVecL, PolyVecL polyVecL2) {
        Poly poly = new Poly(this.engine);
        pointwiseMontgomery(polyVecL.getVectorIndex(0), polyVecL2.getVectorIndex(0));
        for (int i11 = 1; i11 < this.engine.getDilithiumL(); i11++) {
            poly.pointwiseMontgomery(polyVecL.getVectorIndex(i11), polyVecL2.getVectorIndex(i11));
            addPoly(poly);
        }
    }

    public void pointwiseMontgomery(Poly poly, Poly poly2) {
        for (int i11 = 0; i11 < 256; i11++) {
            setCoeffIndex(i11, Reduce.montgomeryReduce(((long) poly.getCoeffIndex(i11)) * ((long) poly2.getCoeffIndex(i11))));
        }
    }

    public byte[] polyEtaPack(byte[] bArr, int i11) {
        byte[] bArr2 = new byte[8];
        if (this.engine.getDilithiumEta() == 2) {
            for (int i12 = 0; i12 < 32; i12++) {
                int i13 = i12 * 8;
                bArr2[0] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i13));
                bArr2[1] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i13 + 1));
                bArr2[2] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i13 + 2));
                bArr2[3] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i13 + 3));
                bArr2[4] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i13 + 4));
                bArr2[5] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i13 + 5));
                bArr2[6] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i13 + 6));
                bArr2[7] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i13 + 7));
                int i14 = (i12 * 3) + i11;
                bArr[i14] = (byte) (bArr2[0] | (bArr2[1] << 3) | (bArr2[2] << 6));
                bArr[i14 + 1] = (byte) ((bArr2[3] << 1) | (bArr2[2] >> 2) | (bArr2[4] << 4) | (bArr2[5] << 7));
                bArr[i14 + 2] = (byte) ((bArr2[5] >> 1) | (bArr2[6] << 2) | (bArr2[7] << 5));
            }
        } else {
            if (this.engine.getDilithiumEta() != 4) {
                d0.k("Eta needs to be 2 or 4!");
                return null;
            }
            for (int i15 = 0; i15 < 128; i15++) {
                int i16 = i15 * 2;
                bArr2[0] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i16));
                byte dilithiumEta = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i16 + 1));
                bArr2[1] = dilithiumEta;
                bArr[i11 + i15] = (byte) ((dilithiumEta << 4) | bArr2[0]);
            }
        }
        return bArr;
    }

    public void polyEtaUnpack(byte[] bArr, int i11) {
        int dilithiumEta = this.engine.getDilithiumEta();
        int i12 = 0;
        if (this.engine.getDilithiumEta() != 2) {
            if (this.engine.getDilithiumEta() == 4) {
                while (i12 < 128) {
                    int i13 = i12 * 2;
                    int i14 = i11 + i12;
                    setCoeffIndex(i13, bArr[i14] & 15);
                    int i15 = i13 + 1;
                    setCoeffIndex(i15, (bArr[i14] & 255) >> 4);
                    setCoeffIndex(i13, dilithiumEta - getCoeffIndex(i13));
                    setCoeffIndex(i15, dilithiumEta - getCoeffIndex(i15));
                    i12++;
                }
                return;
            }
            return;
        }
        while (i12 < 32) {
            int i16 = (i12 * 3) + i11;
            int i17 = i12 * 8;
            setCoeffIndex(i17, bArr[i16] & 7);
            int i18 = i17 + 1;
            setCoeffIndex(i18, ((bArr[i16] & 255) >> 3) & 7);
            int i19 = i17 + 2;
            int i21 = i16 + 1;
            setCoeffIndex(i19, ((bArr[i16] & 255) >> 6) | (((bArr[i21] & 255) << 2) & 7));
            int i22 = i17 + 3;
            setCoeffIndex(i22, ((bArr[i21] & 255) >> 1) & 7);
            int i23 = i17 + 4;
            setCoeffIndex(i23, ((bArr[i21] & 255) >> 4) & 7);
            int i24 = i17 + 5;
            int i25 = i16 + 2;
            setCoeffIndex(i24, ((bArr[i21] & 255) >> 7) | (((bArr[i25] & 255) << 1) & 7));
            int i26 = i17 + 6;
            setCoeffIndex(i26, ((bArr[i25] & 255) >> 2) & 7);
            int i27 = i17 + 7;
            setCoeffIndex(i27, ((bArr[i25] & 255) >> 5) & 7);
            setCoeffIndex(i17, dilithiumEta - getCoeffIndex(i17));
            setCoeffIndex(i18, dilithiumEta - getCoeffIndex(i18));
            setCoeffIndex(i19, dilithiumEta - getCoeffIndex(i19));
            setCoeffIndex(i22, dilithiumEta - getCoeffIndex(i22));
            setCoeffIndex(i23, dilithiumEta - getCoeffIndex(i23));
            setCoeffIndex(i24, dilithiumEta - getCoeffIndex(i24));
            setCoeffIndex(i26, dilithiumEta - getCoeffIndex(i26));
            setCoeffIndex(i27, dilithiumEta - getCoeffIndex(i27));
            i12++;
        }
    }

    public int polyMakeHint(Poly poly, Poly poly2) {
        int coeffIndex = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            setCoeffIndex(i11, Rounding.makeHint(poly.getCoeffIndex(i11), poly2.getCoeffIndex(i11), this.engine));
            coeffIndex += getCoeffIndex(i11);
        }
        return coeffIndex;
    }

    public void polyNtt() {
        setCoeffs(Ntt.ntt(this.coeffs));
    }

    public void polyUseHint(Poly poly, Poly poly2) {
        for (int i11 = 0; i11 < 256; i11++) {
            setCoeffIndex(i11, Rounding.useHint(poly.getCoeffIndex(i11), poly2.getCoeffIndex(i11), this.engine.getDilithiumGamma2()));
        }
    }

    public byte[] polyt0Pack(byte[] bArr, int i11) {
        for (int i12 = 0; i12 < 32; i12++) {
            int i13 = i12 * 8;
            int[] iArr = {4096 - getCoeffIndex(i13), 4096 - getCoeffIndex(i13 + 1), 4096 - getCoeffIndex(i13 + 2), 4096 - getCoeffIndex(i13 + 3), 4096 - getCoeffIndex(i13 + 4), 4096 - getCoeffIndex(i13 + 5), 4096 - getCoeffIndex(i13 + 6), 4096 - getCoeffIndex(i13 + 7)};
            int i14 = (i12 * 13) + i11;
            int i15 = iArr[0];
            bArr[i14] = (byte) i15;
            int i16 = i14 + 1;
            byte b8 = (byte) (i15 >> 8);
            bArr[i16] = b8;
            int i17 = iArr[1];
            bArr[i16] = (byte) (b8 | ((byte) (i17 << 5)));
            bArr[i14 + 2] = (byte) (i17 >> 3);
            int i18 = i14 + 3;
            byte b11 = (byte) (i17 >> 11);
            bArr[i18] = b11;
            int i19 = iArr[2];
            bArr[i18] = (byte) (b11 | ((byte) (i19 << 2)));
            int i21 = i14 + 4;
            byte b12 = (byte) (i19 >> 6);
            bArr[i21] = b12;
            int i22 = iArr[3];
            bArr[i21] = (byte) (b12 | ((byte) (i22 << 7)));
            bArr[i14 + 5] = (byte) (i22 >> 1);
            int i23 = i14 + 6;
            byte b13 = (byte) (i22 >> 9);
            bArr[i23] = b13;
            int i24 = iArr[4];
            bArr[i23] = (byte) (b13 | ((byte) (i24 << 4)));
            bArr[i14 + 7] = (byte) (i24 >> 4);
            int i25 = i14 + 8;
            byte b14 = (byte) (i24 >> 12);
            bArr[i25] = b14;
            int i26 = iArr[5];
            bArr[i25] = (byte) (b14 | ((byte) (i26 << 1)));
            int i27 = i14 + 9;
            byte b15 = (byte) (i26 >> 7);
            bArr[i27] = b15;
            int i28 = iArr[6];
            bArr[i27] = (byte) (b15 | ((byte) (i28 << 6)));
            bArr[i14 + 10] = (byte) (i28 >> 2);
            int i29 = i14 + 11;
            byte b16 = (byte) (i28 >> 10);
            bArr[i29] = b16;
            int i31 = iArr[7];
            bArr[i29] = (byte) (((byte) (i31 << 3)) | b16);
            bArr[i14 + 12] = (byte) (i31 >> 5);
        }
        return bArr;
    }

    public void polyt0Unpack(byte[] bArr, int i11) {
        for (int i12 = 0; i12 < 32; i12++) {
            int i13 = (i12 * 13) + i11;
            int i14 = i12 * 8;
            int i15 = i13 + 1;
            setCoeffIndex(i14, ((bArr[i13] & 255) | ((bArr[i15] & 255) << 8)) & 8191);
            int i16 = i14 + 1;
            int i17 = i13 + 3;
            setCoeffIndex(i16, (((bArr[i15] & 255) >> 5) | ((bArr[i13 + 2] & 255) << 3) | ((bArr[i17] & 255) << 11)) & 8191);
            int i18 = i14 + 2;
            int i19 = i13 + 4;
            setCoeffIndex(i18, (((bArr[i17] & 255) >> 2) | ((bArr[i19] & 255) << 6)) & 8191);
            int i21 = i14 + 3;
            int i22 = i13 + 6;
            setCoeffIndex(i21, (((bArr[i19] & 255) >> 7) | ((bArr[i13 + 5] & 255) << 1) | ((bArr[i22] & 255) << 9)) & 8191);
            int i23 = i14 + 4;
            int i24 = i13 + 8;
            setCoeffIndex(i23, (((bArr[i22] & 255) >> 4) | ((bArr[i13 + 7] & 255) << 4) | ((bArr[i24] & 255) << 12)) & 8191);
            int i25 = i14 + 5;
            int i26 = i13 + 9;
            setCoeffIndex(i25, (((bArr[i24] & 255) >> 1) | ((bArr[i26] & 255) << 7)) & 8191);
            int i27 = i14 + 6;
            int i28 = i13 + 11;
            setCoeffIndex(i27, (((bArr[i26] & 255) >> 6) | ((bArr[i13 + 10] & 255) << 2) | ((bArr[i28] & 255) << 10)) & 8191);
            int i29 = i14 + 7;
            setCoeffIndex(i29, (((bArr[i13 + 12] & 255) << 5) | ((bArr[i28] & 255) >> 3)) & 8191);
            setCoeffIndex(i14, 4096 - getCoeffIndex(i14));
            setCoeffIndex(i16, 4096 - getCoeffIndex(i16));
            setCoeffIndex(i18, 4096 - getCoeffIndex(i18));
            setCoeffIndex(i21, 4096 - getCoeffIndex(i21));
            setCoeffIndex(i23, 4096 - getCoeffIndex(i23));
            setCoeffIndex(i25, 4096 - getCoeffIndex(i25));
            setCoeffIndex(i27, 4096 - getCoeffIndex(i27));
            setCoeffIndex(i29, 4096 - getCoeffIndex(i29));
        }
    }

    public byte[] polyt1Pack() {
        byte[] bArr = new byte[320];
        for (int i11 = 0; i11 < 64; i11++) {
            int i12 = i11 * 5;
            int[] iArr = this.coeffs;
            int i13 = i11 * 4;
            int i14 = iArr[i13];
            bArr[i12] = (byte) i14;
            int i15 = iArr[i13 + 1];
            bArr[i12 + 1] = (byte) ((i14 >> 8) | (i15 << 2));
            int i16 = i15 >> 6;
            int i17 = iArr[i13 + 2];
            bArr[i12 + 2] = (byte) (i16 | (i17 << 4));
            int i18 = iArr[i13 + 3];
            bArr[i12 + 3] = (byte) ((i18 << 6) | (i17 >> 4));
            bArr[i12 + 4] = (byte) (i18 >> 2);
        }
        return bArr;
    }

    public void polyt1Unpack(byte[] bArr) {
        for (int i11 = 0; i11 < 64; i11++) {
            int i12 = i11 * 4;
            int i13 = i11 * 5;
            int i14 = i13 + 1;
            setCoeffIndex(i12, ((bArr[i13] & 255) | ((bArr[i14] & 255) << 8)) & 1023);
            int i15 = i13 + 2;
            setCoeffIndex(i12 + 1, (((bArr[i14] & 255) >> 2) | ((bArr[i15] & 255) << 6)) & 1023);
            int i16 = (bArr[i15] & 255) >> 4;
            int i17 = i13 + 3;
            setCoeffIndex(i12 + 2, (i16 | ((bArr[i17] & 255) << 4)) & 1023);
            setCoeffIndex(i12 + 3, (((bArr[i13 + 4] & 255) << 2) | ((bArr[i17] & 255) >> 6)) & 1023);
        }
    }

    public void power2Round(Poly poly) {
        for (int i11 = 0; i11 < 256; i11++) {
            int[] iArrPower2Round = Rounding.power2Round(getCoeffIndex(i11));
            setCoeffIndex(i11, iArrPower2Round[0]);
            poly.setCoeffIndex(i11, iArrPower2Round[1]);
        }
    }

    public void reduce() {
        for (int i11 = 0; i11 < 256; i11++) {
            setCoeffIndex(i11, Reduce.reduce32(getCoeffIndex(i11)));
        }
    }

    public void setCoeffIndex(int i11, int i12) {
        this.coeffs[i11] = i12;
    }

    public void setCoeffs(int[] iArr) {
        this.coeffs = iArr;
    }

    public void shiftLeft() {
        for (int i11 = 0; i11 < 256; i11++) {
            setCoeffIndex(i11, getCoeffIndex(i11) << 13);
        }
    }

    public void subtract(Poly poly) {
        for (int i11 = 0; i11 < 256; i11++) {
            setCoeffIndex(i11, getCoeffIndex(i11) - poly.getCoeffIndex(i11));
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        int i11 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i11 >= iArr.length) {
                stringBuffer.append("]");
                return stringBuffer.toString();
            }
            stringBuffer.append(iArr[i11]);
            if (i11 != this.coeffs.length - 1) {
                stringBuffer.append(", ");
            }
            i11++;
        }
    }

    public void uniformBlocks(byte[] bArr, short s7) {
        int i11 = this.polyUniformNBlocks;
        Symmetric symmetric = this.symmetric;
        int i12 = i11 * symmetric.stream128BlockBytes;
        byte[] bArr2 = new byte[i12 + 2];
        symmetric.stream128init(bArr, s7);
        this.symmetric.stream128squeezeBlocks(bArr2, 0, i12);
        int iRejectUniform = rejectUniform(this, 0, 256, bArr2, i12);
        while (iRejectUniform < 256) {
            int i13 = i12 % 3;
            for (int i14 = 0; i14 < i13; i14++) {
                bArr2[i14] = bArr2[(i12 - i13) + i14];
            }
            Symmetric symmetric2 = this.symmetric;
            symmetric2.stream128squeezeBlocks(bArr2, i13, symmetric2.stream128BlockBytes);
            i12 = this.symmetric.stream128BlockBytes + i13;
            iRejectUniform += rejectUniform(this, iRejectUniform, 256 - iRejectUniform, bArr2, i12);
        }
    }

    public void uniformEta(byte[] bArr, short s7) {
        int i11;
        int i12;
        int dilithiumEta = this.engine.getDilithiumEta();
        if (this.engine.getDilithiumEta() == 2) {
            i11 = this.symmetric.stream256BlockBytes;
            i12 = i11 + 135;
        } else if (this.engine.getDilithiumEta() != 4) {
            d0.k("Wrong Dilithium Eta!");
            return;
        } else {
            i11 = this.symmetric.stream256BlockBytes;
            i12 = i11 + 226;
        }
        int i13 = i12 / i11;
        Symmetric symmetric = this.symmetric;
        int i14 = i13 * symmetric.stream256BlockBytes;
        byte[] bArr2 = new byte[i14];
        symmetric.stream256init(bArr, s7);
        this.symmetric.stream256squeezeBlocks(bArr2, 0, i14);
        Poly poly = this;
        int iRejectEta = rejectEta(poly, 0, 256, bArr2, i14, dilithiumEta);
        while (iRejectEta < 256) {
            Symmetric symmetric2 = poly.symmetric;
            symmetric2.stream256squeezeBlocks(bArr2, 0, symmetric2.stream256BlockBytes);
            iRejectEta += rejectEta(poly, iRejectEta, 256 - iRejectEta, bArr2, poly.symmetric.stream256BlockBytes, dilithiumEta);
            poly = this;
        }
    }

    public void uniformGamma1(byte[] bArr, short s7) {
        int polyUniformGamma1NBlocks = this.engine.getPolyUniformGamma1NBlocks();
        Symmetric symmetric = this.symmetric;
        byte[] bArr2 = new byte[polyUniformGamma1NBlocks * symmetric.stream256BlockBytes];
        symmetric.stream256init(bArr, s7);
        this.symmetric.stream256squeezeBlocks(bArr2, 0, this.engine.getPolyUniformGamma1NBlocks() * this.symmetric.stream256BlockBytes);
        unpackZ(bArr2);
    }

    public void zPack(byte[] bArr, int i11) {
        int dilithiumGamma1 = this.engine.getDilithiumGamma1();
        int i12 = 0;
        if (dilithiumGamma1 != 131072) {
            if (dilithiumGamma1 != 524288) {
                d0.k("Wrong Dilithium Gamma1!");
                return;
            }
            while (i12 < 128) {
                int i13 = i12 * 2;
                int coeffIndex = dilithiumGamma1 - getCoeffIndex(i13);
                int coeffIndex2 = dilithiumGamma1 - getCoeffIndex(i13 + 1);
                int i14 = (i12 * 5) + i11;
                bArr[i14] = (byte) coeffIndex;
                bArr[i14 + 1] = (byte) (coeffIndex >> 8);
                bArr[i14 + 2] = (byte) (((byte) (coeffIndex >> 16)) | (coeffIndex2 << 4));
                bArr[i14 + 3] = (byte) (coeffIndex2 >> 4);
                bArr[i14 + 4] = (byte) (coeffIndex2 >> 12);
                i12++;
            }
            return;
        }
        while (i12 < 64) {
            int i15 = i12 * 4;
            int coeffIndex3 = dilithiumGamma1 - getCoeffIndex(i15);
            int coeffIndex4 = dilithiumGamma1 - getCoeffIndex(i15 + 1);
            int coeffIndex5 = dilithiumGamma1 - getCoeffIndex(i15 + 2);
            int coeffIndex6 = dilithiumGamma1 - getCoeffIndex(i15 + 3);
            int i16 = (i12 * 9) + i11;
            bArr[i16] = (byte) coeffIndex3;
            bArr[i16 + 1] = (byte) (coeffIndex3 >> 8);
            bArr[i16 + 2] = (byte) (((byte) (coeffIndex3 >> 16)) | (coeffIndex4 << 2));
            bArr[i16 + 3] = (byte) (coeffIndex4 >> 6);
            bArr[i16 + 4] = (byte) (((byte) (coeffIndex4 >> 14)) | (coeffIndex5 << 4));
            bArr[i16 + 5] = (byte) (coeffIndex5 >> 4);
            bArr[i16 + 6] = (byte) (((byte) (coeffIndex5 >> 12)) | (coeffIndex6 << 6));
            bArr[i16 + 7] = (byte) (coeffIndex6 >> 2);
            bArr[i16 + 8] = (byte) (coeffIndex6 >> 10);
            i12++;
        }
    }

    public void zUnpack(byte[] bArr) {
        int i11 = 0;
        if (this.engine.getDilithiumGamma1() != 131072) {
            if (this.engine.getDilithiumGamma1() != 524288) {
                d0.k("Wrong Dilithium Gamma1!");
                return;
            }
            while (i11 < 128) {
                int i12 = i11 * 2;
                int i13 = i11 * 5;
                int i14 = i13 + 2;
                setCoeffIndex(i12, ((bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i14] & 255) << 16)) & 1048575);
                int i15 = i12 + 1;
                setCoeffIndex(i15, (((bArr[i13 + 4] & 255) << 12) | ((bArr[i14] & 255) >>> 4) | ((bArr[i13 + 3] & 255) << 4)) & 1048575);
                setCoeffIndex(i12, this.engine.getDilithiumGamma1() - getCoeffIndex(i12));
                setCoeffIndex(i15, this.engine.getDilithiumGamma1() - getCoeffIndex(i15));
                i11++;
            }
            return;
        }
        while (i11 < 64) {
            int i16 = i11 * 4;
            int i17 = i11 * 9;
            int i18 = i17 + 2;
            setCoeffIndex(i16, ((bArr[i17] & 255) | ((bArr[i17 + 1] & 255) << 8) | ((bArr[i18] & 255) << 16)) & 262143);
            int i19 = i16 + 1;
            int i21 = i17 + 4;
            setCoeffIndex(i19, (((bArr[i18] & 255) >>> 2) | ((bArr[i17 + 3] & 255) << 6) | ((bArr[i21] & 255) << 14)) & 262143);
            int i22 = i16 + 2;
            int i23 = i17 + 6;
            setCoeffIndex(i22, (((bArr[i21] & 255) >>> 4) | ((bArr[i17 + 5] & 255) << 4) | ((bArr[i23] & 255) << 12)) & 262143);
            int i24 = i16 + 3;
            setCoeffIndex(i24, (((bArr[i17 + 8] & 255) << 10) | ((bArr[i23] & 255) >>> 6) | ((bArr[i17 + 7] & 255) << 2)) & 262143);
            setCoeffIndex(i16, this.engine.getDilithiumGamma1() - getCoeffIndex(i16));
            setCoeffIndex(i19, this.engine.getDilithiumGamma1() - getCoeffIndex(i19));
            setCoeffIndex(i22, this.engine.getDilithiumGamma1() - getCoeffIndex(i22));
            setCoeffIndex(i24, this.engine.getDilithiumGamma1() - getCoeffIndex(i24));
            i11++;
        }
    }
}

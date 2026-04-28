package org.bouncycastle.pqc.crypto.mlkem;

import a40.d0;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class PolyVec {
    private MLKEMEngine engine;
    private int kyberK;
    private int polyVecBytes;
    Poly[] vec;

    public PolyVec(MLKEMEngine mLKEMEngine) {
        this.engine = mLKEMEngine;
        this.kyberK = mLKEMEngine.getKyberK();
        this.polyVecBytes = mLKEMEngine.getKyberPolyVecBytes();
        this.vec = new Poly[this.kyberK];
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            this.vec[i11] = new Poly(mLKEMEngine);
        }
    }

    public static void pointwiseAccountMontgomery(Poly poly, PolyVec polyVec, PolyVec polyVec2, MLKEMEngine mLKEMEngine) {
        Poly poly2 = new Poly(mLKEMEngine);
        Poly.baseMultMontgomery(poly, polyVec.getVectorIndex(0), polyVec2.getVectorIndex(0));
        for (int i11 = 1; i11 < mLKEMEngine.getKyberK(); i11++) {
            Poly.baseMultMontgomery(poly2, polyVec.getVectorIndex(i11), polyVec2.getVectorIndex(i11));
            poly.addCoeffs(poly2);
        }
        poly.reduce();
    }

    public void addPoly(PolyVec polyVec) {
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            getVectorIndex(i11).addCoeffs(polyVec.getVectorIndex(i11));
        }
    }

    public byte[] compressPolyVec() {
        conditionalSubQ();
        byte[] bArr = new byte[this.engine.getKyberPolyVecCompressedBytes()];
        int i11 = 32;
        if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * 320) {
            short[] sArr = new short[4];
            int i12 = 0;
            for (int i13 = 0; i13 < this.kyberK; i13++) {
                for (int i14 = 0; i14 < 64; i14++) {
                    for (int i15 = 0; i15 < 4; i15++) {
                        sArr[i15] = (short) (((((((long) getVectorIndex(i13).getCoeffIndex((i14 * 4) + i15)) << 10) + 1665) * 1290167) >> 32) & 1023);
                    }
                    short s7 = sArr[0];
                    bArr[i12] = (byte) s7;
                    short s8 = sArr[1];
                    bArr[i12 + 1] = (byte) ((s7 >> 8) | (s8 << 2));
                    int i16 = s8 >> 6;
                    short s11 = sArr[2];
                    bArr[i12 + 2] = (byte) (i16 | (s11 << 4));
                    int i17 = s11 >> 4;
                    short s12 = sArr[3];
                    bArr[i12 + 3] = (byte) (i17 | (s12 << 6));
                    bArr[i12 + 4] = (byte) (s12 >> 2);
                    i12 += 5;
                }
            }
        } else {
            if (this.engine.getKyberPolyVecCompressedBytes() != this.kyberK * 352) {
                d0.k("Kyber PolyVecCompressedBytes neither 320 * KyberK or 352 * KyberK!");
                return null;
            }
            short[] sArr2 = new short[8];
            int i18 = 0;
            int i19 = 0;
            while (i18 < this.kyberK) {
                int i21 = 0;
                while (i21 < i11) {
                    for (int i22 = 0; i22 < 8; i22++) {
                        sArr2[i22] = (short) (((((((long) getVectorIndex(i18).getCoeffIndex((i21 * 8) + i22)) << 11) + 1664) * 645084) >> 31) & 2047);
                    }
                    short s13 = sArr2[0];
                    bArr[i19] = (byte) s13;
                    short s14 = sArr2[1];
                    bArr[i19 + 1] = (byte) ((s13 >> 8) | (s14 << 3));
                    short s15 = sArr2[2];
                    bArr[i19 + 2] = (byte) ((s14 >> 5) | (s15 << 6));
                    bArr[i19 + 3] = (byte) (s15 >> 2);
                    int i23 = s15 >> 10;
                    short s16 = sArr2[3];
                    bArr[i19 + 4] = (byte) (i23 | (s16 << 1));
                    short s17 = sArr2[4];
                    bArr[i19 + 5] = (byte) ((s16 >> 7) | (s17 << 4));
                    short s18 = sArr2[5];
                    bArr[i19 + 6] = (byte) ((s17 >> 4) | (s18 << 7));
                    bArr[i19 + 7] = (byte) (s18 >> 1);
                    int i24 = s18 >> 9;
                    short s19 = sArr2[6];
                    bArr[i19 + 8] = (byte) (i24 | (s19 << 2));
                    int i25 = s19 >> 6;
                    short s21 = sArr2[7];
                    bArr[i19 + 9] = (byte) (i25 | (s21 << 5));
                    bArr[i19 + 10] = (byte) (s21 >> 3);
                    i19 += 11;
                    i21++;
                    i11 = 32;
                }
                i18++;
                i11 = 32;
            }
        }
        return bArr;
    }

    public void conditionalSubQ() {
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            getVectorIndex(i11).conditionalSubQ();
        }
    }

    public void decompressPolyVec(byte[] bArr) {
        int i11 = 3;
        int i12 = 6;
        short s7 = 2;
        short s8 = 4;
        short s11 = 1;
        if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * 320) {
            int i13 = 0;
            for (int i14 = 0; i14 < this.kyberK; i14++) {
                for (int i15 = 0; i15 < 64; i15++) {
                    int i16 = bArr[i13] & 255;
                    byte b8 = bArr[i13 + 1];
                    byte b11 = bArr[i13 + 2];
                    byte b12 = bArr[i13 + 3];
                    short[] sArr = {(short) (i16 | ((short) ((b8 & 255) << 8))), (short) (((b8 & 255) >> 2) | ((short) ((b11 & 255) << 6))), (short) (((b11 & 255) >> 4) | ((short) ((b12 & 255) << 4))), (short) (((b12 & 255) >> 6) | ((short) ((bArr[i13 + 4] & 255) << 2)))};
                    i13 += 5;
                    for (int i17 = 0; i17 < 4; i17++) {
                        this.vec[i14].setCoeffIndex((i15 * 4) + i17, (short) ((((sArr[i17] & 1023) * MLKEMEngine.KyberQ) + 512) >> 10));
                    }
                }
            }
            return;
        }
        if (this.engine.getKyberPolyVecCompressedBytes() != this.kyberK * 352) {
            d0.k("Kyber PolyVecCompressedBytes neither 320 * KyberK or 352 * KyberK!");
            return;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.kyberK; i19++) {
            int i21 = 0;
            while (i21 < 32) {
                int i22 = bArr[i18] & 255;
                byte b13 = bArr[i18 + 1];
                short s12 = (short) (i22 | (((short) (b13 & 255)) << 8));
                byte b14 = bArr[i18 + 2];
                short s13 = (short) (((b13 & 255) >> i11) | (((short) (b14 & 255)) << 5));
                int i23 = ((b14 & 255) >> i12) | (((short) (bArr[i18 + 3] & 255)) << s7);
                byte b15 = bArr[i18 + 4];
                int i24 = i11;
                short s14 = (short) (((short) ((b15 & 255) << 10)) | i23);
                int i25 = (b15 & 255) >> s11;
                byte b16 = bArr[i18 + 5];
                int i26 = i12;
                short s15 = (short) ((((short) (b16 & 255)) << 7) | i25);
                int i27 = (b16 & 255) >> s8;
                byte b17 = bArr[i18 + 6];
                short s16 = s7;
                short s17 = (short) ((((short) (b17 & 255)) << s8) | i27);
                int i28 = ((b17 & 255) >> 7) | (((short) (bArr[i18 + 7] & 255)) << s11);
                byte b18 = bArr[i18 + 8];
                short s18 = s8;
                short s19 = (short) (((short) ((b18 & 255) << 9)) | i28);
                int i29 = (b18 & 255) >> 2;
                byte b19 = bArr[i18 + 9];
                short s21 = s11;
                short s22 = (short) ((((short) (b19 & 255)) << 6) | i29);
                short s23 = (short) (((b19 & 255) >> 5) | (((short) (bArr[i18 + 10] & 255)) << 3));
                short[] sArr2 = new short[8];
                sArr2[0] = s12;
                sArr2[s21] = s13;
                sArr2[s16] = s14;
                sArr2[i24] = s15;
                sArr2[s18] = s17;
                sArr2[5] = s19;
                sArr2[i26] = s22;
                sArr2[7] = s23;
                i18 += 11;
                for (int i31 = 0; i31 < 8; i31++) {
                    this.vec[i19].setCoeffIndex((i21 * 8) + i31, (short) ((((sArr2[i31] & 2047) * MLKEMEngine.KyberQ) + 1024) >> 11));
                }
                i21++;
                i11 = i24;
                i12 = i26;
                s7 = s16;
                s8 = s18;
                s11 = s21;
            }
        }
    }

    public void fromBytes(byte[] bArr) {
        int i11 = 0;
        while (i11 < this.kyberK) {
            Poly vectorIndex = getVectorIndex(i11);
            int i12 = i11 * MLKEMEngine.KyberPolyBytes;
            i11++;
            vectorIndex.fromBytes(Arrays.copyOfRange(bArr, i12, i11 * MLKEMEngine.KyberPolyBytes));
        }
    }

    public Poly getVectorIndex(int i11) {
        return this.vec[i11];
    }

    public void polyVecInverseNttToMont() {
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            getVectorIndex(i11).polyInverseNttToMont();
        }
    }

    public void polyVecNtt() {
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            getVectorIndex(i11).polyNtt();
        }
    }

    public void reducePoly() {
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            getVectorIndex(i11).reduce();
        }
    }

    public byte[] toBytes() {
        byte[] bArr = new byte[this.polyVecBytes];
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            System.arraycopy(this.vec[i11].toBytes(), 0, bArr, i11 * MLKEMEngine.KyberPolyBytes, MLKEMEngine.KyberPolyBytes);
        }
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            stringBuffer.append(this.vec[i11].toString());
            if (i11 != this.kyberK - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public PolyVec() throws Exception {
        throw new Exception("Requires Parameter");
    }
}

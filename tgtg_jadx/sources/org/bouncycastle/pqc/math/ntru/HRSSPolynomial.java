package org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;

/* JADX INFO: loaded from: classes3.dex */
public class HRSSPolynomial extends Polynomial {
    public HRSSPolynomial(NTRUHRSSParameterSet nTRUHRSSParameterSet) {
        super(nTRUHRSSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void lift(Polynomial polynomial) {
        short[] sArr;
        int length = this.coeffs.length;
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        short s7 = (short) (3 - (length % 3));
        short[] sArr2 = polynomialCreatePolynomial.coeffs;
        short[] sArr3 = polynomial.coeffs;
        int i11 = 0;
        int i12 = 2 - s7;
        int i13 = sArr3[0] * i12;
        short s8 = sArr3[1];
        short s11 = sArr3[2];
        sArr2[0] = (short) ((s11 * s7) + i13);
        sArr2[1] = (short) (s8 * i12);
        sArr2[2] = (short) (s11 * i12);
        int i14 = 3;
        short s12 = 0;
        while (true) {
            sArr = polynomialCreatePolynomial.coeffs;
            if (i14 >= length) {
                break;
            }
            short s13 = sArr[0];
            short[] sArr4 = polynomial.coeffs;
            sArr[0] = (short) ((((s7 * 2) + s12) * sArr4[i14]) + s13);
            int i15 = s12 + s7;
            sArr[1] = (short) ((sArr4[i14] * i15) + sArr[1]);
            sArr[2] = (short) ((sArr4[i14] * s12) + sArr[2]);
            s12 = (short) (i15 % 3);
            i14++;
        }
        short s14 = sArr[1];
        short[] sArr5 = polynomial.coeffs;
        short s15 = sArr5[0];
        int i16 = s7 + s12;
        sArr[1] = (short) ((s15 * i16) + s14);
        short s16 = (short) ((s15 * s12) + sArr[2]);
        sArr[2] = s16;
        sArr[2] = (short) ((sArr5[1] * i16) + s16);
        for (int i17 = 3; i17 < length; i17++) {
            short[] sArr6 = polynomialCreatePolynomial.coeffs;
            short s17 = sArr6[i17 - 3];
            short[] sArr7 = polynomial.coeffs;
            sArr6[i17] = (short) (((sArr7[i17] + sArr7[i17 - 1] + sArr7[i17 - 2]) * 2) + s17);
        }
        polynomialCreatePolynomial.mod3PhiN();
        polynomialCreatePolynomial.z3ToZq();
        this.coeffs[0] = (short) (-polynomialCreatePolynomial.coeffs[0]);
        while (i11 < length - 1) {
            short[] sArr8 = this.coeffs;
            int i18 = i11 + 1;
            short[] sArr9 = polynomialCreatePolynomial.coeffs;
            sArr8[i18] = (short) (sArr9[i11] - sArr9[i18]);
            i11 = i18;
        }
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        int i11 = 0;
        while (i11 < this.params.packDegree() / 8) {
            short[] sArr = this.coeffs;
            int i12 = i11 * 8;
            int i13 = i11 * 13;
            int i14 = bArr[i13] & 255;
            byte b8 = bArr[i13 + 1];
            sArr[i12] = (short) (i14 | ((((short) (b8 & 255)) & 31) << 8));
            int i15 = ((b8 & 255) >>> 5) | (((short) (bArr[i13 + 2] & 255)) << 3);
            byte b11 = bArr[i13 + 3];
            sArr[i12 + 1] = (short) (i15 | ((((short) (b11 & 255)) & 3) << 11));
            int i16 = (b11 & 255) >>> 2;
            byte b12 = bArr[i13 + 4];
            sArr[i12 + 2] = (short) (i16 | ((((short) (b12 & 255)) & 127) << 6));
            int i17 = ((b12 & 255) >>> 7) | (((short) (bArr[i13 + 5] & 255)) << 1);
            byte b13 = bArr[i13 + 6];
            sArr[i12 + 3] = (short) (i17 | ((((short) (b13 & 255)) & 15) << 9));
            int i18 = (((short) (bArr[i13 + 7] & 255)) << 4) | ((b13 & 255) >>> 4);
            byte b14 = bArr[i13 + 8];
            sArr[i12 + 4] = (short) (i18 | ((((short) (b14 & 255)) & 1) << 12));
            int i19 = (b14 & 255) >>> 1;
            byte b15 = bArr[i13 + 9];
            sArr[i12 + 5] = (short) (i19 | ((((short) (b15 & 255)) & 63) << 7));
            int i21 = (((short) (bArr[i13 + 10] & 255)) << 2) | ((b15 & 255) >>> 6);
            byte b16 = bArr[i13 + 11];
            sArr[i12 + 6] = (short) (i21 | ((((short) (b16 & 255)) & 7) << 10));
            sArr[i12 + 7] = (short) (((b16 & 255) >>> 3) | (((short) (bArr[i13 + 12] & 255)) << 5));
            i11++;
        }
        int iPackDegree = this.params.packDegree() & 7;
        if (iPackDegree == 2) {
            short[] sArr2 = this.coeffs;
            int i22 = i11 * 8;
            int i23 = i11 * 13;
            int i24 = bArr[i23] & 255;
            byte b17 = bArr[i23 + 1];
            sArr2[i22] = (short) (i24 | ((((short) (b17 & 255)) & 31) << 8));
            sArr2[i22 + 1] = (short) (((((short) (bArr[i23 + 3] & 255)) & 3) << 11) | ((b17 & 255) >>> 5) | (((short) (bArr[i23 + 2] & 255)) << 3));
        } else if (iPackDegree == 4) {
            short[] sArr3 = this.coeffs;
            int i25 = i11 * 8;
            int i26 = i11 * 13;
            int i27 = bArr[i26] & 255;
            byte b18 = bArr[i26 + 1];
            sArr3[i25] = (short) (i27 | ((((short) (b18 & 255)) & 31) << 8));
            int i28 = ((b18 & 255) >>> 5) | (((short) (bArr[i26 + 2] & 255)) << 3);
            byte b19 = bArr[i26 + 3];
            sArr3[i25 + 1] = (short) (i28 | ((((short) (b19 & 255)) & 3) << 11));
            byte b21 = bArr[i26 + 4];
            sArr3[i25 + 2] = (short) (((b19 & 255) >>> 2) | ((((short) (b21 & 255)) & 127) << 6));
            sArr3[i25 + 3] = (short) (((((short) (bArr[i26 + 6] & 255)) & 15) << 9) | ((b21 & 255) >>> 7) | (((short) (bArr[i26 + 5] & 255)) << 1));
        }
        this.coeffs[this.params.n() - 1] = 0;
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public byte[] sqToBytes(int i11) {
        byte[] bArr = new byte[i11];
        short[] sArr = new short[8];
        int i12 = 0;
        while (i12 < this.params.packDegree() / 8) {
            for (int i13 = 0; i13 < 8; i13++) {
                sArr[i13] = (short) Polynomial.modQ(this.coeffs[(i12 * 8) + i13] & HPKE.aead_EXPORT_ONLY, this.params.q());
            }
            int i14 = i12 * 13;
            short s7 = sArr[0];
            bArr[i14] = (byte) (s7 & 255);
            short s8 = sArr[1];
            bArr[i14 + 1] = (byte) ((s7 >>> 8) | ((s8 & 7) << 5));
            bArr[i14 + 2] = (byte) ((s8 >>> 3) & 255);
            int i15 = s8 >>> 11;
            short s11 = sArr[2];
            bArr[i14 + 3] = (byte) (i15 | ((s11 & 63) << 2));
            short s12 = sArr[3];
            bArr[i14 + 4] = (byte) ((s11 >>> 6) | ((s12 & 1) << 7));
            bArr[i14 + 5] = (byte) ((s12 >>> 1) & 255);
            int i16 = s12 >>> 9;
            short s13 = sArr[4];
            bArr[i14 + 6] = (byte) (i16 | ((s13 & 15) << 4));
            bArr[i14 + 7] = (byte) ((s13 >>> 4) & 255);
            short s14 = sArr[5];
            bArr[i14 + 8] = (byte) ((s13 >>> 12) | ((s14 & 127) << 1));
            int i17 = s14 >>> 7;
            short s15 = sArr[6];
            bArr[i14 + 9] = (byte) (i17 | ((s15 & 3) << 6));
            bArr[i14 + 10] = (byte) ((s15 >>> 2) & 255);
            short s16 = sArr[7];
            bArr[i14 + 11] = (byte) ((s15 >>> 10) | ((s16 & 31) << 3));
            bArr[i14 + 12] = (byte) (s16 >>> 5);
            i12++;
        }
        int i18 = 0;
        while (true) {
            int i19 = i12 * 8;
            if (i18 >= this.params.packDegree() - i19) {
                break;
            }
            sArr[i18] = (short) Polynomial.modQ(this.coeffs[i19 + i18] & HPKE.aead_EXPORT_ONLY, this.params.q());
            i18++;
        }
        while (i18 < 8) {
            sArr[i18] = 0;
            i18++;
        }
        int iPackDegree = this.params.packDegree() - ((this.params.packDegree() / 8) * 8);
        if (iPackDegree != 2) {
            if (iPackDegree != 4) {
                return bArr;
            }
            int i21 = i12 * 13;
            short s17 = sArr[0];
            bArr[i21] = (byte) (s17 & 255);
            short s18 = sArr[1];
            bArr[i21 + 1] = (byte) ((s17 >>> 8) | ((s18 & 7) << 5));
            bArr[i21 + 2] = (byte) ((s18 >>> 3) & 255);
            int i22 = s18 >>> 11;
            short s19 = sArr[2];
            bArr[i21 + 3] = (byte) (i22 | ((s19 & 63) << 2));
            int i23 = s19 >>> 6;
            short s21 = sArr[3];
            bArr[i21 + 4] = (byte) (i23 | ((s21 & 1) << 7));
            bArr[i21 + 5] = (byte) ((s21 >>> 1) & 255);
            bArr[i21 + 6] = (byte) ((s21 >>> 9) | ((sArr[4] & 15) << 4));
        }
        int i24 = i12 * 13;
        short s22 = sArr[0];
        bArr[i24] = (byte) (s22 & 255);
        int i25 = s22 >>> 8;
        short s23 = sArr[1];
        bArr[i24 + 1] = (byte) (i25 | ((s23 & 7) << 5));
        bArr[i24 + 2] = (byte) ((s23 >>> 3) & 255);
        bArr[i24 + 3] = (byte) ((s23 >>> 11) | ((sArr[2] & 63) << 2));
        return bArr;
    }
}

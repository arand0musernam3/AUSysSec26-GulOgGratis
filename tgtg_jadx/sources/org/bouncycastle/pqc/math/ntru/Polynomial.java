package org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Polynomial {
    public short[] coeffs;
    protected NTRUParameterSet params;

    public Polynomial(NTRUParameterSet nTRUParameterSet) {
        this.coeffs = new short[nTRUParameterSet.n()];
        this.params = nTRUParameterSet;
    }

    public static short bothNegativeMask(short s7, short s8) {
        return (short) ((s7 & s8) >>> 15);
    }

    public static short mod3(short s7) {
        return (short) ((s7 & HPKE.aead_EXPORT_ONLY) % 3);
    }

    public static int modQ(int i11, int i12) {
        return i11 % i12;
    }

    private void r2InvToRqInv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        int length = this.coeffs.length;
        for (int i11 = 0; i11 < length; i11++) {
            polynomial3.coeffs[i11] = (short) (-polynomial2.coeffs[i11]);
        }
        for (int i12 = 0; i12 < length; i12++) {
            this.coeffs[i12] = polynomial.coeffs[i12];
        }
        polynomial4.rqMul(this, polynomial3);
        short[] sArr = polynomial4.coeffs;
        sArr[0] = (short) (sArr[0] + 2);
        polynomial5.rqMul(polynomial4, this);
        polynomial4.rqMul(polynomial5, polynomial3);
        short[] sArr2 = polynomial4.coeffs;
        sArr2[0] = (short) (sArr2[0] + 2);
        rqMul(polynomial4, polynomial5);
        polynomial4.rqMul(this, polynomial3);
        short[] sArr3 = polynomial4.coeffs;
        sArr3[0] = (short) (sArr3[0] + 2);
        polynomial5.rqMul(polynomial4, this);
        polynomial4.rqMul(polynomial5, polynomial3);
        short[] sArr4 = polynomial4.coeffs;
        sArr4[0] = (short) (sArr4[0] + 2);
        rqMul(polynomial4, polynomial5);
    }

    public abstract void lift(Polynomial polynomial);

    public void mod3PhiN() {
        int iN = this.params.n();
        for (int i11 = 0; i11 < iN; i11++) {
            short[] sArr = this.coeffs;
            sArr[i11] = mod3((short) ((sArr[iN - 1] * 2) + sArr[i11]));
        }
    }

    public void modQPhiN() {
        int iN = this.params.n();
        for (int i11 = 0; i11 < iN; i11++) {
            short[] sArr = this.coeffs;
            sArr[i11] = (short) (sArr[i11] - sArr[iN - 1]);
        }
    }

    public void r2Inv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        int i11;
        short[] sArr;
        int length = this.coeffs.length;
        short s7 = 0;
        polynomial5.coeffs[0] = 1;
        for (int i12 = 0; i12 < length; i12++) {
            polynomial2.coeffs[i12] = 1;
        }
        int i13 = 0;
        while (true) {
            i11 = length - 1;
            if (i13 >= i11) {
                break;
            }
            short[] sArr2 = polynomial.coeffs;
            polynomial3.coeffs[(length - 2) - i13] = (short) ((sArr2[i11] ^ sArr2[i13]) & 1);
            i13++;
        }
        polynomial3.coeffs[i11] = 0;
        int i14 = 0;
        short s8 = 1;
        for (short s11 = 1; i14 < (i11 * 2) - s11; s11 = 1) {
            for (int i15 = i11; i15 > 0; i15--) {
                short[] sArr3 = polynomial4.coeffs;
                sArr3[i15] = sArr3[i15 - 1];
            }
            polynomial4.coeffs[s7] = s7;
            short s12 = polynomial3.coeffs[s7];
            short s13 = (short) (polynomial2.coeffs[s7] & s12);
            int i16 = -s8;
            short sBothNegativeMask = bothNegativeMask((short) i16, (short) (-s12));
            s8 = (short) (((short) (s8 ^ ((i16 ^ s8) & sBothNegativeMask))) + s11);
            int i17 = s7;
            short s14 = s7;
            while (i17 < length) {
                short[] sArr4 = polynomial2.coeffs;
                short s15 = sArr4[i17];
                short s16 = s14;
                short[] sArr5 = polynomial3.coeffs;
                short s17 = (short) (sBothNegativeMask & (s15 ^ sArr5[i17]));
                sArr4[i17] = (short) (s15 ^ s17);
                sArr5[i17] = (short) (s17 ^ sArr5[i17]);
                short[] sArr6 = polynomial4.coeffs;
                short s18 = sArr6[i17];
                short[] sArr7 = polynomial5.coeffs;
                short s19 = (short) ((sArr7[i17] ^ s18) & sBothNegativeMask);
                sArr6[i17] = (short) (s18 ^ s19);
                sArr7[i17] = (short) (sArr7[i17] ^ s19);
                i17++;
                s14 = s16 == true ? 1 : 0;
            }
            short s21 = s14;
            for (int i18 = s14; i18 < length; i18++) {
                short[] sArr8 = polynomial3.coeffs;
                sArr8[i18] = (short) (sArr8[i18] ^ (polynomial2.coeffs[i18] & s13));
            }
            for (int i19 = s21; i19 < length; i19++) {
                short[] sArr9 = polynomial5.coeffs;
                sArr9[i19] = (short) (sArr9[i19] ^ (polynomial4.coeffs[i19] & s13));
            }
            int i21 = s21;
            while (true) {
                sArr = polynomial3.coeffs;
                if (i21 < i11) {
                    int i22 = i21 + 1;
                    sArr[i21] = sArr[i22];
                    i21 = i22;
                }
            }
            sArr[i11] = s21;
            i14++;
            s7 = s21;
        }
        short s22 = s7;
        int i23 = s22;
        while (true) {
            short[] sArr10 = this.coeffs;
            if (i23 >= i11) {
                sArr10[i11] = s22;
                return;
            } else {
                sArr10[i23] = polynomial4.coeffs[(length - 2) - i23];
                i23++;
            }
        }
    }

    public void rqInv(Polynomial polynomial) {
        rqInv(polynomial, this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial());
    }

    public void rqMul(Polynomial polynomial, Polynomial polynomial2) {
        int i11;
        int length = this.coeffs.length;
        int i12 = 0;
        while (i12 < length) {
            this.coeffs[i12] = 0;
            for (int i13 = 1; i13 < length - i12; i13++) {
                short[] sArr = this.coeffs;
                sArr[i12] = (short) ((polynomial.coeffs[i12 + i13] * polynomial2.coeffs[length - i13]) + sArr[i12]);
            }
            int i14 = 0;
            while (true) {
                i11 = i12 + 1;
                if (i14 < i11) {
                    short[] sArr2 = this.coeffs;
                    sArr2[i12] = (short) ((polynomial.coeffs[i12 - i14] * polynomial2.coeffs[i14]) + sArr2[i12]);
                    i14++;
                }
            }
            i12 = i11;
        }
    }

    public void rqSumZeroFromBytes(byte[] bArr) {
        int length = this.coeffs.length;
        sqFromBytes(bArr);
        int i11 = length - 1;
        this.coeffs[i11] = 0;
        for (int i12 = 0; i12 < this.params.packDegree(); i12++) {
            short[] sArr = this.coeffs;
            sArr[i11] = (short) (sArr[i11] - sArr[i12]);
        }
    }

    public byte[] rqSumZeroToBytes(int i11) {
        return sqToBytes(i11);
    }

    public void rqToS3(Polynomial polynomial) {
        int length = this.coeffs.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.coeffs[i11] = (short) modQ(polynomial.coeffs[i11] & HPKE.aead_EXPORT_ONLY, this.params.q());
            short sLogQ = (short) (this.coeffs[i11] >>> (this.params.logQ() - 1));
            short[] sArr = this.coeffs;
            sArr[i11] = (short) (sArr[i11] + (sLogQ << (1 - (this.params.logQ() & 1))));
        }
        mod3PhiN();
    }

    public void s3FromBytes(byte[] bArr) {
        int length = this.coeffs.length;
        for (int i11 = 0; i11 < this.params.packDegree() / 5; i11++) {
            byte b8 = bArr[i11];
            short[] sArr = this.coeffs;
            int i12 = i11 * 5;
            sArr[i12] = b8;
            int i13 = b8 & 255;
            sArr[i12 + 1] = (short) ((i13 * 171) >>> 9);
            sArr[i12 + 2] = (short) ((i13 * 57) >>> 9);
            sArr[i12 + 3] = (short) ((i13 * 19) >>> 9);
            sArr[i12 + 4] = (short) ((i13 * 203) >>> 14);
        }
        if (this.params.packDegree() > (this.params.packDegree() / 5) * 5) {
            int iPackDegree = this.params.packDegree() / 5;
            byte b11 = bArr[iPackDegree];
            int i14 = 0;
            while (true) {
                int i15 = (iPackDegree * 5) + i14;
                if (i15 >= this.params.packDegree()) {
                    break;
                }
                this.coeffs[i15] = b11;
                b11 = (byte) (((b11 & 255) * 171) >> 9);
                i14++;
            }
        }
        this.coeffs[length - 1] = 0;
        mod3PhiN();
    }

    public void s3Inv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        int i11;
        short[] sArr;
        int length = this.coeffs.length;
        short s7 = 0;
        polynomial5.coeffs[0] = 1;
        for (int i12 = 0; i12 < length; i12++) {
            polynomial2.coeffs[i12] = 1;
        }
        int i13 = 0;
        while (true) {
            i11 = length - 1;
            if (i13 >= i11) {
                break;
            }
            short[] sArr2 = polynomial.coeffs;
            polynomial3.coeffs[(length - 2) - i13] = mod3((short) (((sArr2[i11] & 3) * 2) + (sArr2[i13] & 3)));
            i13++;
        }
        polynomial3.coeffs[i11] = 0;
        int i14 = 0;
        short s8 = 1;
        for (short s11 = 1; i14 < (i11 * 2) - s11; s11 = 1) {
            for (int i15 = i11; i15 > 0; i15--) {
                short[] sArr3 = polynomial4.coeffs;
                sArr3[i15] = sArr3[i15 - 1];
            }
            polynomial4.coeffs[s7] = s7;
            short sMod3 = mod3((byte) (polynomial3.coeffs[s7] * 2 * polynomial2.coeffs[s7]));
            int i16 = -s8;
            short sBothNegativeMask = bothNegativeMask((short) i16, (short) (-polynomial3.coeffs[s7]));
            s8 = (short) (((short) (s8 ^ ((i16 ^ s8) & sBothNegativeMask))) + s11);
            int i17 = s7;
            short s12 = s7;
            while (i17 < length) {
                short[] sArr4 = polynomial2.coeffs;
                short s13 = sArr4[i17];
                short s14 = s12;
                short[] sArr5 = polynomial3.coeffs;
                short s15 = (short) (sBothNegativeMask & (s13 ^ sArr5[i17]));
                sArr4[i17] = (short) (s13 ^ s15);
                sArr5[i17] = (short) (s15 ^ sArr5[i17]);
                short[] sArr6 = polynomial4.coeffs;
                short s16 = sArr6[i17];
                short[] sArr7 = polynomial5.coeffs;
                short s17 = (short) ((sArr7[i17] ^ s16) & sBothNegativeMask);
                sArr6[i17] = (short) (s16 ^ s17);
                sArr7[i17] = (short) (sArr7[i17] ^ s17);
                i17++;
                s12 = s14 == true ? 1 : 0;
            }
            short s18 = s12;
            for (int i18 = s12; i18 < length; i18++) {
                polynomial3.coeffs[i18] = mod3((byte) ((polynomial2.coeffs[i18] * sMod3) + r8[i18]));
            }
            for (int i19 = s18; i19 < length; i19++) {
                polynomial5.coeffs[i19] = mod3((byte) ((polynomial4.coeffs[i19] * sMod3) + r8[i19]));
            }
            int i21 = s18;
            while (true) {
                sArr = polynomial3.coeffs;
                if (i21 < i11) {
                    int i22 = i21 + 1;
                    sArr[i21] = sArr[i22];
                    i21 = i22;
                }
            }
            sArr[i11] = s18;
            i14++;
            s7 = s18;
        }
        short s19 = s7;
        short s21 = polynomial2.coeffs[s19];
        int i23 = s19;
        while (true) {
            short[] sArr8 = this.coeffs;
            if (i23 >= i11) {
                sArr8[i11] = s19;
                return;
            } else {
                sArr8[i23] = mod3((byte) (polynomial4.coeffs[(length - 2) - i23] * s21));
                i23++;
            }
        }
    }

    public void s3Mul(Polynomial polynomial, Polynomial polynomial2) {
        rqMul(polynomial, polynomial2);
        mod3PhiN();
    }

    public void s3ToBytes(byte[] bArr, int i11) {
        int iPackDegree = this.params.packDegree();
        int i12 = iPackDegree - 5;
        int i13 = 0;
        while (i13 <= i12) {
            short[] sArr = this.coeffs;
            int i14 = sArr[i13] & 255;
            int i15 = (sArr[i13 + 1] & 255) * 3;
            int i16 = (sArr[i13 + 2] & 255) * 9;
            bArr[i11] = (byte) (i14 + i15 + i16 + ((sArr[i13 + 3] & 255) * 27) + ((sArr[i13 + 4] & 255) * 81));
            i13 += 5;
            i11++;
        }
        if (i13 >= iPackDegree) {
            return;
        }
        int i17 = iPackDegree - 1;
        int i18 = this.coeffs[i17] & 255;
        while (true) {
            i17--;
            if (i17 < i13) {
                bArr[i11] = (byte) i18;
                return;
            }
            i18 = (i18 * 3) + (this.coeffs[i17] & 255);
        }
    }

    public abstract void sqFromBytes(byte[] bArr);

    public void sqMul(Polynomial polynomial, Polynomial polynomial2) {
        rqMul(polynomial, polynomial2);
        modQPhiN();
    }

    public abstract byte[] sqToBytes(int i11);

    public void trinaryZqToZ3() {
        int length = this.coeffs.length;
        for (int i11 = 0; i11 < length; i11++) {
            short[] sArr = this.coeffs;
            sArr[i11] = (short) modQ(sArr[i11] & HPKE.aead_EXPORT_ONLY, this.params.q());
            short[] sArr2 = this.coeffs;
            short s7 = sArr2[i11];
            sArr2[i11] = (short) ((s7 ^ (s7 >>> (this.params.logQ() - 1))) & 3);
        }
    }

    public void z3ToZq() {
        int length = this.coeffs.length;
        for (int i11 = 0; i11 < length; i11++) {
            short[] sArr = this.coeffs;
            short s7 = sArr[i11];
            sArr[i11] = (short) (s7 | ((-(s7 >>> 1)) & (this.params.q() - 1)));
        }
    }

    public static byte mod3(byte b8) {
        return (byte) ((b8 & 255) % 3);
    }

    public void rqInv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        polynomial2.r2Inv(polynomial);
        r2InvToRqInv(polynomial2, polynomial, polynomial3, polynomial4, polynomial5);
    }

    public byte[] s3ToBytes(int i11) {
        byte[] bArr = new byte[i11];
        s3ToBytes(bArr, 0);
        return bArr;
    }

    public void r2Inv(Polynomial polynomial) {
        r2Inv(polynomial, this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial());
    }

    public void s3Inv(Polynomial polynomial) {
        s3Inv(polynomial, this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial());
    }
}

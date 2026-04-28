package org.bouncycastle.pqc.legacy.math.linearalgebra;

import i4.a;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public class GF2mField {
    private int degree;
    private int polynomial;

    public GF2mField(byte[] bArr) {
        this.degree = 0;
        if (bArr.length != 4) {
            a.f("byte array is not an encoded finite field");
            throw null;
        }
        int iOS2IP = LittleEndianConversions.OS2IP(bArr);
        this.polynomial = iOS2IP;
        if (PolynomialRingGF2.isIrreducible(iOS2IP)) {
            this.degree = PolynomialRingGF2.degree(this.polynomial);
        } else {
            a.f("byte array is not an encoded finite field");
            throw null;
        }
    }

    private static String polyToString(int i11) {
        if (i11 == 0) {
            return "0";
        }
        String str = ((byte) (i11 & 1)) == 1 ? "1" : "";
        int i12 = i11 >>> 1;
        int i13 = 1;
        while (i12 != 0) {
            if (((byte) (i12 & 1)) == 1) {
                str = str + "+x^" + i13;
            }
            i12 >>>= 1;
            i13++;
        }
        return str;
    }

    public int add(int i11, int i12) {
        return i11 ^ i12;
    }

    public String elementToStr(int i11) {
        String strConcat = "";
        for (int i12 = 0; i12 < this.degree; i12++) {
            strConcat = ((((byte) i11) & 1) == 0 ? "0" : "1").concat(strConcat);
            i11 >>>= 1;
        }
        return strConcat;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof GF2mField)) {
            GF2mField gF2mField = (GF2mField) obj;
            if (this.degree == gF2mField.degree && this.polynomial == gF2mField.polynomial) {
                return true;
            }
        }
        return false;
    }

    public int exp(int i11, int i12) {
        if (i12 == 0) {
            return 1;
        }
        if (i11 == 0) {
            return 0;
        }
        if (i11 == 1) {
            return 1;
        }
        if (i12 < 0) {
            i11 = inverse(i11);
            i12 = -i12;
        }
        int iMult = 1;
        while (i12 != 0) {
            if ((i12 & 1) == 1) {
                iMult = mult(iMult, i11);
            }
            i11 = mult(i11, i11);
            i12 >>>= 1;
        }
        return iMult;
    }

    public int getDegree() {
        return this.degree;
    }

    public byte[] getEncoded() {
        return LittleEndianConversions.I2OSP(this.polynomial);
    }

    public int getPolynomial() {
        return this.polynomial;
    }

    public int getRandomElement(SecureRandom secureRandom) {
        return RandUtils.nextInt(secureRandom, 1 << this.degree);
    }

    public int getRandomNonZeroElement(SecureRandom secureRandom) {
        int iNextInt = RandUtils.nextInt(secureRandom, 1 << this.degree);
        int i11 = 0;
        while (iNextInt == 0 && i11 < 1048576) {
            iNextInt = RandUtils.nextInt(secureRandom, 1 << this.degree);
            i11++;
        }
        if (i11 == 1048576) {
            return 1;
        }
        return iNextInt;
    }

    public int hashCode() {
        return this.polynomial;
    }

    public int inverse(int i11) {
        return exp(i11, (1 << this.degree) - 2);
    }

    public boolean isElementOfThisField(int i11) {
        int i12 = this.degree;
        return i12 == 31 ? i11 >= 0 : i11 >= 0 && i11 < (1 << i12);
    }

    public int mult(int i11, int i12) {
        return PolynomialRingGF2.modMultiply(i11, i12, this.polynomial);
    }

    public int sqRoot(int i11) {
        for (int i12 = 1; i12 < this.degree; i12++) {
            i11 = mult(i11, i11);
        }
        return i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Finite Field GF(2^");
        sb2.append(this.degree);
        sb2.append(") = GF(2)[X]/<");
        return k.p(sb2, polyToString(this.polynomial), "> ");
    }

    public int getRandomNonZeroElement() {
        return getRandomNonZeroElement(CryptoServicesRegistrar.getSecureRandom());
    }

    public GF2mField(int i11, int i12) {
        this.degree = 0;
        if (i11 != PolynomialRingGF2.degree(i12)) {
            a.f(" Error: the degree is not correct");
            throw null;
        }
        if (!PolynomialRingGF2.isIrreducible(i12)) {
            a.f(" Error: given polynomial is reducible");
            throw null;
        }
        this.degree = i11;
        this.polynomial = i12;
    }

    public GF2mField(GF2mField gF2mField) {
        this.degree = 0;
        this.degree = gF2mField.degree;
        this.polynomial = gF2mField.polynomial;
    }

    public GF2mField(int i11) {
        this.degree = 0;
        if (i11 >= 32) {
            a.f(" Error: the degree of field is too large ");
            throw null;
        }
        if (i11 < 1) {
            a.f(" Error: the degree of field is non-positive ");
            throw null;
        }
        this.degree = i11;
        this.polynomial = PolynomialRingGF2.getIrreduciblePolynomial(i11);
    }
}

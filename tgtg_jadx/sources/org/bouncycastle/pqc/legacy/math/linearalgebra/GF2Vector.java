package org.bouncycastle.pqc.legacy.math.linearalgebra;

import j4.d;
import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class GF2Vector extends Vector {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int[] f33715v;

    public GF2Vector(int i11, int i12, SecureRandom secureRandom) {
        if (i12 > i11) {
            d.f("The hamming weight is greater than the length of vector.");
            throw null;
        }
        this.length = i11;
        this.f33715v = new int[(i11 + 31) >> 5];
        int[] iArr = new int[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            iArr[i13] = i13;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            int iNextInt = RandUtils.nextInt(secureRandom, i11);
            setBit(iArr[iNextInt]);
            i11--;
            iArr[iNextInt] = iArr[i11];
        }
    }

    public static GF2Vector OS2VP(int i11, byte[] bArr) {
        String str;
        if (i11 >= 0) {
            if (bArr.length <= ((i11 + 7) >> 3)) {
                return new GF2Vector(i11, LittleEndianConversions.toIntArray(bArr));
            }
            str = "length mismatch";
        } else {
            str = "negative length";
        }
        d.f(str);
        return null;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public Vector add(Vector vector) {
        String str;
        if (vector instanceof GF2Vector) {
            GF2Vector gF2Vector = (GF2Vector) vector;
            if (this.length == gF2Vector.length) {
                int[] iArrClone = IntUtils.clone(gF2Vector.f33715v);
                for (int length = iArrClone.length - 1; length >= 0; length--) {
                    iArrClone[length] = iArrClone[length] ^ this.f33715v[length];
                }
                return new GF2Vector(this.length, iArrClone);
            }
            str = "length mismatch";
        } else {
            str = "vector is not defined over GF(2)";
        }
        d.f(str);
        return null;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public boolean equals(Object obj) {
        if (!(obj instanceof GF2Vector)) {
            return false;
        }
        GF2Vector gF2Vector = (GF2Vector) obj;
        return this.length == gF2Vector.length && IntUtils.equals(this.f33715v, gF2Vector.f33715v);
    }

    public GF2Vector extractLeftVector(int i11) {
        int i12 = this.length;
        if (i11 > i12) {
            d.f("invalid length");
            return null;
        }
        if (i11 == i12) {
            return new GF2Vector(this);
        }
        GF2Vector gF2Vector = new GF2Vector(i11);
        int i13 = i11 >> 5;
        int i14 = i11 & 31;
        System.arraycopy(this.f33715v, 0, gF2Vector.f33715v, 0, i13);
        if (i14 != 0) {
            gF2Vector.f33715v[i13] = ((1 << i14) - 1) & this.f33715v[i13];
        }
        return gF2Vector;
    }

    public GF2Vector extractRightVector(int i11) {
        int i12;
        int[] iArr;
        int i13 = this.length;
        if (i11 > i13) {
            d.f("invalid length");
            return null;
        }
        if (i11 == i13) {
            return new GF2Vector(this);
        }
        GF2Vector gF2Vector = new GF2Vector(i11);
        int i14 = this.length;
        int i15 = (i14 - i11) >> 5;
        int i16 = (i14 - i11) & 31;
        int i17 = (i11 + 31) >> 5;
        int i18 = 0;
        if (i16 == 0) {
            System.arraycopy(this.f33715v, i15, gF2Vector.f33715v, 0, i17);
            return gF2Vector;
        }
        while (true) {
            i12 = i17 - 1;
            iArr = gF2Vector.f33715v;
            if (i18 >= i12) {
                break;
            }
            int[] iArr2 = this.f33715v;
            int i19 = i15 + 1;
            iArr[i18] = (iArr2[i15] >>> i16) | (iArr2[i19] << (32 - i16));
            i18++;
            i15 = i19;
        }
        int[] iArr3 = this.f33715v;
        int i21 = i15 + 1;
        int i22 = iArr3[i15] >>> i16;
        iArr[i12] = i22;
        if (i21 < iArr3.length) {
            iArr[i12] = (iArr3[i21] << (32 - i16)) | i22;
        }
        return gF2Vector;
    }

    public GF2Vector extractVector(int[] iArr) {
        int length = iArr.length;
        if (iArr[length - 1] > this.length) {
            d.f("invalid index set");
            return null;
        }
        GF2Vector gF2Vector = new GF2Vector(length);
        for (int i11 = 0; i11 < length; i11++) {
            int[] iArr2 = this.f33715v;
            int i12 = iArr[i11];
            if ((iArr2[i12 >> 5] & (1 << (i12 & 31))) != 0) {
                int[] iArr3 = gF2Vector.f33715v;
                int i13 = i11 >> 5;
                iArr3[i13] = (1 << (i11 & 31)) | iArr3[i13];
            }
        }
        return gF2Vector;
    }

    public int getBit(int i11) {
        if (i11 >= this.length) {
            throw new IndexOutOfBoundsException();
        }
        int i12 = i11 >> 5;
        int i13 = i11 & 31;
        return (this.f33715v[i12] & (1 << i13)) >>> i13;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public byte[] getEncoded() {
        return LittleEndianConversions.toByteArray(this.f33715v, (this.length + 7) >> 3);
    }

    public int getHammingWeight() {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f33715v;
            if (i11 >= iArr.length) {
                return i12;
            }
            int i13 = iArr[i11];
            for (int i14 = 0; i14 < 32; i14++) {
                if ((i13 & 1) != 0) {
                    i12++;
                }
                i13 >>>= 1;
            }
            i11++;
        }
    }

    public int[] getVecArray() {
        return this.f33715v;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public int hashCode() {
        return Arrays.hashCode(this.f33715v) + (this.length * 31);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public boolean isZero() {
        for (int length = this.f33715v.length - 1; length >= 0; length--) {
            if (this.f33715v[length] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public Vector multiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        int i11 = this.length;
        if (i11 != vector.length) {
            d.f("length mismatch");
            return null;
        }
        GF2Vector gF2Vector = new GF2Vector(i11);
        for (int i12 = 0; i12 < vector.length; i12++) {
            int[] iArr = this.f33715v;
            int i13 = vector[i12];
            if ((iArr[i13 >> 5] & (1 << (i13 & 31))) != 0) {
                int[] iArr2 = gF2Vector.f33715v;
                int i14 = i12 >> 5;
                iArr2[i14] = (1 << (i12 & 31)) | iArr2[i14];
            }
        }
        return gF2Vector;
    }

    public void setBit(int i11) {
        if (i11 >= this.length) {
            throw new IndexOutOfBoundsException();
        }
        int[] iArr = this.f33715v;
        int i12 = i11 >> 5;
        iArr[i12] = (1 << (i11 & 31)) | iArr[i12];
    }

    public GF2mVector toExtensionFieldVector(GF2mField gF2mField) {
        int degree = gF2mField.getDegree();
        int i11 = this.length;
        if (i11 % degree != 0) {
            d.f("conversion is impossible");
            return null;
        }
        int i12 = i11 / degree;
        int[] iArr = new int[i12];
        int i13 = 0;
        for (int i14 = i12 - 1; i14 >= 0; i14--) {
            for (int degree2 = gF2mField.getDegree() - 1; degree2 >= 0; degree2--) {
                if (((this.f33715v[i13 >>> 5] >>> (i13 & 31)) & 1) == 1) {
                    iArr[i14] = iArr[i14] ^ (1 << degree2);
                }
                i13++;
            }
        }
        return new GF2mVector(gF2mField, iArr);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < this.length; i11++) {
            if (i11 != 0 && (i11 & 31) == 0) {
                stringBuffer.append(' ');
            }
            stringBuffer.append((this.f33715v[i11 >> 5] & (1 << (i11 & 31))) == 0 ? '0' : '1');
        }
        return stringBuffer.toString();
    }

    public GF2Vector(int i11) {
        if (i11 < 0) {
            d.f("Negative length.");
            throw null;
        }
        this.length = i11;
        this.f33715v = new int[(i11 + 31) >> 5];
    }

    public GF2Vector(int i11, SecureRandom secureRandom) {
        this.length = i11;
        int i12 = (i11 + 31) >> 5;
        this.f33715v = new int[i12];
        int i13 = i12 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            this.f33715v[i14] = secureRandom.nextInt();
        }
        int i15 = i11 & 31;
        if (i15 != 0) {
            int[] iArr = this.f33715v;
            iArr[i13] = ((1 << i15) - 1) & iArr[i13];
        }
    }

    public GF2Vector(int i11, int[] iArr) {
        if (i11 < 0) {
            d.f("negative length");
            throw null;
        }
        this.length = i11;
        int i12 = (i11 + 31) >> 5;
        if (iArr.length != i12) {
            d.f("length mismatch");
            throw null;
        }
        int[] iArrClone = IntUtils.clone(iArr);
        this.f33715v = iArrClone;
        int i13 = i11 & 31;
        if (i13 != 0) {
            int i14 = i12 - 1;
            iArrClone[i14] = ((1 << i13) - 1) & iArrClone[i14];
        }
    }

    public GF2Vector(GF2Vector gF2Vector) {
        this.length = gF2Vector.length;
        this.f33715v = IntUtils.clone(gF2Vector.f33715v);
    }

    public GF2Vector(int[] iArr, int i11) {
        this.f33715v = iArr;
        this.length = i11;
    }
}

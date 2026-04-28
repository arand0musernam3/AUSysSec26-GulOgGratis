package org.bouncycastle.pqc.legacy.math.linearalgebra;

import i4.a;
import j4.d;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class GF2mVector extends Vector {
    private GF2mField field;
    private int[] vector;

    public GF2mVector(GF2mField gF2mField, byte[] bArr) {
        int[] iArr;
        this.field = new GF2mField(gF2mField);
        int i11 = 8;
        int i12 = 1;
        while (gF2mField.getDegree() > i11) {
            i12++;
            i11 += 8;
        }
        if (bArr.length % i12 != 0) {
            a.f("Byte array is not an encoded vector over the given finite field.");
            throw null;
        }
        int length = bArr.length / i12;
        this.length = length;
        this.vector = new int[length];
        int i13 = 0;
        for (int i14 = 0; i14 < this.vector.length; i14++) {
            int i15 = 0;
            while (true) {
                iArr = this.vector;
                if (i15 >= i11) {
                    break;
                }
                iArr[i14] = ((bArr[i13] & 255) << i15) | iArr[i14];
                i15 += 8;
                i13++;
            }
            if (!gF2mField.isElementOfThisField(iArr[i14])) {
                a.f("Byte array is not an encoded vector over the given finite field.");
                throw null;
            }
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public Vector add(Vector vector) {
        throw new RuntimeException("not implemented");
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public boolean equals(Object obj) {
        if (!(obj instanceof GF2mVector)) {
            return false;
        }
        GF2mVector gF2mVector = (GF2mVector) obj;
        if (this.field.equals(gF2mVector.field)) {
            return IntUtils.equals(this.vector, gF2mVector.vector);
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public byte[] getEncoded() {
        int i11 = 8;
        int i12 = 1;
        while (this.field.getDegree() > i11) {
            i12++;
            i11 += 8;
        }
        byte[] bArr = new byte[this.vector.length * i12];
        int i13 = 0;
        for (int i14 = 0; i14 < this.vector.length; i14++) {
            int i15 = 0;
            while (i15 < i11) {
                bArr[i13] = (byte) (this.vector[i14] >>> i15);
                i15 += 8;
                i13++;
            }
        }
        return bArr;
    }

    public GF2mField getField() {
        return this.field;
    }

    public int[] getIntArrayForm() {
        return IntUtils.clone(this.vector);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public int hashCode() {
        return Arrays.hashCode(this.vector) + (this.field.hashCode() * 31);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public boolean isZero() {
        for (int length = this.vector.length - 1; length >= 0; length--) {
            if (this.vector[length] != 0) {
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
            d.f("permutation size and vector size mismatch");
            return null;
        }
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < vector.length; i12++) {
            iArr[i12] = this.vector[vector[i12]];
        }
        return new GF2mVector(this.field, iArr);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < this.vector.length; i11++) {
            for (int i12 = 0; i12 < this.field.getDegree(); i12++) {
                stringBuffer.append(((1 << (i12 & 31)) & this.vector[i11]) != 0 ? '1' : '0');
            }
            stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }

    public GF2mVector(GF2mField gF2mField, int[] iArr) {
        this.field = gF2mField;
        this.length = iArr.length;
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (!gF2mField.isElementOfThisField(iArr[length])) {
                d.f("Element array is not specified over the given finite field.");
                throw null;
            }
        }
        this.vector = IntUtils.clone(iArr);
    }

    public GF2mVector(GF2mVector gF2mVector) {
        this.field = new GF2mField(gF2mVector.field);
        this.length = gF2mVector.length;
        this.vector = IntUtils.clone(gF2mVector.vector);
    }
}

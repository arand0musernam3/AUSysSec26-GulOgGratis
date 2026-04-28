package org.bouncycastle.math.ec.custom.sec;

import i4.a;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat128;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class SecT113FieldElement extends ECFieldElement.AbstractF2m {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected long[] f33398x;

    public SecT113FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            a.f("x value invalid for SecT113FieldElement");
            throw null;
        }
        this.f33398x = SecT113Field.fromBigInteger(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.add(this.f33398x, ((SecT113FieldElement) eCFieldElement).f33398x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.addOne(this.f33398x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT113FieldElement) {
            return Nat128.eq64(this.f33398x, ((SecT113FieldElement) obj).f33398x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecT113Field";
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return 113;
    }

    public int getK1() {
        return 9;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 113;
    }

    public int getRepresentation() {
        return 2;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public ECFieldElement halfTrace() {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.halfTrace(this.f33398x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public boolean hasFastTrace() {
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f33398x, 0, 2) ^ 113009;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.invert(this.f33398x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat128.isOne64(this.f33398x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat128.isZero64(this.f33398x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.multiply(this.f33398x, ((SecT113FieldElement) eCFieldElement).f33398x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f33398x;
        long[] jArr2 = ((SecT113FieldElement) eCFieldElement).f33398x;
        long[] jArr3 = ((SecT113FieldElement) eCFieldElement2).f33398x;
        long[] jArr4 = ((SecT113FieldElement) eCFieldElement3).f33398x;
        long[] jArrCreateExt64 = Nat128.createExt64();
        SecT113Field.multiplyAddToExt(jArr, jArr2, jArrCreateExt64);
        SecT113Field.multiplyAddToExt(jArr3, jArr4, jArrCreateExt64);
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.reduce(jArrCreateExt64, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.sqrt(this.f33398x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.square(this.f33398x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f33398x;
        long[] jArr2 = ((SecT113FieldElement) eCFieldElement).f33398x;
        long[] jArr3 = ((SecT113FieldElement) eCFieldElement2).f33398x;
        long[] jArrCreateExt64 = Nat128.createExt64();
        SecT113Field.squareAddToExt(jArr, jArrCreateExt64);
        SecT113Field.multiplyAddToExt(jArr2, jArr3, jArrCreateExt64);
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.reduce(jArrCreateExt64, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePow(int i11) {
        if (i11 < 1) {
            return this;
        }
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.squareN(this.f33398x, i11, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f33398x[0] & 1) != 0;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat128.toBigInteger64(this.f33398x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public int trace() {
        return SecT113Field.trace(this.f33398x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }

    public SecT113FieldElement() {
        this.f33398x = Nat128.create64();
    }

    public SecT113FieldElement(long[] jArr) {
        this.f33398x = jArr;
    }
}

package org.bouncycastle.math.ec;

import a40.d0;
import com.braze.h2;
import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ECFieldElement implements ECConstants {

    public static abstract class AbstractF2m extends ECFieldElement {
        public ECFieldElement halfTrace() {
            int fieldSize = getFieldSize();
            if ((fieldSize & 1) == 0) {
                h2.b("Half-trace only defined for odd m");
                return null;
            }
            int i11 = (fieldSize + 1) >>> 1;
            int iNumberOfLeadingZeros = 31 - Integers.numberOfLeadingZeros(i11);
            ECFieldElement eCFieldElementAdd = this;
            int i12 = 1;
            while (iNumberOfLeadingZeros > 0) {
                eCFieldElementAdd = eCFieldElementAdd.squarePow(i12 << 1).add(eCFieldElementAdd);
                iNumberOfLeadingZeros--;
                i12 = i11 >>> iNumberOfLeadingZeros;
                if ((i12 & 1) != 0) {
                    eCFieldElementAdd = eCFieldElementAdd.squarePow(2).add(this);
                }
            }
            return eCFieldElementAdd;
        }

        public boolean hasFastTrace() {
            return false;
        }

        public int trace() {
            int fieldSize = getFieldSize();
            int iNumberOfLeadingZeros = 31 - Integers.numberOfLeadingZeros(fieldSize);
            ECFieldElement eCFieldElementAdd = this;
            int i11 = 1;
            while (iNumberOfLeadingZeros > 0) {
                eCFieldElementAdd = eCFieldElementAdd.squarePow(i11).add(eCFieldElementAdd);
                iNumberOfLeadingZeros--;
                i11 = fieldSize >>> iNumberOfLeadingZeros;
                if ((i11 & 1) != 0) {
                    eCFieldElementAdd = eCFieldElementAdd.square().add(this);
                }
            }
            if (eCFieldElementAdd.isZero()) {
                return 0;
            }
            if (eCFieldElementAdd.isOne()) {
                return 1;
            }
            h2.b("Internal error in trace calculation");
            return 0;
        }
    }

    public static abstract class AbstractFp extends ECFieldElement {
    }

    public static class Fp extends AbstractFp {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        BigInteger f33363q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        BigInteger f33364r;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        BigInteger f33365x;

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this.f33363q = bigInteger;
            this.f33364r = bigInteger2;
            this.f33365x = bigInteger3;
        }

        public static BigInteger calculateResidue(BigInteger bigInteger) {
            int iBitLength = bigInteger.bitLength();
            if (iBitLength < 96 || bigInteger.shiftRight(iBitLength - 64).longValue() != -1) {
                return null;
            }
            return ECConstants.ONE.shiftLeft(iBitLength).subtract(bigInteger);
        }

        private ECFieldElement checkSqrt(ECFieldElement eCFieldElement) {
            if (eCFieldElement.square().equals(this)) {
                return eCFieldElement;
            }
            return null;
        }

        private BigInteger[] lucasSequence(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int iBitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigIntegerModMult = ECConstants.ONE;
            BigInteger bigIntegerModReduce = bigInteger;
            BigInteger bigIntegerModMult2 = bigIntegerModMult;
            BigInteger bigIntegerModReduce2 = ECConstants.TWO;
            BigInteger bigIntegerModMult3 = bigIntegerModMult2;
            for (int i11 = iBitLength - 1; i11 >= lowestSetBit + 1; i11--) {
                bigIntegerModMult = modMult(bigIntegerModMult, bigIntegerModMult3);
                if (bigInteger3.testBit(i11)) {
                    bigIntegerModMult3 = modMult(bigIntegerModMult, bigInteger2);
                    bigIntegerModMult2 = modMult(bigIntegerModMult2, bigIntegerModReduce);
                    bigIntegerModReduce2 = modReduce(bigIntegerModReduce.multiply(bigIntegerModReduce2).subtract(bigInteger.multiply(bigIntegerModMult)));
                    bigIntegerModReduce = modReduce(bigIntegerModReduce.multiply(bigIntegerModReduce).subtract(bigIntegerModMult3.shiftLeft(1)));
                } else {
                    BigInteger bigIntegerModReduce3 = modReduce(bigIntegerModMult2.multiply(bigIntegerModReduce2).subtract(bigIntegerModMult));
                    BigInteger bigIntegerModReduce4 = modReduce(bigIntegerModReduce.multiply(bigIntegerModReduce2).subtract(bigInteger.multiply(bigIntegerModMult)));
                    bigIntegerModReduce2 = modReduce(bigIntegerModReduce2.multiply(bigIntegerModReduce2).subtract(bigIntegerModMult.shiftLeft(1)));
                    bigIntegerModReduce = bigIntegerModReduce4;
                    bigIntegerModMult2 = bigIntegerModReduce3;
                    bigIntegerModMult3 = bigIntegerModMult;
                }
            }
            BigInteger bigIntegerModMult4 = modMult(bigIntegerModMult, bigIntegerModMult3);
            BigInteger bigIntegerModMult5 = modMult(bigIntegerModMult4, bigInteger2);
            BigInteger bigIntegerModReduce5 = modReduce(bigIntegerModMult2.multiply(bigIntegerModReduce2).subtract(bigIntegerModMult4));
            BigInteger bigIntegerModReduce6 = modReduce(bigIntegerModReduce.multiply(bigIntegerModReduce2).subtract(bigInteger.multiply(bigIntegerModMult4)));
            BigInteger bigIntegerModMult6 = modMult(bigIntegerModMult4, bigIntegerModMult5);
            for (int i12 = 1; i12 <= lowestSetBit; i12++) {
                bigIntegerModReduce5 = modMult(bigIntegerModReduce5, bigIntegerModReduce6);
                bigIntegerModReduce6 = modReduce(bigIntegerModReduce6.multiply(bigIntegerModReduce6).subtract(bigIntegerModMult6.shiftLeft(1)));
                bigIntegerModMult6 = modMult(bigIntegerModMult6, bigIntegerModMult6);
            }
            return new BigInteger[]{bigIntegerModReduce5, bigIntegerModReduce6};
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            return new Fp(this.f33363q, this.f33364r, modAdd(this.f33365x, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement addOne() {
            BigInteger bigIntegerAdd = this.f33365x.add(ECConstants.ONE);
            if (bigIntegerAdd.compareTo(this.f33363q) == 0) {
                bigIntegerAdd = ECConstants.ZERO;
            }
            return new Fp(this.f33363q, this.f33364r, bigIntegerAdd);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return new Fp(this.f33363q, this.f33364r, modMult(this.f33365x, modInverse(eCFieldElement.toBigInteger())));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Fp)) {
                return false;
            }
            Fp fp = (Fp) obj;
            return this.f33363q.equals(fp.f33363q) && this.f33365x.equals(fp.f33365x);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public String getFieldName() {
            return "Fp";
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public int getFieldSize() {
            return this.f33363q.bitLength();
        }

        public BigInteger getQ() {
            return this.f33363q;
        }

        public int hashCode() {
            return this.f33363q.hashCode() ^ this.f33365x.hashCode();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement invert() {
            return new Fp(this.f33363q, this.f33364r, modInverse(this.f33365x));
        }

        public BigInteger modAdd(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerAdd = bigInteger.add(bigInteger2);
            return bigIntegerAdd.compareTo(this.f33363q) >= 0 ? bigIntegerAdd.subtract(this.f33363q) : bigIntegerAdd;
        }

        public BigInteger modDouble(BigInteger bigInteger) {
            BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(1);
            return bigIntegerShiftLeft.compareTo(this.f33363q) >= 0 ? bigIntegerShiftLeft.subtract(this.f33363q) : bigIntegerShiftLeft;
        }

        public BigInteger modHalf(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f33363q.add(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public BigInteger modHalfAbs(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f33363q.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public BigInteger modInverse(BigInteger bigInteger) {
            return BigIntegers.modOddInverse(this.f33363q, bigInteger);
        }

        public BigInteger modMult(BigInteger bigInteger, BigInteger bigInteger2) {
            return modReduce(bigInteger.multiply(bigInteger2));
        }

        public BigInteger modReduce(BigInteger bigInteger) {
            if (this.f33364r == null) {
                return bigInteger.mod(this.f33363q);
            }
            boolean z11 = bigInteger.signum() < 0;
            if (z11) {
                bigInteger = bigInteger.abs();
            }
            int iBitLength = this.f33363q.bitLength();
            boolean zEquals = this.f33364r.equals(ECConstants.ONE);
            while (bigInteger.bitLength() > iBitLength + 1) {
                BigInteger bigIntegerShiftRight = bigInteger.shiftRight(iBitLength);
                BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftRight.shiftLeft(iBitLength));
                if (!zEquals) {
                    bigIntegerShiftRight = bigIntegerShiftRight.multiply(this.f33364r);
                }
                bigInteger = bigIntegerShiftRight.add(bigIntegerSubtract);
            }
            while (bigInteger.compareTo(this.f33363q) >= 0) {
                bigInteger = bigInteger.subtract(this.f33363q);
            }
            return (!z11 || bigInteger.signum() == 0) ? bigInteger : this.f33363q.subtract(bigInteger);
        }

        public BigInteger modSubtract(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
            return bigIntegerSubtract.signum() < 0 ? bigIntegerSubtract.add(this.f33363q) : bigIntegerSubtract;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            return new Fp(this.f33363q, this.f33364r, modMult(this.f33365x, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            BigInteger bigInteger = this.f33365x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger4 = eCFieldElement3.toBigInteger();
            return new Fp(this.f33363q, this.f33364r, modReduce(bigInteger.multiply(bigInteger2).subtract(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            BigInteger bigInteger = this.f33365x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger4 = eCFieldElement3.toBigInteger();
            return new Fp(this.f33363q, this.f33364r, modReduce(bigInteger.multiply(bigInteger2).add(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement negate() {
            if (this.f33365x.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.f33363q;
            return new Fp(bigInteger, this.f33364r, bigInteger.subtract(this.f33365x));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement sqrt() {
            if (isZero() || isOne()) {
                return this;
            }
            if (!this.f33363q.testBit(0)) {
                d0.k("not done yet");
                return null;
            }
            boolean zTestBit = this.f33363q.testBit(1);
            BigInteger bigInteger = this.f33363q;
            if (zTestBit) {
                BigInteger bigIntegerAdd = bigInteger.shiftRight(2).add(ECConstants.ONE);
                BigInteger bigInteger2 = this.f33363q;
                return checkSqrt(new Fp(bigInteger2, this.f33364r, this.f33365x.modPow(bigIntegerAdd, bigInteger2)));
            }
            if (bigInteger.testBit(2)) {
                BigInteger bigIntegerModPow = this.f33365x.modPow(this.f33363q.shiftRight(3), this.f33363q);
                BigInteger bigIntegerModMult = modMult(bigIntegerModPow, this.f33365x);
                boolean zEquals = modMult(bigIntegerModMult, bigIntegerModPow).equals(ECConstants.ONE);
                BigInteger bigInteger3 = this.f33363q;
                if (zEquals) {
                    return checkSqrt(new Fp(bigInteger3, this.f33364r, bigIntegerModMult));
                }
                return checkSqrt(new Fp(this.f33363q, this.f33364r, modMult(bigIntegerModMult, ECConstants.TWO.modPow(bigInteger3.shiftRight(2), this.f33363q))));
            }
            BigInteger bigIntegerShiftRight = this.f33363q.shiftRight(1);
            BigInteger bigIntegerModPow2 = this.f33365x.modPow(bigIntegerShiftRight, this.f33363q);
            BigInteger bigInteger4 = ECConstants.ONE;
            if (!bigIntegerModPow2.equals(bigInteger4)) {
                return null;
            }
            BigInteger bigInteger5 = this.f33365x;
            BigInteger bigIntegerModDouble = modDouble(modDouble(bigInteger5));
            BigInteger bigIntegerAdd2 = bigIntegerShiftRight.add(bigInteger4);
            BigInteger bigIntegerSubtract = this.f33363q.subtract(bigInteger4);
            Random random = new Random();
            while (true) {
                BigInteger bigInteger6 = new BigInteger(this.f33363q.bitLength(), random);
                if (bigInteger6.compareTo(this.f33363q) < 0 && modReduce(bigInteger6.multiply(bigInteger6).subtract(bigIntegerModDouble)).modPow(bigIntegerShiftRight, this.f33363q).equals(bigIntegerSubtract)) {
                    BigInteger[] bigIntegerArrLucasSequence = lucasSequence(bigInteger6, bigInteger5, bigIntegerAdd2);
                    BigInteger bigInteger7 = bigIntegerArrLucasSequence[0];
                    BigInteger bigInteger8 = bigIntegerArrLucasSequence[1];
                    if (modMult(bigInteger8, bigInteger8).equals(bigIntegerModDouble)) {
                        return new Fp(this.f33363q, this.f33364r, modHalfAbs(bigInteger8));
                    }
                    if (!bigInteger7.equals(ECConstants.ONE) && !bigInteger7.equals(bigIntegerSubtract)) {
                        return null;
                    }
                }
            }
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement square() {
            BigInteger bigInteger = this.f33363q;
            BigInteger bigInteger2 = this.f33364r;
            BigInteger bigInteger3 = this.f33365x;
            return new Fp(bigInteger, bigInteger2, modMult(bigInteger3, bigInteger3));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = this.f33365x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            return new Fp(this.f33363q, this.f33364r, modReduce(bigInteger.multiply(bigInteger).subtract(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = this.f33365x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            return new Fp(this.f33363q, this.f33364r, modReduce(bigInteger.multiply(bigInteger).add(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return new Fp(this.f33363q, this.f33364r, modSubtract(this.f33365x, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f33365x;
        }
    }

    public abstract ECFieldElement add(ECFieldElement eCFieldElement);

    public abstract ECFieldElement addOne();

    public int bitLength() {
        return toBigInteger().bitLength();
    }

    public abstract ECFieldElement divide(ECFieldElement eCFieldElement);

    public void encodeTo(byte[] bArr, int i11) {
        BigIntegers.asUnsignedByteArray(toBigInteger(), bArr, i11, getEncodedLength());
    }

    public byte[] getEncoded() {
        return BigIntegers.asUnsignedByteArray(getEncodedLength(), toBigInteger());
    }

    public int getEncodedLength() {
        return (getFieldSize() + 7) / 8;
    }

    public abstract String getFieldName();

    public abstract int getFieldSize();

    public abstract ECFieldElement invert();

    public boolean isOne() {
        return bitLength() == 1;
    }

    public boolean isZero() {
        return toBigInteger().signum() == 0;
    }

    public abstract ECFieldElement multiply(ECFieldElement eCFieldElement);

    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiply(eCFieldElement).subtract(eCFieldElement2.multiply(eCFieldElement3));
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiply(eCFieldElement).add(eCFieldElement2.multiply(eCFieldElement3));
    }

    public abstract ECFieldElement negate();

    public abstract ECFieldElement sqrt();

    public abstract ECFieldElement square();

    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return square().subtract(eCFieldElement.multiply(eCFieldElement2));
    }

    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return square().add(eCFieldElement.multiply(eCFieldElement2));
    }

    public ECFieldElement squarePow(int i11) {
        ECFieldElement eCFieldElementSquare = this;
        for (int i12 = 0; i12 < i11; i12++) {
            eCFieldElementSquare = eCFieldElementSquare.square();
        }
        return eCFieldElementSquare;
    }

    public abstract ECFieldElement subtract(ECFieldElement eCFieldElement);

    public boolean testBitZero() {
        return toBigInteger().testBit(0);
    }

    public abstract BigInteger toBigInteger();

    public String toString() {
        return toBigInteger().toString(16);
    }

    public static class F2m extends AbstractF2m {
        public static final int GNB = 1;
        public static final int PPB = 3;
        public static final int TPB = 2;

        /* JADX INFO: renamed from: ks, reason: collision with root package name */
        private int[] f33360ks;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f33361m;
        private int representation;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        LongArray f33362x;

        public F2m(int i11, int[] iArr, LongArray longArray) {
            this.f33361m = i11;
            this.representation = iArr.length == 1 ? 2 : 3;
            this.f33360ks = iArr;
            this.f33362x = longArray;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            LongArray longArray = (LongArray) this.f33362x.clone();
            longArray.addShiftedByWords(((F2m) eCFieldElement).f33362x, 0);
            return new F2m(this.f33361m, this.f33360ks, longArray);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement addOne() {
            return new F2m(this.f33361m, this.f33360ks, this.f33362x.addOne());
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public int bitLength() {
            return this.f33362x.degree();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return multiply(eCFieldElement.invert());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof F2m)) {
                return false;
            }
            F2m f2m = (F2m) obj;
            return this.f33361m == f2m.f33361m && this.representation == f2m.representation && Arrays.areEqual(this.f33360ks, f2m.f33360ks) && this.f33362x.equals(f2m.f33362x);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public String getFieldName() {
            return "F2m";
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public int getFieldSize() {
            return this.f33361m;
        }

        public int getK1() {
            return this.f33360ks[0];
        }

        public int getK2() {
            int[] iArr = this.f33360ks;
            if (iArr.length >= 2) {
                return iArr[1];
            }
            return 0;
        }

        public int getK3() {
            int[] iArr = this.f33360ks;
            if (iArr.length >= 3) {
                return iArr[2];
            }
            return 0;
        }

        public int getM() {
            return this.f33361m;
        }

        public int getRepresentation() {
            return this.representation;
        }

        public int hashCode() {
            return (this.f33362x.hashCode() ^ this.f33361m) ^ Arrays.hashCode(this.f33360ks);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement invert() {
            int i11 = this.f33361m;
            int[] iArr = this.f33360ks;
            return new F2m(i11, iArr, this.f33362x.modInverse(i11, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public boolean isOne() {
            return this.f33362x.isOne();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public boolean isZero() {
            return this.f33362x.isZero();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            int i11 = this.f33361m;
            int[] iArr = this.f33360ks;
            return new F2m(i11, iArr, this.f33362x.modMultiply(((F2m) eCFieldElement).f33362x, i11, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            LongArray longArray = this.f33362x;
            LongArray longArray2 = ((F2m) eCFieldElement).f33362x;
            LongArray longArray3 = ((F2m) eCFieldElement2).f33362x;
            LongArray longArray4 = ((F2m) eCFieldElement3).f33362x;
            LongArray longArrayMultiply = longArray.multiply(longArray2, this.f33361m, this.f33360ks);
            LongArray longArrayMultiply2 = longArray3.multiply(longArray4, this.f33361m, this.f33360ks);
            if (longArrayMultiply == longArray || longArrayMultiply == longArray2) {
                longArrayMultiply = (LongArray) longArrayMultiply.clone();
            }
            longArrayMultiply.addShiftedByWords(longArrayMultiply2, 0);
            longArrayMultiply.reduce(this.f33361m, this.f33360ks);
            return new F2m(this.f33361m, this.f33360ks, longArrayMultiply);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement sqrt() {
            return (this.f33362x.isZero() || this.f33362x.isOne()) ? this : squarePow(this.f33361m - 1);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement square() {
            int i11 = this.f33361m;
            int[] iArr = this.f33360ks;
            return new F2m(i11, iArr, this.f33362x.modSquare(i11, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return squarePlusProduct(eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            LongArray longArray = this.f33362x;
            LongArray longArray2 = ((F2m) eCFieldElement).f33362x;
            LongArray longArray3 = ((F2m) eCFieldElement2).f33362x;
            LongArray longArraySquare = longArray.square(this.f33361m, this.f33360ks);
            LongArray longArrayMultiply = longArray2.multiply(longArray3, this.f33361m, this.f33360ks);
            if (longArraySquare == longArray) {
                longArraySquare = (LongArray) longArraySquare.clone();
            }
            longArraySquare.addShiftedByWords(longArrayMultiply, 0);
            longArraySquare.reduce(this.f33361m, this.f33360ks);
            return new F2m(this.f33361m, this.f33360ks, longArraySquare);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squarePow(int i11) {
            if (i11 < 1) {
                return this;
            }
            int i12 = this.f33361m;
            int[] iArr = this.f33360ks;
            return new F2m(i12, iArr, this.f33362x.modSquareN(i11, i12, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return add(eCFieldElement);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public boolean testBitZero() {
            return this.f33362x.testBitZero();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f33362x.toBigInteger();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement negate() {
            return this;
        }
    }
}

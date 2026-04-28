package org.bouncycastle.math.ec;

import com.braze.h2;
import i4.a;
import j4.s;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Random;
import java.util.Set;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.endo.ECEndomorphism;
import org.bouncycastle.math.ec.endo.GLVEndomorphism;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.FiniteFields;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ECCurve {
    public static final int COORD_AFFINE = 0;
    public static final int COORD_HOMOGENEOUS = 1;
    public static final int COORD_JACOBIAN = 2;
    public static final int COORD_JACOBIAN_CHUDNOVSKY = 3;
    public static final int COORD_JACOBIAN_MODIFIED = 4;
    public static final int COORD_LAMBDA_AFFINE = 5;
    public static final int COORD_LAMBDA_PROJECTIVE = 6;
    public static final int COORD_SKEWED = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ECFieldElement f33351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ECFieldElement f33352b;
    protected BigInteger cofactor;
    protected FiniteField field;
    protected BigInteger order;
    protected int coord = 0;
    protected ECEndomorphism endomorphism = null;
    protected ECMultiplier multiplier = null;

    public static abstract class AbstractF2m extends ECCurve {

        /* JADX INFO: renamed from: si, reason: collision with root package name */
        private BigInteger[] f33353si;

        public AbstractF2m(int i11, int i12, int i13, int i14) {
            super(buildField(i11, i12, i13, i14));
            this.f33353si = null;
            if (Properties.isOverrideSet("org.bouncycastle.ec.disable")) {
                h2.a("F2M disabled by \"org.bouncycastle.ec.disable\"");
                throw null;
            }
            if (Properties.isOverrideSet("org.bouncycastle.ec.disable_f2m")) {
                h2.a("F2M disabled by \"org.bouncycastle.ec.disable_f2m\"");
                throw null;
            }
        }

        private static FiniteField buildField(int i11, int i12, int i13, int i14) {
            if (i11 <= Properties.asInteger("org.bouncycastle.ec.max_f2m_field_size", 1142)) {
                return FiniteFields.getBinaryExtensionField((i13 | i14) == 0 ? new int[]{0, i12, i11} : new int[]{0, i12, i13, i14, i11});
            }
            a.f(s.f(i11, "field size out of range: "));
            return null;
        }

        private static BigInteger implRandomFieldElementMult(SecureRandom secureRandom, int i11) {
            BigInteger bigIntegerCreateRandomBigInteger;
            do {
                bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(i11, secureRandom);
            } while (bigIntegerCreateRandomBigInteger.signum() <= 0);
            return bigIntegerCreateRandomBigInteger;
        }

        public static BigInteger inverse(int i11, int[] iArr, BigInteger bigInteger) {
            return new LongArray(bigInteger).modInverse(i11, iArr).toBigInteger();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2) {
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(bigInteger);
            ECFieldElement eCFieldElementFromBigInteger2 = fromBigInteger(bigInteger2);
            int coordinateSystem = getCoordinateSystem();
            if (coordinateSystem == 5 || coordinateSystem == 6) {
                if (!eCFieldElementFromBigInteger.isZero()) {
                    eCFieldElementFromBigInteger2 = eCFieldElementFromBigInteger2.divide(eCFieldElementFromBigInteger).add(eCFieldElementFromBigInteger);
                } else if (!eCFieldElementFromBigInteger2.square().equals(getB())) {
                    a.h();
                    return null;
                }
            }
            return createRawPoint(eCFieldElementFromBigInteger, eCFieldElementFromBigInteger2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint decompressPoint(int i11, BigInteger bigInteger) {
            ECFieldElement eCFieldElementAdd;
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(bigInteger);
            if (eCFieldElementFromBigInteger.isZero()) {
                eCFieldElementAdd = getB().sqrt();
            } else {
                ECFieldElement eCFieldElementSolveQuadraticEquation = solveQuadraticEquation(eCFieldElementFromBigInteger.square().invert().multiply(getB()).add(getA()).add(eCFieldElementFromBigInteger));
                if (eCFieldElementSolveQuadraticEquation != null) {
                    if (eCFieldElementSolveQuadraticEquation.testBitZero() != (i11 == 1)) {
                        eCFieldElementSolveQuadraticEquation = eCFieldElementSolveQuadraticEquation.addOne();
                    }
                    int coordinateSystem = getCoordinateSystem();
                    eCFieldElementAdd = (coordinateSystem == 5 || coordinateSystem == 6) ? eCFieldElementSolveQuadraticEquation.add(eCFieldElementFromBigInteger) : eCFieldElementSolveQuadraticEquation.multiply(eCFieldElementFromBigInteger);
                } else {
                    eCFieldElementAdd = null;
                }
            }
            if (eCFieldElementAdd != null) {
                return createRawPoint(eCFieldElementFromBigInteger, eCFieldElementAdd);
            }
            a.f("Invalid point compression");
            return null;
        }

        public synchronized BigInteger[] getSi() {
            try {
                if (this.f33353si == null) {
                    this.f33353si = Tnaf.getSi(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.f33353si;
        }

        public boolean isKoblitz() {
            if (this.order == null || this.cofactor == null || !this.f33352b.isOne()) {
                return false;
            }
            return this.f33351a.isZero() || this.f33351a.isOne();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean isValidFieldElement(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= getFieldSize();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
            return fromBigInteger(BigIntegers.createRandomBigInteger(getFieldSize(), secureRandom));
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
            int fieldSize = getFieldSize();
            return fromBigInteger(implRandomFieldElementMult(secureRandom, fieldSize)).multiply(fromBigInteger(implRandomFieldElementMult(secureRandom, fieldSize)));
        }

        public ECFieldElement solveQuadraticEquation(ECFieldElement eCFieldElement) {
            ECFieldElement eCFieldElementAdd;
            ECFieldElement.AbstractF2m abstractF2m = (ECFieldElement.AbstractF2m) eCFieldElement;
            boolean zHasFastTrace = abstractF2m.hasFastTrace();
            if (zHasFastTrace && abstractF2m.trace() != 0) {
                return null;
            }
            int fieldSize = getFieldSize();
            if ((fieldSize & 1) != 0) {
                ECFieldElement eCFieldElementHalfTrace = abstractF2m.halfTrace();
                if (zHasFastTrace || eCFieldElementHalfTrace.square().add(eCFieldElementHalfTrace).add(eCFieldElement).isZero()) {
                    return eCFieldElementHalfTrace;
                }
                return null;
            }
            if (eCFieldElement.isZero()) {
                return eCFieldElement;
            }
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(ECConstants.ZERO);
            Random random = new Random();
            do {
                ECFieldElement eCFieldElementFromBigInteger2 = fromBigInteger(new BigInteger(fieldSize, random));
                ECFieldElement eCFieldElementAdd2 = eCFieldElement;
                eCFieldElementAdd = eCFieldElementFromBigInteger;
                for (int i11 = 1; i11 < fieldSize; i11++) {
                    ECFieldElement eCFieldElementSquare = eCFieldElementAdd2.square();
                    eCFieldElementAdd = eCFieldElementAdd.square().add(eCFieldElementSquare.multiply(eCFieldElementFromBigInteger2));
                    eCFieldElementAdd2 = eCFieldElementSquare.add(eCFieldElement);
                }
                if (!eCFieldElementAdd2.isZero()) {
                    return null;
                }
            } while (eCFieldElementAdd.square().add(eCFieldElementAdd).isZero());
            return eCFieldElementAdd;
        }
    }

    public static abstract class AbstractFp extends ECCurve {
        public AbstractFp(BigInteger bigInteger) {
            super(FiniteFields.getPrimeField(bigInteger));
        }

        private static BigInteger implRandomFieldElement(SecureRandom secureRandom, BigInteger bigInteger) {
            BigInteger bigIntegerCreateRandomBigInteger;
            do {
                bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(bigInteger.bitLength(), secureRandom);
            } while (bigIntegerCreateRandomBigInteger.compareTo(bigInteger) >= 0);
            return bigIntegerCreateRandomBigInteger;
        }

        private static BigInteger implRandomFieldElementMult(SecureRandom secureRandom, BigInteger bigInteger) {
            while (true) {
                BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(bigInteger.bitLength(), secureRandom);
                if (bigIntegerCreateRandomBigInteger.signum() > 0 && bigIntegerCreateRandomBigInteger.compareTo(bigInteger) < 0) {
                    return bigIntegerCreateRandomBigInteger;
                }
            }
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint decompressPoint(int i11, BigInteger bigInteger) {
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(bigInteger);
            ECFieldElement eCFieldElementSqrt = eCFieldElementFromBigInteger.square().add(this.f33351a).multiply(eCFieldElementFromBigInteger).add(this.f33352b).sqrt();
            if (eCFieldElementSqrt == null) {
                a.f("Invalid point compression");
                return null;
            }
            if (eCFieldElementSqrt.testBitZero() != (i11 == 1)) {
                eCFieldElementSqrt = eCFieldElementSqrt.negate();
            }
            return createRawPoint(eCFieldElementFromBigInteger, eCFieldElementSqrt);
        }

        public BigInteger getQ() {
            return getField().getCharacteristic();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean isValidFieldElement(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(getQ()) < 0;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
            BigInteger q7 = getQ();
            return fromBigInteger(implRandomFieldElement(secureRandom, q7)).multiply(fromBigInteger(implRandomFieldElement(secureRandom, q7)));
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
            BigInteger q7 = getQ();
            return fromBigInteger(implRandomFieldElementMult(secureRandom, q7)).multiply(fromBigInteger(implRandomFieldElementMult(secureRandom, q7)));
        }
    }

    public class Config {
        protected int coord;
        protected ECEndomorphism endomorphism;
        protected ECMultiplier multiplier;

        public Config(int i11, ECEndomorphism eCEndomorphism, ECMultiplier eCMultiplier) {
            this.coord = i11;
            this.endomorphism = eCEndomorphism;
            this.multiplier = eCMultiplier;
        }

        public ECCurve create() {
            String str;
            if (ECCurve.this.supportsCoordinateSystem(this.coord)) {
                ECCurve eCCurveCloneCurve = ECCurve.this.cloneCurve();
                if (eCCurveCloneCurve != ECCurve.this) {
                    synchronized (eCCurveCloneCurve) {
                        eCCurveCloneCurve.coord = this.coord;
                        eCCurveCloneCurve.endomorphism = this.endomorphism;
                        eCCurveCloneCurve.multiplier = this.multiplier;
                    }
                    return eCCurveCloneCurve;
                }
                str = "implementation returned current curve";
            } else {
                str = "unsupported coordinate system";
            }
            h2.b(str);
            return null;
        }

        public Config setCoordinateSystem(int i11) {
            this.coord = i11;
            return this;
        }

        public Config setEndomorphism(ECEndomorphism eCEndomorphism) {
            this.endomorphism = eCEndomorphism;
            return this;
        }

        public Config setMultiplier(ECMultiplier eCMultiplier) {
            this.multiplier = eCMultiplier;
            return this;
        }
    }

    public ECCurve(FiniteField finiteField) {
        this.field = finiteField;
    }

    public static int[] getAllCoordinateSystems() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getNumberOfIterations(int i11, int i12) {
        if (i11 >= 1536) {
            if (i12 <= 100) {
                return 3;
            }
            if (i12 <= 128) {
                return 4;
            }
            return org.bouncycastle.jcajce.provider.asymmetric.a.a(i12, 127, 2, 4);
        }
        if (i11 >= 1024) {
            if (i12 <= 100) {
                return 4;
            }
            if (i12 <= 112) {
                return 5;
            }
            return org.bouncycastle.jcajce.provider.asymmetric.a.a(i12, 111, 2, 5);
        }
        if (i11 < 512) {
            if (i12 <= 80) {
                return 40;
            }
            return org.bouncycastle.jcajce.provider.asymmetric.a.a(i12, 79, 2, 40);
        }
        if (i12 <= 80) {
            return 5;
        }
        if (i12 <= 100) {
            return 7;
        }
        return org.bouncycastle.jcajce.provider.asymmetric.a.a(i12, 99, 2, 7);
    }

    public void checkPoint(ECPoint eCPoint) {
        if (eCPoint == null || this != eCPoint.getCurve()) {
            a.f("'point' must be non-null and on this curve");
        }
    }

    public void checkPoints(ECPoint[] eCPointArr, int i11, int i12) {
        String str;
        if (eCPointArr == null) {
            str = "'points' cannot be null";
        } else {
            if (i11 >= 0 && i12 >= 0 && i11 <= eCPointArr.length - i12) {
                for (int i13 = 0; i13 < i12; i13++) {
                    ECPoint eCPoint = eCPointArr[i11 + i13];
                    if (eCPoint != null && this != eCPoint.getCurve()) {
                        str = "'points' entries must be null or on this curve";
                    }
                }
                return;
            }
            str = "invalid range specified for 'points'";
        }
        a.f(str);
    }

    public abstract ECCurve cloneCurve();

    public synchronized Config configure() {
        return new Config(this.coord, this.endomorphism, this.multiplier);
    }

    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i11, final int i12) {
        final int fieldElementEncodingLength = getFieldElementEncodingLength();
        final byte[] bArr = new byte[i12 * fieldElementEncodingLength * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            ECPoint eCPoint = eCPointArr[i11 + i14];
            eCPoint.getRawXCoord().encodeTo(bArr, i13);
            int i15 = i13 + fieldElementEncodingLength;
            eCPoint.getRawYCoord().encodeTo(bArr, i15);
            i13 = i15 + fieldElementEncodingLength;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.ECCurve.1
            private ECPoint createPoint(byte[] bArr2, byte[] bArr3) {
                ECCurve eCCurve = ECCurve.this;
                return eCCurve.createRawPoint(eCCurve.fromBigInteger(new BigInteger(1, bArr2)), ECCurve.this.fromBigInteger(new BigInteger(1, bArr3)));
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i12;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i16) {
                int i17;
                int i18 = fieldElementEncodingLength;
                byte[] bArr2 = new byte[i18];
                byte[] bArr3 = new byte[i18];
                int i19 = 0;
                for (int i21 = 0; i21 < i12; i21++) {
                    int i22 = ((i21 ^ i16) - 1) >> 31;
                    int i23 = 0;
                    while (true) {
                        i17 = fieldElementEncodingLength;
                        if (i23 < i17) {
                            byte b8 = bArr2[i23];
                            byte[] bArr4 = bArr;
                            bArr2[i23] = (byte) (b8 ^ (bArr4[i19 + i23] & i22));
                            bArr3[i23] = (byte) ((bArr4[(i17 + i19) + i23] & i22) ^ bArr3[i23]);
                            i23++;
                        }
                    }
                    i19 += i17 * 2;
                }
                return createPoint(bArr2, bArr3);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i16) {
                int i17 = fieldElementEncodingLength;
                byte[] bArr2 = new byte[i17];
                byte[] bArr3 = new byte[i17];
                int i18 = i16 * i17 * 2;
                int i19 = 0;
                while (true) {
                    int i21 = fieldElementEncodingLength;
                    if (i19 >= i21) {
                        return createPoint(bArr2, bArr3);
                    }
                    byte[] bArr4 = bArr;
                    bArr2[i19] = bArr4[i18 + i19];
                    bArr3[i19] = bArr4[i21 + i18 + i19];
                    i19++;
                }
            }
        };
    }

    public ECMultiplier createDefaultMultiplier() {
        ECEndomorphism eCEndomorphism = this.endomorphism;
        return eCEndomorphism instanceof GLVEndomorphism ? new GLVMultiplier(this, (GLVEndomorphism) eCEndomorphism) : new WNafL2RMultiplier();
    }

    public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2) {
        return createRawPoint(fromBigInteger(bigInteger), fromBigInteger(bigInteger2));
    }

    public abstract ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2);

    public abstract ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr);

    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.bouncycastle.math.ec.ECPoint decodePoint(byte[] r8) {
        /*
            r7 = this;
            int r0 = r7.getFieldElementEncodingLength()
            r1 = 0
            r2 = r8[r1]
            r3 = 1
            if (r2 == 0) goto L82
            r4 = 2
            if (r2 == r4) goto L66
            r4 = 3
            if (r2 == r4) goto L66
            r4 = 4
            if (r2 == r4) goto L4e
            r4 = 6
            r5 = 7
            if (r2 == r4) goto L27
            if (r2 != r5) goto L1a
            goto L27
        L1a:
            r8 = 16
            java.lang.String r8 = java.lang.Integer.toString(r2, r8)
            java.lang.String r0 = "Invalid point encoding 0x"
            j4.d.t(r8, r0)
        L25:
            r8 = 0
            return r8
        L27:
            int r4 = r8.length
            int r6 = r0 * 2
            int r6 = r6 + r3
            if (r4 != r6) goto L4b
            java.math.BigInteger r4 = org.bouncycastle.util.BigIntegers.fromUnsignedByteArray(r8, r3, r0)
            int r6 = r0 + 1
            java.math.BigInteger r8 = org.bouncycastle.util.BigIntegers.fromUnsignedByteArray(r8, r6, r0)
            boolean r0 = r8.testBit(r1)
            if (r2 != r5) goto L3e
            r1 = r3
        L3e:
            if (r0 != r1) goto L45
            org.bouncycastle.math.ec.ECPoint r8 = r7.validatePoint(r4, r8)
            goto L89
        L45:
            java.lang.String r8 = "Inconsistent Y coordinate in hybrid encoding"
        L47:
            i4.a.f(r8)
            goto L25
        L4b:
            java.lang.String r8 = "Incorrect length for hybrid encoding"
            goto L47
        L4e:
            int r1 = r8.length
            int r4 = r0 * 2
            int r4 = r4 + r3
            if (r1 != r4) goto L63
            java.math.BigInteger r1 = org.bouncycastle.util.BigIntegers.fromUnsignedByteArray(r8, r3, r0)
            int r3 = r0 + 1
            java.math.BigInteger r8 = org.bouncycastle.util.BigIntegers.fromUnsignedByteArray(r8, r3, r0)
            org.bouncycastle.math.ec.ECPoint r8 = r7.validatePoint(r1, r8)
            goto L89
        L63:
            java.lang.String r8 = "Incorrect length for uncompressed encoding"
            goto L47
        L66:
            int r1 = r8.length
            int r4 = r0 + 1
            if (r1 != r4) goto L7f
            r1 = r2 & 1
            java.math.BigInteger r8 = org.bouncycastle.util.BigIntegers.fromUnsignedByteArray(r8, r3, r0)
            org.bouncycastle.math.ec.ECPoint r8 = r7.decompressPoint(r1, r8)
            boolean r0 = r8.implIsValid(r3, r3)
            if (r0 == 0) goto L7c
            goto L89
        L7c:
            java.lang.String r8 = "Invalid point"
            goto L47
        L7f:
            java.lang.String r8 = "Incorrect length for compressed encoding"
            goto L47
        L82:
            int r8 = r8.length
            if (r8 != r3) goto L96
            org.bouncycastle.math.ec.ECPoint r8 = r7.getInfinity()
        L89:
            if (r2 == 0) goto L95
            boolean r0 = r8.isInfinity()
            if (r0 != 0) goto L92
            goto L95
        L92:
            java.lang.String r8 = "Invalid infinity encoding"
            goto L47
        L95:
            return r8
        L96:
            java.lang.String r8 = "Incorrect length for infinity encoding"
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.math.ec.ECCurve.decodePoint(byte[]):org.bouncycastle.math.ec.ECPoint");
    }

    public abstract ECPoint decompressPoint(int i11, BigInteger bigInteger);

    public boolean equals(ECCurve eCCurve) {
        if (this != eCCurve) {
            return eCCurve != null && getField().equals(eCCurve.getField()) && getA().toBigInteger().equals(eCCurve.getA().toBigInteger()) && getB().toBigInteger().equals(eCCurve.getB().toBigInteger());
        }
        return true;
    }

    public abstract ECFieldElement fromBigInteger(BigInteger bigInteger);

    public ECFieldElement getA() {
        return this.f33351a;
    }

    public int getAffinePointEncodingLength(boolean z11) {
        int fieldElementEncodingLength = getFieldElementEncodingLength();
        return z11 ? fieldElementEncodingLength + 1 : (fieldElementEncodingLength * 2) + 1;
    }

    public ECFieldElement getB() {
        return this.f33352b;
    }

    public BigInteger getCofactor() {
        return this.cofactor;
    }

    public int getCoordinateSystem() {
        return this.coord;
    }

    public ECEndomorphism getEndomorphism() {
        return this.endomorphism;
    }

    public FiniteField getField() {
        return this.field;
    }

    public int getFieldElementEncodingLength() {
        return (getFieldSize() + 7) / 8;
    }

    public abstract int getFieldSize();

    public abstract ECPoint getInfinity();

    public ECMultiplier getMultiplier() {
        if (this.multiplier == null) {
            this.multiplier = createDefaultMultiplier();
        }
        return this.multiplier;
    }

    public BigInteger getOrder() {
        return this.order;
    }

    public PreCompInfo getPreCompInfo(ECPoint eCPoint, String str) {
        Hashtable hashtable;
        PreCompInfo preCompInfo;
        checkPoint(eCPoint);
        synchronized (eCPoint) {
            hashtable = eCPoint.preCompTable;
        }
        if (hashtable == null) {
            return null;
        }
        synchronized (hashtable) {
            preCompInfo = (PreCompInfo) hashtable.get(str);
        }
        return preCompInfo;
    }

    public int hashCode() {
        return (getField().hashCode() ^ Integers.rotateLeft(getA().toBigInteger().hashCode(), 8)) ^ Integers.rotateLeft(getB().toBigInteger().hashCode(), 16);
    }

    public ECPoint importPoint(ECPoint eCPoint) {
        if (this == eCPoint.getCurve()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return getInfinity();
        }
        ECPoint eCPointNormalize = eCPoint.normalize();
        return createPoint(eCPointNormalize.getXCoord().toBigInteger(), eCPointNormalize.getYCoord().toBigInteger());
    }

    public abstract boolean isValidFieldElement(BigInteger bigInteger);

    public void normalizeAll(ECPoint[] eCPointArr, int i11, int i12, ECFieldElement eCFieldElement) {
        checkPoints(eCPointArr, i11, i12);
        int coordinateSystem = getCoordinateSystem();
        if (coordinateSystem == 0 || coordinateSystem == 5) {
            if (eCFieldElement == null) {
                return;
            }
            a.f("'iso' not valid for affine coordinates");
            return;
        }
        ECFieldElement[] eCFieldElementArr = new ECFieldElement[i12];
        int[] iArr = new int[i12];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = i11 + i14;
            ECPoint eCPoint = eCPointArr[i15];
            if (eCPoint != null && (eCFieldElement != null || !eCPoint.isNormalized())) {
                eCFieldElementArr[i13] = eCPoint.getZCoord(0);
                iArr[i13] = i15;
                i13++;
            }
        }
        if (i13 == 0) {
            return;
        }
        ECAlgorithms.montgomeryTrick(eCFieldElementArr, 0, i13, eCFieldElement);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = iArr[i16];
            eCPointArr[i17] = eCPointArr[i17].normalize(eCFieldElementArr[i16]);
        }
    }

    public PreCompInfo precompute(ECPoint eCPoint, String str, PreCompCallback preCompCallback) {
        Hashtable hashtable;
        PreCompInfo preCompInfoPrecompute;
        checkPoint(eCPoint);
        synchronized (eCPoint) {
            try {
                hashtable = eCPoint.preCompTable;
                if (hashtable == null) {
                    hashtable = new Hashtable(4);
                    eCPoint.preCompTable = hashtable;
                }
            } finally {
            }
        }
        synchronized (hashtable) {
            try {
                PreCompInfo preCompInfo = (PreCompInfo) hashtable.get(str);
                preCompInfoPrecompute = preCompCallback.precompute(preCompInfo);
                if (preCompInfoPrecompute != preCompInfo) {
                    hashtable.put(str, preCompInfoPrecompute);
                }
            } finally {
            }
        }
        return preCompInfoPrecompute;
    }

    public abstract ECFieldElement randomFieldElement(SecureRandom secureRandom);

    public abstract ECFieldElement randomFieldElementMult(SecureRandom secureRandom);

    public boolean supportsCoordinateSystem(int i11) {
        return i11 == 0;
    }

    public ECPoint validatePoint(BigInteger bigInteger, BigInteger bigInteger2) {
        ECPoint eCPointCreatePoint = createPoint(bigInteger, bigInteger2);
        if (eCPointCreatePoint.isValid()) {
            return eCPointCreatePoint;
        }
        a.f("Invalid point coordinates");
        return null;
    }

    public static class F2m extends AbstractF2m {
        private static final int F2M_DEFAULT_COORDS = 6;
        private ECPoint.F2m infinity;

        /* JADX INFO: renamed from: k1, reason: collision with root package name */
        private int f33354k1;

        /* JADX INFO: renamed from: k2, reason: collision with root package name */
        private int f33355k2;

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        private int f33356k3;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f33357m;

        public F2m(int i11, int i12, int i13, int i14, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i11, i12, i13, i14);
            this.f33357m = i11;
            this.f33354k1 = i12;
            this.f33355k2 = i13;
            this.f33356k3 = i14;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.infinity = new ECPoint.F2m(this, null, null);
            this.f33351a = fromBigInteger(bigInteger);
            this.f33352b = fromBigInteger(bigInteger2);
            this.coord = 6;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECCurve cloneCurve() {
            return new F2m(this.f33357m, this.f33354k1, this.f33355k2, this.f33356k3, this.f33351a, this.f33352b, this.order, this.cofactor);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i11, final int i12) {
            final int i13 = (this.f33357m + 63) >>> 6;
            boolean zIsTrinomial = isTrinomial();
            int i14 = this.f33354k1;
            final int[] iArr = zIsTrinomial ? new int[]{i14} : new int[]{i14, this.f33355k2, this.f33356k3};
            final long[] jArr = new long[i12 * i13 * 2];
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                ECPoint eCPoint = eCPointArr[i11 + i16];
                ((ECFieldElement.F2m) eCPoint.getRawXCoord()).f33362x.copyTo(jArr, i15);
                int i17 = i15 + i13;
                ((ECFieldElement.F2m) eCPoint.getRawYCoord()).f33362x.copyTo(jArr, i17);
                i15 = i17 + i13;
            }
            return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.ECCurve.F2m.1
                private ECPoint createPoint(long[] jArr2, long[] jArr3) {
                    return F2m.this.createRawPoint(new ECFieldElement.F2m(F2m.this.f33357m, iArr, new LongArray(jArr2)), new ECFieldElement.F2m(F2m.this.f33357m, iArr, new LongArray(jArr3)));
                }

                @Override // org.bouncycastle.math.ec.ECLookupTable
                public int getSize() {
                    return i12;
                }

                @Override // org.bouncycastle.math.ec.ECLookupTable
                public ECPoint lookup(int i18) {
                    int i19;
                    long[] jArrCreate64 = Nat.create64(i13);
                    long[] jArrCreate642 = Nat.create64(i13);
                    int i21 = 0;
                    for (int i22 = 0; i22 < i12; i22++) {
                        long j9 = ((i22 ^ i18) - 1) >> 31;
                        int i23 = 0;
                        while (true) {
                            i19 = i13;
                            if (i23 < i19) {
                                long j11 = jArrCreate64[i23];
                                long[] jArr2 = jArr;
                                jArrCreate64[i23] = j11 ^ (jArr2[i21 + i23] & j9);
                                jArrCreate642[i23] = jArrCreate642[i23] ^ (jArr2[(i19 + i21) + i23] & j9);
                                i23++;
                            }
                        }
                        i21 += i19 * 2;
                    }
                    return createPoint(jArrCreate64, jArrCreate642);
                }

                @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
                public ECPoint lookupVar(int i18) {
                    long[] jArrCreate64 = Nat.create64(i13);
                    long[] jArrCreate642 = Nat.create64(i13);
                    int i19 = i18 * i13 * 2;
                    int i21 = 0;
                    while (true) {
                        int i22 = i13;
                        if (i21 >= i22) {
                            return createPoint(jArrCreate64, jArrCreate642);
                        }
                        long[] jArr2 = jArr;
                        jArrCreate64[i21] = jArr2[i19 + i21];
                        jArrCreate642[i21] = jArr2[i22 + i19 + i21];
                        i21++;
                    }
                }
            };
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECMultiplier createDefaultMultiplier() {
            return isKoblitz() ? new WTauNafMultiplier() : super.createDefaultMultiplier();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return new ECPoint.F2m(this, eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            if (bigInteger != null && bigInteger.signum() >= 0) {
                int iBitLength = bigInteger.bitLength();
                int i11 = this.f33357m;
                if (iBitLength <= i11) {
                    int i12 = this.f33355k2;
                    int i13 = this.f33356k3;
                    int i14 = i12 | i13;
                    int i15 = this.f33354k1;
                    return new ECFieldElement.F2m(i11, i14 == 0 ? new int[]{i15} : new int[]{i15, i12, i13}, new LongArray(bigInteger));
                }
            }
            a.f("x value invalid in F2m field element");
            return null;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public int getFieldSize() {
            return this.f33357m;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint getInfinity() {
            return this.infinity;
        }

        public int getK1() {
            return this.f33354k1;
        }

        public int getK2() {
            return this.f33355k2;
        }

        public int getK3() {
            return this.f33356k3;
        }

        public int getM() {
            return this.f33357m;
        }

        public boolean isTrinomial() {
            return this.f33355k2 == 0 && this.f33356k3 == 0;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean supportsCoordinateSystem(int i11) {
            return i11 == 0 || i11 == 1 || i11 == 6;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
            return new ECPoint.F2m(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }

        public F2m(int i11, int i12, int i13, int i14, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i11, i12, i13, i14, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public F2m(int i11, int i12, int i13, int i14, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i11, i12, i13, i14);
            this.f33357m = i11;
            this.f33354k1 = i12;
            this.f33355k2 = i13;
            this.f33356k3 = i14;
            this.order = bigInteger;
            this.cofactor = bigInteger2;
            this.infinity = new ECPoint.F2m(this, null, null);
            this.f33351a = eCFieldElement;
            this.f33352b = eCFieldElement2;
            this.coord = 6;
        }

        public F2m(int i11, int i12, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i11, i12, 0, 0, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public F2m(int i11, int i12, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i11, i12, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }
    }

    public static class Fp extends AbstractFp {
        private static final int FP_DEFAULT_COORDS = 4;
        private static final Set<BigInteger> knownQs = Collections.synchronizedSet(new HashSet());
        private static final BigIntegers.Cache validatedQs = new BigIntegers.Cache();
        ECPoint.Fp infinity;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        BigInteger f33358q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        BigInteger f33359r;

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, boolean z11) {
            super(bigInteger);
            if (z11) {
                knownQs.add(bigInteger);
            } else if (!knownQs.contains(bigInteger)) {
                BigIntegers.Cache cache = validatedQs;
                if (!cache.contains(bigInteger)) {
                    int iAsInteger = Properties.asInteger("org.bouncycastle.ec.fp_max_size", 1042);
                    int iAsInteger2 = Properties.asInteger("org.bouncycastle.ec.fp_certainty", 100);
                    int iBitLength = bigInteger.bitLength();
                    if (iAsInteger < iBitLength) {
                        a.f("Fp q value out of range");
                        throw null;
                    }
                    if (Primes.hasAnySmallFactors(bigInteger) || !Primes.isMRProbablePrime(bigInteger, CryptoServicesRegistrar.getSecureRandom(), ECCurve.getNumberOfIterations(iBitLength, iAsInteger2))) {
                        a.f("Fp q value not prime");
                        throw null;
                    }
                    cache.add(bigInteger);
                }
            }
            this.f33358q = bigInteger;
            this.f33359r = ECFieldElement.Fp.calculateResidue(bigInteger);
            this.infinity = new ECPoint.Fp(this, null, null);
            this.f33351a = fromBigInteger(bigInteger2);
            this.f33352b = fromBigInteger(bigInteger3);
            this.order = bigInteger4;
            this.cofactor = bigInteger5;
            this.coord = 4;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECCurve cloneCurve() {
            return new Fp(this.f33358q, this.f33359r, this.f33351a, this.f33352b, this.order, this.cofactor);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return new ECPoint.Fp(this, eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(this.f33358q) < 0) {
                return new ECFieldElement.Fp(this.f33358q, this.f33359r, bigInteger);
            }
            a.f("x value invalid for Fp field element");
            return null;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public int getFieldSize() {
            return this.f33358q.bitLength();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint getInfinity() {
            return this.infinity;
        }

        @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp
        public BigInteger getQ() {
            return this.f33358q;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint importPoint(ECPoint eCPoint) {
            int coordinateSystem;
            return (this == eCPoint.getCurve() || getCoordinateSystem() != 2 || eCPoint.isInfinity() || !((coordinateSystem = eCPoint.getCurve().getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) ? super.importPoint(eCPoint) : new ECPoint.Fp(this, fromBigInteger(eCPoint.f33366x.toBigInteger()), fromBigInteger(eCPoint.f33367y.toBigInteger()), new ECFieldElement[]{fromBigInteger(eCPoint.f33368zs[0].toBigInteger())});
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean supportsCoordinateSystem(int i11) {
            return i11 == 0 || i11 == 1 || i11 == 2 || i11 == 4;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
            return new ECPoint.Fp(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            this(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, false);
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.f33358q = bigInteger;
            this.f33359r = bigInteger2;
            this.infinity = new ECPoint.Fp(this, null, null);
            this.f33351a = eCFieldElement;
            this.f33352b = eCFieldElement2;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.coord = 4;
        }
    }

    public void checkPoints(ECPoint[] eCPointArr) {
        checkPoints(eCPointArr, 0, eCPointArr.length);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ECCurve) && equals((ECCurve) obj);
        }
        return true;
    }

    public void normalizeAll(ECPoint[] eCPointArr) {
        normalizeAll(eCPointArr, 0, eCPointArr.length, null);
    }
}

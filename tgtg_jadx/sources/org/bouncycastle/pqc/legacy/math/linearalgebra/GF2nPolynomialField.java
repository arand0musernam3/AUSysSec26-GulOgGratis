package org.bouncycastle.pqc.legacy.math.linearalgebra;

import a40.d0;
import i4.a;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public class GF2nPolynomialField extends GF2nField {
    private boolean isPentanomial;
    private boolean isTrinomial;

    /* JADX INFO: renamed from: pc, reason: collision with root package name */
    private int[] f33716pc;
    GF2Polynomial[] squaringMatrix;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private int f33717tc;

    public GF2nPolynomialField(int i11, SecureRandom secureRandom, GF2Polynomial gF2Polynomial) throws RuntimeException {
        super(secureRandom);
        this.isTrinomial = false;
        this.isPentanomial = false;
        this.f33716pc = new int[3];
        if (i11 < 3) {
            a.f("degree must be at least 3");
            throw null;
        }
        if (gF2Polynomial.getLength() != i11 + 1) {
            d0.c();
            throw null;
        }
        if (!gF2Polynomial.isIrreducible()) {
            d0.c();
            throw null;
        }
        this.mDegree = i11;
        this.fieldPolynomial = gF2Polynomial;
        computeSquaringMatrix();
        int i12 = 2;
        for (int i13 = 1; i13 < this.fieldPolynomial.getLength() - 1; i13++) {
            if (this.fieldPolynomial.testBit(i13)) {
                int i14 = i12 + 1;
                if (i14 == 3) {
                    this.f33717tc = i13;
                }
                if (i14 <= 5) {
                    this.f33716pc[i12 - 2] = i13;
                }
                i12 = i14;
            }
        }
        if (i12 == 3) {
            this.isTrinomial = true;
        }
        if (i12 == 5) {
            this.isPentanomial = true;
        }
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    private void computeSquaringMatrix() {
        int i11 = this.mDegree;
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[i11 - 1];
        this.squaringMatrix = new GF2Polynomial[i11];
        int i12 = 0;
        while (true) {
            GF2Polynomial[] gF2PolynomialArr2 = this.squaringMatrix;
            if (i12 >= gF2PolynomialArr2.length) {
                break;
            }
            gF2PolynomialArr2[i12] = new GF2Polynomial(this.mDegree, "ZERO");
            i12++;
        }
        for (int i13 = 0; i13 < this.mDegree - 1; i13++) {
            gF2PolynomialArr[i13] = new GF2Polynomial(1, "ONE").shiftLeft(this.mDegree + i13).remainder(this.fieldPolynomial);
        }
        for (int i14 = 1; i14 <= Math.abs(this.mDegree >> 1); i14++) {
            int i15 = 1;
            while (true) {
                int i16 = this.mDegree;
                if (i15 <= i16) {
                    if (gF2PolynomialArr[i16 - (i14 << 1)].testBit(i16 - i15)) {
                        this.squaringMatrix[i15 - 1].setBit(this.mDegree - i14);
                    }
                    i15++;
                }
            }
        }
        int iAbs = Math.abs(this.mDegree >> 1) + 1;
        while (true) {
            int i17 = this.mDegree;
            if (iAbs > i17) {
                return;
            }
            this.squaringMatrix[((iAbs << 1) - i17) - 1].setBit(i17 - iAbs);
            iAbs++;
        }
    }

    private boolean testPentanomials() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 1);
        this.fieldPolynomial = gF2Polynomial;
        gF2Polynomial.setBit(0);
        this.fieldPolynomial.setBit(this.mDegree);
        boolean zIsIrreducible = false;
        int i11 = 1;
        while (i11 <= this.mDegree - 3 && !zIsIrreducible) {
            this.fieldPolynomial.setBit(i11);
            int i12 = i11 + 1;
            int i13 = i12;
            while (i13 <= this.mDegree - 2 && !zIsIrreducible) {
                this.fieldPolynomial.setBit(i13);
                int i14 = i13 + 1;
                for (int i15 = i14; i15 <= this.mDegree - 1 && !zIsIrreducible; i15++) {
                    this.fieldPolynomial.setBit(i15);
                    if (((((this.mDegree & 1) != 0) | ((i11 & 1) != 0) | ((i13 & 1) != 0)) || ((i15 & 1) != 0)) && (zIsIrreducible = this.fieldPolynomial.isIrreducible())) {
                        this.isPentanomial = true;
                        int[] iArr = this.f33716pc;
                        iArr[0] = i11;
                        iArr[1] = i13;
                        iArr[2] = i15;
                        return zIsIrreducible;
                    }
                    this.fieldPolynomial.resetBit(i15);
                }
                this.fieldPolynomial.resetBit(i13);
                i13 = i14;
            }
            this.fieldPolynomial.resetBit(i11);
            i11 = i12;
        }
        return zIsIrreducible;
    }

    private boolean testRandom() {
        this.fieldPolynomial = new GF2Polynomial(this.mDegree + 1);
        do {
            this.fieldPolynomial.randomize();
            this.fieldPolynomial.setBit(this.mDegree);
            this.fieldPolynomial.setBit(0);
        } while (!this.fieldPolynomial.isIrreducible());
        return true;
    }

    private boolean testTrinomials() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 1);
        this.fieldPolynomial = gF2Polynomial;
        boolean zIsIrreducible = false;
        gF2Polynomial.setBit(0);
        this.fieldPolynomial.setBit(this.mDegree);
        for (int i11 = 1; i11 < this.mDegree && !zIsIrreducible; i11++) {
            this.fieldPolynomial.setBit(i11);
            boolean zIsIrreducible2 = this.fieldPolynomial.isIrreducible();
            if (zIsIrreducible2) {
                this.isTrinomial = true;
                this.f33717tc = i11;
                return zIsIrreducible2;
            }
            this.fieldPolynomial.resetBit(i11);
            zIsIrreducible = this.fieldPolynomial.isIrreducible();
        }
        return zIsIrreducible;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nField
    public void computeCOBMatrix(GF2nField gF2nField) {
        GF2nElement randomRoot;
        GF2nElement[] gF2nElementArr;
        int i11 = this.mDegree;
        if (i11 != gF2nField.mDegree) {
            a.f("GF2nPolynomialField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
            return;
        }
        boolean z11 = gF2nField instanceof GF2nONBField;
        if (z11) {
            gF2nField.computeCOBMatrix(this);
            return;
        }
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[i11];
        for (int i12 = 0; i12 < this.mDegree; i12++) {
            gF2PolynomialArr[i12] = new GF2Polynomial(this.mDegree);
        }
        do {
            randomRoot = gF2nField.getRandomRoot(this.fieldPolynomial);
        } while (randomRoot.isZero());
        boolean z12 = randomRoot instanceof GF2nONBElement;
        int i13 = this.mDegree;
        if (z12) {
            gF2nElementArr = new GF2nONBElement[i13];
            gF2nElementArr[i13 - 1] = GF2nONBElement.ONE((GF2nONBField) gF2nField);
        } else {
            gF2nElementArr = new GF2nPolynomialElement[i13];
            gF2nElementArr[i13 - 1] = GF2nPolynomialElement.ONE((GF2nPolynomialField) gF2nField);
        }
        int i14 = this.mDegree;
        gF2nElementArr[i14 - 2] = randomRoot;
        for (int i15 = i14 - 3; i15 >= 0; i15--) {
            gF2nElementArr[i15] = (GF2nElement) gF2nElementArr[i15 + 1].multiply(randomRoot);
        }
        if (z11) {
            for (int i16 = 0; i16 < this.mDegree; i16++) {
                int i17 = 0;
                while (true) {
                    if (i17 < this.mDegree) {
                        if (gF2nElementArr[i16].testBit((r5 - i17) - 1)) {
                            int i18 = this.mDegree;
                            gF2PolynomialArr[(i18 - i17) - 1].setBit((i18 - i16) - 1);
                        }
                        i17++;
                    }
                }
            }
        } else {
            for (int i19 = 0; i19 < this.mDegree; i19++) {
                for (int i21 = 0; i21 < this.mDegree; i21++) {
                    if (gF2nElementArr[i19].testBit(i21)) {
                        int i22 = this.mDegree;
                        gF2PolynomialArr[(i22 - i21) - 1].setBit((i22 - i19) - 1);
                    }
                }
            }
        }
        this.fields.addElement(gF2nField);
        this.matrices.addElement(gF2PolynomialArr);
        gF2nField.fields.addElement(this);
        gF2nField.matrices.addElement(invertMatrix(gF2PolynomialArr));
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nField
    public void computeFieldPolynomial() {
        if (testTrinomials() || testPentanomials()) {
            return;
        }
        testRandom();
    }

    public void computeFieldPolynomial2() {
        if (testTrinomials() || testPentanomials()) {
            return;
        }
        testRandom();
    }

    public int[] getPc() throws RuntimeException {
        if (!this.isPentanomial) {
            d0.c();
            return null;
        }
        int[] iArr = new int[3];
        System.arraycopy(this.f33716pc, 0, iArr, 0, 3);
        return iArr;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nField
    public GF2nElement getRandomRoot(GF2Polynomial gF2Polynomial) {
        GF2nPolynomial gF2nPolynomialGcd;
        int degree;
        int degree2;
        GF2nPolynomial gF2nPolynomial = new GF2nPolynomial(gF2Polynomial, this);
        while (gF2nPolynomial.getDegree() > 1) {
            while (true) {
                GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this, this.random);
                GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial(2, GF2nPolynomialElement.ZERO(this));
                gF2nPolynomial2.set(1, gF2nPolynomialElement);
                GF2nPolynomial gF2nPolynomial3 = new GF2nPolynomial(gF2nPolynomial2);
                for (int i11 = 1; i11 <= this.mDegree - 1; i11++) {
                    gF2nPolynomial3 = gF2nPolynomial3.multiplyAndReduce(gF2nPolynomial3, gF2nPolynomial).add(gF2nPolynomial2);
                }
                gF2nPolynomialGcd = gF2nPolynomial3.gcd(gF2nPolynomial);
                degree = gF2nPolynomialGcd.getDegree();
                degree2 = gF2nPolynomial.getDegree();
                if (degree != 0 && degree != degree2) {
                    break;
                }
            }
            gF2nPolynomial = (degree << 1) > degree2 ? gF2nPolynomial.quotient(gF2nPolynomialGcd) : new GF2nPolynomial(gF2nPolynomialGcd);
        }
        return gF2nPolynomial.at(0);
    }

    public GF2Polynomial getSquaringVector(int i11) {
        return new GF2Polynomial(this.squaringMatrix[i11]);
    }

    public int getTc() throws RuntimeException {
        if (this.isTrinomial) {
            return this.f33717tc;
        }
        d0.c();
        return 0;
    }

    public boolean isPentanomial() {
        return this.isPentanomial;
    }

    public boolean isTrinomial() {
        return this.isTrinomial;
    }

    public GF2nPolynomialField(int i11, SecureRandom secureRandom) {
        super(secureRandom);
        this.isTrinomial = false;
        this.isPentanomial = false;
        this.f33716pc = new int[3];
        if (i11 < 3) {
            a.f("k must be at least 3");
            throw null;
        }
        this.mDegree = i11;
        computeFieldPolynomial();
        computeSquaringMatrix();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    public GF2nPolynomialField(int i11, SecureRandom secureRandom, boolean z11) {
        super(secureRandom);
        this.isTrinomial = false;
        this.isPentanomial = false;
        this.f33716pc = new int[3];
        if (i11 < 3) {
            a.f("k must be at least 3");
            throw null;
        }
        this.mDegree = i11;
        if (z11) {
            computeFieldPolynomial();
        } else {
            computeFieldPolynomial2();
        }
        computeSquaringMatrix();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }
}

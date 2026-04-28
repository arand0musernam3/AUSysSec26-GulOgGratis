package org.bouncycastle.pqc.jcajce.spec;

import i4.a;
import java.security.InvalidParameterException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialRingGF2;

/* JADX INFO: loaded from: classes3.dex */
public class McElieceKeyGenParameterSpec implements AlgorithmParameterSpec {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private int fieldPoly;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33649m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f33650n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f33651t;

    public McElieceKeyGenParameterSpec(int i11, int i12, int i13) {
        this.f33649m = i11;
        if (i11 < 1) {
            a.f("m must be positive");
            throw null;
        }
        if (i11 > 32) {
            a.f(" m is too large");
            throw null;
        }
        int i14 = 1 << i11;
        this.f33650n = i14;
        this.f33651t = i12;
        if (i12 < 0) {
            a.f("t must be positive");
            throw null;
        }
        if (i12 > i14) {
            a.f("t must be less than n = 2^m");
            throw null;
        }
        if (PolynomialRingGF2.degree(i13) == i11 && PolynomialRingGF2.isIrreducible(i13)) {
            this.fieldPoly = i13;
        } else {
            a.f("polynomial is not a field polynomial for GF(2^m)");
            throw null;
        }
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f33649m;
    }

    public int getN() {
        return this.f33650n;
    }

    public int getT() {
        return this.f33651t;
    }

    public McElieceKeyGenParameterSpec(int i11) {
        if (i11 < 1) {
            a.f("key size must be positive");
            throw null;
        }
        this.f33649m = 0;
        this.f33650n = 1;
        while (true) {
            int i12 = this.f33650n;
            if (i12 >= i11) {
                int i13 = i12 >>> 1;
                this.f33651t = i13;
                int i14 = this.f33649m;
                this.f33651t = i13 / i14;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i14);
                return;
            }
            this.f33650n = i12 << 1;
            this.f33649m++;
        }
    }

    public McElieceKeyGenParameterSpec(int i11, int i12) throws InvalidParameterException {
        if (i11 < 1) {
            a.f("m must be positive");
            throw null;
        }
        if (i11 > 32) {
            a.f("m is too large");
            throw null;
        }
        this.f33649m = i11;
        int i13 = 1 << i11;
        this.f33650n = i13;
        if (i12 < 0) {
            a.f("t must be positive");
            throw null;
        }
        if (i12 > i13) {
            a.f("t must be less than n = 2^m");
            throw null;
        }
        this.f33651t = i12;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i11);
    }

    public McElieceKeyGenParameterSpec() {
        this(11, 50);
    }
}

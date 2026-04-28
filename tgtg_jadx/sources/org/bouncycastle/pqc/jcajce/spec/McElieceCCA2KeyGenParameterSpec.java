package org.bouncycastle.pqc.jcajce.spec;

import i4.a;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialRingGF2;

/* JADX INFO: loaded from: classes3.dex */
public class McElieceCCA2KeyGenParameterSpec implements AlgorithmParameterSpec {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    public static final String SHA1 = "SHA-1";
    public static final String SHA224 = "SHA-224";
    public static final String SHA256 = "SHA-256";
    public static final String SHA384 = "SHA-384";
    public static final String SHA512 = "SHA-512";
    private final String digest;
    private int fieldPoly;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f33646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f33647n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f33648t;

    public McElieceCCA2KeyGenParameterSpec(int i11, int i12, int i13, String str) {
        this.f33646m = i11;
        if (i11 < 1) {
            a.f("m must be positive");
            throw null;
        }
        if (i11 > 32) {
            a.f(" m is too large");
            throw null;
        }
        int i14 = 1 << i11;
        this.f33647n = i14;
        this.f33648t = i12;
        if (i12 < 0) {
            a.f("t must be positive");
            throw null;
        }
        if (i12 > i14) {
            a.f("t must be less than n = 2^m");
            throw null;
        }
        if (PolynomialRingGF2.degree(i13) != i11 || !PolynomialRingGF2.isIrreducible(i13)) {
            a.f("polynomial is not a field polynomial for GF(2^m)");
            throw null;
        }
        this.fieldPoly = i13;
        this.digest = str;
    }

    public String getDigest() {
        return this.digest;
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f33646m;
    }

    public int getN() {
        return this.f33647n;
    }

    public int getT() {
        return this.f33648t;
    }

    public McElieceCCA2KeyGenParameterSpec(int i11) {
        this(i11, "SHA-256");
    }

    public McElieceCCA2KeyGenParameterSpec(int i11, int i12) {
        this(i11, i12, "SHA-256");
    }

    public McElieceCCA2KeyGenParameterSpec(int i11, int i12, int i13) {
        this(i11, i12, i13, "SHA-256");
    }

    public McElieceCCA2KeyGenParameterSpec() {
        this(11, 50, "SHA-256");
    }

    public McElieceCCA2KeyGenParameterSpec(int i11, int i12, String str) {
        if (i11 < 1) {
            a.f("m must be positive");
            throw null;
        }
        if (i11 > 32) {
            a.f("m is too large");
            throw null;
        }
        this.f33646m = i11;
        int i13 = 1 << i11;
        this.f33647n = i13;
        if (i12 < 0) {
            a.f("t must be positive");
            throw null;
        }
        if (i12 > i13) {
            a.f("t must be less than n = 2^m");
            throw null;
        }
        this.f33648t = i12;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i11);
        this.digest = str;
    }

    public McElieceCCA2KeyGenParameterSpec(int i11, String str) {
        int i12 = 1;
        if (i11 < 1) {
            a.f("key size must be positive");
            throw null;
        }
        int i13 = 0;
        while (i12 < i11) {
            i12 <<= 1;
            i13++;
        }
        this.f33648t = (i12 >>> 1) / i13;
        this.f33646m = i13;
        this.f33647n = i12;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i13);
        this.digest = str;
    }
}

package org.bouncycastle.pqc.legacy.crypto.mceliece;

import i4.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialRingGF2;

/* JADX INFO: loaded from: classes3.dex */
public class McElieceParameters implements CipherParameters {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private Digest digest;
    private int fieldPoly;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33700m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f33701n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f33702t;

    public McElieceParameters(int i11, int i12, int i13, Digest digest) {
        this.f33700m = i11;
        if (i11 < 1) {
            a.f("m must be positive");
            throw null;
        }
        if (i11 > 32) {
            a.f(" m is too large");
            throw null;
        }
        int i14 = 1 << i11;
        this.f33701n = i14;
        this.f33702t = i12;
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
        this.digest = digest;
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f33700m;
    }

    public int getN() {
        return this.f33701n;
    }

    public int getT() {
        return this.f33702t;
    }

    public McElieceParameters(int i11) {
        this(i11, (Digest) null);
    }

    public McElieceParameters(int i11, int i12) {
        this(i11, i12, (Digest) null);
    }

    public McElieceParameters(int i11, int i12, int i13) {
        this(i11, i12, i13, null);
    }

    public McElieceParameters() {
        this(11, 50);
    }

    public McElieceParameters(int i11, int i12, Digest digest) {
        if (i11 < 1) {
            a.f("m must be positive");
            throw null;
        }
        if (i11 > 32) {
            a.f("m is too large");
            throw null;
        }
        this.f33700m = i11;
        int i13 = 1 << i11;
        this.f33701n = i13;
        if (i12 < 0) {
            a.f("t must be positive");
            throw null;
        }
        if (i12 > i13) {
            a.f("t must be less than n = 2^m");
            throw null;
        }
        this.f33702t = i12;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i11);
        this.digest = digest;
    }

    public McElieceParameters(int i11, Digest digest) {
        if (i11 < 1) {
            a.f("key size must be positive");
            throw null;
        }
        this.f33700m = 0;
        this.f33701n = 1;
        while (true) {
            int i12 = this.f33701n;
            if (i12 >= i11) {
                int i13 = i12 >>> 1;
                this.f33702t = i13;
                int i14 = this.f33700m;
                this.f33702t = i13 / i14;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i14);
                this.digest = digest;
                return;
            }
            this.f33701n = i12 << 1;
            this.f33700m++;
        }
    }

    public McElieceParameters(Digest digest) {
        this(11, 50, digest);
    }
}

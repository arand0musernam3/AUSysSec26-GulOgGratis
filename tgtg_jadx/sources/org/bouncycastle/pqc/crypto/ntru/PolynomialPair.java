package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.math.ntru.Polynomial;

/* JADX INFO: loaded from: classes3.dex */
class PolynomialPair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Polynomial f33556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Polynomial f33557b;

    public PolynomialPair(Polynomial polynomial, Polynomial polynomial2) {
        this.f33556a = polynomial;
        this.f33557b = polynomial2;
    }

    public Polynomial f() {
        return this.f33556a;
    }

    public Polynomial g() {
        return this.f33557b;
    }

    public Polynomial m() {
        return this.f33557b;
    }

    public Polynomial r() {
        return this.f33556a;
    }
}

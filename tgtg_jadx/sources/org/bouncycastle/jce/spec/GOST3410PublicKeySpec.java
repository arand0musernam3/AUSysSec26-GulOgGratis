package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f33347a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f33348p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f33349q;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private BigInteger f33350y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f33350y = bigInteger;
        this.f33348p = bigInteger2;
        this.f33349q = bigInteger3;
        this.f33347a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f33347a;
    }

    public BigInteger getP() {
        return this.f33348p;
    }

    public BigInteger getQ() {
        return this.f33349q;
    }

    public BigInteger getY() {
        return this.f33350y;
    }
}

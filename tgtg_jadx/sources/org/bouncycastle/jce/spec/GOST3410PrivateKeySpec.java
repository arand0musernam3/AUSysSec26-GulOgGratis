package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f33340a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f33341p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f33342q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private BigInteger f33343x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f33343x = bigInteger;
        this.f33341p = bigInteger2;
        this.f33342q = bigInteger3;
        this.f33340a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f33340a;
    }

    public BigInteger getP() {
        return this.f33341p;
    }

    public BigInteger getQ() {
        return this.f33342q;
    }

    public BigInteger getX() {
        return this.f33343x;
    }
}

package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f33336g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f33337p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f33337p = bigInteger;
        this.f33336g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f33336g;
    }

    public BigInteger getP() {
        return this.f33337p;
    }
}

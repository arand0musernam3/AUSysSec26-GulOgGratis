package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ElGamalPublicKeySpec extends ElGamalKeySpec {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private BigInteger f33339y;

    public ElGamalPublicKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.f33339y = bigInteger;
    }

    public BigInteger getY() {
        return this.f33339y;
    }
}

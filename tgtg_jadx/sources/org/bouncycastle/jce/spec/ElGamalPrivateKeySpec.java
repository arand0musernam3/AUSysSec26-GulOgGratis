package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ElGamalPrivateKeySpec extends ElGamalKeySpec {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private BigInteger f33338x;

    public ElGamalPrivateKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.f33338x = bigInteger;
    }

    public BigInteger getX() {
        return this.f33338x;
    }
}

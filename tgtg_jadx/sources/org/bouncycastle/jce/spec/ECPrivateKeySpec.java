package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ECPrivateKeySpec extends ECKeySpec {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BigInteger f33334d;

    public ECPrivateKeySpec(BigInteger bigInteger, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        this.f33334d = bigInteger;
    }

    public BigInteger getD() {
        return this.f33334d;
    }
}

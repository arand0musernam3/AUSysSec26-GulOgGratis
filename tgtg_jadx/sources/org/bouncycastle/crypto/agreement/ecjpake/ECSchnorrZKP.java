package org.bouncycastle.crypto.agreement.ecjpake;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes3.dex */
public class ECSchnorrZKP {
    private final ECPoint V;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final BigInteger f33022r;

    public ECSchnorrZKP(ECPoint eCPoint, BigInteger bigInteger) {
        this.V = eCPoint;
        this.f33022r = bigInteger;
    }

    public ECPoint getV() {
        return this.V;
    }

    public BigInteger getr() {
        return this.f33022r;
    }
}

package org.bouncycastle.jce.spec;

import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes3.dex */
public class ECPublicKeySpec extends ECKeySpec {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ECPoint f33335q;

    public ECPublicKeySpec(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        if (eCPoint.getCurve() != null) {
            this.f33335q = eCPoint.normalize();
        } else {
            this.f33335q = eCPoint;
        }
    }

    public ECPoint getQ() {
        return this.f33335q;
    }
}

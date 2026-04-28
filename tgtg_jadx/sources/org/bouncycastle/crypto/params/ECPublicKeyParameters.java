package org.bouncycastle.crypto.params;

import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes3.dex */
public class ECPublicKeyParameters extends ECKeyParameters {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ECPoint f33232q;

    public ECPublicKeyParameters(ECPoint eCPoint, ECDomainParameters eCDomainParameters) {
        super(false, eCDomainParameters);
        this.f33232q = eCDomainParameters.validatePublicPoint(eCPoint);
    }

    public ECPoint getQ() {
        return this.f33232q;
    }
}

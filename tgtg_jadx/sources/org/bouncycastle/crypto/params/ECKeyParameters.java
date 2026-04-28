package org.bouncycastle.crypto.params;

import c50.w;

/* JADX INFO: loaded from: classes3.dex */
public class ECKeyParameters extends AsymmetricKeyParameter {
    private final ECDomainParameters parameters;

    public ECKeyParameters(boolean z11, ECDomainParameters eCDomainParameters) {
        super(z11);
        if (eCDomainParameters != null) {
            this.parameters = eCDomainParameters;
        } else {
            w.l("'parameters' cannot be null");
            throw null;
        }
    }

    public ECDomainParameters getParameters() {
        return this.parameters;
    }
}

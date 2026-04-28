package org.bouncycastle.pqc.crypto.slhdsa;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public class SLHDSAKeyParameters extends AsymmetricKeyParameter {
    private final SLHDSAParameters parameters;

    public SLHDSAKeyParameters(boolean z11, SLHDSAParameters sLHDSAParameters) {
        super(z11);
        this.parameters = sLHDSAParameters;
    }

    public SLHDSAParameters getParameters() {
        return this.parameters;
    }
}

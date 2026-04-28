package org.bouncycastle.pqc.crypto.mayo;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public class MayoKeyParameters extends AsymmetricKeyParameter {
    private final MayoParameters params;

    public MayoKeyParameters(boolean z11, MayoParameters mayoParameters) {
        super(z11);
        this.params = mayoParameters;
    }

    public MayoParameters getParameters() {
        return this.params;
    }
}

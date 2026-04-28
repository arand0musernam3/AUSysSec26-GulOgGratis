package org.bouncycastle.pqc.crypto.mlkem;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public class MLKEMKeyParameters extends AsymmetricKeyParameter {
    private MLKEMParameters params;

    public MLKEMKeyParameters(boolean z11, MLKEMParameters mLKEMParameters) {
        super(z11);
        this.params = mLKEMParameters;
    }

    public MLKEMParameters getParameters() {
        return this.params;
    }
}

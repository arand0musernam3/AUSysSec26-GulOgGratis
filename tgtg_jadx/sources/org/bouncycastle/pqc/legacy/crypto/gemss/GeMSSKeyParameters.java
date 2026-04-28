package org.bouncycastle.pqc.legacy.crypto.gemss;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public class GeMSSKeyParameters extends AsymmetricKeyParameter {
    final GeMSSParameters parameters;

    public GeMSSKeyParameters(boolean z11, GeMSSParameters geMSSParameters) {
        super(z11);
        this.parameters = geMSSParameters;
    }

    public GeMSSParameters getParameters() {
        return this.parameters;
    }
}

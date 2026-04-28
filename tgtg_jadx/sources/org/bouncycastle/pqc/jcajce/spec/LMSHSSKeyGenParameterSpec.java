package org.bouncycastle.pqc.jcajce.spec;

import i4.a;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class LMSHSSKeyGenParameterSpec implements AlgorithmParameterSpec {
    private final LMSKeyGenParameterSpec[] specs;

    public LMSHSSKeyGenParameterSpec(LMSKeyGenParameterSpec... lMSKeyGenParameterSpecArr) {
        if (lMSKeyGenParameterSpecArr.length != 0) {
            this.specs = (LMSKeyGenParameterSpec[]) lMSKeyGenParameterSpecArr.clone();
        } else {
            a.f("at least one LMSKeyGenParameterSpec required");
            throw null;
        }
    }

    public LMSKeyGenParameterSpec[] getLMSSpecs() {
        return (LMSKeyGenParameterSpec[]) this.specs.clone();
    }
}

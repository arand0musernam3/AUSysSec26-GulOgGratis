package org.bouncycastle.jcajce.spec;

import c50.w;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class SM2ParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private byte[] f33316id;

    public SM2ParameterSpec(byte[] bArr) {
        if (bArr != null) {
            this.f33316id = Arrays.clone(bArr);
        } else {
            w.l("id string cannot be null");
            throw null;
        }
    }

    public byte[] getID() {
        return Arrays.clone(this.f33316id);
    }
}

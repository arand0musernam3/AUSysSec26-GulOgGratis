package org.bouncycastle.jcajce.spec;

import com.braze.h2;
import i4.a;
import java.security.spec.KeySpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class MLKEMPrivateKeySpec implements KeySpec {
    private final byte[] data;
    private final boolean isSeed;
    private final MLKEMParameterSpec params;
    private final byte[] publicData;

    public MLKEMPrivateKeySpec(MLKEMParameterSpec mLKEMParameterSpec, byte[] bArr) {
        if (bArr.length != 64) {
            a.f("incorrect length for seed");
            throw null;
        }
        this.isSeed = true;
        this.params = mLKEMParameterSpec;
        this.data = Arrays.clone(bArr);
        this.publicData = null;
    }

    public MLKEMParameterSpec getParameterSpec() {
        return this.params;
    }

    public byte[] getPrivateData() {
        if (!isSeed()) {
            return Arrays.clone(this.data);
        }
        h2.b("KeySpec represents seed");
        return null;
    }

    public byte[] getPublicData() {
        if (!isSeed()) {
            return Arrays.clone(this.publicData);
        }
        h2.b("KeySpec represents long form");
        return null;
    }

    public byte[] getSeed() {
        if (isSeed()) {
            return Arrays.clone(this.data);
        }
        h2.b("KeySpec represents long form");
        return null;
    }

    public boolean isSeed() {
        return this.isSeed;
    }

    public MLKEMPrivateKeySpec(MLKEMParameterSpec mLKEMParameterSpec, byte[] bArr, byte[] bArr2) {
        this.isSeed = false;
        this.params = mLKEMParameterSpec;
        this.data = Arrays.clone(bArr);
        this.publicData = Arrays.clone(bArr2);
    }
}

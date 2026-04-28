package org.bouncycastle.jcajce.spec;

import com.braze.h2;
import i4.a;
import java.security.spec.KeySpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class MLDSAPrivateKeySpec implements KeySpec {
    private final byte[] data;
    private final boolean isSeed;
    private final MLDSAParameterSpec params;
    private final byte[] publicData;

    public MLDSAPrivateKeySpec(MLDSAParameterSpec mLDSAParameterSpec, byte[] bArr) {
        if (bArr.length != 32) {
            a.f("incorrect length for seed");
            throw null;
        }
        this.isSeed = true;
        this.params = mLDSAParameterSpec;
        this.data = Arrays.clone(bArr);
        this.publicData = null;
    }

    public MLDSAParameterSpec getParameterSpec() {
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

    public MLDSAPrivateKeySpec(MLDSAParameterSpec mLDSAParameterSpec, byte[] bArr, byte[] bArr2) {
        this.isSeed = false;
        this.params = mLDSAParameterSpec;
        this.data = Arrays.clone(bArr);
        this.publicData = Arrays.clone(bArr2);
    }
}

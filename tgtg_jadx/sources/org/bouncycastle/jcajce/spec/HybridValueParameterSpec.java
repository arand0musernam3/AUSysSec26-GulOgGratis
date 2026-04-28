package org.bouncycastle.jcajce.spec;

import com.braze.h2;
import java.security.spec.AlgorithmParameterSpec;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.Destroyable;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class HybridValueParameterSpec implements AlgorithmParameterSpec, Destroyable {
    private volatile AlgorithmParameterSpec baseSpec;
    private final boolean doPrepend;
    private final AtomicBoolean hasBeenDestroyed;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile byte[] f33315t;

    public HybridValueParameterSpec(byte[] bArr, boolean z11, AlgorithmParameterSpec algorithmParameterSpec) {
        this.hasBeenDestroyed = new AtomicBoolean(false);
        this.f33315t = bArr;
        this.baseSpec = algorithmParameterSpec;
        this.doPrepend = z11;
    }

    private void checkDestroyed() {
        if (isDestroyed()) {
            h2.b("spec has been destroyed");
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        if (this.hasBeenDestroyed.getAndSet(true)) {
            return;
        }
        Arrays.clear(this.f33315t);
        this.f33315t = null;
        this.baseSpec = null;
    }

    public AlgorithmParameterSpec getBaseParameterSpec() {
        AlgorithmParameterSpec algorithmParameterSpec = this.baseSpec;
        checkDestroyed();
        return algorithmParameterSpec;
    }

    public byte[] getT() {
        byte[] bArr = this.f33315t;
        checkDestroyed();
        return bArr;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.hasBeenDestroyed.get();
    }

    public boolean isPrependedT() {
        return this.doPrepend;
    }

    public HybridValueParameterSpec(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec) {
        this(bArr, false, algorithmParameterSpec);
    }
}

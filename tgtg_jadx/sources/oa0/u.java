package oa0;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends q90.r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q90.r0 f32382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ia0.d0 f32383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IOException f32384d;

    public u(q90.r0 r0Var) {
        this.f32382b = r0Var;
        this.f32383c = new ia0.d0(new t(this, r0Var.p0()));
    }

    @Override // q90.r0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f32382b.close();
    }

    @Override // q90.r0
    public final long e() {
        return this.f32382b.e();
    }

    @Override // q90.r0
    public final q90.z g() {
        return this.f32382b.g();
    }

    @Override // q90.r0
    public final ia0.i p0() {
        return this.f32383c;
    }
}

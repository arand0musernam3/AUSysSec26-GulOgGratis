package oa0;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f32310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f32311b;

    public l(Executor executor, d dVar) {
        this.f32310a = executor;
        this.f32311b = dVar;
    }

    @Override // oa0.d
    public final void cancel() {
        this.f32311b.cancel();
    }

    @Override // oa0.d
    public final d clone() {
        return new l(this.f32310a, this.f32311b.clone());
    }

    @Override // oa0.d
    public final n0 e() {
        return this.f32311b.e();
    }

    @Override // oa0.d
    public final void g(g gVar) {
        this.f32311b.g(new k8.d(this, gVar, 27));
    }

    @Override // oa0.d
    public final boolean p() {
        return this.f32311b.p();
    }

    @Override // oa0.d
    public final q90.g0 r() {
        return this.f32311b.r();
    }
}

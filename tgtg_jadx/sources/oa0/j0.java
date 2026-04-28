package oa0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends q90.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q90.n0 f32296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q90.z f32297b;

    public j0(q90.n0 n0Var, q90.z zVar) {
        this.f32296a = n0Var;
        this.f32297b = zVar;
    }

    @Override // q90.n0
    public final long contentLength() {
        return this.f32296a.contentLength();
    }

    @Override // q90.n0
    public final q90.z contentType() {
        return this.f32297b;
    }

    @Override // q90.n0
    public final void writeTo(ia0.h hVar) {
        this.f32296a.writeTo(hVar);
    }
}

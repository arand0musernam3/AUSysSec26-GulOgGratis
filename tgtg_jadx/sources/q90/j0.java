package q90;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f36519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ia0.j f36520b;

    public j0(z zVar, ia0.j jVar) {
        this.f36519a = zVar;
        this.f36520b = jVar;
    }

    @Override // q90.n0
    public final long contentLength() {
        return this.f36520b.e();
    }

    @Override // q90.n0
    public final z contentType() {
        return this.f36519a;
    }

    @Override // q90.n0
    public final void writeTo(ia0.h hVar) {
        hVar.o0(this.f36520b);
    }
}

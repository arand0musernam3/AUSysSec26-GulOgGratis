package zw;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p2 extends ox.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f48325d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q2 f48326e;

    public p2(q2 q2Var) {
        this.f48326e = q2Var;
    }

    @Override // ox.h
    public final void M(String str) {
        this.f48325d = ((o2) this.f48326e.f48335c).f48314d.measureText(str) + this.f48325d;
    }
}

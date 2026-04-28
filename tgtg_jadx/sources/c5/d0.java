package c5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements j5.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i4.v0 f7157b;

    public d0(i4.v0 v0Var) {
        this.f7157b = v0Var;
    }

    @Override // j5.b0
    public final void b(j5.a0 a0Var, Object obj) {
        if (obj == this.f7157b) {
            this.f7156a = true;
        }
    }
}

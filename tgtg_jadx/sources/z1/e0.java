package z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t1.s f46477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2 f46478b;

    public e0(t1.s sVar) {
        t2 t2Var = y2.f46776c;
        this.f46477a = sVar;
        this.f46478b = t2Var;
    }

    @Override // z1.l1
    public final Object a(q2 q2Var, float f11, x70.c cVar) {
        return v80.f0.K(this.f46478b, new d0(f11, this, q2Var, null), cVar);
    }
}

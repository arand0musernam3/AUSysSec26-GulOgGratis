package t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends h2.s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.k1 f39471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.k1 f39472d;

    public k0(Object obj) {
        super(2);
        this.f39471c = m3.i.w(obj);
        this.f39472d = m3.i.w(obj);
    }

    @Override // h2.s0
    public final Object j() {
        return this.f39471c.getValue();
    }

    @Override // h2.s0
    public final Object l() {
        return this.f39472d.getValue();
    }

    @Override // h2.s0
    public final void m(Object obj) {
        this.f39471c.setValue(obj);
    }

    @Override // h2.s0
    public final void o() {
    }

    @Override // h2.s0
    public final void n(q1 q1Var) {
    }
}

package t1;

import m3.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Float f39407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Float f39408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.k1 f39409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k1 f39410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f39413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g0 f39414h;

    public d0(g0 g0Var, Float f11, Float f12, c0 c0Var) {
        v1 v1Var = c.f39389j;
        this.f39414h = g0Var;
        this.f39407a = f11;
        this.f39408b = f12;
        this.f39409c = m3.i.w(f11);
        this.f39410d = new k1(c0Var, v1Var, this.f39407a, this.f39408b, null);
    }

    @Override // m3.c3
    public final Object getValue() {
        return this.f39409c.getValue();
    }
}

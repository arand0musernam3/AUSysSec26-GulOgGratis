package m2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ub.a f29138g = y3.j.b(new j60.a(24), new p1(3));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3.g1 f29139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.g1 f29140b = new m3.g1(0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.h1 f29141c = new m3.h1(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h4.c f29142d = h4.c.f21379e;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f29143e = m5.t0.f29648b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3.k1 f29144f;

    public y1(z1.h2 h2Var, float f11) {
        this.f29139a = new m3.g1(f11);
        this.f29144f = new m3.k1(h2Var, m3.f.f29275g);
    }

    public final void a(z1.h2 h2Var, h4.c cVar, int i11, int i12) {
        float f11 = i12 - i11;
        this.f29140b.i(f11);
        float f12 = cVar.f21380a;
        float f13 = cVar.f21381b;
        h4.c cVar2 = this.f29142d;
        float f14 = cVar2.f21380a;
        m3.g1 g1Var = this.f29139a;
        if (f12 != f14 || f13 != cVar2.f21381b) {
            boolean z11 = h2Var == z1.h2.Vertical;
            if (z11) {
                f12 = f13;
            }
            float f15 = z11 ? cVar.f21383d : cVar.f21382c;
            float fH = g1Var.h();
            float f16 = i11;
            float f17 = fH + f16;
            g1Var.i(g1Var.h() + ((f15 <= f17 && (f12 >= fH || f15 - f12 <= f16)) ? (f12 >= fH || f15 - f12 > f16) ? 0.0f : f12 - fH : f15 - f17));
            this.f29142d = cVar;
        }
        g1Var.i(n80.p.b(g1Var.h(), 0.0f, f11));
        this.f29141c.i(i11);
    }
}

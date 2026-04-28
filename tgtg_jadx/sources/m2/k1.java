package m2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5.h f28954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m5.u0 f28955b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f28958e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z5.c f28960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q5.h f28961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f28962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.lifecycle.n1 f28963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z5.m f28964k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28956c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28957d = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f28959f = 1;

    public k1(m5.h hVar, m5.u0 u0Var, boolean z11, z5.c cVar, q5.h hVar2, List list) {
        this.f28954a = hVar;
        this.f28955b = u0Var;
        this.f28958e = z11;
        this.f28960g = cVar;
        this.f28961h = hVar2;
        this.f28962i = list;
    }

    public final void a(z5.m mVar) {
        androidx.lifecycle.n1 n1Var = this.f28963j;
        if (n1Var == null || mVar != this.f28964k || n1Var.a()) {
            this.f28964k = mVar;
            n1Var = new androidx.lifecycle.n1(this.f28954a, m5.k0.k(this.f28955b, mVar), this.f28962i, this.f28960g, this.f28961h);
        }
        this.f28963j = n1Var;
    }
}

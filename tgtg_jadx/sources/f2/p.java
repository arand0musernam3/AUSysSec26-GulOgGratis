package f2;

import h2.q0;
import h2.r0;
import h2.s0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f17153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q0 f17154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f17156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q0 f17157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17158h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17159i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b4.e f17160j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b4.j f17161k;
    public final /* synthetic */ boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f17162m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f17163n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f17164o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c0 f17165p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j9, boolean z11, n nVar, q0 q0Var, int i11, int i12, b4.e eVar, b4.j jVar, boolean z12, int i13, int i14, long j11, c0 c0Var) {
        super(0);
        this.f17156f = z11;
        this.f17157g = q0Var;
        this.f17158h = i11;
        this.f17159i = i12;
        this.f17160j = eVar;
        this.f17161k = jVar;
        this.l = z12;
        this.f17162m = i13;
        this.f17163n = i14;
        this.f17164o = j11;
        this.f17165p = c0Var;
        this.f17153c = nVar;
        this.f17154d = q0Var;
        this.f17155e = z5.b.b(z11 ? z5.a.i(j9) : Integer.MAX_VALUE, z11 ? Integer.MAX_VALUE : z5.a.h(j9), 5);
    }

    @Override // h2.s0
    public final r0 i(int i11, int i12, int i13, long j9) {
        return q(i11, j9);
    }

    public final t q(int i11, long j9) {
        n nVar = this.f17153c;
        Object objB = nVar.b(i11);
        Object objJ = nVar.f17135b.j(i11);
        return new t(i11, k(this.f17154d, i11, j9), this.f17156f, this.f17160j, this.f17161k, this.f17157g.f21211b.getLayoutDirection(), this.l, this.f17162m, this.f17163n, i11 == this.f17158h + (-1) ? 0 : this.f17159i, this.f17164o, objB, objJ, this.f17165p.f17100n, j9);
    }
}

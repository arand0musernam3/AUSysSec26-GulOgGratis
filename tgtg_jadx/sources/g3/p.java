package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d2.b2 f19253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d2.b2 f19254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d2.b2 f19255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f19256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f19257e;

    static {
        float f11 = l3.h.f26964a;
        float f12 = l3.h.f26965b;
        float f13 = 16;
        float f14 = l3.k.f26990a;
        float f15 = 8;
        f19253a = new d2.b2(f11, f15, f12, f15);
        f19254b = new d2.b2(f13, f15, f12, f15);
        float f16 = 12;
        f19255c = new d2.b2(f16, f15, f16, f15);
        d2.c.d(f16, f15, f13, f15);
        f19256d = 58;
        f19257e = l3.k.f26990a;
        int i11 = l3.m.f27043a;
        int i12 = l3.j.f26978a;
        int i13 = l3.i.f26974a;
        int i14 = l3.l.f27017a;
    }

    public static o a(long j9, long j11, long j12, long j13, m3.n nVar, int i11) {
        o oVar;
        long j14 = (i11 & 2) != 0 ? i4.v.f23315h : j11;
        long j15 = (i11 & 4) != 0 ? i4.v.f23315h : j12;
        long j16 = (i11 & 8) != 0 ? i4.v.f23315h : j13;
        p0 p0Var = (p0) ((m3.s) nVar).j(r0.f19375a);
        o oVar2 = p0Var.W;
        if (oVar2 == null) {
            o oVar3 = new o(r0.d(p0Var, l3.v.f27153a), r0.d(p0Var, l3.v.f27162j), i4.v.b(l3.v.f27157e, r0.d(p0Var, l3.v.f27155c)), i4.v.b(l3.v.f27159g, r0.d(p0Var, l3.v.f27158f)));
            p0Var.W = oVar3;
            oVar = oVar3;
        } else {
            oVar = oVar2;
        }
        return oVar.a(j9, j14, j15, j16);
    }

    public static o b(p0 p0Var) {
        o oVar = p0Var.X;
        if (oVar != null) {
            return oVar;
        }
        long j9 = i4.v.f23314g;
        o oVar2 = new o(j9, r0.d(p0Var, l3.r.Primary), j9, i4.v.b(l3.z0.f27259b, r0.d(p0Var, l3.z0.f27258a)));
        p0Var.X = oVar2;
        return oVar2;
    }

    public static o c(long j9, long j11, m3.n nVar, int i11) {
        if ((i11 & 1) != 0) {
            j9 = i4.v.f23315h;
        }
        long j12 = j9;
        if ((i11 & 2) != 0) {
            j11 = i4.v.f23315h;
        }
        long j13 = i4.v.f23315h;
        return b((p0) ((m3.s) nVar).j(r0.f19375a)).a(j12, j11, j13, j13);
    }
}

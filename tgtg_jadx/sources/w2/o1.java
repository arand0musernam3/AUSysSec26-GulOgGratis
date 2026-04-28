package w2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f43007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f43008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.k1 f43009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.k1 f43010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m3.k1 f43011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3.k1 f43012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j2.c f43013g;

    public o1() {
        k1 k1Var = new k1();
        this.f43007a = k1Var;
        this.f43008b = k1Var;
        m3.f fVar = m3.f.f29272d;
        this.f43009c = new m3.k1(null, fVar);
        this.f43010d = new m3.k1(null, fVar);
        this.f43011e = new m3.k1(null, fVar);
        this.f43012f = m3.i.w(new z5.f(0));
        this.f43013g = new j2.c();
    }

    public final long a(long j9) {
        h4.c cVarV;
        z4.z zVarD = d();
        h4.c cVar = h4.c.f21379e;
        if (zVarD != null) {
            if (zVarD.n()) {
                z4.z zVarB = b();
                cVarV = zVarB != null ? zVarB.v(zVarD, true) : null;
            } else {
                cVarV = cVar;
            }
            if (cVarV != null) {
                cVar = cVarV;
            }
        }
        return c0.i(j9, cVar);
    }

    public final z4.z b() {
        return (z4.z) this.f43011e.getValue();
    }

    public final int c(long j9, boolean z11) {
        m5.q0 q0VarG = this.f43008b.g();
        if (q0VarG == null) {
            return -1;
        }
        if (z11) {
            j9 = a(j9);
        }
        return q0VarG.f29618b.g(c0.k(this, j9));
    }

    public final z4.z d() {
        return (z4.z) this.f43009c.getValue();
    }

    public final boolean e(long j9) {
        m5.q0 q0VarG = this.f43008b.g();
        if (q0VarG == null) {
            return false;
        }
        long jK = c0.k(this, a(j9));
        int iE = q0VarG.f29618b.e(Float.intBitsToFloat((int) (4294967295L & jK)));
        int i11 = (int) (jK >> 32);
        return Float.intBitsToFloat(i11) >= q0VarG.g(iE) && Float.intBitsToFloat(i11) <= q0VarG.h(iE);
    }
}

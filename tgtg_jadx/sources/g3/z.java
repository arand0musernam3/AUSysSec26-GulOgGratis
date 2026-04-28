package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f19855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f19856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f19857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f19858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f19859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f19860k;
    public final long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f19861m;

    public z(long j9, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23) {
        this.f19850a = j9;
        this.f19851b = j11;
        this.f19852c = j12;
        this.f19853d = j13;
        this.f19854e = j14;
        this.f19855f = j15;
        this.f19856g = j16;
        this.f19857h = j17;
        this.f19858i = j18;
        this.f19859j = j19;
        this.f19860k = j21;
        this.l = j22;
        this.f19861m = j23;
    }

    public static t1.b1 a(l5.a aVar, m3.n nVar) {
        if (aVar == l5.a.Off) {
            m3.s sVar = (m3.s) nVar;
            sVar.a0(1539238463);
            t1.b1 b1VarD = s0.D(l3.f0.FastEffects, sVar);
            sVar.q(false);
            return b1VarD;
        }
        m3.s sVar2 = (m3.s) nVar;
        sVar2.a0(1539331773);
        t1.b1 b1VarD2 = s0.D(l3.f0.DefaultEffects, sVar2);
        sVar2.q(false);
        return b1VarD2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return i4.v.c(this.f19850a, zVar.f19850a) && i4.v.c(this.f19851b, zVar.f19851b) && i4.v.c(this.f19861m, zVar.f19861m) && i4.v.c(this.f19852c, zVar.f19852c) && i4.v.c(this.f19853d, zVar.f19853d) && i4.v.c(this.f19854e, zVar.f19854e) && i4.v.c(this.f19855f, zVar.f19855f) && i4.v.c(this.f19856g, zVar.f19856g) && i4.v.c(this.f19857h, zVar.f19857h) && i4.v.c(this.f19858i, zVar.f19858i) && i4.v.c(this.f19859j, zVar.f19859j) && i4.v.c(this.f19860k, zVar.f19860k) && i4.v.c(this.l, zVar.l);
    }

    public final int hashCode() {
        int i11 = i4.v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        return Long.hashCode(this.l) + e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(Long.hashCode(this.f19850a) * 31, 31, this.f19851b), 31, this.f19861m), 31, this.f19852c), 31, this.f19853d), 31, this.f19854e), 31, this.f19855f), 31, this.f19856g), 31, this.f19857h), 31, this.f19858i), 31, this.f19859j), 31, this.f19860k);
    }
}

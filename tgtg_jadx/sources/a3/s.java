package a3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2.h f550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z2.h f551c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m5.q0 f553e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f552d = this;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f554f = -1;

    public s(long j9, z2.h hVar, z2.h hVar2) {
        this.f549a = j9;
        this.f550b = hVar;
        this.f551c = hVar2;
    }

    public final long a(i0 i0Var, boolean z11) {
        m5.q0 q0Var;
        long j9 = this.f549a;
        if (z11 && i0Var.f385a.f368c != j9) {
            return 9205357640488583168L;
        }
        if ((!z11 && i0Var.f386b.f368c != j9) || c() == null || (q0Var = (m5.q0) this.f551c.invoke()) == null) {
            return 9205357640488583168L;
        }
        return na0.a.p0(q0Var, n80.p.c((z11 ? i0Var.f385a : i0Var.f386b).f367b, 0, b(q0Var)), z11, i0Var.f387c);
    }

    public final int b(m5.q0 q0Var) {
        int i11;
        synchronized (this.f552d) {
            try {
                if (this.f553e != q0Var) {
                    m5.r rVar = q0Var.f29618b;
                    boolean z11 = rVar.f29625c;
                    int i12 = 0;
                    if (!(z11 || ((float) ((int) (q0Var.f29619c & 4294967295L))) < rVar.f29627e) || z11) {
                        i12 = rVar.f29628f - 1;
                    } else {
                        int iE = rVar.e((int) (q0Var.f29619c & 4294967295L));
                        int i13 = q0Var.f29618b.f29628f - 1;
                        if (iE > i13) {
                            iE = i13;
                        }
                        while (iE >= 0 && q0Var.f29618b.f(iE) >= ((int) (q0Var.f29619c & 4294967295L))) {
                            iE--;
                        }
                        if (iE >= 0) {
                            i12 = iE;
                        }
                    }
                    this.f554f = q0Var.f29618b.c(i12, true);
                    this.f553e = q0Var;
                }
                i11 = this.f554f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    public final z4.z c() {
        z4.z zVar = (z4.z) this.f550b.invoke();
        if (zVar == null || !zVar.n()) {
            return null;
        }
        return zVar;
    }

    public final m5.h d() {
        m5.q0 q0Var = (m5.q0) this.f551c.invoke();
        return q0Var == null ? new m5.h("") : q0Var.f29617a.f29603a;
    }
}

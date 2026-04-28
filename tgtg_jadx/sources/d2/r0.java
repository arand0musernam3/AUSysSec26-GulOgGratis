package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f13901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z4.t0 f13902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z4.m1 f13903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z4.t0 f13904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z4.m1 f13905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q1.l f13906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q1.l f13907g;

    public r0(o0 o0Var) {
        this.f13901a = o0Var;
    }

    public final q1.l a(int i11, int i12, boolean z11) {
        int i13 = q0.$EnumSwitchMapping$0[this.f13901a.ordinal()];
        if (i13 == 1 || i13 == 2) {
            return null;
        }
        if (i13 == 3) {
            if (z11) {
                return this.f13906f;
            }
            return null;
        }
        if (i13 != 4) {
            e40.a.f();
            return null;
        }
        if (z11) {
            return this.f13906f;
        }
        if (i11 + 1 < 0 || i12 < 0) {
            return null;
        }
        return this.f13907g;
    }

    public final void b(z4.t tVar, z4.t tVar2, long j9) {
        long jN = c.n(j9, m1.Horizontal);
        if (tVar != null) {
            int iW = tVar.w(z5.a.h(jN));
            this.f13906f = new q1.l(q1.l.a(iW, tVar.V(iW)));
            this.f13902b = tVar instanceof z4.t0 ? (z4.t0) tVar : null;
            this.f13903c = null;
        }
        if (tVar2 != null) {
            int iW2 = tVar2.w(z5.a.h(jN));
            this.f13907g = new q1.l(q1.l.a(iW2, tVar2.V(iW2)));
            this.f13904d = tVar2 instanceof z4.t0 ? (z4.t0) tVar2 : null;
            this.f13905e = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && this.f13901a == ((r0) obj).f13901a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + r8.k.b(0, this.f13901a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + this.f13901a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}

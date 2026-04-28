package z4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1.h0 f47194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f47195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47196c;

    public p0(q0 q0Var, Object obj) {
        this.f47195b = q0Var;
        this.f47196c = obj;
        int[] iArr = q1.r.f35817a;
        this.f47194a = new q1.h0();
    }

    @Override // z4.w1
    public final void a() {
        q0 q0Var = this.f47195b;
        b5.m0 m0Var = q0Var.f47200a;
        q0Var.g();
        q1.t0 t0Var = q0Var.f47209j;
        Object obj = this.f47196c;
        b5.m0 m0Var2 = (b5.m0) t0Var.k(obj);
        if (m0Var2 != null) {
            if (q0Var.f47213o <= 0) {
                y4.a.b("No pre-composed items to dispose");
            }
            int i11 = ((o3.e) ((o3.b) m0Var.o()).f31822b).i(m0Var2);
            if (i11 < ((o3.e) ((o3.b) m0Var.o()).f31822b).f31832c - q0Var.f47213o) {
                y4.a.b("Item is not in pre-composed item range");
            }
            q0Var.f47212n++;
            q0Var.f47213o--;
            j0 j0Var = (j0) q0Var.f47205f.d(m0Var2);
            if (j0Var != null) {
                q0.d(j0Var);
            }
            int i12 = (((o3.e) ((o3.b) m0Var.o()).f31822b).f31832c - q0Var.f47213o) - q0Var.f47212n;
            q0Var.i(i11, i12);
            q0Var.f(i12);
        }
        if (q0Var.f47211m.h(obj)) {
            b5.m0.Y(m0Var, true, 6);
        }
    }

    @Override // z4.w1
    public final int b() {
        b5.m0 m0Var = (b5.m0) this.f47195b.f47209j.d(this.f47196c);
        if (m0Var != null) {
            return ((o3.e) ((o3.b) m0Var.n()).f31822b).f31832c;
        }
        return 0;
    }

    @Override // z4.w1
    public final long c(int i11) {
        b5.m0 m0Var = (b5.m0) this.f47195b.f47209j.d(this.f47196c);
        if (m0Var == null || !m0Var.I()) {
            return 0L;
        }
        int i12 = ((o3.e) ((o3.b) m0Var.n()).f31822b).f31832c;
        if (i11 < 0 || i11 >= i12) {
            y4.a.d("Index (" + i11 + ") is out of bound of [0, " + i12 + ')');
        }
        if (!this.f47194a.a(i11)) {
            return 0L;
        }
        return (((long) ((b5.m0) ((o3.b) m0Var.n()).get(i11)).H.f5942p.f47183a) << 32) | (((long) ((b5.m0) ((o3.b) m0Var.n()).get(i11)).H.f5942p.f47184b) & 4294967295L);
    }

    @Override // z4.w1
    public final void d(int i11, long j9) {
        q0 q0Var = this.f47195b;
        b5.m0 m0Var = (b5.m0) q0Var.f47209j.d(this.f47196c);
        if (m0Var == null || !m0Var.I()) {
            return;
        }
        int i12 = ((o3.e) ((o3.b) m0Var.n()).f31822b).f31832c;
        if (i11 < 0 || i11 >= i12) {
            y4.a.d("Index (" + i11 + ") is out of bound of [0, " + i12 + ')');
        }
        if (m0Var.J()) {
            y4.a.a("Pre-measure called on node that is not placed");
        }
        b5.m0 m0Var2 = q0Var.f47200a;
        m0Var2.f5881r = true;
        ((c5.y) b5.p0.a(m0Var)).v((b5.m0) ((o3.b) m0Var.n()).get(i11), j9);
        m0Var2.f5881r = false;
        this.f47194a.b(i11);
    }

    @Override // z4.w1
    public final void e(g9.d0 d0Var) {
        b5.l1 l1Var;
        b4.s sVar;
        b5.m0 m0Var = (b5.m0) this.f47195b.f47209j.d(this.f47196c);
        if (m0Var == null || (l1Var = m0Var.G) == null || (sVar = l1Var.f5860f) == null) {
            return;
        }
        b5.o.q(sVar, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", d0Var);
    }
}

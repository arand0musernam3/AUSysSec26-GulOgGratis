package t1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m3.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2.s0 f39537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f39538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.k1 f39540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m3.k1 f39541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3.i1 f39542f = new m3.i1(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m3.i1 f39543g = new m3.i1(Long.MIN_VALUE);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m3.k1 f39544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z3.r f39545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z3.r f39546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m3.k1 f39547k;
    public final m3.i0 l;

    public q1(h2.s0 s0Var, q1 q1Var, String str) {
        this.f39537a = s0Var;
        this.f39538b = q1Var;
        this.f39539c = str;
        this.f39540d = m3.i.w(s0Var.j());
        this.f39541e = m3.i.w(new o1(s0Var.j(), s0Var.j()));
        Boolean bool = Boolean.FALSE;
        this.f39544h = m3.i.w(bool);
        this.f39545i = new z3.r();
        this.f39546j = new z3.r();
        this.f39547k = m3.i.w(bool);
        this.l = m3.i.q(new p9.h(this, 2));
        s0Var.n(this);
    }

    public final void a(Object obj, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1493585151);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar.f(obj) : sVar.h(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(this) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            if (h()) {
                sVar.a0(416369985);
            } else {
                sVar.a0(466062241);
                q(obj);
                int i13 = i12 & 112;
                boolean z11 = i13 == 32;
                Object objM = sVar.M();
                m3.f fVar = m3.m.f29332a;
                if (z11 || objM == fVar) {
                    objM = m3.i.q(new p9.h(this, 1));
                    sVar.k0(objM);
                }
                if (((Boolean) ((c3) objM).getValue()).booleanValue()) {
                    sVar.a0(466470356);
                    Object objM2 = sVar.M();
                    if (objM2 == fVar) {
                        objM2 = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
                        sVar.k0(objM2);
                    }
                    v80.b0 b0Var = (v80.b0) objM2;
                    boolean zH = sVar.h(b0Var) | (i13 == 32);
                    Object objM3 = sVar.M();
                    if (zH || objM3 == fVar) {
                        objM3 = new ry.b(5, b0Var, this);
                        sVar.k0(objM3);
                    }
                    m3.i.c(b0Var, this, (Function1) objM3, sVar);
                } else {
                    sVar.a0(416369985);
                }
                sVar.q(false);
            }
            sVar.q(false);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.x(this, obj, i11, 28);
        }
    }

    public final long b() {
        z3.r rVar = this.f39545i;
        int size = rVar.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, ((p1) rVar.get(i11)).l.h());
        }
        z3.r rVar2 = this.f39546j;
        int size2 = rVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            jMax = Math.max(jMax, ((q1) rVar2.get(i12)).b());
        }
        return jMax;
    }

    public final void c() {
        z3.r rVar = this.f39545i;
        int size = rVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            p1 p1Var = (p1) rVar.get(i11);
            p1Var.f39509f = null;
            p1Var.f39508e = null;
            p1Var.f39512i = false;
        }
        z3.r rVar2 = this.f39546j;
        int size2 = rVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((q1) rVar2.get(i12)).c();
        }
    }

    public final boolean d() {
        z3.r rVar = this.f39545i;
        int size = rVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((p1) rVar.get(i11)).f39508e != null) {
                return true;
            }
        }
        z3.r rVar2 = this.f39546j;
        int size2 = rVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (((q1) rVar2.get(i12)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        q1 q1Var = this.f39538b;
        return q1Var != null ? q1Var.e() : this.f39542f.h();
    }

    public final n1 f() {
        return (n1) this.f39541e.getValue();
    }

    public final long g() {
        return ((Number) this.l.getValue()).longValue();
    }

    public final boolean h() {
        return ((Boolean) this.f39547k.getValue()).booleanValue();
    }

    public final void i(long j9, boolean z11) {
        m3.i1 i1Var = this.f39543g;
        long jH = i1Var.h();
        h2.s0 s0Var = this.f39537a;
        if (jH == Long.MIN_VALUE) {
            i1Var.i(j9);
            ((m3.k1) s0Var.f21216b).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((m3.k1) s0Var.f21216b).getValue()).booleanValue()) {
            ((m3.k1) s0Var.f21216b).setValue(Boolean.TRUE);
        }
        this.f39544h.setValue(Boolean.FALSE);
        z3.r rVar = this.f39545i;
        int size = rVar.size();
        boolean z12 = true;
        for (int i11 = 0; i11 < size; i11++) {
            p1 p1Var = (p1) rVar.get(i11);
            m3.k1 k1Var = p1Var.f39510g;
            m3.k1 k1Var2 = p1Var.f39510g;
            if (!((Boolean) k1Var.getValue()).booleanValue()) {
                long jB = z11 ? p1Var.b().b() : j9;
                p1Var.e(p1Var.b().f(jB));
                p1Var.f39514k = p1Var.b().d(jB);
                if (p1Var.b().e(jB)) {
                    k1Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) k1Var2.getValue()).booleanValue()) {
                z12 = false;
            }
        }
        z3.r rVar2 = this.f39546j;
        int size2 = rVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            q1 q1Var = (q1) rVar2.get(i12);
            m3.k1 k1Var3 = q1Var.f39540d;
            h2.s0 s0Var2 = q1Var.f39537a;
            if (!Intrinsics.areEqual(k1Var3.getValue(), s0Var2.j())) {
                q1Var.i(j9, z11);
            }
            if (!Intrinsics.areEqual(q1Var.f39540d.getValue(), s0Var2.j())) {
                z12 = false;
            }
        }
        if (z12) {
            j();
        }
    }

    public final void j() {
        this.f39543g.i(Long.MIN_VALUE);
        h2.s0 s0Var = this.f39537a;
        if (s0Var instanceof k0) {
            ((k0) s0Var).m(this.f39540d.getValue());
        }
        o(0L);
        ((m3.k1) s0Var.f21216b).setValue(Boolean.FALSE);
        z3.r rVar = this.f39546j;
        int size = rVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((q1) rVar.get(i11)).j();
        }
    }

    public final void k(float f11) {
        z3.r rVar = this.f39545i;
        int size = rVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            p1 p1Var = (p1) rVar.get(i11);
            p1Var.getClass();
            if (f11 == -4.0f || f11 == -5.0f) {
                k1 k1Var = p1Var.f39509f;
                if (k1Var != null) {
                    p1Var.b().h(k1Var.f39475c);
                    p1Var.f39508e = null;
                    p1Var.f39509f = null;
                }
                Object obj = f11 == -4.0f ? p1Var.b().f39476d : p1Var.b().f39475c;
                p1Var.b().h(obj);
                p1Var.b().i(obj);
                p1Var.e(obj);
                p1Var.l.i(p1Var.b().b());
            } else {
                p1Var.f39511h.i(f11);
            }
        }
        z3.r rVar2 = this.f39546j;
        int size2 = rVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((q1) rVar2.get(i12)).k(f11);
        }
    }

    public final void l(Object obj, Object obj2) {
        this.f39543g.i(Long.MIN_VALUE);
        h2.s0 s0Var = this.f39537a;
        ((m3.k1) s0Var.f21216b).setValue(Boolean.FALSE);
        boolean zH = h();
        m3.k1 k1Var = this.f39540d;
        if (!zH || !Intrinsics.areEqual(s0Var.j(), obj) || !Intrinsics.areEqual(k1Var.getValue(), obj2)) {
            if (!Intrinsics.areEqual(s0Var.j(), obj) && (s0Var instanceof k0)) {
                ((k0) s0Var).m(obj);
            }
            k1Var.setValue(obj2);
            this.f39547k.setValue(Boolean.TRUE);
            this.f39541e.setValue(new o1(obj, obj2));
        }
        z3.r rVar = this.f39546j;
        int size = rVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            q1 q1Var = (q1) rVar.get(i11);
            q1Var.getClass();
            if (q1Var.h()) {
                q1Var.l(q1Var.f39537a.j(), q1Var.f39540d.getValue());
            }
        }
        z3.r rVar2 = this.f39545i;
        int size2 = rVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((p1) rVar2.get(i12)).d(0L);
        }
    }

    public final void m(long j9) {
        m3.i1 i1Var = this.f39543g;
        if (i1Var.h() == Long.MIN_VALUE) {
            i1Var.i(j9);
        }
        o(j9);
        this.f39544h.setValue(Boolean.FALSE);
        z3.r rVar = this.f39545i;
        int size = rVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((p1) rVar.get(i11)).d(j9);
        }
        z3.r rVar2 = this.f39546j;
        int size2 = rVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            q1 q1Var = (q1) rVar2.get(i12);
            if (!Intrinsics.areEqual(q1Var.f39540d.getValue(), q1Var.f39537a.j())) {
                q1Var.m(j9);
            }
        }
    }

    public final void n(r0 r0Var) {
        z3.r rVar = this.f39545i;
        int size = rVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            p1 p1Var = (p1) rVar.get(i11);
            m3.k1 k1Var = p1Var.f39513j;
            if (!Intrinsics.areEqual(p1Var.b().f39475c, p1Var.b().f39476d)) {
                p1Var.f39509f = p1Var.b();
                p1Var.f39508e = r0Var;
            }
            p1Var.f39507d.setValue(new k1(p1Var.f39516n, p1Var.f39504a, k1Var.getValue(), k1Var.getValue(), p1Var.f39514k.c()));
            p1Var.l.i(p1Var.b().b());
            p1Var.f39512i = true;
        }
        z3.r rVar2 = this.f39546j;
        int size2 = rVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((q1) rVar2.get(i12)).n(r0Var);
        }
    }

    public final void o(long j9) {
        if (this.f39538b == null) {
            this.f39542f.i(j9);
        }
    }

    public final void p() {
        k1 k1Var;
        z3.r rVar = this.f39545i;
        int size = rVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            p1 p1Var = (p1) rVar.get(i11);
            r0 r0Var = p1Var.f39508e;
            if (r0Var != null && (k1Var = p1Var.f39509f) != null) {
                long jC = j80.c.c(r0Var.f39560g * ((double) r0Var.f39557d));
                Object objF = k1Var.f(jC);
                if (p1Var.f39512i) {
                    p1Var.b().i(objF);
                }
                p1Var.b().h(objF);
                p1Var.l.i(p1Var.b().b());
                if (p1Var.f39511h.h() == -2.0f || p1Var.f39512i) {
                    p1Var.e(objF);
                } else {
                    p1Var.d(p1Var.f39517o.e());
                }
                if (jC >= r0Var.f39560g) {
                    p1Var.f39508e = null;
                    p1Var.f39509f = null;
                } else {
                    r0Var.f39556c = false;
                }
            }
        }
        z3.r rVar2 = this.f39546j;
        int size2 = rVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((q1) rVar2.get(i12)).p();
        }
    }

    public final void q(Object obj) {
        m3.k1 k1Var = this.f39540d;
        if (Intrinsics.areEqual(k1Var.getValue(), obj)) {
            return;
        }
        this.f39541e.setValue(new o1(k1Var.getValue(), obj));
        h2.s0 s0Var = this.f39537a;
        if (!Intrinsics.areEqual(s0Var.j(), k1Var.getValue())) {
            s0Var.m(k1Var.getValue());
        }
        k1Var.setValue(obj);
        if (this.f39543g.h() == Long.MIN_VALUE) {
            this.f39544h.setValue(Boolean.TRUE);
        }
        z3.r rVar = this.f39545i;
        int size = rVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((p1) rVar.get(i11)).f39511h.i(-2.0f);
        }
    }

    public final String toString() {
        z3.r rVar = this.f39545i;
        int size = rVar.size();
        String str = "Transition animation values: ";
        for (int i11 = 0; i11 < size; i11++) {
            str = str + ((p1) rVar.get(i11)) + ", ";
        }
        return str;
    }
}

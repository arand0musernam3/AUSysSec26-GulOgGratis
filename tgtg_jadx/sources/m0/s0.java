package m0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import s0.n2;
import s0.o2;
import s0.r2;
import s0.u1;
import s0.v1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends m1 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final q0 f28590y = new q0();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final w0.c f28591z = w.b.U();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r0 f28592r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Executor f28593s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public u1 f28594t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public e1 f28595u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c1.n f28596v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h1 f28597w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public v1 f28598x;

    public final void D() {
        v1 v1Var = this.f28598x;
        if (v1Var != null) {
            v1Var.b();
            this.f28598x = null;
        }
        e1 e1Var = this.f28595u;
        if (e1Var != null) {
            e1Var.a();
            this.f28595u = null;
        }
        c1.n nVar = this.f28596v;
        if (nVar != null) {
            nVar.b();
            this.f28596v = null;
        }
        h1 h1Var = this.f28597w;
        if (h1Var != null) {
            synchronized (h1Var.f28514a) {
                h1Var.f28525m = null;
                h1Var.f28526n = null;
            }
        }
        this.f28597w = null;
    }

    public final void E(r0 r0Var) {
        a.a.t();
        this.f28592r = r0Var;
        this.f28593s = f28591z;
        if (c() != null) {
            F((s0.m1) this.f28560i, this.f28561j);
            p();
        }
        this.f28556e = k1.ACTIVE;
        q();
    }

    public final void F(s0.m1 m1Var, s0.n nVar) {
        a.a.t();
        s0.i0 i0VarD = d();
        Objects.requireNonNull(i0VarD);
        D();
        pd.g.n(null, this.f28596v == null);
        Matrix matrix = this.f28563m;
        boolean zO = i0VarD.o();
        Size size = nVar.f38402a;
        Rect rect = this.l;
        if (rect == null) {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        int i11 = i(i0VarD, n(i0VarD));
        s0.d1 d1Var = (s0.d1) this.f28560i;
        s0.g gVar = s0.d1.B0;
        c1.n nVar2 = new c1.n(1, 34, nVar, matrix, zO, rect, i11, ((Integer) d1Var.i(gVar, -1)).intValue(), i0VarD.o() && n(i0VarD));
        this.f28596v = nVar2;
        l lVar = new l(this, 1);
        a.a.t();
        nVar2.a();
        nVar2.f6907m.add(lVar);
        h1 h1VarC = this.f28596v.c(i0VarD, true);
        this.f28597w = h1VarC;
        this.f28595u = h1VarC.f28524k;
        if (this.f28592r != null) {
            s0.i0 i0VarD2 = d();
            c1.n nVar3 = this.f28596v;
            if (i0VarD2 != null && nVar3 != null) {
                a.a.K(new c1.l(nVar3, i(i0VarD2, n(i0VarD2)), ((Integer) ((s0.d1) this.f28560i).i(gVar, -1)).intValue()));
            }
            r0 r0Var = this.f28592r;
            r0Var.getClass();
            h1 h1Var = this.f28597w;
            h1Var.getClass();
            this.f28593s.execute(new com.google.firebase.messaging.r(29, r0Var, h1Var));
        }
        u1 u1VarD = u1.d(m1Var, nVar.f38402a);
        i0.w wVar = u1VarD.f38447b;
        u1VarD.f38453h = nVar.f38405d;
        a(u1VarD, nVar);
        int iT = m1Var.t();
        if (iT != 0) {
            wVar.getClass();
            if (iT != 0) {
                ((s0.i1) wVar.f22747d).v(o2.V0, Integer.valueOf(iT));
            }
        }
        s0.u0 u0Var = nVar.f38407f;
        if (u0Var != null) {
            wVar.e(u0Var);
        }
        if (this.f28592r != null) {
            u1VarD.b(this.f28595u, nVar.f38404c, ((Integer) ((s0.d1) this.f28560i).i(s0.d1.C0, -1)).intValue());
        }
        v1 v1Var = this.f28598x;
        if (v1Var != null) {
            v1Var.b();
        }
        v1 v1Var2 = new v1(new g0(this, 1));
        this.f28598x = v1Var2;
        u1VarD.f38451f = v1Var2;
        this.f28594t = u1VarD;
        Object[] objArr = {u1VarD.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
    }

    @Override // m0.m1
    public final o2 g(boolean z11, r2 r2Var) {
        f28590y.getClass();
        s0.m1 m1Var = q0.f28586a;
        s0.u0 u0VarA = r2Var.a(m1Var.n(), 1);
        if (z11) {
            u0VarA = s0.u0.u(u0VarA, m1Var);
        }
        if (u0VarA == null) {
            return null;
        }
        return new s0.m1(s0.l1.e(((x) m(u0VarA)).f28633a));
    }

    @Override // m0.m1
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // m0.m1
    public final n2 m(s0.u0 u0Var) {
        return new x(s0.i1.s(u0Var));
    }

    @Override // m0.m1
    public final o2 t(s0.g0 g0Var, n2 n2Var) {
        n2Var.d().v(s0.c1.f38307w0, 34);
        return n2Var.f();
    }

    public final String toString() {
        return "Preview:".concat(h());
    }

    @Override // m0.m1
    public final s0.n w(s0.u0 u0Var) {
        this.f28594t.a(u0Var);
        Object[] objArr = {this.f28594t.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
        g40.b bVarB = this.f28561j.b();
        bVarB.f20005f = u0Var;
        return bVarB.d();
    }

    @Override // m0.m1
    public final s0.n x(s0.n nVar, s0.n nVar2) {
        wd.a.p("Preview", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + nVar + ", secondaryStreamSpec " + nVar2);
        F((s0.m1) this.f28560i, nVar);
        return nVar;
    }

    @Override // m0.m1
    public final void y() {
        D();
    }

    @Override // m0.m1
    public final void z(Rect rect) {
        this.l = rect;
        s0.i0 i0VarD = d();
        c1.n nVar = this.f28596v;
        if (i0VarD == null || nVar == null) {
            return;
        }
        a.a.K(new c1.l(nVar, i(i0VarD, n(i0VarD)), ((Integer) ((s0.d1) this.f28560i).i(s0.d1.B0, -1)).intValue()));
    }
}

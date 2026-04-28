package v1;

import android.view.View;
import b5.l2;
import com.google.android.gms.internal.measurement.cg;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends b4.s implements b5.s, b5.r, l2, b5.y1 {
    public m3.i0 B;
    public z5.l D;
    public x80.i E;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Function1 f41739o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Function1 f41740p;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r1 f41747w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f41748x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public z5.c f41749y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public q1 f41750z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f41741q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f41742r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f41743s = 9205357640488583168L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f41744t = Float.NaN;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f41745u = Float.NaN;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f41746v = true;
    public final m3.k1 A = new m3.k1(null, m3.f.f29272d);
    public long C = 9205357640488583168L;

    public h1(Function1 function1, Function1 function12, r1 r1Var) {
        this.f41739o = function1;
        this.f41740p = function12;
        this.f41747w = r1Var;
    }

    public final long L0() {
        if (this.B == null) {
            this.B = m3.i.q(new g1(this, 2));
        }
        m3.i0 i0Var = this.B;
        if (i0Var != null) {
            return ((h4.b) i0Var.getValue()).f21378a;
        }
        return 9205357640488583168L;
    }

    public final void M0() {
        q1 q1Var = this.f41750z;
        if (q1Var != null) {
            ((fv.b) q1Var).d();
        }
        View viewN = this.f41748x;
        if (viewN == null) {
            viewN = b5.o.n(this);
        }
        View view = viewN;
        this.f41748x = view;
        z5.c cVar = this.f41749y;
        if (cVar == null) {
            cVar = b5.m.g(this).f5889z;
        }
        z5.c cVar2 = cVar;
        this.f41749y = cVar2;
        this.f41750z = this.f41747w.b(view, this.f41742r, this.f41743s, this.f41744t, this.f41745u, this.f41746v, cVar2, this.f41741q);
        O0();
    }

    public final void N0() {
        z5.c cVar = this.f41749y;
        if (cVar == null) {
            cVar = b5.m.g(this).f5889z;
            this.f41749y = cVar;
        }
        long j9 = ((h4.b) this.f41739o.invoke(cVar)).f21378a;
        if ((j9 & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & L0()) == 9205357640488583168L) {
            this.C = 9205357640488583168L;
            q1 q1Var = this.f41750z;
            if (q1Var != null) {
                ((fv.b) q1Var).d();
                return;
            }
            return;
        }
        this.C = h4.b.f(L0(), j9);
        if (this.f41750z == null) {
            M0();
        }
        q1 q1Var2 = this.f41750z;
        if (q1Var2 != null) {
            q1Var2.a(this.C, 9205357640488583168L, this.f41741q);
        }
        O0();
    }

    public final void O0() {
        z5.c cVar;
        q1 q1Var = this.f41750z;
        if (q1Var == null || (cVar = this.f41749y) == null) {
            return;
        }
        fv.b bVar = (fv.b) q1Var;
        long jE = bVar.e();
        z5.l lVar = this.D;
        if (lVar != null && jE == lVar.f47286a) {
            return;
        }
        Function1 function1 = this.f41740p;
        if (function1 != null) {
            function1.invoke(new z5.h(cVar.m(b0.z.z(bVar.e()))));
        }
        this.D = new z5.l(bVar.e());
    }

    @Override // b5.l2
    public final void h0(j5.b0 b0Var) {
        b0Var.b(i1.f41764a, new g1(this, 1));
    }

    @Override // b5.y1
    public final void l0() {
        b5.o.m(this, new g1(this, 0));
    }

    @Override // b5.r
    public final void n(b5.o0 o0Var) {
        o0Var.b();
        x80.i iVar = this.E;
        if (iVar != null) {
            iVar.h(Unit.f26487a);
        }
    }

    @Override // b4.s
    public final void onAttach() {
        l0();
        this.E = cg.a(0, null, null, 7);
        v80.f0.B(getCoroutineScope(), null, v80.d0.UNDISPATCHED, new sf.a(this, null, 11), 1);
    }

    @Override // b4.s
    public final void onDetach() {
        q1 q1Var = this.f41750z;
        if (q1Var != null) {
            ((fv.b) q1Var).d();
        }
        this.f41750z = null;
    }

    @Override // b5.s
    public final void v(z4.z zVar) {
        this.A.setValue(zVar);
    }
}

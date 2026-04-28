package z1;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import y00.i4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 extends f1 implements u4.e, b5.l2 {
    public v1.o1 I;
    public l1 J;
    public final v4.d K;
    public final r2 L;
    public final e0 M;
    public final l3 N;
    public final a3 O;
    public final g4.c0 P;
    public final z Q;
    public c3 T;
    public e3 V;
    public g2 W;

    public g3(b2.l lVar, v1.o1 o1Var, u uVar, l1 l1Var, h2 h2Var, h3 h3Var, boolean z11, boolean z12) {
        super(y2.f46774a, z11, lVar, h2Var);
        this.I = o1Var;
        this.J = l1Var;
        v4.d dVar = new v4.d();
        this.K = dVar;
        r2 r2Var = new r2();
        r2Var.f46668o = z11;
        L0(r2Var);
        this.L = r2Var;
        e0 e0Var = new e0(new t1.s(new jb.b((z5.c) y2.f46777d)));
        this.M = e0Var;
        v1.o1 o1Var2 = this.I;
        l1 l1Var2 = this.J;
        l3 l3Var = new l3(h3Var, o1Var2, l1Var2 == null ? e0Var : l1Var2, h2Var, z12, dVar, this, new b3(this, 0));
        this.N = l3Var;
        a3 a3Var = new a3(l3Var, z11);
        this.O = a3Var;
        g4.g0 g0Var = new g4.g0(2, 10, null);
        L0(g0Var);
        this.P = g0Var;
        z zVar = new z(h2Var, l3Var, z12, uVar, new b3(this, 1));
        L0(zVar);
        this.Q = zVar;
        L0(new v4.i(a3Var, dVar));
        j2.g gVar = new j2.g();
        gVar.f24445o = zVar;
        L0(gVar);
    }

    @Override // z1.f1
    public final Object S0(d1 d1Var, e1 e1Var) {
        v1.j1 j1Var = v1.j1.UserInput;
        l3 l3Var = this.N;
        Object objF = l3Var.f(j1Var, new d3(d1Var, l3Var, (x70.c) null, 0), e1Var);
        return objF == y70.a.COROUTINE_SUSPENDED ? objF : Unit.f26487a;
    }

    @Override // z1.f1
    public final void Y0(p0 p0Var) {
        v80.f0.B(this.K.c(), null, null, new a2(p0Var, this, null, 3), 3);
    }

    @Override // z1.f1
    public final boolean d1() {
        l3 l3Var = this.N;
        if (l3Var.f46584a.b()) {
            return true;
        }
        v1.o1 o1Var = l3Var.f46585b;
        if (o1Var == null) {
            return false;
        }
        v1.n0 n0Var = ((v1.i) o1Var).f41753c;
        EdgeEffect edgeEffect = n0Var.f41794d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? v1.l.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = n0Var.f41795e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? v1.l.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = n0Var.f41796f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? v1.l.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = n0Var.f41797g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? v1.l.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    @Override // u4.e
    public final boolean e(KeyEvent keyEvent) {
        return false;
    }

    public final void g1(b2.l lVar, v1.o1 o1Var, u uVar, l1 l1Var, h2 h2Var, h3 h3Var, boolean z11, boolean z12) {
        boolean z13;
        boolean z14 = true;
        boolean z15 = false;
        if (this.f46499s != z11) {
            this.O.f46400b = z11;
            this.L.f46668o = z11;
            z13 = true;
        } else {
            z13 = false;
        }
        l1 l1Var2 = l1Var == null ? this.M : l1Var;
        l3 l3Var = this.N;
        if (!Intrinsics.areEqual(l3Var.f46584a, h3Var)) {
            l3Var.f46584a = h3Var;
            z15 = true;
        }
        l3Var.f46585b = o1Var;
        if (l3Var.f46587d != h2Var) {
            l3Var.f46587d = h2Var;
            z15 = true;
        }
        if (l3Var.f46588e != z12) {
            l3Var.f46588e = z12;
        } else {
            z14 = z15;
        }
        l3Var.f46586c = l1Var2;
        l3Var.f46589f = this.K;
        z zVar = this.Q;
        zVar.f46779o = h2Var;
        zVar.f46781q = z12;
        zVar.f46782r = uVar;
        this.I = o1Var;
        this.J = l1Var;
        yj.m mVar = y2.f46774a;
        h2 h2Var2 = l3Var.f46587d;
        h2 h2Var3 = h2.Vertical;
        if (h2Var2 != h2Var3) {
            h2Var3 = h2.Horizontal;
        }
        f1(mVar, z11, lVar, h2Var3, z14);
        if (z13) {
            this.T = null;
            this.V = null;
            b5.m.g(this).G();
        }
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b5.l2
    public final void h0(j5.b0 b0Var) {
        if (this.f46499s && (this.T == null || this.V == null)) {
            this.T = new c3(this, 0);
            this.V = new e3(this, null);
        }
        c3 c3Var = this.T;
        if (c3Var != null) {
            KProperty[] kPropertyArr = j5.z.f24734a;
            b0Var.b(j5.m.f24660d, new j5.a(null, c3Var));
        }
        e3 e3Var = this.V;
        if (e3Var != null) {
            KProperty[] kPropertyArr2 = j5.z.f24734a;
            b0Var.b(j5.m.f24661e, e3Var);
        }
    }

    @Override // b4.s
    public final void onAttach() {
        if (isAttached()) {
            z5.c cVar = b5.m.g(this).f5889z;
            e0 e0Var = this.M;
            e0Var.getClass();
            e0Var.f46477a = new t1.s(new jb.b(cVar));
        }
        g2 g2Var = this.W;
        if (g2Var != null) {
            g2Var.f46523d = b5.m.g(this).f5889z;
        }
    }

    @Override // b5.l, b5.i2
    public final void onDensityChange() {
        F();
        if (isAttached()) {
            z5.c cVar = b5.m.g(this).f5889z;
            e0 e0Var = this.M;
            e0Var.getClass();
            e0Var.f46477a = new t1.s(new jb.b(cVar));
        }
        g2 g2Var = this.W;
        if (g2Var != null) {
            g2Var.f46523d = b5.m.g(this).f5889z;
        }
    }

    @Override // z1.f1, b5.i2
    public final void p0(w4.n nVar, w4.o oVar, long j9) {
        List list = nVar.f43165a;
        List list2 = nVar.f43165a;
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            if (((Boolean) this.f46498r.invoke(new w4.d0(((w4.v) list.get(i11)).f43186i))).booleanValue()) {
                super.p0(nVar, oVar, j9);
                break;
            }
            i11++;
        }
        if (this.f46499s) {
            if (oVar == w4.o.Initial && nVar.f43170f == 6) {
                if (this.W == null) {
                    this.W = new g2(this.N, new i4(ViewConfiguration.get(b5.o.n(this).getContext()), 4), new gf.h(2, this, g3.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 3), b5.m.g(this).f5889z);
                }
                g2 g2Var = this.W;
                if (g2Var != null) {
                    v80.b0 coroutineScope = getCoroutineScope();
                    if (g2Var.f46526g == null) {
                        g2Var.f46526g = v80.f0.B(coroutineScope, null, null, new a2(g2Var, null, 1), 3);
                    }
                }
            }
            g2 g2Var2 = this.W;
            if (g2Var2 == null || nVar.f43170f != 6) {
                return;
            }
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                if (((w4.v) list2.get(i12)).b()) {
                    return;
                }
            }
            if (oVar == w4.o.Initial && g2Var2.f46525f) {
                g2Var2.d(nVar);
                int size3 = list2.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    ((w4.v) list2.get(i13)).a();
                }
            }
            if (oVar == w4.o.Main && !g2Var2.f46525f && g2Var2.d(nVar)) {
                int size4 = list2.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    ((w4.v) list2.get(i14)).a();
                }
            }
        }
    }

    @Override // u4.e
    public final boolean w(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.f46499s || ((!u4.a.a(u4.c.b(keyEvent), u4.a.D) && !u4.a.a(u4.c.a(keyEvent.getKeyCode()), u4.a.C)) || u4.c.c(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z11 = this.N.f46587d == h2.Vertical;
        z zVar = this.Q;
        if (z11) {
            int i11 = (int) (zVar.f46786v & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(u4.a.a(u4.c.a(keyEvent.getKeyCode()), u4.a.C) ? i11 : -i11)));
        } else {
            int i12 = (int) (zVar.f46786v >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(u4.a.a(u4.c.a(keyEvent.getKeyCode()), u4.a.C) ? i12 : -i12)) << 32);
        }
        v80.f0.B(getCoroutineScope(), null, null, new e3(this, jFloatToRawIntBits, null, 0), 3);
        return true;
    }

    @Override // z1.f1
    public final void X0(long j9) {
    }
}

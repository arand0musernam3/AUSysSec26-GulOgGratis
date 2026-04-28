package d2;

import c5.l3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f13755a = new b(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f13756b = new b(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f13757c = new j0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13758d = 9;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f13759e = 6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f13760f = 10;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f13761g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f13762h = 15;

    public static final b4.t A(b4.t tVar, float f11, float f12) {
        return tVar.then(new v1(f11, f12, f11, f12, new r1(f11, f12, 2)));
    }

    public static b4.t B(b4.t tVar, float f11, float f12, int i11) {
        if ((i11 & 1) != 0) {
            f11 = 0;
        }
        if ((i11 & 2) != 0) {
            f12 = 0;
        }
        return A(tVar, f11, f12);
    }

    public static final b4.t C(b4.t tVar, final float f11, final float f12, final float f13, final float f14) {
        return tVar.then(new v1(f11, f12, f13, f14, new Function1() { // from class: d2.x1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                c5.o2 o2Var = (c5.o2) obj;
                o2Var.f7307a = "padding";
                l3 l3Var = o2Var.f7309c;
                l3Var.b(new z5.f(f11), "start");
                l3Var.b(new z5.f(f12), "top");
                l3Var.b(new z5.f(f13), "end");
                l3Var.b(new z5.f(f14), "bottom");
                return Unit.f26487a;
            }
        }));
    }

    public static b4.t D(b4.t tVar, float f11, float f12, float f13, float f14, int i11) {
        if ((i11 & 1) != 0) {
            f11 = 0;
        }
        if ((i11 & 2) != 0) {
            f12 = 0;
        }
        if ((i11 & 4) != 0) {
            f13 = 0;
        }
        if ((i11 & 8) != 0) {
            f14 = 0;
        }
        return C(tVar, f11, f12, f13, f14);
    }

    public static final b4.t E(b4.t tVar) {
        return tVar.then(new o2(c5.m2.f7291a, new cp.i(11)));
    }

    public static final b4.t F(b4.t tVar) {
        return tVar.then(new o2(c5.m2.f7291a, new cp.i(12)));
    }

    public static final long G(long j9, m1 m1Var) {
        return m1Var == m1.Horizontal ? z5.b.a(z5.a.k(j9), z5.a.i(j9), z5.a.j(j9), z5.a.h(j9)) : z5.b.a(z5.a.j(j9), z5.a.h(j9), z5.a.k(j9), z5.a.i(j9));
    }

    public static final f1 H(x6.d dVar) {
        return new f1(dVar.f43873a, dVar.f43874b, dVar.f43875c, dVar.f43876d);
    }

    public static final void I(String str, StringBuilder sb2) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    public static final b4.t J(b4.t tVar, i1 i1Var) {
        return tVar.then(new k1(i1Var, c5.m2.f7291a));
    }

    public static final b4.t K(b4.t tVar, y2 y2Var) {
        return tVar.then(new b1(y2Var, c5.m2.f7291a));
    }

    public static final void a(b4.t tVar, b4.f fVar, u3.d dVar, m3.n nVar, int i11, int i12) {
        int i13;
        u3.d dVar2;
        b4.f fVar2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(380139498);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else {
            i13 = i11 | (sVar.f(tVar) ? 4 : 2);
        }
        int i15 = i13 | 432;
        if (sVar.R(i15 & 1, (i15 & 1171) != 1170)) {
            if (i14 != 0) {
                tVar = b4.q.f5711a;
            }
            b4.k kVar = b4.d.f5683a;
            z4.u0 u0VarD = p.d(kVar, false);
            boolean zF = sVar.f(u0VarD);
            Object objM = sVar.M();
            if (zF || objM == m3.m.f29332a) {
                dVar2 = dVar;
                objM = new a3.u2(8, u0VarD, dVar2);
                sVar.k0(objM);
            } else {
                dVar2 = dVar;
            }
            z4.c0.b(tVar, (Function2) objM, sVar, i15 & 14, 0);
            fVar2 = kVar;
        } else {
            dVar2 = dVar;
            sVar.U();
            fVar2 = fVar;
        }
        b4.t tVar2 = tVar;
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(tVar2, fVar2, dVar2, i11, i12, 2);
        }
    }

    public static final b2 b(float f11) {
        return new b2(f11, f11, f11, f11);
    }

    public static b2 c(float f11, float f12, int i11) {
        if ((i11 & 1) != 0) {
            f11 = 0;
        }
        if ((i11 & 2) != 0) {
            f12 = 0;
        }
        return new b2(f11, f12, f11, f12);
    }

    public static final b2 d(float f11, float f12, float f13, float f14) {
        return new b2(f11, f12, f13, f14);
    }

    public static b2 e(float f11, float f12, float f13, float f14, int i11) {
        if ((i11 & 1) != 0) {
            f11 = 0;
        }
        if ((i11 & 2) != 0) {
            f12 = 0;
        }
        if ((i11 & 4) != 0) {
            f13 = 0;
        }
        if ((i11 & 8) != 0) {
            f14 = 0;
        }
        return new b2(f11, f12, f13, f14);
    }

    public static final void f(b4.t tVar, m3.n nVar) {
        o oVar = o.f13867c;
        m3.s sVar = (m3.s) nVar;
        int iHashCode = Long.hashCode(sVar.T);
        b4.t tVarC = b4.a.c(tVar, nVar);
        u3.i iVarL = sVar.l();
        b5.j.R.getClass();
        b5.h hVar = b5.i.f5839b;
        b5.r2 r2Var = sVar.f29417a;
        sVar.e0();
        if (sVar.S) {
            sVar.k(hVar);
        } else {
            sVar.n0();
        }
        m3.i.C(oVar, b5.i.f5843f, nVar);
        m3.i.C(iVarL, b5.i.f5842e, nVar);
        m3.i.z(nVar, b5.i.f5845h);
        m3.i.C(tVarC, b5.i.f5841d, nVar);
        m3.i.v(nVar, Integer.valueOf(iHashCode), b5.i.f5844g);
        sVar.q(true);
    }

    public static i0 g(float f11, float f12, int i11) {
        if ((i11 & 1) != 0) {
            f11 = 0;
        }
        if ((i11 & 2) != 0) {
            f12 = 0;
        }
        return new i0(f11, f12, 0, 0);
    }

    public static final b4.t h(b4.t tVar, float f11, float f12) {
        return tVar.then(new q1(f11, f12, false, new r1(f11, f12, 0)));
    }

    public static final e1 j(a aVar, m3.n nVar) {
        return new e1(aVar, (z5.c) ((m3.s) nVar).j(c5.x1.f7416h));
    }

    public static b4.t k(b4.t tVar, float f11) {
        return tVar.then(new j(f11, c5.m2.f7291a));
    }

    public static final float l(z1 z1Var, z5.m mVar) {
        return mVar == z5.m.Ltr ? z1Var.b(mVar) : z1Var.d(mVar);
    }

    public static final float m(z1 z1Var, z5.m mVar) {
        return mVar == z5.m.Ltr ? z1Var.d(mVar) : z1Var.b(mVar);
    }

    public static long n(long j9, m1 m1Var) {
        m1 m1Var2 = m1.Horizontal;
        return z5.b.a(m1Var == m1Var2 ? z5.a.k(j9) : z5.a.j(j9), m1Var == m1Var2 ? z5.a.i(j9) : z5.a.h(j9), m1Var == m1Var2 ? z5.a.j(j9) : z5.a.k(j9), m1Var == m1Var2 ? z5.a.h(j9) : z5.a.i(j9));
    }

    public static final b4.t o(b4.t tVar, j0 j0Var) {
        return tVar.then(new r2(j0Var, c5.m2.f7291a));
    }

    public static long p(int i11, long j9) {
        return z5.b.a(0, z5.a.i(j9), (i11 & 4) != 0 ? z5.a.j(j9) : 0, z5.a.h(j9));
    }

    public static final b4.t q(b4.t tVar, i1 i1Var) {
        return tVar.then(new g1(i1Var, c5.m2.f7291a));
    }

    public static final b4.t r(b4.t tVar) {
        return tVar.then(new o2(c5.m2.f7291a, new cp.i(9)));
    }

    public static final boolean s(int i11, int i12, long j9) {
        int iK = z5.a.k(j9);
        if (i11 > z5.a.i(j9) || iK > i11) {
            return false;
        }
        return i12 <= z5.a.h(j9) && z5.a.j(j9) <= i12;
    }

    public static final b4.t t(b4.t tVar) {
        return tVar.then(new o2(c5.m2.f7291a, new cp.i(10)));
    }

    public static final b4.t u(b4.t tVar, Function1 function1) {
        return tVar.then(new t1(function1, new defpackage.d(function1, 9)));
    }

    public static final b4.t v(b4.t tVar, float f11, float f12) {
        return tVar.then(new q1(f11, f12, true, new r1(f11, f12, 1)));
    }

    public static b4.t w(b4.t tVar, float f11, float f12, int i11) {
        if ((i11 & 1) != 0) {
            f11 = 0;
        }
        if ((i11 & 2) != 0) {
            f12 = 0;
        }
        return v(tVar, f11, f12);
    }

    public static final b4.t x(b4.t tVar, Function1 function1) {
        return tVar.then(new a0(function1, c5.m2.f7291a));
    }

    public static final b4.t y(b4.t tVar, z1 z1Var) {
        return tVar.then(new a2(z1Var, new c50.p(z1Var, 8)));
    }

    public static final b4.t z(b4.t tVar, final float f11) {
        return tVar.then(new v1(f11, f11, f11, f11, new Function1() { // from class: d2.w1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                c5.o2 o2Var = (c5.o2) obj;
                o2Var.f7307a = "padding";
                o2Var.f7308b = new z5.f(f11);
                return Unit.f26487a;
            }
        }));
    }

    public abstract int i(int i11, int i12, z5.m mVar);
}

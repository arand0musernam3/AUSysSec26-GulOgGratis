package z4;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f47094a = new c1(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f47095b = new Object();

    public static final void a(b4.t tVar, u3.d dVar, u0 u0Var, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1663319424);
        int i12 = (sVar.f(tVar) ? 4 : 2) | i11 | (sVar.f(u0Var) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            int iHashCode = Integer.hashCode(Long.hashCode(sVar.T));
            b4.t tVarC = b4.a.c(tVar, sVar);
            u3.i iVarL = sVar.l();
            b5.h hVar = b5.m0.W;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.j.R.getClass();
            m3.i.C(u0Var, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            f0 f0Var = f0.f47116b;
            if (sVar.S) {
                sVar.b(Unit.f26487a, new g2.h(f0Var, 2));
            }
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            r8.k.w(6, dVar, sVar, true);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c5.r0(tVar, dVar, u0Var, i11, 2);
        }
    }

    public static final void b(b4.t tVar, Function2 function2, m3.n nVar, int i11, int i12) {
        int i13;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1298353104);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i13 | (sVar.h(function2) ? 32 : 16);
        if (sVar.R(i15 & 1, (i15 & 19) != 18)) {
            if (i14 != 0) {
                tVar = b4.q.f5711a;
            }
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new y1(c1.f47096b);
                sVar.k0(objM);
            }
            c((y1) objM, tVar, function2, sVar, (i15 << 3) & 1008);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new s1(tVar, function2, i11, i12);
        }
    }

    public static final void c(y1 y1Var, b4.t tVar, Function2 function2, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-511989831);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(y1Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(tVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function2) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            int iHashCode = Long.hashCode(sVar.T);
            m3.q qVarA = m3.i.A(sVar);
            b4.t tVarC = b4.a.c(tVar, sVar);
            u3.i iVarL = sVar.l();
            b5.h hVar = b5.m0.W;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(y1Var, y1Var.f47252c, sVar);
            m3.i.C(qVarA, y1Var.f47253d, sVar);
            m3.i.C(function2, y1Var.f47254e, sVar);
            b5.j.R.getClass();
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            sVar.q(true);
            if (sVar.B()) {
                sVar.a0(-1266202711);
            } else {
                sVar.a0(-1259244916);
                boolean zH = sVar.h(y1Var);
                Object objM = sVar.M();
                if (zH || objM == m3.m.f29332a) {
                    objM = new t1(y1Var, 0);
                    sVar.k0(objM);
                }
                m3.i.j((Function0) objM, sVar);
            }
            sVar.q(false);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new u1(y1Var, tVar, function2, i11);
        }
    }

    public static final float d(long j9, long j11) {
        return Math.min(Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j9 & 4294967295L)));
    }

    public static final h4.c e(z zVar) {
        z zVarK = zVar.K();
        return zVarK != null ? zVarK.v(zVar, true) : new h4.c(0.0f, 0.0f, (int) (zVar.u() >> 32), (int) (zVar.u() & 4294967295L));
    }

    public static final h4.c f(z zVar, boolean z11) {
        z zVarI = i(zVar);
        float fU = (int) (zVarI.u() >> 32);
        float fU2 = (int) (zVarI.u() & 4294967295L);
        h4.c cVarV = zVarI.v(zVar, z11);
        float f11 = cVarV.f21380a;
        if (z11) {
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            if (f11 > fU) {
                f11 = fU;
            }
        }
        float f12 = cVarV.f21381b;
        if (z11) {
            if (f12 < 0.0f) {
                f12 = 0.0f;
            }
            if (f12 > fU2) {
                f12 = fU2;
            }
        }
        float f13 = cVarV.f21382c;
        if (z11) {
            if (f13 < 0.0f) {
                f13 = 0.0f;
            }
            if (f13 <= fU) {
                fU = f13;
            }
            f13 = fU;
        }
        float f14 = cVarV.f21383d;
        if (z11) {
            float f15 = f14 >= 0.0f ? f14 : 0.0f;
            if (f15 <= fU2) {
                fU2 = f15;
            }
            f14 = fU2;
        }
        if (f11 == f13 || f12 == f14) {
            return h4.c.f21379e;
        }
        long jE = zVarI.e((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L));
        long jE2 = zVarI.e((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L));
        long jE3 = zVarI.e((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L));
        long jE4 = zVarI.e((((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (((long) Float.floatToRawIntBits(f11)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jE4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jE3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jE & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jE2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jE4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jE3 & 4294967295L));
        return new h4.c(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final u3.d g(List list) {
        return new u3.d(new dx.p(list, 1), true, 1271844412);
    }

    public static final boolean h(long j9, long j11) {
        return j9 == j11;
    }

    public static final z i(z zVar) {
        z zVar2;
        z zVarK = zVar.K();
        while (true) {
            z zVar3 = zVarK;
            zVar2 = zVar;
            zVar = zVar3;
            if (zVar == null) {
                break;
            }
            zVarK = zVar.K();
        }
        b5.s1 s1Var = zVar2 instanceof b5.s1 ? (b5.s1) zVar2 : null;
        if (s1Var == null) {
            return zVar2;
        }
        b5.s1 s1Var2 = s1Var.f5968r;
        while (true) {
            b5.s1 s1Var3 = s1Var2;
            b5.s1 s1Var4 = s1Var;
            s1Var = s1Var3;
            if (s1Var == null) {
                return s1Var4;
            }
            s1Var2 = s1Var.f5968r;
        }
    }

    public static final Object j(t0 t0Var) {
        Object objG = t0Var.G();
        e0 e0Var = objG instanceof e0 ? (e0) objG : null;
        if (e0Var != null) {
            return e0Var.o();
        }
        return null;
    }

    public static final b5.v0 k(b5.v0 v0Var) {
        b5.m0 m0Var = v0Var.f6007p.f5966p;
        while (true) {
            b5.m0 m0VarW = m0Var.w();
            b5.m0 m0Var2 = null;
            if ((m0VarW != null ? m0VarW.f5873i : null) == null) {
                b5.v0 v0VarB1 = m0Var.G.f5858d.b1();
                v0VarB1.getClass();
                return v0VarB1;
            }
            b5.m0 m0VarW2 = m0Var.w();
            if (m0VarW2 != null) {
                m0Var2 = m0VarW2.f5873i;
            }
            m0Var2.getClass();
            b5.m0 m0VarW3 = m0Var.w();
            m0VarW3.getClass();
            m0Var = m0VarW3.f5873i;
            m0Var.getClass();
        }
    }

    public static final b4.t l(b4.t tVar, i80.n nVar) {
        return tVar.then(new a0(nVar));
    }

    public static final b4.t m(b4.t tVar, String str) {
        return tVar.then(new b0(str));
    }

    public static final u3.d n(b4.t tVar) {
        return new u3.d(new s1.e(tVar, 3), true, -511438721);
    }

    public static final b4.t o(b4.t tVar, Function1 function1) {
        return tVar.then(new d1(function1));
    }

    public static final b4.t p(b4.t tVar, Function1 function1) {
        return tVar.then(new f1(function1));
    }

    public static final b4.t q(b4.t tVar, Function1 function1) {
        return tVar.then(new h1(function1));
    }

    public static final long r(long j9, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * Float.intBitsToFloat((int) (j9 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & 4294967295L)) * Float.intBitsToFloat((int) (j9 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}

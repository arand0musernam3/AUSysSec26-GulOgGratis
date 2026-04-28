package nv;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import ao.e1;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import co.l;
import d2.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lw.o;
import m3.b1;
import m3.c3;
import m3.f;
import m3.g1;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import w8.g;
import z4.c0;
import z4.u0;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final void a(Function0 function0, u3.d dVar, n nVar, int i11) {
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(1683368481);
        int i12 = (sVar.h(function0) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Object objM = sVar.M();
            f fVar = m.f29332a;
            if (objM == fVar) {
                objM = i.w(new h4.c(-1.0f, -1.0f, -1.0f, -1.0f));
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = i.w(h4.c.f21379e);
                sVar.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = i.w(Boolean.FALSE);
                sVar.k0(objM3);
            }
            b1 b1Var3 = (b1) objM3;
            b1Var3.setValue(Boolean.valueOf(((Lifecycle.State) i.n(((LifecycleOwner) sVar.j(g.f43289a)).getLifecycle().c(), sVar, 0).getValue()).a(Lifecycle.State.STARTED)));
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = i.q(new o(b1Var, b1Var3, b1Var2, 7));
                sVar.k0(objM4);
            }
            c3 c3Var = (c3) objM4;
            Object objM5 = sVar.M();
            if (objM5 == fVar) {
                objM5 = new g1(0.0f);
                sVar.k0(objM5);
            }
            g1 g1Var = (g1) objM5;
            Object objM6 = sVar.M();
            if (objM6 == fVar) {
                objM6 = i.w(Boolean.FALSE);
                sVar.k0(objM6);
            }
            b1 b1Var4 = (b1) objM6;
            b1 b1VarB = i.B(function0, sVar);
            Object objM7 = sVar.M();
            if (objM7 == fVar) {
                objM7 = new co.g(b1Var, b1Var2, 4);
                sVar.k0(objM7);
            }
            t tVarO = c0.o(q.f5711a, (Function1) objM7);
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarO, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            i.C(u0VarD, b5.i.f5843f, sVar);
            i.C(iVarL, b5.i.f5842e, sVar);
            i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            i.z(sVar, b5.i.f5845h);
            i.C(tVarC, b5.i.f5841d, sVar);
            dVar.invoke(sVar, 6);
            sVar.q(true);
            Boolean bool = (Boolean) b1Var4.getValue();
            bool.booleanValue();
            boolean zF = sVar.f(b1VarB);
            Object objM8 = sVar.M();
            x70.c cVar = null;
            if (zF || objM8 == fVar) {
                objM8 = new l(b1Var4, b1VarB, cVar, 3);
                sVar.k0(objM8);
            }
            i.h(bool, (Function2) objM8, sVar);
            Float fValueOf = Float.valueOf(((Number) c3Var.getValue()).floatValue());
            Object objM9 = sVar.M();
            if (objM9 == fVar) {
                e1 e1Var = new e1(g1Var, c3Var, b1Var4, cVar, 13);
                sVar.k0(e1Var);
                objM9 = e1Var;
            }
            i.h(fValueOf, (Function2) objM9, sVar);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new kq.c(function0, dVar, i11, 17);
        }
    }

    public static final float b(h4.c cVar) {
        float f11 = cVar.f21382c;
        float f12 = cVar.f21380a;
        if (f11 - f12 > 0.0f) {
            float f13 = cVar.f21383d;
            float f14 = cVar.f21381b;
            if (f13 - f14 > 0.0f) {
                return (f13 - f14) * (f11 - f12);
            }
        }
        return 0.0f;
    }

    public static final h4.c c(z zVar) {
        zVar.getClass();
        long jU = zVar.u();
        long jE = zVar.e(0L);
        int i11 = (int) (jE >> 32);
        int i12 = (int) (jE & 4294967295L);
        return new h4.c(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + ((int) (jU >> 32)), Float.intBitsToFloat(i12) + ((int) (jU & 4294967295L)));
    }
}

package r2;

import a3.q0;
import android.view.View;
import b4.t;
import c5.v0;
import d6.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.b1;
import m3.k1;
import m3.s;
import m3.v1;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f37560a = new u3.d(new n2.a(1), false, 636288403);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f37561b = new u3.d(new n2.a(2), false, -1357803046);

    public static final void a(t tVar, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(790527681);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                k1 k1Var = new k1(null, m3.f.f29272d);
                sVar.k0(k1Var);
                objM = k1Var;
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new pi.b(b1Var, 4);
                sVar.k0(objM2);
            }
            Function0 function0 = (Function0) objM2;
            j0 j0Var = h.f37562a;
            t2.c cVarI = bx.o.I(f37561b, sVar, 6);
            m3.i.b(new v1[]{t2.f.f39666b.a(e(function0, sVar, 2)), t2.f.f39665a.a(cVarI)}, u3.e.e(1070596993, sVar, new ap.b(tVar, b1Var, dVar, cVarI, function0)), sVar, 56);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new q0(tVar, dVar, i11, 5, (byte) 0);
        }
    }

    public static final void b(t tVar, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(155925518);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            boolean z11 = sVar.j(t2.f.f39665a) != null;
            boolean z12 = sVar.j(t2.f.f39666b) != null;
            if (z11 && z12) {
                sVar.a0(-1977187922);
                u0 u0VarD = d2.p.d(b4.d.f5683a, true);
                int iHashCode = Long.hashCode(sVar.T);
                u3.i iVarL = sVar.l();
                t tVarC = b4.a.c(tVar, sVar);
                b5.j.R.getClass();
                b5.h hVar = b5.i.f5839b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(u0VarD, b5.i.f5843f, sVar);
                m3.i.C(iVarL, b5.i.f5842e, sVar);
                m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                m3.i.z(sVar, b5.i.f5845h);
                m3.i.C(tVarC, b5.i.f5841d, sVar);
                dVar.invoke(sVar, Integer.valueOf((i12 >> 3) & 14));
                sVar.q(true);
                sVar.q(false);
            } else if (z11) {
                sVar.a0(-1976997706);
                c(tVar, dVar, sVar, i12 & 126);
                sVar.q(false);
            } else if (z12) {
                sVar.a0(-1976846922);
                h.d(tVar, dVar, sVar, i12 & 126);
                sVar.q(false);
            } else {
                sVar.a0(-1976716505);
                a(tVar, dVar, sVar, i12 & 126);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new q0(tVar, dVar, i11, 4, (byte) 0);
        }
    }

    public static final void c(t tVar, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(2064964257);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            d(tVar, dVar, sVar, ((i12 << 3) & 896) | (i12 & 14) | 48);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new q0(tVar, dVar, i11, 1, (byte) 0);
        }
    }

    public static final void d(t tVar, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(771959668);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(null) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(dVar) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                k1 k1Var = new k1(null, m3.f.f29272d);
                sVar.k0(k1Var);
                objM = k1Var;
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new pi.b(b1Var, 3);
                sVar.k0(objM2);
            }
            m3.i.a(t2.f.f39666b.a(e((Function0) objM2, sVar, 0)), u3.e.e(-291176396, sVar, new ki.h(tVar, b1Var, dVar, 26)), sVar, 56);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new q0(tVar, dVar, i11, 2, (byte) 0);
        }
    }

    public static final f e(Function0 function0, m3.n nVar, int i11) {
        s sVar = (s) nVar;
        View view = (View) sVar.j(v0.f7394f);
        boolean zF = sVar.f(view);
        Object objM = sVar.M();
        m3.f fVar = m3.m.f29332a;
        if (zF || objM == fVar) {
            objM = new f(view, null, function0);
            sVar.k0(objM);
        }
        f fVar2 = (f) objM;
        boolean zH = sVar.h(fVar2);
        Object objM2 = sVar.M();
        if (zH || objM2 == fVar) {
            objM2 = new a(fVar2, 3);
            sVar.k0(objM2);
        }
        m3.i.d(fVar2, (Function1) objM2, sVar);
        return fVar2;
    }
}

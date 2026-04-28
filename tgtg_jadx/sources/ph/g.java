package ph;

import b4.t;
import cg.j;
import cg.o;
import com.app.tgtg.model.local.GenericErrors;
import d2.m2;
import g3.r9;
import g3.x5;
import java.net.UnknownHostException;
import ki.h;
import lh.c0;
import m3.b1;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public static final void a(c0 c0Var, jd.f fVar, String str, n nVar, int i11) {
        c0Var.getClass();
        fVar.getClass();
        s sVar = (s) nVar;
        sVar.c0(-717077925);
        int i12 = i11 | (sVar.f(c0Var) ? 4 : 2) | (sVar.f(fVar) ? 32 : 16) | (sVar.f(str) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Object objM = sVar.M();
            if (objM == m.f29332a) {
                objM = i.w(str);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            x5.a(m2.f13850c, u3.e.e(-28390377, sVar, new kq.c(22, fVar, b1Var)), null, null, null, 0, 0L, 0L, null, u3.e.e(-1715761364, sVar, new ap.e(c0Var, fVar, b1Var, 16)), sVar, 805306422, 508);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new h(c0Var, fVar, str, i11, 17);
        }
    }

    public static final void b(Throwable th2, n nVar, int i11) {
        th2.getClass();
        s sVar = (s) nVar;
        sVar.c0(-223919284);
        int i12 = (sVar.h(th2) ? 4 : 2) | i11;
        if (!sVar.R(i12 & 1, (i12 & 3) != 2)) {
            sVar.U();
        } else if (th2 instanceof UnknownHostException) {
            sVar.a0(-438064234);
            o.a(GenericErrors.Offline.INSTANCE, null, null, sVar, 6, 6);
            sVar.q(false);
        } else {
            sVar.a0(-438062346);
            o.a(GenericErrors.Generic.INSTANCE, null, null, sVar, 6, 6);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lk.a(th2, i11, 28);
        }
    }

    public static final void c(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(1232591926);
        if (sVar.R(i11 & 1, i11 != 0)) {
            j.o(sVar, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new p60.a(i11, 3);
        }
    }

    public static final void d(n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.c0(-1031583970);
        if (sVar2.R(i11 & 1, i11 != 0)) {
            sVar = sVar2;
            r9.d("None", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar, 6, 0, 262142);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new p60.a(i11, 4);
        }
    }

    public static final void e(t tVar, jd.f fVar, qh.a aVar, n nVar, int i11) {
        fVar.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1823626104);
        int i12 = i11 | (sVar.f(tVar) ? 4 : 2) | (sVar.f(fVar) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            p30.b.d(tVar, fVar, aVar.f37053b, aVar.f37054c, aVar.f37055d, aVar.f37056e, sVar, i12 & 126);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new h(tVar, fVar, aVar, i11, 18);
        }
    }
}

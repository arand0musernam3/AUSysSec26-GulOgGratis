package t1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rk.z f39573a = new rk.z(11);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f39574b = u70.l.a(u70.m.NONE, new sr.r(13));

    public static final void a(q1 q1Var, p1 p1Var, Object obj, Object obj2, x xVar, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(867041821);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(q1Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(p1Var) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= (i11 & 512) == 0 ? sVar.f(obj) : sVar.h(obj) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= (i11 & 4096) == 0 ? sVar.f(obj2) : sVar.h(obj2) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= (32768 & i11) == 0 ? sVar.f(xVar) : sVar.h(xVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (!sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            sVar.U();
        } else if (q1Var.h()) {
            p1Var.g(obj, obj2, xVar);
        } else {
            p1Var.h(obj2, xVar);
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cm.a(q1Var, p1Var, obj, obj2, xVar, i11, 11);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r5v7, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public static final m1 b(q1 q1Var, v1 v1Var, String str, m3.n nVar, int i11, int i12) {
        l1 l1Var;
        if ((i12 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zF = ((m3.s) nVar).f(q1Var);
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        m3.f fVar = m3.m.f29332a;
        if (zF || objM == fVar) {
            objM = new m1(q1Var, v1Var, str);
            sVar.k0(objM);
        }
        m1 m1Var = (m1) objM;
        boolean zF2 = sVar.f(q1Var) | sVar.h(m1Var);
        Object objM2 = sVar.M();
        if (zF2 || objM2 == fVar) {
            objM2 = new ry.b(7, q1Var, m1Var);
            sVar.k0(objM2);
        }
        m3.i.d(m1Var, (Function1) objM2, sVar);
        if (q1Var.h() && (l1Var = (l1) m1Var.f39494b.getValue()) != null) {
            q1 q1Var2 = m1Var.f39495c;
            l1Var.f39484a.g(l1Var.f39486c.invoke(q1Var2.f().a()), l1Var.f39486c.invoke(q1Var2.f().c()), (x) l1Var.f39485b.invoke(q1Var2.f()));
        }
        return m1Var;
    }

    public static final p1 c(q1 q1Var, Object obj, Object obj2, x xVar, v1 v1Var, m3.n nVar, int i11) {
        boolean zF = ((m3.s) nVar).f(q1Var);
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        m3.f fVar = m3.m.f29332a;
        if (zF || objM == fVar) {
            z3.g gVarC = z3.v.c();
            Function1 function1E = gVarC != null ? gVarC.e() : null;
            z3.g gVarD = z3.v.d(gVarC);
            try {
                o oVar = (o) v1Var.f39591a.invoke(obj2);
                oVar.d();
                p1 p1Var = new p1(q1Var, obj, oVar, v1Var);
                z3.v.f(gVarC, gVarD, function1E);
                sVar.k0(p1Var);
                objM = p1Var;
            } catch (Throwable th2) {
                z3.v.f(gVarC, gVarD, function1E);
                throw th2;
            }
        }
        p1 p1Var2 = (p1) objM;
        a(q1Var, p1Var2, obj, obj2, xVar, sVar, 0);
        boolean zF2 = sVar.f(q1Var) | sVar.f(p1Var2);
        Object objM2 = sVar.M();
        if (zF2 || objM2 == fVar) {
            objM2 = new ry.b(8, q1Var, p1Var2);
            sVar.k0(objM2);
        }
        m3.i.d(p1Var2, (Function1) objM2, sVar);
        return p1Var2;
    }

    public static final q1 d(h2.s0 s0Var, String str, m3.n nVar, int i11) {
        int i12 = (i11 & 14) ^ 6;
        boolean z11 = true;
        boolean z12 = (i12 > 4 && ((m3.s) nVar).f(s0Var)) || (i11 & 6) == 4;
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        Object obj = m3.m.f29332a;
        x70.c cVar = null;
        if (z12 || objM == obj) {
            z3.g gVarC = z3.v.c();
            Function1 function1E = gVarC != null ? gVarC.e() : null;
            z3.g gVarD = z3.v.d(gVarC);
            try {
                Object q1Var = new q1(s0Var, null, str);
                z3.v.f(gVarC, gVarD, function1E);
                sVar.k0(q1Var);
                objM = q1Var;
            } catch (Throwable th2) {
                z3.v.f(gVarC, gVarD, function1E);
                throw th2;
            }
        }
        q1 q1Var2 = (q1) objM;
        if (s0Var instanceof y0) {
            sVar.a0(-1357607479);
            y0 y0Var = (y0) s0Var;
            Object value = y0Var.f39607d.getValue();
            Object value2 = y0Var.f39606c.getValue();
            if ((i12 <= 4 || !sVar.f(s0Var)) && (i11 & 6) != 4) {
                z11 = false;
            }
            Object objM2 = sVar.M();
            if (z11 || objM2 == obj) {
                objM2 = new nk.j(s0Var, cVar, 28);
                sVar.k0(objM2);
            }
            m3.i.g(value, value2, (Function2) objM2, sVar);
            sVar.q(false);
        } else {
            sVar.a0(-1357145920);
            q1Var2.a(s0Var.l(), sVar, 0);
            sVar.q(false);
        }
        boolean zF = sVar.f(q1Var2);
        Object objM3 = sVar.M();
        if (zF || objM3 == obj) {
            objM3 = new r1(q1Var2, 1);
            sVar.k0(objM3);
        }
        m3.i.d(q1Var2, (Function1) objM3, sVar);
        return q1Var2;
    }

    public static final q1 e(Object obj, String str, m3.n nVar, int i11, int i12) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        m3.f fVar = m3.m.f29332a;
        if (objM == fVar) {
            objM = new q1(new k0(obj), null, str);
            sVar.k0(objM);
        }
        q1 q1Var = (q1) objM;
        q1Var.a(obj, sVar, (i11 & 8) | 48 | (i11 & 14));
        Object objM2 = sVar.M();
        if (objM2 == fVar) {
            objM2 = new r1(q1Var, 0);
            sVar.k0(objM2);
        }
        m3.i.d(q1Var, (Function1) objM2, sVar);
        return q1Var;
    }
}

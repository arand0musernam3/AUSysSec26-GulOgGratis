package qm;

import b4.q;
import d2.m2;
import f4.g;
import g3.q7;
import g3.r1;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import m3.b1;
import m3.f;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import s1.c0;
import s1.c1;
import s1.j1;
import s1.l1;
import s1.q0;
import s1.r0;
import s1.x0;
import s1.y;
import s1.y0;
import s1.z0;
import t1.c;
import t1.r;
import t1.u1;
import t1.w;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f37194a = new d(new a(0), false, 1300085671);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f37195b = new d(new o9.a(25), false, -556078547);

    public static final void a(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(298290018);
        if (sVar.R(i11 & 1, i11 != 0)) {
            q7.a(m2.s(g.a(q.f5711a, 0.88f), 88, 0.0f, 2), l2.g.b(100), lv.s.J, 0L, 0.0f, 0.0f, null, f37194a, sVar, 12583302, 120);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a(i11, 1);
        }
    }

    public static final void b(b1 b1Var, n nVar, int i11) {
        b1Var.getClass();
        s sVar = (s) nVar;
        sVar.c0(-240471547);
        int i12 = (sVar.f(b1Var) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            r rVar = w.f39593a;
            u1 u1VarK = c.k(400, 0, rVar, 2);
            Object objM = sVar.M();
            f fVar = m.f29332a;
            if (objM == fVar) {
                objM = new qb.r(10);
                sVar.k0(objM);
            }
            x0 x0VarA = r0.m((Function1) objM, u1VarK).a(r0.d(c.k(400, 0, rVar, 2), 2));
            u1 u1VarK2 = c.k(400, 0, rVar, 2);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new qb.r(11);
                sVar.k0(objM2);
            }
            y.d(zBooleanValue, null, x0VarA, new y0(new l1((z0) null, new j1(new q0((Function1) objM2, 7), u1VarK2), (c0) null, (c1) null, (LinkedHashMap) null, 125)).a(r0.e(c.k(400, 0, rVar, 2), 2)), null, f37195b, sVar, 196608, 18);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new r1(b1Var, i11, 9);
        }
    }
}

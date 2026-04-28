package n3;

import java.util.List;
import m3.a1;
import m3.m2;
import m3.p2;
import m3.q2;
import m3.x1;
import m3.z0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f30462c = new h(0, 4, 1);

    @Override // n3.k0
    public final void a(a60.s sVar, m3.c cVar, q2 q2Var, g0.c cVar2, l0 l0Var) {
        a1 a1Var = (a1) sVar.e(2);
        a1 a1Var2 = (a1) sVar.e(3);
        m3.x xVar = (m3.x) sVar.e(1);
        z0 z0VarP = (z0) sVar.e(0);
        if (z0VarP == null && (z0VarP = xVar.p(a1Var)) == null) {
            m3.v.b("Could not resolve state for movable content");
            qc.y.m();
            return;
        }
        m2 m2Var = z0VarP.f29492a;
        if (q2Var.f29394n > 0 || q2Var.u(q2Var.f29400t + 1) != 1) {
            m3.v.a("Check failed");
        }
        int i11 = q2Var.f29400t;
        int i12 = q2Var.f29390i;
        int i13 = q2Var.f29391j;
        q2Var.a(1);
        q2Var.R();
        q2Var.d();
        q2 q2VarG = m2Var.g();
        try {
            List listA = p2.a(q2VarG, 2, q2Var, false, true, true);
            q2VarG.e(true);
            q2Var.k();
            q2Var.j();
            q2Var.f29400t = i11;
            q2Var.f29390i = i12;
            q2Var.f29391j = i13;
            m3.i.l(q2Var, listA, (x1) a1Var2.f29200c);
        } catch (Throwable th2) {
            q2VarG.e(false);
            throw th2;
        }
    }
}

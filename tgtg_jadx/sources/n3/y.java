package n3;

import java.util.Set;
import m3.f2;
import m3.q2;
import m3.w1;
import q1.g1;
import q1.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f30493c = new y(0, 1, 1);

    @Override // n3.k0
    public final void a(a60.s sVar, m3.c cVar, q2 q2Var, g0.c cVar2, l0 l0Var) {
        w1 w1Var = (w1) sVar.e(0);
        Set set = (Set) cVar2.f17998a;
        if (set == null) {
            return;
        }
        u3.g gVar = new u3.g(set);
        t0 t0Var = (t0) cVar2.f18006i;
        if (t0Var == null) {
            long[] jArr = g1.f35760a;
            t0Var = new t0();
            cVar2.f18006i = t0Var;
        }
        t0Var.m(w1Var, gVar);
        ((o3.e) cVar2.f18002e).b(new f2(gVar, -1));
    }
}

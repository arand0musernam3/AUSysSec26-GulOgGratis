package n3;

import java.util.ArrayList;
import m3.q2;
import m3.w1;
import q1.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f30479c = new o(0, 1, 1);

    @Override // n3.k0
    public final void a(a60.s sVar, m3.c cVar, q2 q2Var, g0.c cVar2, l0 l0Var) {
        o3.e eVar;
        w1 w1Var = (w1) sVar.e(0);
        t0 t0Var = (t0) cVar2.f18006i;
        if (t0Var == null || ((u3.g) t0Var.d(w1Var)) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) cVar2.f18007j;
        if (arrayList != null && (eVar = (o3.e) arrayList.remove(arrayList.size() - 1)) != null) {
            cVar2.f18002e = eVar;
        }
        t0Var.k(w1Var);
    }
}

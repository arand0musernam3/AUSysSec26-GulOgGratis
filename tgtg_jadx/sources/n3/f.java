package n3;

import m2.f2;
import m3.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f30458c = new f(0, 2, 1);

    @Override // n3.k0
    public final void a(a60.s sVar, m3.c cVar, q2 q2Var, g0.c cVar2, l0 l0Var) {
        u3.f fVar = (u3.f) sVar.e(1);
        int i11 = fVar != null ? fVar.f40654a : 0;
        a aVar = (a) sVar.e(0);
        if (i11 > 0) {
            cVar = new f2(cVar, i11);
        }
        aVar.G(cVar, q2Var, cVar2, l0Var != null ? new k8.d(19, l0Var, q2Var) : null);
    }
}

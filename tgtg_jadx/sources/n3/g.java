package n3;

import java.util.List;
import m3.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f30460c = new g(0, 2, 1);

    @Override // n3.k0
    public final void a(a60.s sVar, m3.c cVar, q2 q2Var, g0.c cVar2, l0 l0Var) {
        int i11 = ((u3.f) sVar.e(0)).f40654a;
        List list = (List) sVar.e(1);
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            int i13 = i11 + i12;
            cVar.c(i13, obj);
            cVar.n(i13, obj);
        }
    }
}

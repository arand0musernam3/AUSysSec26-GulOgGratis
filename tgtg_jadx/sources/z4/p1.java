package z4;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends b5.i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p1 f47197b = new p1("Undefined intrinsics block and it is required");

    @Override // z4.u0
    public final v0 c(w0 w0Var, List list, long j9) {
        int size = list.size();
        if (size == 0) {
            return w0.f(w0Var, z5.a.k(j9), z5.a.j(j9), f0.f47118d);
        }
        if (size == 1) {
            m1 m1VarD = ((t0) list.get(0)).D(j9);
            return w0.f(w0Var, z5.b.g(m1VarD.f47183a, j9), z5.b.f(m1VarD.f47184b, j9), new c5.l(m1VarD, 7));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            m1 m1VarD2 = ((t0) list.get(i11)).D(j9);
            iMax = Math.max(m1VarD2.f47183a, iMax);
            iMax2 = Math.max(m1VarD2.f47184b, iMax2);
            arrayList.add(m1VarD2);
        }
        return w0.f(w0Var, z5.b.g(iMax, j9), z5.b.f(iMax2, j9), new d6.f(4, arrayList));
    }
}

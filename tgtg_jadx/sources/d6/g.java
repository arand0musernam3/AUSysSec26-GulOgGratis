package d6;

import java.util.ArrayList;
import java.util.List;
import z4.m1;
import z4.t0;
import z4.u0;
import z4.v0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f14464a = new g();

    @Override // z4.u0
    public final v0 c(w0 w0Var, List list, long j9) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iK = 0;
        int iJ = 0;
        for (int i11 = 0; i11 < size; i11++) {
            m1 m1VarD = ((t0) list.get(i11)).D(j9);
            iK = Math.max(iK, m1VarD.f47183a);
            iJ = Math.max(iJ, m1VarD.f47184b);
            arrayList.add(m1VarD);
        }
        if (list.isEmpty()) {
            iK = z5.a.k(j9);
            iJ = z5.a.j(j9);
        }
        return w0.f(w0Var, iK, iJ, new f(0, arrayList));
    }
}

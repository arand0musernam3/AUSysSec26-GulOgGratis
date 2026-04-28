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
public final class q implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f14522a = new q();

    @Override // z4.u0
    public final v0 c(w0 w0Var, List list, long j9) {
        int size = list.size();
        if (size == 0) {
            return w0.f(w0Var, 0, 0, d.f14444f);
        }
        if (size == 1) {
            m1 m1VarD = ((t0) list.get(0)).D(j9);
            return w0.f(w0Var, m1VarD.f47183a, m1VarD.f47184b, new c5.l(m1VarD, 1));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            m1 m1VarD2 = ((t0) list.get(i11)).D(j9);
            iMax = Math.max(iMax, m1VarD2.f47183a);
            iMax2 = Math.max(iMax2, m1VarD2.f47184b);
            arrayList.add(m1VarD2);
        }
        return w0.f(w0Var, iMax, iMax2, new f(1, arrayList));
    }
}

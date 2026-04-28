package a3;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 implements z4.u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w2 f612a = new w2();

    @Override // z4.u0
    public final z4.v0 c(z4.w0 w0Var, List list, long j9) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            z4.m1 m1VarD = ((z4.t0) list.get(i11)).D(j9);
            iMax = Math.max(iMax, m1VarD.f47183a);
            iMax2 = Math.max(iMax2, m1VarD.f47184b);
            arrayList.add(m1VarD);
        }
        return z4.w0.f(w0Var, iMax, iMax2, new v2(0, arrayList));
    }
}

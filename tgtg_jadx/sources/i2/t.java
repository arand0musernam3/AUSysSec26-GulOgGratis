package i2;

import h2.q0;
import java.util.ArrayList;
import java.util.List;
import z1.h2;
import z4.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static final g a(q0 q0Var, int i11, long j9, r rVar, long j11, h2 h2Var, b4.j jVar, z5.m mVar, int i12, q1.g0 g0Var) {
        List list;
        Object objB = rVar.b(i11);
        List list2 = (List) g0Var.b(i11);
        if (list2 != null) {
            list = list2;
        } else {
            List listB = q0Var.b(i11);
            int size = listB.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i13 = 0; i13 < size; i13++) {
                arrayList.add(((t0) listB.get(i13)).D(j9));
            }
            g0Var.i(i11, arrayList);
            list = arrayList;
        }
        return new g(i11, i12, list, j11, objB, h2Var, jVar, mVar);
    }
}

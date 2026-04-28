package m5;

import java.util.ArrayList;
import java.util.List;
import m2.p1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f29541a = new h("");

    public static final List a(h hVar, int i11, int i12, p1 p1Var) {
        List list;
        if (i11 == i12 || (list = hVar.f29537a) == null) {
            return null;
        }
        if (i11 != 0 || i12 < hVar.f29538b.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                f fVar = (f) list.get(i13);
                if ((p1Var != null ? ((Boolean) p1Var.invoke(fVar.f29529a)).booleanValue() : true) && b(i11, i12, fVar.f29530b, fVar.f29531c)) {
                    arrayList.add(new f((c) fVar.f29529a, n80.p.c(fVar.f29530b, i11, i12) - i11, n80.p.c(fVar.f29531c, i11, i12) - i11, fVar.f29532d));
                }
            }
            return arrayList;
        }
        if (p1Var == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            Object obj = list.get(i14);
            if (((Boolean) p1Var.invoke(((f) obj).f29529a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i11, int i12, int i13, int i14) {
        return ((i11 < i14) & (i13 < i12)) | (((i11 == i12) | (i13 == i14)) & (i11 == i13));
    }
}

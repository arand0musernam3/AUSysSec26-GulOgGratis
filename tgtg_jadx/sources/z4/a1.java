package z4;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface a1 {
    default int a(u uVar, List list, int i11) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            List list2 = (List) arrayList.get(i12);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList3.add(new b5.u1((t) list2.get(i13), v.Max, w.Width, 1));
            }
            arrayList2.add(arrayList3);
        }
        return c(new y(uVar, uVar.getLayoutDirection()), arrayList2, z5.b.b(0, i11, 7)).b();
    }

    default int b(u uVar, List list, int i11) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            List list2 = (List) arrayList.get(i12);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList3.add(new b5.u1((t) list2.get(i13), v.Min, w.Width, 1));
            }
            arrayList2.add(arrayList3);
        }
        return c(new y(uVar, uVar.getLayoutDirection()), arrayList2, z5.b.b(0, i11, 7)).b();
    }

    v0 c(w0 w0Var, List list, long j9);

    default int d(u uVar, List list, int i11) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            List list2 = (List) arrayList.get(i12);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList3.add(new b5.u1((t) list2.get(i13), v.Max, w.Height, 1));
            }
            arrayList2.add(arrayList3);
        }
        return c(new y(uVar, uVar.getLayoutDirection()), arrayList2, z5.b.b(i11, 0, 13)).getHeight();
    }

    default int e(u uVar, List list, int i11) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            List list2 = (List) arrayList.get(i12);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList3.add(new b5.u1((t) list2.get(i13), v.Min, w.Height, 1));
            }
            arrayList2.add(arrayList3);
        }
        return c(new y(uVar, uVar.getLayoutDirection()), arrayList2, z5.b.b(i11, 0, 13)).getHeight();
    }
}

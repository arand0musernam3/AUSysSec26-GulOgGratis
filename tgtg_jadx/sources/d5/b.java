package d5;

import j5.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final boolean a(ArrayList arrayList) {
        List list;
        long j9;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = n0.f26529a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i11 = 0;
                while (i11 < size) {
                    i11++;
                    Object obj2 = arrayList.get(i11);
                    t tVar = (t) obj2;
                    t tVar2 = (t) obj;
                    arrayList2.add(new h4.b((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (tVar2.g().d() >> 32)) - Float.intBitsToFloat((int) (tVar.g().d() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (tVar2.g().d() & 4294967295L)) - Float.intBitsToFloat((int) (tVar.g().d() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j9 = ((h4.b) CollectionsKt.O(list)).f21378a;
            } else {
                if (list.isEmpty()) {
                    b6.b.c("Empty collection can't be reduced.");
                }
                Object objO = CollectionsKt.O(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i12 = 1;
                    while (true) {
                        objO = new h4.b(h4.b.f(((h4.b) objO).f21378a, ((h4.b) list.get(i12)).f21378a));
                        if (i12 == size2) {
                            break;
                        }
                        i12++;
                    }
                }
                j9 = ((h4.b) objO).f21378a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j9)) >= Float.intBitsToFloat((int) (j9 >> 32))) {
                return false;
            }
        }
        return true;
    }
}

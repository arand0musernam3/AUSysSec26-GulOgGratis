package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class e0 extends d0 {
    public static int o(Iterable iterable, int i11) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i11;
    }

    public static ArrayList p(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i0.s((Iterable) it.next(), arrayList2);
        }
        return arrayList2;
    }
}

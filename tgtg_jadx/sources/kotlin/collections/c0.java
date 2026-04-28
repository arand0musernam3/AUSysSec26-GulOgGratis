package kotlin.collections;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class c0 {
    public static v70.e a(v70.e eVar) {
        eVar.i();
        eVar.f42036c = true;
        return eVar.f42035b > 0 ? eVar : v70.e.f42033e;
    }

    public static v70.e b() {
        return new v70.e(0, 1, null);
    }

    public static List c(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }
}

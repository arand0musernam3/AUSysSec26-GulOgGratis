package kotlin.collections;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class g1 {
    public static v70.p a(v70.p pVar) {
        v70.i iVar = pVar.f42063a;
        iVar.b();
        return iVar.f42051i > 0 ? pVar : v70.p.f42062c;
    }

    public static Set b(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }
}

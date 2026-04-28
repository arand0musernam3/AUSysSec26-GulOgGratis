package o9;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface d {
    Function2 getContent();

    List getEntries();

    Object getKey();

    default Map getMetadata() {
        Map map;
        n9.e eVar = (n9.e) CollectionsKt.X(getEntries());
        if (eVar != null && (map = eVar.f30743c) != null) {
            return map;
        }
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        return o0Var;
    }

    List getPreviousEntries();
}

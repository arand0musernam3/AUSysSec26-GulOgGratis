package h8;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public abstract Map a();

    public abstract Object b(e eVar);

    public final a c() {
        return new a(new LinkedHashMap(a()), false);
    }
}

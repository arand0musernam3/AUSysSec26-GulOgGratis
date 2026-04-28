package zw;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f48373a;

    static {
        HashMap map = new HashMap(13);
        f48373a = map;
        map.put("normal", 400);
        map.put("bold", 700);
        w2.l1.j(1, map, "bolder", -1, "lighter");
        w2.l1.j(100, map, "100", 200, "200");
        map.put("300", 300);
        map.put("400", 400);
        w2.l1.j(500, map, "500", 600, "600");
        map.put("700", 700);
        map.put("800", 800);
        map.put("900", 900);
    }
}

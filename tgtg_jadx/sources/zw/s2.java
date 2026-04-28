package zw;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f48358a;

    static {
        HashMap map = new HashMap(10);
        f48358a = map;
        map.put("none", t.none);
        map.put("xMinYMin", t.xMinYMin);
        map.put("xMidYMin", t.xMidYMin);
        map.put("xMaxYMin", t.xMaxYMin);
        map.put("xMinYMid", t.xMinYMid);
        map.put("xMidYMid", t.xMidYMid);
        map.put("xMaxYMid", t.xMaxYMid);
        map.put("xMinYMax", t.xMinYMax);
        map.put("xMidYMax", t.xMidYMax);
        map.put("xMaxYMax", t.xMaxYMax);
    }
}

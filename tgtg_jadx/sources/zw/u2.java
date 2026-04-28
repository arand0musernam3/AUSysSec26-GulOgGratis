package zw;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f48362a;

    static {
        HashMap map = new HashMap(9);
        f48362a = map;
        e2 e2Var = e2.f48190pt;
        map.put("xx-small", new k0(0.694f, e2Var));
        map.put("x-small", new k0(0.833f, e2Var));
        map.put("small", new k0(10.0f, e2Var));
        map.put("medium", new k0(12.0f, e2Var));
        map.put("large", new k0(14.4f, e2Var));
        map.put("x-large", new k0(17.3f, e2Var));
        map.put("xx-large", new k0(20.7f, e2Var));
        e2 e2Var2 = e2.percent;
        map.put("smaller", new k0(83.33f, e2Var2));
        map.put("larger", new k0(120.0f, e2Var2));
    }
}

package zw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c1 {
    private static final /* synthetic */ c1[] $VALUES;
    public static final c1 auto;
    public static final c1 optimizeQuality;
    public static final c1 optimizeSpeed;

    static {
        c1 c1Var = new c1("auto", 0);
        auto = c1Var;
        c1 c1Var2 = new c1("optimizeQuality", 1);
        optimizeQuality = c1Var2;
        c1 c1Var3 = new c1("optimizeSpeed", 2);
        optimizeSpeed = c1Var3;
        $VALUES = new c1[]{c1Var, c1Var2, c1Var3};
    }

    public static c1 valueOf(String str) {
        return (c1) Enum.valueOf(c1.class, str);
    }

    public static c1[] values() {
        return (c1[]) $VALUES.clone();
    }
}

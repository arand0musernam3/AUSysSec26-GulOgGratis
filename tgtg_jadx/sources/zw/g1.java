package zw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g1 {
    private static final /* synthetic */ g1[] $VALUES;
    public static final g1 NonScalingStroke;
    public static final g1 None;

    static {
        g1 g1Var = new g1("None", 0);
        None = g1Var;
        g1 g1Var2 = new g1("NonScalingStroke", 1);
        NonScalingStroke = g1Var2;
        $VALUES = new g1[]{g1Var, g1Var2};
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) $VALUES.clone();
    }
}

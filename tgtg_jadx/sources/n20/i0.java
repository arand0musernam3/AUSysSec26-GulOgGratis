package n20;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 {
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 PERCENT;
    public static final i0 PIXELS;

    static {
        i0 i0Var = new i0("PERCENT", 0);
        PERCENT = i0Var;
        i0 i0Var2 = new i0("PIXELS", 1);
        PIXELS = i0Var2;
        $VALUES = new i0[]{i0Var, i0Var2};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }
}

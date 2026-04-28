package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {
    private static final /* synthetic */ x1[] $VALUES;
    public static final x1 SESSION_ERROR_SURFACE_NEEDS_RESET;
    public static final x1 SESSION_ERROR_UNKNOWN;

    static {
        x1 x1Var = new x1("SESSION_ERROR_SURFACE_NEEDS_RESET", 0);
        SESSION_ERROR_SURFACE_NEEDS_RESET = x1Var;
        x1 x1Var2 = new x1("SESSION_ERROR_UNKNOWN", 1);
        SESSION_ERROR_UNKNOWN = x1Var2;
        $VALUES = new x1[]{x1Var, x1Var2};
    }

    public static x1 valueOf(String str) {
        return (x1) Enum.valueOf(x1.class, str);
    }

    public static x1[] values() {
        return (x1[]) $VALUES.clone();
    }
}

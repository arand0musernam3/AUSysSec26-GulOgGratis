package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    private static final /* synthetic */ t0[] $VALUES;
    public static final t0 ALWAYS_OVERRIDE;
    public static final t0 HIGH_PRIORITY_REQUIRED;
    public static final t0 OPTIONAL;
    public static final t0 REQUIRED;

    static {
        t0 t0Var = new t0("ALWAYS_OVERRIDE", 0);
        ALWAYS_OVERRIDE = t0Var;
        t0 t0Var2 = new t0("HIGH_PRIORITY_REQUIRED", 1);
        HIGH_PRIORITY_REQUIRED = t0Var2;
        t0 t0Var3 = new t0("REQUIRED", 2);
        REQUIRED = t0Var3;
        t0 t0Var4 = new t0("OPTIONAL", 3);
        OPTIONAL = t0Var4;
        $VALUES = new t0[]{t0Var, t0Var2, t0Var3, t0Var4};
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) $VALUES.clone();
    }
}

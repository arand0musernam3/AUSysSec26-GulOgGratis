package z4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ x0[] $VALUES;
    public static final x0 Max;
    public static final x0 Min;

    static {
        x0 x0Var = new x0("Min", 0);
        Min = x0Var;
        x0 x0Var2 = new x0("Max", 1);
        Max = x0Var2;
        x0[] x0VarArr = {x0Var, x0Var2};
        $VALUES = x0VarArr;
        $ENTRIES = new a80.b(x0VarArr);
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) $VALUES.clone();
    }
}

package g3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c9 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ c9[] $VALUES;
    public static final c9 Divider;
    public static final c9 Indicator;
    public static final c9 Tabs;

    static {
        c9 c9Var = new c9("Tabs", 0);
        Tabs = c9Var;
        c9 c9Var2 = new c9("Divider", 1);
        Divider = c9Var2;
        c9 c9Var3 = new c9("Indicator", 2);
        Indicator = c9Var3;
        c9[] c9VarArr = {c9Var, c9Var2, c9Var3};
        $VALUES = c9VarArr;
        $ENTRIES = new a80.b(c9VarArr);
    }

    public static c9 valueOf(String str) {
        return (c9) Enum.valueOf(c9.class, str);
    }

    public static c9[] values() {
        return (c9[]) $VALUES.clone();
    }
}

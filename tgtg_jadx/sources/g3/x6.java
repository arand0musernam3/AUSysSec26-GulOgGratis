package g3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x6 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ x6[] $VALUES;
    public static final x6 Expanded;
    public static final x6 Hidden;
    public static final x6 PartiallyExpanded;

    static {
        x6 x6Var = new x6("Hidden", 0);
        Hidden = x6Var;
        x6 x6Var2 = new x6("Expanded", 1);
        Expanded = x6Var2;
        x6 x6Var3 = new x6("PartiallyExpanded", 2);
        PartiallyExpanded = x6Var3;
        x6[] x6VarArr = {x6Var, x6Var2, x6Var3};
        $VALUES = x6VarArr;
        $ENTRIES = new a80.b(x6VarArr);
    }

    public static x6 valueOf(String str) {
        return (x6) Enum.valueOf(x6.class, str);
    }

    public static x6[] values() {
        return (x6[]) $VALUES.clone();
    }
}

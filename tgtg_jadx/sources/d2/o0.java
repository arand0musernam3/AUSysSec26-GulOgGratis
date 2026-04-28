package d2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ o0[] $VALUES;
    public static final o0 Clip;
    public static final o0 ExpandIndicator;
    public static final o0 ExpandOrCollapseIndicator;
    public static final o0 Visible;

    static {
        o0 o0Var = new o0("Visible", 0);
        Visible = o0Var;
        o0 o0Var2 = new o0("Clip", 1);
        Clip = o0Var2;
        o0 o0Var3 = new o0("ExpandIndicator", 2);
        ExpandIndicator = o0Var3;
        o0 o0Var4 = new o0("ExpandOrCollapseIndicator", 3);
        ExpandOrCollapseIndicator = o0Var4;
        o0[] o0VarArr = {o0Var, o0Var2, o0Var3, o0Var4};
        $VALUES = o0VarArr;
        $ENTRIES = new a80.b(o0VarArr);
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) $VALUES.clone();
    }
}

package a3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 EditableText;
    public static final g0 StaticText;

    static {
        g0 g0Var = new g0("EditableText", 0);
        EditableText = g0Var;
        g0 g0Var2 = new g0("StaticText", 1);
        StaticText = g0Var2;
        g0[] g0VarArr = {g0Var, g0Var2};
        $VALUES = g0VarArr;
        $ENTRIES = new a80.b(g0VarArr);
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }
}

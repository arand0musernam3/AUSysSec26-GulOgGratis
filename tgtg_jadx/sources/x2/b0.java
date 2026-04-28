package x2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 Cursor;
    public static final b0 None;
    public static final b0 Selection;

    static {
        b0 b0Var = new b0("None", 0);
        None = b0Var;
        b0 b0Var2 = new b0("Cursor", 1);
        Cursor = b0Var2;
        b0 b0Var3 = new b0("Selection", 2);
        Selection = b0Var3;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3};
        $VALUES = b0VarArr;
        $ENTRIES = new a80.b(b0VarArr);
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }
}

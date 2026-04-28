package m2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ t0[] $VALUES;
    public static final t0 Cursor;
    public static final t0 SelectionEnd;
    public static final t0 SelectionStart;

    static {
        t0 t0Var = new t0("Cursor", 0);
        Cursor = t0Var;
        t0 t0Var2 = new t0("SelectionStart", 1);
        SelectionStart = t0Var2;
        t0 t0Var3 = new t0("SelectionEnd", 2);
        SelectionEnd = t0Var3;
        t0[] t0VarArr = {t0Var, t0Var2, t0Var3};
        $VALUES = t0VarArr;
        $ENTRIES = new a80.b(t0VarArr);
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) $VALUES.clone();
    }
}

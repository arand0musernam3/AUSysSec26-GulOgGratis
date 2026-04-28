package d2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 Both;
    public static final e0 Horizontal;
    public static final e0 Vertical;

    static {
        e0 e0Var = new e0("Vertical", 0);
        Vertical = e0Var;
        e0 e0Var2 = new e0("Horizontal", 1);
        Horizontal = e0Var2;
        e0 e0Var3 = new e0("Both", 2);
        Both = e0Var3;
        e0[] e0VarArr = {e0Var, e0Var2, e0Var3};
        $VALUES = e0VarArr;
        $ENTRIES = new a80.b(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }
}

package a3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ k1[] $VALUES;
    public static final k1 Left;
    public static final k1 Middle;
    public static final k1 Right;

    static {
        k1 k1Var = new k1("Left", 0);
        Left = k1Var;
        k1 k1Var2 = new k1("Middle", 1);
        Middle = k1Var2;
        k1 k1Var3 = new k1("Right", 2);
        Right = k1Var3;
        k1[] k1VarArr = {k1Var, k1Var2, k1Var3};
        $VALUES = k1VarArr;
        $ENTRIES = new a80.b(k1VarArr);
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) $VALUES.clone();
    }
}

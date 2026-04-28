package z1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ n1[] $VALUES;
    public static final n1 No;
    public static final n1 NotInitialized;
    public static final n1 Yes;

    static {
        n1 n1Var = new n1("Yes", 0);
        Yes = n1Var;
        n1 n1Var2 = new n1("No", 1);
        No = n1Var2;
        n1 n1Var3 = new n1("NotInitialized", 2);
        NotInitialized = n1Var3;
        n1[] n1VarArr = {n1Var, n1Var2, n1Var3};
        $VALUES = n1VarArr;
        $ENTRIES = new a80.b(n1VarArr);
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) $VALUES.clone();
    }
}

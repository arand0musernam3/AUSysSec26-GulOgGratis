package w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 WITHOUT_FEATURE_COMBO;
    public static final n0 WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT;
    public static final n0 WITH_FEATURE_COMBO;

    static {
        n0 n0Var = new n0("WITHOUT_FEATURE_COMBO", 0);
        WITHOUT_FEATURE_COMBO = n0Var;
        n0 n0Var2 = new n0("WITH_FEATURE_COMBO", 1);
        WITH_FEATURE_COMBO = n0Var2;
        n0 n0Var3 = new n0("WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT", 2);
        WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT = n0Var3;
        n0[] n0VarArr = {n0Var, n0Var2, n0Var3};
        $VALUES = n0VarArr;
        $ENTRIES = new a80.b(n0VarArr);
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }
}

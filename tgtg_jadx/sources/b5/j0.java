package b5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;
    public static final j0 InLayoutBlock;
    public static final j0 InMeasureBlock;
    public static final j0 NotUsed;

    static {
        j0 j0Var = new j0("InMeasureBlock", 0);
        InMeasureBlock = j0Var;
        j0 j0Var2 = new j0("InLayoutBlock", 1);
        InLayoutBlock = j0Var2;
        j0 j0Var3 = new j0("NotUsed", 2);
        NotUsed = j0Var3;
        j0[] j0VarArr = {j0Var, j0Var2, j0Var3};
        $VALUES = j0VarArr;
        $ENTRIES = new a80.b(j0VarArr);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}

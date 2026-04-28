package b5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ w0[] $VALUES;
    public static final w0 IsNotPlaced;
    public static final w0 IsPlacedInApproach;
    public static final w0 IsPlacedInLookahead;

    static {
        w0 w0Var = new w0("IsPlacedInLookahead", 0);
        IsPlacedInLookahead = w0Var;
        w0 w0Var2 = new w0("IsPlacedInApproach", 1);
        IsPlacedInApproach = w0Var2;
        w0 w0Var3 = new w0("IsNotPlaced", 2);
        IsNotPlaced = w0Var3;
        w0[] w0VarArr = {w0Var, w0Var2, w0Var3};
        $VALUES = w0VarArr;
        $ENTRIES = new a80.b(w0VarArr);
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) $VALUES.clone();
    }
}

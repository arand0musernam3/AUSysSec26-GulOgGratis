package m3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ q1[] $VALUES;
    public static final q1 Applied;
    public static final q1 ApplyPending;
    public static final q1 Cancelled;
    public static final q1 InitialPending;
    public static final q1 Invalid;
    public static final q1 RecomposePending;
    public static final q1 Recomposing;

    static {
        q1 q1Var = new q1("Invalid", 0);
        Invalid = q1Var;
        q1 q1Var2 = new q1("Cancelled", 1);
        Cancelled = q1Var2;
        q1 q1Var3 = new q1("InitialPending", 2);
        InitialPending = q1Var3;
        q1 q1Var4 = new q1("RecomposePending", 3);
        RecomposePending = q1Var4;
        q1 q1Var5 = new q1("Recomposing", 4);
        Recomposing = q1Var5;
        q1 q1Var6 = new q1("ApplyPending", 5);
        ApplyPending = q1Var6;
        q1 q1Var7 = new q1("Applied", 6);
        Applied = q1Var7;
        q1[] q1VarArr = {q1Var, q1Var2, q1Var3, q1Var4, q1Var5, q1Var6, q1Var7};
        $VALUES = q1VarArr;
        $ENTRIES = new a80.b(q1VarArr);
    }

    public static q1 valueOf(String str) {
        return (q1) Enum.valueOf(q1.class, str);
    }

    public static q1[] values() {
        return (q1[]) $VALUES.clone();
    }
}

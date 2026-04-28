package b5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ p2[] $VALUES;
    public static final p2 CancelTraversal;
    public static final p2 ContinueTraversal;
    public static final p2 SkipSubtreeAndContinueTraversal;

    static {
        p2 p2Var = new p2("ContinueTraversal", 0);
        ContinueTraversal = p2Var;
        p2 p2Var2 = new p2("SkipSubtreeAndContinueTraversal", 1);
        SkipSubtreeAndContinueTraversal = p2Var2;
        p2 p2Var3 = new p2("CancelTraversal", 2);
        CancelTraversal = p2Var3;
        p2[] p2VarArr = {p2Var, p2Var2, p2Var3};
        $VALUES = p2VarArr;
        $ENTRIES = new a80.b(p2VarArr);
    }

    public static p2 valueOf(String str) {
        return (p2) Enum.valueOf(p2.class, str);
    }

    public static p2[] values() {
        return (p2[]) $VALUES.clone();
    }
}

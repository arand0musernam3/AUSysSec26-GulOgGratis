package s1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 PostExit;
    public static final h0 PreEnter;
    public static final h0 Visible;

    static {
        h0 h0Var = new h0("PreEnter", 0);
        PreEnter = h0Var;
        h0 h0Var2 = new h0("Visible", 1);
        Visible = h0Var2;
        h0 h0Var3 = new h0("PostExit", 2);
        PostExit = h0Var3;
        h0[] h0VarArr = {h0Var, h0Var2, h0Var3};
        $VALUES = h0VarArr;
        $ENTRIES = new a80.b(h0VarArr);
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }
}

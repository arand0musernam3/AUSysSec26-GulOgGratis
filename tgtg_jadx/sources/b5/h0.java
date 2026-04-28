package b5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 Idle;
    public static final h0 LayingOut;
    public static final h0 LookaheadLayingOut;
    public static final h0 LookaheadMeasuring;
    public static final h0 Measuring;

    static {
        h0 h0Var = new h0("Measuring", 0);
        Measuring = h0Var;
        h0 h0Var2 = new h0("LookaheadMeasuring", 1);
        LookaheadMeasuring = h0Var2;
        h0 h0Var3 = new h0("LayingOut", 2);
        LayingOut = h0Var3;
        h0 h0Var4 = new h0("LookaheadLayingOut", 3);
        LookaheadLayingOut = h0Var4;
        h0 h0Var5 = new h0("Idle", 4);
        Idle = h0Var5;
        h0[] h0VarArr = {h0Var, h0Var2, h0Var3, h0Var4, h0Var5};
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

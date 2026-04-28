package y80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ o1[] $VALUES;
    public static final o1 START;
    public static final o1 STOP;
    public static final o1 STOP_AND_RESET_REPLAY_CACHE;

    static {
        o1 o1Var = new o1("START", 0);
        START = o1Var;
        o1 o1Var2 = new o1("STOP", 1);
        STOP = o1Var2;
        o1 o1Var3 = new o1("STOP_AND_RESET_REPLAY_CACHE", 2);
        STOP_AND_RESET_REPLAY_CACHE = o1Var3;
        o1[] o1VarArr = {o1Var, o1Var2, o1Var3};
        $VALUES = o1VarArr;
        $ENTRIES = new a80.b(o1VarArr);
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) $VALUES.clone();
    }
}

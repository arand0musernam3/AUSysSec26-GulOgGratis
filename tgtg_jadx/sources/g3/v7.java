package g3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v7 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ v7[] $VALUES;
    public static final v7 EndToStart;
    public static final v7 Settled;
    public static final v7 StartToEnd;

    static {
        v7 v7Var = new v7("StartToEnd", 0);
        StartToEnd = v7Var;
        v7 v7Var2 = new v7("EndToStart", 1);
        EndToStart = v7Var2;
        v7 v7Var3 = new v7("Settled", 2);
        Settled = v7Var3;
        v7[] v7VarArr = {v7Var, v7Var2, v7Var3};
        $VALUES = v7VarArr;
        $ENTRIES = new a80.b(v7VarArr);
    }

    public static v7 valueOf(String str) {
        return (v7) Enum.valueOf(v7.class, str);
    }

    public static v7[] values() {
        return (v7[]) $VALUES.clone();
    }
}

package ib;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;
    public static final d0 DROP_WORK_REQUEST;
    public static final d0 RUN_AS_NON_EXPEDITED_WORK_REQUEST;

    static {
        d0 d0Var = new d0("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        RUN_AS_NON_EXPEDITED_WORK_REQUEST = d0Var;
        d0 d0Var2 = new d0("DROP_WORK_REQUEST", 1);
        DROP_WORK_REQUEST = d0Var2;
        d0[] d0VarArr = {d0Var, d0Var2};
        $VALUES = d0VarArr;
        $ENTRIES = new a80.b(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }
}

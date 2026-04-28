package ib;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 APPLIED_FOR_NEXT_RUN;
    public static final i0 APPLIED_IMMEDIATELY;
    public static final i0 NOT_APPLIED;

    static {
        i0 i0Var = new i0("NOT_APPLIED", 0);
        NOT_APPLIED = i0Var;
        i0 i0Var2 = new i0("APPLIED_IMMEDIATELY", 1);
        APPLIED_IMMEDIATELY = i0Var2;
        i0 i0Var3 = new i0("APPLIED_FOR_NEXT_RUN", 2);
        APPLIED_FOR_NEXT_RUN = i0Var3;
        i0[] i0VarArr = {i0Var, i0Var2, i0Var3};
        $VALUES = i0VarArr;
        $ENTRIES = new a80.b(i0VarArr);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }
}

package ib;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 BLOCKED;
    public static final g0 CANCELLED;
    public static final g0 ENQUEUED;
    public static final g0 FAILED;
    public static final g0 RUNNING;
    public static final g0 SUCCEEDED;

    static {
        g0 g0Var = new g0("ENQUEUED", 0);
        ENQUEUED = g0Var;
        g0 g0Var2 = new g0("RUNNING", 1);
        RUNNING = g0Var2;
        g0 g0Var3 = new g0("SUCCEEDED", 2);
        SUCCEEDED = g0Var3;
        g0 g0Var4 = new g0("FAILED", 3);
        FAILED = g0Var4;
        g0 g0Var5 = new g0("BLOCKED", 4);
        BLOCKED = g0Var5;
        g0 g0Var6 = new g0("CANCELLED", 5);
        CANCELLED = g0Var6;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6};
        $VALUES = g0VarArr;
        $ENTRIES = new a80.b(g0VarArr);
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }

    public final boolean a() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}

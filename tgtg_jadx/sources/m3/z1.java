package m3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ z1[] $VALUES;
    public static final z1 Idle;
    public static final z1 Inactive;
    public static final z1 InactivePendingWork;
    public static final z1 PendingWork;
    public static final z1 ShutDown;
    public static final z1 ShuttingDown;

    static {
        z1 z1Var = new z1("ShutDown", 0);
        ShutDown = z1Var;
        z1 z1Var2 = new z1("ShuttingDown", 1);
        ShuttingDown = z1Var2;
        z1 z1Var3 = new z1("Inactive", 2);
        Inactive = z1Var3;
        z1 z1Var4 = new z1("InactivePendingWork", 3);
        InactivePendingWork = z1Var4;
        z1 z1Var5 = new z1("Idle", 4);
        Idle = z1Var5;
        z1 z1Var6 = new z1("PendingWork", 5);
        PendingWork = z1Var6;
        z1[] z1VarArr = {z1Var, z1Var2, z1Var3, z1Var4, z1Var5, z1Var6};
        $VALUES = z1VarArr;
        $ENTRIES = new a80.b(z1VarArr);
    }

    public static z1 valueOf(String str) {
        return (z1) Enum.valueOf(z1.class, str);
    }

    public static z1[] values() {
        return (z1[]) $VALUES.clone();
    }
}

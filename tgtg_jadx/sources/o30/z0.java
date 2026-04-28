package o30;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z0 {
    private static final /* synthetic */ z0[] $VALUES;
    public static final z0 IDLE;
    public static final z0 QUEUED;
    public static final z0 QUEUING;
    public static final z0 RUNNING;

    static {
        z0 z0Var = new z0("IDLE", 0);
        IDLE = z0Var;
        z0 z0Var2 = new z0("QUEUING", 1);
        QUEUING = z0Var2;
        z0 z0Var3 = new z0("QUEUED", 2);
        QUEUED = z0Var3;
        z0 z0Var4 = new z0("RUNNING", 3);
        RUNNING = z0Var4;
        $VALUES = new z0[]{z0Var, z0Var2, z0Var3, z0Var4};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) $VALUES.clone();
    }
}

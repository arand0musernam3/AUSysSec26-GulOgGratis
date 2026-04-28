package f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ u2[] $VALUES;
    public static final u2 APP_CLOSED;
    public static final u2 APP_DISCONNECTED;
    public static final u2 CAMERA2_CLOSED;
    public static final u2 CAMERA2_DISCONNECTED;
    public static final u2 CAMERA2_ERROR;
    public static final u2 CAMERA2_EXCEPTION;

    static {
        u2 u2Var = new u2("APP_CLOSED", 0);
        APP_CLOSED = u2Var;
        u2 u2Var2 = new u2("APP_DISCONNECTED", 1);
        APP_DISCONNECTED = u2Var2;
        u2 u2Var3 = new u2("CAMERA2_CLOSED", 2);
        CAMERA2_CLOSED = u2Var3;
        u2 u2Var4 = new u2("CAMERA2_DISCONNECTED", 3);
        CAMERA2_DISCONNECTED = u2Var4;
        u2 u2Var5 = new u2("CAMERA2_ERROR", 4);
        CAMERA2_ERROR = u2Var5;
        u2 u2Var6 = new u2("CAMERA2_EXCEPTION", 5);
        CAMERA2_EXCEPTION = u2Var6;
        u2[] u2VarArr = {u2Var, u2Var2, u2Var3, u2Var4, u2Var5, u2Var6};
        $VALUES = u2VarArr;
        $ENTRIES = new a80.b(u2VarArr);
    }

    public static u2 valueOf(String str) {
        return (u2) Enum.valueOf(u2.class, str);
    }

    public static u2[] values() {
        return (u2[]) $VALUES.clone();
    }
}

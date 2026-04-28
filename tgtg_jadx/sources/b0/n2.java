package b0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ n2[] $VALUES;
    public static final n2 CAMERA2_CAMERA_CONTROL;
    public static final n2 DEFAULT;
    public static final n2 SESSION_CONFIG;

    static {
        n2 n2Var = new n2("SESSION_CONFIG", 0);
        SESSION_CONFIG = n2Var;
        n2 n2Var2 = new n2("DEFAULT", 1);
        DEFAULT = n2Var2;
        n2 n2Var3 = new n2("CAMERA2_CAMERA_CONTROL", 2);
        CAMERA2_CAMERA_CONTROL = n2Var3;
        n2[] n2VarArr = {n2Var, n2Var2, n2Var3};
        $VALUES = n2VarArr;
        $ENTRIES = new a80.b(n2VarArr);
    }

    public static a80.a a() {
        return $ENTRIES;
    }

    public static n2 valueOf(String str) {
        return (n2) Enum.valueOf(n2.class, str);
    }

    public static n2[] values() {
        return (n2[]) $VALUES.clone();
    }
}

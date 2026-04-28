package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ f2[] $VALUES;
    public static final f2 CAPTURE_SESSION_TABLES;
    public static final f2 FEATURE_COMBINATION_TABLE;

    static {
        f2 f2Var = new f2("FEATURE_COMBINATION_TABLE", 0);
        FEATURE_COMBINATION_TABLE = f2Var;
        f2 f2Var2 = new f2("CAPTURE_SESSION_TABLES", 1);
        CAPTURE_SESSION_TABLES = f2Var2;
        f2[] f2VarArr = {f2Var, f2Var2};
        $VALUES = f2VarArr;
        $ENTRIES = new a80.b(f2VarArr);
    }

    public static f2 valueOf(String str) {
        return (f2) Enum.valueOf(f2.class, str);
    }

    public static f2[] values() {
        return (f2[]) $VALUES.clone();
    }
}

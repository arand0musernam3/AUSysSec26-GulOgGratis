package c50;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements o40.f {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 LOG_ENVIRONMENT_AUTOPUSH;
    public static final b0 LOG_ENVIRONMENT_PROD;
    public static final b0 LOG_ENVIRONMENT_STAGING;
    public static final b0 LOG_ENVIRONMENT_UNKNOWN;
    private final int number;

    static {
        b0 b0Var = new b0("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        LOG_ENVIRONMENT_UNKNOWN = b0Var;
        b0 b0Var2 = new b0("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
        LOG_ENVIRONMENT_AUTOPUSH = b0Var2;
        b0 b0Var3 = new b0("LOG_ENVIRONMENT_STAGING", 2, 2);
        LOG_ENVIRONMENT_STAGING = b0Var3;
        b0 b0Var4 = new b0("LOG_ENVIRONMENT_PROD", 3, 3);
        LOG_ENVIRONMENT_PROD = b0Var4;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3, b0Var4};
        $VALUES = b0VarArr;
        $ENTRIES = new a80.b(b0VarArr);
    }

    public b0(String str, int i11, int i12) {
        this.number = i12;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }

    @Override // o40.f
    public final int getNumber() {
        return this.number;
    }
}

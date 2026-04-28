package tx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 {
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 ERROR;
    public static final b0 LOADING;
    public static final b0 NOT_LOADED;
    public static final b0 SUCCESS;

    static {
        b0 b0Var = new b0("NOT_LOADED", 0);
        NOT_LOADED = b0Var;
        b0 b0Var2 = new b0("LOADING", 1);
        LOADING = b0Var2;
        b0 b0Var3 = new b0("SUCCESS", 2);
        SUCCESS = b0Var3;
        b0 b0Var4 = new b0("ERROR", 3);
        ERROR = b0Var4;
        $VALUES = new b0[]{b0Var, b0Var2, b0Var3, b0Var4};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }
}

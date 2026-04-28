package ax;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 {
    private static final /* synthetic */ l0[] $VALUES;
    public static final l0 DELETE;
    public static final l0 GET;
    public static final l0 POST;

    static {
        l0 l0Var = new l0("GET", 0);
        GET = l0Var;
        l0 l0Var2 = new l0("POST", 1);
        POST = l0Var2;
        l0 l0Var3 = new l0("DELETE", 2);
        DELETE = l0Var3;
        $VALUES = new l0[]{l0Var, l0Var2, l0Var3};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) $VALUES.clone();
    }
}

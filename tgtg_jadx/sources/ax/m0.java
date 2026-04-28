package ax;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 {
    private static final /* synthetic */ m0[] $VALUES;
    public static final m0 APP_EVENTS;
    public static final m0 CACHE;
    public static final m0 DEVELOPER_ERRORS;
    public static final m0 GRAPH_API_DEBUG_INFO;
    public static final m0 GRAPH_API_DEBUG_WARNING;
    public static final m0 INCLUDE_ACCESS_TOKENS;
    public static final m0 INCLUDE_RAW_RESPONSES;
    public static final m0 REQUESTS;

    static {
        m0 m0Var = new m0("REQUESTS", 0);
        REQUESTS = m0Var;
        m0 m0Var2 = new m0("INCLUDE_ACCESS_TOKENS", 1);
        INCLUDE_ACCESS_TOKENS = m0Var2;
        m0 m0Var3 = new m0("INCLUDE_RAW_RESPONSES", 2);
        INCLUDE_RAW_RESPONSES = m0Var3;
        m0 m0Var4 = new m0("CACHE", 3);
        CACHE = m0Var4;
        m0 m0Var5 = new m0("APP_EVENTS", 4);
        APP_EVENTS = m0Var5;
        m0 m0Var6 = new m0("DEVELOPER_ERRORS", 5);
        DEVELOPER_ERRORS = m0Var6;
        m0 m0Var7 = new m0("GRAPH_API_DEBUG_WARNING", 6);
        GRAPH_API_DEBUG_WARNING = m0Var7;
        m0 m0Var8 = new m0("GRAPH_API_DEBUG_INFO", 7);
        GRAPH_API_DEBUG_INFO = m0Var8;
        $VALUES = new m0[]{m0Var, m0Var2, m0Var3, m0Var4, m0Var5, m0Var6, m0Var7, m0Var8};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) $VALUES.clone();
    }
}

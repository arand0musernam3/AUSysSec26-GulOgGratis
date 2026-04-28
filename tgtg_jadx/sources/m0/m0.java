package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    private static final /* synthetic */ m0[] $VALUES;
    public static final m0 ERROR_CONVERSION;
    public static final m0 SUCCESS;
    public static final m0 UNKNOWN;

    static {
        m0 m0Var = new m0("UNKNOWN", 0);
        UNKNOWN = m0Var;
        m0 m0Var2 = new m0("SUCCESS", 1);
        SUCCESS = m0Var2;
        m0 m0Var3 = new m0("ERROR_CONVERSION", 2);
        ERROR_CONVERSION = m0Var3;
        $VALUES = new m0[]{m0Var, m0Var2, m0Var3};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) $VALUES.clone();
    }
}

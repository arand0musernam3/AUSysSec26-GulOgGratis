package f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ m2[] $VALUES;
    public static final m2 CLOSED;
    public static final m2 CLOSING;
    public static final m2 CREATED;
    public static final m2 CREATING;
    public static final m2 PENDING;

    static {
        m2 m2Var = new m2("PENDING", 0);
        PENDING = m2Var;
        m2 m2Var2 = new m2("CREATING", 1);
        CREATING = m2Var2;
        m2 m2Var3 = new m2("CREATED", 2);
        CREATED = m2Var3;
        m2 m2Var4 = new m2("CLOSING", 3);
        CLOSING = m2Var4;
        m2 m2Var5 = new m2("CLOSED", 4);
        CLOSED = m2Var5;
        m2[] m2VarArr = {m2Var, m2Var2, m2Var3, m2Var4, m2Var5};
        $VALUES = m2VarArr;
        $ENTRIES = new a80.b(m2VarArr);
    }

    public static m2 valueOf(String str) {
        return (m2) Enum.valueOf(m2.class, str);
    }

    public static m2[] values() {
        return (m2[]) $VALUES.clone();
    }
}

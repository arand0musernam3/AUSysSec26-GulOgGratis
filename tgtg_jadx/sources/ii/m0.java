package ii;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ m0[] $VALUES;
    public static final m0 MODIFY;
    public static final m0 NOTIFICATIONS;
    public static final m0 WEEKLY;

    static {
        m0 m0Var = new m0("WEEKLY", 0);
        WEEKLY = m0Var;
        m0 m0Var2 = new m0("MODIFY", 1);
        MODIFY = m0Var2;
        m0 m0Var3 = new m0("NOTIFICATIONS", 2);
        NOTIFICATIONS = m0Var3;
        m0[] m0VarArr = {m0Var, m0Var2, m0Var3};
        $VALUES = m0VarArr;
        $ENTRIES = new a80.b(m0VarArr);
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) $VALUES.clone();
    }
}

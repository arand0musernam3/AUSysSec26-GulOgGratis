package g3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m7 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ m7[] $VALUES;
    public static final m7 ActionPerformed;
    public static final m7 Dismissed;

    static {
        m7 m7Var = new m7("Dismissed", 0);
        Dismissed = m7Var;
        m7 m7Var2 = new m7("ActionPerformed", 1);
        ActionPerformed = m7Var2;
        m7[] m7VarArr = {m7Var, m7Var2};
        $VALUES = m7VarArr;
        $ENTRIES = new a80.b(m7VarArr);
    }

    public static m7 valueOf(String str) {
        return (m7) Enum.valueOf(m7.class, str);
    }

    public static m7[] values() {
        return (m7[]) $VALUES.clone();
    }
}

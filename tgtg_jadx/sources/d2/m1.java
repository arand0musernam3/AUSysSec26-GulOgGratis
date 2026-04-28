package d2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ m1[] $VALUES;
    public static final m1 Horizontal;
    public static final m1 Vertical;

    static {
        m1 m1Var = new m1("Horizontal", 0);
        Horizontal = m1Var;
        m1 m1Var2 = new m1("Vertical", 1);
        Vertical = m1Var2;
        m1[] m1VarArr = {m1Var, m1Var2};
        $VALUES = m1VarArr;
        $ENTRIES = new a80.b(m1VarArr);
    }

    public static m1 valueOf(String str) {
        return (m1) Enum.valueOf(m1.class, str);
    }

    public static m1[] values() {
        return (m1[]) $VALUES.clone();
    }
}

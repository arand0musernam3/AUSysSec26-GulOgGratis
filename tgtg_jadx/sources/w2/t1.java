package w2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ t1[] $VALUES;
    public static final t1 End;
    public static final t1 Start;

    static {
        t1 t1Var = new t1("Start", 0);
        Start = t1Var;
        t1 t1Var2 = new t1("End", 1);
        End = t1Var2;
        t1[] t1VarArr = {t1Var, t1Var2};
        $VALUES = t1VarArr;
        $ENTRIES = new a80.b(t1VarArr);
    }

    public static t1 valueOf(String str) {
        return (t1) Enum.valueOf(t1.class, str);
    }

    public static t1[] values() {
        return (t1[]) $VALUES.clone();
    }
}

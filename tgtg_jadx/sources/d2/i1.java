package d2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ i1[] $VALUES;
    public static final i1 Max;
    public static final i1 Min;

    static {
        i1 i1Var = new i1("Min", 0);
        Min = i1Var;
        i1 i1Var2 = new i1("Max", 1);
        Max = i1Var2;
        i1[] i1VarArr = {i1Var, i1Var2};
        $VALUES = i1VarArr;
        $ENTRIES = new a80.b(i1VarArr);
    }

    public static i1 valueOf(String str) {
        return (i1) Enum.valueOf(i1.class, str);
    }

    public static i1[] values() {
        return (i1[]) $VALUES.clone();
    }
}

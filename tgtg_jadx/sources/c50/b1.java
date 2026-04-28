package c50;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b1[] $VALUES;
    public static final b1 FALLBACK;
    public static final b1 GENERAL;

    static {
        b1 b1Var = new b1("GENERAL", 0);
        GENERAL = b1Var;
        b1 b1Var2 = new b1("FALLBACK", 1);
        FALLBACK = b1Var2;
        b1[] b1VarArr = {b1Var, b1Var2};
        $VALUES = b1VarArr;
        $ENTRIES = new a80.b(b1VarArr);
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) $VALUES.clone();
    }
}

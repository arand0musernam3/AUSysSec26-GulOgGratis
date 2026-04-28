package g3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a7 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ a7[] $VALUES;
    public static final a7 Indefinite;
    public static final a7 Long;
    public static final a7 Short;

    static {
        a7 a7Var = new a7("Short", 0);
        Short = a7Var;
        a7 a7Var2 = new a7("Long", 1);
        Long = a7Var2;
        a7 a7Var3 = new a7("Indefinite", 2);
        Indefinite = a7Var3;
        a7[] a7VarArr = {a7Var, a7Var2, a7Var3};
        $VALUES = a7VarArr;
        $ENTRIES = new a80.b(a7VarArr);
    }

    public static a7 valueOf(String str) {
        return (a7) Enum.valueOf(a7.class, str);
    }

    public static a7[] values() {
        return (a7[]) $VALUES.clone();
    }
}

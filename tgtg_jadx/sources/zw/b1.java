package zw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b1 {
    private static final /* synthetic */ b1[] $VALUES;
    public static final b1 Bevel;
    public static final b1 Miter;
    public static final b1 Round;

    static {
        b1 b1Var = new b1("Miter", 0);
        Miter = b1Var;
        b1 b1Var2 = new b1("Round", 1);
        Round = b1Var2;
        b1 b1Var3 = new b1("Bevel", 2);
        Bevel = b1Var3;
        $VALUES = new b1[]{b1Var, b1Var2, b1Var3};
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) $VALUES.clone();
    }
}

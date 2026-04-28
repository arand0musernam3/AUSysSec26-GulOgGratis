package zw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a1 {
    private static final /* synthetic */ a1[] $VALUES;
    public static final a1 Butt;
    public static final a1 Round;
    public static final a1 Square;

    static {
        a1 a1Var = new a1("Butt", 0);
        Butt = a1Var;
        a1 a1Var2 = new a1("Round", 1);
        Round = a1Var2;
        a1 a1Var3 = new a1("Square", 2);
        Square = a1Var3;
        $VALUES = new a1[]{a1Var, a1Var2, a1Var3};
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) $VALUES.clone();
    }
}

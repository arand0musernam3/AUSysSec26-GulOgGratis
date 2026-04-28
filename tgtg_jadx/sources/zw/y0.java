package zw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y0 {
    private static final /* synthetic */ y0[] $VALUES;
    public static final y0 EvenOdd;
    public static final y0 NonZero;

    static {
        y0 y0Var = new y0("NonZero", 0);
        NonZero = y0Var;
        y0 y0Var2 = new y0("EvenOdd", 1);
        EvenOdd = y0Var2;
        $VALUES = new y0[]{y0Var, y0Var2};
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) $VALUES.clone();
    }
}

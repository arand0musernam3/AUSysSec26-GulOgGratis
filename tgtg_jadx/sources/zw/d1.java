package zw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d1 {
    private static final /* synthetic */ d1[] $VALUES;
    public static final d1 End;
    public static final d1 Middle;
    public static final d1 Start;

    static {
        d1 d1Var = new d1("Start", 0);
        Start = d1Var;
        d1 d1Var2 = new d1("Middle", 1);
        Middle = d1Var2;
        d1 d1Var3 = new d1("End", 2);
        End = d1Var3;
        $VALUES = new d1[]{d1Var, d1Var2, d1Var3};
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) $VALUES.clone();
    }
}

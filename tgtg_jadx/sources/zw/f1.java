package zw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f1 {
    private static final /* synthetic */ f1[] $VALUES;
    public static final f1 LTR;
    public static final f1 RTL;

    static {
        f1 f1Var = new f1("LTR", 0);
        LTR = f1Var;
        f1 f1Var2 = new f1("RTL", 1);
        RTL = f1Var2;
        $VALUES = new f1[]{f1Var, f1Var2};
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) $VALUES.clone();
    }
}

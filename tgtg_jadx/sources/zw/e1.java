package zw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e1 {
    private static final /* synthetic */ e1[] $VALUES;
    public static final e1 Blink;
    public static final e1 LineThrough;
    public static final e1 None;
    public static final e1 Overline;
    public static final e1 Underline;

    static {
        e1 e1Var = new e1("None", 0);
        None = e1Var;
        e1 e1Var2 = new e1("Underline", 1);
        Underline = e1Var2;
        e1 e1Var3 = new e1("Overline", 2);
        Overline = e1Var3;
        e1 e1Var4 = new e1("LineThrough", 3);
        LineThrough = e1Var4;
        e1 e1Var5 = new e1("Blink", 4);
        Blink = e1Var5;
        $VALUES = new e1[]{e1Var, e1Var2, e1Var3, e1Var4, e1Var5};
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) $VALUES.clone();
    }
}

package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ g2[] $VALUES;
    public static final g2 JPEG;
    public static final g2 JPEG_R;
    public static final g2 PRIV;
    public static final g2 RAW;
    public static final g2 YUV;

    static {
        g2 g2Var = new g2("PRIV", 0);
        PRIV = g2Var;
        g2 g2Var2 = new g2("YUV", 1);
        YUV = g2Var2;
        g2 g2Var3 = new g2("JPEG", 2);
        JPEG = g2Var3;
        g2 g2Var4 = new g2("JPEG_R", 3);
        JPEG_R = g2Var4;
        g2 g2Var5 = new g2("RAW", 4);
        RAW = g2Var5;
        g2[] g2VarArr = {g2Var, g2Var2, g2Var3, g2Var4, g2Var5};
        $VALUES = g2VarArr;
        $ENTRIES = new a80.b(g2VarArr);
    }

    public static g2 valueOf(String str) {
        return (g2) Enum.valueOf(g2.class, str);
    }

    public static g2[] values() {
        return (g2[]) $VALUES.clone();
    }
}

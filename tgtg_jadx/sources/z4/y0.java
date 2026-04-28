package z4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ y0[] $VALUES;
    public static final y0 Height;
    public static final y0 Width;

    static {
        y0 y0Var = new y0("Width", 0);
        Width = y0Var;
        y0 y0Var2 = new y0("Height", 1);
        Height = y0Var2;
        y0[] y0VarArr = {y0Var, y0Var2};
        $VALUES = y0VarArr;
        $ENTRIES = new a80.b(y0VarArr);
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) $VALUES.clone();
    }
}

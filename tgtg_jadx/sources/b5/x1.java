package b5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ x1[] $VALUES;
    public static final x1 Height;
    public static final x1 Width;

    static {
        x1 x1Var = new x1("Width", 0);
        Width = x1Var;
        x1 x1Var2 = new x1("Height", 1);
        Height = x1Var2;
        x1[] x1VarArr = {x1Var, x1Var2};
        $VALUES = x1VarArr;
        $ENTRIES = new a80.b(x1VarArr);
    }

    public static x1 valueOf(String str) {
        return (x1) Enum.valueOf(x1.class, str);
    }

    public static x1[] values() {
        return (x1[]) $VALUES.clone();
    }
}

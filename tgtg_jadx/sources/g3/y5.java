package g3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y5 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ y5[] $VALUES;
    public static final y5 BottomBar;
    public static final y5 Fab;
    public static final y5 MainContent;
    public static final y5 Snackbar;
    public static final y5 TopBar;

    static {
        y5 y5Var = new y5("TopBar", 0);
        TopBar = y5Var;
        y5 y5Var2 = new y5("MainContent", 1);
        MainContent = y5Var2;
        y5 y5Var3 = new y5("Snackbar", 2);
        Snackbar = y5Var3;
        y5 y5Var4 = new y5("Fab", 3);
        Fab = y5Var4;
        y5 y5Var5 = new y5("BottomBar", 4);
        BottomBar = y5Var5;
        y5[] y5VarArr = {y5Var, y5Var2, y5Var3, y5Var4, y5Var5};
        $VALUES = y5VarArr;
        $ENTRIES = new a80.b(y5VarArr);
    }

    public static y5 valueOf(String str) {
        return (y5) Enum.valueOf(y5.class, str);
    }

    public static y5[] values() {
        return (y5[]) $VALUES.clone();
    }
}

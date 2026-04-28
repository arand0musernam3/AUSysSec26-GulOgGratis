package r5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 HideKeyboard;
    public static final a0 ShowKeyboard;
    public static final a0 StartInput;
    public static final a0 StopInput;

    static {
        a0 a0Var = new a0("StartInput", 0);
        StartInput = a0Var;
        a0 a0Var2 = new a0("StopInput", 1);
        StopInput = a0Var2;
        a0 a0Var3 = new a0("ShowKeyboard", 2);
        ShowKeyboard = a0Var3;
        a0 a0Var4 = new a0("HideKeyboard", 3);
        HideKeyboard = a0Var4;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4};
        $VALUES = a0VarArr;
        $ENTRIES = new a80.b(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}

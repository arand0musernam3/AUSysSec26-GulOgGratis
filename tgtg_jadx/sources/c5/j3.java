package c5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ j3[] $VALUES;
    public static final j3 Hidden;
    public static final j3 Shown;

    static {
        j3 j3Var = new j3("Shown", 0);
        Shown = j3Var;
        j3 j3Var2 = new j3("Hidden", 1);
        Hidden = j3Var2;
        j3[] j3VarArr = {j3Var, j3Var2};
        $VALUES = j3VarArr;
        $ENTRIES = new a80.b(j3VarArr);
    }

    public static j3 valueOf(String str) {
        return (j3) Enum.valueOf(j3.class, str);
    }

    public static j3[] values() {
        return (j3[]) $VALUES.clone();
    }
}

package i3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ r0[] $VALUES;
    public static final r0 Filled;
    public static final r0 Outlined;

    static {
        r0 r0Var = new r0("Filled", 0);
        Filled = r0Var;
        r0 r0Var2 = new r0("Outlined", 1);
        Outlined = r0Var2;
        r0[] r0VarArr = {r0Var, r0Var2};
        $VALUES = r0VarArr;
        $ENTRIES = new a80.b(r0VarArr);
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) $VALUES.clone();
    }
}

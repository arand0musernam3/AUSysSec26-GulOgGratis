package i4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;
    public static final p0 Clockwise;
    public static final p0 CounterClockwise;

    static {
        p0 p0Var = new p0("CounterClockwise", 0);
        CounterClockwise = p0Var;
        p0 p0Var2 = new p0("Clockwise", 1);
        Clockwise = p0Var2;
        p0[] p0VarArr = {p0Var, p0Var2};
        $VALUES = p0VarArr;
        $ENTRIES = new a80.b(p0VarArr);
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }
}

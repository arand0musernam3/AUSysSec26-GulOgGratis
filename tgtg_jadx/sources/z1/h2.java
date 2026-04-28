package z1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ h2[] $VALUES;
    public static final h2 Horizontal;
    public static final h2 Vertical;

    static {
        h2 h2Var = new h2("Vertical", 0);
        Vertical = h2Var;
        h2 h2Var2 = new h2("Horizontal", 1);
        Horizontal = h2Var2;
        h2[] h2VarArr = {h2Var, h2Var2};
        $VALUES = h2VarArr;
        $ENTRIES = new a80.b(h2VarArr);
    }

    public static h2 valueOf(String str) {
        return (h2) Enum.valueOf(h2.class, str);
    }

    public static h2[] values() {
        return (h2[]) $VALUES.clone();
    }
}

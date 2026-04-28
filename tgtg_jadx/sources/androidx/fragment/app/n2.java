package androidx.fragment.app;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 {
    private static final /* synthetic */ n2[] $VALUES;
    public static final n2 ADDING;
    public static final n2 NONE;
    public static final n2 REMOVING;

    static {
        n2 n2Var = new n2("NONE", 0);
        NONE = n2Var;
        n2 n2Var2 = new n2("ADDING", 1);
        ADDING = n2Var2;
        n2 n2Var3 = new n2("REMOVING", 2);
        REMOVING = n2Var3;
        $VALUES = new n2[]{n2Var, n2Var2, n2Var3};
    }

    public static n2 valueOf(String str) {
        return (n2) Enum.valueOf(n2.class, str);
    }

    public static n2[] values() {
        return (n2[]) $VALUES.clone();
    }
}

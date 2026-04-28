package androidx.recyclerview.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {
    private static final /* synthetic */ k1[] $VALUES;
    public static final k1 ALLOW;
    public static final k1 PREVENT;
    public static final k1 PREVENT_WHEN_EMPTY;

    static {
        k1 k1Var = new k1("ALLOW", 0);
        ALLOW = k1Var;
        k1 k1Var2 = new k1("PREVENT_WHEN_EMPTY", 1);
        PREVENT_WHEN_EMPTY = k1Var2;
        k1 k1Var3 = new k1("PREVENT", 2);
        PREVENT = k1Var3;
        $VALUES = new k1[]{k1Var, k1Var2, k1Var3};
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) $VALUES.clone();
    }
}

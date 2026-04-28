package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {
    private static final /* synthetic */ k1[] $VALUES;
    public static final k1 ACTIVE;
    public static final k1 INACTIVE;

    static {
        k1 k1Var = new k1("ACTIVE", 0);
        ACTIVE = k1Var;
        k1 k1Var2 = new k1("INACTIVE", 1);
        INACTIVE = k1Var2;
        $VALUES = new k1[]{k1Var, k1Var2};
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) $VALUES.clone();
    }
}

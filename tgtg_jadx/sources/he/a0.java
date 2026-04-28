package he;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 MergePathsApi19;
    public final int minRequiredSdkVersion = 19;

    static {
        a0 a0Var = new a0();
        MergePathsApi19 = a0Var;
        $VALUES = new a0[]{a0Var};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}

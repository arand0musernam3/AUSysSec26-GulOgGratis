package zw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z0 {
    private static final /* synthetic */ z0[] $VALUES;
    public static final z0 Italic;
    public static final z0 Normal;
    public static final z0 Oblique;

    static {
        z0 z0Var = new z0("Normal", 0);
        Normal = z0Var;
        z0 z0Var2 = new z0("Italic", 1);
        Italic = z0Var2;
        z0 z0Var3 = new z0("Oblique", 2);
        Oblique = z0Var3;
        $VALUES = new z0[]{z0Var, z0Var2, z0Var3};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) $VALUES.clone();
    }
}

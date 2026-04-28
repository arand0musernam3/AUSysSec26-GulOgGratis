package d6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 Inherit;
    public static final k0 SecureOff;
    public static final k0 SecureOn;

    static {
        k0 k0Var = new k0("Inherit", 0);
        Inherit = k0Var;
        k0 k0Var2 = new k0("SecureOn", 1);
        SecureOn = k0Var2;
        k0 k0Var3 = new k0("SecureOff", 2);
        SecureOff = k0Var3;
        k0[] k0VarArr = {k0Var, k0Var2, k0Var3};
        $VALUES = k0VarArr;
        $ENTRIES = new a80.b(k0VarArr);
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }
}

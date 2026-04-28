package f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a4 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ a4[] $VALUES;
    public static final a4 CREATED;
    public static final a4 CREATING;
    public static final a4 PENDING;

    static {
        a4 a4Var = new a4("PENDING", 0);
        PENDING = a4Var;
        a4 a4Var2 = new a4("CREATING", 1);
        CREATING = a4Var2;
        a4 a4Var3 = new a4("CREATED", 2);
        CREATED = a4Var3;
        a4[] a4VarArr = {a4Var, a4Var2, a4Var3};
        $VALUES = a4VarArr;
        $ENTRIES = new a80.b(a4VarArr);
    }

    public static a4 valueOf(String str) {
        return (a4) Enum.valueOf(a4.class, str);
    }

    public static a4[] values() {
        return (a4[]) $VALUES.clone();
    }
}

package g4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements z {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 Active;
    public static final b0 ActiveParent;
    public static final b0 Captured;
    public static final b0 Inactive;

    static {
        b0 b0Var = new b0("Active", 0);
        Active = b0Var;
        b0 b0Var2 = new b0("ActiveParent", 1);
        ActiveParent = b0Var2;
        b0 b0Var3 = new b0("Captured", 2);
        Captured = b0Var3;
        b0 b0Var4 = new b0("Inactive", 3);
        Inactive = b0Var4;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3, b0Var4};
        $VALUES = b0VarArr;
        $ENTRIES = new a80.b(b0VarArr);
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }

    public final boolean a() {
        int i11 = a0.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return true;
        }
        if (i11 == 4) {
            return false;
        }
        e40.a.f();
        return false;
    }

    public final boolean c() {
        int i11 = a0.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1 || i11 == 2) {
            return true;
        }
        if (i11 == 3 || i11 == 4) {
            return false;
        }
        e40.a.f();
        return false;
    }
}

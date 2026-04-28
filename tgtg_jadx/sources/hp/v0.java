package hp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ v0[] $VALUES;
    public static final v0 OK;
    public static final v0 USER_HAS_MAX_NUMBER_OF_RECIPES;

    static {
        v0 v0Var = new v0("OK", 0);
        OK = v0Var;
        v0 v0Var2 = new v0("USER_HAS_MAX_NUMBER_OF_RECIPES", 1);
        USER_HAS_MAX_NUMBER_OF_RECIPES = v0Var2;
        v0[] v0VarArr = {v0Var, v0Var2};
        $VALUES = v0VarArr;
        $ENTRIES = new a80.b(v0VarArr);
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) $VALUES.clone();
    }
}

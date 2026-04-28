package no;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 INVITATION_NOT_ACTIVE;
    public static final n0 NONE;
    public static final n0 REGRET_INVITATION;
    public static final n0 WRONG_REGION;

    static {
        n0 n0Var = new n0("NONE", 0);
        NONE = n0Var;
        n0 n0Var2 = new n0("REGRET_INVITATION", 1);
        REGRET_INVITATION = n0Var2;
        n0 n0Var3 = new n0("INVITATION_NOT_ACTIVE", 2);
        INVITATION_NOT_ACTIVE = n0Var3;
        n0 n0Var4 = new n0("WRONG_REGION", 3);
        WRONG_REGION = n0Var4;
        n0[] n0VarArr = {n0Var, n0Var2, n0Var3, n0Var4};
        $VALUES = n0VarArr;
        $ENTRIES = new a80.b(n0VarArr);
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }
}

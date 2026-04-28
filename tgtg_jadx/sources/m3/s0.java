package m3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ s0[] $VALUES;
    public static final s0 DEFERRED;
    public static final s0 IGNORED;
    public static final s0 IMMINENT;
    public static final s0 SCHEDULED;

    static {
        s0 s0Var = new s0("IGNORED", 0);
        IGNORED = s0Var;
        s0 s0Var2 = new s0("SCHEDULED", 1);
        SCHEDULED = s0Var2;
        s0 s0Var3 = new s0("DEFERRED", 2);
        DEFERRED = s0Var3;
        s0 s0Var4 = new s0("IMMINENT", 3);
        IMMINENT = s0Var4;
        s0[] s0VarArr = {s0Var, s0Var2, s0Var3, s0Var4};
        $VALUES = s0VarArr;
        $ENTRIES = new a80.b(s0VarArr);
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) $VALUES.clone();
    }
}

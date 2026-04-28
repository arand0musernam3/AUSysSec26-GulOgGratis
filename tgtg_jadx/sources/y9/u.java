package y9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u AUTOMATIC;
    public static final u TRUNCATE;
    public static final u WRITE_AHEAD_LOGGING;

    static {
        u uVar = new u("AUTOMATIC", 0);
        AUTOMATIC = uVar;
        u uVar2 = new u("TRUNCATE", 1);
        TRUNCATE = uVar2;
        u uVar3 = new u("WRITE_AHEAD_LOGGING", 2);
        WRITE_AHEAD_LOGGING = uVar3;
        u[] uVarArr = {uVar, uVar2, uVar3};
        $VALUES = uVarArr;
        $ENTRIES = new a80.b(uVarArr);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}

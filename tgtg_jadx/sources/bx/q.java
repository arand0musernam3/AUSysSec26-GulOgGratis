package bx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {
    private static final /* synthetic */ q[] $VALUES;
    public static final q NO_CONNECTIVITY;
    public static final q SERVER_ERROR;
    public static final q SUCCESS;
    public static final q UNKNOWN_ERROR;

    static {
        q qVar = new q("SUCCESS", 0);
        SUCCESS = qVar;
        q qVar2 = new q("SERVER_ERROR", 1);
        SERVER_ERROR = qVar2;
        q qVar3 = new q("NO_CONNECTIVITY", 2);
        NO_CONNECTIVITY = qVar3;
        q qVar4 = new q("UNKNOWN_ERROR", 3);
        UNKNOWN_ERROR = qVar4;
        $VALUES = new q[]{qVar, qVar2, qVar3, qVar4};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}

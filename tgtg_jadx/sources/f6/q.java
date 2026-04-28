package f6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    private static final /* synthetic */ q[] $VALUES;
    public static final q BOUNDS;
    public static final q NONE;

    static {
        q qVar = new q("NONE", 0);
        NONE = qVar;
        q qVar2 = new q("BOUNDS", 1);
        BOUNDS = qVar2;
        $VALUES = new q[]{qVar, qVar2};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}

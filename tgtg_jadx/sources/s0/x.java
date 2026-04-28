package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    private static final /* synthetic */ x[] $VALUES;
    public static final x FIRED;
    public static final x NONE;
    public static final x READY;
    public static final x UNKNOWN;

    static {
        x xVar = new x("UNKNOWN", 0);
        UNKNOWN = xVar;
        x xVar2 = new x("NONE", 1);
        NONE = xVar2;
        x xVar3 = new x("READY", 2);
        READY = xVar3;
        x xVar4 = new x("FIRED", 3);
        FIRED = xVar4;
        $VALUES = new x[]{xVar, xVar2, xVar3, xVar4};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}

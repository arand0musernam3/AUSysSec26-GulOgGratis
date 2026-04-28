package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    private static final /* synthetic */ w[] $VALUES;
    public static final w CONVERGED;
    public static final w INACTIVE;
    public static final w LOCKED;
    public static final w METERING;
    public static final w UNKNOWN;

    static {
        w wVar = new w("UNKNOWN", 0);
        UNKNOWN = wVar;
        w wVar2 = new w("INACTIVE", 1);
        INACTIVE = wVar2;
        w wVar3 = new w("METERING", 2);
        METERING = wVar3;
        w wVar4 = new w("CONVERGED", 3);
        CONVERGED = wVar4;
        w wVar5 = new w("LOCKED", 4);
        LOCKED = wVar5;
        $VALUES = new w[]{wVar, wVar2, wVar3, wVar4, wVar5};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}

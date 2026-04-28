package qe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    private static final /* synthetic */ w[] $VALUES;
    public static final w BEVEL;
    public static final w MITER;
    public static final w ROUND;

    static {
        w wVar = new w("MITER", 0);
        MITER = wVar;
        w wVar2 = new w("ROUND", 1);
        ROUND = wVar2;
        w wVar3 = new w("BEVEL", 2);
        BEVEL = wVar3;
        $VALUES = new w[]{wVar, wVar2, wVar3};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}

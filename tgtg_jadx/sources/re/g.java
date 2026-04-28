package re;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g ADD;
    public static final g INVERT;
    public static final g LUMA;
    public static final g LUMA_INVERTED;
    public static final g NONE;
    public static final g UNKNOWN;

    static {
        g gVar = new g("NONE", 0);
        NONE = gVar;
        g gVar2 = new g("ADD", 1);
        ADD = gVar2;
        g gVar3 = new g("INVERT", 2);
        INVERT = gVar3;
        g gVar4 = new g("LUMA", 3);
        LUMA = gVar4;
        g gVar5 = new g("LUMA_INVERTED", 4);
        LUMA_INVERTED = gVar5;
        g gVar6 = new g("UNKNOWN", 5);
        UNKNOWN = gVar6;
        $VALUES = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}

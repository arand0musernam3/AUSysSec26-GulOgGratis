package e1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g DEFAULT;
    public static final g UNKNOWN;
    public static final g YUV;

    static {
        g gVar = new g("UNKNOWN", 0);
        UNKNOWN = gVar;
        g gVar2 = new g("DEFAULT", 1);
        DEFAULT = gVar2;
        g gVar3 = new g("YUV", 2);
        YUV = gVar3;
        $VALUES = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}

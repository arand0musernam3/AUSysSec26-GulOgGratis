package g6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g CONSTANT;
    public static final g ERROR;
    public static final g SLACK;
    public static final g UNKNOWN;
    public static final g UNRESTRICTED;

    static {
        g gVar = new g("UNRESTRICTED", 0);
        UNRESTRICTED = gVar;
        g gVar2 = new g("CONSTANT", 1);
        CONSTANT = gVar2;
        g gVar3 = new g("SLACK", 2);
        SLACK = gVar3;
        g gVar4 = new g("ERROR", 3);
        ERROR = gVar4;
        g gVar5 = new g("UNKNOWN", 4);
        UNKNOWN = gVar5;
        $VALUES = new g[]{gVar, gVar2, gVar3, gVar4, gVar5};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}

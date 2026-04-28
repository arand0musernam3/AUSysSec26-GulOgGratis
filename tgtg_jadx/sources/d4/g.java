package d4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g VIEW_APPEAR;
    public static final g VIEW_DISAPPEAR;

    static {
        g gVar = new g("VIEW_APPEAR", 0);
        VIEW_APPEAR = gVar;
        g gVar2 = new g("VIEW_DISAPPEAR", 1);
        VIEW_DISAPPEAR = gVar2;
        g[] gVarArr = {gVar, gVar2};
        $VALUES = gVarArr;
        $ENTRIES = new a80.b(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}

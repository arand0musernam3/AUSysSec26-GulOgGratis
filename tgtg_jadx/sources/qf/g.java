package qf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g EVENT;
    public static final g FLUSH;

    static {
        g gVar = new g("EVENT", 0);
        EVENT = gVar;
        g gVar2 = new g("FLUSH", 1);
        FLUSH = gVar2;
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

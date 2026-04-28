package um;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g DELIVERY_INFO;
    public static final g MAX_ITEM_COUNT;
    public static final g MISSING_PRODUCTS;

    static {
        g gVar = new g("MISSING_PRODUCTS", 0);
        MISSING_PRODUCTS = gVar;
        g gVar2 = new g("MAX_ITEM_COUNT", 1);
        MAX_ITEM_COUNT = gVar2;
        g gVar3 = new g("DELIVERY_INFO", 2);
        DELIVERY_INFO = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
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

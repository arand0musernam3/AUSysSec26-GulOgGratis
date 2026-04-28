package cv;

import com.adyen.checkout.googlepay.AllowedCardNetworks;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h(with = h.class)
public final class g {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @i90.g("BASKET_SCREEN")
    public static final g BASKET_SCREEN;

    @i90.g("BUCKET")
    public static final g BUCKET;

    @NotNull
    public static final f Companion;

    @i90.g("DELIVERY_LIST")
    public static final g DELIVERY_LIST;

    @i90.g("DETAIL")
    public static final g DETAIL;

    @i90.g(AllowedCardNetworks.DISCOVER)
    public static final g DISCOVER;

    @i90.g("FAVORITE_LIST")
    public static final g FAVORITE_LIST;

    @i90.g("LIST")
    public static final g LIST;

    @i90.g("MAP")
    public static final g MAP;

    @i90.g("SEARCH_LIST")
    public static final g SEARCH_LIST;

    @i90.g("UNKNOWN")
    public static final g UNKNOWN;

    static {
        g gVar = new g(AllowedCardNetworks.DISCOVER, 0);
        DISCOVER = gVar;
        g gVar2 = new g("LIST", 1);
        LIST = gVar2;
        g gVar3 = new g("MAP", 2);
        MAP = gVar3;
        g gVar4 = new g("FAVORITE_LIST", 3);
        FAVORITE_LIST = gVar4;
        g gVar5 = new g("DETAIL", 4);
        DETAIL = gVar5;
        g gVar6 = new g("BUCKET", 5);
        BUCKET = gVar6;
        g gVar7 = new g("DELIVERY_LIST", 6);
        DELIVERY_LIST = gVar7;
        g gVar8 = new g("SEARCH_LIST", 7);
        SEARCH_LIST = gVar8;
        g gVar9 = new g("BASKET_SCREEN", 8);
        BASKET_SCREEN = gVar9;
        g gVar10 = new g("UNKNOWN", 9);
        UNKNOWN = gVar10;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10};
        $VALUES = gVarArr;
        $ENTRIES = new a80.b(gVarArr);
        Companion = new f();
    }

    public static a80.a a() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}

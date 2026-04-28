package nq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o ALMOST_SOLD_OUT;
    public static final o CATEGORY;
    public static final o CLASSIC;
    public static final o DELIVERY_TAB;
    public static final o FAVORITES;
    public static final o FILTERS_NO_RESULT;
    public static final o FLASH_SALES;
    public static final o LOYALTY_CARD_BANNER;
    public static final o MANUFACTURER;
    public static final o NOTHING_NEARBY;
    public static final o NOT_LIVE_HERE;
    public static final o QUICK_FILTERS;
    public static final o RATE_ORDER;
    public static final o RECIPE_GENERATOR;
    public static final o RECOMMENDATIONS;
    public static final o SOLD_OUT;
    public static final o STORE_REFERRAL;

    static {
        o oVar = new o("RATE_ORDER", 0);
        RATE_ORDER = oVar;
        o oVar2 = new o("SOLD_OUT", 1);
        SOLD_OUT = oVar2;
        o oVar3 = new o("ALMOST_SOLD_OUT", 2);
        ALMOST_SOLD_OUT = oVar3;
        o oVar4 = new o("NOTHING_NEARBY", 3);
        NOTHING_NEARBY = oVar4;
        o oVar5 = new o("NOT_LIVE_HERE", 4);
        NOT_LIVE_HERE = oVar5;
        o oVar6 = new o("CATEGORY", 5);
        CATEGORY = oVar6;
        o oVar7 = new o("CLASSIC", 6);
        CLASSIC = oVar7;
        o oVar8 = new o("RECOMMENDATIONS", 7);
        RECOMMENDATIONS = oVar8;
        o oVar9 = new o("FAVORITES", 8);
        FAVORITES = oVar9;
        o oVar10 = new o("STORE_REFERRAL", 9);
        STORE_REFERRAL = oVar10;
        o oVar11 = new o("MANUFACTURER", 10);
        MANUFACTURER = oVar11;
        o oVar12 = new o("FLASH_SALES", 11);
        FLASH_SALES = oVar12;
        o oVar13 = new o("DELIVERY_TAB", 12);
        DELIVERY_TAB = oVar13;
        o oVar14 = new o("QUICK_FILTERS", 13);
        QUICK_FILTERS = oVar14;
        o oVar15 = new o("FILTERS_NO_RESULT", 14);
        FILTERS_NO_RESULT = oVar15;
        o oVar16 = new o("RECIPE_GENERATOR", 15);
        RECIPE_GENERATOR = oVar16;
        o oVar17 = new o("LOYALTY_CARD_BANNER", 16);
        LOYALTY_CARD_BANNER = oVar17;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9, oVar10, oVar11, oVar12, oVar13, oVar14, oVar15, oVar16, oVar17};
        $VALUES = oVarArr;
        $ENTRIES = new a80.b(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}

package om;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o CLUSTER;
    public static final o HOME;
    public static final o MULTI_ITEMS;
    public static final o MULTI_STORES;
    public static final o OTHER;
    public static final o PARTIAL_DETAIL;
    public static final o SINGLE_ITEM;
    public static final o SOLD_OUT;
    public static final o WORK;

    static {
        o oVar = new o("CLUSTER", 0);
        CLUSTER = oVar;
        o oVar2 = new o("SINGLE_ITEM", 1);
        SINGLE_ITEM = oVar2;
        o oVar3 = new o("SOLD_OUT", 2);
        SOLD_OUT = oVar3;
        o oVar4 = new o("MULTI_ITEMS", 3);
        MULTI_ITEMS = oVar4;
        o oVar5 = new o("MULTI_STORES", 4);
        MULTI_STORES = oVar5;
        o oVar6 = new o("PARTIAL_DETAIL", 5);
        PARTIAL_DETAIL = oVar6;
        o oVar7 = new o("HOME", 6);
        HOME = oVar7;
        o oVar8 = new o("WORK", 7);
        WORK = oVar8;
        o oVar9 = new o("OTHER", 8);
        OTHER = oVar9;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9};
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

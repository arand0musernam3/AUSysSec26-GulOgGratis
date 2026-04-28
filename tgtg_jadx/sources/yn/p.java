package yn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p CollectionSentBack;
    public static final p CollectionTimeChangedSingle;
    public static final p CollectionTimesChanged;
    public static final p ConfirmEmail;
    public static final p FavoriteForSale;
    public static final p ManufacturerNewItems;
    public static final p ReservationChanged;
    public static final p ReservationsChanged;

    static {
        p pVar = new p("CollectionTimeChangedSingle", 0);
        CollectionTimeChangedSingle = pVar;
        p pVar2 = new p("CollectionTimesChanged", 1);
        CollectionTimesChanged = pVar2;
        p pVar3 = new p("ReservationChanged", 2);
        ReservationChanged = pVar3;
        p pVar4 = new p("ReservationsChanged", 3);
        ReservationsChanged = pVar4;
        p pVar5 = new p("CollectionSentBack", 4);
        CollectionSentBack = pVar5;
        p pVar6 = new p("ConfirmEmail", 5);
        ConfirmEmail = pVar6;
        p pVar7 = new p("FavoriteForSale", 6);
        FavoriteForSale = pVar7;
        p pVar8 = new p("ManufacturerNewItems", 7);
        ManufacturerNewItems = pVar8;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8};
        $VALUES = pVarArr;
        $ENTRIES = new a80.b(pVarArr);
    }

    public static a80.a a() {
        return $ENTRIES;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}

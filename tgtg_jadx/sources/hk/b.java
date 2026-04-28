package hk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CONTACT_US_ALLERGIC;
    public static final b CONTACT_US_BAD_XP;
    public static final b CONTACT_US_BAD_XP_STORE_CLOSED;
    public static final b CONTACT_US_CATERING_ISSUE;
    public static final b CONTACT_US_DELIVERY_ISSUE;
    public static final b CONTACT_US_MISSED_COLLECTION;
    public static final b CONTACT_US_NEXT_DAY_DELIVERY_ISSUE;
    public static final b CONTACT_US_NO_FOOD;
    public static final b CONTACT_US_STORE_CLOSED;
    public static final b CONTACT_US_SUGGEST_STORE;
    public static final b ORDER_LIST;
    public static final b PRIVACY_SETTINGS;
    public static final b WEBVIEW_CAREER_SITE;
    public static final b WEBVIEW_JOIN_AS_A_STORE;

    static {
        b bVar = new b("ORDER_LIST", 0);
        ORDER_LIST = bVar;
        b bVar2 = new b("CONTACT_US_ALLERGIC", 1);
        CONTACT_US_ALLERGIC = bVar2;
        b bVar3 = new b("CONTACT_US_STORE_CLOSED", 2);
        CONTACT_US_STORE_CLOSED = bVar3;
        b bVar4 = new b("CONTACT_US_NO_FOOD", 3);
        CONTACT_US_NO_FOOD = bVar4;
        b bVar5 = new b("CONTACT_US_BAD_XP", 4);
        CONTACT_US_BAD_XP = bVar5;
        b bVar6 = new b("CONTACT_US_BAD_XP_STORE_CLOSED", 5);
        CONTACT_US_BAD_XP_STORE_CLOSED = bVar6;
        b bVar7 = new b("CONTACT_US_SUGGEST_STORE", 6);
        CONTACT_US_SUGGEST_STORE = bVar7;
        b bVar8 = new b("CONTACT_US_DELIVERY_ISSUE", 7);
        CONTACT_US_DELIVERY_ISSUE = bVar8;
        b bVar9 = new b("CONTACT_US_MISSED_COLLECTION", 8);
        CONTACT_US_MISSED_COLLECTION = bVar9;
        b bVar10 = new b("WEBVIEW_JOIN_AS_A_STORE", 9);
        WEBVIEW_JOIN_AS_A_STORE = bVar10;
        b bVar11 = new b("WEBVIEW_CAREER_SITE", 10);
        WEBVIEW_CAREER_SITE = bVar11;
        b bVar12 = new b("PRIVACY_SETTINGS", 11);
        PRIVACY_SETTINGS = bVar12;
        b bVar13 = new b("CONTACT_US_CATERING_ISSUE", 12);
        CONTACT_US_CATERING_ISSUE = bVar13;
        b bVar14 = new b("CONTACT_US_NEXT_DAY_DELIVERY_ISSUE", 13);
        CONTACT_US_NEXT_DAY_DELIVERY_ISSUE = bVar14;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        $VALUES = bVarArr;
        $ENTRIES = new a80.b(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}

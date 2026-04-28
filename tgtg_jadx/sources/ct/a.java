package ct;

import a80.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACCESSIBILITY_STATEMENT;
    public static final a ALLERGENS;
    public static final a ALLERGENS_MANUFACTURER;
    public static final a BLOG;
    public static final a CAREER;
    public static final a CHARITY;
    public static final a DIGITAL_SERVICES_ACT;
    public static final a FAQ_ITEM_MANUFACTURER;
    public static final a PRIVACY;
    public static final a TERMS_AND_CONDITIONS;
    public static final a TERMS_AND_CONDITIONS_CATERING;
    public static final a TERMS_AND_CONDITIONS_MANUFACTURER;
    public static final a TERMS_AND_CONDITIONS_USER_REFERRAL;
    public static final a UNKNOWN;

    static {
        a aVar = new a("ALLERGENS", 0);
        ALLERGENS = aVar;
        a aVar2 = new a("ALLERGENS_MANUFACTURER", 1);
        ALLERGENS_MANUFACTURER = aVar2;
        a aVar3 = new a("BLOG", 2);
        BLOG = aVar3;
        a aVar4 = new a("CAREER", 3);
        CAREER = aVar4;
        a aVar5 = new a("CHARITY", 4);
        CHARITY = aVar5;
        a aVar6 = new a("FAQ_ITEM_MANUFACTURER", 5);
        FAQ_ITEM_MANUFACTURER = aVar6;
        a aVar7 = new a("PRIVACY", 6);
        PRIVACY = aVar7;
        a aVar8 = new a("ACCESSIBILITY_STATEMENT", 7);
        ACCESSIBILITY_STATEMENT = aVar8;
        a aVar9 = new a("DIGITAL_SERVICES_ACT", 8);
        DIGITAL_SERVICES_ACT = aVar9;
        a aVar10 = new a("TERMS_AND_CONDITIONS", 9);
        TERMS_AND_CONDITIONS = aVar10;
        a aVar11 = new a("TERMS_AND_CONDITIONS_CATERING", 10);
        TERMS_AND_CONDITIONS_CATERING = aVar11;
        a aVar12 = new a("TERMS_AND_CONDITIONS_MANUFACTURER", 11);
        TERMS_AND_CONDITIONS_MANUFACTURER = aVar12;
        a aVar13 = new a("TERMS_AND_CONDITIONS_USER_REFERRAL", 12);
        TERMS_AND_CONDITIONS_USER_REFERRAL = aVar13;
        a aVar14 = new a("UNKNOWN", 13);
        UNKNOWN = aVar14;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14};
        $VALUES = aVarArr;
        $ENTRIES = new b(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}

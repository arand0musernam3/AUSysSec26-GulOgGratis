package h50;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b FIXED_LINE;
    public static final b FIXED_LINE_OR_MOBILE;
    public static final b MOBILE;
    public static final b PAGER;
    public static final b PERSONAL_NUMBER;
    public static final b PREMIUM_RATE;
    public static final b SHARED_COST;
    public static final b TOLL_FREE;
    public static final b UAN;
    public static final b UNKNOWN;
    public static final b VOICEMAIL;
    public static final b VOIP;

    static {
        b bVar = new b("FIXED_LINE", 0);
        FIXED_LINE = bVar;
        b bVar2 = new b("MOBILE", 1);
        MOBILE = bVar2;
        b bVar3 = new b("FIXED_LINE_OR_MOBILE", 2);
        FIXED_LINE_OR_MOBILE = bVar3;
        b bVar4 = new b("TOLL_FREE", 3);
        TOLL_FREE = bVar4;
        b bVar5 = new b("PREMIUM_RATE", 4);
        PREMIUM_RATE = bVar5;
        b bVar6 = new b("SHARED_COST", 5);
        SHARED_COST = bVar6;
        b bVar7 = new b("VOIP", 6);
        VOIP = bVar7;
        b bVar8 = new b("PERSONAL_NUMBER", 7);
        PERSONAL_NUMBER = bVar8;
        b bVar9 = new b("PAGER", 8);
        PAGER = bVar9;
        b bVar10 = new b("UAN", 9);
        UAN = bVar10;
        b bVar11 = new b("VOICEMAIL", 10);
        VOICEMAIL = bVar11;
        b bVar12 = new b("UNKNOWN", 11);
        UNKNOWN = bVar12;
        $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}

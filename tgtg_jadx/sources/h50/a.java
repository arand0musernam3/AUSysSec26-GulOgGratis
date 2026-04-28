package h50;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a INVALID_COUNTRY_CODE;
    public static final a NOT_A_NUMBER;
    public static final a TOO_LONG;
    public static final a TOO_SHORT_AFTER_IDD;
    public static final a TOO_SHORT_NSN;

    static {
        a aVar = new a("INVALID_COUNTRY_CODE", 0);
        INVALID_COUNTRY_CODE = aVar;
        a aVar2 = new a("NOT_A_NUMBER", 1);
        NOT_A_NUMBER = aVar2;
        a aVar3 = new a("TOO_SHORT_AFTER_IDD", 2);
        TOO_SHORT_AFTER_IDD = aVar3;
        a aVar4 = new a("TOO_SHORT_NSN", 3);
        TOO_SHORT_NSN = aVar4;
        a aVar5 = new a("TOO_LONG", 4);
        TOO_LONG = aVar5;
        $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}

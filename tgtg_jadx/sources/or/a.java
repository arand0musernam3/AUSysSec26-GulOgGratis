package or;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a COLLECTION_TIMES;
    public static final a COUNTRY;
    public static final a DIETARY;
    public static final a EMAIL;
    public static final a GENDER;
    public static final a NAME;
    public static final a PHONE;

    static {
        a aVar = new a("NAME", 0);
        NAME = aVar;
        a aVar2 = new a("EMAIL", 1);
        EMAIL = aVar2;
        a aVar3 = new a("PHONE", 2);
        PHONE = aVar3;
        a aVar4 = new a("COUNTRY", 3);
        COUNTRY = aVar4;
        a aVar5 = new a("GENDER", 4);
        GENDER = aVar5;
        a aVar6 = new a("DIETARY", 5);
        DIETARY = aVar6;
        a aVar7 = new a("COLLECTION_TIMES", 6);
        COLLECTION_TIMES = aVar7;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        $VALUES = aVarArr;
        $ENTRIES = new a80.b(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}

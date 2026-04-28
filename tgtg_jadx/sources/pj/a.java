package pj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BASIC_DATA_COLLECTION;
    public static final a MARKETING;

    static {
        a aVar = new a("BASIC_DATA_COLLECTION", 0);
        BASIC_DATA_COLLECTION = aVar;
        a aVar2 = new a("MARKETING", 1);
        MARKETING = aVar2;
        a[] aVarArr = {aVar, aVar2};
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

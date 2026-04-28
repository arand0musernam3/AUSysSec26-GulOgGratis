package ha0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BASIC;
    public static final a BODY;
    public static final a HEADERS;
    public static final a NONE;

    static {
        a aVar = new a("NONE", 0);
        NONE = aVar;
        a aVar2 = new a("BASIC", 1);
        BASIC = aVar2;
        a aVar3 = new a("HEADERS", 2);
        HEADERS = aVar3;
        a aVar4 = new a("BODY", 3);
        BODY = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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

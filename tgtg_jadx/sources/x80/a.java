package x80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DROP_LATEST;
    public static final a DROP_OLDEST;
    public static final a SUSPEND;

    static {
        a aVar = new a("SUSPEND", 0);
        SUSPEND = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        DROP_OLDEST = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        DROP_LATEST = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
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

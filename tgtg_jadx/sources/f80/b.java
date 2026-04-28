package f80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ABSENT;
    public static final b ABSENT_OPTIONAL;
    public static final b PRESENT;
    public static final b PRESENT_OPTIONAL;

    static {
        b bVar = new b("PRESENT", 0);
        PRESENT = bVar;
        b bVar2 = new b("ABSENT", 1);
        ABSENT = bVar2;
        b bVar3 = new b("PRESENT_OPTIONAL", 2);
        PRESENT_OPTIONAL = bVar3;
        b bVar4 = new b("ABSENT_OPTIONAL", 3);
        ABSENT_OPTIONAL = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
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

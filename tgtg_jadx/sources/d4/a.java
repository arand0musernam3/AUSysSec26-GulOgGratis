package d4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a SHOW_ORIGINAL;
    public static final a SHOW_TRANSLATED;

    static {
        a aVar = new a("SHOW_ORIGINAL", 0);
        SHOW_ORIGINAL = aVar;
        a aVar2 = new a("SHOW_TRANSLATED", 1);
        SHOW_TRANSLATED = aVar2;
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

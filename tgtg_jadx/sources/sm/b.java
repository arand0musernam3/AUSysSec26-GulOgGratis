package sm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CLICKED;
    public static final b DEFAULT;

    static {
        b bVar = new b("DEFAULT", 0);
        DEFAULT = bVar;
        b bVar2 = new b("CLICKED", 1);
        CLICKED = bVar2;
        b[] bVarArr = {bVar, bVar2};
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

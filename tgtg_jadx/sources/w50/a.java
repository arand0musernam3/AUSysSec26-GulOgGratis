package w50;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a AUTO;
    public static final a BYTE;
    public static final a NUMERIC;
    public static final a TEXT;

    static {
        a aVar = new a("AUTO", 0);
        AUTO = aVar;
        a aVar2 = new a("TEXT", 1);
        TEXT = aVar2;
        a aVar3 = new a("BYTE", 2);
        BYTE = aVar3;
        a aVar4 = new a("NUMERIC", 3);
        NUMERIC = aVar4;
        $VALUES = new a[]{aVar, aVar2, aVar3, aVar4};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}

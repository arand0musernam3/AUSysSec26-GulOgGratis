package on;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BEIGE;
    public static final a BLUE;
    public static final a GREEN;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f32691id;

    static {
        a aVar = new a("BLUE", 0, 1);
        BLUE = aVar;
        a aVar2 = new a("GREEN", 1, 2);
        GREEN = aVar2;
        a aVar3 = new a("BEIGE", 2, 3);
        BEIGE = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = new a80.b(aVarArr);
    }

    public a(String str, int i11, int i12) {
        this.f32691id = i12;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int a() {
        return this.f32691id;
    }
}

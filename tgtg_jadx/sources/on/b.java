package on;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b HEART;
    public static final b ROUND;
    public static final b STAR;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f32692id;

    static {
        b bVar = new b("ROUND", 0, 1);
        ROUND = bVar;
        b bVar2 = new b("HEART", 1, 2);
        HEART = bVar2;
        b bVar3 = new b("STAR", 2, 3);
        STAR = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = new a80.b(bVarArr);
    }

    public b(String str, int i11, int i12) {
        this.f32692id = i12;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int a() {
        return this.f32692id;
    }
}

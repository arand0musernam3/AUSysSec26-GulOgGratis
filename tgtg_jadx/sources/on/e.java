package on;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e BEIGE;
    public static final e BLUE;
    public static final e GREEN;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f32695id;

    static {
        e eVar = new e("BLUE", 0, 1);
        BLUE = eVar;
        e eVar2 = new e("GREEN", 1, 2);
        GREEN = eVar2;
        e eVar3 = new e("BEIGE", 2, 3);
        BEIGE = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = new a80.b(eVarArr);
    }

    public e(String str, int i11, int i12) {
        this.f32695id = i12;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final int a() {
        return this.f32695id;
    }
}

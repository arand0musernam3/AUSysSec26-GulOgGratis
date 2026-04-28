package lv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e LARGE;
    public static final e MEDIUM;
    public static final e SMALL;

    static {
        e eVar = new e("LARGE", 0);
        LARGE = eVar;
        e eVar2 = new e("MEDIUM", 1);
        MEDIUM = eVar2;
        e eVar3 = new e("SMALL", 2);
        SMALL = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = new a80.b(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}

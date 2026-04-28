package mn;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e CHARGES;
    public static final e COFFEE;
    public static final e ELECTRICITY;
    public static final e SHOWER;

    @NotNull
    private final String value;

    static {
        e eVar = new e("ELECTRICITY", 0, "ELECTRICITY");
        ELECTRICITY = eVar;
        e eVar2 = new e("CHARGES", 1, "CHARGES");
        CHARGES = eVar2;
        e eVar3 = new e("COFFEE", 2, "COFFEE");
        COFFEE = eVar3;
        e eVar4 = new e("SHOWER", 3, "SHOWER");
        SHOWER = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        $VALUES = eVarArr;
        $ENTRIES = new a80.b(eVarArr);
    }

    public e(String str, int i11, String str2) {
        this.value = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}

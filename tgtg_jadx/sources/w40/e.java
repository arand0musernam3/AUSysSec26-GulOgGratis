package w40;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e AUTH_ERROR;
    public static final e BAD_CONFIG;
    public static final e OK;

    static {
        e eVar = new e("OK", 0);
        OK = eVar;
        e eVar2 = new e("BAD_CONFIG", 1);
        BAD_CONFIG = eVar2;
        e eVar3 = new e("AUTH_ERROR", 2);
        AUTH_ERROR = eVar3;
        $VALUES = new e[]{eVar, eVar2, eVar3};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}

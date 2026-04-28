package px;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e OPERATION_SUCCESS;
    public static final e SERVICE_ERROR;
    public static final e SERVICE_NOT_AVAILABLE;

    static {
        e eVar = new e("OPERATION_SUCCESS", 0);
        OPERATION_SUCCESS = eVar;
        e eVar2 = new e("SERVICE_NOT_AVAILABLE", 1);
        SERVICE_NOT_AVAILABLE = eVar2;
        e eVar3 = new e("SERVICE_ERROR", 2);
        SERVICE_ERROR = eVar3;
        $VALUES = new e[]{eVar, eVar2, eVar3};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}

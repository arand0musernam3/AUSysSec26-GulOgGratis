package nx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e CUSTOM_APP_EVENTS;
    public static final e MOBILE_INSTALL_EVENT;

    static {
        e eVar = new e("MOBILE_INSTALL_EVENT", 0);
        MOBILE_INSTALL_EVENT = eVar;
        e eVar2 = new e("CUSTOM_APP_EVENTS", 1);
        CUSTOM_APP_EVENTS = eVar2;
        $VALUES = new e[]{eVar, eVar2};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}

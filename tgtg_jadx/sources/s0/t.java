package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    private static final /* synthetic */ t[] $VALUES;
    public static final t OFF;
    public static final t ON_CONTINUOUS_AUTO;
    public static final t ON_MANUAL_AUTO;
    public static final t UNKNOWN;

    static {
        t tVar = new t("UNKNOWN", 0);
        UNKNOWN = tVar;
        t tVar2 = new t("OFF", 1);
        OFF = tVar2;
        t tVar3 = new t("ON_MANUAL_AUTO", 2);
        ON_MANUAL_AUTO = tVar3;
        t tVar4 = new t("ON_CONTINUOUS_AUTO", 3);
        ON_CONTINUOUS_AUTO = tVar4;
        $VALUES = new t[]{tVar, tVar2, tVar3, tVar4};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}

package ox;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d MTML_APP_EVENT_PREDICTION;
    public static final d MTML_INTEGRITY_DETECT;

    static {
        d dVar = new d("MTML_INTEGRITY_DETECT", 0);
        MTML_INTEGRITY_DETECT = dVar;
        d dVar2 = new d("MTML_APP_EVENT_PREDICTION", 1);
        MTML_APP_EVENT_PREDICTION = dVar2;
        $VALUES = new d[]{dVar, dVar2};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String a() {
        int i11 = c.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return "integrity_detect";
        }
        if (i11 == 2) {
            return "app_event_pred";
        }
        e40.a.f();
        return null;
    }

    public final String c() {
        int i11 = c.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return "MTML_INTEGRITY_DETECT";
        }
        if (i11 == 2) {
            return "MTML_APP_EVENT_PRED";
        }
        e40.a.f();
        return null;
    }
}

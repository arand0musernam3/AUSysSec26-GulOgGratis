package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    private static final /* synthetic */ v[] $VALUES;
    public static final v AUTO;
    public static final v CLOUDY_DAYLIGHT;
    public static final v DAYLIGHT;
    public static final v FLUORESCENT;
    public static final v INCANDESCENT;
    public static final v OFF;
    public static final v SHADE;
    public static final v TWILIGHT;
    public static final v UNKNOWN;
    public static final v WARM_FLUORESCENT;

    static {
        v vVar = new v("UNKNOWN", 0);
        UNKNOWN = vVar;
        v vVar2 = new v("OFF", 1);
        OFF = vVar2;
        v vVar3 = new v("AUTO", 2);
        AUTO = vVar3;
        v vVar4 = new v("INCANDESCENT", 3);
        INCANDESCENT = vVar4;
        v vVar5 = new v("FLUORESCENT", 4);
        FLUORESCENT = vVar5;
        v vVar6 = new v("WARM_FLUORESCENT", 5);
        WARM_FLUORESCENT = vVar6;
        v vVar7 = new v("DAYLIGHT", 6);
        DAYLIGHT = vVar7;
        v vVar8 = new v("CLOUDY_DAYLIGHT", 7);
        CLOUDY_DAYLIGHT = vVar8;
        v vVar9 = new v("TWILIGHT", 8);
        TWILIGHT = vVar9;
        v vVar10 = new v("SHADE", 9);
        SHADE = vVar10;
        $VALUES = new v[]{vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8, vVar9, vVar10};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}

package qe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    private static final /* synthetic */ v[] $VALUES;
    public static final v BUTT;
    public static final v ROUND;
    public static final v UNKNOWN;

    static {
        v vVar = new v("BUTT", 0);
        BUTT = vVar;
        v vVar2 = new v("ROUND", 1);
        ROUND = vVar2;
        v vVar3 = new v("UNKNOWN", 2);
        UNKNOWN = vVar3;
        $VALUES = new v[]{vVar, vVar2, vVar3};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}

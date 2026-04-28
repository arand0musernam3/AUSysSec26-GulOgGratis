package z4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v Max;
    public static final v Min;

    static {
        v vVar = new v("Min", 0);
        Min = vVar;
        v vVar2 = new v("Max", 1);
        Max = vVar2;
        v[] vVarArr = {vVar, vVar2};
        $VALUES = vVarArr;
        $ENTRIES = new a80.b(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}

package mv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w DEFAULT;
    public static final w ONE_TIME_ALL_PLUS_SCHEDULED;
    public static final w ONE_TIME_SOLD_OUT_ONLY;

    static {
        w wVar = new w("DEFAULT", 0);
        DEFAULT = wVar;
        w wVar2 = new w("ONE_TIME_SOLD_OUT_ONLY", 1);
        ONE_TIME_SOLD_OUT_ONLY = wVar2;
        w wVar3 = new w("ONE_TIME_ALL_PLUS_SCHEDULED", 2);
        ONE_TIME_ALL_PLUS_SCHEDULED = wVar3;
        w[] wVarArr = {wVar, wVar2, wVar3};
        $VALUES = wVarArr;
        $ENTRIES = new a80.b(wVarArr);
    }

    public static a80.a a() {
        return $ENTRIES;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}

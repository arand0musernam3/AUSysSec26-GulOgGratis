package d50;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CRASHLYTICS;
    public static final d MATT_SAYS_HI;
    public static final d PERFORMANCE;

    static {
        d dVar = new d("CRASHLYTICS", 0);
        CRASHLYTICS = dVar;
        d dVar2 = new d("PERFORMANCE", 1);
        PERFORMANCE = dVar2;
        d dVar3 = new d("MATT_SAYS_HI", 2);
        MATT_SAYS_HI = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = new a80.b(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}

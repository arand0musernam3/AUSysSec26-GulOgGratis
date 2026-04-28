package w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class p0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[n0.values().length];
        try {
            iArr[n0.WITHOUT_FEATURE_COMBO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n0.WITH_FEATURE_COMBO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n0.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}

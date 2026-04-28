package o6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f32016a;

    static {
        int[] iArr = new int[s.values().length];
        f32016a = iArr;
        try {
            iArr[s.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f32016a[s.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f32016a[s.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

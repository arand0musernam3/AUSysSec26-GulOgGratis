package u40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f40744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f40745b;

    static {
        int[] iArr = new int[w40.e.values().length];
        f40745b = iArr;
        try {
            iArr[w40.e.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f40745b[w40.e.BAD_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f40745b[w40.e.AUTH_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[w40.d.values().length];
        f40744a = iArr2;
        try {
            iArr2[w40.d.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f40744a[w40.d.BAD_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}

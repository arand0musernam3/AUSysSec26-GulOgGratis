package je;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f25064a;

    static {
        int[] iArr = new int[qe.k.values().length];
        f25064a = iArr;
        try {
            iArr[qe.k.MERGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f25064a[qe.k.ADD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f25064a[qe.k.SUBTRACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f25064a[qe.k.INTERSECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f25064a[qe.k.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}

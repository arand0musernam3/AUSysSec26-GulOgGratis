package j4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f24527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f24528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f24529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f24530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f24531e = 0;

    static {
        long j9 = 3;
        long j11 = j9 << 32;
        f24527a = (((long) 0) & 4294967295L) | j11;
        f24528b = (((long) 1) & 4294967295L) | j11;
        f24529c = j11 | (((long) 2) & 4294967295L);
        f24530d = (j9 & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean a(long j9, long j11) {
        return j9 == j11;
    }

    public static String b(long j9) {
        return a(j9, f24527a) ? "Rgb" : a(j9, f24528b) ? "Xyz" : a(j9, f24529c) ? "Lab" : a(j9, f24530d) ? "Cmyk" : "Unknown";
    }
}

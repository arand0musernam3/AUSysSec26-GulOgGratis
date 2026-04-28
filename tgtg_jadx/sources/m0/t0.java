package m0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t0 f28599d = new t0(0, false, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t0 f28600e = new t0(500, true, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t0 f28601f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28604c;

    static {
        new t0(100L, true, false);
        f28601f = new t0(0L, false, true);
    }

    public t0(long j9, boolean z11, boolean z12) {
        this.f28603b = z11;
        this.f28602a = j9;
        if (z12) {
            pd.g.i("shouldRetry must be false when completeWithoutFailure is set to true", !z11);
        }
        this.f28604c = z12;
    }
}

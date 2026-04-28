package m7;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f29697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f29698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f29699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f29700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f29701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f29702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f29703i;

    public final float a(long j9) {
        if (j9 < this.f29699e) {
            return 0.0f;
        }
        long j11 = this.f29701g;
        if (j11 < 0 || j9 < j11) {
            return c.b((j9 - r0) / this.f29695a, 0.0f, 1.0f) * 0.5f;
        }
        float f11 = this.f29702h;
        return (c.b((j9 - j11) / this.f29703i, 0.0f, 1.0f) * f11) + (1.0f - f11);
    }
}

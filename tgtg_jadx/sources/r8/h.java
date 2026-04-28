package r8;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f37763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f37764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f37765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f37766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f37767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f37768i;

    public h(long j9, long j11, long j12, a aVar) {
        this.f37760a = j9;
        this.f37761b = j11;
        this.f37762c = j12;
        long jW = pd.g.w(pd.g.D(j9, j11));
        this.f37763d = jW;
        long jW2 = pd.g.w(pd.g.D(j12, j11));
        this.f37764e = jW2;
        float f11 = aVar != null ? aVar.f37754a : 0.0f;
        this.f37765f = f11;
        this.f37766g = 0.0f;
        float fS = pd.g.s(jW, jW2);
        float f12 = 1;
        float f13 = l.f37777b;
        float fSqrt = (float) Math.sqrt(f12 - (fS * fS));
        this.f37767h = ((double) fSqrt) > 0.001d ? ((fS + f12) * f11) / fSqrt : 0.0f;
        this.f37768i = q1.h.a(0.0f, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r8.b b(float r16, float r17, long r18, long r20, long r22, long r24, long r26, float r28) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r8.h.b(float, float, long, long, long, long, long, float):r8.b");
    }

    public final float a(float f11) {
        float fC = c();
        float f12 = this.f37766g;
        if (f11 > fC) {
            return f12;
        }
        float f13 = this.f37767h;
        if (f11 > f13) {
            return ((f11 - f13) * f12) / (c() - f13);
        }
        return 0.0f;
    }

    public final float c() {
        return (1 + this.f37766g) * this.f37767h;
    }
}

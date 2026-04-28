package k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static e0 f25558e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25559a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f25561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f25562d;

    public e0(int i11) {
        this.f25560b = i11;
    }

    public static void c(e0 e0Var, long j9, long j11, int i11) {
        if ((i11 & 1) != 0) {
            j9 = 0;
        }
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        synchronized (e0Var) {
            try {
                if (j9 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j11 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j12 = e0Var.f25561c + j9;
                e0Var.f25561c = j12;
                long j13 = e0Var.f25562d + j11;
                e0Var.f25562d = j13;
                if (j13 > j12) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(double d3, double d11, long j9) {
        double d12 = (0.01720197f * ((j9 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + ((double) (Math.round(((double) (r2 - 9.0E-4f)) - r6) + 9.0E-4f)) + ((-d11) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d13 = 0.01745329238474369d * d3;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d13))) / (Math.cos(dAsin) * Math.cos(d13));
        if (dSin3 >= 1.0d) {
            this.f25560b = 1;
            this.f25561c = -1L;
            this.f25562d = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f25560b = 0;
                this.f25561c = -1L;
                this.f25562d = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f25561c = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f25562d = jRound;
            if (jRound >= j9 || this.f25561c <= j9) {
                this.f25560b = 1;
            } else {
                this.f25560b = 0;
            }
        }
    }

    public synchronized long b() {
        return this.f25561c - this.f25562d;
    }

    public String toString() {
        switch (this.f25559a) {
            case 1:
                return "WindowCounter(streamId=" + this.f25560b + ", total=" + this.f25561c + ", acknowledged=" + this.f25562d + ", unacknowledged=" + b() + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e0() {
    }
}

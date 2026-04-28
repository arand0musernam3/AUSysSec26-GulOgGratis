package t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f39369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f39371d;

    public b0(int i11, int i12, u uVar) {
        this.f39368a = i11;
        this.f39369b = uVar;
        this.f39370c = ((long) i11) * 1000000;
        this.f39371d = ((long) i12) * 1000000;
    }

    @Override // t1.y
    public final float b(float f11, float f12, long j9, float f13) {
        long j11 = j9 - this.f39371d;
        if (j11 < 0) {
            j11 = 0;
        }
        long j12 = this.f39370c;
        if (j11 > j12) {
            j11 = j12;
        }
        float fA = this.f39369b.a(this.f39368a == 0 ? 1.0f : j11 / j12);
        return (f12 * fA) + ((1 - fA) * f11);
    }

    @Override // t1.y
    public final long c(float f11, float f12, float f13) {
        return this.f39371d + this.f39370c;
    }

    @Override // t1.y
    public final float e(float f11, float f12, long j9, float f13) {
        long j11 = j9 - this.f39371d;
        if (j11 < 0) {
            j11 = 0;
        }
        long j12 = this.f39370c;
        long j13 = j11 > j12 ? j12 : j11;
        if (j13 == 0) {
            return f13;
        }
        return (b(f11, f12, j13, f13) - b(f11, f12, j13 - 1000000, f13)) * 1000.0f;
    }
}

package k5;

import q1.g0;
import q1.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f25983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f25984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f25985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f25986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f25987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f25988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f25989g;

    public e() {
        g0 g0Var = p.f35804a;
        this.f25983a = new g0();
        this.f25985c = -1L;
        this.f25986d = 0L;
        this.f25987e = 0L;
    }

    public final void a(d dVar, long j9, long j11, float[] fArr, long j12) {
        long j13 = dVar.f25981g;
        if (j12 - j13 > 0 || j13 == Long.MIN_VALUE) {
            dVar.f25981g = j12;
            dVar.a(dVar.f25979e, dVar.f25980f, j9, j11, fArr);
        }
    }
}

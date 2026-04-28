package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ka {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ub.a f18982d = y3.j.b(new t0(21), new g2.q(21));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.g1 f18984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.g1 f18985c;

    public ka(float f11, float f12, float f13) {
        this.f18983a = f11;
        this.f18984b = new m3.g1(f13);
        this.f18985c = new m3.g1(f12);
    }

    public final float a() {
        if (this.f18983a == 0.0f) {
            return 0.0f;
        }
        return this.f18985c.h() / this.f18983a;
    }

    public final void b(float f11) {
        this.f18985c.i(n80.p.b(f11, this.f18983a, 0.0f));
    }
}

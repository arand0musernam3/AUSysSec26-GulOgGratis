package h4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f21374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f21375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f21376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f21377e;

    public a(a aVar) {
        this.f21373a = 1;
        this.f21374b = aVar.f21374b;
        this.f21375c = aVar.f21375c;
        this.f21376d = aVar.f21376d;
        this.f21377e = aVar.f21377e;
    }

    public void a(float f11, float f12, float f13, float f14) {
        this.f21374b = Math.max(f11, this.f21374b);
        this.f21375c = Math.max(f12, this.f21375c);
        this.f21376d = Math.min(f13, this.f21376d);
        this.f21377e = Math.min(f14, this.f21377e);
    }

    public boolean b() {
        return (this.f21374b >= this.f21376d) | (this.f21375c >= this.f21377e);
    }

    public float c() {
        return this.f21374b + this.f21376d;
    }

    public float d() {
        return this.f21375c + this.f21377e;
    }

    public void e(long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        this.f21374b += fIntBitsToFloat;
        this.f21375c += fIntBitsToFloat2;
        this.f21376d += fIntBitsToFloat;
        this.f21377e += fIntBitsToFloat2;
    }

    public final String toString() {
        switch (this.f21373a) {
            case 0:
                return "MutableRect(" + m0.c.q0(this.f21374b) + ", " + m0.c.q0(this.f21375c) + ", " + m0.c.q0(this.f21376d) + ", " + m0.c.q0(this.f21377e) + ')';
            default:
                return "[" + this.f21374b + " " + this.f21375c + " " + this.f21376d + " " + this.f21377e + "]";
        }
    }

    public a(float f11, float f12, float f13, float f14) {
        this.f21373a = 1;
        this.f21374b = f11;
        this.f21375c = f12;
        this.f21376d = f13;
        this.f21377e = f14;
    }

    public a() {
        this.f21373a = 0;
        this.f21374b = 0.0f;
        this.f21375c = 0.0f;
        this.f21376d = 0.0f;
        this.f21377e = 0.0f;
    }
}

package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Double f14066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f14072g;

    public final b1 a() {
        if (this.f14072g == 31) {
            return new b1(this.f14066a, this.f14067b, this.f14068c, this.f14069d, this.f14070e, this.f14071f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f14072g & 1) == 0) {
            sb2.append(" batteryVelocity");
        }
        if ((this.f14072g & 2) == 0) {
            sb2.append(" proximityOn");
        }
        if ((this.f14072g & 4) == 0) {
            sb2.append(" orientation");
        }
        if ((this.f14072g & 8) == 0) {
            sb2.append(" ramUsed");
        }
        if ((this.f14072g & 16) == 0) {
            sb2.append(" diskUsed");
        }
        com.braze.h2.b(w.a0.q("Missing required properties:", sb2));
        return null;
    }
}

package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f14387f;

    public final x0 a() {
        String str;
        if (this.f14387f == 7 && (str = this.f14383b) != null) {
            return new x0(this.f14382a, str, this.f14384c, this.f14385d, this.f14386e);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f14387f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f14383b == null) {
            sb2.append(" symbol");
        }
        if ((this.f14387f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f14387f & 4) == 0) {
            sb2.append(" importance");
        }
        com.braze.h2.b(w.a0.q("Missing required properties:", sb2));
        return null;
    }
}

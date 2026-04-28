package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f14404e;

    public final z0 a() {
        String str;
        if (this.f14404e == 7 && (str = this.f14400a) != null) {
            return new z0(this.f14401b, this.f14402c, str, this.f14403d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f14400a == null) {
            sb2.append(" processName");
        }
        if ((this.f14404e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f14404e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f14404e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        com.braze.h2.b(w.a0.q("Missing required properties:", sb2));
        return null;
    }
}

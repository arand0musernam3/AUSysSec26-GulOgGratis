package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f14059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f14060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f14061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f14062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m2 f14063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s1 f14064k;
    public p1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f14065m;

    public final b0 a() {
        if (this.f14065m == 1 && this.f14054a != null && this.f14055b != null && this.f14057d != null && this.f14061h != null && this.f14062i != null) {
            return new b0(this.f14054a, this.f14055b, this.f14056c, this.f14057d, this.f14058e, this.f14059f, this.f14060g, this.f14061h, this.f14062i, this.f14063j, this.f14064k, this.l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f14054a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f14055b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f14065m) == 0) {
            sb2.append(" platform");
        }
        if (this.f14057d == null) {
            sb2.append(" installationUuid");
        }
        if (this.f14061h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f14062i == null) {
            sb2.append(" displayVersion");
        }
        com.braze.h2.b(w.a0.q("Missing required properties:", sb2));
        return null;
    }
}

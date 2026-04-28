package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f14175e;

    public final i1 a() {
        String str;
        String str2;
        if (this.f14175e == 3 && (str = this.f14172b) != null && (str2 = this.f14173c) != null) {
            return new i1(str, this.f14171a, str2, this.f14174d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f14175e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f14172b == null) {
            sb2.append(" version");
        }
        if (this.f14173c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f14175e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        com.braze.h2.b(w.a0.q("Missing required properties:", sb2));
        return null;
    }
}

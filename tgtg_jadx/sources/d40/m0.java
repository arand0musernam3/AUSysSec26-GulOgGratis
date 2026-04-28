package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f14267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f14268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f14269j;

    public final n0 a() {
        String str;
        String str2;
        String str3;
        if (this.f14269j == 63 && (str = this.f14261b) != null && (str2 = this.f14267h) != null && (str3 = this.f14268i) != null) {
            return new n0(this.f14260a, str, this.f14262c, this.f14263d, this.f14264e, this.f14265f, this.f14266g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f14269j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f14261b == null) {
            sb2.append(" model");
        }
        if ((this.f14269j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f14269j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f14269j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f14269j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f14269j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.f14267h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f14268i == null) {
            sb2.append(" modelClass");
        }
        com.braze.h2.b(w.a0.q("Missing required properties:", sb2));
        return null;
    }
}

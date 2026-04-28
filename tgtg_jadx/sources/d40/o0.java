package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d2 f14299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e2 f14300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f2 f14301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i2 f14302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f14303g;

    public final p0 a() {
        String str;
        d2 d2Var;
        e2 e2Var;
        if (this.f14303g == 1 && (str = this.f14298b) != null && (d2Var = this.f14299c) != null && (e2Var = this.f14300d) != null) {
            return new p0(this.f14297a, str, d2Var, e2Var, this.f14301e, this.f14302f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f14303g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f14298b == null) {
            sb2.append(" type");
        }
        if (this.f14299c == null) {
            sb2.append(" app");
        }
        if (this.f14300d == null) {
            sb2.append(" device");
        }
        com.braze.h2.b(w.a0.q("Missing required properties:", sb2));
        return null;
    }
}

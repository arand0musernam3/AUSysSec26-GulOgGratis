package d40;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f14190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u1 f14192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l2 f14193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k2 f14194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v1 f14195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f14196k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f14197m;

    public final j0 a() {
        String str;
        String str2;
        u1 u1Var;
        if (this.f14197m == 7 && (str = this.f14186a) != null && (str2 = this.f14187b) != null && (u1Var = this.f14192g) != null) {
            return new j0(str, str2, this.f14188c, this.f14189d, this.f14190e, this.f14191f, u1Var, this.f14193h, this.f14194i, this.f14195j, this.f14196k, this.l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f14186a == null) {
            sb2.append(" generator");
        }
        if (this.f14187b == null) {
            sb2.append(" identifier");
        }
        if ((this.f14197m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f14197m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f14192g == null) {
            sb2.append(" app");
        }
        if ((this.f14197m & 4) == 0) {
            sb2.append(" generatorType");
        }
        com.braze.h2.b(w.a0.q("Missing required properties:", sb2));
        return null;
    }
}

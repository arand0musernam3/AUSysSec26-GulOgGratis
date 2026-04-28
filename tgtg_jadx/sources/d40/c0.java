package d40;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f14109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f14110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f14111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f14112j;

    public final d0 a() {
        String str;
        if (this.f14112j == 63 && (str = this.f14104b) != null) {
            return new d0(this.f14103a, str, this.f14105c, this.f14106d, this.f14107e, this.f14108f, this.f14109g, this.f14110h, this.f14111i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f14112j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f14104b == null) {
            sb2.append(" processName");
        }
        if ((this.f14112j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f14112j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f14112j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f14112j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f14112j & 32) == 0) {
            sb2.append(" timestamp");
        }
        com.braze.h2.b(w.a0.q("Missing required properties:", sb2));
        return null;
    }
}

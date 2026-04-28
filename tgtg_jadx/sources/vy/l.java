package vy;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f42583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f42587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f42588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f42589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f42590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f42591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f42592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f42593k;
    public final String l;

    public l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f42583a = num;
        this.f42584b = str;
        this.f42585c = str2;
        this.f42586d = str3;
        this.f42587e = str4;
        this.f42588f = str5;
        this.f42589g = str6;
        this.f42590h = str7;
        this.f42591i = str8;
        this.f42592j = str9;
        this.f42593k = str10;
        this.l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f42583a.equals(((l) aVar).f42583a)) {
            return false;
        }
        if (!this.f42584b.equals(((l) aVar).f42584b)) {
            return false;
        }
        if (!this.f42585c.equals(((l) aVar).f42585c)) {
            return false;
        }
        if (!this.f42586d.equals(((l) aVar).f42586d)) {
            return false;
        }
        if (!this.f42587e.equals(((l) aVar).f42587e)) {
            return false;
        }
        if (!this.f42588f.equals(((l) aVar).f42588f)) {
            return false;
        }
        if (!this.f42589g.equals(((l) aVar).f42589g)) {
            return false;
        }
        if (!this.f42590h.equals(((l) aVar).f42590h)) {
            return false;
        }
        if (!this.f42591i.equals(((l) aVar).f42591i)) {
            return false;
        }
        if (!this.f42592j.equals(((l) aVar).f42592j)) {
            return false;
        }
        if (this.f42593k.equals(((l) aVar).f42593k)) {
            return this.l.equals(((l) aVar).l);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.f42583a.hashCode() ^ 1000003) * 1000003) ^ this.f42584b.hashCode()) * 1000003) ^ this.f42585c.hashCode()) * 1000003) ^ this.f42586d.hashCode()) * 1000003) ^ this.f42587e.hashCode()) * 1000003) ^ this.f42588f.hashCode()) * 1000003) ^ this.f42589g.hashCode()) * 1000003) ^ this.f42590h.hashCode()) * 1000003) ^ this.f42591i.hashCode()) * 1000003) ^ this.f42592j.hashCode()) * 1000003) ^ this.f42593k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f42583a);
        sb2.append(", model=");
        sb2.append(this.f42584b);
        sb2.append(", hardware=");
        sb2.append(this.f42585c);
        sb2.append(", device=");
        sb2.append(this.f42586d);
        sb2.append(", product=");
        sb2.append(this.f42587e);
        sb2.append(", osBuild=");
        sb2.append(this.f42588f);
        sb2.append(", manufacturer=");
        sb2.append(this.f42589g);
        sb2.append(", fingerprint=");
        sb2.append(this.f42590h);
        sb2.append(", locale=");
        sb2.append(this.f42591i);
        sb2.append(", country=");
        sb2.append(this.f42592j);
        sb2.append(", mccMnc=");
        sb2.append(this.f42593k);
        sb2.append(", applicationBuild=");
        return r8.k.p(sb2, this.l, "}");
    }
}

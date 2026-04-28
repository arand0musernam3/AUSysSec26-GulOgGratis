package s0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f38337f;

    public h(String str, int i11, int i12, int i13, int i14, int i15) {
        this.f38332a = i11;
        if (str == null) {
            c50.w.l("Null mediaType");
            throw null;
        }
        this.f38333b = str;
        this.f38334c = i12;
        this.f38335d = i13;
        this.f38336e = i14;
        this.f38337f = i15;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f38332a == hVar.f38332a && this.f38333b.equals(hVar.f38333b) && this.f38334c == hVar.f38334c && this.f38335d == hVar.f38335d && this.f38336e == hVar.f38336e && this.f38337f == hVar.f38337f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f38332a ^ 1000003) * 1000003) ^ this.f38333b.hashCode()) * 1000003) ^ this.f38334c) * 1000003) ^ this.f38335d) * 1000003) ^ this.f38336e) * 1000003) ^ this.f38337f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioProfileProxy{codec=");
        sb2.append(this.f38332a);
        sb2.append(", mediaType=");
        sb2.append(this.f38333b);
        sb2.append(", bitrate=");
        sb2.append(this.f38334c);
        sb2.append(", sampleRate=");
        sb2.append(this.f38335d);
        sb2.append(", channels=");
        sb2.append(this.f38336e);
        sb2.append(", profile=");
        return r8.k.i(this.f38337f, "}", sb2);
    }
}

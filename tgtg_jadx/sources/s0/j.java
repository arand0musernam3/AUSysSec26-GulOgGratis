package s0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f38357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f38358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f38359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f38360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f38361j;

    public j(int i11, String str, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f38352a = i11;
        if (str == null) {
            c50.w.l("Null mediaType");
            throw null;
        }
        this.f38353b = str;
        this.f38354c = i12;
        this.f38355d = i13;
        this.f38356e = i14;
        this.f38357f = i15;
        this.f38358g = i16;
        this.f38359h = i17;
        this.f38360i = i18;
        this.f38361j = i19;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f38352a == jVar.f38352a && this.f38353b.equals(jVar.f38353b) && this.f38354c == jVar.f38354c && this.f38355d == jVar.f38355d && this.f38356e == jVar.f38356e && this.f38357f == jVar.f38357f && this.f38358g == jVar.f38358g && this.f38359h == jVar.f38359h && this.f38360i == jVar.f38360i && this.f38361j == jVar.f38361j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f38352a ^ 1000003) * 1000003) ^ this.f38353b.hashCode()) * 1000003) ^ this.f38354c) * 1000003) ^ this.f38355d) * 1000003) ^ this.f38356e) * 1000003) ^ this.f38357f) * 1000003) ^ this.f38358g) * 1000003) ^ this.f38359h) * 1000003) ^ this.f38360i) * 1000003) ^ this.f38361j;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoProfileProxy{codec=");
        sb2.append(this.f38352a);
        sb2.append(", mediaType=");
        sb2.append(this.f38353b);
        sb2.append(", bitrate=");
        sb2.append(this.f38354c);
        sb2.append(", frameRate=");
        sb2.append(this.f38355d);
        sb2.append(", width=");
        sb2.append(this.f38356e);
        sb2.append(", height=");
        sb2.append(this.f38357f);
        sb2.append(", profile=");
        sb2.append(this.f38358g);
        sb2.append(", bitDepth=");
        sb2.append(this.f38359h);
        sb2.append(", chromaSubsampling=");
        sb2.append(this.f38360i);
        sb2.append(", hdrFormat=");
        return r8.k.i(this.f38361j, "}", sb2);
    }
}

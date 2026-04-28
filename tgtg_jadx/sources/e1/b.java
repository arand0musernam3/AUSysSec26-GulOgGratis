package e1;

import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15436d;

    public b(String str, String str2, String str3, String str4) {
        this.f15433a = str;
        this.f15434b = str2;
        this.f15435c = str3;
        this.f15436d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15433a.equals(bVar.f15433a) && this.f15434b.equals(bVar.f15434b) && this.f15435c.equals(bVar.f15435c) && this.f15436d.equals(bVar.f15436d);
    }

    public final int hashCode() {
        return ((((((this.f15433a.hashCode() ^ 1000003) * 1000003) ^ this.f15434b.hashCode()) * 1000003) ^ this.f15435c.hashCode()) * 1000003) ^ this.f15436d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb2.append(this.f15433a);
        sb2.append(", eglVersion=");
        sb2.append(this.f15434b);
        sb2.append(", glExtensions=");
        sb2.append(this.f15435c);
        sb2.append(", eglExtensions=");
        return k.p(sb2, this.f15436d, "}");
    }
}

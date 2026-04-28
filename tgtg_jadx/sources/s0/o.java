package s0;

import android.util.Size;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f38410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f38411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f38412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f38413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f38414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f38415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f38416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f38417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f38418i;

    public o(Size size, LinkedHashMap linkedHashMap, Size size2, LinkedHashMap linkedHashMap2, Size size3, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, LinkedHashMap linkedHashMap5, LinkedHashMap linkedHashMap6) {
        if (size == null) {
            c50.w.l("Null analysisSize");
            throw null;
        }
        this.f38410a = size;
        this.f38411b = linkedHashMap;
        if (size2 == null) {
            c50.w.l("Null previewSize");
            throw null;
        }
        this.f38412c = size2;
        this.f38413d = linkedHashMap2;
        this.f38414e = size3;
        this.f38415f = linkedHashMap3;
        this.f38416g = linkedHashMap4;
        this.f38417h = linkedHashMap5;
        this.f38418i = linkedHashMap6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f38410a.equals(oVar.f38410a) && this.f38411b.equals(oVar.f38411b) && this.f38412c.equals(oVar.f38412c) && this.f38413d.equals(oVar.f38413d) && this.f38414e.equals(oVar.f38414e) && this.f38415f.equals(oVar.f38415f) && this.f38416g.equals(oVar.f38416g) && this.f38417h.equals(oVar.f38417h) && this.f38418i.equals(oVar.f38418i);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f38410a.hashCode() ^ 1000003) * 1000003) ^ this.f38411b.hashCode()) * 1000003) ^ this.f38412c.hashCode()) * 1000003) ^ this.f38413d.hashCode()) * 1000003) ^ this.f38414e.hashCode()) * 1000003) ^ this.f38415f.hashCode()) * 1000003) ^ this.f38416g.hashCode()) * 1000003) ^ this.f38417h.hashCode()) * 1000003) ^ this.f38418i.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f38410a + ", s720pSizeMap=" + this.f38411b + ", previewSize=" + this.f38412c + ", s1440pSizeMap=" + this.f38413d + ", recordSize=" + this.f38414e + ", maximumSizeMap=" + this.f38415f + ", maximum4x3SizeMap=" + this.f38416g + ", maximum16x9SizeMap=" + this.f38417h + ", ultraMaximumSizeMap=" + this.f38418i + "}";
    }
}

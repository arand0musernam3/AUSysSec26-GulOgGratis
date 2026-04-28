package w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f42777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f42778b;

    public r0(float f11, float f12) {
        this.f42777a = f11;
        this.f42778b = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.f42777a, r0Var.f42777a) == 0 && Float.compare(this.f42778b, r0Var.f42778b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f42778b) + r8.k.a(Float.hashCode(1.0f) * 31, this.f42777a, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ZoomValue(zoomRatio=1.0, minZoomRatio=");
        sb2.append(this.f42777a);
        sb2.append(", maxZoomRatio=");
        return r8.k.n(sb2, this.f42778b, ')');
    }
}

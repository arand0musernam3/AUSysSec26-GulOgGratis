package rk;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f38057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f38058c;

    public d(float f11, float f12, float f13) {
        this.f38056a = f11;
        this.f38057b = f12;
        this.f38058c = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f38056a, dVar.f38056a) == 0 && Float.compare(this.f38057b, dVar.f38057b) == 0 && Float.compare(this.f38058c, dVar.f38058c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38058c) + r8.k.a(Float.hashCode(this.f38056a) * 31, this.f38057b, 31);
    }

    public final String toString() {
        return "CollapsingHeaderState(progress=" + this.f38056a + ", overlayAlpha=" + this.f38057b + ", titleAlpha=" + this.f38058c + ")";
    }
}

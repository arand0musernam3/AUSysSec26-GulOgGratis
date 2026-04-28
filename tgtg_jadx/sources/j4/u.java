package j4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f24607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f24608b;

    public u(float f11, float f12) {
        this.f24607a = f11;
        this.f24608b = f12;
    }

    public final float[] a() {
        float f11 = this.f24607a;
        float f12 = this.f24608b;
        return new float[]{f11 / f12, 1.0f, ((1.0f - f11) - f12) / f12};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f24607a, uVar.f24607a) == 0 && Float.compare(this.f24608b, uVar.f24608b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f24608b) + (Float.hashCode(this.f24607a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f24607a);
        sb2.append(", y=");
        return r8.k.n(sb2, this.f24608b, ')');
    }
}

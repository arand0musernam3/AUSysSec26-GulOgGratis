package s1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f38525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38526c;

    public a1(float f11, float f12, long j9) {
        this.f38524a = f11;
        this.f38525b = f12;
        this.f38526c = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Float.compare(this.f38524a, a1Var.f38524a) == 0 && Float.compare(this.f38525b, a1Var.f38525b) == 0 && this.f38526c == a1Var.f38526c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38526c) + r8.k.a(Float.hashCode(this.f38524a) * 31, this.f38525b, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlingInfo(initialVelocity=");
        sb2.append(this.f38524a);
        sb2.append(", distance=");
        sb2.append(this.f38525b);
        sb2.append(", duration=");
        return w.a0.r(sb2, this.f38526c, ')');
    }
}

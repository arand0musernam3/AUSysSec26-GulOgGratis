package ye;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f45915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f45916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45917c;

    public n(float f11, float f12, long j9) {
        this.f45915a = f11;
        this.f45916b = f12;
        this.f45917c = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f45915a, nVar.f45915a) == 0 && Float.compare(this.f45916b, nVar.f45916b) == 0 && this.f45917c == nVar.f45917c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f45917c) + r8.k.a(Float.hashCode(this.f45915a) * 31, this.f45916b, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClickInfo(x=");
        sb2.append(this.f45915a);
        sb2.append(", y=");
        sb2.append(this.f45916b);
        sb2.append(", timestamp=");
        return w.a0.r(sb2, this.f45917c, ')');
    }
}

package p4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34387d;

    public n(float f11, float f12) {
        super(3);
        this.f34386c = f11;
        this.f34387d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f34386c, nVar.f34386c) == 0 && Float.compare(this.f34387d, nVar.f34387d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34387d) + (Float.hashCode(this.f34386c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoveTo(x=");
        sb2.append(this.f34386c);
        sb2.append(", y=");
        return r8.k.n(sb2, this.f34387d, ')');
    }
}

package p4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34385d;

    public m(float f11, float f12) {
        super(3);
        this.f34384c = f11;
        this.f34385d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f34384c, mVar.f34384c) == 0 && Float.compare(this.f34385d, mVar.f34385d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34385d) + (Float.hashCode(this.f34384c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineTo(x=");
        sb2.append(this.f34384c);
        sb2.append(", y=");
        return r8.k.n(sb2, this.f34385d, ')');
    }
}

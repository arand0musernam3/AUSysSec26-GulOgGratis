package p4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34397d;

    public q(float f11, float f12) {
        super(1);
        this.f34396c = f11;
        this.f34397d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f34396c, qVar.f34396c) == 0 && Float.compare(this.f34397d, qVar.f34397d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34397d) + (Float.hashCode(this.f34396c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
        sb2.append(this.f34396c);
        sb2.append(", y=");
        return r8.k.n(sb2, this.f34397d, ')');
    }
}

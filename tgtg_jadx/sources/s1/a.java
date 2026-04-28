package s1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f38522b;

    public a(float f11, float f12) {
        this.f38521a = f11;
        this.f38522b = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f38521a, aVar.f38521a) == 0 && Float.compare(this.f38522b, aVar.f38522b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38522b) + (Float.hashCode(this.f38521a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb2.append(this.f38521a);
        sb2.append(", velocityCoefficient=");
        return r8.k.n(sb2, this.f38522b, ')');
    }
}

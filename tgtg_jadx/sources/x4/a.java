package x4;

import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f43822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f43823b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f43822a == aVar.f43822a && Float.compare(this.f43823b, aVar.f43823b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f43823b) + (Long.hashCode(this.f43822a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f43822a);
        sb2.append(", dataPoint=");
        return k.n(sb2, this.f43823b, ')');
    }
}

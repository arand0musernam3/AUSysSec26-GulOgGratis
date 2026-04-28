package dz;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wy.i f15246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wy.h f15247c;

    public b(long j9, wy.i iVar, wy.h hVar) {
        this.f15245a = j9;
        this.f15246b = iVar;
        this.f15247c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15245a == bVar.f15245a && this.f15246b.equals(bVar.f15246b) && this.f15247c.equals(bVar.f15247c);
    }

    public final int hashCode() {
        long j9 = this.f15245a;
        return ((((((int) ((j9 >>> 32) ^ j9)) ^ 1000003) * 1000003) ^ this.f15246b.hashCode()) * 1000003) ^ this.f15247c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f15245a + ", transportContext=" + this.f15246b + ", event=" + this.f15247c + "}";
    }
}

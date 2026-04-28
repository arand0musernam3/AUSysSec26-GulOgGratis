package c50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f7593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f7594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f7595c;

    public k(j jVar, j jVar2, double d3) {
        jVar.getClass();
        jVar2.getClass();
        this.f7593a = jVar;
        this.f7594b = jVar2;
        this.f7595c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f7593a == kVar.f7593a && this.f7594b == kVar.f7594b && Double.compare(this.f7595c, kVar.f7595c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f7595c) + ((this.f7594b.hashCode() + (this.f7593a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f7593a + ", crashlytics=" + this.f7594b + ", sessionSamplingRate=" + this.f7595c + ')';
    }
}

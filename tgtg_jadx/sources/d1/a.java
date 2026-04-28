package d1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1.c f13668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1.c f13669b;

    public a(e1.c cVar, e1.c cVar2) {
        this.f13668a = cVar;
        this.f13669b = cVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13668a.equals(aVar.f13668a) && this.f13669b.equals(aVar.f13669b);
    }

    public final int hashCode() {
        return ((this.f13668a.hashCode() ^ 1000003) * 1000003) ^ this.f13669b.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f13668a + ", secondaryOutConfig=" + this.f13669b + "}";
    }
}

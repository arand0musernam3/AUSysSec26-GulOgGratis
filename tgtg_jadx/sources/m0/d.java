package m0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f28489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f28490b;

    public d(t tVar, e eVar) {
        if (tVar == null) {
            c50.w.l("Null type");
            throw null;
        }
        this.f28489a = tVar;
        this.f28490b = eVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f28489a.equals(dVar.f28489a)) {
            return false;
        }
        e eVar = dVar.f28490b;
        e eVar2 = this.f28490b;
        return eVar2 == null ? eVar == null : eVar2.equals(eVar);
    }

    public final int hashCode() {
        int iHashCode = (this.f28489a.hashCode() ^ 1000003) * 1000003;
        e eVar = this.f28490b;
        return iHashCode ^ (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "CameraState{type=" + this.f28489a + ", error=" + this.f28490b + "}";
    }
}

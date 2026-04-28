package dx;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f15199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f15200b;

    public i(t tVar, r rVar) {
        rVar.getClass();
        this.f15199a = tVar;
        this.f15200b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f15199a == iVar.f15199a && this.f15200b == iVar.f15200b;
    }

    public final int hashCode() {
        t tVar = this.f15199a;
        return this.f15200b.hashCode() + ((tVar == null ? 0 : tVar.hashCode()) * 31);
    }

    public final String toString() {
        return "SectionCustomEventFieldMapping(section=" + this.f15199a + ", field=" + this.f15200b + ')';
    }
}

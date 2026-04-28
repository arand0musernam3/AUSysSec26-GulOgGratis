package dx;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f15201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f15202b;

    public j(t tVar, u uVar) {
        tVar.getClass();
        this.f15201a = tVar;
        this.f15202b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f15201a == jVar.f15201a && this.f15202b == jVar.f15202b;
    }

    public final int hashCode() {
        int iHashCode = this.f15201a.hashCode() * 31;
        u uVar = this.f15202b;
        return iHashCode + (uVar == null ? 0 : uVar.hashCode());
    }

    public final String toString() {
        return "SectionFieldMapping(section=" + this.f15201a + ", field=" + this.f15202b + ')';
    }
}

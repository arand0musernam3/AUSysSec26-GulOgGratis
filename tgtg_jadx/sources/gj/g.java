package gj;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f20499a;

    public g(a aVar) {
        aVar.getClass();
        this.f20499a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f20499a == ((g) obj).f20499a;
    }

    public final int hashCode() {
        return this.f20499a.hashCode();
    }

    public final String toString() {
        return "CollectionTimeDayToggled(day=" + this.f20499a + ")";
    }
}

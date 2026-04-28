package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13816a;

    public j0(int i11) {
        this.f13816a = i11;
    }

    @Override // d2.y2
    public final int a(z5.c cVar, z5.m mVar) {
        return 0;
    }

    @Override // d2.y2
    public final int b(z5.c cVar, z5.m mVar) {
        return 0;
    }

    @Override // d2.y2
    public final int c(z5.c cVar) {
        return 0;
    }

    @Override // d2.y2
    public final int d(z5.c cVar) {
        return this.f13816a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.f13816a == ((j0) obj).f13816a;
    }

    public final int hashCode() {
        return this.f13816a * 961;
    }

    public final String toString() {
        return r8.k.i(this.f13816a, ", right=0, bottom=0)", new StringBuilder("Insets(left=0, top="));
    }
}

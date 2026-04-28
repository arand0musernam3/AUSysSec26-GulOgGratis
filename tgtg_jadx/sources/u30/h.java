package u30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f40690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40691b;

    public h(o oVar, boolean z11) {
        this.f40690a = oVar;
        this.f40691b = z11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f40690a.equals(this.f40690a) && hVar.f40691b == this.f40691b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f40690a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f40691b).hashCode();
    }
}

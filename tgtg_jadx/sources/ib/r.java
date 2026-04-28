package ib;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f23758a;

    public r(h hVar) {
        this.f23758a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        return this.f23758a.equals(((r) obj).f23758a);
    }

    public final int hashCode() {
        return this.f23758a.hashCode() + (r.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f23758a + '}';
    }

    public r() {
        this(h.f23726b);
    }
}

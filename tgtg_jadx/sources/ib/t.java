package ib;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f23759a;

    public t(h hVar) {
        this.f23759a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        return this.f23759a.equals(((t) obj).f23759a);
    }

    public final int hashCode() {
        return this.f23759a.hashCode() + (t.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f23759a + '}';
    }
}

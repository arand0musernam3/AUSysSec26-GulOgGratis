package vy;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f42602a;

    public r(q qVar) {
        this.f42602a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        return this.f42602a.equals(((r) ((d0) obj)).f42602a);
    }

    public final int hashCode() {
        return this.f42602a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f42602a + "}";
    }
}

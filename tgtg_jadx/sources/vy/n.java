package vy;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f42595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f42596b;

    public n(x xVar, l lVar) {
        this.f42595a = xVar;
        this.f42596b = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        x xVar = this.f42595a;
        if (xVar == null) {
            if (((n) yVar).f42595a != null) {
                return false;
            }
        } else if (!xVar.equals(((n) yVar).f42595a)) {
            return false;
        }
        return this.f42596b.equals(((n) yVar).f42596b);
    }

    public final int hashCode() {
        x xVar = this.f42595a;
        return (((xVar == null ? 0 : xVar.hashCode()) ^ 1000003) * 1000003) ^ this.f42596b.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f42595a + ", androidClientInfo=" + this.f42596b + "}";
    }
}

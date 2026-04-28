package g7;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20084b;

    public a(Object obj, Object obj2) {
        this.f20083a = obj;
        this.f20084b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(aVar.f20083a, this.f20083a) && Objects.equals(aVar.f20084b, this.f20084b);
    }

    public final int hashCode() {
        Object obj = this.f20083a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f20084b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.f20083a + " " + this.f20084b + "}";
    }
}

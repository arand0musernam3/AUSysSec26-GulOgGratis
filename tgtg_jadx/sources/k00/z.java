package k00;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f25713a;

    public z(v vVar) {
        this.f25713a = vVar;
    }

    @Override // k00.v
    public final v a() {
        return this.f25713a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f25713a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            return this.f25713a.equals(((z) obj).f25713a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f25713a.hashCode();
    }

    public final String toString() {
        return this.f25713a.toString().concat(".reverse()");
    }
}

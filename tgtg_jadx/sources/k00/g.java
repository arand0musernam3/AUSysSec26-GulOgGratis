package k00;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f25640a;

    public g(Comparator comparator) {
        comparator.getClass();
        this.f25640a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f25640a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f25640a.equals(((g) obj).f25640a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25640a.hashCode();
    }

    public final String toString() {
        return this.f25640a.toString();
    }
}

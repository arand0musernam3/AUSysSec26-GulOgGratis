package d50;

import a40.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e90.c f14412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f14413b = null;

    public a(e90.c cVar) {
        this.f14412a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f14412a, aVar.f14412a) && Intrinsics.areEqual(this.f14413b, aVar.f14413b);
    }

    public final int hashCode() {
        int iHashCode = this.f14412a.hashCode() * 31;
        k kVar = this.f14413b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f14412a + ", subscriber=" + this.f14413b + ')';
    }
}

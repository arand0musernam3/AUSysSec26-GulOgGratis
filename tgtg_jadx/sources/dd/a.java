package dd;

import a3.j;
import qc.f;
import zc.l;
import zc.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14869b;

    public a(int i11) {
        this.f14869b = i11;
        if (i11 > 0) {
            return;
        }
        i4.a.f("durationMillis must be > 0.");
        throw null;
    }

    @Override // dd.d
    public final e a(bd.a aVar, l lVar) {
        return !(lVar instanceof r) ? new c(aVar, lVar) : ((r) lVar).f47510c == f.MEMORY_CACHE ? new c(aVar, lVar) : new j(aVar, lVar, this.f14869b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f14869b == ((a) obj).f14869b;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f14869b * 31);
    }
}

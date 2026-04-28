package y0;

import m0.k0;
import s0.k2;
import s0.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f44537a;

    public b(y yVar) {
        this.f44537a = yVar;
    }

    @Override // m0.k0
    public final k2 b() {
        return this.f44537a.b();
    }

    @Override // m0.k0
    public final int c() {
        int iOrdinal = this.f44537a.c().ordinal();
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // m0.k0
    public final void d(v0.i iVar) {
        this.f44537a.d(iVar);
    }

    @Override // m0.k0
    public final long getTimestamp() {
        return this.f44537a.getTimestamp();
    }
}

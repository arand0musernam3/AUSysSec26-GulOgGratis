package s2;

import qc.y;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements t2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f38764b;

    public f(g gVar, long j9) {
        this.f38764b = gVar;
        this.f38763a = j9;
    }

    @Override // t2.d
    public final h4.c C0(z zVar) {
        return na0.a.S(u0(zVar), 0L);
    }

    @Override // t2.d
    public final p2.c P() {
        return h.b(this.f38764b);
    }

    @Override // t2.d
    public final long u0(z zVar) {
        z zVar2 = (z) this.f38764b.f38766r.getValue();
        if (zVar2 != null) {
            return zVar.g(zVar2, this.f38763a);
        }
        c2.a.d("Tried to open context menu before the anchor was placed.");
        y.m();
        return 0L;
    }
}

package nb;

import ib.w;
import ib.x;
import ob.h;
import qb.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30802b;

    static {
        w.f("NetworkMeteredCtrlr");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar) {
        super(hVar);
        hVar.getClass();
        this.f30802b = 7;
    }

    @Override // nb.d
    public final boolean a(o oVar) {
        return oVar.f36837j.f23711a == x.METERED;
    }

    @Override // nb.b
    public final int c() {
        return this.f30802b;
    }

    @Override // nb.b
    public final boolean d(Object obj) {
        mb.f fVar = (mb.f) obj;
        fVar.getClass();
        return (fVar.f29909a && fVar.f29911c && !fVar.f29913e) ? false : true;
    }
}

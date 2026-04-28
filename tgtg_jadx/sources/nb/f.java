package nb;

import ib.w;
import ib.x;
import ob.h;
import qb.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30803b;

    static {
        w.f("NetworkNotRoamingCtrlr");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar) {
        super(hVar);
        hVar.getClass();
        this.f30803b = 7;
    }

    @Override // nb.d
    public final boolean a(o oVar) {
        return oVar.f36837j.f23711a == x.NOT_ROAMING;
    }

    @Override // nb.b
    public final int c() {
        return this.f30803b;
    }

    @Override // nb.b
    public final boolean d(Object obj) {
        mb.f fVar = (mb.f) obj;
        fVar.getClass();
        return (fVar.f29909a && fVar.f29912d && !fVar.f29913e) ? false : true;
    }
}

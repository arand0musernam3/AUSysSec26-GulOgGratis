package nb;

import ib.x;
import ob.h;
import qb.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ob.e eVar, int i11) {
        super(eVar);
        this.f30800b = i11;
        eVar.getClass();
        switch (i11) {
            case 4:
                super(eVar);
                this.f30801c = 9;
                break;
            default:
                this.f30801c = 6;
                break;
        }
    }

    @Override // nb.d
    public final boolean a(o oVar) {
        switch (this.f30800b) {
            case 0:
                return oVar.f36837j.f23713c;
            case 1:
                return oVar.f36837j.f23715e;
            case 2:
                return oVar.f36837j.f23711a == x.CONNECTED;
            case 3:
                return oVar.f36837j.f23711a == x.UNMETERED;
            default:
                return oVar.f36837j.f23716f;
        }
    }

    @Override // nb.b
    public final int c() {
        switch (this.f30800b) {
        }
        return this.f30801c;
    }

    @Override // nb.b
    public final boolean d(Object obj) {
        boolean zBooleanValue;
        switch (this.f30800b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                mb.f fVar = (mb.f) obj;
                fVar.getClass();
                return (!fVar.f29913e && fVar.f29909a && fVar.f29910b) ? false : true;
            case 3:
                mb.f fVar2 = (mb.f) obj;
                fVar2.getClass();
                return !fVar2.f29909a || fVar2.f29911c || fVar2.f29913e;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ob.a aVar) {
        super(aVar);
        this.f30800b = 1;
        aVar.getClass();
        this.f30801c = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, int i11) {
        super(hVar);
        this.f30800b = i11;
        hVar.getClass();
        switch (i11) {
            case 3:
                super(hVar);
                this.f30801c = 7;
                break;
            default:
                this.f30801c = 7;
                break;
        }
    }
}

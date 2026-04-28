package ib;

import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23770d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Class cls, int i11) {
        super(cls);
        this.f23770d = i11;
    }

    @Override // ib.j0
    public final k0 b() {
        switch (this.f23770d) {
            case 0:
                return new a0((UUID) this.f23741a, (qb.o) this.f23742b, (Set) this.f23743c);
            default:
                qb.o oVar = (qb.o) this.f23742b;
                if (!oVar.f36843q) {
                    return new e0((UUID) this.f23741a, oVar, (Set) this.f23743c);
                }
                i4.a.f("PeriodicWorkRequests cannot be expedited");
                return null;
        }
    }
}

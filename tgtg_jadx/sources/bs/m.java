package bs;

import androidx.lifecycle.l1;
import androidx.lifecycle.o0;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f6691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l1 f6692k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(l1 l1Var, x70.c cVar, int i11) {
        super(3, cVar);
        this.f6691j = i11;
        this.f6692k = l1Var;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x70.c cVar = (x70.c) obj3;
        switch (this.f6691j) {
            case 0:
                return new m((o) this.f6692k, cVar, 0).invokeSuspend(Unit.f26487a);
            default:
                return new m((zp.g) this.f6692k, cVar, 1).invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f6691j;
        l1 l1Var = this.f6692k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((av.e) ((o) l1Var).f6700f.getValue()).k(Boolean.FALSE);
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                zp.g gVar = (zp.g) l1Var;
                gVar.f48028f.k(null);
                o0 o0Var = gVar.f48030h;
                f70.i iVar = (f70.i) gVar.f48026d.a("ORIGIN");
                if (iVar == null) {
                    iVar = f70.i.UNKNOWN;
                }
                o0Var.k(Boolean.valueOf(wd.a.A(iVar)));
                break;
        }
        return Unit.f26487a;
    }
}

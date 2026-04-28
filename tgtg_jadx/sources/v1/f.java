package v1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f41714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g f41715k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f41714j = i11;
        this.f41715k = gVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f41714j) {
            case 0:
                return new f(this.f41715k, cVar, 0);
            default:
                return new f(this.f41715k, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f41714j) {
        }
        return ((f) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f41714j;
        x70.c cVar = null;
        g gVar = this.f41715k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (gVar.C == null) {
                    b2.h hVar = new b2.h();
                    b2.l lVar = gVar.f41721q;
                    if (lVar != null) {
                        v80.f0.B(gVar.getCoroutineScope(), null, null, new tm.d(lVar, hVar, cVar, 9), 3);
                    }
                    gVar.C = hVar;
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b2.h hVar2 = gVar.C;
                if (hVar2 != null) {
                    b2.i iVar = new b2.i(hVar2);
                    b2.l lVar2 = gVar.f41721q;
                    if (lVar2 != null) {
                        v80.f0.B(gVar.getCoroutineScope(), null, null, new tm.d(lVar2, iVar, cVar, 10), 3);
                    }
                    gVar.C = null;
                }
                break;
        }
        return Unit.f26487a;
    }
}

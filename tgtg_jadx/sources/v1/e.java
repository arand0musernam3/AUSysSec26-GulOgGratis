package v1;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f41711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41712k;
    public final /* synthetic */ g l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b2.n f41713m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, b2.n nVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f41711j = i11;
        this.l = gVar;
        this.f41713m = nVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f41711j) {
            case 0:
                return new e(this.l, this.f41713m, cVar, 0);
            case 1:
                return new e(this.l, this.f41713m, cVar, 1);
            case 2:
                return new e(this.l, this.f41713m, cVar, 2);
            default:
                return new e(this.l, this.f41713m, cVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f41711j) {
        }
        return ((e) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f41711j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f41712k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    b2.l lVar = this.l.f41721q;
                    if (lVar != null) {
                        b2.m mVar = new b2.m(this.f41713m);
                        this.f41712k = 1;
                        if (lVar.b(mVar, this) == aVar) {
                        }
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f41712k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    b2.l lVar2 = this.l.f41721q;
                    if (lVar2 != null) {
                        b2.m mVar2 = new b2.m(this.f41713m);
                        this.f41712k = 1;
                        if (lVar2.b(mVar2, this) == aVar2) {
                        }
                    }
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f41712k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    b2.l lVar3 = this.l.f41721q;
                    if (lVar3 != null) {
                        this.f41712k = 1;
                        if (lVar3.b(this.f41713m, this) == aVar3) {
                        }
                    }
                }
                break;
            default:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f41712k;
                if (i14 != 0) {
                    if (i14 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    b2.l lVar4 = this.l.f41721q;
                    if (lVar4 != null) {
                        b2.o oVar = new b2.o(this.f41713m);
                        this.f41712k = 1;
                        if (lVar4.b(oVar, this) == aVar4) {
                        }
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}

package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f19372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19373k;
    public final /* synthetic */ b2.k l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z3.r f19374m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(b2.k kVar, z3.r rVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f19372j = i11;
        this.l = kVar;
        this.f19374m = rVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f19372j) {
            case 0:
                return new r(this.l, this.f19374m, cVar, 0);
            case 1:
                return new r(this.l, this.f19374m, cVar, 1);
            default:
                return new r(this.l, this.f19374m, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f19372j) {
        }
        return ((r) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19372j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f19373k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y80.i iVarA = this.l.a();
                    q qVar = new q(this.f19374m, 0);
                    this.f19373k = 1;
                    if (iVarA.collect(qVar, this) == aVar) {
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f19373k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y80.i iVarA2 = this.l.a();
                    q qVar2 = new q(this.f19374m, 1);
                    this.f19373k = 1;
                    if (iVarA2.collect(qVar2, this) == aVar2) {
                    }
                }
                break;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f19373k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y80.i iVarA3 = this.l.a();
                    q qVar3 = new q(this.f19374m, 2);
                    this.f19373k = 1;
                    if (iVarA3.collect(qVar3, this) == aVar3) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}

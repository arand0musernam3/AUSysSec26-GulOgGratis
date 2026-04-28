package m2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f28847j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f28848k;
    public final /* synthetic */ x2.w l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(x2.w wVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f28847j = i11;
        this.l = wVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f28847j) {
            case 0:
                f0 f0Var = new f0(this.l, cVar, 0);
                long j9 = ((h4.b) obj).f21378a;
                return f0Var;
            case 1:
                return new f0(this.l, cVar, 1);
            case 2:
                return new f0(this.l, cVar, 2);
            default:
                return new f0(this.l, cVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28847j) {
            case 0:
                long j9 = ((h4.b) obj).f21378a;
                break;
        }
        return ((f0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f28847j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f28848k;
                x2.w wVar = this.l;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ba0.g.M(obj);
                    } else if (i11 != 2) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f28848k = 1;
                    if (wVar.y() == aVar) {
                    }
                }
                a3.u uVar = wVar.f43787g;
                w2.s1 s1Var = wVar.f43781a;
                if (uVar != null) {
                    CharSequence charSequence = s1Var.d().f41928c;
                    long j9 = s1Var.d().f41929d;
                    this.f28848k = 2;
                    Object objD = ((a3.b0) uVar).d(charSequence, j9, this);
                    if (objD != aVar) {
                        objD = Unit.f26487a;
                    }
                    if (objD == aVar) {
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f28848k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f28848k = 1;
                    if (this.l.x(this) == aVar2) {
                    }
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f28848k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f28848k = 1;
                    x2.w wVar2 = this.l;
                    wVar2.getClass();
                    at.o oVarD = m3.i.D(new g(wVar2, 5));
                    x2.q qVar = x2.q.f43768a;
                    w2.g0 g0Var = y80.r.f45560a;
                    qVar.getClass();
                    Object objCollect = y80.r.m(oVarD, g0Var, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(qVar, 2)).collect(new y80.e0(new Ref.IntRef(), new x2.r(wVar2, 0)), this);
                    if (objCollect != y70.a.COROUTINE_SUSPENDED) {
                        objCollect = Unit.f26487a;
                    }
                    if (objCollect != aVar3) {
                        objCollect = Unit.f26487a;
                    }
                    if (objCollect == aVar3) {
                    }
                }
                break;
            default:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f28848k;
                if (i14 != 0) {
                    if (i14 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f28848k = 1;
                    x2.w wVar3 = this.l;
                    wVar3.getClass();
                    Object objCollect2 = y80.r.m(m3.i.D(new g(wVar3, 3)), new w2.g0(6), y80.r.f45561b).collect(new x2.r(wVar3, 1), this);
                    if (objCollect2 != aVar4) {
                        objCollect2 = Unit.f26487a;
                    }
                    if (objCollect2 == aVar4) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}

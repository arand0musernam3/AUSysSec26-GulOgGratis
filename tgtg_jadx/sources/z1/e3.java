package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f46485j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f46486k;
    public final /* synthetic */ g3 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ long f46487m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(g3 g3Var, long j9, x70.c cVar, int i11) {
        super(2, cVar);
        this.f46485j = i11;
        this.l = g3Var;
        this.f46487m = j9;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f46485j) {
            case 0:
                return new e3(this.l, this.f46487m, cVar, 0);
            case 1:
                return new e3(this.l, this.f46487m, cVar, 1);
            default:
                e3 e3Var = new e3(this.l, cVar);
                e3Var.f46487m = ((h4.b) obj).f21378a;
                return e3Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f46485j) {
            case 0:
                return ((e3) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((e3) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                long j9 = ((h4.b) obj).f21378a;
                e3 e3Var = new e3(this.l, (x70.c) obj2);
                e3Var.f46487m = j9;
                return e3Var.invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f46485j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f46486k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    l3 l3Var = this.l.N;
                    v1.j1 j1Var = v1.j1.UserInput;
                    ao.j0 j0Var = new ao.j0(this.f46487m, null, 2);
                    this.f46486k = 1;
                    if (l3Var.f(j1Var, j0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f46486k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    l3 l3Var2 = this.l.N;
                    long j9 = this.f46487m;
                    this.f46486k = 1;
                    if (l3Var2.b(j9, true, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f46486k;
                if (i13 != 0) {
                    if (i13 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                long j11 = this.f46487m;
                l3 l3Var3 = this.l.N;
                this.f46486k = 1;
                Object objA = y2.a(l3Var3, j11, this);
                return objA == aVar3 ? aVar3 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(g3 g3Var, x70.c cVar) {
        super(2, cVar);
        this.f46485j = 2;
        this.l = g3Var;
    }
}

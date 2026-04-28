package m3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f29482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29483k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function2 f29484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b1 f29485n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(Function2 function2, b1 b1Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f29482j = i11;
        this.f29484m = function2;
        this.f29485n = b1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f29482j) {
            case 0:
                x2 x2Var = new x2(this.f29484m, this.f29485n, cVar, 0);
                x2Var.l = obj;
                return x2Var;
            case 1:
                x2 x2Var2 = new x2(this.f29484m, this.f29485n, cVar, 1);
                x2Var2.l = obj;
                return x2Var2;
            case 2:
                x2 x2Var3 = new x2(this.f29484m, this.f29485n, cVar, 2);
                x2Var3.l = obj;
                return x2Var3;
            default:
                x2 x2Var4 = new x2(this.f29484m, this.f29485n, cVar, 3);
                x2Var4.l = obj;
                return x2Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f29482j) {
        }
        return ((x2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f29482j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f29483k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    t1 t1Var = new t1(this.f29485n, ((v80.b0) this.l).getCoroutineContext());
                    this.f29483k = 1;
                    if (this.f29484m.invoke(t1Var, this) == aVar) {
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f29483k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    t1 t1Var2 = new t1(this.f29485n, ((v80.b0) this.l).getCoroutineContext());
                    this.f29483k = 1;
                    if (this.f29484m.invoke(t1Var2, this) == aVar2) {
                    }
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f29483k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    t1 t1Var3 = new t1(this.f29485n, ((v80.b0) this.l).getCoroutineContext());
                    this.f29483k = 1;
                    if (this.f29484m.invoke(t1Var3, this) == aVar3) {
                    }
                }
                break;
            default:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f29483k;
                if (i14 != 0) {
                    if (i14 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    t1 t1Var4 = new t1(this.f29485n, ((v80.b0) this.l).getCoroutineContext());
                    this.f29483k = 1;
                    if (this.f29484m.invoke(t1Var4, this) == aVar4) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}

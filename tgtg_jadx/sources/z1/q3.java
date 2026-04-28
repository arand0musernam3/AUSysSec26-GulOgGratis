package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q3 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f46644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k2 f46645k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(k2 k2Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f46644j = i11;
        this.f46645k = k2Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f46644j) {
            case 0:
                return new q3(this.f46645k, cVar, 0);
            case 1:
                return new q3(this.f46645k, cVar, 1);
            case 2:
                return new q3(this.f46645k, cVar, 2);
            case 3:
                return new q3(this.f46645k, cVar, 3);
            case 4:
                return new q3(this.f46645k, cVar, 4);
            case 5:
                return new q3(this.f46645k, cVar, 5);
            case 6:
                return new q3(this.f46645k, cVar, 6);
            default:
                return new q3(this.f46645k, cVar, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f46644j) {
        }
        return ((q3) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f46644j;
        k2 k2Var = this.f46645k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                k2Var.b();
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                k2Var.c();
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                k2Var.c();
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                k2Var.b();
                break;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                k2Var.c();
                break;
            case 5:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                k2Var.c();
                break;
            case 6:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                k2Var.b();
                break;
            default:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                k2Var.c();
                break;
        }
        return Unit.f26487a;
    }
}

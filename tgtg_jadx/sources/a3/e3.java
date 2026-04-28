package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l3 f334k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(l3 l3Var, x70.c cVar, int i11) {
        super(1, cVar);
        this.f333j = i11;
        this.f334k = l3Var;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        switch (this.f333j) {
            case 0:
                return new e3(this.f334k, cVar, 0);
            case 1:
                return new e3(this.f334k, cVar, 1);
            case 2:
                return new e3(this.f334k, cVar, 2);
            default:
                return new e3(this.f334k, cVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        x70.c cVar = (x70.c) obj;
        switch (this.f333j) {
        }
        return ((e3) create(cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f333j;
        l3 l3Var = this.f334k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                l3Var.A = false;
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                l3Var.f();
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                l3Var.d(l3Var.A);
                break;
            default:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                l3Var.p();
                break;
        }
        return Unit.f26487a;
    }
}

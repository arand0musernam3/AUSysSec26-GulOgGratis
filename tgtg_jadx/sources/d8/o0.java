package d8;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f14665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r0 f14666k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(r0 r0Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f14665j = i11;
        this.f14666k = r0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f14665j) {
            case 0:
                return new o0(this.f14666k, cVar, 0);
            default:
                return new o0(this.f14666k, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f14665j) {
        }
        return ((o0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f14665j;
        r0 r0Var = this.f14666k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                z0 z0Var = (z0) ((a1) r0Var.f14695i.getValue());
                return new Integer(z0Var.f14749b.nativeGetCounterValue(z0Var.f14750c));
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                z0 z0Var2 = (z0) ((a1) r0Var.f14695i.getValue());
                return new Integer(z0Var2.f14749b.nativeIncrementAndGetCounterValue(z0Var2.f14750c));
        }
    }
}

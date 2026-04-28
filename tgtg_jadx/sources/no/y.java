package no;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f31308j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m0 f31309k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(m0 m0Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f31308j = i11;
        this.f31309k = m0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f31308j) {
            case 0:
                return new y(this.f31309k, cVar, 0);
            default:
                return new y(this.f31309k, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f31308j) {
        }
        return ((y) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f31308j;
        m0 m0Var = this.f31309k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                m0Var.i(new NullPointerException("OrderId is null"));
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                m0Var.i(new Exception("OrderId is null"));
                break;
        }
        return Unit.f26487a;
    }
}

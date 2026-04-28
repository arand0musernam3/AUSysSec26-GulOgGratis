package no;

import com.app.tgtg.model.remote.order.CancelOrderState;
import com.app.tgtg.model.remote.order.Order;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f31170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31171k;
    public final /* synthetic */ m0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Order f31172m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(m0 m0Var, Order order, x70.c cVar, int i11) {
        super(2, cVar);
        this.f31170j = i11;
        this.l = m0Var;
        this.f31172m = order;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f31170j) {
            case 0:
                return new a0(this.l, this.f31172m, cVar, 0);
            default:
                return new a0(this.l, this.f31172m, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f31170j) {
        }
        return ((a0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Object objR;
        int i11 = this.f31170j;
        Order order = this.f31172m;
        m0 m0Var = this.l;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f31171k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    m0Var.j(true);
                    et.z zVar = m0Var.f31267z;
                    String strM429getOrderIdreIZeYA = order.m429getOrderIdreIZeYA();
                    this.f31171k = 1;
                    obj = zVar.d(strM429getOrderIdreIZeYA, this);
                    if (obj == aVar) {
                    }
                } else if (i12 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                CancelOrderState cancelOrderState = (CancelOrderState) obj;
                if (cancelOrderState != null) {
                    m0Var.f(cancelOrderState, order);
                }
                m0Var.j(false);
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f31171k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    m0Var.j(true);
                    et.z zVar2 = m0Var.f31267z;
                    String strM429getOrderIdreIZeYA2 = order.m429getOrderIdreIZeYA();
                    this.f31171k = 1;
                    objR = zVar2.r(strM429getOrderIdreIZeYA2, this);
                    if (objR == aVar2) {
                    }
                } else if (i13 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                    objR = ((u70.q) obj).f40851a;
                }
                u70.o oVar = u70.q.f40850b;
                if (!(objR instanceof u70.p)) {
                    Order order2 = (Order) objR;
                    m0Var.k(order2);
                    m0Var.h(order2.getState());
                    m0Var.j(false);
                }
                Throwable thA = u70.q.a(objR);
                if (thA != null) {
                    m0Var.i(thA);
                    m0Var.j(false);
                }
                break;
        }
        return Unit.f26487a;
    }
}

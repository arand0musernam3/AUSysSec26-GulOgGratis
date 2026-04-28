package ho;

import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderState;
import com.braze.h2;
import et.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f22201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22202k;
    public final /* synthetic */ j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Order f22203m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, Order order, x70.c cVar, int i11) {
        super(2, cVar);
        this.f22201j = i11;
        this.l = jVar;
        this.f22203m = order;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f22201j) {
            case 0:
                return new h(this.l, this.f22203m, cVar, 0);
            default:
                return new h(this.l, this.f22203m, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f22201j) {
        }
        return ((h) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f22201j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f22202k;
                Order order = this.f22203m;
                j jVar = this.l;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ba0.g.M(obj);
                    } else if (i11 != 2) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    z zVar = jVar.f22208b;
                    this.f22202k = 1;
                    mv.d.g(zVar.f16465a, new Integer(order.getCalendarEventId()));
                    Object objV = zVar.v(order.m429getOrderIdreIZeYA(), 0, this);
                    if (objV != aVar) {
                        objV = Unit.f26487a;
                    }
                    if (objV == aVar) {
                    }
                }
                gt.j jVar2 = jVar.f22212f;
                String strM429getOrderIdreIZeYA = order.m429getOrderIdreIZeYA();
                OrderState orderState = OrderState.CANCELLED;
                this.f22202k = 2;
                if (jVar2.g(strM429getOrderIdreIZeYA, orderState, this) == aVar) {
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f22202k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    a2 a2Var = this.l.f22214h;
                    this.f22202k = 1;
                    a2Var.j(this.f22203m);
                    if (Unit.f26487a == aVar2) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}

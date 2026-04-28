package cj;

import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.order.response.PaymentProvider;
import com.app.tgtg.model.remote.order.response.ProviderType;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.payment.PaymentType;
import com.braze.h2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8283k;
    public final /* synthetic */ q l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PaymentMethods f8284m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i11, q qVar, PaymentMethods paymentMethods, x70.c cVar) {
        super(2, cVar);
        this.f8282j = i11;
        this.l = qVar;
        this.f8284m = paymentMethods;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8282j) {
            case 0:
                return new m(0, this.l, this.f8284m, cVar);
            default:
                return new m(1, this.l, this.f8284m, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8282j) {
        }
        return ((m) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f8282j;
        PaymentMethods paymentMethods = this.f8284m;
        q qVar = this.l;
        boolean z11 = true;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f8283k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    qVar.Q = true;
                    qVar.R = false;
                    a2 a2Var = qVar.f8352n;
                    this.f8283k = 1;
                    a2Var.getClass();
                    a2Var.k(null, paymentMethods);
                    if (Unit.f26487a == aVar) {
                    }
                } else if (i12 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                h8.e eVar = q.f8330j0;
                if (paymentMethods.getPaymentProvider() != PaymentProvider.VOUCHER) {
                    PaymentMethods paymentMethods2 = (PaymentMethods) qVar.f8353o.f45488a.getValue();
                    if ((paymentMethods2 != null ? paymentMethods2.getProviderType() : null) != ProviderType.ADYEN_SAVED_PAYMENT) {
                        z11 = false;
                    }
                }
                cv.i iVar = cv.i.ACTION_PAYMENT_METHOD_SELECTED_FROM_LIST;
                dv.a aVar2 = dv.a.PAYMENT_METHOD;
                PaymentType paymentType = paymentMethods.getPaymentType();
                Pair pair = new Pair(aVar2, new dv.c(paymentType != null ? paymentType.name() : null));
                dv.a aVar3 = dv.a.PAYMENT_PROVIDER;
                PaymentProvider paymentProvider = paymentMethods.getPaymentProvider();
                Pair pair2 = new Pair(aVar3, new dv.c(paymentProvider != null ? paymentProvider.name() : null));
                Pair pair3 = new Pair(dv.a.IS_SAVED_PAYMENT_METHOD, new dv.c(Boolean.valueOf(z11)));
                dv.a aVar4 = dv.a.ITEM_TYPE;
                BasicItem basicItemF = qVar.f();
                qVar.s(iVar, h0.g.E(pair, pair2, pair3, new Pair(aVar4, new dv.c(basicItemF != null ? basicItemF.getItemType().name() : null))));
                break;
            default:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f8283k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    a2 a2Var2 = qVar.f8352n;
                    this.f8283k = 1;
                    a2Var2.j(paymentMethods);
                    if (Unit.f26487a == aVar5) {
                    }
                } else if (i13 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
        }
        return Unit.f26487a;
    }
}

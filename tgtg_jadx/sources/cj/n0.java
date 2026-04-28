package cj;

import com.adyen.threeds2.ThreeDS2Service;
import com.app.tgtg.model.remote.order.AuthPayloadType;
import com.app.tgtg.model.remote.order.AuthorizationPayload;
import com.app.tgtg.model.remote.payment.AdyenCustomPayload;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.payment.PaymentType;
import com.app.tgtg.model.remote.payment.Price;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.x0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0 f8290j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f8291k;
    public final /* synthetic */ PaymentMethods l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f8292m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f8293n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Map f8294o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f8295p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Price f8296q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Map f8297r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f8298s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f8299t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(s0 s0Var, String str, PaymentMethods paymentMethods, String str2, boolean z11, Map map, String str3, Price price, Map map2, String str4, String str5, x70.c cVar) {
        super(2, cVar);
        this.f8290j = s0Var;
        this.f8291k = str;
        this.l = paymentMethods;
        this.f8292m = str2;
        this.f8293n = z11;
        this.f8294o = map;
        this.f8295p = str3;
        this.f8296q = price;
        this.f8297r = map2;
        this.f8298s = str4;
        this.f8299t = str5;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new n0(this.f8290j, this.f8291k, this.l, this.f8292m, this.f8293n, this.f8294o, this.f8295p, this.f8296q, this.f8297r, this.f8298s, this.f8299t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        s0 s0Var = this.f8290j;
        cv.b bVar = s0Var.f8388d;
        cv.i iVar = cv.i.DEBUG_ADYEN_BIOMETRICS_PAY;
        dv.a aVar2 = dv.a.TYPE;
        String str = this.f8291k;
        Pair pair = new Pair(aVar2, new dv.c(str));
        dv.a aVar3 = dv.a.ID;
        PaymentMethods paymentMethods = this.l;
        Map mapE = x0.e(pair, new Pair(aVar3, new dv.c(paymentMethods.getCardIdentifier())));
        dv.b bVar2 = new dv.b();
        bVar2.f15174a.putAll(mapE);
        bVar.c(iVar, bVar2);
        AuthPayloadType authPayloadType = AuthPayloadType.ADYEN_AUTH_PAYLOAD;
        PaymentType paymentType = paymentMethods.getPaymentType();
        paymentType.getClass();
        String strName = paymentType.name();
        String cardIdentifier = paymentMethods.getCardIdentifier();
        cardIdentifier.getClass();
        String sDKVersion = ThreeDS2Service.INSTANCE.getSDKVersion();
        sDKVersion.getClass();
        s0.o(s0Var, new AuthorizationPayload(this.f8292m, (String) null, false, strName, authPayloadType, new AdyenCustomPayload(str, cardIdentifier, sDKVersion).toJson(), (String) null, (String) null, (String) null, 454, (DefaultConstructorMarker) null), this.l, this.f8295p, this.f8296q, this.f8293n ? this.f8294o : null, this.f8297r, this.f8298s, this.f8299t);
        return Unit.f26487a;
    }
}

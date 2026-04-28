package cj;

import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.threeds2.ThreeDS2Service;
import com.app.tgtg.model.remote.DailyReminder;
import com.app.tgtg.model.remote.PushNotificationsSettings;
import com.app.tgtg.model.remote.order.AuthPayloadType;
import com.app.tgtg.model.remote.order.AuthorizationPayload;
import com.app.tgtg.model.remote.payment.AdyenCustomPayload;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.payment.PaymentType;
import com.app.tgtg.model.remote.payment.Price;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8303j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f8304k;
    public final /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f8305m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f8306n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f8307o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f8308p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f8309q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f8310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f8311s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(PushNotificationsSettings pushNotificationsSettings, hs.h hVar, boolean z11, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, b1 b1Var6, x70.c cVar) {
        super(2, cVar);
        this.l = pushNotificationsSettings;
        this.f8305m = hVar;
        this.f8304k = z11;
        this.f8306n = b1Var;
        this.f8307o = b1Var2;
        this.f8308p = b1Var3;
        this.f8309q = b1Var4;
        this.f8310r = b1Var5;
        this.f8311s = b1Var6;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8303j) {
            case 0:
                return new o0((PaymentMethods) this.l, this.f8304k, (Map) this.f8305m, (s0) this.f8307o, (String) this.f8308p, (Price) this.f8311s, (Map) this.f8306n, (String) this.f8309q, (String) this.f8310r, cVar);
            default:
                return new o0((PushNotificationsSettings) this.l, (hs.h) this.f8305m, this.f8304k, (b1) this.f8306n, (b1) this.f8307o, (b1) this.f8308p, (b1) this.f8309q, (b1) this.f8310r, (b1) this.f8311s, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8303j) {
        }
        return ((o0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f8303j;
        Object obj2 = this.f8311s;
        Object obj3 = this.f8310r;
        Object obj4 = this.f8309q;
        Object obj5 = this.f8308p;
        Object obj6 = this.f8307o;
        Object obj7 = this.f8306n;
        boolean z11 = this.f8304k;
        Object obj8 = this.f8305m;
        Object obj9 = this.l;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                AuthPayloadType authPayloadType = AuthPayloadType.ADYEN_AUTH_PAYLOAD;
                PaymentMethods paymentMethods = (PaymentMethods) obj9;
                PaymentType paymentType = paymentMethods.getPaymentType();
                paymentType.getClass();
                String strName = paymentType.name();
                String cardIdentifier = paymentMethods.getCardIdentifier();
                cardIdentifier.getClass();
                String sDKVersion = ThreeDS2Service.INSTANCE.getSDKVersion();
                sDKVersion.getClass();
                s0.o((s0) obj6, new AuthorizationPayload((String) null, (String) null, true, strName, authPayloadType, new AdyenCustomPayload(PaymentMethodTypes.BCMC, cardIdentifier, sDKVersion).toJson(), (String) null, (String) null, (String) null, 451, (DefaultConstructorMarker) null), (PaymentMethods) obj9, (String) obj5, (Price) obj2, z11 ? (Map) obj8 : null, (Map) obj7, (String) obj4, (String) obj3);
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                PushNotificationsSettings pushNotificationsSettings = (PushNotificationsSettings) obj9;
                if (pushNotificationsSettings != null) {
                    b1 b1Var = (b1) obj6;
                    b1 b1Var2 = (b1) obj5;
                    b1 b1Var3 = (b1) obj4;
                    b1 b1Var4 = (b1) obj3;
                    b1 b1Var5 = (b1) obj2;
                    ((b1) obj7).setValue(Boolean.valueOf(((hs.h) obj8).f22481j));
                    b1Var.setValue(Boolean.valueOf(z11 && pushNotificationsSettings.getCalendarAlerts()));
                    b1Var2.setValue(Boolean.valueOf(pushNotificationsSettings.getTransactional()));
                    b1Var3.setValue(Boolean.valueOf(pushNotificationsSettings.getAnnouncements()));
                    b1Var4.setValue(Boolean.valueOf(pushNotificationsSettings.getSupplyAlerts()));
                    b1Var5.setValue(pushNotificationsSettings.getDailyReminder());
                    sa0.a.f38953a.a("dailyReminderData: " + ((DailyReminder) b1Var5.getValue()), new Object[0]);
                }
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(PaymentMethods paymentMethods, boolean z11, Map map, s0 s0Var, String str, Price price, Map map2, String str2, String str3, x70.c cVar) {
        super(2, cVar);
        this.l = paymentMethods;
        this.f8304k = z11;
        this.f8305m = map;
        this.f8307o = s0Var;
        this.f8308p = str;
        this.f8311s = price;
        this.f8306n = map2;
        this.f8309q = str2;
        this.f8310r = str3;
    }
}

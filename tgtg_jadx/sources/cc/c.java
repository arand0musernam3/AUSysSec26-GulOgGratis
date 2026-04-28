package cc;

import a60.b0;
import a60.h0;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import app.cash.paykit.core.exceptions.CashAppPayApiNetworkException;
import app.cash.paykit.core.exceptions.CashAppPayIntegrationException;
import app.cash.paykit.core.models.analytics.EventStream2Event;
import app.cash.paykit.core.models.analytics.payloads.AnalyticsCustomerRequestPayload;
import app.cash.paykit.core.models.analytics.payloads.AnalyticsInitializationPayload;
import app.cash.paykit.core.models.response.AuthFlowTriggers;
import app.cash.paykit.core.models.response.CustomerResponseData;
import app.cash.paykit.core.utils.ThreadPurpose;
import com.adyen.checkout.cashapppay.internal.ui.DefaultCashAppPayDelegate;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import cz.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import yb.h;
import yb.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements yb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f7890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f7891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f7892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jb.b f7894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k8.d f7895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DefaultCashAppPayDelegate f7896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CustomerResponseData f7897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public yb.j f7898j;

    public c(String str, g gVar, j jVar, e eVar, boolean z11, jb.b bVar) {
        k8.d dVar = new k8.d(bVar);
        h hVar = h.f45819c;
        eVar.getClass();
        bVar.getClass();
        this.f7889a = str;
        this.f7890b = gVar;
        this.f7891c = jVar;
        this.f7892d = eVar;
        this.f7893e = z11;
        this.f7894f = bVar;
        this.f7895g = dVar;
        this.f7897i = null;
        this.f7898j = hVar;
        ArrayList arrayList = eVar.f7902b;
        if (arrayList.isEmpty()) {
            d dVar2 = new d(eVar, 1);
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                dVar2.run();
            } else {
                eVar.f7903c.post(dVar2);
            }
        }
        arrayList.add(new WeakReference(this));
        String strD = h0.a((b0) jVar.f13637g, Reflection.typeOf(AnalyticsInitializationPayload.class)).d(new AnalyticsInitializationPayload((String) jVar.f13631a, (String) jVar.f13633c, AnalyticsPlatformParams.channel, (String) jVar.f13632b, (String) jVar.f13634d));
        ((n20.f) jVar.f13638h).getClass();
        String strQ = n20.f.q();
        ((r40.d) jVar.f13639i).getClass();
        String strD2 = h0.a((b0) jVar.f13637g, Reflection.typeOf(EventStream2Event.class)).d(new EventStream2Event("paykitsdk-android", "mobile_cap_pk_initialization", strD, r40.d.l(), strQ));
        j jVar2 = (j) jVar.f13635e;
        synchronized (jVar2) {
            jVar2.m(strD2);
        }
    }

    public final void a(CustomerResponseData customerResponseData) {
        String str;
        g90.b bVar;
        customerResponseData.getClass();
        AuthFlowTriggers authFlowTriggers = customerResponseData.f4685b;
        DefaultCashAppPayDelegate defaultCashAppPayDelegate = this.f7896h;
        jb.b bVar2 = this.f7894f;
        if (defaultCashAppPayDelegate == null) {
            CashAppPayIntegrationException cashAppPayIntegrationException = new CashAppPayIntegrationException("Shouldn't call this function before registering for state updates via `registerForStateUpdates`.");
            bVar2.r("CashAppPay", "No listener registered for state updates.", cashAppPayIntegrationException);
            if (this.f7893e) {
                throw cashAppPayIntegrationException;
            }
        }
        String str2 = authFlowTriggers != null ? authFlowTriggers.f4672a : null;
        if (str2 == null || str2.length() == 0) {
            i4.a.f("customerData is missing redirect url");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        if (authFlowTriggers != null) {
            try {
                str = authFlowTriggers.f4672a;
            } catch (NullPointerException unused) {
                i4.a.f("Cannot parse redirect url");
                return;
            }
        } else {
            str = null;
        }
        intent.setData(Uri.parse(str));
        this.f7897i = customerResponseData;
        g90.b bVarB = g90.b.Companion.b();
        if (authFlowTriggers != null && (bVar = authFlowTriggers.f4675d) != null) {
            bVarB.getClass();
            if (bVarB.f20262a.compareTo(bVar.f20262a) > 0) {
                bVar2.s("CashAppPay", "Auth token expired when attempting to authenticate, refreshing before proceeding.");
                b();
                return;
            }
        }
        d(yb.f.f45815a);
        try {
            WeakReference weakReference = z20.b.f46935c;
            if (weakReference == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContextReference");
                weakReference = null;
            }
            Object obj = weakReference.get();
            obj.getClass();
            ((Context) obj).startActivity(intent);
        } catch (ActivityNotFoundException unused2) {
            d(new yb.g(new CashAppPayIntegrationException(e0.f.k("Unable to open mobileUrl: ", authFlowTriggers != null ? authFlowTriggers.f4672a : null))));
        }
    }

    public final void b() {
        ThreadPurpose threadPurpose = ThreadPurpose.REFRESH_AUTH_TOKEN;
        k8.d dVar = this.f7895g;
        dVar.v(threadPurpose);
        d(h.f45821e);
        jb.b bVar = this.f7894f;
        bVar.s("CashAppPay", "Will refresh customer request before proceeding with authorization.");
        zz.f.D(dVar.t(ThreadPurpose.DEFERRED_REFRESH, new a(this, 1)), "Error while attempting to run deferred authorization.", bVar, new defpackage.a(this, 9));
    }

    public final void c(long j9) {
        zz.f.D(this.f7895g.t(ThreadPurpose.REFRESH_AUTH_TOKEN, new nx.a(2, j9, this)), "Could not start refreshUnauthorizedThread.", this.f7894f, new b(this, j9));
    }

    public final void d(yb.j jVar) {
        AnalyticsCustomerRequestPayload analyticsCustomerRequestPayloadA;
        this.f7898j = jVar;
        Unit unit = null;
        if (jVar instanceof yb.e) {
            j jVar2 = this.f7891c;
            yb.e eVar = (yb.e) jVar;
            jVar2.getClass();
            String strD = h0.a((b0) jVar2.f13637g, Reflection.typeOf(AnalyticsCustomerRequestPayload.class)).d(AnalyticsCustomerRequestPayload.a(jVar2.d(eVar.f45814a), j.o(eVar), null, null, null, null, -33, 7));
            ((n20.f) jVar2.f13638h).getClass();
            String strQ = n20.f.q();
            ((r40.d) jVar2.f13639i).getClass();
            String strD2 = h0.a((b0) jVar2.f13637g, Reflection.typeOf(EventStream2Event.class)).d(new EventStream2Event("paykitsdk-android", "mobile_cap_pk_customer_request", strD, r40.d.l(), strQ));
            j jVar3 = (j) jVar2.f13635e;
            synchronized (jVar3) {
                jVar3.m(strD2);
            }
        } else if (jVar instanceof yb.g) {
            j jVar4 = this.f7891c;
            yb.g gVar = (yb.g) jVar;
            CustomerResponseData customerResponseData = this.f7897i;
            jVar4.getClass();
            AnalyticsCustomerRequestPayload analyticsCustomerRequestPayloadA2 = AnalyticsCustomerRequestPayload.a(jVar4.d(customerResponseData), j.o(gVar), null, null, null, null, -33, 7);
            Exception exc = gVar.f45816a;
            if (exc instanceof CashAppPayApiNetworkException) {
                CashAppPayApiNetworkException cashAppPayApiNetworkException = (CashAppPayApiNetworkException) exc;
                analyticsCustomerRequestPayloadA = AnalyticsCustomerRequestPayload.a(analyticsCustomerRequestPayloadA2, null, cashAppPayApiNetworkException.f4584a, cashAppPayApiNetworkException.f4585b, cashAppPayApiNetworkException.f4586c, cashAppPayApiNetworkException.f4587d, Integer.MAX_VALUE, 0);
            } else {
                Throwable cause = exc.getCause();
                analyticsCustomerRequestPayloadA = AnalyticsCustomerRequestPayload.a(analyticsCustomerRequestPayloadA2, null, null, cause != null ? cause.toString() : null, gVar.f45816a.getMessage(), null, -1, 4);
            }
            String strD3 = h0.a((b0) jVar4.f13637g, Reflection.typeOf(AnalyticsCustomerRequestPayload.class)).d(analyticsCustomerRequestPayloadA);
            ((n20.f) jVar4.f13638h).getClass();
            String strQ2 = n20.f.q();
            ((r40.d) jVar4.f13639i).getClass();
            String strD4 = h0.a((b0) jVar4.f13637g, Reflection.typeOf(EventStream2Event.class)).d(new EventStream2Event("paykitsdk-android", "mobile_cap_pk_customer_request", strD3, r40.d.l(), strQ2));
            j jVar5 = (j) jVar4.f13635e;
            synchronized (jVar5) {
                jVar5.m(strD4);
            }
        } else if (Intrinsics.areEqual(jVar, yb.f.f45815a) || Intrinsics.areEqual(jVar, h.f45821e) || Intrinsics.areEqual(jVar, h.f45818b) || Intrinsics.areEqual(jVar, h.f45819c) || Intrinsics.areEqual(jVar, h.f45820d) || (jVar instanceof i) || Intrinsics.areEqual(jVar, h.f45822f)) {
            this.f7891c.e(jVar, this.f7897i);
        } else if (!Intrinsics.areEqual(jVar, h.f45817a)) {
            Intrinsics.areEqual(jVar, h.f45823g);
        }
        DefaultCashAppPayDelegate defaultCashAppPayDelegate = this.f7896h;
        if (defaultCashAppPayDelegate != null) {
            defaultCashAppPayDelegate.cashAppPayStateDidChange(jVar);
            unit = Unit.f26487a;
        }
        if (unit == null) {
            this.f7894f.r("CashAppPay", "State changed to " + jVar.getClass().getSimpleName() + ", but no listeners were notified.Make sure that you've used `registerForStateUpdates` to receive PayKit state updates.", null);
        }
    }
}

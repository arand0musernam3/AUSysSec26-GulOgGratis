package cv;

import android.content.Context;
import android.os.Bundle;
import com.appsflyer.AppsFlyerLib;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.models.outgoing.BrazeProperties;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.m6;
import com.google.android.gms.internal.measurement.t6;
import com.google.firebase.analytics.FirebaseAnalytics;
import ft.s;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.o0;
import kotlin.collections.x0;
import mv.m0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ev.a f13428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ev.e f13429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ev.c f13430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ev.h f13431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f13432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ev.g f13433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13434g;

    /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.app.tgtg.model.remote.UserData r20, com.app.tgtg.model.remote.UserSettings r21) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cv.b.a(com.app.tgtg.model.remote.UserData, com.app.tgtg.model.remote.UserSettings):void");
    }

    public final void b(i iVar) {
        iVar.getClass();
        c(iVar, null);
    }

    public final void c(i iVar, dv.b bVar) {
        Object obj;
        Object obj2;
        iVar.getClass();
        LinkedHashMap linkedHashMapC = bVar != null ? bVar.c() : null;
        if (iVar.e()) {
            ev.e eVar = this.f13429b;
            Context context = eVar.f16488a;
            if (!eVar.f16489b) {
                sa0.a.f38953a.i("Not tracking to Braze", new Object[0]);
            } else if (linkedHashMapC != null) {
                try {
                    sa0.a.f38953a.f(iVar.f() + "  - " + linkedHashMapC, new Object[0]);
                    Braze.INSTANCE.getInstance(context).logCustomEvent(iVar.f(), new BrazeProperties(linkedHashMapC));
                } catch (Exception unused) {
                    sa0.a.f38953a.f(iVar.f(), new Object[0]);
                    Braze.INSTANCE.getInstance(context).logCustomEvent(iVar.f());
                }
            } else {
                sa0.a.f38953a.f(iVar.f(), new Object[0]);
                Braze.INSTANCE.getInstance(context).logCustomEvent(iVar.f());
            }
        }
        if (iVar.c()) {
            ev.a aVar = this.f13428a;
            aVar.getClass();
            if (aVar.f16481d) {
                try {
                    ye.b bVarB = aVar.b();
                    if (bVarB != null) {
                        ye.b.k(bVarB, iVar.f(), linkedHashMapC, 4);
                    }
                } catch (Throwable th2) {
                    aVar.f16481d = false;
                    aVar.f16482e = null;
                    aVar.f16483f = null;
                    sa0.a.f38953a.d(th2);
                }
                m0 m0Var = sa0.a.f38953a;
                String strF = iVar.f();
                if (linkedHashMapC == null) {
                    obj2 = o0.f26530a;
                    obj2.getClass();
                } else {
                    obj2 = linkedHashMapC;
                }
                m0Var.f(strF + " - " + obj2, new Object[0]);
            } else {
                sa0.a.f38953a.i(a0.p("Not tracking to Amplitude (", iVar.f(), ")"), new Object[0]);
            }
        }
        if (this.f13434g && iVar.d()) {
            ev.c cVar = this.f13430c;
            cVar.getClass();
            if (cVar.f16486b) {
                try {
                    m0 m0Var2 = sa0.a.f38953a;
                    String strF2 = iVar.f();
                    if (linkedHashMapC == null) {
                        obj = o0.f26530a;
                        obj.getClass();
                    } else {
                        obj = linkedHashMapC;
                    }
                    m0Var2.f(strF2 + " - " + obj, new Object[0]);
                    AppsFlyerLib.getInstance().logEvent(cVar.f16485a, iVar.f(), linkedHashMapC);
                } catch (Throwable th3) {
                    cVar.f16487c = false;
                    cVar.f16486b = false;
                    sa0.a.f38953a.d(th3);
                }
            } else {
                sa0.a.f38953a.i(a0.p("Not tracking to AppsFlyer (", iVar.f(), ")"), new Object[0]);
            }
        }
        if (this.f13434g && iVar.h()) {
            ev.h hVar = this.f13431d;
            hVar.getClass();
            if (hVar.f16496b) {
                try {
                    sa0.a.f38953a.f(iVar.f(), new Object[0]);
                    FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(hVar.f16495a);
                    String strF3 = iVar.f();
                    a7 a7Var = firebaseAnalytics.f12750a;
                    a7Var.getClass();
                    a7Var.a(new t6(a7Var, (String) null, strF3, (Bundle) null, false));
                } catch (Throwable th4) {
                    sa0.a.f38953a.i(e0.f.k("Exception Ignored: ", th4.getMessage()), new Object[0]);
                }
            }
        }
        if (this.f13434g && iVar.g()) {
            i iVar2 = i.APP_POTENTIALLY_GOOD_USER_SIGNED_UP;
            ev.g gVar = this.f13433f;
            if (iVar != iVar2) {
                gVar.b(iVar);
                return;
            }
            gVar.getClass();
            if (gVar.f16494d) {
                gVar.f16494d = false;
                gVar.b(iVar);
            }
        }
    }

    public final void d(i iVar, dv.a aVar, Object obj) {
        iVar.getClass();
        aVar.getClass();
        dv.b bVar = new dv.b();
        bVar.f15174a.put(aVar, new dv.c(obj));
        c(iVar, bVar);
    }

    public final void e(String str, String str2, Double d3, String str3, String str4) {
        BrazeProperties brazePropertiesAddProperty;
        ev.e eVar = this.f13429b;
        String str5 = str4 == null ? null : str4;
        eVar.getClass();
        if (!eVar.f16489b) {
            sa0.a.f38953a.i("Not tracking to Braze", new Object[0]);
            return;
        }
        m0 m0Var = sa0.a.f38953a;
        String str6 = str2 == null ? "" : str2;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d3 != null ? d3.doubleValue() : 0.0d));
        dv.a aVar = dv.a.STORE_NAME;
        String strC = aVar.c();
        StringBuilder sbT = e0.f.t("logPurchase - productId: ", str, ", currencyCode: ", str6, ", price: ");
        sbT.append(bigDecimal);
        sbT.append(", ");
        sbT.append(strC);
        sbT.append(": ");
        m0Var.f(e0.f.n(sbT, str3, ", itemId: ", str5), new Object[0]);
        Braze companion = Braze.INSTANCE.getInstance(eVar.f16488a);
        String str7 = str2 != null ? str2 : "";
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(d3 != null ? d3.doubleValue() : 0.0d));
        if (str3 != null) {
            brazePropertiesAddProperty = str5 != null ? new BrazeProperties().addProperty(aVar.c(), str3).addProperty(dv.a.ITEM_ID.c(), str5) : null;
        } else {
            brazePropertiesAddProperty = null;
        }
        companion.logPurchase(str, str7, bigDecimal2, brazePropertiesAddProperty);
    }

    public final void f(boolean z11) {
        ev.e eVar = this.f13429b;
        Context context = eVar.f16488a;
        if (!eVar.f16489b) {
            sa0.a.f38953a.i("Not tracking to Braze", new Object[0]);
            return;
        }
        try {
            if (z11) {
                BrazeUser currentUser = Braze.INSTANCE.getInstance(context).getCurrentUser();
                if (currentUser != null) {
                    currentUser.setEmailNotificationSubscriptionType(NotificationSubscriptionType.OPTED_IN);
                }
            } else {
                BrazeUser currentUser2 = Braze.INSTANCE.getInstance(context).getCurrentUser();
                if (currentUser2 != null) {
                    currentUser2.setEmailNotificationSubscriptionType(NotificationSubscriptionType.UNSUBSCRIBED);
                }
            }
            Braze.INSTANCE.getInstance(context).requestImmediateDataFlush();
        } catch (Throwable th2) {
            eVar.f16489b = false;
            sa0.a.f38953a.d(th2);
        }
    }

    public final void g() {
        ev.h hVar = this.f13431d;
        boolean z11 = this.f13434g;
        boolean zA = this.f13432e.a();
        this.f13434g = zA;
        if (z11 != zA) {
            this.f13429b.a(zA);
        }
        boolean z12 = this.f13434g;
        ev.c cVar = this.f13430c;
        if (z12) {
            cVar.a();
            hVar.a();
            return;
        }
        cVar.b();
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(hVar.f16495a);
        q30.b bVar = q30.b.AD_STORAGE;
        q30.a aVar = q30.a.DENIED;
        firebaseAnalytics.a(x0.e(new Pair(bVar, aVar), new Pair(q30.b.ANALYTICS_STORAGE, aVar), new Pair(q30.b.AD_USER_DATA, aVar), new Pair(q30.b.AD_PERSONALIZATION, aVar)));
        a7 a7Var = firebaseAnalytics.f12750a;
        Boolean bool = Boolean.FALSE;
        a7Var.getClass();
        a7Var.a(new m6(a7Var, bool));
        hVar.f16496b = false;
    }
}

package ev;

import android.content.Context;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerLib;
import ft.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16487c;

    public c(Context context, s sVar) {
        sVar.getClass();
        this.f16485a = context;
        try {
            AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
            appsFlyerLib.init("JHXXwLJmYErihkkjZKGGqQ", null, context);
            appsFlyerLib.waitForCustomerUserId(sVar.a());
            appsFlyerLib.setDebugLog(false);
            appsFlyerLib.setAppInviteOneLink("OGjG");
        } catch (Throwable th2) {
            this.f16487c = false;
            this.f16486b = false;
            sa0.a.f38953a.d(th2);
        }
    }

    public final void a() {
        if (this.f16487c) {
            return;
        }
        try {
            AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
            appsFlyerLib.setCurrencyCode("EUR");
            appsFlyerLib.setDebugLog(false);
            Boolean bool = Boolean.TRUE;
            appsFlyerLib.setConsentData(new AppsFlyerConsent(bool, bool, bool, null, 8, null));
            boolean zIsStopped = appsFlyerLib.isStopped();
            Context context = this.f16485a;
            if (zIsStopped) {
                appsFlyerLib.stop(false, context);
            }
            appsFlyerLib.start(context);
            sa0.a.f38953a.f("AppsFlyer successfully initialized", new Object[0]);
            this.f16486b = true;
            this.f16487c = true;
        } catch (Throwable th2) {
            this.f16487c = false;
            this.f16486b = false;
            sa0.a.f38953a.d(th2);
        }
    }

    public final void b() {
        if (this.f16487c) {
            try {
                AppsFlyerLib.getInstance().stop(true, this.f16485a);
                this.f16487c = false;
                this.f16486b = false;
                sa0.a.f38953a.f("AppsFlyer successfully stopped", new Object[0]);
            } catch (Throwable th2) {
                this.f16487c = false;
                this.f16486b = false;
                sa0.a.f38953a.d(th2);
            }
        }
    }
}

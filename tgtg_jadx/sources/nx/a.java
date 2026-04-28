package nx;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import app.cash.paykit.core.models.response.CustomerResponseData;
import app.cash.paykit.core.models.response.CustomerTopLevelResponse;
import ax.a0;
import ax.s0;
import java.util.concurrent.TimeUnit;
import ky.o;
import tx.c0;
import tx.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f31410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31411c;

    public /* synthetic */ a(int i11, long j9, Object obj) {
        this.f31409a = i11;
        this.f31410b = j9;
        this.f31411c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g90.b bVar;
        int i11 = this.f31409a;
        long j9 = this.f31410b;
        switch (i11) {
            case 0:
                String str = (String) this.f31411c;
                if (c.f31419g == null) {
                    c.f31419g = new androidx.recyclerview.widget.b(Long.valueOf(j9), null);
                }
                androidx.recyclerview.widget.b bVar2 = c.f31419g;
                if (bVar2 != null) {
                    bVar2.f3665c = Long.valueOf(j9);
                }
                int i12 = 1;
                if (c.f31418f.get() <= 0) {
                    a aVar = new a(i12, j9, str);
                    synchronized (c.f31417e) {
                        c.f31416d = c.f31414b.schedule(aVar, c0.b(a0.b()) == null ? 60 : r8.f40586d, TimeUnit.SECONDS);
                    }
                }
                long j11 = c.f31422j;
                long j12 = j11 > 0 ? (j9 - j11) / ((long) 1000) : 0L;
                se.d dVar = j.f31441a;
                Context contextA = a0.a();
                z zVarK = c0.k(a0.b(), false);
                if (zVarK != null && zVarK.f40588f && j12 > 0) {
                    bx.m mVar = new bx.m(contextA, (String) null);
                    Bundle bundle = new Bundle(1);
                    bundle.putCharSequence("fb_aa_time_spent_view_name", str);
                    double d3 = j12;
                    if (s0.c() && !yx.a.f46339a.contains(mVar)) {
                        try {
                            bx.m.f(mVar, "fb_aa_time_spent_on_view", Double.valueOf(d3), bundle, false, c.b());
                        } catch (Throwable th2) {
                            yx.a.a(mVar, th2);
                        }
                    }
                    break;
                }
                androidx.recyclerview.widget.b bVar3 = c.f31419g;
                if (bVar3 != null) {
                    bVar3.m();
                    return;
                }
                return;
            case 1:
                String str2 = (String) this.f31411c;
                if (c.f31419g == null) {
                    c.f31419g = new androidx.recyclerview.widget.b(Long.valueOf(j9), null);
                }
                if (c.f31418f.get() <= 0) {
                    m.d(str2, c.f31419g, c.f31421i);
                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(a0.a()).edit();
                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                    editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
                    editorEdit.apply();
                    SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(a0.a()).edit();
                    editorEdit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                    editorEdit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                    editorEdit2.apply();
                    c.f31419g = null;
                }
                synchronized (c.f31417e) {
                    c.f31416d = null;
                }
                return;
            default:
                cc.c cVar = (cc.c) this.f31411c;
                jb.b bVar4 = cVar.f7894f;
                try {
                    Thread.sleep(p80.d.f(j9));
                    g90.b bVarB = g90.b.Companion.b();
                    CustomerResponseData customerResponseData = cVar.f7897i;
                    if (customerResponseData != null && (bVar = customerResponseData.f4693j) != null) {
                        bVarB.getClass();
                        if (bVarB.f20262a.compareTo(bVar.f20262a) > 0) {
                            bVar4.r("CashAppPay", "Customer request has expired. Stopping refresh.", null);
                            return;
                        }
                    }
                    if (!(cVar.f7898j instanceof yb.i)) {
                        ((o) bVar4.f24851a).w(new lc.a("CashAppPay", 5, "Not refreshing unauthorized customer request because state is not ReadyToAuthorize", null));
                        Log.w("CashAppPay", "Not refreshing unauthorized customer request because state is not ReadyToAuthorize");
                        return;
                    }
                    cc.g gVar = cVar.f7890b;
                    String str3 = cVar.f7889a;
                    CustomerResponseData customerResponseData2 = cVar.f7897i;
                    customerResponseData2.getClass();
                    ec.c cVarA = gVar.a(str3, customerResponseData2.f4687d);
                    if (cVarA instanceof ec.a) {
                        bVar4.r("CashAppPay", "Failed to refresh expiring auth token customer request.", ((ec.a) cVarA).f15916a);
                        cVar.c(j9);
                        return;
                    } else {
                        bVar4.s("CashAppPay", "Refreshed customer request with SUCCESS");
                        cVar.f7897i = ((CustomerTopLevelResponse) ((ec.b) cVarA).f15917a).f4706a;
                        cVar.c(j9);
                        return;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
        }
    }
}

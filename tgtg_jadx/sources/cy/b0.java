package cy;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a0 f13473i = new a0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set f13474j = kotlin.collections.y.W(new String[]{"ads_management", "create_event", "rsvp_event"});

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile b0 f13475k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f13478c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13481f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13483h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f13476a = q.NATIVE_WITH_FALLBACK;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f13477b = e.FRIENDS;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13479d = "rerequest";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0 f13482g = f0.FACEBOOK;

    static {
        b0.class.toString().getClass();
    }

    public b0() {
        tx.j.n();
        SharedPreferences sharedPreferences = ax.a0.a().getSharedPreferences("com.facebook.loginManager", 0);
        sharedPreferences.getClass();
        this.f13478c = sharedPreferences;
        if (!ax.a0.f4861n || tx.j.b() == null) {
            return;
        }
        d dVar = new d();
        Context contextA = ax.a0.a();
        dVar.f40618a = contextA.getApplicationContext();
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty("com.android.chrome")) {
            intent.setPackage("com.android.chrome");
        }
        contextA.bindService(intent, dVar, 33);
        Context contextA2 = ax.a0.a();
        String packageName = ax.a0.a().getPackageName();
        if (packageName == null) {
            return;
        }
        Context applicationContext = contextA2.getApplicationContext();
        u.b bVar = new u.b(applicationContext);
        try {
            bVar.f40618a = applicationContext.getApplicationContext();
            Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(packageName)) {
                intent2.setPackage(packageName);
            }
            applicationContext.bindService(intent2, bVar, 33);
        } catch (SecurityException unused) {
        }
    }

    public static Intent b(r rVar) {
        Intent intent = new Intent();
        intent.setClass(ax.a0.a(), FacebookActivity.class);
        intent.setAction(rVar.f13553a.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", rVar);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    public static void c(Context context, s sVar, Map map, FacebookException facebookException, boolean z11, r rVar) {
        w wVarD = a0.f13470a.d(context);
        if (wVarD == null) {
            return;
        }
        if (rVar == null) {
            ScheduledExecutorService scheduledExecutorService = w.f13596d;
            if (yx.a.f46339a.contains(w.class)) {
                return;
            }
            try {
                wVarD.a("fb_mobile_login_complete", "");
                return;
            } catch (Throwable th2) {
                yx.a.a(w.class, th2);
                return;
            }
        }
        HashMap map2 = new HashMap();
        map2.put("try_login_activity", z11 ? "1" : "0");
        String str = rVar.f13559g;
        String str2 = rVar.f13566o ? "foa_mobile_login_complete" : "fb_mobile_login_complete";
        ScheduledExecutorService scheduledExecutorService2 = w.f13596d;
        if (yx.a.f46339a.contains(wVarD)) {
            return;
        }
        try {
            Bundle bundleB = a0.b(str);
            if (sVar != null) {
                bundleB.putString("2_result", sVar.a());
            }
            if ((facebookException != null ? facebookException.getMessage() : null) != null) {
                bundleB.putString("5_error_message", facebookException.getMessage());
            }
            JSONObject jSONObject = map2.isEmpty() ? null : new JSONObject(map2);
            if (map != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        String str3 = (String) entry.getKey();
                        String str4 = (String) entry.getValue();
                        if (str3 != null) {
                            jSONObject.put(str3, str4);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                bundleB.putString("6_extras", jSONObject.toString());
            }
            wVarD.f13598b.M(bundleB, str2);
            if (sVar != s.SUCCESS || yx.a.f46339a.contains(wVarD)) {
                return;
            }
            try {
                w.f13596d.schedule(new com.google.firebase.messaging.r(2, wVarD, a0.b(str)), 5L, TimeUnit.SECONDS);
            } catch (Throwable th3) {
                yx.a.a(wVarD, th3);
            }
        } catch (Throwable th4) {
            yx.a.a(wVarD, th4);
        }
    }

    public static void e(Context context, r rVar) {
        w wVarD = a0.f13470a.d(context);
        if (wVarD != null) {
            String str = rVar.f13566o ? "foa_mobile_login_start" : "fb_mobile_login_start";
            if (yx.a.f46339a.contains(wVarD)) {
                return;
            }
            try {
                ScheduledExecutorService scheduledExecutorService = w.f13596d;
                Bundle bundleB = a0.b(rVar.f13559g);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("login_behavior", rVar.f13553a.toString());
                    jSONObject.put("request_code", tx.h.Login.a());
                    jSONObject.put("permissions", TextUtils.join(MessageLogView.COMMA_SEPARATOR, rVar.f13554b));
                    jSONObject.put("default_audience", rVar.f13555c.toString());
                    jSONObject.put("isReauthorize", rVar.f13560h);
                    String str2 = wVarD.f13599c;
                    if (str2 != null) {
                        jSONObject.put("facebookVersion", str2);
                    }
                    f0 f0Var = rVar.f13565n;
                    if (f0Var != null) {
                        jSONObject.put("target_app", f0Var.toString());
                    }
                    bundleB.putString("6_extras", jSONObject.toString());
                } catch (JSONException unused) {
                }
                wVarD.f13598b.M(bundleB, str);
            } catch (Throwable th2) {
                yx.a.a(wVarD, th2);
            }
        }
    }

    public final r a(a8.h hVar) {
        String strO = (String) hVar.f975d;
        a aVar = a.S256;
        try {
            strO = ba0.g.o(strO, aVar);
        } catch (FacebookException unused) {
            aVar = a.PLAIN;
        }
        String str = strO;
        a aVar2 = aVar;
        q qVar = this.f13476a;
        Set setV0 = CollectionsKt.v0((Set) hVar.f973b);
        e eVar = this.f13477b;
        String str2 = this.f13479d;
        String strB = ax.a0.b();
        String strE = j4.s.e();
        f0 f0Var = this.f13482g;
        String str3 = (String) hVar.f974c;
        String str4 = (String) hVar.f975d;
        tx.j.n();
        String str5 = ax.a0.f4854f;
        String str6 = str5 == null ? "" : str5;
        tx.j.n();
        String str7 = ax.a0.f4855g;
        r rVar = new r(qVar, setV0, eVar, str2, strB, strE, f0Var, str3, str4, str, aVar2, str6, str7 == null ? "" : str7);
        Date date = ax.b.l;
        rVar.f13560h = pd.g.B();
        rVar.l = this.f13480e;
        rVar.f13564m = this.f13481f;
        rVar.f13566o = false;
        rVar.f13567p = this.f13483h;
        return rVar;
    }

    public final void d() {
        Date date = ax.b.l;
        ax.j.f4928f.s().c(null, true);
        u00.d.N(null);
        ax.o.f4975f.w().a(null, true);
        SharedPreferences.Editor editorEdit = this.f13478c.edit();
        editorEdit.putBoolean("express_login_allowed", false);
        editorEdit.apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r13, android.content.Intent r14, lz.i r15) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cy.b0.f(int, android.content.Intent, lz.i):void");
    }

    public final void g(i0 i0Var, r rVar) {
        e(i0Var.f(), rVar);
        ky.p pVar = tx.i.f40519b;
        tx.h hVar = tx.h.Login;
        int iA = hVar.a();
        tx.g gVar = new tx.g() { // from class: cy.x
            @Override // tx.g
            public final void a(int i11, Intent intent) {
                this.f13600a.f(i11, intent, null);
            }
        };
        synchronized (pVar) {
            HashMap map = tx.i.f40520c;
            if (!map.containsKey(Integer.valueOf(iA))) {
                map.put(Integer.valueOf(iA), gVar);
            }
        }
        Intent intentB = b(rVar);
        if (ax.a0.a().getPackageManager().resolveActivity(intentB, 0) != null) {
            try {
                i0Var.startActivityForResult(intentB, hVar.a());
                return;
            } catch (ActivityNotFoundException unused) {
            }
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        c(i0Var.f(), s.ERROR, null, facebookException, false, rVar);
        throw facebookException;
    }
}

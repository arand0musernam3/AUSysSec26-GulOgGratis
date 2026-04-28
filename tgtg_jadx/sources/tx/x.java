package tx;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.braze.h2;
import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40573a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f40575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f40576d;

    public /* synthetic */ x(Context context, String str, String str2) {
        this.f40574b = context;
        this.f40575c = str;
        this.f40576d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        final int i11 = 0;
        switch (this.f40573a) {
            case 0:
                String str = this.f40575c;
                Context context = this.f40574b;
                String str2 = this.f40576d;
                y yVar = y.f40577a;
                JSONObject jSONObjectA = y.a();
                if (jSONObjectA.length() != 0) {
                    y.e(str, jSONObjectA);
                    context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, jSONObjectA.toString()).apply();
                    y.f40581e = Long.valueOf(System.currentTimeMillis());
                }
                y.f();
                y.f40578b.set(false);
                return;
            default:
                Context context2 = this.f40574b;
                String str3 = this.f40575c;
                String str4 = this.f40576d;
                c0 c0Var = c0.f40497a;
                context2.getClass();
                SharedPreferences sharedPreferences = context2.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                z zVarE = null;
                String string = sharedPreferences.getString(str3, null);
                if (!n0.x(string)) {
                    if (string == null) {
                        h2.b("Required value was null.");
                        return;
                    }
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException unused) {
                        ax.a0 a0Var = ax.a0.f4849a;
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        zVarE = c0.e(str4, jSONObject);
                    }
                    break;
                }
                JSONObject jSONObjectA2 = c0.a();
                c0.e(str4, jSONObjectA2);
                sharedPreferences.edit().putString(str3, jSONObjectA2.toString()).apply();
                final int i12 = 1;
                if (zVarE != null) {
                    String str5 = zVarE.f40593k;
                    if (!c0.f40502f && str5 != null && str5.length() > 0) {
                        c0.f40502f = true;
                        Log.w("c0", str5);
                    }
                }
                y yVar2 = y.f40577a;
                JSONObject jSONObjectA3 = y.a();
                Context contextA = ax.a0.a();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                contextA.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str4}, 1)), jSONObjectA3.toString()).apply();
                y.e(str4, jSONObjectA3);
                se.d dVar = nx.j.f31441a;
                Context contextA2 = ax.a0.a();
                final String strB = ax.a0.b();
                if (ax.s0.c()) {
                    if (contextA2 instanceof Application) {
                        Application application = (Application) contextA2;
                        String str6 = bx.m.f6734c;
                        if (!ax.a0.f4864q.get()) {
                            throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
                        }
                        if (!bx.d.f6712c) {
                            if (bx.m.b() == null) {
                                r40.d.t();
                            }
                            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = bx.m.b();
                            if (scheduledThreadPoolExecutorB == null) {
                                h2.b("Required value was null.");
                                return;
                            }
                            scheduledThreadPoolExecutorB.execute(new bx.c(0));
                        }
                        bx.z zVar = bx.z.f6762a;
                        if (!yx.a.f46339a.contains(bx.z.class)) {
                            try {
                                if (!bx.z.f6764c.get()) {
                                    bx.z.f6762a.b();
                                    break;
                                }
                            } catch (Throwable th2) {
                                yx.a.a(bx.z.class, th2);
                            }
                        }
                        Set set = yx.a.f46339a;
                        if (!set.contains(ax.a0.class)) {
                            try {
                                final Context applicationContext = application.getApplicationContext();
                                if (applicationContext != null) {
                                    if (!y.b("app_events_killswitch", ax.a0.b(), false)) {
                                        ax.a0.c().execute(new Runnable() { // from class: ax.z
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i11) {
                                                    case 0:
                                                        Context context3 = applicationContext;
                                                        String str7 = strB;
                                                        a0 a0Var2 = a0.f4849a;
                                                        if (yx.a.f46339a.contains(a0Var2)) {
                                                            return;
                                                        }
                                                        try {
                                                            tx.c cVarA = tx.j.a(context3);
                                                            SharedPreferences sharedPreferences2 = context3.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                                                            String strConcat = str7.concat("ping");
                                                            long j9 = sharedPreferences2.getLong(strConcat, 0L);
                                                            try {
                                                                JSONObject jSONObjectA4 = nx.f.a(nx.e.MOBILE_INSTALL_EVENT, cVarA, o30.f0.z(context3), a0.f(context3), context3);
                                                                String str8 = bx.m.f6734c;
                                                                String strR = r40.d.r();
                                                                if (strR != null) {
                                                                    jSONObjectA4.put("install_referrer", strR);
                                                                }
                                                                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                                                String str9 = String.format("%s/activities", Arrays.copyOf(new Object[]{str7}, 1));
                                                                a0.f4867t.getClass();
                                                                String str10 = h0.f4915j;
                                                                h0 h0VarZ = qb.e.z(null, str9, jSONObjectA4, null);
                                                                if (j9 == 0 && h0VarZ.c().f4943c == null) {
                                                                    SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                                                                    editorEdit.putLong(strConcat, System.currentTimeMillis());
                                                                    editorEdit.apply();
                                                                    l50.a aVar = tx.f0.f40508d;
                                                                    l50.a.z(m0.APP_EVENTS, "ax.a0", "MOBILE_APP_INSTALL has been logged");
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (JSONException e5) {
                                                                throw new FacebookException("An error occurred while publishing install.", e5);
                                                            }
                                                        } catch (Exception unused2) {
                                                            return;
                                                        } catch (Throwable th3) {
                                                            yx.a.a(a0Var2, th3);
                                                            return;
                                                        }
                                                    default:
                                                        Context context4 = applicationContext;
                                                        String str11 = strB;
                                                        Set set2 = yx.a.f46339a;
                                                        if (set2.contains(px.a.class)) {
                                                            return;
                                                        }
                                                        try {
                                                            SharedPreferences sharedPreferences3 = context4.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                                                            String strConcat2 = str11.concat("pingForOnDevice");
                                                            if (sharedPreferences3.getLong(strConcat2, 0L) == 0) {
                                                                if (!set2.contains(px.f.class)) {
                                                                    try {
                                                                        px.f.f35636a.b(px.c.MOBILE_APP_INSTALL, str11, kotlin.collections.n0.f26529a);
                                                                    } catch (Throwable th4) {
                                                                        yx.a.a(px.f.class, th4);
                                                                    }
                                                                    break;
                                                                }
                                                                SharedPreferences.Editor editorEdit2 = sharedPreferences3.edit();
                                                                editorEdit2.putLong(strConcat2, System.currentTimeMillis());
                                                                editorEdit2.apply();
                                                                return;
                                                            }
                                                            return;
                                                        } catch (Throwable th5) {
                                                            yx.a.a(px.a.class, th5);
                                                            return;
                                                        }
                                                }
                                            }
                                        });
                                    }
                                    if (w.b(t.OnDeviceEventProcessing) && px.a.a() && !set.contains(px.a.class)) {
                                        try {
                                            final Context contextA3 = ax.a0.a();
                                            if (contextA3 != null) {
                                                ax.a0.c().execute(new Runnable() { // from class: ax.z
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i12) {
                                                            case 0:
                                                                Context context3 = contextA3;
                                                                String str7 = strB;
                                                                a0 a0Var2 = a0.f4849a;
                                                                if (yx.a.f46339a.contains(a0Var2)) {
                                                                    return;
                                                                }
                                                                try {
                                                                    tx.c cVarA = tx.j.a(context3);
                                                                    SharedPreferences sharedPreferences2 = context3.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                                                                    String strConcat = str7.concat("ping");
                                                                    long j9 = sharedPreferences2.getLong(strConcat, 0L);
                                                                    try {
                                                                        JSONObject jSONObjectA4 = nx.f.a(nx.e.MOBILE_INSTALL_EVENT, cVarA, o30.f0.z(context3), a0.f(context3), context3);
                                                                        String str8 = bx.m.f6734c;
                                                                        String strR = r40.d.r();
                                                                        if (strR != null) {
                                                                            jSONObjectA4.put("install_referrer", strR);
                                                                        }
                                                                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                                                        String str9 = String.format("%s/activities", Arrays.copyOf(new Object[]{str7}, 1));
                                                                        a0.f4867t.getClass();
                                                                        String str10 = h0.f4915j;
                                                                        h0 h0VarZ = qb.e.z(null, str9, jSONObjectA4, null);
                                                                        if (j9 == 0 && h0VarZ.c().f4943c == null) {
                                                                            SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                                                                            editorEdit.putLong(strConcat, System.currentTimeMillis());
                                                                            editorEdit.apply();
                                                                            l50.a aVar = tx.f0.f40508d;
                                                                            l50.a.z(m0.APP_EVENTS, "ax.a0", "MOBILE_APP_INSTALL has been logged");
                                                                            return;
                                                                        }
                                                                        return;
                                                                    } catch (JSONException e5) {
                                                                        throw new FacebookException("An error occurred while publishing install.", e5);
                                                                    }
                                                                } catch (Exception unused2) {
                                                                    return;
                                                                } catch (Throwable th3) {
                                                                    yx.a.a(a0Var2, th3);
                                                                    return;
                                                                }
                                                            default:
                                                                Context context4 = contextA3;
                                                                String str11 = strB;
                                                                Set set2 = yx.a.f46339a;
                                                                if (set2.contains(px.a.class)) {
                                                                    return;
                                                                }
                                                                try {
                                                                    SharedPreferences sharedPreferences3 = context4.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                                                                    String strConcat2 = str11.concat("pingForOnDevice");
                                                                    if (sharedPreferences3.getLong(strConcat2, 0L) == 0) {
                                                                        if (!set2.contains(px.f.class)) {
                                                                            try {
                                                                                px.f.f35636a.b(px.c.MOBILE_APP_INSTALL, str11, kotlin.collections.n0.f26529a);
                                                                            } catch (Throwable th4) {
                                                                                yx.a.a(px.f.class, th4);
                                                                            }
                                                                            break;
                                                                        }
                                                                        SharedPreferences.Editor editorEdit2 = sharedPreferences3.edit();
                                                                        editorEdit2.putLong(strConcat2, System.currentTimeMillis());
                                                                        editorEdit2.apply();
                                                                        return;
                                                                    }
                                                                    return;
                                                                } catch (Throwable th5) {
                                                                    yx.a.a(px.a.class, th5);
                                                                    return;
                                                                }
                                                        }
                                                    }
                                                });
                                            }
                                        } catch (Throwable th3) {
                                            yx.a.a(px.a.class, th3);
                                        }
                                    }
                                    break;
                                }
                            } catch (Throwable th4) {
                                yx.a.a(ax.a0.class, th4);
                            }
                        }
                        nx.c.c(application, strB);
                        if (w.b(t.GPSPACAProcessing)) {
                            jx.a aVar = jx.a.f25431a;
                            if (!yx.a.f46339a.contains(aVar)) {
                                try {
                                    if (!jx.a.f25434d) {
                                        jx.a.a();
                                    }
                                    if (jx.a.f25433c) {
                                        aVar.b(strB, "fb_mobile_app_install");
                                        break;
                                    }
                                } catch (Throwable th5) {
                                    yx.a.a(aVar, th5);
                                }
                            }
                        }
                        if (w.b(t.GPSARATriggers)) {
                            ix.c.f24233a.d(strB, new bx.g(PaymentMethodTypes.UNKNOWN, "MOBILE_INSTALL_EVENT", null, null, false, nx.c.f31423k == 0, nx.c.b(), null));
                        }
                    } else {
                        Log.w("nx.j", "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
                    }
                }
                c0.f40500d.set(c0.f40499c.containsKey(str4) ? b0.SUCCESS : b0.ERROR);
                c0Var.j();
                return;
        }
    }

    public /* synthetic */ x(String str, Context context, String str2) {
        this.f40575c = str;
        this.f40574b = context;
        this.f40576d = str2;
    }
}

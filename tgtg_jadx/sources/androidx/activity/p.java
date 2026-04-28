package androidx.activity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.o0;
import co.datadome.sdk.ChallengeActivity;
import co.datadome.sdk.DataDomeSDK;
import co.datadome.sdk.DataDomeSDKManualIntegrationListener;
import co.datadome.sdk.DataDomeUtils;
import co.datadome.sdk.internal.SDKTestingMode;
import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageFullViewFactory;
import com.braze.ui.inappmessage.views.InAppMessageFullView;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import m5.k0;
import m5.u0;
import o00.x0;
import o30.b1;
import o30.d1;
import o30.h0;
import o30.i0;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1749f;

    public /* synthetic */ p(View view, InAppMessageFullView inAppMessageFullView, InAppMessageFull inAppMessageFull, Context context, View view2) {
        this.f1744a = 7;
        this.f1749f = view;
        this.f1745b = inAppMessageFullView;
        this.f1746c = inAppMessageFull;
        this.f1747d = context;
        this.f1748e = view2;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.String] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        z3.c cVarC;
        int i11 = this.f1744a;
        Object obj = this.f1748e;
        Object obj2 = this.f1747d;
        Object obj3 = this.f1746c;
        Object obj4 = this.f1745b;
        Object obj5 = this.f1749f;
        switch (i11) {
            case 0:
                g0 g0Var = (g0) obj3;
                g0 g0Var2 = (g0) obj2;
                View view = (View) obj5;
                Window window = ((ComponentActivity) obj).getWindow();
                window.getClass();
                Function1 function1 = g0Var.f1729c;
                Resources resources = view.getResources();
                resources.getClass();
                boolean zBooleanValue = ((Boolean) function1.invoke(resources)).booleanValue();
                Function1 function12 = g0Var2.f1729c;
                Resources resources2 = view.getResources();
                resources2.getClass();
                ((s) obj4).b(g0Var, g0Var2, window, view, zBooleanValue, ((Boolean) function12.invoke(resources2)).booleanValue());
                return;
            case 1:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) obj3;
                String str = (String) obj2;
                ReentrantLock reentrantLock = (ReentrantLock) obj;
                Condition condition = (Condition) obj5;
                str.getClass();
                URLConnection uRLConnectionOpenConnection = ((URL) obj4).openConnection();
                uRLConnectionOpenConnection.getClass();
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                try {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        inputStream.getClass();
                        String strD = v0.n.D(new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192));
                        httpURLConnection.getInputStream().close();
                        objectRef.element = new JSONObject(strD).optString(str);
                        httpURLConnection.disconnect();
                        reentrantLock.lock();
                    } catch (Exception e5) {
                        String name = ay.a.class.getName();
                        String message = e5.getMessage();
                        if (message == null) {
                            message = "Error getting public key";
                        }
                        Log.d(name, message);
                        httpURLConnection.disconnect();
                        reentrantLock.lock();
                        try {
                            condition.signal();
                        } finally {
                        }
                    }
                    try {
                        condition.signal();
                        return;
                    } finally {
                    }
                } catch (Throwable th2) {
                    httpURLConnection.disconnect();
                    reentrantLock.lock();
                    try {
                        condition.signal();
                        throw th2;
                    } finally {
                    }
                }
            case 2:
                DataDomeSDK.Builder builder = (DataDomeSDK.Builder) obj4;
                Integer num = (Integer) obj3;
                Map map = (Map) obj2;
                String string = (String) obj;
                int i12 = DataDomeSDK.Builder.C;
                String string2 = ((URL) obj5).toString();
                if (DataDomeUtils.isNullOrEmpty(string2).booleanValue() || !(string2.startsWith("https://") || string2.startsWith("http://"))) {
                    i4.a.f("Domain must not be empty in handleResponse method, and must start with Http protocol");
                    return;
                }
                co.datadome.sdk.q.h(map);
                if (!builder.i(map).booleanValue()) {
                    DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener = builder.f8693m;
                    if (dataDomeSDKManualIntegrationListener != null) {
                        dataDomeSDKManualIntegrationListener.onDismiss();
                    }
                    builder.k();
                    return;
                }
                Log.i("DataDome", "Blocked request by DataDome");
                try {
                    DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener2 = builder.f8693m;
                    if (dataDomeSDKManualIntegrationListener2 != null) {
                        dataDomeSDKManualIntegrationListener2.onRequestInProgress(num);
                    }
                    AtomicBoolean atomicBoolean = co.datadome.sdk.q.f8680y;
                    if (atomicBoolean.get()) {
                        return;
                    }
                    atomicBoolean.set(true);
                    try {
                        String strB = DataDomeUtils.b(map);
                        if (strB == null || !strB.contains(ArticleContentView.TYPE_TEXT_HTML)) {
                            builder.f8684c = Boolean.FALSE;
                            string = new JSONObject(string).getString(Constants.BRAZE_WEBVIEW_URL_EXTRA);
                        } else {
                            builder.f8684c = Boolean.TRUE;
                            String strJ = builder.j();
                            if (!strJ.isEmpty()) {
                                builder.f8699s.add(strJ);
                            }
                        }
                        if (DataDomeUtils.isNullOrEmpty(string).booleanValue()) {
                            DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener3 = builder.f8693m;
                            if (dataDomeSDKManualIntegrationListener3 != null) {
                                dataDomeSDKManualIntegrationListener3.onError(num, "Not captcha's url found");
                                atomicBoolean.set(false);
                                return;
                            }
                            return;
                        }
                        DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener4 = builder.f8693m;
                        if (dataDomeSDKManualIntegrationListener4 != null) {
                            dataDomeSDKManualIntegrationListener4.willDisplayCaptcha();
                        }
                        Log.i("DataDome", "Showing captcha");
                        builder.d(string, string2, builder.f8686e, num);
                        ConditionVariable conditionVariable = co.datadome.sdk.q.f8679x;
                        conditionVariable.close();
                        conditionVariable.block();
                        atomicBoolean.set(false);
                        DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener5 = builder.f8693m;
                        if (dataDomeSDKManualIntegrationListener5 != null) {
                            dataDomeSDKManualIntegrationListener5.onDismiss();
                            return;
                        }
                        return;
                    } catch (JSONException e11) {
                        DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener6 = builder.f8693m;
                        if (dataDomeSDKManualIntegrationListener6 != null) {
                            dataDomeSDKManualIntegrationListener6.onError(num, "Not captcha's url found");
                            co.datadome.sdk.q.f8680y.set(false);
                        }
                        new Handler().postDelayed(new bx.c(6), 500L);
                        Log.e("DataDome", "Manual Response Handling", e11);
                        return;
                    }
                } catch (Exception e12) {
                    e12.getLocalizedMessage();
                    DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener7 = builder.f8693m;
                    if (dataDomeSDKManualIntegrationListener7 != null) {
                        dataDomeSDKManualIntegrationListener7.onError(num, "Not captcha's url found");
                        co.datadome.sdk.q.f8680y.set(false);
                    }
                    Log.e("DataDome", "Manual Response Handling", e12);
                    return;
                }
            case 3:
                co.datadome.sdk.q qVar = (co.datadome.sdk.q) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                Integer num2 = (Integer) obj;
                String str4 = (String) obj5;
                ArrayList<String> arrayList = qVar.f8699s;
                Application application = (Application) qVar.f8689h.get();
                if (application == null || application.getBaseContext() == null) {
                    Log.e("DataDome", "Failed to display a DataDome challenge page due to an unexpected null application context. A non-null application instance must be provided when the SDK is initialized.");
                    if (qVar.l != null) {
                        qVar.logEvent(DataDomeSDK.Events.NULL_CONTEXT.getEvent("sdk"));
                        qVar.l.onError(504, "Empty application context.");
                        return;
                    }
                    return;
                }
                Context applicationContext = application.getApplicationContext();
                String strE = DataDomeUtils.e(qVar.j());
                Intent intent = new Intent();
                intent.setClass(applicationContext, ChallengeActivity.class);
                intent.addFlags(276824064);
                intent.putExtra("cookie", strE);
                intent.putExtra("captcha_url", str2);
                intent.putExtra("backBehaviour", qVar.f8688g);
                intent.putExtra("is_response_type_hard_block", qVar.f8683b);
                intent.putExtra("is_response_type_HTML", qVar.f8684c);
                intent.putExtra("request_url", str3);
                if (num2 != null) {
                    intent.putExtra("request_id", num2);
                }
                if (qVar.f8684c.booleanValue() && !arrayList.isEmpty()) {
                    intent.putStringArrayListExtra("blockedResponseCookie", arrayList);
                }
                if (qVar.f8682a.booleanValue()) {
                    intent.putExtra("responsePageVisibility", false);
                }
                if (SDKTestingMode.INSTANCE.isEnabled() && !TextUtils.isEmpty(str4)) {
                    intent.putExtra("user_agent", str4);
                }
                if (qVar.f8696p && arrayList != null && arrayList.size() > 0) {
                    intent.putStringArrayListExtra("blockedResponseCookie", arrayList);
                    intent.putExtra("isSfcc", qVar.f8696p);
                }
                intent.putExtra("responsePageLanguage", qVar.f8697q);
                IntentFilter intentFilter = new IntentFilter("co.datadome.sdk.CAPTCHA_RESULT");
                if (qVar.f8702v != null) {
                    d9.c.a(applicationContext).d(qVar.f8702v);
                }
                qVar.f8702v = new co.datadome.sdk.o(qVar, qVar.l);
                d9.c.a(applicationContext).b(qVar.f8702v, intentFilter);
                applicationContext.startActivity(intent);
                return;
            case 4:
                String str5 = (String) obj3;
                Function0 function0 = (Function0) obj2;
                o0 o0Var = (o0) obj;
                e6.i iVar = (e6.i) obj5;
                ((ib.y) obj4).getClass();
                boolean zY = x0.y();
                if (zY) {
                    try {
                        Trace.beginSection(x0.G(str5));
                    } finally {
                        if (zY) {
                        }
                    }
                }
                try {
                    function0.invoke();
                    ib.c0 c0Var = ib.y.f23768b;
                    o0Var.i(c0Var);
                    iVar.b(c0Var);
                } catch (Throwable th3) {
                    o0Var.i(new ib.b0(th3));
                    iVar.d(th3);
                }
                if (zY) {
                    return;
                } else {
                    return;
                }
            case 5:
                u0 u0Var = (u0) obj4;
                z5.m mVar = (z5.m) obj3;
                String str6 = (String) obj2;
                z5.c cVar = (z5.c) obj;
                q5.h hVar = (q5.h) obj5;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    z3.g gVarJ = z3.l.j();
                    z3.c cVar2 = gVarJ instanceof z3.c ? (z3.c) gVarJ : null;
                    if (cVar2 == null || (cVarC = cVar2.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        z3.g gVarJ2 = cVarC.j();
                        try {
                            u0 u0VarK = k0.k(u0Var, mVar);
                            n0 n0Var = n0.f26529a;
                            new u5.d(str6, u0VarK, n0Var, n0Var, hVar, cVar).c();
                            cVarC.w().b();
                            return;
                        } finally {
                            z3.g.q(gVarJ2);
                        }
                    } finally {
                    }
                } finally {
                    Trace.endSection();
                }
            case 6:
                d1 d1Var = (d1) obj4;
                b1 b1Var = (b1) obj3;
                ListenableFuture listenableFuture = (ListenableFuture) obj2;
                ListenableFuture listenableFuture2 = (ListenableFuture) obj;
                i0 i0Var = (i0) obj5;
                if (d1Var.isDone()) {
                    b1Var.o(listenableFuture);
                    return;
                } else {
                    if (listenableFuture2.isCancelled()) {
                        int i13 = i0.f31887e;
                        if (i0Var.compareAndSet(h0.NOT_RUN, h0.CANCELLED)) {
                            d1Var.cancel(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            default:
                DefaultInAppMessageFullViewFactory.createInAppMessageView$lambda$4((View) obj5, (InAppMessageFullView) obj4, (InAppMessageFull) obj3, (Context) obj2, (View) obj);
                return;
        }
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f1744a = i11;
        this.f1745b = obj;
        this.f1746c = obj2;
        this.f1747d = obj3;
        this.f1748e = obj4;
        this.f1749f = obj5;
    }
}

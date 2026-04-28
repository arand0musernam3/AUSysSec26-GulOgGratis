package co.datadome.sdk;

import android.app.Application;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import ax.p0;
import co.datadome.sdk.DataDomeSDK;
import com.braze.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import o30.m0;
import org.json.JSONException;
import org.json.JSONObject;
import q90.g0;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;
import zw.q2;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static String f8678w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ConditionVariable f8679x = new ConditionVariable();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AtomicBoolean f8680y = new AtomicBoolean(false);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final List f8681z = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f8682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f8683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f8684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f8685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f8686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f8687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DataDomeSDK.BackBehaviour f8688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WeakReference f8689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f8690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f8691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f8692k;
    public DataDomeSDKListener l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public DataDomeSDKManualIntegrationListener f8693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8694n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8695o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8696p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f8697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z f8698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f8699s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ExecutorService f8700t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p0 f8701u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o f8702v;

    public q() {
        Boolean bool = Boolean.FALSE;
        this.f8682a = bool;
        this.f8683b = bool;
        this.f8684c = bool;
        this.f8685d = bool;
        this.f8687f = bool;
        this.f8688g = DataDomeSDK.BackBehaviour.GO_BACKGROUND;
        this.f8689h = new WeakReference(null);
        this.f8690i = new WeakReference(this);
        this.f8692k = "";
        new ArrayList();
        this.f8694n = false;
        this.f8695o = false;
        this.f8696p = false;
        this.f8697q = null;
        this.f8698r = z.f8726a;
        this.f8699s = new ArrayList();
        this.f8700t = Executors.newSingleThreadExecutor();
    }

    public static DataDomeSDK.ResponseType a(int i11) {
        int i12 = i11 & 255;
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? DataDomeSDK.ResponseType.TRAP : DataDomeSDK.ResponseType.REDIRECT : DataDomeSDK.ResponseType.DEVICE_CHECK : DataDomeSDK.ResponseType.HARD_BLOCK : DataDomeSDK.ResponseType.BLOCK;
    }

    public static Boolean b(q90.p0 p0Var) {
        if (p0Var.f36585d != 302) {
            return Boolean.FALSE;
        }
        String strE = q90.p0.e("location", p0Var);
        return (strE == null || strE.isEmpty()) ? Boolean.FALSE : Boolean.valueOf(strE.toLowerCase(Locale.ROOT).contains("dduser-challenge"));
    }

    public static Boolean g(int i11) {
        DataDomeSDK.ResponseType responseTypeA = a(i11);
        DataDomeSDK.ResponseType responseType = DataDomeSDK.ResponseType.DEVICE_CHECK;
        if (!responseTypeA.equals(responseType)) {
            return Boolean.FALSE;
        }
        v.a("Response type " + responseType);
        return Boolean.valueOf(((i11 >> 8) & 1) == 1);
    }

    public static String h(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (((String) entry.getKey()).equalsIgnoreCase("X-DD-B") || ((String) entry.getKey()).equalsIgnoreCase("X-SF-CC-X-dd-b")) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    public static Boolean isHandlingResponseInProgress() {
        return Boolean.valueOf(f8680y.get());
    }

    public static void resetHandlingResponseInProgress() {
        f8680y.set(false);
    }

    public final void c(String str) {
        Application application = (Application) this.f8689h.get();
        if (application == null || application.getBaseContext() == null) {
            Log.e("DataDome", "Failed to set a cookie value for DataDome due to an unexpected null application context. A non-null application instance must be provided when the SDK is initialized.");
            return;
        }
        w wVarA = w.a(application, f8678w);
        if (!str.startsWith("datadome=")) {
            str = "datadome=".concat(str);
        }
        wVarA.c(str);
    }

    public final void d(String str, String str2, String str3, Integer num) {
        q qVar;
        Exception exc;
        try {
            if (this.f8694n) {
                try {
                    Log.i("DataDome", "Challenge already displayed");
                    return;
                } catch (Exception e5) {
                    exc = e5;
                    qVar = this;
                }
            } else {
                this.f8694n = true;
                qVar = this;
                try {
                    new Handler(Looper.getMainLooper()).post(new androidx.activity.p(qVar, str, str2, num, str3, 3));
                    return;
                } catch (Exception e11) {
                    e = e11;
                }
            }
        } catch (Exception e12) {
            e = e12;
            qVar = this;
        }
        exc = e;
        Log.e("DataDome", "Load challenge View", exc);
        DataDomeSDKListener dataDomeSDKListener = qVar.l;
        if (dataDomeSDKListener != null) {
            dataDomeSDKListener.onError(505, "Can't start challenge web view");
        }
    }

    public final void e(q90.p0 p0Var, u uVar) {
        g0 g0Var = p0Var.f36582a;
        Log.i("DataDome", "Handling the blocked response");
        DataDomeSDKListener dataDomeSDKListener = this.l;
        if (dataDomeSDKListener != null) {
            dataDomeSDKListener.onHangOnRequest(p0Var.f36585d);
        }
        try {
            StringBuilder sb2 = new StringBuilder("Blocked response: ");
            String string = uVar.f8711c;
            sb2.append(string);
            sb2.append("\nFor request ");
            sb2.append(g0Var.f36505a);
            v.a(sb2.toString());
            if (q90.p0.e("Content-type", p0Var) == null || !q90.p0.e("Content-type", p0Var).contains(ArticleContentView.TYPE_TEXT_HTML)) {
                this.f8684c = Boolean.FALSE;
                string = new JSONObject(string).getString(Constants.BRAZE_WEBVIEW_URL_EXTRA);
            } else {
                this.f8684c = Boolean.TRUE;
                String strJ = j();
                if (!strJ.isEmpty()) {
                    this.f8699s.add(strJ);
                }
            }
            if (DataDomeUtils.isNullOrEmpty(string).booleanValue()) {
                DataDomeSDKListener dataDomeSDKListener2 = this.l;
                if (dataDomeSDKListener2 != null) {
                    dataDomeSDKListener2.onError(504, "Challenge URL not found");
                    return;
                }
                return;
            }
            v.a("Challenge content: " + string);
            DataDomeSDKListener dataDomeSDKListener3 = this.l;
            if (dataDomeSDKListener3 != null) {
                dataDomeSDKListener3.willDisplayCaptcha();
            }
            d(string, g0Var.f36505a.f36631i, g0Var.f36507c.b("User-Agent"), null);
            ConditionVariable conditionVariable = f8679x;
            conditionVariable.close();
            conditionVariable.block();
        } catch (JSONException e5) {
            Log.e("DataDome", "Blocked Response Handling", e5);
            DataDomeSDKListener dataDomeSDKListener4 = this.l;
            if (dataDomeSDKListener4 != null) {
                dataDomeSDKListener4.onError(503, "Problem parsing json");
            }
        }
    }

    public final void f(q90.p0 p0Var, Map map) {
        ArrayList arrayList;
        Log.i("DataDome", "Handling Salesforce blocked response");
        DataDomeSDKListener dataDomeSDKListener = this.l;
        if (dataDomeSDKListener != null) {
            dataDomeSDKListener.onHangOnRequest(p0Var.f36585d);
        }
        g0 g0Var = p0Var.f36582a;
        String strE = q90.p0.e("location", p0Var);
        DataDomeSDKListener dataDomeSDKListener2 = this.l;
        if (strE == null) {
            if (dataDomeSDKListener2 != null) {
                dataDomeSDKListener2.onError(504, "Challenge URL not found");
                return;
            }
            return;
        }
        if (dataDomeSDKListener2 != null) {
            dataDomeSDKListener2.willDisplayCaptcha();
        }
        StringBuilder sbS = e0.f.s("Retrieved challenge URL: ", strE, "\nFor request ");
        sbS.append(g0Var.f36505a);
        v.a(sbS.toString());
        Iterator it = p0Var.f36587f.h("set-cookie").iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f8699s;
            if (!zHasNext) {
                break;
            } else {
                arrayList.add(((String) it.next()).split(";")[0]);
            }
        }
        String str = (String) map.get("dwsid");
        if (!TextUtils.isEmpty(str)) {
            arrayList.add("dwsid=" + str);
        }
        d(strE, g0Var.f36505a.f36631i, g0Var.f36507c.b("User-Agent"), null);
        ConditionVariable conditionVariable = f8679x;
        conditionVariable.close();
        conditionVariable.block();
    }

    public List<DataDomeEvent> getCurrentEvents() {
        return f8681z;
    }

    public final Boolean i(Map map) {
        String strH = h(map);
        v.a("X-DD-B header: " + strH);
        if (strH != null) {
            try {
                int i11 = Integer.parseInt(strH);
                DataDomeSDK.ResponseType responseTypeA = a(i11);
                this.f8683b = Boolean.valueOf(responseTypeA == DataDomeSDK.ResponseType.HARD_BLOCK);
                if (responseTypeA == DataDomeSDK.ResponseType.DEVICE_CHECK && g(i11).booleanValue()) {
                    this.f8682a = Boolean.TRUE;
                    v.a("Receiving a fast mode device check response");
                }
            } catch (Exception e5) {
                Log.e("DataDome", "Failed to convert x-dd-b header to integer " + e5.getLocalizedMessage());
            }
        }
        return Boolean.valueOf(!DataDomeUtils.isNullOrEmpty(strH).booleanValue());
    }

    public final String j() {
        Application application = (Application) this.f8689h.get();
        if (application != null && application.getBaseContext() != null) {
            String strD = w.a(application, f8678w).d();
            return (strD == null || !strD.startsWith("datadome=")) ? "" : strD;
        }
        if (this.l != null) {
            logEvent(DataDomeSDK.Events.NULL_CONTEXT.getEvent("sdk"));
            this.l.onError(504, "Empty application context.");
        }
        return "";
    }

    public final void k() {
        x xVarA = x.a();
        if (((AtomicBoolean) xVarA.f8720c).get()) {
            return;
        }
        Date date = (Date) xVarA.f8719b;
        List list = f8681z;
        if (date == null || (new Date().getTime() - ((Date) xVarA.f8719b).getTime() > xVarA.f8718a && list.size() >= 5)) {
            ((AtomicBoolean) x.a().f8720c).set(true);
            String strE = DataDomeUtils.e(j());
            String str = f8678w;
            String str2 = this.f8692k;
            String str3 = this.f8691j;
            String str4 = this.f8686e;
            q2 q2Var = new q2();
            q2Var.f48333a = strE;
            q2Var.f48334b = str;
            q2Var.f48335c = str2;
            q2Var.f48336d = str3;
            q2Var.f48338f = str4;
            q2Var.f48337e = list;
            this.f8700t.execute(new m0(this, new a0(this.l, this.f8689h, q2Var, this.f8698r, this.f8701u), false, 4));
        }
    }

    public void logEvent(DataDomeEvent dataDomeEvent) {
        List list = f8681z;
        if (list.size() < 80) {
            try {
                list.add(dataDomeEvent);
            } catch (Exception unused) {
            }
        }
    }
}

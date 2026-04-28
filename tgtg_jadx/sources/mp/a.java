package mp;

import android.app.Activity;
import android.content.IntentSender;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.activity.result.ActivityResultCallback;
import androidx.camera.core.ImageCaptureException;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.o0;
import androidx.lifecycle.m1;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import bg.k0;
import com.app.tgtg.R;
import com.app.tgtg.feature.login.terms.TermsAccessActivity;
import com.app.tgtg.feature.postpurchase.notification.AddReminderFragment;
import com.app.tgtg.feature.storeview.ui.StoreViewActivity;
import com.app.tgtg.feature.tabprofile.storelogin.ui.RecommendStoreFragmentWeb;
import com.app.tgtg.model.local.AppConstants;
import com.braze.managers.l0;
import com.braze.models.BrazeGeofence;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.encoders.EncodingException;
import d10.d;
import d10.e;
import e6.i;
import e6.j;
import h7.w;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m0.h1;
import m0.i0;
import m0.n0;
import m0.r0;
import nx.k;
import oa.h;
import om.l;
import pg.s1;
import pg.v;
import r0.n;
import s0.e1;
import s0.f1;
import s0.p0;
import s0.s;
import s0.u;
import s0.y;
import uo.f;
import v80.f0;
import vy.m;
import w.t0;
import y80.a2;
import zendesk.android.FailureCallback;
import zendesk.android.SuccessCallback;
import zendesk.android.Zendesk;
import zendesk.messaging.android.Messaging;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements r0, ActivityResultCallback, h, k, w, e1, j, e, d, u30.e, t40.a, i0, SuccessCallback, FailureCallback, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30061b;

    public /* synthetic */ a(om.a aVar, rt.d dVar) {
        this.f30060a = 10;
        this.f30061b = aVar;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void a(Object obj) {
        int i11 = this.f30060a;
        Object obj2 = this.f30061b;
        switch (i11) {
            case 1:
                k8.d dVar = (k8.d) obj2;
                List list = (List) obj;
                list.getClass();
                if (!list.isEmpty()) {
                    ((Function1) dVar.f26134b).invoke(list);
                }
                break;
            case 2:
            default:
                AddReminderFragment addReminderFragment = (AddReminderFragment) obj2;
                Map map = (Map) obj;
                map.getClass();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                    if (Intrinsics.areEqual(str, "android.permission.POST_NOTIFICATIONS")) {
                        if (!zBooleanValue && !androidx.core.app.e.l(addReminderFragment.requireActivity(), "android.permission.POST_NOTIFICATIONS")) {
                            ft.c.Y();
                        }
                    } else if (Intrinsics.areEqual(str, "android.permission.WRITE_CALENDAR") && !zBooleanValue && !androidx.core.app.e.l(addReminderFragment.requireActivity(), "android.permission.WRITE_CALENDAR")) {
                        ft.c.K();
                    }
                }
                uo.h hVarO = addReminderFragment.o();
                hVarO.getClass();
                f0.B(m1.d(hVarO), null, null, new f(hVarO, null), 3);
                addReminderFragment.o().a();
                break;
            case 3:
                l lVar = (l) obj2;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (!bool.booleanValue()) {
                    lVar.C().getClass();
                    if (ft.c.m()) {
                        k0 k0Var = new k0(lVar.requireActivity());
                        k0Var.e(R.string.location_picker_alert_box_permission_title);
                        k0Var.a(R.string.location_picker_alert_box_permission_description);
                        k0Var.c(R.string.location_picker_alert_box_positive_btn);
                        k0Var.b(R.string.alert_box_close_btn);
                        k0Var.l = new om.c(lVar, 0);
                        k0Var.f();
                    } else {
                        lVar.C().getClass();
                    }
                } else if (lVar.C().f40308c.i()) {
                    lVar.u();
                } else {
                    lVar.f32673i = true;
                    tm.e eVarC = lVar.C();
                    o0 o0VarRequireActivity = lVar.requireActivity();
                    o0VarRequireActivity.getClass();
                    eVarC.getClass();
                    eVarC.f40308c.c(o0VarRequireActivity);
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    @Override // nx.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.io.File r18) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mp.a.b(java.io.File):void");
    }

    @Override // m0.r0
    public void c(h1 h1Var) {
        Object value;
        c cVar = (c) this.f30061b;
        h1Var.getClass();
        a2 a2Var = cVar.f30067b;
        do {
            value = a2Var.getValue();
        } while (!a2Var.g(value, h1Var));
    }

    @Override // s0.e1
    public void d(f1 f1Var) throws Exception {
        Object objM;
        switch (this.f30060a) {
            case 6:
                q2 q2Var = (q2) this.f30061b;
                try {
                    n0 n0VarA = f1Var.a();
                    StringBuilder sb2 = new StringBuilder("OnImageAvailableListener: mCurrentRequest ID = ");
                    n nVar = (n) q2Var.f48333a;
                    sb2.append(nVar == null ? null : Integer.valueOf(nVar.f37483a));
                    sb2.append(", image.isNull = ");
                    sb2.append(n0VarA == null);
                    wd.a.p("CaptureNode", sb2.toString());
                    if (n0VarA != null) {
                        q2Var.U(n0VarA);
                        return;
                    }
                    n nVar2 = (n) q2Var.f48333a;
                    if (nVar2 != null) {
                        q2Var.e0(new r0.e(nVar2.f37483a, new ImageCaptureException(2, "Failed to acquire latest image", null)));
                        return;
                    }
                    return;
                } catch (IllegalStateException e5) {
                    n nVar3 = (n) q2Var.f48333a;
                    if (nVar3 != null) {
                        q2Var.e0(new r0.e(nVar3.f37483a, new ImageCaptureException(2, "Failed to acquire latest image", e5)));
                        return;
                    }
                    return;
                }
            default:
                t0 t0Var = (t0) this.f30061b;
                f1Var.getClass();
                try {
                    n0 n0VarA2 = f1Var.a();
                    if (n0VarA2 != null) {
                        a8.h hVar = t0Var.f42783c;
                        hVar.getClass();
                        m0.k0 k0VarY = n0VarA2.Y();
                        y yVar = k0VarY instanceof y0.b ? ((y0.b) k0VarY).f44537a : null;
                        if (yVar != null && ((yVar.l() == u.LOCKED_FOCUSED || yVar.l() == u.PASSIVE_FOCUSED) && yVar.h() == s.CONVERGED && yVar.f() == s0.w.CONVERGED)) {
                            synchronized (hVar.f974c) {
                                try {
                                    objM = ((ArrayDeque) hVar.f973b).size() >= 3 ? hVar.m() : null;
                                    ((ArrayDeque) hVar.f973b).addFirst(n0VarA2);
                                } finally {
                                }
                                break;
                            }
                            if (((qc.y) hVar.f975d) == null || objM == null) {
                                return;
                            }
                            ((n0) objM).close();
                            return;
                        }
                        ((qc.y) hVar.f975d).getClass();
                        n0VarA2.close();
                        return;
                    }
                    return;
                } catch (IllegalStateException unused) {
                    if (wd.a.B(6, "CXCP")) {
                        Log.e("CXCP", "Failed to acquire latest image");
                        return;
                    }
                    return;
                }
        }
    }

    public ic.a e(t5.a aVar) throws IOException {
        uy.b bVar = (uy.b) this.f30061b;
        URL url = (URL) aVar.f39791b;
        String strConcat = "TRuntime.".concat("CctTransportBackend");
        if (Log.isLoggable(strConcat, 4)) {
            Log.i(strConcat, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(BrazeGeofence.DEFAULT_NOTIFICATION_RESPONSIVENESS_MS);
        httpURLConnection.setReadTimeout(bVar.f41580g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) aVar.f39793d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    jd.f fVar = bVar.f41574a;
                    m mVar = (m) aVar.f39792c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    o40.d dVar = (o40.d) fVar.f24983b;
                    o40.e eVar = new o40.e(bufferedWriter, dVar.f31978a, dVar.f31979b, dVar.f31980c, dVar.f31981d);
                    eVar.g(mVar);
                    eVar.i();
                    eVar.f31983b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strConcat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(strConcat2, 4)) {
                        Log.i(strConcat2, String.format("Status Code: %d", numValueOf));
                    }
                    w0.e.r(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    w0.e.r(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new ic.a(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new ic.a(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            ic.a aVar2 = new ic.a(responseCode, null, vy.u.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f42619a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return aVar2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (EncodingException e5) {
            e = e5;
            w0.e.u("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new ic.a(400, null, 0L);
        } catch (ConnectException e11) {
            e = e11;
            w0.e.u("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new ic.a(500, null, 0L);
        } catch (UnknownHostException e12) {
            e = e12;
            w0.e.u("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new ic.a(500, null, 0L);
        } catch (IOException e13) {
            e = e13;
            w0.e.u("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new ic.a(400, null, 0L);
        }
    }

    @Override // t40.a
    public void f(t40.b bVar) {
        x30.a aVar = (x30.a) this.f30061b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f43819b.set((x30.a) bVar.get());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:4|(3:6|(1:8)(1:9)|10)(1:11)|12|(1:14)(1:15)|16|(1:18)|(1:20)(1:21)|22|(33:26|42|(1:44)|45|(1:47)|48|(4:51|(3:166|53|169)(1:168)|167|49)|165|54|158|55|56|(1:58)|59|(1:61)|(1:63)(1:64)|65|(4:68|(2:70|171)(1:172)|71|66)|170|72|(2:75|73)|173|76|(1:78)(1:79)|(1:81)(1:82)|83|(5:88|(1:90)|91|447|95)(1:87)|96|(13:107|103|108|(2:110|(1:112))(2:113|(2:140|174))|115|160|116|162|117|118|119|(3:134|(1:136)|137)(3:127|(1:129)|130)|139)(13:100|(1:102)(2:104|(1:106)(0))|103|108|(0)(0)|115|160|116|162|117|118|119|(6:121|123|134|(0)|137|139)(0))|146|(2:148|(1:150))|151|152)(3:27|(3:31|39|(1:41))(4:32|(2:35|33)|164|36)|37)|38|45|(0)|48|(1:49)|165|54|158|55|56|(0)|59|(0)|(0)(0)|65|(1:66)|170|72|(1:73)|173|76|(0)(0)|(0)(0)|83|(5:85|88|(0)|91|447)(0)|146|(0)|151|152) */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0666, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0667, code lost:
    
        r11 = r3;
        android.util.Log.e(r11, "Error retrieving app package info.", r0);
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0448 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0386 A[LOOP:3: B:73:0x0380->B:75:0x0386, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x042f  */
    @Override // u30.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(zw.q2 r50) {
        /*
            Method dump skipped, instruction units count: 1688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mp.a.i(zw.q2):java.lang.Object");
    }

    @Override // m0.i0
    public void j() {
        y0.f fVar = (y0.f) this.f30061b;
        synchronized (fVar.f44560b) {
            try {
                if (fVar.f44562d == null) {
                    wd.a.I("ScreenFlashWrapper", "apply: pendingListener is null!");
                }
                fVar.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // e6.j
    public Object o(i iVar) {
        p0 p0Var = (p0) this.f30061b;
        synchronized (p0Var.f38424a) {
            p0Var.f38428e = iVar;
        }
        return "CameraRepository-deinit";
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i11 = this.f30060a;
        pg.o0 o0Var = null;
        Object obj = this.f30061b;
        switch (i11) {
            case 5:
                TermsAccessActivity termsAccessActivity = (TermsAccessActivity) obj;
                int i12 = TermsAccessActivity.f9064j;
                x6.d dVarX = j4.s.x(view, windowInsetsCompat);
                s1 s1Var = termsAccessActivity.f9066g;
                s1Var.getClass();
                ((ConstraintLayout) s1Var.f35153g).setPadding(0, dVarX.f43874b, 0, 0);
                s1 s1Var2 = termsAccessActivity.f9066g;
                s1Var2.getClass();
                ScrollView scrollView = (ScrollView) s1Var2.f35151e;
                s1 s1Var3 = termsAccessActivity.f9066g;
                s1Var3.getClass();
                int paddingLeft = ((ScrollView) s1Var3.f35151e).getPaddingLeft();
                s1 s1Var4 = termsAccessActivity.f9066g;
                s1Var4.getClass();
                scrollView.setPadding(paddingLeft, 0, ((ScrollView) s1Var4.f35151e).getPaddingRight(), dVarX.f43876d);
                break;
            case 21:
                x6.d dVarX2 = j4.s.x(view, windowInsetsCompat);
                xj.k kVarQ = ((xj.d) obj).q();
                int i13 = dVarX2.f43874b;
                int i14 = dVarX2.f43876d;
                a2 a2Var = kVarQ.f44414i;
                Integer numValueOf = Integer.valueOf(i13);
                a2Var.getClass();
                a2Var.k(null, numValueOf);
                a2 a2Var2 = kVarQ.f44416k;
                Integer numValueOf2 = Integer.valueOf(i14);
                a2Var2.getClass();
                a2Var2.k(null, numValueOf2);
                break;
            case 26:
                StoreViewActivity storeViewActivity = (StoreViewActivity) obj;
                int i15 = StoreViewActivity.f9248o;
                x6.d dVarX3 = j4.s.x(view, windowInsetsCompat);
                pg.o0 o0Var2 = storeViewActivity.f9251h;
                if (o0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    o0Var2 = null;
                }
                ((LinearLayout) o0Var2.f35022h).setPadding(0, dVarX3.f43874b, 0, 0);
                pg.o0 o0Var3 = storeViewActivity.f9251h;
                if (o0Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    o0Var3 = null;
                }
                o0Var3.f35017c.setPadding(0, dVarX3.f43874b, 0, 0);
                pg.o0 o0Var4 = storeViewActivity.f9251h;
                if (o0Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    o0Var = o0Var4;
                }
                o0Var.f35016b.setPadding(0, 0, 0, dVarX3.f43876d);
                break;
            default:
                RecommendStoreFragmentWeb recommendStoreFragmentWeb = (RecommendStoreFragmentWeb) obj;
                x6.d dVarX4 = j4.s.x(view, windowInsetsCompat);
                ((LinearLayout) recommendStoreFragmentWeb.o().f34797e).setPadding(0, dVarX4.f43874b, 0, 0);
                v vVar = recommendStoreFragmentWeb.f9448m;
                vVar.getClass();
                ((WebView) vVar.f35202c).setPadding(0, 0, 0, dVarX4.f43876d);
                break;
        }
        return windowInsetsCompat;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        l0.a((l0) this.f30061b, task);
    }

    @Override // d10.d
    public void onFailure(Exception exc) {
        Activity activity = (Activity) this.f30061b;
        if (exc instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) exc).f11049a.e(AppConstants.GPS_SETTINGS, activity);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    @Override // oa.h
    public void onRefresh() {
        switch (this.f30060a) {
            case 2:
                nm.e eVar = (nm.e) this.f30061b;
                if (eVar.f31104o.getItemCount() == 0) {
                    eVar.w();
                } else if (eVar.f31103n + eVar.f31102m < System.currentTimeMillis()) {
                    eVar.f31103n = System.currentTimeMillis();
                    eVar.w();
                }
                pg.k kVar = eVar.f31106q;
                kVar.getClass();
                ((SwipeRefreshLayout) kVar.f34932f).setRefreshing(false);
                break;
            default:
                ((ym.u) this.f30061b).B();
                break;
        }
    }

    @Override // d10.e
    public void onSuccess(Object obj) {
        switch (this.f30060a) {
            case 13:
                ((t7.a) this.f30061b).invoke(obj);
                break;
            default:
                Messaging.Companion.initialize$lambda$0((zendesk.messaging.android.SuccessCallback) this.f30061b, (Zendesk) obj);
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i11) {
        this.f30060a = i11;
        this.f30061b = obj;
    }

    @Override // zendesk.android.FailureCallback
    public void onFailure(Throwable th2) {
        Messaging.Companion.initialize$lambda$1((zendesk.messaging.android.FailureCallback) this.f30061b, th2);
    }
}

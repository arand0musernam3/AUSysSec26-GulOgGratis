package qc;

import android.adservices.measurement.MeasurementManager;
import android.util.Log;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import ax.h0;
import ax.i0;
import ax.j0;
import ax.s0;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.firebase.components.DependencyException;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.StringCompanionObject;
import org.bouncycastle.iana.AEADAlgorithm;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r5.g0;
import tx.n0;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements g0, h7.w, t20.v, t40.a, u30.e, tx.q, s.a, d10.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36942a;

    public /* synthetic */ y(int i11) {
        this.f36942a = i11;
    }

    public static /* bridge */ /* synthetic */ MeasurementManager b(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class d() {
        return MeasurementManager.class;
    }

    public static /* synthetic */ void e() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void g(Object obj, Object obj2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(obj2);
        throw new IllegalStateException(sb2.toString());
    }

    public static /* synthetic */ void h(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void k(StringBuilder sb2, Object obj) {
        sb2.append(obj);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public static /* synthetic */ void l(Throwable th2) {
        throw new RuntimeRemoteException(th2);
    }

    public static /* synthetic */ void m() {
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2) {
        throw new DependencyException(str + obj + obj2);
    }

    public static /* synthetic */ void o(StringBuilder sb2, Object obj) {
        sb2.append(" at path ");
        sb2.append(obj);
        throw new ue.a(sb2.toString());
    }

    @Override // tx.q
    public void a(boolean z11) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        switch (this.f36942a) {
            case 24:
                if (z11) {
                    synchronized (xx.a.f44499b) {
                        try {
                            ax.a0 a0Var = ax.a0.f4849a;
                            if (s0.c()) {
                                l50.a.C();
                            }
                            if (xx.a.f44500c != null) {
                                Log.w("xx.a", "Already enabled!");
                            } else {
                                xx.a aVar = new xx.a(Thread.getDefaultUncaughtExceptionHandler());
                                xx.a.f44500c = aVar;
                                Thread.setDefaultUncaughtExceptionHandler(aVar);
                            }
                        } finally {
                        }
                    }
                    if (tx.w.b(tx.t.CrashShield)) {
                        o30.f0.f31881c = true;
                        if (s0.c() && !n0.v()) {
                            File fileT = p30.b.t();
                            if (fileT == null) {
                                fileArrListFiles = new File[0];
                            } else {
                                fileArrListFiles = fileT.listFiles(new a40.h(7));
                                if (fileArrListFiles == null) {
                                    fileArrListFiles = new File[0];
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                vx.d dVarJ = ox.h.J(file);
                                if (dVarJ.a()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("crash_shield", dVarJ.toString());
                                        String str = h0.f4915j;
                                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                        arrayList.add(qb.e.z(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{ax.a0.b()}, 1)), jSONObject, new ax.d(dVarJ, 2)));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                j0 j0Var = new j0(arrayList);
                                String str2 = h0.f4915j;
                                tx.j.l(j0Var);
                                new i0(j0Var).executeOnExecutor(ax.a0.c(), new Void[0]);
                            }
                        }
                        yx.a.f46340b = true;
                    }
                    tx.w.b(tx.t.ThreadCheck);
                    return;
                }
                return;
            case 25:
                if (z11) {
                    ax.a0 a0Var2 = ax.a0.f4849a;
                    if (!s0.c() || n0.v()) {
                        return;
                    }
                    File fileT2 = p30.b.t();
                    if (fileT2 == null) {
                        fileArrListFiles2 = new File[0];
                    } else {
                        fileArrListFiles2 = fileT2.listFiles(new a40.h(8));
                        fileArrListFiles2.getClass();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (File file2 : fileArrListFiles2) {
                        file2.getClass();
                        zx.a aVar2 = new zx.a();
                        String name = file2.getName();
                        name.getClass();
                        aVar2.f48407a = name;
                        JSONObject jSONObjectC = p30.b.C(name);
                        if (jSONObjectC != null) {
                            aVar2.f48409c = Long.valueOf(jSONObjectC.optLong("timestamp", 0L));
                            aVar2.f48408b = jSONObjectC.optString("error_message", null);
                        }
                        if (aVar2.f48408b != null && aVar2.f48409c != null) {
                            arrayList2.add(aVar2);
                        }
                    }
                    kotlin.collections.h0.r(arrayList2, new a40.i(17));
                    JSONArray jSONArray = new JSONArray();
                    for (int i11 = 0; i11 < arrayList2.size() && i11 < 1000; i11++) {
                        jSONArray.put(arrayList2.get(i11));
                    }
                    p30.b.D("error_reports", jSONArray, new ax.d(arrayList2, 3));
                    return;
                }
                return;
            default:
                if (z11) {
                    AtomicBoolean atomicBoolean = wx.c.f43540a;
                    synchronized (wx.c.class) {
                        Set set = yx.a.f46339a;
                        if (set.contains(wx.c.class)) {
                            return;
                        }
                        try {
                            if (wx.c.f43540a.getAndSet(true)) {
                                return;
                            }
                            ax.a0 a0Var3 = ax.a0.f4849a;
                            if (s0.c()) {
                                wx.c.a();
                            }
                            int i12 = wx.a.f43534a;
                            if (!set.contains(wx.a.class)) {
                                try {
                                    wx.a.f43535b.scheduleWithFixedDelay(wx.a.f43537d, 0L, 500L, TimeUnit.MILLISECONDS);
                                } catch (Throwable th2) {
                                    yx.a.a(wx.a.class, th2);
                                }
                            }
                            break;
                        } catch (Throwable th3) {
                            yx.a.a(wx.c.class, th3);
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override // s.a
    /* JADX INFO: renamed from: apply */
    public Object mo962apply(Object obj) {
        return null;
    }

    @Override // r5.g0
    public r5.e0 c(m5.h hVar) {
        return new r5.e0(hVar, r5.r.f37699a);
    }

    @Override // u30.e
    public Object i(q2 q2Var) {
        switch (this.f36942a) {
            case 14:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(q2Var);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
            case 16:
            default:
                u30.k kVar = ExecutorsRegistrar.f12751a;
                return v30.k.INSTANCE;
            case 17:
                return (ScheduledExecutorService) ExecutorsRegistrar.f12751a.get();
            case 18:
                return (ScheduledExecutorService) ExecutorsRegistrar.f12753c.get();
            case 19:
                return (ScheduledExecutorService) ExecutorsRegistrar.f12752b.get();
        }
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i11 = ContactUsActivity.f9367t;
        x6.d dVarX = j4.s.x(view, windowInsetsCompat);
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), d70.b.a(32) + dVarX.f43876d);
        return windowInsetsCompat;
    }

    @Override // d10.d
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // t40.a
    public void f(t40.b bVar) {
    }
}

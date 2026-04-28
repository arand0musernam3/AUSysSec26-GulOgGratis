package r40;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import androidx.constraintlayout.widget.z;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.p;
import androidx.lifecycle.r1;
import androidx.lifecycle.s1;
import androidx.lifecycle.viewmodel.CreationExtras;
import ax.a0;
import ax.o;
import ax.o0;
import ax.s0;
import ax.y;
import bx.l;
import bx.m;
import bx.s;
import bx.t;
import com.android.installreferrer.api.InstallReferrerClient;
import com.braze.h2;
import com.facebook.FacebookException;
import h7.c0;
import ja0.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.text.Charsets;
import nx.j;
import org.json.JSONObject;
import tx.m0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements kotlin.coroutines.f, y8.b, m0, fz.a, c0, nf.f, i40.d, j40.a, ia.a, k.a {
    public static final void b(d dVar, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            ArrayList arrayList2 = new ArrayList(e0.o(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new bb.a(iIntValue, ((Number) it2.next()).intValue()));
            }
            i0.s(arrayList2, arrayList);
        }
        CollectionsKt.v0(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(bx.g r8, bx.b r9) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r40.d.g(bx.g, bx.b):void");
    }

    public static Pair j(Bundle bundle, s sVar, boolean z11) {
        String str = j.c() ? "1" : "0";
        Map map = s.f6750b;
        t tVar = t.IAPParameters;
        Pair pairK = p30.b.k(tVar, "is_implicit_purchase_logging_enabled", str, bundle, sVar);
        Object objU = p30.b.u(tVar, "fb_iap_product_id", bundle, sVar);
        String str2 = objU instanceof String ? (String) objU : null;
        if (!z11) {
            if ((bundle != null ? bundle.getString("fb_content_id") : null) == null && str2 != null) {
                Pair pairK2 = p30.b.k(tVar, "fb_content_id", str2, bundle, sVar);
                pairK = p30.b.k(tVar, "android_dynamic_ads_content_id", "client_manual", (Bundle) pairK2.f26485a, (s) pairK2.f26486b);
            }
        }
        Pair pairK3 = p30.b.k(tVar, "is_autolog_app_events_enabled", s0.c() ? "1" : "0", (Bundle) pairK.f26485a, (s) pairK.f26486b);
        return new Pair((Bundle) pairK3.f26485a, (s) pairK3.f26486b);
    }

    public static r1 k(s1 s1Var, ViewModelProvider$Factory viewModelProvider$Factory, int i11) {
        if ((i11 & 2) != 0) {
            viewModelProvider$Factory = s1Var instanceof p ? ((p) s1Var).getDefaultViewModelProviderFactory() : a9.b.f1000a;
        }
        CreationExtras defaultViewModelCreationExtras = s1Var instanceof p ? ((p) s1Var).getDefaultViewModelCreationExtras() : y8.a.f45423b;
        viewModelProvider$Factory.getClass();
        defaultViewModelCreationExtras.getClass();
        return new r1(s1Var.getViewModelStore(), viewModelProvider$Factory, defaultViewModelCreationExtras);
    }

    public static long l() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public static ia0.j m(String str) {
        int i11;
        char cCharAt;
        str.getClass();
        byte[] bArr = ia0.a.f23601a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i12 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i12];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i13 < length) {
                char cCharAt2 = str.charAt(i13);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i11 = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i11 = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    i11 = cCharAt2 + 4;
                } else if (cCharAt2 != '+' && cCharAt2 != '-') {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            break;
                        }
                        i13++;
                    } else {
                        i11 = 63;
                    }
                } else {
                    i11 = 62;
                }
                i15 = (i15 << 6) | i11;
                i14++;
                if (i14 % 4 == 0) {
                    bArrCopyOf[i16] = (byte) (i15 >> 16);
                    int i17 = i16 + 2;
                    bArrCopyOf[i16 + 1] = (byte) (i15 >> 8);
                    i16 += 3;
                    bArrCopyOf[i17] = (byte) i15;
                }
                i13++;
            } else {
                int i18 = i14 % 4;
                if (i18 != 1) {
                    if (i18 == 2) {
                        bArrCopyOf[i16] = (byte) ((i15 << 12) >> 16);
                        i16++;
                    } else if (i18 == 3) {
                        int i19 = i15 << 6;
                        int i21 = i16 + 1;
                        bArrCopyOf[i16] = (byte) (i19 >> 16);
                        i16 += 2;
                        bArrCopyOf[i21] = (byte) (i19 >> 8);
                    }
                    if (i16 != i12) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i16);
                    }
                }
            }
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new ia0.j(bArrCopyOf);
        }
        return null;
    }

    public static ia0.j n(String str) {
        if (str.length() % 2 != 0) {
            i4.a.i("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) (q.a(str.charAt(i12 + 1)) + (q.a(str.charAt(i12)) << 4));
        }
        return new ia0.j(bArr);
    }

    public static i40.b o(d dVar) {
        return new i40.b(System.currentTimeMillis() + ((long) 3600000), new e10.t(8), new i40.a(true, false, false), 10.0d, 1.2d, 60);
    }

    public static ia0.j p(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        ia0.j jVar = new ia0.j(bytes);
        jVar.f23649c = str;
        return jVar;
    }

    public static l q() {
        l lVar;
        synchronized (m.c()) {
            lVar = null;
            if (!yx.a.f46339a.contains(m.class)) {
                try {
                    lVar = m.f6736e;
                } catch (Throwable th2) {
                    yx.a.a(m.class, th2);
                }
            }
        }
        return lVar;
    }

    public static String r() {
        y yVar;
        if (yx.a.f46339a.contains(m.class)) {
            yVar = null;
        } else {
            try {
                yVar = m.f6740i;
            } catch (Throwable th2) {
                yx.a.a(m.class, th2);
                yVar = null;
            }
        }
        yVar.getClass();
        if (!a0.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(a0.a()).build();
            try {
                installReferrerClientBuild.startConnection(new jd.f(installReferrerClientBuild, yVar));
            } catch (Exception unused) {
            }
        }
        return a0.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
    }

    public static void t() {
        synchronized (m.c()) {
            if (m.b() != null) {
                return;
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            if (!yx.a.f46339a.contains(m.class)) {
                try {
                    m.f6735d = scheduledThreadPoolExecutor;
                } catch (Throwable th2) {
                    yx.a.a(m.class, th2);
                }
            }
            bx.c cVar = new bx.c(3);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = m.b();
            if (scheduledThreadPoolExecutorB != null) {
                scheduledThreadPoolExecutorB.scheduleAtFixedRate(cVar, 0L, 86400L, TimeUnit.SECONDS);
            } else {
                h2.b("Required value was null.");
            }
        }
    }

    public static ia0.j u(byte[] bArr) {
        ia0.j jVar = ia0.j.f23646d;
        bArr.getClass();
        int length = bArr.length;
        ia0.b.e(bArr.length, 0, length);
        return new ia0.j(x.k(bArr, 0, length));
    }

    @Override // ia.a
    public ia.b a(e20.a aVar) {
        return new ja.h((Context) aVar.f15579c, (String) aVar.f15580d, (z) aVar.f15581e, aVar.f15577a, aVar.f15578b);
    }

    @Override // fz.a
    public long c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // tx.m0
    public void d(JSONObject jSONObject) {
        String strOptString = jSONObject != null ? jSONObject.optString("id") : null;
        if (strOptString == null) {
            Log.w("o0", "No user ID returned on Me request");
            return;
        }
        String strOptString2 = jSONObject.optString("link");
        String strOptString3 = jSONObject.optString("profile_picture", null);
        o.f4975f.w().a(new o0(strOptString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null, strOptString3 != null ? Uri.parse(strOptString3) : null), true);
    }

    @Override // nf.f
    public hf.g e(ye.b bVar) {
        ye.g gVar = bVar.f45852a;
        SharedPreferences sharedPreferences = gVar.f45887b.getSharedPreferences("amplitude-identify-intercept-" + gVar.f45890e, 0);
        String str = gVar.f45890e;
        kf.b bVarV = gVar.f45892g.v(bVar);
        sharedPreferences.getClass();
        return new hf.g(str, bVarV, sharedPreferences, new File(gVar.a(), "identify-intercept"), bVar.f45863m, new hf.a(bVar, 1));
    }

    @Override // j40.a
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // i40.d
    public i40.b h(d dVar, JSONObject jSONObject) {
        return o(dVar);
    }

    @Override // tx.m0
    public void i(FacebookException facebookException) {
        Log.e("o0", "Got unexpected exception: " + facebookException);
    }

    public ax.j s() {
        ax.j jVar;
        ax.j jVar2 = ax.j.f4929g;
        if (jVar2 != null) {
            return jVar2;
        }
        synchronized (this) {
            jVar = ax.j.f4929g;
            if (jVar == null) {
                d9.c cVarA = d9.c.a(a0.a());
                cVarA.getClass();
                ax.j jVar3 = new ax.j(cVarA, new se.d(5));
                ax.j.f4929g = jVar3;
                jVar = jVar3;
            }
        }
        return jVar;
    }

    @Override // h7.c0
    public void onScrollLimit(int i11, int i12, int i13, boolean z11) {
    }

    @Override // h7.c0
    public void onScrollProgress(int i11, int i12, int i13, int i14) {
    }
}

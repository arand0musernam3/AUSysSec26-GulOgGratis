package t10;

import android.app.ActivityManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.viewpager2.widget.ViewPager2;
import bg.c0;
import com.app.tgtg.feature.tabprofile.storelogin.ui.RecommendStoreFragment;
import e6.j;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import l8.m;
import m3.c3;
import m3.i;
import m3.k1;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import u5.k;
import u90.o;
import u90.q;
import u90.s;
import u90.t;
import u90.u;
import v80.i0;
import v80.j0;
import y00.b2;
import y00.e1;
import y00.g0;
import y00.i4;
import y00.n1;
import y00.t2;
import y00.u3;
import y00.w0;
import y00.y1;
import y9.h;
import ya.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class c implements td.c, u90.g, AccessibilityViewCommand, j, n, c0, bt.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f39648a;

    public c(m mVar) {
        u6.f fVar = new u6.f(mVar);
        a30.c cVarB = a30.b.b(new z20.d(fVar, 1));
        h hVar = new h();
        hVar.f45666a = fVar;
        hVar.f45667b = cVarB;
        this.f39648a = a30.b.b(new i4(a30.b.b(new t5.a(a30.b.b(hVar), a30.b.b(new z20.d(fVar, 0)), fVar, 27)), 5));
    }

    public static c t(String str) {
        return new c((TextUtils.isEmpty(str) || str.length() > 1) ? y1.UNINITIALIZED : b2.e(str.charAt(0)));
    }

    @Override // u90.g
    public o a() throws Throwable {
        t tVarB;
        IOException iOException = null;
        while (!((q) this.f39648a).f40970k.f40938q) {
            try {
                tVarB = ((q) this.f39648a).b();
            } catch (IOException e5) {
                if (iOException == null) {
                    iOException = e5;
                } else {
                    u70.e.a(iOException, e5);
                }
                if (!((q) this.f39648a).a(null)) {
                    throw iOException;
                }
            }
            if (!tVarB.isReady()) {
                s sVarC = tVarB.c();
                if (sVarC.f40977b == null && sVarC.f40978c == null) {
                    sVarC = tVarB.f();
                }
                t tVar = sVarC.f40977b;
                Throwable th2 = sVarC.f40978c;
                if (th2 != null) {
                    throw th2;
                }
                if (tVar != null) {
                    ((q) this.f39648a).f40974p.addFirst(tVar);
                }
            }
            return tVarB.b();
        }
        i4.a.k("Canceled");
        return null;
    }

    @Override // u90.g
    public u b() {
        return (q) this.f39648a;
    }

    @Override // td.c
    public i0 c() {
        return (j0) this.f39648a;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean d(View view) {
        wa.j jVar = (wa.j) this.f39648a;
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = jVar.f43370g;
        if (viewPager2.f4130r) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }

    @Override // ya.n
    public String[] f() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f39648a).getSupportedFeatures();
    }

    public c3 g() {
        l8.j jVarA = l8.j.a();
        if (jVarA.c() == 1) {
            return new k(true);
        }
        k1 k1VarW = i.w(Boolean.FALSE);
        jVarA.h(new u5.g(k1VarW, this));
        return k1VarW;
    }

    @Override // ya.n
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) na0.a.W(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f39648a).getStatics());
    }

    @Override // ya.n
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) na0.a.W(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f39648a).getWebkitToCompatConverter());
    }

    @Override // bg.c0
    public void h(String str) {
        str.getClass();
        RecommendStoreFragment recommendStoreFragment = (RecommendStoreFragment) this.f39648a;
        recommendStoreFragment.u().f48068g = str;
        RecommendStoreFragment.t(recommendStoreFragment);
    }

    @Override // bt.a
    public void i(Uri uri) {
        uri.getClass();
        at.c0 c0Var = ((zs.j) this.f39648a).f48087g;
        if (c0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewRouter");
            c0Var = null;
        }
        c0Var.a(uri);
    }

    public Size[] j(int i11) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f39648a;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i11);
        }
        return null;
    }

    public Integer[] k() {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) this.f39648a;
        } catch (IllegalArgumentException e5) {
            wd.a.J("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e5);
        } catch (NullPointerException e11) {
            wd.a.J("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e11);
        }
        int[] outputFormats = streamConfigurationMap != null ? streamConfigurationMap.getOutputFormats() : null;
        if (outputFormats != null) {
            return x.q(outputFormats);
        }
        return null;
    }

    public long l(int i11, Size size) {
        size.getClass();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f39648a;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputMinFrameDuration(i11, size);
        }
        return 0L;
    }

    @Override // bt.a
    public void m(Uri uri) {
        uri.getClass();
        at.c0 c0Var = ((zs.j) this.f39648a).f48087g;
        if (c0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewRouter");
            c0Var = null;
        }
        c0Var.getClass();
        c0Var.f4769a.a(new f70.n(uri));
    }

    public Size[] n(int i11) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f39648a;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputSizes(i11);
        }
        return null;
    }

    @Override // e6.j
    public Object o(e6.i iVar) {
        x0.j jVar = (x0.j) this.f39648a;
        pd.g.n("The result can only set once!", jVar.f43637f == null);
        jVar.f43637f = iVar;
        return "ListFuture[" + this + "]";
    }

    public void q(j30.g gVar) {
        cz.j jVar = (cz.j) this.f39648a;
        jVar.f13632b = gVar;
        Iterator it = ((LinkedList) jVar.f13634d).iterator();
        while (it.hasNext()) {
            ((yz.e) it.next()).b();
        }
        ((LinkedList) jVar.f13634d).clear();
        jVar.f13633c = null;
    }

    public void r() {
        u3 u3Var = (u3) this.f39648a;
        u3Var.p();
        n1 n1Var = (n1) u3Var.f21216b;
        e1 e1Var = n1Var.f44986e;
        n1.k(e1Var);
        n1Var.f44992k.getClass();
        if (e1Var.y(System.currentTimeMillis())) {
            e1 e1Var2 = n1Var.f44986e;
            n1.k(e1Var2);
            e1Var2.f44716m.c(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                w0 w0Var = n1Var.f44987f;
                n1.m(w0Var);
                w0Var.f45267o.a("Detected application was in foreground");
                u(System.currentTimeMillis(), n1Var.f44985d.A(null, g0.f44776e1) ? SystemClock.elapsedRealtime() : 0L);
            }
        }
    }

    public void s(long j9, long j11) {
        u3 u3Var = (u3) this.f39648a;
        u3Var.p();
        u3Var.t();
        n1 n1Var = (n1) u3Var.f21216b;
        e1 e1Var = n1Var.f44986e;
        n1.k(e1Var);
        if (e1Var.y(j9)) {
            n1.k(e1Var);
            e1Var.f44716m.c(true);
            n1Var.r().u();
        }
        n1.k(e1Var);
        e1Var.f44720q.b(j9);
        if (e1Var.f44716m.b()) {
            u(j9, j11);
        }
    }

    public void u(long j9, long j11) {
        u3 u3Var = (u3) this.f39648a;
        u3Var.p();
        n1 n1Var = (n1) u3Var.f21216b;
        if (n1Var.e()) {
            e1 e1Var = n1Var.f44986e;
            n1.k(e1Var);
            e1Var.f44720q.b(j9);
            n1Var.f44992k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45267o.b(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j12 = j9 / 1000;
            Long lValueOf = Long.valueOf(j12);
            t2 t2Var = n1Var.f44993m;
            n1.l(t2Var);
            t2Var.A(j9, lValueOf, "auto", "_sid");
            n1.k(e1Var);
            e1Var.f44721r.b(j12);
            e1Var.f44716m.c(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j12);
            n1.l(t2Var);
            t2Var.x(j9, j11, bundle, "auto", "_s");
            String strI = e1Var.f44726w.i();
            if (TextUtils.isEmpty(strI)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strI);
            n1.l(t2Var);
            t2Var.x(j9, j11, bundle2, "auto", "_ssr");
        }
    }

    @Override // bt.a
    public void e() {
    }

    @Override // bt.a
    public void onPageFinished() {
    }

    @Override // bt.a
    public void p(RuntimeException runtimeException) {
    }

    public /* synthetic */ c(Object obj) {
        this.f39648a = obj;
    }
}

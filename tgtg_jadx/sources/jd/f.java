package jd;

import android.content.Context;
import android.location.Location;
import android.media.Image;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.o0;
import ax.a0;
import bx.m;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.google.android.gms.location.LocationResult;
import com.google.android.material.appbar.AppBarLayout;
import dn.k;
import i4.j0;
import i4.t;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.text.StringsKt;
import o.j;
import o.w;
import oa0.n0;
import oq.n;
import org.bouncycastle.iana.AEADAlgorithm;
import p.z2;
import qz.l;
import qz.q;
import t1.p;
import t1.y;
import u70.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements w, h7.w, l, h7.i, q, oa0.g, j, com.google.android.gms.common.internal.e, p, InstallReferrerStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f24983b;

    public f() {
        this.f24982a = 24;
        this.f24983b = new o0();
        new HashMap();
    }

    @Override // h7.i
    public boolean a(float f11) {
        if (f11 == 0.0f) {
            return false;
        }
        c();
        ((NestedScrollView) this.f24983b).j((int) f11);
        return true;
    }

    @Override // qz.q
    public void accept(Object obj, Object obj2) {
        mz.a aVar = (mz.a) this.f24983b;
        nz.d dVar = new nz.d(0, (d10.g) obj2);
        nz.a aVar2 = (nz.a) ((nz.c) ((nz.f) obj).getService());
        aVar2.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
        int i11 = g00.b.f18063a;
        parcelObtain.writeInt(1);
        aVar.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(dVar);
        aVar2.a(4, parcelObtain);
    }

    @Override // h7.i
    public float b() {
        return -((NestedScrollView) this.f24983b).getVerticalScrollFactorCompat();
    }

    @Override // h7.i
    public void c() {
        ((NestedScrollView) this.f24983b).f2779d.abortAnimation();
    }

    public void d(float f11, float f12, float f13, float f14, int i11) {
        ((j30.g) this.f24983b).i().m(f11, f12, f13, f14, i11);
    }

    public String e(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            o40.d dVar = (o40.d) this.f24983b;
            o40.e eVar = new o40.e(stringWriter, dVar.f31978a, dVar.f31979b, dVar.f31980c, dVar.f31981d);
            eVar.g(obj);
            eVar.i();
            eVar.f31983b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public ByteBuffer f() {
        return ((Image.Plane) this.f24983b).getBuffer();
    }

    @Override // qz.l
    public void g(Object obj) {
        tt.a aVar = (tt.a) obj;
        LocationResult locationResult = (LocationResult) this.f24983b;
        aVar.getClass();
        locationResult.getClass();
        k kVar = (k) aVar.f40474a.f39792c;
        if (kVar != null) {
            List list = locationResult.f12119a;
            int size = list.size();
            Location location = size == 0 ? null : (Location) list.get(size - 1);
            v80.l lVar = (v80.l) kVar.f15019c;
            ft.j jVar = (ft.j) kVar.f15018b;
            if (location != null) {
                jVar.f17935c.E();
                jVar.f17936d = new st.b(location.getLatitude(), location.getLongitude());
                if (lVar.g()) {
                    o oVar = u70.q.f40850b;
                    lVar.resumeWith(jVar.f17936d);
                }
            }
        }
    }

    @Override // t1.p
    public y get(int i11) {
        return (y) this.f24983b;
    }

    @Override // o.w
    public void h(o.l lVar, boolean z11) {
        ((androidx.appcompat.app.a) this.f24983b).P(lVar);
    }

    public int i() {
        return ((Image.Plane) this.f24983b).getPixelStride();
    }

    @Override // o.j
    public boolean j(o.l lVar, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        p.j jVar = ((ActionMenuView) this.f24983b).A;
        if (jVar != null) {
            Toolbar toolbar = (Toolbar) ((jb.b) jVar).f24851a;
            Iterator it = toolbar.G.f21615b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 z2Var = toolbar.I;
                    zOnMenuItemSelected = z2Var != null ? ((androidx.appcompat.app.b) ((jb.b) z2Var).f24851a).f1806b.onMenuItemSelected(0, menuItem) : false;
                } else if (((MenuProvider) it.next()).a(menuItem)) {
                    zOnMenuItemSelected = true;
                    break;
                }
            }
            if (zOnMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    public int k() {
        return ((Image.Plane) this.f24983b).getRowStride();
    }

    public void l(float f11, float f12, float f13, float f14) {
        j30.g gVar = (j30.g) this.f24983b;
        t tVarI = gVar.i();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar.o() >> 32)) - (f13 + f11);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gVar.o() & 4294967295L)) - (f14 + f12))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            j0.a("Width and height must be greater than or equal to zero");
        }
        gVar.B(jFloatToRawIntBits);
        tVarI.n(f11, f12);
    }

    @Override // oa0.g
    public void m(oa0.d dVar, n0 n0Var) {
        switch (this.f24982a) {
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((oa0.h) this.f24983b).complete(n0Var);
                break;
            default:
                v80.l lVar = (v80.l) this.f24983b;
                o oVar = u70.q.f40850b;
                lVar.resumeWith(n0Var);
                break;
        }
    }

    public void n(float f11, long j9) {
        t tVarI = ((j30.g) this.f24983b).i();
        int i11 = (int) (j9 >> 32);
        int i12 = (int) (j9 & 4294967295L);
        tVarI.n(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12));
        tVarI.d(f11);
        tVarI.n(-Float.intBitsToFloat(i11), -Float.intBitsToFloat(i12));
    }

    public void o(float f11, float f12, long j9) {
        t tVarI = ((j30.g) this.f24983b).i();
        int i11 = (int) (j9 >> 32);
        int i12 = (int) (j9 & 4294967295L);
        tVarI.n(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12));
        tVarI.b(f11, f12);
        tVarI.n(-Float.intBitsToFloat(i11), -Float.intBitsToFloat(i12));
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        switch (this.f24982a) {
            case 6:
                AppBarLayout appBarLayout = (AppBarLayout) this.f24983b;
                WindowInsetsCompat windowInsetsCompat2 = appBarLayout.getFitsSystemWindows() ? windowInsetsCompat : null;
                if (!Objects.equals(appBarLayout.f12211g, windowInsetsCompat2)) {
                    appBarLayout.f12211g = windowInsetsCompat2;
                    appBarLayout.setWillNotDraw(!(appBarLayout.f12226w != null && appBarLayout.getTopInset() > 0));
                    appBarLayout.requestLayout();
                }
                break;
            case 19:
                q20.g gVar = (q20.g) this.f24983b;
                gVar.f35941m = windowInsetsCompat.i();
                gVar.f35942n = windowInsetsCompat.j();
                gVar.f35943o = windowInsetsCompat.k();
                gVar.f();
                break;
            default:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f24983b;
                if (!Objects.equals(coordinatorLayout.f2561n, windowInsetsCompat)) {
                    coordinatorLayout.f2561n = windowInsetsCompat;
                    boolean z11 = windowInsetsCompat != null && windowInsetsCompat.l() > 0;
                    coordinatorLayout.f2562o = z11;
                    coordinatorLayout.setWillNotDraw(!z11 && coordinatorLayout.getBackground() == null);
                    if (!windowInsetsCompat.q()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = coordinatorLayout.getChildAt(i11);
                            if (!ViewCompat.p(childAt) || ((s6.e) childAt.getLayoutParams()).f38839a == null || !windowInsetsCompat.q()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                break;
        }
        return windowInsetsCompat;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i11) {
        InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.f24983b;
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (i11 == 0) {
                try {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    installReferrer.getClass();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null && (StringsKt.z(installReferrer2, "fb", false) || StringsKt.z(installReferrer2, "facebook", false))) {
                        if (!set.contains(m.class)) {
                            try {
                                a0.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", installReferrer2).apply();
                            } catch (Throwable th2) {
                                yx.a.a(m.class, th2);
                            }
                        }
                    }
                    a0.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
                } catch (RemoteException | Exception unused) {
                    return;
                }
            } else if (i11 == 2) {
                a0.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
            }
            installReferrerClient.endConnection();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                yx.a.a(this, th4);
            }
        }
    }

    @Override // oa0.g
    public void p(oa0.d dVar, Throwable th2) {
        switch (this.f24982a) {
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((oa0.h) this.f24983b).completeExceptionally(th2);
                break;
            default:
                v80.l lVar = (v80.l) this.f24983b;
                o oVar = u70.q.f40850b;
                lVar.resumeWith(new u70.p(th2));
                break;
        }
    }

    @Override // o.j
    public void q(o.l lVar) {
        j jVar = ((ActionMenuView) this.f24983b).f1992v;
        if (jVar != null) {
            jVar.q(lVar);
        }
    }

    public void r(float f11, float f12) {
        ((j30.g) this.f24983b).i().n(f11, f12);
    }

    @Override // o.w
    public boolean v(o.l lVar) {
        Window.Callback callback = ((androidx.appcompat.app.a) this.f24983b).l.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    public /* synthetic */ f(Object obj, int i11) {
        this.f24982a = i11;
        this.f24983b = obj;
    }

    public f(n nVar) {
        this.f24982a = 23;
        nVar.getClass();
        this.f24983b = nVar;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }

    public f(lh.w wVar) {
        this.f24982a = 17;
        wVar.getClass();
        this.f24983b = wVar;
    }

    public f(Context context, kf.b bVar, a50.c cVar) {
        this.f24982a = 1;
        context.getClass();
        bVar.getClass();
        this.f24983b = cVar;
    }

    public f(InstallReferrerClient installReferrerClient, ax.y yVar) {
        this.f24982a = 29;
        this.f24983b = installReferrerClient;
    }

    public /* synthetic */ f(int i11) {
        this.f24982a = i11;
    }

    public f(List list) {
        this.f24982a = 20;
        list.getClass();
        this.f24983b = list;
    }
}

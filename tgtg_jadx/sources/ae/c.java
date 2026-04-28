package ae;

import a3.i3;
import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.r1;
import androidx.viewpager2.widget.ViewPager2;
import b5.g0;
import b5.v;
import c5.y;
import com.app.tgtg.feature.main.MainActivity;
import com.braze.h2;
import com.google.android.gms.internal.measurement.ld;
import com.google.android.gms.internal.measurement.nd;
import com.google.android.material.tabs.TabLayout;
import ia0.h0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import k30.d0;
import kotlin.jvm.functions.Function0;
import mv.m0;
import pg.u1;
import q1.z;
import w4.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1246e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(com.google.android.gms.internal.measurement.nb r31, androidx.recyclerview.widget.r1 r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.c.<init>(com.google.android.gms.internal.measurement.nb, androidx.recyclerview.widget.r1):void");
    }

    public void a() {
        synchronized (((q90.f) this.f1246e)) {
            if (this.f1242a) {
                return;
            }
            this.f1242a = true;
            r90.e.b((h0) this.f1244c);
            try {
                ((c40.q) this.f1243b).a();
            } catch (IOException unused) {
            }
        }
    }

    public void b() {
        TabLayout tabLayout = (TabLayout) this.f1243b;
        ViewPager2 viewPager2 = (ViewPager2) this.f1244c;
        if (this.f1242a) {
            h2.b("TabLayoutMediator is already attached");
            return;
        }
        l1 adapter = viewPager2.getAdapter();
        this.f1246e = adapter;
        if (adapter == null) {
            h2.b("TabLayoutMediator attached before ViewPager2 has an adapter");
            return;
        }
        this.f1242a = true;
        viewPager2.b(new s20.m(tabLayout));
        s20.k kVar = new s20.k(viewPager2, 1);
        ArrayList arrayList = tabLayout.M;
        if (!arrayList.contains(kVar)) {
            arrayList.add(kVar);
        }
        ((l1) this.f1246e).registerAdapterDataObserver(new androidx.recyclerview.widget.h2(this, 1));
        e();
        tabLayout.setScrollPosition(viewPager2.getCurrentItem(), 0.0f, true);
    }

    public oz.m c() {
        Intent intent = (Intent) this.f1243b;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1242a);
        ((ky.p) this.f1244c).getClass();
        intent.putExtras(new Bundle());
        Bundle bundle2 = (Bundle) this.f1246e;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        String strA = u.e.a();
        if (!TextUtils.isEmpty(strA)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", strA);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (((ActivityOptions) this.f1245d) == null) {
                this.f1245d = u.d.a();
            }
            u.f.a((ActivityOptions) this.f1245d, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f1245d;
        return new oz.m(27, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public void d(u1 u1Var) {
        u1Var.getClass();
        m0 m0Var = sa0.a.f38953a;
        m0Var.h("PopupHandler");
        yn.o oVar = (yn.o) this.f1246e;
        m0Var.a("deletePopup()   popup = " + (oVar != null ? oVar.b() : null), new Object[0]);
        yn.o oVar2 = (yn.o) this.f1246e;
        if (oVar2 != null) {
            oVar2.a(u1Var);
        }
        this.f1246e = null;
        ((ArrayList) this.f1245d).clear();
        this.f1242a = false;
    }

    public void e() {
        TabLayout tabLayout = (TabLayout) this.f1243b;
        tabLayout.j();
        l1 l1Var = (l1) this.f1246e;
        if (l1Var != null) {
            int itemCount = l1Var.getItemCount();
            for (int i11 = 0; i11 < itemCount; i11++) {
                s20.g gVarI = tabLayout.i();
                ((s20.l) this.f1245d).b(gVarI, i11);
                tabLayout.a(gVarI, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(((ViewPager2) this.f1244c).getCurrentItem(), tabLayout.getTabCount() - 1);
                if (iMin != tabLayout.getSelectedTabPosition()) {
                    tabLayout.k(tabLayout.h(iMin), true);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int f(ub.a aVar, y yVar, boolean z11) {
        Object[] objArr;
        int i11;
        int i12;
        w4.c cVar = (w4.c) this.f1244c;
        v vVar = (v) this.f1246e;
        if (this.f1242a) {
            return 0;
        }
        try {
            this.f1242a = true;
            i3 i3VarX = ((m1.a) this.f1245d).x(aVar, yVar);
            z zVar = (z) i3VarX.f395b;
            int iJ = zVar.j();
            for (int i13 = 0; i13 < iJ; i13++) {
                w4.v vVar2 = (w4.v) zVar.k(i13);
                if (!vVar2.f43181d && !vVar2.f43185h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iJ2 = zVar.j();
            for (int i14 = 0; i14 < iJ2; i14++) {
                w4.v vVar3 = (w4.v) zVar.k(i14);
                if (objArr != false || u.b(vVar3)) {
                    b5.m0 m0Var = (b5.m0) this.f1243b;
                    long j9 = vVar3.f43180c;
                    v vVar4 = (v) this.f1246e;
                    int i15 = vVar3.f43186i;
                    g0 g0Var = b5.m0.V;
                    m0Var.B(j9, vVar4, i15, true);
                    if (!vVar.f6004a.d()) {
                        cVar.a(vVar3.f43178a, vVar, u.b(vVar3));
                        vVar.clear();
                    }
                }
            }
            boolean zB = cVar.b(i3VarX, z11);
            if (i3VarX.f394a) {
                i11 = 0;
            } else {
                int iJ3 = zVar.j();
                for (int i16 = 0; i16 < iJ3; i16++) {
                    w4.v vVar5 = (w4.v) zVar.k(i16);
                    if (!h4.b.b(u.h(vVar5, true), 0L) && vVar5.b()) {
                        i11 = 1;
                        break;
                    }
                }
                i11 = 0;
            }
            int iJ4 = zVar.j();
            int i17 = 0;
            while (true) {
                if (i17 >= iJ4) {
                    i12 = 0;
                    break;
                }
                if (((w4.v) zVar.k(i17)).b()) {
                    i12 = 1;
                    break;
                }
                i17++;
            }
            int i18 = (zB ? 1 : 0) | (i11 << 1) | (i12 << 2);
            this.f1242a = false;
            return i18;
        } catch (Throwable th2) {
            this.f1242a = false;
            throw th2;
        }
    }

    public void g(yn.o oVar) {
        ArrayList arrayList = (ArrayList) this.f1245d;
        if (!this.f1242a) {
            sa0.a.f38953a.a("initializeMainOnResumePopupSeries()", new Object[0]);
            if (!this.f1242a) {
                arrayList.clear();
                this.f1242a = true;
            }
        }
        if (this.f1242a) {
            m0 m0Var = sa0.a.f38953a;
            m0Var.h("PopupHandler");
            m0Var.a("registerSeriesPopup() - Added the above one!  popup = " + oVar.b(), new Object[0]);
            arrayList.add(oVar);
        }
    }

    public void h(u1 u1Var) {
        u1Var.getClass();
        m0 m0Var = sa0.a.f38953a;
        m0Var.h("PopupHandler");
        m0Var.a("resetPopupHandler()", new Object[0]);
        yn.o oVar = (yn.o) this.f1246e;
        if (oVar != null) {
            oVar.a(u1Var);
        }
        this.f1246e = null;
        ((ArrayList) this.f1245d).clear();
        this.f1242a = false;
    }

    public void i(String str, boolean z11) {
        Object next;
        m0 m0Var = sa0.a.f38953a;
        m0Var.h("PopupHandler");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("runPopupLoop()    seriesRunning=" + this.f1242a + ",    ");
        ArrayList arrayList = (ArrayList) this.f1245d;
        sb2.append("activatedPopupList.size=" + arrayList.size() + ",    ");
        sb2.append("from=".concat(str));
        m0Var.a(sb2.toString(), new Object[0]);
        if ((z11 && ((Boolean) ((Function0) this.f1244c).invoke()).booleanValue()) || !this.f1242a || arrayList.isEmpty()) {
            return;
        }
        for (yn.p pVar : yn.p.a()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((yn.o) next).b() == pVar) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            yn.o oVar = (yn.o) next;
            if (oVar != null && ((yn.o) this.f1246e) == null && oVar.c()) {
                this.f1246e = oVar;
                ((MainActivity) this.f1243b).c0(oVar);
            }
        }
    }

    public void j(yn.o oVar, boolean z11) {
        m0 m0Var = sa0.a.f38953a;
        m0Var.h("PopupHandler");
        m0Var.a("showOrSignupPopup()  popup = " + oVar.b(), new Object[0]);
        if (((yn.o) this.f1246e) == null && !this.f1242a) {
            k(oVar, z11);
        } else if (this.f1242a) {
            g(oVar);
        } else {
            g(oVar);
            i("showOrSignup()", z11);
        }
    }

    public boolean k(yn.o oVar, boolean z11) {
        if (((yn.o) this.f1246e) != null) {
            return false;
        }
        if (z11 && ((Boolean) ((Function0) this.f1244c).invoke()).booleanValue()) {
            return false;
        }
        this.f1246e = oVar;
        ((MainActivity) this.f1243b).c0(oVar);
        return true;
    }

    public synchronized void l() {
        try {
            if (this.f1242a) {
                return;
            }
            this.f1242a = true;
            Context context = (Context) this.f1246e;
            if (context != null) {
                ((a) this.f1244c).b(context);
                context.unregisterComponentCallbacks((b) this.f1245d);
            }
            ((WeakReference) this.f1243b).clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public c(ld ldVar, r1 r1Var) {
        this.f1242a = false;
        ld.A().equals(ldVar);
        this.f1243b = ldVar.t();
        this.f1244c = ldVar.u();
        int i11 = k30.m.f25911c;
        Object[] objArr = d0.f25886i;
        int iY = ldVar.y() + 3;
        ex.i.m(iY, "expectedSize");
        a3.j jVar = new a3.j(iY);
        for (nd ndVar : ldVar.x()) {
            int iG = ndVar.G();
            int i12 = iG - 1;
            if (iG == 0) {
                throw null;
            }
            if (i12 == 0) {
                jVar.q(ndVar.t(), Long.valueOf(ndVar.u()));
            } else if (i12 == 1) {
                jVar.q(ndVar.t(), Boolean.valueOf(ndVar.v()));
            } else if (i12 == 2) {
                jVar.q(ndVar.t(), Double.valueOf(ndVar.w()));
            } else if (i12 == 3) {
                jVar.q(ndVar.t(), ndVar.x());
            } else if (i12 == 4) {
                jVar.q(ndVar.t(), ndVar.y().m());
            }
        }
        jVar.q("__phenotype_server_token", ldVar.v());
        jVar.q("__phenotype_snapshot_token", ldVar.t());
        jVar.q("__phenotype_configuration_version", Long.valueOf(ldVar.w()));
        this.f1245d = jVar.f(false);
        this.f1246e = r1Var;
    }

    public c(TabLayout tabLayout, ViewPager2 viewPager2, s20.l lVar) {
        this.f1243b = tabLayout;
        this.f1244c = viewPager2;
        this.f1245d = lVar;
    }

    public c(t5.a aVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f1243b = intent;
        this.f1244c = new ky.p(21);
        this.f1242a = true;
        if (aVar != null) {
            intent.setPackage(((ComponentName) aVar.f39793d).getPackageName());
            u.c cVar = (u.c) aVar.f39792c;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", cVar);
            intent.putExtras(bundle);
        }
    }
}

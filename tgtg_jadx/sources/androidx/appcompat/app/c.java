package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.j;
import androidx.appcompat.view.k;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.h;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import com.adyen.checkout.components.core.Address;
import com.braze.h2;
import java.util.ArrayList;
import k.f0;
import k.g0;
import k.p;
import lz.i;
import o.l;
import o.n;
import p.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ActionBar implements p.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f1815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f1816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f1817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b1 f1818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionBarContextView f1819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f1820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g0 f1822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g0 f1823j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p f1824k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f1825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1826n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1827o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1828p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1829q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1830r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k f1832t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1833u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1834v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f0 f1835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f0 f1836x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f1837y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AccelerateInterpolator f1813z = new AccelerateInterpolator();
    public static final DecelerateInterpolator A = new DecelerateInterpolator();

    public c(Activity activity, boolean z11) {
        new ArrayList();
        this.f1825m = new ArrayList();
        this.f1826n = 0;
        this.f1827o = true;
        this.f1831s = true;
        this.f1835w = new f0(this, 0);
        this.f1836x = new f0(this, 1);
        this.f1837y = new i(this, 27);
        View decorView = activity.getWindow().getDecorView();
        v(decorView);
        if (z11) {
            return;
        }
        this.f1820g = decorView.findViewById(R.id.content);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean b() {
        g gVar;
        b1 b1Var = this.f1818e;
        if (b1Var == null || (gVar = ((h) b1Var).f2157a.M) == null || gVar.f2155b == null) {
            return false;
        }
        g gVar2 = ((h) b1Var).f2157a.M;
        n nVar = gVar2 == null ? null : gVar2.f2155b;
        if (nVar == null) {
            return true;
        }
        nVar.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void c(boolean z11) {
        if (z11 == this.l) {
            return;
        }
        this.l = z11;
        ArrayList arrayList = this.f1825m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        org.bouncycastle.jce.provider.a.c();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int d() {
        return ((h) this.f1818e).f2158b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context e() {
        if (this.f1815b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1814a.getTheme().resolveAttribute(com.app.tgtg.R.attr.actionBarWidgetTheme, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                this.f1815b = new ContextThemeWrapper(this.f1814a, i11);
            } else {
                this.f1815b = this.f1814a;
            }
        }
        return this.f1815b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void f() {
        if (this.f1828p) {
            return;
        }
        this.f1828p = true;
        x(false);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void h() {
        w(androidx.appcompat.view.a.a(this.f1814a).f1840a.getResources().getBoolean(com.app.tgtg.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean j(int i11, KeyEvent keyEvent) {
        l lVar;
        g0 g0Var = this.f1822i;
        if (g0Var == null || (lVar = g0Var.f25569d) == null) {
            return false;
        }
        lVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return lVar.performShortcut(i11, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void m(boolean z11) {
        if (this.f1821h) {
            return;
        }
        n(z11);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void n(boolean z11) {
        int i11 = z11 ? 4 : 0;
        h hVar = (h) this.f1818e;
        int i12 = hVar.f2158b;
        this.f1821h = true;
        hVar.a((i11 & 4) | (i12 & (-5)));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void o() {
        h hVar = (h) this.f1818e;
        hVar.a((hVar.f2158b & (-3)) | 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void p() {
        h hVar = (h) this.f1818e;
        hVar.f2161e = null;
        hVar.c();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void q(boolean z11) {
        k kVar;
        this.f1833u = z11;
        if (z11 || (kVar = this.f1832t) == null) {
            return;
        }
        kVar.a();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void r(CharSequence charSequence) {
        h hVar = (h) this.f1818e;
        hVar.f2163g = true;
        Toolbar toolbar = hVar.f2157a;
        hVar.f2164h = charSequence;
        if ((hVar.f2158b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (hVar.f2163g) {
                ViewCompat.d0(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void s(CharSequence charSequence) {
        h hVar = (h) this.f1818e;
        if (hVar.f2163g) {
            return;
        }
        Toolbar toolbar = hVar.f2157a;
        hVar.f2164h = charSequence;
        if ((hVar.f2158b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (hVar.f2163g) {
                ViewCompat.d0(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final ActionMode t(p pVar) {
        g0 g0Var = this.f1822i;
        if (g0Var != null) {
            g0Var.a();
        }
        this.f1816c.setHideOnContentScrollEnabled(false);
        this.f1819f.e();
        g0 g0Var2 = new g0(this, this.f1819f.getContext(), pVar);
        l lVar = g0Var2.f25569d;
        lVar.y();
        try {
            if (!g0Var2.f25570e.f25579a.b(g0Var2, lVar)) {
                return null;
            }
            this.f1822i = g0Var2;
            g0Var2.g();
            this.f1819f.c(g0Var2);
            u(true);
            return g0Var2;
        } finally {
            lVar.x();
        }
    }

    public final void u(boolean z11) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatF;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatI;
        boolean z12 = this.f1830r;
        if (z11) {
            if (!z12) {
                this.f1830r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1816c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                x(false);
            }
        } else if (z12) {
            this.f1830r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1816c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            x(false);
        }
        boolean zIsLaidOut = this.f1817d.isLaidOut();
        b1 b1Var = this.f1818e;
        if (!zIsLaidOut) {
            if (z11) {
                ((h) b1Var).f2157a.setVisibility(4);
                this.f1819f.setVisibility(0);
                return;
            } else {
                ((h) b1Var).f2157a.setVisibility(0);
                this.f1819f.setVisibility(8);
                return;
            }
        }
        if (z11) {
            h hVar = (h) b1Var;
            viewPropertyAnimatorCompatI = ViewCompat.c(hVar.f2157a).a(0.0f).d(100L).f(new j(hVar, 4));
            viewPropertyAnimatorCompatF = this.f1819f.i(0, 200L);
        } else {
            h hVar2 = (h) b1Var;
            viewPropertyAnimatorCompatF = ViewCompat.c(hVar2.f2157a).a(1.0f).d(200L).f(new j(hVar2, 0));
            viewPropertyAnimatorCompatI = this.f1819f.i(8, 100L);
        }
        k kVar = new k();
        ArrayList arrayList = kVar.f1897a;
        arrayList.add(viewPropertyAnimatorCompatI);
        viewPropertyAnimatorCompatF.g(viewPropertyAnimatorCompatI.c());
        arrayList.add(viewPropertyAnimatorCompatF);
        kVar.b();
    }

    public final void v(View view) {
        b1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.app.tgtg.R.id.decor_content_parent);
        this.f1816c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.app.tgtg.R.id.action_bar);
        if (callbackFindViewById instanceof b1) {
            wrapper = (b1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : Address.ADDRESS_NULL_PLACEHOLDER));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f1818e = wrapper;
        this.f1819f = (ActionBarContextView) view.findViewById(com.app.tgtg.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.app.tgtg.R.id.action_bar_container);
        this.f1817d = actionBarContainer;
        b1 b1Var = this.f1818e;
        if (b1Var == null || this.f1819f == null || actionBarContainer == null) {
            h2.b(c.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((h) b1Var).f2157a.getContext();
        this.f1814a = context;
        if ((((h) this.f1818e).f2158b & 4) != 0) {
            this.f1821h = true;
        }
        Context context2 = androidx.appcompat.view.a.a(context).f1840a;
        int i11 = context2.getApplicationInfo().targetSdkVersion;
        this.f1818e.getClass();
        w(context2.getResources().getBoolean(com.app.tgtg.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f1814a.obtainStyledAttributes(null, j.a.f24253a, com.app.tgtg.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1816c;
            if (!actionBarOverlayLayout2.f1967g) {
                h2.b("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.f1834v = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ViewCompat.h0(this.f1817d, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void w(boolean z11) {
        if (z11) {
            this.f1817d.setTabContainer(null);
            ((h) this.f1818e).getClass();
        } else {
            ((h) this.f1818e).getClass();
            this.f1817d.setTabContainer(null);
        }
        this.f1818e.getClass();
        ((h) this.f1818e).f2157a.setCollapsible(false);
        this.f1816c.setHasNonEmbeddedTabs(false);
    }

    public final void x(boolean z11) {
        boolean z12 = this.f1830r || !(this.f1828p || this.f1829q);
        boolean z13 = this.f1831s;
        i iVar = this.f1837y;
        View view = this.f1820g;
        if (!z12) {
            if (z13) {
                this.f1831s = false;
                k kVar = this.f1832t;
                if (kVar != null) {
                    kVar.a();
                }
                int i11 = this.f1826n;
                f0 f0Var = this.f1835w;
                if (i11 != 0 || (!this.f1833u && !z11)) {
                    f0Var.c();
                    return;
                }
                this.f1817d.setAlpha(1.0f);
                this.f1817d.setTransitioning(true);
                k kVar2 = new k();
                float f11 = -this.f1817d.getHeight();
                if (z11) {
                    this.f1817d.getLocationInWindow(new int[]{0, 0});
                    f11 -= r11[1];
                }
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatJ = ViewCompat.c(this.f1817d).j(f11);
                viewPropertyAnimatorCompatJ.h(iVar);
                boolean z14 = kVar2.f1901e;
                ArrayList arrayList = kVar2.f1897a;
                if (!z14) {
                    arrayList.add(viewPropertyAnimatorCompatJ);
                }
                if (this.f1827o && view != null) {
                    ViewPropertyAnimatorCompat viewPropertyAnimatorCompatJ2 = ViewCompat.c(view).j(f11);
                    if (!kVar2.f1901e) {
                        arrayList.add(viewPropertyAnimatorCompatJ2);
                    }
                }
                boolean z15 = kVar2.f1901e;
                if (!z15) {
                    kVar2.f1899c = f1813z;
                }
                if (!z15) {
                    kVar2.f1898b = 250L;
                }
                if (!z15) {
                    kVar2.f1900d = f0Var;
                }
                this.f1832t = kVar2;
                kVar2.b();
                return;
            }
            return;
        }
        if (z13) {
            return;
        }
        this.f1831s = true;
        k kVar3 = this.f1832t;
        if (kVar3 != null) {
            kVar3.a();
        }
        this.f1817d.setVisibility(0);
        int i12 = this.f1826n;
        f0 f0Var2 = this.f1836x;
        if (i12 == 0 && (this.f1833u || z11)) {
            this.f1817d.setTranslationY(0.0f);
            float f12 = -this.f1817d.getHeight();
            if (z11) {
                this.f1817d.getLocationInWindow(new int[]{0, 0});
                f12 -= r11[1];
            }
            this.f1817d.setTranslationY(f12);
            k kVar4 = new k();
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatJ3 = ViewCompat.c(this.f1817d).j(0.0f);
            viewPropertyAnimatorCompatJ3.h(iVar);
            boolean z16 = kVar4.f1901e;
            ArrayList arrayList2 = kVar4.f1897a;
            if (!z16) {
                arrayList2.add(viewPropertyAnimatorCompatJ3);
            }
            if (this.f1827o && view != null) {
                view.setTranslationY(f12);
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatJ4 = ViewCompat.c(view).j(0.0f);
                if (!kVar4.f1901e) {
                    arrayList2.add(viewPropertyAnimatorCompatJ4);
                }
            }
            boolean z17 = kVar4.f1901e;
            if (!z17) {
                kVar4.f1899c = A;
            }
            if (!z17) {
                kVar4.f1898b = 250L;
            }
            if (!z17) {
                kVar4.f1900d = f0Var2;
            }
            this.f1832t = kVar4;
            kVar4.b();
        } else {
            this.f1817d.setAlpha(1.0f);
            this.f1817d.setTranslationY(0.0f);
            if (this.f1827o && view != null) {
                view.setTranslationY(0.0f);
            }
            f0Var2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1816c;
        if (actionBarOverlayLayout != null) {
            ViewCompat.Z(actionBarOverlayLayout);
        }
    }

    public c(Dialog dialog) {
        new ArrayList();
        this.f1825m = new ArrayList();
        this.f1826n = 0;
        this.f1827o = true;
        this.f1831s = true;
        this.f1835w = new f0(this, 0);
        this.f1836x = new f0(this, 1);
        this.f1837y = new i(this, 27);
        v(dialog.getWindow().getDecorView());
    }
}

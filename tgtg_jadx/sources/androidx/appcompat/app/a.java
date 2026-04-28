package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.e;
import androidx.core.os.LocaleListCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import com.app.tgtg.model.local.AppConstants;
import com.braze.h2;
import h7.o;
import j30.g;
import j4.s;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import jd.f;
import k.a0;
import k.b0;
import k.h;
import k.i;
import k.n;
import k.r;
import k.t;
import k.u;
import k.v;
import k.w;
import o.j;
import o.l;
import org.bouncycastle.asn1.BERTags;
import p.a1;
import p.c2;
import p.d;
import p.d3;
import p.g3;
import p.m;
import p.y;
import p.y0;
import q1.k1;
import q1.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends AppCompatDelegate implements j, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final k1 f1777n1 = new k1(0);

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final int[] f1778o1 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final boolean f1779p1 = !"robolectric".equals(Build.FINGERPRINT);
    public ViewGroup A;
    public TextView B;
    public View C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public w[] L;
    public w M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Configuration T;
    public final int V;
    public int W;
    public int X;
    public boolean Y;
    public u Z;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f1780f1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public u f1782h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f1783h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public Rect f1784i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f1785j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public Rect f1786j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f1787k;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public b0 f1788k1;
    public Window l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public OnBackInvokedDispatcher f1789l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t f1790m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public OnBackInvokedCallback f1791m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f1792n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ActionBar f1793o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.appcompat.view.i f1794p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f1795q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a1 f1796r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f1797s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public lz.i f1798t;
    public boolean t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ActionMode f1799u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ActionBarContextView f1800v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PopupWindow f1801w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n f1802x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1804z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ViewPropertyAnimatorCompat f1803y = null;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final a8.f f1781g1 = new a8.f(this, 6);

    public a(Context context, Window window, i iVar, Object obj) {
        h hVar = null;
        this.V = -100;
        this.f1787k = context;
        this.f1792n = iVar;
        this.f1785j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof h)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        hVar = (h) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (hVar != null) {
                this.V = hVar.getDelegate().l();
            }
        }
        if (this.V == -100) {
            String name = this.f1785j.getClass().getName();
            k1 k1Var = f1777n1;
            Integer num = (Integer) k1Var.get(name);
            if (num != null) {
                this.V = num.intValue();
                k1Var.remove(this.f1785j.getClass().getName());
            }
        }
        if (window != null) {
            M(window);
        }
        m.d();
    }

    public static LocaleListCompat N(Context context) {
        LocaleListCompat localeListCompat;
        LocaleListCompat localeListCompatA;
        if (Build.VERSION.SDK_INT >= 33 || (localeListCompat = AppCompatDelegate.f1770c) == null) {
            return null;
        }
        LocaleListCompat localeListCompatB = r.b(context.getApplicationContext().getResources().getConfiguration());
        if (localeListCompat.e()) {
            localeListCompatA = LocaleListCompat.d();
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i11 = 0;
            while (i11 < localeListCompatB.f() + localeListCompat.f()) {
                Locale localeC = i11 < localeListCompat.f() ? localeListCompat.c(i11) : localeListCompatB.c(i11 - localeListCompat.f());
                if (localeC != null) {
                    linkedHashSet.add(localeC);
                }
                i11++;
            }
            localeListCompatA = LocaleListCompat.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return localeListCompatA.e() ? localeListCompatB : localeListCompatA;
    }

    public static Configuration R(Context context, int i11, LocaleListCompat localeListCompat, Configuration configuration, boolean z11) {
        int i12 = i11 != 1 ? i11 != 2 ? z11 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i12 | (configuration2.uiMode & (-49));
        if (localeListCompat != null) {
            r.d(configuration2, localeListCompat);
        }
        return configuration2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final boolean B(int i11) {
        if (i11 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i11 = 108;
        } else if (i11 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i11 = 109;
        }
        if (this.J && i11 == 108) {
            return false;
        }
        if (this.F && i11 == 1) {
            this.F = false;
        }
        if (i11 == 1) {
            e0();
            this.J = true;
            return true;
        }
        if (i11 == 2) {
            e0();
            this.D = true;
            return true;
        }
        if (i11 == 5) {
            e0();
            this.E = true;
            return true;
        }
        if (i11 == 10) {
            e0();
            this.H = true;
            return true;
        }
        if (i11 == 108) {
            e0();
            this.F = true;
            return true;
        }
        if (i11 != 109) {
            return this.l.requestFeature(i11);
        }
        e0();
        this.G = true;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void D(int i11) {
        U();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1787k).inflate(i11, viewGroup);
        this.f1790m.b(this.l.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void E(View view) {
        U();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1790m.b(this.l.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void F(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1790m.b(this.l.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(android.window.OnBackInvokedDispatcher r3) {
        /*
            r2 = this;
            super.G(r3)
            android.window.OnBackInvokedDispatcher r0 = r2.f1789l1
            if (r0 == 0) goto L11
            android.window.OnBackInvokedCallback r1 = r2.f1791m1
            if (r1 == 0) goto L11
            k.s.c(r0, r1)
            r0 = 0
            r2.f1791m1 = r0
        L11:
            if (r3 != 0) goto L2b
            java.lang.Object r0 = r2.f1785j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L2b
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L2b
            android.app.Activity r0 = (android.app.Activity) r0
            android.window.OnBackInvokedDispatcher r3 = k.s.a(r0)
            r2.f1789l1 = r3
            goto L2d
        L2b:
            r2.f1789l1 = r3
        L2d:
            r2.f0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.a.G(android.window.OnBackInvokedDispatcher):void");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void H(Toolbar toolbar) {
        Object obj = this.f1785j;
        if (obj instanceof Activity) {
            Y();
            ActionBar actionBar = this.f1793o;
            if (actionBar instanceof c) {
                h2.b("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            this.f1794p = null;
            if (actionBar != null) {
                actionBar.i();
            }
            this.f1793o = null;
            if (toolbar != null) {
                b bVar = new b(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1795q, this.f1790m);
                this.f1793o = bVar;
                this.f1790m.f25581a = bVar.f1807c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f1790m.f25581a = null;
            }
            p();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void I(int i11) {
        this.W = i11;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void J(CharSequence charSequence) {
        this.f1795q = charSequence;
        a1 a1Var = this.f1796r;
        if (a1Var != null) {
            a1Var.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.f1793o;
        if (actionBar != null) {
            actionBar.s(charSequence);
            return;
        }
        TextView textView = this.B;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.appcompat.view.ActionMode K(androidx.appcompat.view.ActionMode.Callback r9) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.a.K(androidx.appcompat.view.ActionMode$Callback):androidx.appcompat.view.ActionMode");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean L(boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.a.L(boolean, boolean):boolean");
    }

    public final void M(Window window) {
        if (this.l != null) {
            h2.b("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof t) {
            h2.b("AppCompat has already installed itself into the Window");
            return;
        }
        t tVar = new t(this, callback);
        this.f1790m = tVar;
        window.setCallback(tVar);
        g gVarS = g.s(this.f1787k, null, f1778o1);
        Drawable drawableL = gVarS.l(0);
        if (drawableL != null) {
            window.setBackgroundDrawable(drawableL);
        }
        gVarS.v();
        this.l = window;
        if (Build.VERSION.SDK_INT < 33 || this.f1789l1 != null) {
            return;
        }
        G(null);
    }

    public final void O(int i11, w wVar, l lVar) {
        if (lVar == null) {
            if (wVar == null && i11 >= 0) {
                w[] wVarArr = this.L;
                if (i11 < wVarArr.length) {
                    wVar = wVarArr[i11];
                }
            }
            if (wVar != null) {
                lVar = wVar.f25597h;
            }
        }
        if ((wVar == null || wVar.f25601m) && !this.Q) {
            t tVar = this.f1790m;
            Window.Callback callback = this.l.getCallback();
            tVar.getClass();
            try {
                tVar.f25584d = true;
                callback.onPanelClosed(i11, lVar);
            } finally {
                tVar.f25584d = false;
            }
        }
    }

    public final void P(l lVar) {
        androidx.appcompat.widget.a aVar;
        if (this.K) {
            return;
        }
        this.K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1796r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((androidx.appcompat.widget.h) actionBarOverlayLayout.f1965e).f2157a.f2098a;
        if (actionMenuView != null && (aVar = actionMenuView.f1990t) != null) {
            aVar.g();
            d dVar = aVar.f2138u;
            if (dVar != null && dVar.b()) {
                dVar.f31614i.dismiss();
            }
        }
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.Q) {
            callback.onPanelClosed(108, lVar);
        }
        this.K = false;
    }

    public final void Q(w wVar, boolean z11) {
        v vVar;
        a1 a1Var;
        if (z11 && wVar.f25590a == 0 && (a1Var = this.f1796r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) a1Var;
            actionBarOverlayLayout.k();
            if (((androidx.appcompat.widget.h) actionBarOverlayLayout.f1965e).f2157a.p()) {
                P(wVar.f25597h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f1787k.getSystemService("window");
        if (windowManager != null && wVar.f25601m && (vVar = wVar.f25594e) != null) {
            windowManager.removeView(vVar);
            if (z11) {
                O(wVar.f25590a, wVar, null);
            }
        }
        wVar.f25600k = false;
        wVar.l = false;
        wVar.f25601m = false;
        wVar.f25595f = null;
        wVar.f25602n = true;
        if (this.M == wVar) {
            this.M = null;
        }
        if (wVar.f25590a == 0) {
            f0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean S(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.a.S(android.view.KeyEvent):boolean");
    }

    public final void T(int i11) {
        w wVarX = X(i11);
        if (wVarX.f25597h != null) {
            Bundle bundle = new Bundle();
            wVarX.f25597h.u(bundle);
            if (bundle.size() > 0) {
                wVarX.f25604p = bundle;
            }
            wVarX.f25597h.y();
            wVarX.f25597h.clear();
        }
        wVarX.f25603o = true;
        wVarX.f25602n = true;
        if ((i11 == 108 || i11 == 0) && this.f1796r != null) {
            w wVarX2 = X(0);
            wVarX2.f25600k = false;
            d0(wVarX2, null);
        }
    }

    public final void U() {
        ViewGroup viewGroup;
        if (this.f1804z) {
            return;
        }
        Context context = this.f1787k;
        int[] iArr = j.a.f24262j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            h2.b("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            B(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            B(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            B(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            B(10);
        }
        this.I = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        V();
        this.l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.J) {
            viewGroup = this.H ? (ViewGroup) layoutInflaterFrom.inflate(com.app.tgtg.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.app.tgtg.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.I) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.app.tgtg.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.G = false;
            this.F = false;
        } else if (this.F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.app.tgtg.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.c(context, typedValue.resourceId) : context).inflate(com.app.tgtg.R.layout.abc_screen_toolbar, (ViewGroup) null);
            a1 a1Var = (a1) viewGroup.findViewById(com.app.tgtg.R.id.decor_content_parent);
            this.f1796r = a1Var;
            a1Var.setWindowCallback(this.l.getCallback());
            if (this.G) {
                ((ActionBarOverlayLayout) this.f1796r).j(109);
            }
            if (this.D) {
                ((ActionBarOverlayLayout) this.f1796r).j(2);
            }
            if (this.E) {
                ((ActionBarOverlayLayout) this.f1796r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb2 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb2.append(this.F);
            sb2.append(", windowActionBarOverlay: ");
            sb2.append(this.G);
            sb2.append(", android:windowIsFloating: ");
            sb2.append(this.I);
            sb2.append(", windowActionModeOverlay: ");
            sb2.append(this.H);
            sb2.append(", windowNoTitle: ");
            i4.a.f(s.o(sb2, this.J, " }"));
            return;
        }
        ViewCompat.k0(viewGroup, new jb.b(this));
        if (this.f1796r == null) {
            this.B = (TextView) viewGroup.findViewById(com.app.tgtg.R.id.title);
        }
        boolean z11 = g3.f33904a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e5) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e5);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e11) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.app.tgtg.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new se.d(this, 22));
        this.A = viewGroup;
        Object obj = this.f1785j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1795q;
        if (!TextUtils.isEmpty(title)) {
            a1 a1Var2 = this.f1796r;
            if (a1Var2 != null) {
                a1Var2.setWindowTitle(title);
            } else {
                ActionBar actionBar = this.f1793o;
                if (actionBar != null) {
                    actionBar.s(title);
                } else {
                    TextView textView = this.B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.A.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout2.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(AppConstants.RESULT_CODE_ORDER_CANCELLED)) {
            typedArrayObtainStyledAttributes2.getValue(AppConstants.RESULT_CODE_ORDER_CANCELLED, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f1804z = true;
        w wVarX = X(0);
        if (this.Q || wVarX.f25597h != null) {
            return;
        }
        this.f1780f1 |= 4096;
        if (this.t0) {
            return;
        }
        ViewCompat.U(this.l.getDecorView(), this.f1781g1);
        this.t0 = true;
    }

    public final void V() {
        if (this.l == null) {
            Object obj = this.f1785j;
            if (obj instanceof Activity) {
                M(((Activity) obj).getWindow());
            }
        }
        if (this.l != null) {
            return;
        }
        h2.b("We have not been given a Window");
    }

    public final c5.b W(Context context) {
        if (this.Z == null) {
            if (g.f24500e == null) {
                Context applicationContext = context.getApplicationContext();
                g.f24500e = new g(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.Z = new u(this, g.f24500e);
        }
        return this.Z;
    }

    public final w X(int i11) {
        w[] wVarArr = this.L;
        if (wVarArr == null || wVarArr.length <= i11) {
            w[] wVarArr2 = new w[i11 + 1];
            if (wVarArr != null) {
                System.arraycopy(wVarArr, 0, wVarArr2, 0, wVarArr.length);
            }
            this.L = wVarArr2;
            wVarArr = wVarArr2;
        }
        w wVar = wVarArr[i11];
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w();
        wVar2.f25590a = i11;
        wVar2.f25602n = false;
        wVarArr[i11] = wVar2;
        return wVar2;
    }

    public final void Y() {
        U();
        if (this.F && this.f1793o == null) {
            Object obj = this.f1785j;
            if (obj instanceof Activity) {
                this.f1793o = new c((Activity) obj, this.G);
            } else if (obj instanceof Dialog) {
                this.f1793o = new c((Dialog) obj);
            }
            ActionBar actionBar = this.f1793o;
            if (actionBar != null) {
                actionBar.m(this.f1783h1);
            }
        }
    }

    public final int Z(Context context, int i11) {
        if (i11 != -100) {
            if (i11 != -1) {
                if (i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        if (i11 != 3) {
                            h2.b("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.f1782h0 == null) {
                            this.f1782h0 = new u(this, context);
                        }
                        return this.f1782h0.h();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return W(context).h();
                }
            }
            return i11;
        }
        return -1;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        ((ViewGroup) this.A.findViewById(R.id.content)).addView(view, layoutParams);
        this.f1790m.b(this.l.getCallback());
    }

    public final boolean a0() {
        boolean z11 = this.N;
        this.N = false;
        w wVarX = X(0);
        if (!wVarX.f25601m) {
            ActionMode actionMode = this.f1799u;
            if (actionMode != null) {
                actionMode.a();
                return true;
            }
            Y();
            ActionBar actionBar = this.f1793o;
            if (actionBar == null || !actionBar.b()) {
                return false;
            }
        } else if (!z11) {
            Q(wVarX, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0177, code lost:
    
        if (r2.f31536f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(k.w r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.a.b0(k.w, android.view.KeyEvent):void");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final Context c(Context context) {
        Configuration configuration;
        this.O = true;
        int i11 = this.V;
        if (i11 == -100) {
            i11 = AppCompatDelegate.i();
        }
        int iZ = Z(context, i11);
        int i12 = 0;
        if (AppCompatDelegate.r(context) && AppCompatDelegate.r(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AppCompatDelegate.f1776i) {
                    try {
                        LocaleListCompat localeListCompat = AppCompatDelegate.f1770c;
                        if (localeListCompat == null) {
                            if (AppCompatDelegate.f1771d == null) {
                                AppCompatDelegate.f1771d = LocaleListCompat.b(e.i(context));
                            }
                            if (!AppCompatDelegate.f1771d.e()) {
                                AppCompatDelegate.f1770c = AppCompatDelegate.f1771d;
                            }
                        } else if (!localeListCompat.equals(AppCompatDelegate.f1771d)) {
                            LocaleListCompat localeListCompat2 = AppCompatDelegate.f1770c;
                            AppCompatDelegate.f1771d = localeListCompat2;
                            e.h(context, localeListCompat2.g());
                        }
                    } finally {
                    }
                }
            } else if (!AppCompatDelegate.f1773f) {
                AppCompatDelegate.f1768a.execute(new k.j(context, i12));
            }
        }
        LocaleListCompat localeListCompatN = N(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(R(context, iZ, localeListCompatN, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.c) {
            try {
                ((androidx.appcompat.view.c) context).a(R(context, iZ, localeListCompatN, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f1779p1) {
            return super.c(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (configuration3.equals(configuration4)) {
            configuration = null;
        } else {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f11 = configuration3.fontScale;
                float f12 = configuration4.fontScale;
                if (f11 != f12) {
                    configuration.fontScale = f12;
                }
                int i13 = configuration3.mcc;
                int i14 = configuration4.mcc;
                if (i13 != i14) {
                    configuration.mcc = i14;
                }
                int i15 = configuration3.mnc;
                int i16 = configuration4.mnc;
                if (i15 != i16) {
                    configuration.mnc = i16;
                }
                r.a(configuration3, configuration4, configuration);
                int i17 = configuration3.touchscreen;
                int i18 = configuration4.touchscreen;
                if (i17 != i18) {
                    configuration.touchscreen = i18;
                }
                int i19 = configuration3.keyboard;
                int i21 = configuration4.keyboard;
                if (i19 != i21) {
                    configuration.keyboard = i21;
                }
                int i22 = configuration3.keyboardHidden;
                int i23 = configuration4.keyboardHidden;
                if (i22 != i23) {
                    configuration.keyboardHidden = i23;
                }
                int i24 = configuration3.navigation;
                int i25 = configuration4.navigation;
                if (i24 != i25) {
                    configuration.navigation = i25;
                }
                int i26 = configuration3.navigationHidden;
                int i27 = configuration4.navigationHidden;
                if (i26 != i27) {
                    configuration.navigationHidden = i27;
                }
                int i28 = configuration3.orientation;
                int i29 = configuration4.orientation;
                if (i28 != i29) {
                    configuration.orientation = i29;
                }
                int i31 = configuration3.screenLayout & 15;
                int i32 = configuration4.screenLayout & 15;
                if (i31 != i32) {
                    configuration.screenLayout |= i32;
                }
                int i33 = configuration3.screenLayout & BERTags.PRIVATE;
                int i34 = configuration4.screenLayout & BERTags.PRIVATE;
                if (i33 != i34) {
                    configuration.screenLayout |= i34;
                }
                int i35 = configuration3.screenLayout & 48;
                int i36 = configuration4.screenLayout & 48;
                if (i35 != i36) {
                    configuration.screenLayout |= i36;
                }
                int i37 = configuration3.screenLayout & 768;
                int i38 = configuration4.screenLayout & 768;
                if (i37 != i38) {
                    configuration.screenLayout |= i38;
                }
                int i39 = configuration3.colorMode & 3;
                int i41 = configuration4.colorMode & 3;
                if (i39 != i41) {
                    configuration.colorMode |= i41;
                }
                int i42 = configuration3.colorMode & 12;
                int i43 = configuration4.colorMode & 12;
                if (i42 != i43) {
                    configuration.colorMode |= i43;
                }
                int i44 = configuration3.uiMode & 15;
                int i45 = configuration4.uiMode & 15;
                if (i44 != i45) {
                    configuration.uiMode |= i45;
                }
                int i46 = configuration3.uiMode & 48;
                int i47 = configuration4.uiMode & 48;
                if (i46 != i47) {
                    configuration.uiMode |= i47;
                }
                int i48 = configuration3.screenWidthDp;
                int i49 = configuration4.screenWidthDp;
                if (i48 != i49) {
                    configuration.screenWidthDp = i49;
                }
                int i51 = configuration3.screenHeightDp;
                int i52 = configuration4.screenHeightDp;
                if (i51 != i52) {
                    configuration.screenHeightDp = i52;
                }
                int i53 = configuration3.smallestScreenWidthDp;
                int i54 = configuration4.smallestScreenWidthDp;
                if (i53 != i54) {
                    configuration.smallestScreenWidthDp = i54;
                }
                int i55 = configuration3.densityDpi;
                int i56 = configuration4.densityDpi;
                if (i55 != i56) {
                    configuration.densityDpi = i56;
                }
            }
        }
        Configuration configurationR = R(context, iZ, localeListCompatN, configuration, true);
        androidx.appcompat.view.c cVar = new androidx.appcompat.view.c(context, com.app.tgtg.R.style.Theme_AppCompat_Empty);
        cVar.a(configurationR);
        try {
            if (context.getTheme() != null) {
                Resources.Theme theme = cVar.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    w6.g.b(theme);
                } else {
                    synchronized (w6.a.f43236e) {
                        if (!w6.a.f43238g) {
                            try {
                                Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                w6.a.f43237f = declaredMethod;
                                declaredMethod.setAccessible(true);
                            } catch (NoSuchMethodException e5) {
                                Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e5);
                            }
                            w6.a.f43238g = true;
                        }
                        Method method = w6.a.f43237f;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException e11) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                                w6.a.f43237f = null;
                            }
                        }
                    }
                }
            }
        } catch (NullPointerException unused3) {
        }
        return super.c(cVar);
    }

    public final boolean c0(w wVar, int i11, KeyEvent keyEvent) {
        l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((wVar.f25600k || d0(wVar, keyEvent)) && (lVar = wVar.f25597h) != null) {
            return lVar.performShortcut(i11, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d0(k.w r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.a.d0(k.w, android.view.KeyEvent):boolean");
    }

    public final void e0() {
        if (this.f1804z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final View f(int i11) {
        U();
        return this.l.findViewById(i11);
    }

    public final void f0() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z11 = false;
            if (this.f1789l1 != null && (X(0).f25601m || this.f1799u != null)) {
                z11 = true;
            }
            if (z11 && this.f1791m1 == null) {
                this.f1791m1 = k.s.b(this.f1789l1, this);
            } else {
                if (z11 || (onBackInvokedCallback = this.f1791m1) == null) {
                    return;
                }
                k.s.c(this.f1789l1, onBackInvokedCallback);
                this.f1791m1 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final Context h() {
        return this.f1787k;
    }

    @Override // o.j
    public final boolean j(l lVar, MenuItem menuItem) {
        w wVar;
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.Q) {
            l lVarK = lVar.k();
            w[] wVarArr = this.L;
            int length = wVarArr != null ? wVarArr.length : 0;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    wVar = wVarArr[i11];
                    if (wVar != null && wVar.f25597h == lVarK) {
                        break;
                    }
                    i11++;
                } else {
                    wVar = null;
                    break;
                }
            }
            if (wVar != null) {
                return callback.onMenuItemSelected(wVar.f25590a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final k.a k() {
        return new r40.d();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final int l() {
        return this.V;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final MenuInflater m() {
        if (this.f1794p == null) {
            Y();
            ActionBar actionBar = this.f1793o;
            this.f1794p = new androidx.appcompat.view.i(actionBar != null ? actionBar.e() : this.f1787k);
        }
        return this.f1794p;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBar n() {
        Y();
        return this.f1793o;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void o() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1787k);
        if (layoutInflaterFrom.getFactory() == null) {
            o.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof a) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        b0 b0Var;
        Context cVar;
        View wVar;
        View view2 = null;
        if (this.f1788k1 == null) {
            int[] iArr = j.a.f24262j;
            Context context2 = this.f1787k;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f1788k1 = new b0();
            } else {
                try {
                    this.f1788k1 = (b0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f1788k1 = new b0();
                }
            }
        }
        b0Var = this.f1788k1;
        int i11 = d3.f33877a;
        b0Var.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, j.a.A, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        cVar = (resourceId == 0 || ((context instanceof androidx.appcompat.view.c) && ((androidx.appcompat.view.c) context).f1842a == resourceId)) ? context : new androidx.appcompat.view.c(context, resourceId);
        str.getClass();
        switch (str) {
            case "RatingBar":
                wVar = new p.w(cVar, attributeSet);
                break;
            case "CheckedTextView":
                wVar = new p.l(cVar, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                wVar = new p.s(cVar, attributeSet);
                break;
            case "TextView":
                wVar = b0Var.e(cVar, attributeSet);
                break;
            case "ImageButton":
                wVar = new AppCompatImageButton(cVar, attributeSet);
                break;
            case "SeekBar":
                wVar = new y(cVar, attributeSet);
                break;
            case "Spinner":
                wVar = new AppCompatSpinner(cVar, attributeSet);
                break;
            case "RadioButton":
                wVar = b0Var.d(cVar, attributeSet);
                break;
            case "ToggleButton":
                wVar = new y0(cVar, attributeSet);
                break;
            case "ImageView":
                wVar = new AppCompatImageView(cVar, attributeSet);
                break;
            case "AutoCompleteTextView":
                wVar = b0Var.a(cVar, attributeSet);
                break;
            case "CheckBox":
                wVar = b0Var.c(cVar, attributeSet);
                break;
            case "EditText":
                wVar = new p.o(cVar, attributeSet);
                break;
            case "Button":
                wVar = b0Var.b(cVar, attributeSet);
                break;
            default:
                wVar = null;
                break;
        }
        if (wVar == null && context != cVar) {
            Object[] objArr = b0Var.f25517a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = cVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i12 = 0;
                    while (true) {
                        String[] strArr = b0.f25515g;
                        if (i12 < 3) {
                            View viewF = b0Var.f(cVar, str, strArr[i12]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i12++;
                            }
                        }
                    }
                } else {
                    View viewF2 = b0Var.f(cVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            wVar = view2;
        }
        if (wVar != null) {
            Context context3 = wVar.getContext();
            if ((context3 instanceof ContextWrapper) && wVar.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, b0.f25511c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    wVar.setOnClickListener(new a0(wVar, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = cVar.obtainStyledAttributes(attributeSet, b0.f25512d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    ViewCompat.c0(wVar, typedArrayObtainStyledAttributes4.getBoolean(0, false));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = cVar.obtainStyledAttributes(attributeSet, b0.f25513e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    ViewCompat.d0(wVar, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = cVar.obtainStyledAttributes(attributeSet, b0.f25514f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    ViewCompat.m0(wVar, typedArrayObtainStyledAttributes6.getBoolean(0, false));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return wVar;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void p() {
        if (this.f1793o != null) {
            Y();
            if (this.f1793o.g()) {
                return;
            }
            this.f1780f1 |= 1;
            if (this.t0) {
                return;
            }
            ViewCompat.U(this.l.getDecorView(), this.f1781g1);
            this.t0 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.m() != false) goto L20;
     */
    @Override // o.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(o.l r6) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.a.q(o.l):void");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void s(Configuration configuration) {
        if (this.F && this.f1804z) {
            Y();
            ActionBar actionBar = this.f1793o;
            if (actionBar != null) {
                actionBar.h();
            }
        }
        m mVarA = m.a();
        Context context = this.f1787k;
        synchronized (mVarA) {
            c2 c2Var = mVarA.f33947a;
            synchronized (c2Var) {
                z zVar = (z) c2Var.f33870b.get(context);
                if (zVar != null) {
                    zVar.a();
                }
            }
        }
        this.T = new Configuration(this.f1787k.getResources().getConfiguration());
        L(false, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void t(Bundle bundle) {
        String strF;
        this.O = true;
        L(false, true);
        V();
        Object obj = this.f1785j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strF = e.f(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e5) {
                    throw new IllegalArgumentException(e5);
                }
            } catch (IllegalArgumentException unused) {
                strF = null;
            }
            if (strF != null) {
                ActionBar actionBar = this.f1793o;
                if (actionBar == null) {
                    this.f1783h1 = true;
                } else {
                    actionBar.m(true);
                }
            }
            synchronized (AppCompatDelegate.f1775h) {
                AppCompatDelegate.A(this);
                AppCompatDelegate.f1774g.add(new WeakReference(this));
            }
        }
        this.T = new Configuration(this.f1787k.getResources().getConfiguration());
        this.P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1785j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.f1775h
            monitor-enter(r0)
            androidx.appcompat.app.AppCompatDelegate.A(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.t0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.l
            android.view.View r0 = r0.getDecorView()
            a8.f r1 = r3.f1781g1
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.Q = r0
            int r0 = r3.V
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f1785j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            q1.k1 r0 = androidx.appcompat.app.a.f1777n1
            java.lang.Object r1 = r3.f1785j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.V
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            q1.k1 r0 = androidx.appcompat.app.a.f1777n1
            java.lang.Object r1 = r3.f1785j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            androidx.appcompat.app.ActionBar r0 = r3.f1793o
            if (r0 == 0) goto L63
            r0.i()
        L63:
            k.u r0 = r3.Z
            if (r0 == 0) goto L6a
            r0.e()
        L6a:
            k.u r0 = r3.f1782h0
            if (r0 == 0) goto L71
            r0.e()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.a.u():void");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void v(Bundle bundle) {
        U();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void w() {
        Y();
        ActionBar actionBar = this.f1793o;
        if (actionBar != null) {
            actionBar.q(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void y() {
        L(true, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void z() {
        Y();
        ActionBar actionBar = this.f1793o;
        if (actionBar != null) {
            actionBar.q(false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void x(Bundle bundle) {
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

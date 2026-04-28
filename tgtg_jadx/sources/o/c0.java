package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import c5.o3;
import com.app.tgtg.R;
import com.braze.h2;
import p.a2;
import p.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f31474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f31475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f31476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f31477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f31479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2 f31480h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f31483k;
    public View l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f31484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public w f31485n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f31486o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f31487p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f31488q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f31489r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f31491t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h20.u f31481i = new h20.u(this, 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o3 f31482j = new o3(this, 6);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f31490s = 0;

    public c0(Context context, l lVar, View view, int i11, boolean z11) {
        this.f31474b = context;
        this.f31475c = lVar;
        this.f31477e = z11;
        this.f31476d = new i(lVar, LayoutInflater.from(context), z11, R.layout.abc_popup_menu_item_layout);
        this.f31479g = i11;
        Resources resources = context.getResources();
        this.f31478f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.l = view;
        this.f31480h = new a2(context, null, i11, 0);
        lVar.b(this, context);
    }

    @Override // o.b0
    public final boolean a() {
        return !this.f31487p && this.f31480h.f34064z.isShowing();
    }

    @Override // o.x
    public final void b(boolean z11) {
        this.f31488q = false;
        i iVar = this.f31476d;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // o.x
    public final boolean d() {
        return false;
    }

    @Override // o.b0
    public final void dismiss() {
        if (a()) {
            this.f31480h.dismiss();
        }
    }

    @Override // o.x
    public final boolean e(d0 d0Var) {
        boolean z11;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.f31474b, d0Var, this.f31484m, this.f31477e, this.f31479g, 0);
            w wVar = this.f31485n;
            vVar.f31613h = wVar;
            t tVar = vVar.f31614i;
            if (tVar != null) {
                tVar.j(wVar);
            }
            int size = d0Var.f31549f.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z11 = false;
                    break;
                }
                MenuItem item = d0Var.getItem(i11);
                if (item.isVisible() && item.getIcon() != null) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            vVar.f31612g = z11;
            t tVar2 = vVar.f31614i;
            if (tVar2 != null) {
                tVar2.p(z11);
            }
            vVar.f31615j = this.f31483k;
            this.f31483k = null;
            this.f31475c.c(false);
            a2 a2Var = this.f31480h;
            int width = a2Var.f34045f;
            int iN = a2Var.n();
            if ((Gravity.getAbsoluteGravity(this.f31490s, this.l.getLayoutDirection()) & 7) == 5) {
                width += this.l.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f31610e != null) {
                    vVar.d(width, iN, true, true);
                }
            }
            w wVar2 = this.f31485n;
            if (wVar2 != null) {
                wVar2.v(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override // o.b0
    public final k1 g() {
        return this.f31480h.f34042c;
    }

    @Override // o.x
    public final void h(l lVar, boolean z11) {
        if (lVar != this.f31475c) {
            return;
        }
        dismiss();
        w wVar = this.f31485n;
        if (wVar != null) {
            wVar.h(lVar, z11);
        }
    }

    @Override // o.x
    public final void j(w wVar) {
        this.f31485n = wVar;
    }

    @Override // o.x
    public final Parcelable k() {
        return null;
    }

    @Override // o.t
    public final void o(View view) {
        this.l = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f31487p = true;
        this.f31475c.c(true);
        ViewTreeObserver viewTreeObserver = this.f31486o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f31486o = this.f31484m.getViewTreeObserver();
            }
            this.f31486o.removeGlobalOnLayoutListener(this.f31481i);
            this.f31486o = null;
        }
        this.f31484m.removeOnAttachStateChangeListener(this.f31482j);
        PopupWindow.OnDismissListener onDismissListener = this.f31483k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i11 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // o.t
    public final void p(boolean z11) {
        this.f31476d.f31539c = z11;
    }

    @Override // o.t
    public final void q(int i11) {
        this.f31490s = i11;
    }

    @Override // o.t
    public final void r(int i11) {
        this.f31480h.f34045f = i11;
    }

    @Override // o.t
    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.f31483k = onDismissListener;
    }

    @Override // o.b0
    public final void show() {
        View view;
        if (a()) {
            return;
        }
        if (this.f31487p || (view = this.l) == null) {
            h2.b("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.f31484m = view;
        a2 a2Var = this.f31480h;
        p.t tVar = a2Var.f34064z;
        p.t tVar2 = a2Var.f34064z;
        tVar.setOnDismissListener(this);
        a2Var.f34054p = this;
        a2Var.f34063y = true;
        tVar2.setFocusable(true);
        View view2 = this.f31484m;
        boolean z11 = this.f31486o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f31486o = viewTreeObserver;
        if (z11) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f31481i);
        }
        view2.addOnAttachStateChangeListener(this.f31482j);
        a2Var.f34053o = view2;
        a2Var.l = this.f31490s;
        boolean z12 = this.f31488q;
        Context context = this.f31474b;
        i iVar = this.f31476d;
        if (!z12) {
            this.f31489r = t.n(iVar, context, this.f31478f);
            this.f31488q = true;
        }
        a2Var.q(this.f31489r);
        tVar2.setInputMethodMode(2);
        Rect rect = this.f31604a;
        a2Var.f34062x = rect != null ? new Rect(rect) : null;
        a2Var.show();
        k1 k1Var = a2Var.f34042c;
        k1Var.setOnKeyListener(this);
        if (this.f31491t) {
            l lVar = this.f31475c;
            if (lVar.f31555m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) k1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(lVar.f31555m);
                }
                frameLayout.setEnabled(false);
                k1Var.addHeaderView(frameLayout, null, false);
            }
        }
        a2Var.o(iVar);
        a2Var.show();
    }

    @Override // o.t
    public final void t(boolean z11) {
        this.f31491t = z11;
    }

    @Override // o.t
    public final void u(int i11) {
        this.f31480h.k(i11);
    }

    @Override // o.x
    public final void f(Parcelable parcelable) {
    }

    @Override // o.t
    public final void m(l lVar) {
    }
}

package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import c5.o3;
import com.app.tgtg.R;
import java.util.ArrayList;
import java.util.Iterator;
import p.a2;
import p.k1;
import p.x1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f31505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f31508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f31509f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f31516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f31517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f31519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f31520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f31521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f31522t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f31524v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public w f31525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f31526x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PopupWindow.OnDismissListener f31527y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f31528z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f31510g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f31511h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h20.u f31512i = new h20.u(this, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o3 f31513j = new o3(this, 5);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final jb.b f31514k = new jb.b(this);
    public int l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f31515m = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f31523u = false;

    public f(Context context, View view, int i11, boolean z11) {
        this.f31505b = context;
        this.f31516n = view;
        this.f31507d = i11;
        this.f31508e = z11;
        this.f31518p = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f31506c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f31509f = new Handler();
    }

    @Override // o.b0
    public final boolean a() {
        ArrayList arrayList = this.f31511h;
        return arrayList.size() > 0 && ((e) arrayList.get(0)).f31502a.f34064z.isShowing();
    }

    @Override // o.x
    public final void b(boolean z11) {
        Iterator it = this.f31511h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((e) it.next()).f31502a.f34042c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((i) adapter).notifyDataSetChanged();
        }
    }

    @Override // o.x
    public final boolean d() {
        return false;
    }

    @Override // o.b0
    public final void dismiss() {
        ArrayList arrayList = this.f31511h;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i11 = size - 1; i11 >= 0; i11--) {
                e eVar = eVarArr[i11];
                if (eVar.f31502a.f34064z.isShowing()) {
                    eVar.f31502a.dismiss();
                }
            }
        }
    }

    @Override // o.x
    public final boolean e(d0 d0Var) {
        for (e eVar : this.f31511h) {
            if (d0Var == eVar.f31503b) {
                eVar.f31502a.f34042c.requestFocus();
                return true;
            }
        }
        if (!d0Var.hasVisibleItems()) {
            return false;
        }
        m(d0Var);
        w wVar = this.f31525w;
        if (wVar != null) {
            wVar.v(d0Var);
        }
        return true;
    }

    @Override // o.b0
    public final k1 g() {
        ArrayList arrayList = this.f31511h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) j4.s.d(1, arrayList)).f31502a.f34042c;
    }

    @Override // o.x
    public final void h(l lVar, boolean z11) {
        ArrayList arrayList = this.f31511h;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (lVar == ((e) arrayList.get(i11)).f31503b) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            return;
        }
        int i12 = i11 + 1;
        if (i12 < arrayList.size()) {
            ((e) arrayList.get(i12)).f31503b.c(false);
        }
        e eVar = (e) arrayList.remove(i11);
        l lVar2 = eVar.f31503b;
        a2 a2Var = eVar.f31502a;
        p.t tVar = a2Var.f34064z;
        lVar2.r(this);
        if (this.f31528z) {
            x1.b(tVar, null);
            tVar.setAnimationStyle(0);
        }
        a2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f31518p = ((e) arrayList.get(size2 - 1)).f31504c;
        } else {
            this.f31518p = this.f31516n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z11) {
                ((e) arrayList.get(0)).f31503b.c(false);
                return;
            }
            return;
        }
        dismiss();
        w wVar = this.f31525w;
        if (wVar != null) {
            wVar.h(lVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f31526x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f31526x.removeGlobalOnLayoutListener(this.f31512i);
            }
            this.f31526x = null;
        }
        this.f31517o.removeOnAttachStateChangeListener(this.f31513j);
        this.f31527y.onDismiss();
    }

    @Override // o.x
    public final void j(w wVar) {
        this.f31525w = wVar;
    }

    @Override // o.x
    public final Parcelable k() {
        return null;
    }

    @Override // o.t
    public final void m(l lVar) {
        lVar.b(this, this.f31505b);
        if (a()) {
            v(lVar);
        } else {
            this.f31510g.add(lVar);
        }
    }

    @Override // o.t
    public final void o(View view) {
        if (this.f31516n != view) {
            this.f31516n = view;
            this.f31515m = Gravity.getAbsoluteGravity(this.l, view.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.f31511h;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                eVar = null;
                break;
            }
            eVar = (e) arrayList.get(i11);
            if (!eVar.f31502a.f34064z.isShowing()) {
                break;
            } else {
                i11++;
            }
        }
        if (eVar != null) {
            eVar.f31503b.c(false);
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
        this.f31523u = z11;
    }

    @Override // o.t
    public final void q(int i11) {
        if (this.l != i11) {
            this.l = i11;
            this.f31515m = Gravity.getAbsoluteGravity(i11, this.f31516n.getLayoutDirection());
        }
    }

    @Override // o.t
    public final void r(int i11) {
        this.f31519q = true;
        this.f31521s = i11;
    }

    @Override // o.t
    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.f31527y = onDismissListener;
    }

    @Override // o.b0
    public final void show() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f31510g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((l) it.next());
        }
        arrayList.clear();
        View view = this.f31516n;
        this.f31517o = view;
        if (view != null) {
            boolean z11 = this.f31526x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f31526x = viewTreeObserver;
            if (z11) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f31512i);
            }
            this.f31517o.addOnAttachStateChangeListener(this.f31513j);
        }
    }

    @Override // o.t
    public final void t(boolean z11) {
        this.f31524v = z11;
    }

    @Override // o.t
    public final void u(int i11) {
        this.f31520r = true;
        this.f31522t = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(o.l r20) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.f.v(o.l):void");
    }

    @Override // o.x
    public final void f(Parcelable parcelable) {
    }
}

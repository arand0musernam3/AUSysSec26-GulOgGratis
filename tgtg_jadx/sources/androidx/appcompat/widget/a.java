package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.app.tgtg.R;
import com.braze.h2;
import java.util.ArrayList;
import o.d0;
import o.l;
import o.n;
import o.o;
import o.t;
import o.w;
import o.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends o.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p.g f2128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f2129k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2130m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2131n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2132o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2133p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2134q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2135r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SparseBooleanArray f2136s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p.d f2137t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p.d f2138u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p.f f2139v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p.e f2140w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m1.a f2141x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2142y;

    public a(Context context) {
        this.f31492a = context;
        this.f31495d = LayoutInflater.from(context);
        this.f31497f = R.layout.abc_action_menu_layout;
        this.f31498g = R.layout.abc_action_menu_item_layout;
        this.f2136s = new SparseBooleanArray();
        this.f2141x = new m1.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(n nVar, View view, ViewGroup viewGroup) {
        View actionView = nVar.getActionView();
        if (actionView == null || nVar.e()) {
            y yVar = view instanceof y ? (y) view : (y) this.f31495d.inflate(this.f31498g, viewGroup, false);
            yVar.a(nVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) yVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f31499h);
            if (this.f2140w == null) {
                this.f2140w = new p.e(this);
            }
            actionMenuItemView.setPopupCallback(this.f2140w);
            actionView = (View) yVar;
        }
        actionView.setVisibility(nVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.a)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.x
    public final void b(boolean z11) {
        int i11;
        ViewGroup viewGroup = (ViewGroup) this.f31499h;
        ArrayList arrayList = null;
        boolean z12 = false;
        if (viewGroup != null) {
            l lVar = this.f31494c;
            if (lVar != null) {
                lVar.i();
                ArrayList arrayListL = this.f31494c.l();
                int size = arrayListL.size();
                i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    n nVar = (n) arrayListL.get(i12);
                    if ((nVar.f31592x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i11);
                        n itemData = childAt instanceof y ? ((y) childAt).getItemData() : null;
                        View viewA = a(nVar, childAt, viewGroup);
                        if (nVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f31499h).addView(viewA, i11);
                        }
                        i11++;
                    }
                }
            } else {
                i11 = 0;
            }
            while (i11 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i11) == this.f2128j) {
                    i11++;
                } else {
                    viewGroup.removeViewAt(i11);
                }
            }
        }
        ((View) this.f31499h).requestLayout();
        l lVar2 = this.f31494c;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.f31552i;
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                o oVar = ((n) arrayList2.get(i13)).A;
            }
        }
        l lVar3 = this.f31494c;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.f31553j;
        }
        if (this.f2130m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z12 = !((n) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z12 = true;
            }
        }
        p.g gVar = this.f2128j;
        if (z12) {
            if (gVar == null) {
                this.f2128j = new p.g(this, this.f31492a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f2128j.getParent();
            if (viewGroup3 != this.f31499h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f2128j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f31499h;
                p.g gVar2 = this.f2128j;
                actionMenuView.getClass();
                ActionMenuView.a aVarJ = ActionMenuView.j();
                aVarJ.f1997a = true;
                actionMenuView.addView(gVar2, aVarJ);
            }
        } else if (gVar != null) {
            Object parent = gVar.getParent();
            Object obj = this.f31499h;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f2128j);
            }
        }
        ((ActionMenuView) this.f31499h).setOverflowReserved(this.f2130m);
    }

    @Override // o.x
    public final void c(Context context, l lVar) {
        this.f31493b = context;
        LayoutInflater.from(context);
        this.f31494c = lVar;
        Resources resources = context.getResources();
        androidx.appcompat.view.a aVarA = androidx.appcompat.view.a.a(context);
        if (!this.f2131n) {
            this.f2130m = true;
        }
        this.f2132o = aVarA.f1840a.getResources().getDisplayMetrics().widthPixels / 2;
        this.f2134q = aVarA.b();
        int measuredWidth = this.f2132o;
        if (this.f2130m) {
            if (this.f2128j == null) {
                p.g gVar = new p.g(this, this.f31492a);
                this.f2128j = gVar;
                if (this.l) {
                    gVar.setImageDrawable(this.f2129k);
                    this.f2129k = null;
                    this.l = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2128j.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f2128j.getMeasuredWidth();
        } else {
            this.f2128j = null;
        }
        this.f2133p = measuredWidth;
        float f11 = resources.getDisplayMetrics().density;
    }

    @Override // o.x
    public final boolean d() {
        int size;
        ArrayList arrayListL;
        int i11;
        boolean z11;
        a aVar = this;
        l lVar = aVar.f31494c;
        if (lVar != null) {
            arrayListL = lVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i12 = aVar.f2134q;
        int i13 = aVar.f2133p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.f31499h;
        int i14 = 0;
        boolean z12 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z11 = true;
            if (i14 >= size) {
                break;
            }
            n nVar = (n) arrayListL.get(i14);
            int i17 = nVar.f31593y;
            if ((i17 & 2) == 2) {
                i15++;
            } else if ((i17 & 1) == 1) {
                i16++;
            } else {
                z12 = true;
            }
            if (aVar.f2135r && nVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (aVar.f2130m && (z12 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = aVar.f2136s;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i21 = 0;
        while (i19 < size) {
            n nVar2 = (n) arrayListL.get(i19);
            int i22 = nVar2.f31593y;
            boolean z13 = (i22 & 2) == i11 ? z11 : false;
            int i23 = nVar2.f31571b;
            if (z13) {
                View viewA = aVar.a(nVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i21 == 0) {
                    i21 = measuredWidth;
                }
                if (i23 != 0) {
                    sparseBooleanArray.put(i23, z11);
                }
                nVar2.g(z11);
            } else if ((i22 & 1) == z11) {
                boolean z14 = sparseBooleanArray.get(i23);
                boolean z15 = ((i18 > 0 || z14) && i13 > 0) ? z11 : false;
                if (z15) {
                    View viewA2 = aVar.a(nVar2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i21 == 0) {
                        i21 = measuredWidth2;
                    }
                    z15 &= i13 + i21 > 0;
                }
                if (z15 && i23 != 0) {
                    sparseBooleanArray.put(i23, true);
                } else if (z14) {
                    sparseBooleanArray.put(i23, false);
                    for (int i24 = 0; i24 < i19; i24++) {
                        n nVar3 = (n) arrayListL.get(i24);
                        if (nVar3.f31571b == i23) {
                            if ((nVar3.f31592x & 32) == 32) {
                                i18++;
                            }
                            nVar3.g(false);
                        }
                    }
                }
                if (z15) {
                    i18--;
                }
                nVar2.g(z15);
            } else {
                nVar2.g(false);
                i19++;
                i11 = 2;
                aVar = this;
                z11 = true;
            }
            i19++;
            i11 = 2;
            aVar = this;
            z11 = true;
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.x
    public final boolean e(d0 d0Var) {
        boolean z11;
        if (d0Var.hasVisibleItems()) {
            d0 d0Var2 = d0Var;
            while (true) {
                l lVar = d0Var2.f31501z;
                if (lVar == this.f31494c) {
                    break;
                }
                d0Var2 = (d0) lVar;
            }
            n nVar = d0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f31499h;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i11);
                    if ((childAt instanceof y) && ((y) childAt).getItemData() == nVar) {
                        view = childAt;
                        break;
                    }
                    i11++;
                }
            }
            if (view != null) {
                this.f2142y = d0Var.A.f31570a;
                int size = d0Var.f31549f.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        z11 = false;
                        break;
                    }
                    MenuItem item = d0Var.getItem(i12);
                    if (item.isVisible() && item.getIcon() != null) {
                        z11 = true;
                        break;
                    }
                    i12++;
                }
                p.d dVar = new p.d(this, this.f31493b, d0Var, view);
                this.f2138u = dVar;
                dVar.f31612g = z11;
                t tVar = dVar.f31614i;
                if (tVar != null) {
                    tVar.p(z11);
                }
                p.d dVar2 = this.f2138u;
                if (!dVar2.b()) {
                    if (dVar2.f31610e == null) {
                        h2.b("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    dVar2.d(0, 0, false, false);
                }
                w wVar = this.f31496e;
                if (wVar != null) {
                    wVar.v(d0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // o.x
    public final void f(Parcelable parcelable) {
        int i11;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof p.h) && (i11 = ((p.h) parcelable).f33907a) > 0 && (menuItemFindItem = this.f31494c.findItem(i11)) != null) {
            e((d0) menuItemFindItem.getSubMenu());
        }
    }

    public final boolean g() {
        Object obj;
        p.f fVar = this.f2139v;
        if (fVar != null && (obj = this.f31499h) != null) {
            ((View) obj).removeCallbacks(fVar);
            this.f2139v = null;
            return true;
        }
        p.d dVar = this.f2137t;
        if (dVar == null) {
            return false;
        }
        if (dVar.b()) {
            dVar.f31614i.dismiss();
        }
        return true;
    }

    @Override // o.x
    public final void h(l lVar, boolean z11) {
        g();
        p.d dVar = this.f2138u;
        if (dVar != null && dVar.b()) {
            dVar.f31614i.dismiss();
        }
        w wVar = this.f31496e;
        if (wVar != null) {
            wVar.h(lVar, z11);
        }
    }

    @Override // o.x
    public final Parcelable k() {
        p.h hVar = new p.h();
        hVar.f33907a = this.f2142y;
        return hVar;
    }

    public final boolean m() {
        p.d dVar = this.f2137t;
        return dVar != null && dVar.b();
    }

    public final boolean n() {
        l lVar;
        if (!this.f2130m || m() || (lVar = this.f31494c) == null || this.f31499h == null || this.f2139v != null) {
            return false;
        }
        lVar.i();
        if (lVar.f31553j.isEmpty()) {
            return false;
        }
        p.f fVar = new p.f(0, this, new p.d(this, this.f31493b, this.f31494c, this.f2128j));
        this.f2139v = fVar;
        ((View) this.f31499h).post(fVar);
        return true;
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import o.d0;
import o.l;
import o.n;
import o.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f2154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f2155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2156c;

    public g(Toolbar toolbar) {
        this.f2156c = toolbar;
    }

    @Override // o.x
    public final void b(boolean z11) {
        if (this.f2155b != null) {
            l lVar = this.f2154a;
            if (lVar != null) {
                int size = lVar.f31549f.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (this.f2154a.getItem(i11) == this.f2155b) {
                        return;
                    }
                }
            }
            l(this.f2155b);
        }
    }

    @Override // o.x
    public final void c(Context context, l lVar) {
        n nVar;
        l lVar2 = this.f2154a;
        if (lVar2 != null && (nVar = this.f2155b) != null) {
            lVar2.d(nVar);
        }
        this.f2154a = lVar;
    }

    @Override // o.x
    public final boolean d() {
        return false;
    }

    @Override // o.x
    public final boolean e(d0 d0Var) {
        return false;
    }

    @Override // o.x
    public final int getId() {
        return 0;
    }

    @Override // o.x
    public final boolean i(n nVar) {
        Toolbar toolbar = this.f2156c;
        toolbar.c();
        ViewParent parent = toolbar.f2105h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2105h);
            }
            toolbar.addView(toolbar.f2105h);
        }
        View actionView = nVar.getActionView();
        toolbar.f2106i = actionView;
        this.f2155b = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2106i);
            }
            Toolbar.a aVarH = Toolbar.h();
            aVarH.f1765a = (toolbar.f2110n & 112) | 8388611;
            aVarH.f2123b = 2;
            toolbar.f2106i.setLayoutParams(aVarH);
            toolbar.addView(toolbar.f2106i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((Toolbar.a) childAt.getLayoutParams()).f2123b != 2 && childAt != toolbar.f2098a) {
                toolbar.removeViewAt(childCount);
                toolbar.E.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.C = true;
        nVar.f31582n.p(false);
        KeyEvent.Callback callback = toolbar.f2106i;
        if (callback instanceof androidx.appcompat.view.b) {
            ((androidx.appcompat.view.b) callback).onActionViewExpanded();
        }
        toolbar.w();
        return true;
    }

    @Override // o.x
    public final Parcelable k() {
        return null;
    }

    @Override // o.x
    public final boolean l(n nVar) {
        Toolbar toolbar = this.f2156c;
        KeyEvent.Callback callback = toolbar.f2106i;
        if (callback instanceof androidx.appcompat.view.b) {
            ((androidx.appcompat.view.b) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f2106i);
        toolbar.removeView(toolbar.f2105h);
        toolbar.f2106i = null;
        ArrayList arrayList = toolbar.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2155b = null;
        toolbar.requestLayout();
        nVar.C = false;
        nVar.f31582n.p(false);
        toolbar.w();
        return true;
    }

    @Override // o.x
    public final void f(Parcelable parcelable) {
    }

    @Override // o.x
    public final void h(l lVar, boolean z11) {
    }
}

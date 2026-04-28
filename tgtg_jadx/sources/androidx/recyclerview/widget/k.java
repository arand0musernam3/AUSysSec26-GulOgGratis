package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f3793a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f3797e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3796d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f3794b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f3795c = new ArrayList();

    public k(j1 j1Var) {
        this.f3793a = j1Var;
    }

    public final void a(View view, int i11, boolean z11) {
        RecyclerView recyclerView = this.f3793a.f3791a;
        int childCount = i11 < 0 ? recyclerView.getChildCount() : f(i11);
        this.f3794b.f(childCount, z11);
        if (z11) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        r2 r2VarO = RecyclerView.O(view);
        l1 l1Var = recyclerView.f3596m;
        if (l1Var != null && r2VarO != null) {
            l1Var.onViewAttachedToWindow(r2VarO);
        }
        ArrayList arrayList = recyclerView.C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((z1) recyclerView.C.get(size)).c(view);
            }
        }
    }

    public final void b(View view, int i11, ViewGroup.LayoutParams layoutParams, boolean z11) {
        RecyclerView recyclerView = this.f3793a.f3791a;
        int childCount = i11 < 0 ? recyclerView.getChildCount() : f(i11);
        this.f3794b.f(childCount, z11);
        if (z11) {
            i(view);
        }
        r2 r2VarO = RecyclerView.O(view);
        if (r2VarO != null) {
            if (!r2VarO.isTmpDetached() && !r2VarO.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(r2VarO);
                j4.d.p(sb2, recyclerView.D());
                return;
            } else {
                if (RecyclerView.J1) {
                    Log.d("RecyclerView", "reAttach " + r2VarO);
                }
                r2VarO.clearTmpDetachFlag();
            }
        } else if (RecyclerView.I1) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            String strD = recyclerView.D();
            sb3.append(", index: ");
            sb3.append(childCount);
            sb3.append(strD);
            throw new IllegalArgumentException(sb3.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i11) {
        int iF = f(i11);
        this.f3794b.h(iF);
        RecyclerView recyclerView = this.f3793a.f3791a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null) {
            r2 r2VarO = RecyclerView.O(childAt);
            if (r2VarO != null) {
                if (r2VarO.isTmpDetached() && !r2VarO.shouldIgnore()) {
                    StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                    sb2.append(r2VarO);
                    j4.d.p(sb2, recyclerView.D());
                    return;
                } else {
                    if (RecyclerView.J1) {
                        Log.d("RecyclerView", "tmpDetach " + r2VarO);
                    }
                    r2VarO.addFlags(256);
                }
            }
        } else if (RecyclerView.I1) {
            a40.d0.f(recyclerView.D(), iF, "No view at offset ");
            return;
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i11) {
        return this.f3793a.f3791a.getChildAt(f(i11));
    }

    public final int e() {
        return this.f3793a.f3791a.getChildCount() - this.f3795c.size();
    }

    public final int f(int i11) {
        if (i11 < 0) {
            return -1;
        }
        int childCount = this.f3793a.f3791a.getChildCount();
        int i12 = i11;
        while (i12 < childCount) {
            j jVar = this.f3794b;
            int iC = i11 - (i12 - jVar.c(i12));
            if (iC == 0) {
                while (jVar.e(i12)) {
                    i12++;
                }
                return i12;
            }
            i12 += iC;
        }
        return -1;
    }

    public final View g(int i11) {
        return this.f3793a.f3791a.getChildAt(i11);
    }

    public final int h() {
        return this.f3793a.f3791a.getChildCount();
    }

    public final void i(View view) {
        this.f3795c.add(view);
        r2 r2VarO = RecyclerView.O(view);
        if (r2VarO != null) {
            r2VarO.onEnteredHiddenState(this.f3793a.f3791a);
        }
    }

    public final int j(View view) {
        int iIndexOfChild = this.f3793a.f3791a.indexOfChild(view);
        if (iIndexOfChild != -1) {
            j jVar = this.f3794b;
            if (!jVar.e(iIndexOfChild)) {
                return iIndexOfChild - jVar.c(iIndexOfChild);
            }
        }
        return -1;
    }

    public final void k(int i11) {
        j1 j1Var = this.f3793a;
        int i12 = this.f3796d;
        if (i12 == 1) {
            com.braze.h2.b("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i12 == 2) {
            com.braze.h2.b("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            int iF = f(i11);
            View childAt = j1Var.f3791a.getChildAt(iF);
            if (childAt == null) {
                this.f3796d = 0;
                this.f3797e = null;
                return;
            }
            this.f3796d = 1;
            this.f3797e = childAt;
            if (this.f3794b.h(iF)) {
                l(childAt);
            }
            j1Var.k(iF);
            this.f3796d = 0;
            this.f3797e = null;
        } catch (Throwable th2) {
            this.f3796d = 0;
            this.f3797e = null;
            throw th2;
        }
    }

    public final void l(View view) {
        r2 r2VarO;
        if (!this.f3795c.remove(view) || (r2VarO = RecyclerView.O(view)) == null) {
            return;
        }
        r2VarO.onLeftHiddenState(this.f3793a.f3791a);
    }

    public final String toString() {
        return this.f3794b.toString() + ", hidden list:" + this.f3795c.size();
    }
}

package e20;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.app.tgtg.R;
import com.google.android.material.internal.NavigationMenuView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements o.x {
    public int A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NavigationMenuView f15699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f15700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o.l f15701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f15703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LayoutInflater f15704f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f15706h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f15709k;
    public ColorStateList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f15710m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RippleDrawable f15711n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15712o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15713p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15717t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15718u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15719v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15720w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f15722y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f15723z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15705g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15707i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15708j = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f15721x = true;
    public int B = -1;
    public final m C = new m(this, 0);

    public final void a() {
        p pVar = this.f15703e;
        if (pVar != null) {
            ArrayList arrayList = pVar.f15690a;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11) instanceof s) {
                    pVar.notifyItemChanged(i11);
                }
            }
        }
    }

    @Override // o.x
    public final void b(boolean z11) {
        p pVar = this.f15703e;
        if (pVar != null) {
            ArrayList arrayList = pVar.f15690a;
            int size = arrayList.size();
            pVar.a();
            pVar.notifyDataSetChanged();
            if (size == arrayList.size()) {
                pVar.notifyItemRangeChanged(0, arrayList.size());
            }
        }
    }

    @Override // o.x
    public final void c(Context context, o.l lVar) {
        this.f15704f = LayoutInflater.from(context);
        this.f15701c = lVar;
        this.A = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // o.x
    public final boolean d() {
        return false;
    }

    @Override // o.x
    public final boolean e(o.d0 d0Var) {
        return false;
    }

    @Override // o.x
    public final void f(Parcelable parcelable) {
        o.n nVar;
        View actionView;
        z zVar;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f15699a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                p pVar = this.f15703e;
                ArrayList arrayList = pVar.f15690a;
                int i11 = bundle2.getInt("android:menu:checked", 0);
                if (i11 != 0) {
                    pVar.f15692c = true;
                    int size = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        r rVar = (r) arrayList.get(i12);
                        if (rVar instanceof t) {
                            o.n nVar2 = ((t) rVar).f15696a;
                            if (nVar2.f31570a == i11) {
                                pVar.b(nVar2);
                                break;
                            }
                        }
                        i12++;
                    }
                    pVar.f15692c = false;
                    pVar.a();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        r rVar2 = (r) arrayList.get(i13);
                        if ((rVar2 instanceof t) && (actionView = (nVar = ((t) rVar2).f15696a).getActionView()) != null && (zVar = (z) sparseParcelableArray2.get(nVar.f31570a)) != null) {
                            actionView.restoreHierarchyState(zVar);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f15700b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public final void g() {
        p pVar = this.f15703e;
        if (pVar != null) {
            ArrayList arrayList = pVar.f15690a;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if ((arrayList.get(i11) instanceof t) && pVar.getItemViewType(i11) == 1) {
                    pVar.notifyItemChanged(i11);
                }
            }
        }
    }

    @Override // o.x
    public final int getId() {
        return this.f15702d;
    }

    @Override // o.x
    public final boolean i(o.n nVar) {
        return false;
    }

    @Override // o.x
    public final Parcelable k() {
        o.n nVar;
        View actionView;
        Bundle bundle = new Bundle();
        if (this.f15699a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f15699a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        p pVar = this.f15703e;
        if (pVar != null) {
            ArrayList arrayList = pVar.f15690a;
            Bundle bundle2 = new Bundle();
            o.n nVar2 = pVar.f15691b;
            if (nVar2 != null) {
                bundle2.putInt("android:menu:checked", nVar2.f31570a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                r rVar = (r) arrayList.get(i11);
                if ((rVar instanceof t) && (actionView = (nVar = ((t) rVar).f15696a).getActionView()) != null) {
                    z zVar = new z();
                    actionView.saveHierarchyState(zVar);
                    sparseArray2.put(nVar.f31570a, zVar);
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f15700b != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.f15700b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // o.x
    public final boolean l(o.n nVar) {
        return false;
    }

    public final void m() {
        p pVar = this.f15703e;
        if (pVar != null) {
            ArrayList arrayList = pVar.f15690a;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if ((arrayList.get(i11) instanceof t) && pVar.getItemViewType(i11) == 0) {
                    pVar.notifyItemChanged(i11);
                }
            }
        }
    }

    @Override // o.x
    public final void h(o.l lVar, boolean z11) {
    }
}

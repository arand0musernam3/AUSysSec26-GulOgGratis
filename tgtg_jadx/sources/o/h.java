package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements x, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f31531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f31532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f31533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f31534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f31535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f31536f;

    public h(ContextWrapper contextWrapper) {
        this.f31531a = contextWrapper;
        this.f31532b = LayoutInflater.from(contextWrapper);
    }

    @Override // o.x
    public final void b(boolean z11) {
        g gVar = this.f31536f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // o.x
    public final void c(Context context, l lVar) {
        if (this.f31531a != null) {
            this.f31531a = context;
            if (this.f31532b == null) {
                this.f31532b = LayoutInflater.from(context);
            }
        }
        this.f31533c = lVar;
        g gVar = this.f31536f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // o.x
    public final boolean d() {
        return false;
    }

    @Override // o.x
    public final boolean e(d0 d0Var) {
        boolean zHasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f31544a;
        if (!zHasVisibleItems) {
            return false;
        }
        m mVar = new m();
        mVar.f31567a = d0Var;
        androidx.constraintlayout.widget.z zVar = new androidx.constraintlayout.widget.z(context);
        k.c cVar = (k.c) zVar.f2543c;
        h hVar = new h(cVar.f25518a);
        mVar.f31569c = hVar;
        hVar.f31535e = mVar;
        d0Var.b(hVar, context);
        h hVar2 = mVar.f31569c;
        if (hVar2.f31536f == null) {
            hVar2.f31536f = new g(hVar2);
        }
        cVar.f25528k = hVar2.f31536f;
        cVar.l = mVar;
        View view = d0Var.f31557o;
        if (view != null) {
            cVar.f25522e = view;
        } else {
            cVar.f25520c = d0Var.f31556n;
            cVar.f25521d = d0Var.f31555m;
        }
        cVar.f25527j = mVar;
        k.f fVarG = zVar.g();
        mVar.f31568b = fVarG;
        fVarG.setOnDismissListener(mVar);
        WindowManager.LayoutParams attributes = mVar.f31568b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        mVar.f31568b.show();
        w wVar = this.f31535e;
        if (wVar == null) {
            return true;
        }
        wVar.v(d0Var);
        return true;
    }

    @Override // o.x
    public final void f(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f31534d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // o.x
    public final int getId() {
        return 0;
    }

    @Override // o.x
    public final void h(l lVar, boolean z11) {
        w wVar = this.f31535e;
        if (wVar != null) {
            wVar.h(lVar, z11);
        }
    }

    @Override // o.x
    public final boolean i(n nVar) {
        return false;
    }

    @Override // o.x
    public final void j(w wVar) {
        throw null;
    }

    @Override // o.x
    public final Parcelable k() {
        if (this.f31534d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f31534d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // o.x
    public final boolean l(n nVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i11, long j9) {
        this.f31533c.q(this.f31536f.getItem(i11), this, 0);
    }
}

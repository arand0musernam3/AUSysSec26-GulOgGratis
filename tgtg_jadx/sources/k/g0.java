package k;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends ActionMode implements o.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f25568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o.l f25569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f25570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f25571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.c f25572g;

    public g0(androidx.appcompat.app.c cVar, Context context, p pVar) {
        this.f25572g = cVar;
        this.f25568c = context;
        this.f25570e = pVar;
        o.l lVar = new o.l(context);
        lVar.l = 1;
        this.f25569d = lVar;
        lVar.f31548e = this;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void a() {
        androidx.appcompat.app.c cVar = this.f25572g;
        if (cVar.f1822i != this) {
            return;
        }
        boolean z11 = cVar.f1828p;
        boolean z12 = cVar.f1829q;
        if (z11 || z12) {
            cVar.f1823j = this;
            cVar.f1824k = this.f25570e;
        } else {
            this.f25570e.a(this);
        }
        this.f25570e = null;
        cVar.u(false);
        ActionBarContextView actionBarContextView = cVar.f1819f;
        if (actionBarContextView.f1952k == null) {
            actionBarContextView.e();
        }
        cVar.f1816c.setHideOnContentScrollEnabled(cVar.f1834v);
        cVar.f1822i = null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final View b() {
        WeakReference weakReference = this.f25571f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final o.l c() {
        return this.f25569d;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final MenuInflater d() {
        return new androidx.appcompat.view.i(this.f25568c);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final CharSequence e() {
        return this.f25572g.f1819f.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public final CharSequence f() {
        return this.f25572g.f1819f.getTitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void g() {
        if (this.f25572g.f1822i != this) {
            return;
        }
        o.l lVar = this.f25569d;
        lVar.y();
        try {
            this.f25570e.c(this, lVar);
        } finally {
            lVar.x();
        }
    }

    @Override // androidx.appcompat.view.ActionMode
    public final boolean h() {
        return this.f25572g.f1819f.f1959s;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void i(View view) {
        this.f25572g.f1819f.setCustomView(view);
        this.f25571f = new WeakReference(view);
    }

    @Override // o.j
    public final boolean j(o.l lVar, MenuItem menuItem) {
        p pVar = this.f25570e;
        if (pVar != null) {
            return pVar.f25579a.d(this, menuItem);
        }
        return false;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void k(int i11) {
        l(this.f25572g.f1814a.getResources().getString(i11));
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void l(CharSequence charSequence) {
        this.f25572g.f1819f.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void m(int i11) {
        n(this.f25572g.f1814a.getResources().getString(i11));
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void n(CharSequence charSequence) {
        this.f25572g.f1819f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void o(boolean z11) {
        this.f1839b = z11;
        this.f25572g.f1819f.setTitleOptional(z11);
    }

    @Override // o.j
    public final void q(o.l lVar) {
        if (this.f25570e == null) {
            return;
        }
        g();
        androidx.appcompat.widget.a aVar = this.f25572g.f1819f.f1945d;
        if (aVar != null) {
            aVar.n();
        }
    }
}

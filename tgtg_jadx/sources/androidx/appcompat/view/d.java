package androidx.appcompat.view;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ActionMode implements o.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f1847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContextView f1848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f1849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f1850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o.l f1852h;

    @Override // androidx.appcompat.view.ActionMode
    public final void a() {
        if (this.f1851g) {
            return;
        }
        this.f1851g = true;
        this.f1849e.a(this);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final View b() {
        WeakReference weakReference = this.f1850f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final o.l c() {
        return this.f1852h;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final MenuInflater d() {
        return new i(this.f1848d.getContext());
    }

    @Override // androidx.appcompat.view.ActionMode
    public final CharSequence e() {
        return this.f1848d.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public final CharSequence f() {
        return this.f1848d.getTitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void g() {
        this.f1849e.c(this, this.f1852h);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final boolean h() {
        return this.f1848d.f1959s;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void i(View view) {
        this.f1848d.setCustomView(view);
        this.f1850f = view != null ? new WeakReference(view) : null;
    }

    @Override // o.j
    public final boolean j(o.l lVar, MenuItem menuItem) {
        return this.f1849e.f25579a.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void k(int i11) {
        l(this.f1847c.getString(i11));
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void l(CharSequence charSequence) {
        this.f1848d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void m(int i11) {
        n(this.f1847c.getString(i11));
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void n(CharSequence charSequence) {
        this.f1848d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void o(boolean z11) {
        this.f1839b = z11;
        this.f1848d.setTitleOptional(z11);
    }

    @Override // o.j
    public final void q(o.l lVar) {
        g();
        androidx.appcompat.widget.a aVar = this.f1848d.f1945d;
        if (aVar != null) {
            aVar.n();
        }
    }
}

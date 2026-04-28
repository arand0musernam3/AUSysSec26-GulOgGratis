package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class d0 extends l implements SubMenu {
    public final n A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final l f31501z;

    public d0(Context context, l lVar, n nVar) {
        super(context);
        this.f31501z = lVar;
        this.A = nVar;
    }

    @Override // o.l
    public final boolean d(n nVar) {
        return this.f31501z.d(nVar);
    }

    @Override // o.l
    public final boolean e(l lVar, MenuItem menuItem) {
        return super.e(lVar, menuItem) || this.f31501z.e(lVar, menuItem);
    }

    @Override // o.l
    public final boolean f(n nVar) {
        return this.f31501z.f(nVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // o.l
    public final String j() {
        n nVar = this.A;
        int i11 = nVar != null ? nVar.f31570a : 0;
        if (i11 == 0) {
            return null;
        }
        return j4.s.f(i11, "android:menu:actionviewstates:");
    }

    @Override // o.l
    public final l k() {
        return this.f31501z.k();
    }

    @Override // o.l
    public final boolean m() {
        return this.f31501z.m();
    }

    @Override // o.l
    public final boolean n() {
        return this.f31501z.n();
    }

    @Override // o.l
    public final boolean o() {
        return this.f31501z.o();
    }

    @Override // o.l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z11) {
        this.f31501z.setGroupDividerEnabled(z11);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        w(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        w(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        w(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // o.l, android.view.Menu
    public final void setQwertyMode(boolean z11) {
        this.f31501z.setQwertyMode(z11);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i11) {
        this.A.setIcon(i11);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i11) {
        w(0, null, i11, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i11) {
        w(i11, null, 0, null, null);
        return this;
    }
}

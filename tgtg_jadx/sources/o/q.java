package o;

import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f31598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f31599b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f31599b = sVar;
        this.f31598a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f31598a.onMenuItemActionCollapse(this.f31599b.j(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f31598a.onMenuItemActionExpand(this.f31599b.j(menuItem));
    }
}

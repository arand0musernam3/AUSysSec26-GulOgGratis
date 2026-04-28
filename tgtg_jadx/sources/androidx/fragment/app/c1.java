package androidx.fragment.app;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.MenuProvider;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements MenuProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f3162a;

    public c1(FragmentManager fragmentManager) {
        this.f3162a = fragmentManager;
    }

    @Override // androidx.core.view.MenuProvider
    public final boolean a(MenuItem menuItem) {
        return this.f3162a.q(menuItem);
    }

    @Override // androidx.core.view.MenuProvider
    public final void b(Menu menu) {
        this.f3162a.r(menu);
    }

    @Override // androidx.core.view.MenuProvider
    public final void c(Menu menu, MenuInflater menuInflater) {
        this.f3162a.l(menu, menuInflater);
    }

    @Override // androidx.core.view.MenuProvider
    public final void d(Menu menu) {
        this.f3162a.u(menu);
    }
}

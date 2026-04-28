package k;

import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements ActionMode.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionMode.Callback f25579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.a f25580b;

    public p(androidx.appcompat.app.a aVar, ActionMode.Callback callback) {
        this.f25580b = aVar;
        this.f25579a = callback;
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public final void a(ActionMode actionMode) {
        this.f25579a.a(actionMode);
        androidx.appcompat.app.a aVar = this.f25580b;
        if (aVar.f1801w != null) {
            aVar.l.getDecorView().removeCallbacks(aVar.f1802x);
        }
        if (aVar.f1800v != null) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = aVar.f1803y;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.b();
            }
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatA = ViewCompat.c(aVar.f1800v).a(0.0f);
            aVar.f1803y = viewPropertyAnimatorCompatA;
            viewPropertyAnimatorCompatA.f(new m(this, 1));
        }
        i iVar = aVar.f1792n;
        if (iVar != null) {
            iVar.onSupportActionModeFinished(aVar.f1799u);
        }
        aVar.f1799u = null;
        ViewCompat.Z(aVar.A);
        aVar.f0();
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public final boolean b(ActionMode actionMode, Menu menu) {
        return this.f25579a.b(actionMode, menu);
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public final boolean c(ActionMode actionMode, Menu menu) {
        ViewCompat.Z(this.f25580b.A);
        return this.f25579a.c(actionMode, menu);
    }

    @Override // androidx.appcompat.view.ActionMode.Callback
    public final boolean d(ActionMode actionMode, MenuItem menuItem) {
        return this.f25579a.d(actionMode, menuItem);
    }
}

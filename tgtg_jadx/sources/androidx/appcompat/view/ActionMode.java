package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1839b;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public interface Callback {
        void a(ActionMode actionMode);

        boolean b(ActionMode actionMode, Menu menu);

        boolean c(ActionMode actionMode, Menu menu);

        boolean d(ActionMode actionMode, MenuItem menuItem);
    }

    public abstract void a();

    public abstract View b();

    public abstract o.l c();

    public abstract MenuInflater d();

    public abstract CharSequence e();

    public abstract CharSequence f();

    public abstract void g();

    public boolean h() {
        return false;
    }

    public abstract void i(View view);

    public abstract void k(int i11);

    public abstract void l(CharSequence charSequence);

    public abstract void m(int i11);

    public abstract void n(CharSequence charSequence);

    public void o(boolean z11) {
        this.f1839b = z11;
    }
}

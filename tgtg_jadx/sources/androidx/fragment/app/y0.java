package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentManager f3380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f3381b = new CopyOnWriteArrayList();

    public y0(FragmentManager fragmentManager) {
        this.f3380a = fragmentManager;
    }

    public final void a(Fragment fragment, boolean z11) {
        fragment.getClass();
        Fragment fragment2 = this.f3380a.f3131z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f3121p.a(fragment, true);
        }
        for (x0 x0Var : this.f3381b) {
            if (!z11 || x0Var.f3375b) {
                FragmentManager.a aVar = x0Var.f3374a;
            }
        }
    }

    public final void b(Fragment fragment, boolean z11) {
        fragment.getClass();
        FragmentManager fragmentManager = this.f3380a;
        o0 o0Var = fragmentManager.f3129x.f3357b;
        Fragment fragment2 = fragmentManager.f3131z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f3121p.b(fragment, true);
        }
        for (x0 x0Var : this.f3381b) {
            if (!z11 || x0Var.f3375b) {
                FragmentManager.a aVar = x0Var.f3374a;
            }
        }
    }

    public final void c(Fragment fragment, boolean z11) {
        fragment.getClass();
        Fragment fragment2 = this.f3380a.f3131z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f3121p.c(fragment, true);
        }
        for (x0 x0Var : this.f3381b) {
            if (!z11 || x0Var.f3375b) {
                FragmentManager.a aVar = x0Var.f3374a;
            }
        }
    }

    public final void d(Fragment fragment, boolean z11) {
        fragment.getClass();
        Fragment fragment2 = this.f3380a.f3131z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f3121p.d(fragment, true);
        }
        for (x0 x0Var : this.f3381b) {
            if (!z11 || x0Var.f3375b) {
                FragmentManager.a aVar = x0Var.f3374a;
            }
        }
    }

    public final void e(Fragment fragment, boolean z11) {
        fragment.getClass();
        Fragment fragment2 = this.f3380a.f3131z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f3121p.e(fragment, true);
        }
        for (x0 x0Var : this.f3381b) {
            if (!z11 || x0Var.f3375b) {
                FragmentManager.a aVar = x0Var.f3374a;
            }
        }
    }

    public final void f(Fragment fragment, boolean z11) {
        fragment.getClass();
        FragmentManager fragmentManager = this.f3380a;
        Fragment fragment2 = fragmentManager.f3131z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f3121p.f(fragment, true);
        }
        for (x0 x0Var : this.f3381b) {
            if (!z11 || x0Var.f3375b) {
                x0Var.f3374a.a(fragmentManager, fragment);
            }
        }
    }

    public final void g(Fragment fragment, boolean z11) {
        fragment.getClass();
        FragmentManager fragmentManager = this.f3380a;
        o0 o0Var = fragmentManager.f3129x.f3357b;
        Fragment fragment2 = fragmentManager.f3131z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f3121p.g(fragment, true);
        }
        for (x0 x0Var : this.f3381b) {
            if (!z11 || x0Var.f3375b) {
                FragmentManager.a aVar = x0Var.f3374a;
            }
        }
    }

    public final void h(Fragment fragment, boolean z11) {
        fragment.getClass();
        Fragment fragment2 = this.f3380a.f3131z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f3121p.h(fragment, true);
        }
        for (x0 x0Var : this.f3381b) {
            if (!z11 || x0Var.f3375b) {
                FragmentManager.a aVar = x0Var.f3374a;
            }
        }
    }

    public final void i(Fragment fragment, boolean z11) {
        fragment.getClass();
        FragmentManager fragmentManager = this.f3380a;
        Fragment fragment2 = fragmentManager.f3131z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f3121p.i(fragment, true);
        }
        for (x0 x0Var : this.f3381b) {
            if (!z11 || x0Var.f3375b) {
                x0Var.f3374a.b(fragmentManager, fragment);
            }
        }
    }

    public final void j(Fragment fragment, Bundle bundle, boolean z11) {
        fragment.getClass();
        Fragment fragment2 = this.f3380a.f3131z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f3121p.j(fragment, bundle, true);
        }
        for (x0 x0Var : this.f3381b) {
            if (!z11 || x0Var.f3375b) {
                FragmentManager.a aVar = x0Var.f3374a;
            }
        }
    }

    public final void k(Fragment fragment, boolean z11) {
        fragment.getClass();
        Fragment fragment2 = this.f3380a.f3131z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f3121p.k(fragment, true);
        }
        for (x0 x0Var : this.f3381b) {
            if (!z11 || x0Var.f3375b) {
                FragmentManager.a aVar = x0Var.f3374a;
            }
        }
    }

    public final void l(Fragment fragment, boolean z11) {
        fragment.getClass();
        Fragment fragment2 = this.f3380a.f3131z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f3121p.l(fragment, true);
        }
        for (x0 x0Var : this.f3381b) {
            if (!z11 || x0Var.f3375b) {
                FragmentManager.a aVar = x0Var.f3374a;
            }
        }
    }

    public final void m(Fragment fragment, View view, Bundle bundle, boolean z11) {
        fragment.getClass();
        view.getClass();
        FragmentManager fragmentManager = this.f3380a;
        Fragment fragment2 = fragmentManager.f3131z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f3121p.m(fragment, view, bundle, true);
        }
        for (x0 x0Var : this.f3381b) {
            if (!z11 || x0Var.f3375b) {
                x0Var.f3374a.c(fragmentManager, fragment, view);
            }
        }
    }

    public final void n(Fragment fragment, boolean z11) {
        fragment.getClass();
        Fragment fragment2 = this.f3380a.f3131z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f3121p.n(fragment, true);
        }
        for (x0 x0Var : this.f3381b) {
            if (!z11 || x0Var.f3375b) {
                FragmentManager.a aVar = x0Var.f3374a;
            }
        }
    }
}

package h7;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class l2 extends w.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsetsController f21587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a50.c f21588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Window f21589e;

    public l2(Window window, a50.c cVar) {
        this(window.getInsetsController(), cVar);
        this.f21589e = window;
    }

    @Override // w.b
    public final void P(int i11) {
        if ((i11 & 8) != 0) {
            ((e0) this.f21588d.f822b).b();
        }
        this.f21587c.hide(i11 & (-9));
    }

    @Override // w.b
    public boolean R() {
        Window window = this.f21589e;
        if (window == null) {
            this.f21587c.setSystemBarsAppearance(0, 0);
            if ((this.f21587c.getSystemBarsAppearance() & 8) == 0) {
                return false;
            }
        } else if ((window.getDecorView().getSystemUiVisibility() & 8192) == 0) {
            return false;
        }
        return true;
    }

    @Override // w.b
    public void a0(boolean z11) {
        f0(16, 16, z11);
    }

    @Override // w.b
    public void b0(boolean z11) {
        f0(8192, 8, z11);
    }

    @Override // w.b
    public final void d0(int i11) {
        if ((i11 & 8) != 0) {
            ((e0) this.f21588d.f822b).c();
        }
        this.f21587c.show(i11 & (-9));
    }

    public final void f0(int i11, int i12, boolean z11) {
        Window window = this.f21589e;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.f21587c;
            if (z11) {
                windowInsetsController.setSystemBarsAppearance(i12, i12);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i12);
                return;
            }
        }
        if (z11) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i11 | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i11) & decorView2.getSystemUiVisibility());
        }
    }

    public l2(WindowInsetsController windowInsetsController, a50.c cVar) {
        this.f21587c = windowInsetsController;
        this.f21588d = cVar;
    }
}

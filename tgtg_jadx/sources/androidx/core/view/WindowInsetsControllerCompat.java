package androidx.core.view;

import a50.c;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import h7.k2;
import h7.l2;
import h7.n2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsControllerCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w.b f2742a;

    public WindowInsetsControllerCompat(Window window, View view) {
        c cVar = new c(view);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35) {
            this.f2742a = new n2(window, cVar);
        } else if (i11 >= 30) {
            this.f2742a = new l2(window, cVar);
        } else {
            this.f2742a = new k2(window, cVar);
        }
    }

    @Deprecated
    public static WindowInsetsControllerCompat f(WindowInsetsController windowInsetsController) {
        return new WindowInsetsControllerCompat(windowInsetsController);
    }

    public void a(int i11) {
        this.f2742a.P(i11);
    }

    public boolean b() {
        return this.f2742a.R();
    }

    public void c(boolean z11) {
        this.f2742a.a0(z11);
    }

    public void d(boolean z11) {
        this.f2742a.b0(z11);
    }

    public void e(int i11) {
        this.f2742a.d0(i11);
    }

    public WindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f2742a = new n2(windowInsetsController, new c(windowInsetsController));
        } else {
            this.f2742a = new l2(windowInsetsController, new c(windowInsetsController));
        }
    }
}

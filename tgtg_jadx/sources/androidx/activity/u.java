package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.WindowInsetsControllerCompat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class u extends t {
    @Override // androidx.activity.s
    public void b(@NotNull g0 g0Var, @NotNull g0 g0Var2, @NotNull Window window, @NotNull View view, boolean z11, boolean z12) {
        g0Var.getClass();
        g0Var2.getClass();
        window.getClass();
        view.getClass();
        v0.n.G(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, view);
        windowInsetsControllerCompat.d(!z11);
        windowInsetsControllerCompat.c(true ^ z12);
    }
}

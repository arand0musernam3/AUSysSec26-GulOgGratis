package h7;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {
    public static WindowInsetsCompat a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        WindowInsetsCompat windowInsetsCompatV = WindowInsetsCompat.v(rootWindowInsets);
        windowInsetsCompatV.f2741a.y(windowInsetsCompatV);
        View rootView = view.getRootView();
        g2 g2Var = windowInsetsCompatV.f2741a;
        g2Var.d(rootView);
        g2Var.p(rootView);
        g2Var.q();
        return windowInsetsCompatV;
    }
}

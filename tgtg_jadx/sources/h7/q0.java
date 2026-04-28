package h7;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WindowInsetsCompat f21611a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f21612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f21613c;

    public q0(View view, w wVar) {
        this.f21612b = view;
        this.f21613c = wVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsetsCompat windowInsetsCompatW = WindowInsetsCompat.w(windowInsets, view);
        int i11 = Build.VERSION.SDK_INT;
        w wVar = this.f21613c;
        if (i11 < 30) {
            r0.a(windowInsets, this.f21612b);
            if (windowInsetsCompatW.equals(this.f21611a)) {
                return wVar.onApplyWindowInsets(view, windowInsetsCompatW).u();
            }
        }
        this.f21611a = windowInsetsCompatW;
        WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = wVar.onApplyWindowInsets(view, windowInsetsCompatW);
        if (i11 >= 30) {
            return windowInsetsCompatOnApplyWindowInsets.u();
        }
        ViewCompat.Z(view);
        return windowInsetsCompatOnApplyWindowInsets.u();
    }
}

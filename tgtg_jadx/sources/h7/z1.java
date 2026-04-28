package h7;

import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class z1 extends y1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public x6.d f21648s;

    public z1(WindowInsetsCompat windowInsetsCompat, z1 z1Var) {
        super(windowInsetsCompat, z1Var);
        this.f21648s = null;
        this.f21648s = z1Var.f21648s;
    }

    @Override // h7.g2
    public WindowInsetsCompat b() {
        return WindowInsetsCompat.v(this.f21636c.consumeStableInsets());
    }

    @Override // h7.g2
    public WindowInsetsCompat c() {
        return WindowInsetsCompat.v(this.f21636c.consumeSystemWindowInsets());
    }

    @Override // h7.g2
    public final x6.d l() {
        if (this.f21648s == null) {
            WindowInsets windowInsets = this.f21636c;
            this.f21648s = x6.d.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f21648s;
    }

    @Override // h7.g2
    public boolean s() {
        return this.f21636c.isConsumed();
    }

    @Override // h7.g2
    public void z(x6.d dVar) {
        this.f21648s = dVar;
    }

    public z1(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
        super(windowInsetsCompat, windowInsets);
        this.f21648s = null;
    }
}

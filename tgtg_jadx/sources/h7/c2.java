package h7;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class c2 extends b2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final WindowInsetsCompat f21525w = WindowInsetsCompat.v(WindowInsets.CONSUMED);

    public c2(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
        super(windowInsetsCompat, windowInsets);
    }

    @Override // h7.y1, h7.g2
    public x6.d i(int i11) {
        return x6.d.c(this.f21636c.getInsets(i2.a(i11)));
    }

    @Override // h7.y1, h7.g2
    public x6.d j(int i11) {
        return x6.d.c(this.f21636c.getInsetsIgnoringVisibility(i2.a(i11)));
    }

    @Override // h7.y1, h7.g2
    public boolean u(int i11) {
        return this.f21636c.isVisible(i2.a(i11));
    }

    public c2(WindowInsetsCompat windowInsetsCompat, c2 c2Var) {
        super(windowInsetsCompat, c2Var);
    }

    @Override // h7.y1, h7.g2
    public final void d(View view) {
    }
}

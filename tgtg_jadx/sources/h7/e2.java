package h7;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class e2 extends d2 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final WindowInsetsCompat f21534x = WindowInsetsCompat.v(WindowInsets.CONSUMED);

    public e2(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
        super(windowInsetsCompat, windowInsets);
    }

    @Override // h7.c2, h7.y1, h7.g2
    public x6.d i(int i11) {
        return x6.d.c(this.f21636c.getInsets(j2.a(i11)));
    }

    @Override // h7.c2, h7.y1, h7.g2
    public x6.d j(int i11) {
        return x6.d.c(this.f21636c.getInsetsIgnoringVisibility(j2.a(i11)));
    }

    @Override // h7.c2, h7.y1, h7.g2
    public boolean u(int i11) {
        return this.f21636c.isVisible(j2.a(i11));
    }

    public e2(WindowInsetsCompat windowInsetsCompat, e2 e2Var) {
        super(windowInsetsCompat, e2Var);
    }

    @Override // h7.y1, h7.g2
    public void p(View view) {
    }
}

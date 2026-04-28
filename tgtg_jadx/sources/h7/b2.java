package h7;

import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class b2 extends a2 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x6.d f21519t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public x6.d f21520u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public x6.d f21521v;

    public b2(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
        super(windowInsetsCompat, windowInsets);
        this.f21519t = null;
        this.f21520u = null;
        this.f21521v = null;
    }

    @Override // h7.g2
    public x6.d k() {
        if (this.f21520u == null) {
            this.f21520u = x6.d.c(this.f21636c.getMandatorySystemGestureInsets());
        }
        return this.f21520u;
    }

    @Override // h7.g2
    public x6.d m() {
        if (this.f21519t == null) {
            this.f21519t = x6.d.c(this.f21636c.getSystemGestureInsets());
        }
        return this.f21519t;
    }

    @Override // h7.g2
    public x6.d o() {
        if (this.f21521v == null) {
            this.f21521v = x6.d.c(this.f21636c.getTappableElementInsets());
        }
        return this.f21521v;
    }

    @Override // h7.y1, h7.g2
    public WindowInsetsCompat r(int i11, int i12, int i13, int i14) {
        return WindowInsetsCompat.v(this.f21636c.inset(i11, i12, i13, i14));
    }

    public b2(WindowInsetsCompat windowInsetsCompat, b2 b2Var) {
        super(windowInsetsCompat, b2Var);
        this.f21519t = null;
        this.f21520u = null;
        this.f21521v = null;
    }

    @Override // h7.z1, h7.g2
    public void z(x6.d dVar) {
    }
}

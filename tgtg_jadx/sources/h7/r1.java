package h7;

import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class r1 extends x1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowInsets.Builder f21617e;

    public r1(WindowInsetsCompat windowInsetsCompat) {
        super(windowInsetsCompat);
        WindowInsets windowInsetsU = windowInsetsCompat.u();
        this.f21617e = windowInsetsU != null ? q1.d(windowInsetsU) : q1.c();
    }

    @Override // h7.x1
    public WindowInsetsCompat b() {
        a();
        WindowInsetsCompat windowInsetsCompatV = WindowInsetsCompat.v(this.f21617e.build());
        windowInsetsCompatV.f2741a.w(this.f21624b);
        g2 g2Var = windowInsetsCompatV.f2741a;
        g2Var.v(null);
        g2Var.B(this.f21625c);
        g2Var.C(this.f21626d);
        return windowInsetsCompatV;
    }

    @Override // h7.x1
    public void e(x6.d dVar) {
        this.f21617e.setMandatorySystemGestureInsets(dVar.d());
    }

    @Override // h7.x1
    public void f(x6.d dVar) {
        this.f21617e.setStableInsets(dVar.d());
    }

    @Override // h7.x1
    public void g(x6.d dVar) {
        this.f21617e.setSystemGestureInsets(dVar.d());
    }

    @Override // h7.x1
    public void h(x6.d dVar) {
        this.f21617e.setSystemWindowInsets(dVar.d());
    }

    @Override // h7.x1
    public void i(x6.d dVar) {
        this.f21617e.setTappableElementInsets(dVar.d());
    }

    public r1() {
        this.f21617e = q1.c();
    }
}

package y0;

import android.util.Rational;
import android.util.Size;
import s0.d1;
import s0.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rational f44567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f44568d;

    public h(g0 g0Var, Rational rational) {
        this.f44565a = g0Var.b();
        this.f44566b = g0Var.k();
        this.f44567c = rational;
        boolean z11 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z11 = false;
        }
        this.f44568d = z11;
    }

    public final Size a(d1 d1Var) {
        int iW = d1Var.w(0);
        Size size = (Size) d1Var.i(d1.D0, null);
        if (size != null) {
            int iP = z20.b.p(z20.b.D(iW), this.f44565a, 1 == this.f44566b);
            if (iP == 90 || iP == 270) {
                return new Size(size.getHeight(), size.getWidth());
            }
        }
        return size;
    }
}

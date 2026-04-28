package h7;

import android.view.View;
import android.view.WindowInsetsAnimation;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends n1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f21592e;

    public m1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f21592e = windowInsetsAnimation;
    }

    public static x6.d f(WindowInsetsAnimation.Bounds bounds) {
        return x6.d.c(bounds.getUpperBound());
    }

    public static x6.d g(WindowInsetsAnimation.Bounds bounds) {
        return x6.d.c(bounds.getLowerBound());
    }

    public static void h(View view, WindowInsetsAnimationCompat$Callback windowInsetsAnimationCompat$Callback) {
        view.setWindowInsetsAnimationCallback(windowInsetsAnimationCompat$Callback != null ? new l1(windowInsetsAnimationCompat$Callback) : null);
    }

    @Override // h7.n1
    public final float a() {
        return this.f21592e.getAlpha();
    }

    @Override // h7.n1
    public final long b() {
        return this.f21592e.getDurationMillis();
    }

    @Override // h7.n1
    public final float c() {
        return this.f21592e.getInterpolatedFraction();
    }

    @Override // h7.n1
    public final int d() {
        return this.f21592e.getTypeMask();
    }

    @Override // h7.n1
    public final void e(float f11) {
        this.f21592e.setFraction(f11);
    }
}

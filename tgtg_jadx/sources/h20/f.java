package h20;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f21266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f21267b;

    public f(h hVar, float f11) {
        this.f21267b = hVar;
        this.f21266a = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f21267b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f21266a);
    }
}

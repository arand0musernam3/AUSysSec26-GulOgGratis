package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3684b;

    public /* synthetic */ d0(Object obj, int i11) {
        this.f3683a = i11;
        this.f3684b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3683a) {
            case 0:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                e0 e0Var = (e0) this.f3684b;
                e0Var.f3694c.setAlpha(iFloatValue);
                e0Var.f3695d.setAlpha(iFloatValue);
                e0Var.f3709s.invalidate();
                break;
            default:
                ((j0) this.f3684b).f3787m = valueAnimator.getAnimatedFraction();
                break;
        }
    }
}

package e20;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15677a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15679c;

    public k(c50.w wVar, View[] viewArr) {
        this.f15678b = wVar;
        this.f15679c = viewArr;
    }

    public static k a(View... viewArr) {
        return new k(new c50.w(24), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15677a) {
            case 0:
                for (View view : (View[]) this.f15679c) {
                    switch (((c50.w) this.f15678b).f7648a) {
                        case 23:
                            view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        case 24:
                            view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        case 25:
                            Float f11 = (Float) valueAnimator.getAnimatedValue();
                            view.setScaleX(f11.floatValue());
                            view.setScaleY(f11.floatValue());
                            break;
                        default:
                            view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                    }
                }
                break;
            default:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oa.c cVar = (oa.c) this.f15679c;
                oa.b bVar = (oa.b) this.f15678b;
                oa.c.d(fFloatValue, bVar);
                cVar.a(fFloatValue, bVar, false);
                cVar.invalidateSelf();
                break;
        }
    }

    public k(oa.c cVar, oa.b bVar) {
        this.f15679c = cVar;
        this.f15678b = bVar;
    }
}

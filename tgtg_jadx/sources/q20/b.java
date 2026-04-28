package q20;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f35909b;

    public /* synthetic */ b(g gVar, int i11) {
        this.f35908a = i11;
        this.f35909b = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35908a) {
            case 0:
                this.f35909b.f35938i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f fVar = this.f35909b.f35938i;
                fVar.setScaleX(fFloatValue);
                fVar.setScaleY(fFloatValue);
                break;
            case 2:
                this.f35909b.f35938i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                this.f35909b.f35938i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}

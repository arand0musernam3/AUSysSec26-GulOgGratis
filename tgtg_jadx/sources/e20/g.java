package e20;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f15655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f15656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15657d;

    public g(ActionMenuView actionMenuView, ActionMenuView actionMenuView2) {
        this.f15654a = 0;
        this.f15655b = actionMenuView;
        this.f15656c = actionMenuView2;
        this.f15657d = new float[2];
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15654a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr = (float[]) this.f15657d;
                i0.a(fFloatValue, fArr);
                View view = this.f15655b;
                if (view != null) {
                    view.setAlpha(fArr[0]);
                }
                View view2 = this.f15656c;
                if (view2 != null) {
                    view2.setAlpha(fArr[1]);
                }
                break;
            default:
                ((s20.f) this.f15657d).c(this.f15655b, this.f15656c, valueAnimator.getAnimatedFraction());
                break;
        }
    }

    public g(s20.f fVar, View view, View view2) {
        this.f15654a = 1;
        this.f15657d = fVar;
        this.f15655b = view;
        this.f15656c = view2;
    }
}

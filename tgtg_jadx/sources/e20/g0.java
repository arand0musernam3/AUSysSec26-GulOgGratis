package e20;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f15659b;

    public /* synthetic */ g0(int i11, View view) {
        this.f15658a = i11;
        this.f15659b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15658a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) this.f15659b;
                textView.setScaleX(fFloatValue);
                textView.setScaleY(fFloatValue);
                break;
            case 1:
                ((TabLayout) this.f15659b).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 2:
                ((TextInputLayout) this.f15659b).C1.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.f15659b.invalidate();
                break;
        }
    }
}

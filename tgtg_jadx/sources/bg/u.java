package bg;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.util.Consumer;
import co.datadome.sdk.ChallengeActivity;
import com.app.tgtg.R;
import com.app.tgtg.customview.FavoriteIconView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6235c;

    public /* synthetic */ u(boolean z11, ChallengeActivity challengeActivity) {
        this.f6233a = 1;
        this.f6234b = z11;
        this.f6235c = challengeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f6233a;
        mc.a aVar = null;
        final boolean z11 = this.f6234b;
        Object obj = this.f6235c;
        switch (i11) {
            case 0:
                final View view = (View) obj;
                int i12 = FavoriteIconView.f8904b;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.3f);
                valueAnimatorOfFloat.setInterpolator(new OvershootInterpolator());
                valueAnimatorOfFloat.setDuration(250L);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bg.v
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i13 = i;
                        View view2 = view;
                        switch (i13) {
                            case 0:
                                int i14 = FavoriteIconView.f8904b;
                                valueAnimator.getClass();
                                Object animatedValue = valueAnimator.getAnimatedValue();
                                animatedValue.getClass();
                                view2.setScaleX(((Float) animatedValue).floatValue());
                                Object animatedValue2 = valueAnimator.getAnimatedValue();
                                animatedValue2.getClass();
                                view2.setScaleY(((Float) animatedValue2).floatValue());
                                break;
                            default:
                                int i15 = FavoriteIconView.f8904b;
                                valueAnimator.getClass();
                                Object animatedValue3 = valueAnimator.getAnimatedValue();
                                animatedValue3.getClass();
                                view2.setScaleX(((Float) animatedValue3).floatValue());
                                Object animatedValue4 = valueAnimator.getAnimatedValue();
                                animatedValue4.getClass();
                                view2.setScaleY(((Float) animatedValue4).floatValue());
                                break;
                        }
                    }
                });
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.3f, 1.0f);
                valueAnimatorOfFloat2.setInterpolator(new AccelerateInterpolator());
                valueAnimatorOfFloat2.setDuration(100L);
                final int i13 = 1;
                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bg.v
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i132 = i13;
                        View view2 = view;
                        switch (i132) {
                            case 0:
                                int i14 = FavoriteIconView.f8904b;
                                valueAnimator.getClass();
                                Object animatedValue = valueAnimator.getAnimatedValue();
                                animatedValue.getClass();
                                view2.setScaleX(((Float) animatedValue).floatValue());
                                Object animatedValue2 = valueAnimator.getAnimatedValue();
                                animatedValue2.getClass();
                                view2.setScaleY(((Float) animatedValue2).floatValue());
                                break;
                            default:
                                int i15 = FavoriteIconView.f8904b;
                                valueAnimator.getClass();
                                Object animatedValue3 = valueAnimator.getAnimatedValue();
                                animatedValue3.getClass();
                                view2.setScaleX(((Float) animatedValue3).floatValue());
                                Object animatedValue4 = valueAnimator.getAnimatedValue();
                                animatedValue4.getClass();
                                view2.setScaleY(((Float) animatedValue4).floatValue());
                                break;
                        }
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(valueAnimatorOfFloat).before(valueAnimatorOfFloat2);
                c70.b bVar = new c70.b(null, null, 15);
                bVar.f7798b = new Consumer() { // from class: bg.w
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj2) {
                        int i14 = FavoriteIconView.f8904b;
                        ((Animator) obj2).getClass();
                        view.setBackgroundResource(z11 ? R.drawable.system_icon_heart_active_neutral_80 : R.drawable.system_icon_heart_active_neutral_10);
                    }
                };
                animatorSet.addListener(bVar);
                animatorSet.start();
                break;
            case 1:
                ChallengeActivity challengeActivity = (ChallengeActivity) obj;
                KProperty[] kPropertyArr = ChallengeActivity.f8613m;
                if (z11) {
                    challengeActivity.overridePendingTransition(0, 0);
                }
                mc.a aVar2 = challengeActivity.f8615b;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    aVar = aVar2;
                }
                ((ConstraintLayout) aVar.f29922b).setAlpha(z11 ? 0.0f : 1.0f);
                challengeActivity.getWindow().setBackgroundDrawable(new ColorDrawable(z11 ? 0 : -1));
                break;
            default:
                yi.r rVar = (yi.r) obj;
                if (rVar.isAdded()) {
                    rVar.f46019j = z11;
                    rVar.v().b();
                }
                break;
        }
    }

    public /* synthetic */ u(Object obj, boolean z11, int i11) {
        this.f6233a = i11;
        this.f6235c = obj;
        this.f6234b = z11;
    }
}

package yn;

import android.view.ViewPropertyAnimator;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f46303b;

    public /* synthetic */ m(ConstraintLayout constraintLayout, int i11) {
        this.f46302a = i11;
        this.f46303b = constraintLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46302a) {
            case 0:
                ConstraintLayout constraintLayout = this.f46303b;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = constraintLayout.animate();
                viewPropertyAnimatorAnimate.setDuration(400L);
                viewPropertyAnimatorAnimate.alpha(0.0f);
                viewPropertyAnimatorAnimate.translationY(-40.0f);
                viewPropertyAnimatorAnimate.setStartDelay(3000L);
                viewPropertyAnimatorAnimate.start();
                viewPropertyAnimatorAnimate.withEndAction(new m(constraintLayout, 1));
                break;
            case 1:
                this.f46303b.setVisibility(8);
                break;
            case 2:
                ConstraintLayout constraintLayout2 = this.f46303b;
                ViewPropertyAnimator viewPropertyAnimatorAnimate2 = constraintLayout2.animate();
                viewPropertyAnimatorAnimate2.setDuration(600L);
                viewPropertyAnimatorAnimate2.alpha(0.0f);
                viewPropertyAnimatorAnimate2.translationY(-40.0f);
                viewPropertyAnimatorAnimate2.setStartDelay(3000L);
                viewPropertyAnimatorAnimate2.start();
                viewPropertyAnimatorAnimate2.withEndAction(new m(constraintLayout2, 3));
                break;
            default:
                this.f46303b.setVisibility(8);
                break;
        }
    }
}

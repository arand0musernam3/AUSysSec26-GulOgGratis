package t20;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f39670b;

    public /* synthetic */ b(c cVar, int i11) {
        this.f39669a = i11;
        this.f39670b = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f39669a) {
            case 1:
                this.f39670b.f39721b.g(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f39669a) {
            case 0:
                this.f39670b.f39721b.g(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}

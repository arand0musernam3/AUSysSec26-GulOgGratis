package q20;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f35907b;

    public /* synthetic */ a(g gVar, int i11) {
        this.f35906a = i11;
        this.f35907b = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35906a) {
            case 0:
                this.f35907b.c();
                break;
            case 1:
                this.f35907b.d();
                break;
            case 2:
                this.f35907b.c();
                break;
            default:
                this.f35907b.d();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f35906a) {
            case 1:
                g gVar = this.f35907b;
                SnackbarContentLayout snackbarContentLayout = gVar.f35939j;
                int i11 = gVar.f35932c;
                int i12 = gVar.f35930a;
                int i13 = i11 - i12;
                snackbarContentLayout.f12605a.setAlpha(0.0f);
                long j9 = i12;
                ViewPropertyAnimator duration = snackbarContentLayout.f12605a.animate().alpha(1.0f).setDuration(j9);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f12607c;
                long j11 = i13;
                duration.setInterpolator(timeInterpolator).setStartDelay(j11).start();
                if (snackbarContentLayout.f12606b.getVisibility() == 0) {
                    snackbarContentLayout.f12606b.setAlpha(0.0f);
                    snackbarContentLayout.f12606b.animate().alpha(1.0f).setDuration(j9).setInterpolator(timeInterpolator).setStartDelay(j11).start();
                }
                break;
            case 2:
                g gVar2 = this.f35907b;
                SnackbarContentLayout snackbarContentLayout2 = gVar2.f35939j;
                int i14 = gVar2.f35931b;
                snackbarContentLayout2.f12605a.setAlpha(1.0f);
                long j12 = i14;
                ViewPropertyAnimator duration2 = snackbarContentLayout2.f12605a.animate().alpha(0.0f).setDuration(j12);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.f12607c;
                long j13 = 0;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(j13).start();
                if (snackbarContentLayout2.f12606b.getVisibility() == 0) {
                    snackbarContentLayout2.f12606b.setAlpha(1.0f);
                    snackbarContentLayout2.f12606b.animate().alpha(0.0f).setDuration(j12).setInterpolator(timeInterpolator2).setStartDelay(j13).start();
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ a(g gVar, int i11, int i12) {
        this.f35906a = i12;
        this.f35907b = gVar;
    }
}

package i20;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f22992b;

    public /* synthetic */ i(j jVar, int i11) {
        this.f22991a = i11;
        this.f22992b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f22991a) {
            case 1:
                super.onAnimationEnd(animator);
                j jVar = this.f22992b;
                jVar.d();
                androidx.vectordrawable.graphics.drawable.c cVar = jVar.f23004j;
                if (cVar != null) {
                    cVar.onAnimationEnd((r) jVar.f7113a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f22991a) {
            case 0:
                super.onAnimationRepeat(animator);
                j jVar = this.f22992b;
                jVar.f23001g = (jVar.f23001g + j.l.length) % jVar.f23000f.f22957e.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}

package i20;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f23072b;

    public /* synthetic */ u(v vVar, int i11) {
        this.f23071a = i11;
        this.f23072b = vVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f23071a) {
            case 1:
                super.onAnimationEnd(animator);
                v vVar = this.f23072b;
                vVar.d();
                androidx.vectordrawable.graphics.drawable.c cVar = vVar.f23082j;
                if (cVar != null) {
                    cVar.onAnimationEnd((r) vVar.f7113a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f23071a) {
            case 0:
                super.onAnimationRepeat(animator);
                v vVar = this.f23072b;
                vVar.f23079g = (vVar.f23079g + 1) % vVar.f23078f.f22957e.length;
                vVar.f23080h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}

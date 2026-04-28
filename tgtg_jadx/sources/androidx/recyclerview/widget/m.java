package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3813a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r2 f3814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f3817e;

    public m(r rVar, r2 r2Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3817e = rVar;
        this.f3814b = r2Var;
        this.f3816d = viewPropertyAnimator;
        this.f3815c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3813a) {
            case 1:
                this.f3815c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3813a) {
            case 0:
                this.f3816d.setListener(null);
                this.f3815c.setAlpha(1.0f);
                r rVar = this.f3817e;
                r2 r2Var = this.f3814b;
                rVar.c(r2Var);
                rVar.f3897q.remove(r2Var);
                rVar.i();
                break;
            default:
                this.f3816d.setListener(null);
                r rVar2 = this.f3817e;
                r2 r2Var2 = this.f3814b;
                rVar2.c(r2Var2);
                rVar2.f3895o.remove(r2Var2);
                rVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3813a) {
            case 0:
                this.f3817e.getClass();
                break;
            default:
                this.f3817e.getClass();
                break;
        }
    }

    public m(r rVar, r2 r2Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3817e = rVar;
        this.f3814b = r2Var;
        this.f3815c = view;
        this.f3816d = viewPropertyAnimator;
    }
}

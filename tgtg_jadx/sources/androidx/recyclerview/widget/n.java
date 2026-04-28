package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r2 f3818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f3823f;

    public n(r rVar, r2 r2Var, int i11, View view, int i12, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3823f = rVar;
        this.f3818a = r2Var;
        this.f3819b = i11;
        this.f3820c = view;
        this.f3821d = i12;
        this.f3822e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i11 = this.f3819b;
        View view = this.f3820c;
        if (i11 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f3821d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3822e.setListener(null);
        r rVar = this.f3823f;
        r2 r2Var = this.f3818a;
        rVar.c(r2Var);
        rVar.f3896p.remove(r2Var);
        rVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3823f.getClass();
    }
}

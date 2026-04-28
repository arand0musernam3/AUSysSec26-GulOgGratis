package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f3840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f3842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f3843e;

    public /* synthetic */ o(r rVar, p pVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i11) {
        this.f3839a = i11;
        this.f3843e = rVar;
        this.f3840b = pVar;
        this.f3841c = viewPropertyAnimator;
        this.f3842d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3839a) {
            case 0:
                this.f3841c.setListener(null);
                View view = this.f3842d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                p pVar = this.f3840b;
                r2 r2Var = pVar.f3844a;
                r rVar = this.f3843e;
                rVar.c(r2Var);
                rVar.f3898r.remove(pVar.f3844a);
                rVar.i();
                break;
            default:
                this.f3841c.setListener(null);
                View view2 = this.f3842d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                p pVar2 = this.f3840b;
                r2 r2Var2 = pVar2.f3845b;
                r rVar2 = this.f3843e;
                rVar2.c(r2Var2);
                rVar2.f3898r.remove(pVar2.f3845b);
                rVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3839a) {
            case 0:
                this.f3843e.getClass();
                break;
            default:
                this.f3843e.getClass();
                break;
        }
    }
}

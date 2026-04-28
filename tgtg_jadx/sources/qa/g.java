package qa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f36670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36671b = false;

    public g(View view) {
        this.f36670a = view;
    }

    @Override // qa.w
    public final void b() {
        View view = this.f36670a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? k0.f36692a.d(view) : 0.0f));
    }

    @Override // qa.w
    public final void f() {
        this.f36670a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        k0.f36692a.f(this.f36670a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z11) {
        boolean z12 = this.f36671b;
        View view = this.f36670a;
        if (z12) {
            view.setLayerType(0, null);
        }
        if (z11) {
            return;
        }
        l0 l0Var = k0.f36692a;
        l0Var.f(view, 1.0f);
        l0Var.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f36670a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f36671b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // qa.w
    public final void a(y yVar) {
    }

    @Override // qa.w
    public final void c(y yVar) {
    }

    @Override // qa.w
    public final void d(y yVar) {
    }

    @Override // qa.w
    public final void g(y yVar) {
    }
}

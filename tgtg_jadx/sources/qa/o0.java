package qa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends AnimatorListenerAdapter implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f36706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f36707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f36708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36709d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q0 f36710e;

    public o0(q0 q0Var, ViewGroup viewGroup, View view, View view2) {
        this.f36710e = q0Var;
        this.f36706a = viewGroup;
        this.f36707b = view;
        this.f36708c = view2;
    }

    @Override // qa.w
    public final void c(y yVar) {
        yVar.F(this);
    }

    @Override // qa.w
    public final void g(y yVar) {
        if (this.f36709d) {
            h();
        }
    }

    public final void h() {
        this.f36708c.setTag(R.id.save_overlay_view, null);
        this.f36706a.getOverlay().remove(this.f36707b);
        this.f36709d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z11) {
        if (z11) {
            return;
        }
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f36706a.getOverlay().remove(this.f36707b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f36707b;
        if (view.getParent() == null) {
            ViewCompat.b(view, this.f36706a);
        } else {
            this.f36710e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z11) {
        if (z11) {
            View view = this.f36708c;
            View view2 = this.f36707b;
            view.setTag(R.id.save_overlay_view, view2);
            ViewCompat.b(view2, this.f36706a);
            this.f36709d = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // qa.w
    public final void b() {
    }

    @Override // qa.w
    public final void f() {
    }

    @Override // qa.w
    public final void a(y yVar) {
    }
}

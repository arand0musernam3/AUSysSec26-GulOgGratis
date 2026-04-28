package qa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends AnimatorListenerAdapter implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f36698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f36700c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36703f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f36701d = true;

    public n0(int i11, View view) {
        this.f36698a = view;
        this.f36699b = i11;
        this.f36700c = (ViewGroup) view.getParent();
        h(true);
    }

    @Override // qa.w
    public final void b() {
        h(false);
        if (this.f36703f) {
            return;
        }
        k0.b(this.f36699b, this.f36698a);
    }

    @Override // qa.w
    public final void c(y yVar) {
        yVar.F(this);
    }

    @Override // qa.w
    public final void f() {
        h(true);
        if (this.f36703f) {
            return;
        }
        k0.b(0, this.f36698a);
    }

    public final void h(boolean z11) {
        ViewGroup viewGroup;
        if (!this.f36701d || this.f36702e == z11 || (viewGroup = this.f36700c) == null) {
            return;
        }
        this.f36702e = z11;
        s.g(viewGroup, z11);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f36703f = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z11) {
        if (z11) {
            return;
        }
        if (!this.f36703f) {
            k0.b(this.f36699b, this.f36698a);
            ViewGroup viewGroup = this.f36700c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z11) {
        if (z11) {
            k0.b(0, this.f36698a);
            ViewGroup viewGroup = this.f36700c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f36703f) {
            k0.b(this.f36699b, this.f36698a);
            ViewGroup viewGroup = this.f36700c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // qa.w
    public final void a(y yVar) {
    }

    @Override // qa.w
    public final void g(y yVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}

package qa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends AnimatorListenerAdapter implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f36677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f36678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f36679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f36680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f36681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f36682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f36683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f36684h;

    public i0(View view, View view2, float f11, float f12) {
        this.f36678b = view;
        this.f36677a = view2;
        this.f36682f = f11;
        this.f36683g = f12;
        int[] iArr = (int[]) view2.getTag(R.id.transition_position);
        this.f36679c = iArr;
        if (iArr != null) {
            view2.setTag(R.id.transition_position, null);
        }
    }

    @Override // qa.w
    public final void b() {
        if (this.f36679c == null) {
            this.f36679c = new int[2];
        }
        int[] iArr = this.f36679c;
        View view = this.f36678b;
        view.getLocationOnScreen(iArr);
        this.f36677a.setTag(R.id.transition_position, this.f36679c);
        this.f36680d = view.getTranslationX();
        this.f36681e = view.getTranslationY();
        view.setTranslationX(this.f36682f);
        view.setTranslationY(this.f36683g);
    }

    @Override // qa.w
    public final void c(y yVar) {
        e(yVar);
    }

    @Override // qa.w
    public final void e(y yVar) {
        if (this.f36684h) {
            return;
        }
        this.f36677a.setTag(R.id.transition_position, null);
    }

    @Override // qa.w
    public final void f() {
        float f11 = this.f36680d;
        View view = this.f36678b;
        view.setTranslationX(f11);
        view.setTranslationY(this.f36681e);
    }

    @Override // qa.w
    public final void g(y yVar) {
        this.f36684h = true;
        float f11 = this.f36682f;
        View view = this.f36678b;
        view.setTranslationX(f11);
        view.setTranslationY(this.f36683g);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f36684h = true;
        float f11 = this.f36682f;
        View view = this.f36678b;
        view.setTranslationX(f11);
        view.setTranslationY(this.f36683g);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z11) {
        if (z11) {
            return;
        }
        float f11 = this.f36682f;
        View view = this.f36678b;
        view.setTranslationX(f11);
        view.setTranslationY(this.f36683g);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // qa.w
    public final void a(y yVar) {
    }
}

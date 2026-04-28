package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f3779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r2 f3780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ValueAnimator f3782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f3784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3786k = false;
    public boolean l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f3787m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3788n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r2 f3789o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p0 f3790p;

    public j0(p0 p0Var, r2 r2Var, int i11, float f11, float f12, float f13, float f14, int i12, r2 r2Var2) {
        this.f3790p = p0Var;
        this.f3788n = i12;
        this.f3789o = r2Var2;
        this.f3781f = i11;
        this.f3780e = r2Var;
        this.f3776a = f11;
        this.f3777b = f12;
        this.f3778c = f13;
        this.f3779d = f14;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3782g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new d0(this, 1));
        valueAnimatorOfFloat.setTarget(r2Var.itemView);
        valueAnimatorOfFloat.addListener(this);
        this.f3787m = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.l) {
            this.f3780e.setIsRecyclable(true);
        }
        this.l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3787m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.f3786k) {
            return;
        }
        int i11 = this.f3788n;
        r2 r2Var = this.f3789o;
        p0 p0Var = this.f3790p;
        if (i11 <= 0) {
            p0Var.f3861m.clearView(p0Var.f3866r, r2Var);
        } else {
            p0Var.f3850a.add(r2Var.itemView);
            this.f3783h = true;
            if (i11 > 0) {
                p0Var.f3866r.post(new k0(p0Var, this, i11, 0));
            }
        }
        View view = p0Var.f3871w;
        View view2 = r2Var.itemView;
        if (view == view2 && view2 == view) {
            p0Var.f3871w = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}

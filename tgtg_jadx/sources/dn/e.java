package dn;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;
import bg.t;
import com.app.tgtg.R;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import pg.c2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f14991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f14992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f14993c;

    public e(boolean z11, f fVar, Pair pair) {
        this.f14991a = z11;
        this.f14992b = fVar;
        this.f14993c = pair;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        f fVar = this.f14992b;
        c2 c2Var = fVar.f14994a;
        Object obj = this.f14993c.f26486b;
        int i11 = 1;
        if (!this.f14991a) {
            if (((Number) obj).intValue() == 100) {
                ProgressBar progressBar = c2Var.D;
                progressBar.getClass();
                progressBar.setVisibility(8);
                new Handler(Looper.getMainLooper()).postDelayed(new c(fVar, i11), 2000);
                return;
            }
            return;
        }
        int iIntValue = ((Number) obj).intValue();
        if (!fVar.f15003j || Intrinsics.areEqual(fVar.f14999f, Boolean.TRUE)) {
            return;
        }
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        View view = c2Var.f986f;
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(argbEvaluator, Integer.valueOf(view.getContext().getColor(R.color.neutral_30)), Integer.valueOf(view.getContext().getColor(R.color.primary_30)));
        valueAnimatorOfObject.setDuration(100L);
        valueAnimatorOfObject.addUpdateListener(new t(fVar, i11));
        new Handler(Looper.getMainLooper()).post(new d1.e(valueAnimatorOfObject, 4));
        c2Var.f34815s.setText(androidx.core.app.e.g(view.getContext(), R.string.mnu_basket_banner_can_checkout));
        c2Var.f34821y.setText(androidx.core.app.e.g(view.getContext(), R.string.mnu_basket_banner_enabled_title));
        if (iIntValue == 100) {
            ProgressBar progressBar2 = c2Var.D;
            progressBar2.getClass();
            progressBar2.setVisibility(8);
            new Handler(Looper.getMainLooper()).postDelayed(new c(fVar, 0), 2000);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}

package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.animation.Animation;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Animation f3310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatorSet f3311b;

    public p0(Animator animator) {
        this.f3310a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3311b = animatorSet;
        animatorSet.play(animator);
    }

    public p0(Animation animation) {
        this.f3310a = animation;
        this.f3311b = null;
    }
}

package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m2 f3175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f3178d;

    public e(m2 m2Var, ViewGroup viewGroup, View view, f fVar) {
        this.f3175a = m2Var;
        this.f3176b = viewGroup;
        this.f3177c = view;
        this.f3178d = fVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.f3176b;
        viewGroup.post(new a40.q(viewGroup, this.f3177c, this.f3178d, 1));
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f3175a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f3175a + " has reached onAnimationStart.");
        }
    }
}

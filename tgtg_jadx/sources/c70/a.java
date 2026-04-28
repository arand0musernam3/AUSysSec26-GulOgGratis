package c70;

import android.view.animation.Animation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f7795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function1 f7796b;

    public a(Function1 function1, Function1 function12) {
        this.f7795a = function1;
        this.f7796b = function12;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        Function1 function1 = this.f7796b;
        if (function1 != null) {
            function1.invoke(animation);
        }
        this.f7796b = null;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        this.f7795a.invoke(animation);
    }
}

package g20;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f18293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f18295c;

    public j(k kVar, boolean z11, int i11) {
        this.f18295c = kVar;
        this.f18293a = z11;
        this.f18294b = i11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k kVar = this.f18295c;
        kVar.f18275b.setTranslationX(0.0f);
        kVar.d(this.f18294b, 0.0f, this.f18293a);
    }
}

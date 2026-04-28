package u10;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f40626b;

    public /* synthetic */ a(g gVar, int i11) {
        this.f40625a = i11;
        this.f40626b = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40625a) {
            case 0:
                this.f40626b.b();
                break;
            default:
                g gVar = this.f40626b;
                f revealInfo = gVar.getRevealInfo();
                revealInfo.f40634c = Float.MAX_VALUE;
                gVar.setRevealInfo(revealInfo);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f40625a) {
            case 0:
                this.f40626b.a();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}

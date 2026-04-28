package o10;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f31788b;

    public /* synthetic */ a(BottomAppBar bottomAppBar, int i11) {
        this.f31787a = i11;
        this.f31788b = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i11 = this.f31787a;
        BottomAppBar bottomAppBar = this.f31788b;
        switch (i11) {
            case 1:
                int i12 = BottomAppBar.B1;
                bottomAppBar.f12283f1 = null;
                break;
            case 2:
                int i13 = BottomAppBar.B1;
                bottomAppBar.f12298t1 = false;
                bottomAppBar.f12284g1 = null;
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i11 = this.f31787a;
        BottomAppBar bottomAppBar = this.f31788b;
        switch (i11) {
            case 0:
                if (!bottomAppBar.f12298t1) {
                    bottomAppBar.G(bottomAppBar.f12286h1, bottomAppBar.f12299u1);
                }
                break;
            case 1:
                int i12 = BottomAppBar.B1;
                break;
            case 2:
                int i13 = BottomAppBar.B1;
                break;
            default:
                bottomAppBar.f12304z1.onAnimationStart(animator);
                View viewC = bottomAppBar.C();
                FloatingActionButton floatingActionButton = viewC instanceof FloatingActionButton ? (FloatingActionButton) viewC : null;
                if (floatingActionButton != null) {
                    floatingActionButton.setTranslationX(bottomAppBar.getFabTranslationX());
                }
                break;
        }
    }
}

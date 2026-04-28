package o10;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f31791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f31792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f31794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f31795e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i11, boolean z11) {
        this.f31795e = bottomAppBar;
        this.f31792b = actionMenuView;
        this.f31793c = i11;
        this.f31794d = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f31791a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f31791a) {
            return;
        }
        BottomAppBar bottomAppBar = this.f31795e;
        int i11 = bottomAppBar.f12297s1;
        boolean z11 = i11 != 0;
        if (i11 != 0) {
            bottomAppBar.f12297s1 = 0;
            bottomAppBar.getMenu().clear();
            bottomAppBar.m(i11);
        }
        bottomAppBar.K(this.f31792b, this.f31793c, this.f31794d, z11);
    }
}

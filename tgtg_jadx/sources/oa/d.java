package oa;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f32254b;

    public /* synthetic */ d(SwipeRefreshLayout swipeRefreshLayout, int i11) {
        this.f32253a = i11;
        this.f32254b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        h hVar;
        switch (this.f32253a) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout = this.f32254b;
                if (!swipeRefreshLayout.f4007c) {
                    swipeRefreshLayout.l();
                } else {
                    swipeRefreshLayout.B.setAlpha(255);
                    swipeRefreshLayout.B.start();
                    if (swipeRefreshLayout.H && (hVar = swipeRefreshLayout.f4006b) != null) {
                        hVar.onRefresh();
                    }
                    swipeRefreshLayout.f4017n = swipeRefreshLayout.f4024u.getTop();
                }
                break;
            default:
                SwipeRefreshLayout swipeRefreshLayout2 = this.f32254b;
                if (!swipeRefreshLayout2.f4022s) {
                    swipeRefreshLayout2.p(null);
                }
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i11 = this.f32253a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i11 = this.f32253a;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}

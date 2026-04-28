package oa;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f32256b;

    public /* synthetic */ e(SwipeRefreshLayout swipeRefreshLayout, int i11) {
        this.f32255a = i11;
        this.f32256b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f11, Transformation transformation) {
        switch (this.f32255a) {
            case 0:
                this.f32256b.setAnimationProgress(f11);
                break;
            case 1:
                this.f32256b.setAnimationProgress(1.0f - f11);
                break;
            case 2:
                SwipeRefreshLayout swipeRefreshLayout = this.f32256b;
                boolean z11 = swipeRefreshLayout.J;
                int iAbs = swipeRefreshLayout.f4029z;
                if (!z11) {
                    iAbs -= Math.abs(swipeRefreshLayout.f4028y);
                }
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.f4026w + ((int) ((iAbs - r0) * f11))) - swipeRefreshLayout.f4024u.getTop());
                c cVar = swipeRefreshLayout.B;
                float f12 = 1.0f - f11;
                b bVar = cVar.f32247a;
                if (f12 != bVar.f32238p) {
                    bVar.f32238p = f12;
                }
                cVar.invalidateSelf();
                break;
            case 3:
                this.f32256b.k(f11);
                break;
            default:
                SwipeRefreshLayout swipeRefreshLayout2 = this.f32256b;
                float f13 = swipeRefreshLayout2.f4027x;
                swipeRefreshLayout2.setAnimationProgress(((-f13) * f11) + f13);
                swipeRefreshLayout2.k(f11);
                break;
        }
    }
}

package oa;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f32259c;

    public f(SwipeRefreshLayout swipeRefreshLayout, int i11, int i12) {
        this.f32259c = swipeRefreshLayout;
        this.f32257a = i11;
        this.f32258b = i12;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f11, Transformation transformation) {
        this.f32259c.B.setAlpha((int) (((this.f32258b - r0) * f11) + this.f32257a));
    }
}

package e20;

import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f15582a;

    public a0(TimeInterpolator timeInterpolator) {
        this.f15582a = timeInterpolator;
    }

    public static TimeInterpolator a(boolean z11, TimeInterpolator timeInterpolator) {
        return z11 ? timeInterpolator : new a0(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f11) {
        return 1.0f - this.f15582a.getInterpolation(f11);
    }
}

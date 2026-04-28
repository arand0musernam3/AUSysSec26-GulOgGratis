package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3812a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f11) {
        switch (this.f3812a) {
            case 0:
                return f11 * f11 * f11 * f11 * f11;
            case 1:
            default:
                float f12 = f11 - 1.0f;
                return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }
}

package q6;

import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f36306a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f36307b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f36308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f36309d;

    public t(MotionLayout motionLayout) {
        this.f36309d = motionLayout;
    }

    @Override // q6.r
    public final float a() {
        return this.f36309d.f2265d;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f11) {
        float f12 = this.f36306a;
        float f13 = this.f36308c;
        MotionLayout motionLayout = this.f36309d;
        if (f12 > 0.0f) {
            float f14 = f12 / f13;
            if (f14 < f11) {
                f11 = f14;
            }
            float f15 = f13 * f11;
            motionLayout.f2265d = f12 - f15;
            return ((f12 * f11) - ((f15 * f11) / 2.0f)) + this.f36307b;
        }
        float f16 = (-f12) / f13;
        if (f16 < f11) {
            f11 = f16;
        }
        float f17 = f13 * f11;
        motionLayout.f2265d = f17 + f12;
        return ((f17 * f11) / 2.0f) + (f12 * f11) + this.f36307b;
    }
}

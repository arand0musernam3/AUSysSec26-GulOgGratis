package no;

import android.view.animation.OvershootInterpolator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements t1.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31200a;

    @Override // t1.u
    public final float a(float f11) {
        float f12;
        float f13;
        switch (this.f31200a) {
            case 0:
                return new OvershootInterpolator().getInterpolation(f11);
            case 1:
                if (f11 == 0.0f) {
                    return 0.0f;
                }
                if (f11 == 1.0f) {
                    return 1.0f;
                }
                return (float) ((Math.sin(((double) ((f11 * 10.0f) - 0.75f)) * 2.0943951023931953d) * ((double) ((float) Math.pow(2.0f, (-10.0f) * f11)))) + ((double) 1.0f));
            case 2:
                if (f11 < 0.36363637f) {
                    return 7.5625f * f11 * f11;
                }
                if (f11 < 0.72727275f) {
                    float f14 = f11 - 0.54545456f;
                    f12 = 7.5625f * f14 * f14;
                    f13 = 0.75f;
                } else if (f11 < 0.90909094f) {
                    float f15 = f11 - 0.8181818f;
                    f12 = 7.5625f * f15 * f15;
                    f13 = 0.9375f;
                } else {
                    float f16 = f11 - 0.95454544f;
                    f12 = 7.5625f * f16 * f16;
                    f13 = 0.984375f;
                }
                return f12 + f13;
            default:
                return f11;
        }
    }
}

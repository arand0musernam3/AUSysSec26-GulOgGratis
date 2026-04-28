package h7;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f21595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f21596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21597d;

    public n1(int i11, Interpolator interpolator, long j9) {
        this.f21594a = i11;
        this.f21596c = interpolator;
        this.f21597d = j9;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f21597d;
    }

    public float c() {
        float f11 = this.f21595b;
        Interpolator interpolator = this.f21596c;
        return interpolator != null ? interpolator.getInterpolation(f11) : f11;
    }

    public int d() {
        return this.f21594a;
    }

    public void e(float f11) {
        this.f21595b = f11;
    }
}

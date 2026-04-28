package k10;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import j4.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f25730a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u8.a f25731b = new u8.a(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u8.a f25732c = new u8.a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u8.a f25733d = new u8.a(u8.a.f40869e);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f25734e = new DecelerateInterpolator();

    public static float a(float f11, float f12, float f13) {
        return s.a(f12, f11, f13, f11);
    }

    public static float b(float f11, float f12, float f13, float f14, float f15) {
        return f15 <= f13 ? f11 : f15 >= f14 ? f12 : a(f11, f12, (f15 - f13) / (f14 - f13));
    }

    public static int c(int i11, float f11, int i12) {
        return Math.round(f11 * (i12 - i11)) + i11;
    }
}

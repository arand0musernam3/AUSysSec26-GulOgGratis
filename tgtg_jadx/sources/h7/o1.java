package h7;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n1 f21602a;

    public o1(int i11, Interpolator interpolator, long j9) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f21602a = new m1(k1.b(i11, interpolator, j9));
        } else {
            this.f21602a = new j1(i11, interpolator, j9);
        }
    }
}

package v1;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f41786a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f41787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f41788c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f41787b = dLog;
        f41788c = dLog - 1.0d;
    }
}

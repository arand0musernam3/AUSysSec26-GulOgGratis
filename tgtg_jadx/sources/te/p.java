package te;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.braze.Constants;
import java.lang.ref.WeakReference;
import q1.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static l1 f40100b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f40099a = new LinearInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a60.n f40101c = a60.n.b(Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a60.n f40102d = a60.n.b("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator pathInterpolator;
        pointF.x = ve.g.b(pointF.x, -1.0f, 1.0f);
        pointF.y = ve.g.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = ve.g.b(pointF2.x, -1.0f, 1.0f);
        float fB = ve.g.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        float f11 = pointF.x;
        float f12 = pointF.y;
        float f13 = pointF2.x;
        Matrix matrix = ve.k.f42293a;
        int i11 = f11 != 0.0f ? (int) (527 * f11) : 17;
        if (f12 != 0.0f) {
            i11 = (int) (i11 * 31 * f12);
        }
        if (f13 != 0.0f) {
            i11 = (int) (i11 * 31 * f13);
        }
        if (fB != 0.0f) {
            i11 = (int) (i11 * 31 * fB);
        }
        he.a aVar = he.e.f21898a;
        synchronized (p.class) {
            if (f40100b == null) {
                f40100b = new l1(0);
            }
            weakReference = (WeakReference) f40100b.b(i11);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e5) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e5.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        he.a aVar2 = he.e.f21898a;
        try {
            WeakReference weakReference2 = new WeakReference(pathInterpolator);
            synchronized (p.class) {
                f40100b.d(i11, weakReference2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return pathInterpolator;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static we.a b(ue.d r24, he.k r25, float r26, te.f0 r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te.p.b(ue.d, he.k, float, te.f0, boolean, boolean):we.a");
    }
}

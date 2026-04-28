package we;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import he.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f43387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f43389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Interpolator f43390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator f43391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Interpolator f43392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f43393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f43394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f43395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f43396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f43397k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f43398m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f43399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f43400o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f43401p;

    public a(Object obj) {
        this.f43395i = -3987645.8f;
        this.f43396j = -3987645.8f;
        this.f43397k = 784923401;
        this.l = 784923401;
        this.f43398m = Float.MIN_VALUE;
        this.f43399n = Float.MIN_VALUE;
        this.f43400o = null;
        this.f43401p = null;
        this.f43387a = null;
        this.f43388b = obj;
        this.f43389c = obj;
        this.f43390d = null;
        this.f43391e = null;
        this.f43392f = null;
        this.f43393g = Float.MIN_VALUE;
        this.f43394h = Float.valueOf(Float.MAX_VALUE);
    }

    public final float a() {
        k kVar = this.f43387a;
        if (kVar == null) {
            return 1.0f;
        }
        if (this.f43399n == Float.MIN_VALUE) {
            if (this.f43394h == null) {
                this.f43399n = 1.0f;
            } else {
                this.f43399n = (float) (((double) b()) + (((double) (this.f43394h.floatValue() - this.f43393g)) / ((double) (kVar.f21937m - kVar.l))));
            }
        }
        return this.f43399n;
    }

    public final float b() {
        k kVar = this.f43387a;
        if (kVar == null) {
            return 0.0f;
        }
        if (this.f43398m == Float.MIN_VALUE) {
            float f11 = kVar.l;
            this.f43398m = (this.f43393g - f11) / (kVar.f21937m - f11);
        }
        return this.f43398m;
    }

    public final boolean c() {
        return this.f43390d == null && this.f43391e == null && this.f43392f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f43388b + ", endValue=" + this.f43389c + ", startFrame=" + this.f43393g + ", endFrame=" + this.f43394h + ", interpolator=" + this.f43390d + '}';
    }

    public a(k kVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f11) {
        this.f43395i = -3987645.8f;
        this.f43396j = -3987645.8f;
        this.f43397k = 784923401;
        this.l = 784923401;
        this.f43398m = Float.MIN_VALUE;
        this.f43399n = Float.MIN_VALUE;
        this.f43400o = null;
        this.f43401p = null;
        this.f43387a = kVar;
        this.f43388b = obj;
        this.f43389c = obj2;
        this.f43390d = null;
        this.f43391e = interpolator;
        this.f43392f = interpolator2;
        this.f43393g = f11;
        this.f43394h = null;
    }

    public a(k kVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f11, Float f12) {
        this.f43395i = -3987645.8f;
        this.f43396j = -3987645.8f;
        this.f43397k = 784923401;
        this.l = 784923401;
        this.f43398m = Float.MIN_VALUE;
        this.f43399n = Float.MIN_VALUE;
        this.f43400o = null;
        this.f43401p = null;
        this.f43387a = kVar;
        this.f43388b = obj;
        this.f43389c = obj2;
        this.f43390d = interpolator;
        this.f43391e = interpolator2;
        this.f43392f = interpolator3;
        this.f43393g = f11;
        this.f43394h = f12;
    }

    public a(k kVar, Object obj, Object obj2, Interpolator interpolator, float f11, Float f12) {
        this.f43395i = -3987645.8f;
        this.f43396j = -3987645.8f;
        this.f43397k = 784923401;
        this.l = 784923401;
        this.f43398m = Float.MIN_VALUE;
        this.f43399n = Float.MIN_VALUE;
        this.f43400o = null;
        this.f43401p = null;
        this.f43387a = kVar;
        this.f43388b = obj;
        this.f43389c = obj2;
        this.f43390d = interpolator;
        this.f43391e = null;
        this.f43392f = null;
        this.f43393g = f11;
        this.f43394h = f12;
    }

    public a(qe.c cVar, qe.c cVar2) {
        this.f43395i = -3987645.8f;
        this.f43396j = -3987645.8f;
        this.f43397k = 784923401;
        this.l = 784923401;
        this.f43398m = Float.MIN_VALUE;
        this.f43399n = Float.MIN_VALUE;
        this.f43400o = null;
        this.f43401p = null;
        this.f43387a = null;
        this.f43388b = cVar;
        this.f43389c = cVar2;
        this.f43390d = null;
        this.f43391e = null;
        this.f43392f = null;
        this.f43393g = Float.MIN_VALUE;
        this.f43394h = Float.valueOf(Float.MAX_VALUE);
    }
}

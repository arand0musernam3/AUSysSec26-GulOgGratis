package i20;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f23047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f23048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f23049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PathMeasure f23050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix f23051e;

    public q(e eVar) {
        Path path = new Path();
        this.f23048b = path;
        this.f23049c = new Path();
        this.f23050d = new PathMeasure(path, false);
        this.f23047a = eVar;
        this.f23051e = new Matrix();
    }

    public static float h(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public abstract void a(Canvas canvas, Rect rect, float f11, boolean z11, boolean z12);

    public abstract void b(int i11, int i12, Canvas canvas, Paint paint);

    public abstract void c(Canvas canvas, Paint paint, o oVar, int i11);

    public abstract void d(Canvas canvas, Paint paint, float f11, float f12, int i11, int i12, int i13);

    public abstract int e();

    public abstract int f();

    public abstract void g();
}

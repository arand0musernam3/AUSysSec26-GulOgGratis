package ve;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import c5.a1;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Matrix f42293a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a1 f42294b = new a1(15);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a1 f42295c = new a1(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a1 f42296d = new a1(17);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a1 f42297e = new a1(18);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f42298f = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f11, float f12, float f13) {
        he.a aVar = he.e.f21898a;
        PathMeasure pathMeasure = (PathMeasure) f42294b.get();
        Path path2 = (Path) f42295c.get();
        Path path3 = (Path) f42296d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f11 == 1.0f && f12 == 0.0f) && length >= 1.0f && Math.abs((f12 - f11) - 1.0f) >= 0.01d) {
            float f14 = f11 * length;
            float f15 = f12 * length;
            float f16 = f13 * length;
            float fMin = Math.min(f14, f15) + f16;
            float fMax = Math.max(f14, f15) + f16;
            if (fMin >= length && fMax >= length) {
                fMin = g.d(fMin, length);
                fMax = g.d(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = g.d(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = g.d(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e5) {
                throw e5;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap d(Bitmap bitmap, int i11, int i12) {
        if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i11, i12, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void e(Canvas canvas, RectF rectF, Paint paint) {
        he.a aVar = he.e.f21898a;
        canvas.saveLayer(rectF, paint);
    }
}

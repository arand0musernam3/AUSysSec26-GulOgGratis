package v0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import j4.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RectF f41634a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix a(RectF rectF, RectF rectF2, int i11, boolean z11) {
        Matrix matrix = new Matrix();
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        RectF rectF3 = f41634a;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i11);
        if (z11) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static int b(Matrix matrix) {
        matrix.getValues(new float[9]);
        return j((int) Math.round(Math.atan2(r0[3], r0[0]) * 57.29577951308232d));
    }

    public static boolean c(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean d(int i11) {
        if (i11 == 90 || i11 == 270) {
            return true;
        }
        if (i11 == 0 || i11 == 180) {
            return false;
        }
        i4.a.f(s.f(i11, "Invalid rotation degrees: "));
        return false;
    }

    public static boolean e(Size size, Size size2) {
        return (((float) size.getWidth()) + 1.0f) / (((float) size.getHeight()) - 1.0f) >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= (((float) size.getWidth()) - 1.0f) / (((float) size.getHeight()) + 1.0f);
    }

    public static boolean f(Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[2];
        float f14 = fArr[3];
        float f15 = (f12 * f14) + (f11 * f13);
        float f16 = (f11 * f14) - (f12 * f13);
        double dSqrt = Math.sqrt((f12 * f12) + (f11 * f11)) * Math.sqrt((f14 * f14) + (f13 * f13));
        return ((float) Math.toDegrees(Math.atan2(((double) f16) / dSqrt, ((double) f15) / dSqrt))) > 0.0f;
    }

    public static Size g(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static Size h(int i11, Size size) {
        pd.g.i("Invalid rotation degrees: " + i11, i11 % 90 == 0);
        return d(j(i11)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static RectF i(Size size) {
        float f11 = 0;
        return new RectF(f11, f11, size.getWidth(), size.getHeight());
    }

    public static int j(int i11) {
        return ((i11 % 360) + 360) % 360;
    }
}

package yd;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Reflection;
import m0.c;
import ud.g;
import ud.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45845a = String.valueOf(Reflection.getOrCreateKotlinClass(a.class).getQualifiedName());

    @Override // yd.b
    public final String a() {
        return this.f45845a;
    }

    @Override // yd.b
    public final Bitmap b(Bitmap bitmap) {
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        float fV = (float) c.V(bitmap.getWidth(), bitmap.getHeight(), iMin, iMin, g.FILL, h.f41059c);
        float f11 = iMin;
        float f12 = 2;
        matrix.setTranslate((f11 - (bitmap.getWidth() * fV)) / f12, (f11 - (bitmap.getHeight() * fV)) / f12);
        matrix.preScale(fV, fV);
        Paint paint = new Paint(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f13 = f11 / 2.0f;
        canvas.drawCircle(f13, f13, f13, paint);
        return bitmapCreateBitmap;
    }
}

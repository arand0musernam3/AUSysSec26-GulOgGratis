package rm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends yd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38138c = a.class.getName();

    public a(float f11, int i11) {
        this.f38136a = f11;
        this.f38137b = i11;
    }

    @Override // yd.b
    public final String a() {
        return this.f38138c;
    }

    @Override // yd.b
    public final Bitmap b(Bitmap bitmap) {
        Paint paint = new Paint(3);
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f11 = iMin / 2.0f;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i11 = width * height;
        int[] iArr = new int[i11];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i12 = 0; i12 < i11; i12++) {
            if (Color.alpha(iArr[i12]) == 0) {
                iArr[i12] = -1;
            }
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, width, height, config);
        bitmapCreateBitmap.getClass();
        Bitmap.Config config2 = bitmapCreateBitmap.getConfig();
        if (config2 != null) {
            config = config2;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iMin, iMin, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        canvas.drawCircle(f11, f11, f11, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmapCreateBitmap, f11 - (bitmapCreateBitmap.getWidth() / 2.0f), f11 - (bitmapCreateBitmap.getHeight() / 2.0f), paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f38136a);
        paint.setColor(this.f38137b);
        canvas.drawCircle(f11, f11, f11, paint);
        return bitmapCreateBitmap2;
    }

    @Override // yd.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (this.f38136a == aVar.f38136a && this.f38137b == aVar.f38137b) {
                return true;
            }
        }
        return false;
    }

    @Override // yd.b
    public final int hashCode() {
        return (Float.hashCode(this.f38136a) * 31) + this.f38137b;
    }
}

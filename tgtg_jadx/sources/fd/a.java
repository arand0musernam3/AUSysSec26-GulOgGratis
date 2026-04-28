package fd;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f17546a;

    public a(Bitmap bitmap) {
        this.f17546a = bitmap;
    }

    @Override // fd.l
    public final boolean a() {
        return true;
    }

    @Override // fd.l
    public final int b() {
        return this.f17546a.getWidth();
    }

    @Override // fd.l
    public final void c(Canvas canvas) {
        canvas.drawBitmap(this.f17546a, 0.0f, 0.0f, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f17546a, ((a) obj).f17546a);
    }

    @Override // fd.l
    public final int getHeight() {
        return this.f17546a.getHeight();
    }

    @Override // fd.l
    public final long getSize() {
        int allocationByteCount;
        Bitmap bitmap = this.f17546a;
        if (!bitmap.isRecycled()) {
            try {
                allocationByteCount = bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                allocationByteCount = (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4) * height;
            }
            return allocationByteCount;
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f17546a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.f17546a + ", shareable=true)";
    }
}

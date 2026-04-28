package androidx.camera.core;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.Surface;
import com.braze.h2;
import java.nio.ByteBuffer;
import java.util.Locale;
import ld.k;
import m0.b1;
import m0.l0;
import m0.m0;
import m0.n0;
import pd.g;
import wd.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImageProcessingUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f2216a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static n0 a(k kVar, byte[] bArr) {
        g.j(kVar.c() == 256);
        bArr.getClass();
        Surface surface = kVar.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            a.r("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        n0 n0VarA = kVar.a();
        if (n0VarA == null) {
            a.r("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return n0VarA;
    }

    public static Bitmap b(n0 n0Var) {
        if (n0Var.getFormat() != 35) {
            i4.a.f("Input image format must be YUV_420_888");
            return null;
        }
        int iB = n0Var.b();
        int height = n0Var.getHeight();
        int iK = n0Var.o()[0].k();
        int iK2 = n0Var.o()[1].k();
        int iK3 = n0Var.o()[2].k();
        int i11 = n0Var.o()[0].i();
        int i12 = n0Var.o()[1].i();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(n0Var.b(), n0Var.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(n0Var.o()[0].f(), iK, n0Var.o()[1].f(), iK2, n0Var.o()[2].f(), iK3, i11, i12, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), iB, height) == 0) {
            return bitmapCreateBitmap;
        }
        h2.a("YUV to RGB conversion failed");
        return null;
    }

    public static b1 c(n0 n0Var, k kVar, ByteBuffer byteBuffer, int i11) {
        if (n0Var.getFormat() != 35 || n0Var.o().length != 3) {
            a.r("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i11 != 0 && i11 != 90 && i11 != 180 && i11 != 270) {
            a.r("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if ((nativeConvertAndroid420ToABGR(n0Var.o()[0].f(), n0Var.o()[0].k(), n0Var.o()[1].f(), n0Var.o()[1].k(), n0Var.o()[2].f(), n0Var.o()[2].k(), n0Var.o()[0].i(), n0Var.o()[1].i(), kVar.getSurface(), byteBuffer, n0Var.b(), n0Var.getHeight(), 0, 0, 0, i11) != 0 ? m0.ERROR_CONVERSION : m0.SUCCESS) == m0.ERROR_CONVERSION) {
            a.r("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            a.p("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - jCurrentTimeMillis) + "], image count: " + f2216a);
            f2216a = f2216a + 1;
        }
        n0 n0VarA = kVar.a();
        if (n0VarA == null) {
            a.r("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        b1 b1Var = new b1(n0VarA);
        b1Var.a(new l0(n0VarA, n0Var));
        return b1Var;
    }

    public static void d(Bitmap bitmap, ByteBuffer byteBuffer, int i11) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i11, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void e(Bitmap bitmap, ByteBuffer byteBuffer, int i11) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i11, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static void f(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            a.r("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, int i14, int i15, Surface surface, ByteBuffer byteBuffer4, int i16, int i17, int i18, int i19, int i21, int i22);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, int i14, int i15, Bitmap bitmap, int i16, int i17, int i18);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, boolean z11);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}

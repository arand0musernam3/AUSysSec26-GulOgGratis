package b6;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ImageDecoder;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.text.MeasuredText;
import android.os.Build;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import android.webkit.WebSettings;
import androidx.work.impl.foreground.SystemForegroundService;
import ia0.a0;
import ia0.m;
import ib.w;
import id.f;
import id.g;
import id.r;
import id.s;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.iana.AEADAlgorithm;
import td.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void A(long j9, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j9);
        }
    }

    public static void a(int i11, String str) {
        Trace.beginAsyncSection(str, i11);
    }

    public static ColorFilter b(int i11, Object obj) {
        return new BlendModeColorFilter(i11, (BlendMode) obj);
    }

    public static void c(Canvas canvas) {
        canvas.disableZ();
    }

    public static void d(Canvas canvas, int i11, BlendMode blendMode) {
        canvas.drawColor(i11, blendMode);
    }

    public static void e(Canvas canvas, long j9) {
        canvas.drawColor(j9);
    }

    public static void f(Canvas canvas, long j9, BlendMode blendMode) {
        canvas.drawColor(j9, blendMode);
    }

    public static void g(Canvas canvas, RectF rectF, float f11, float f12, RectF rectF2, float f13, float f14, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f11, f12, rectF2, f13, f14, paint);
    }

    public static void h(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static void i(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static void j(Canvas canvas, MeasuredText measuredText, int i11, int i12, int i13, int i14, float f11, float f12, boolean z11, Paint paint) {
        canvas.drawTextRun(measuredText, i11, i12, i13, i14, f11, f12, z11, paint);
    }

    public static void k(Canvas canvas) {
        canvas.enableZ();
    }

    public static void l(int i11, String str) {
        Trace.endAsyncSection(str, i11);
    }

    public static ColorStateList m(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !(drawable instanceof ColorStateListDrawable)) {
            return null;
        }
        return ((ColorStateListDrawable) drawable).getColorStateList();
    }

    public static ContentCaptureSession n(View view) {
        return view.getContentCaptureSession();
    }

    public static final void o(Paint paint, CharSequence charSequence, int i11, int i12, Rect rect) {
        paint.getTextBounds(charSequence, i11, i12, rect);
    }

    public static boolean p() {
        return Trace.isEnabled();
    }

    public static boolean q() {
        return Trace.isEnabled();
    }

    public static Object r(x6.a aVar) {
        switch (x6.b.f43870a[aVar.ordinal()]) {
            case 1:
                return BlendMode.CLEAR;
            case 2:
                return BlendMode.SRC;
            case 3:
                return BlendMode.DST;
            case 4:
                return BlendMode.SRC_OVER;
            case 5:
                return BlendMode.DST_OVER;
            case 6:
                return BlendMode.SRC_IN;
            case 7:
                return BlendMode.DST_IN;
            case 8:
                return BlendMode.SRC_OUT;
            case 9:
                return BlendMode.DST_OUT;
            case 10:
                return BlendMode.SRC_ATOP;
            case 11:
                return BlendMode.DST_ATOP;
            case 12:
                return BlendMode.XOR;
            case 13:
                return BlendMode.PLUS;
            case 14:
                return BlendMode.MODULATE;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BlendMode.SCREEN;
            case 16:
                return BlendMode.OVERLAY;
            case 17:
                return BlendMode.DARKEN;
            case 18:
                return BlendMode.LIGHTEN;
            case 19:
                return BlendMode.COLOR_DODGE;
            case 20:
                return BlendMode.COLOR_BURN;
            case 21:
                return BlendMode.HARD_LIGHT;
            case 22:
                return BlendMode.SOFT_LIGHT;
            case 23:
                return BlendMode.DIFFERENCE;
            case 24:
                return BlendMode.EXCLUSION;
            case 25:
                return BlendMode.MULTIPLY;
            case 26:
                return BlendMode.HUE;
            case 27:
                return BlendMode.SATURATION;
            case 28:
                return BlendMode.COLOR;
            case 29:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static Insets s(int i11, int i12, int i13, int i14) {
        return Insets.of(i11, i12, i13, i14);
    }

    public static void t(Paint paint, Object obj) {
        paint.setBlendMode((BlendMode) obj);
    }

    public static void u(int i11, String str) {
        Trace.setCounter(str, i11);
    }

    public static void v(WebSettings webSettings) {
        webSettings.setForceDark(2);
    }

    public static void w(Outline outline, Path path) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            z10.b.a(outline, path);
            return;
        }
        if (i11 >= 29) {
            try {
                z10.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            z10.a.a(outline, path);
        }
    }

    public static void x(SystemForegroundService systemForegroundService, int i11, Notification notification, int i12) {
        systemForegroundService.startForeground(i11, notification, i12);
    }

    public static void y(SystemForegroundService systemForegroundService, int i11, Notification notification, int i12) {
        try {
            systemForegroundService.startForeground(i11, notification, i12);
        } catch (ForegroundServiceStartNotAllowedException e5) {
            w wVarD = w.d();
            String str = SystemForegroundService.f4166e;
            if (wVarD.f23766a <= 5) {
                Log.w(str, "Unable to start foreground service", e5);
            }
        } catch (SecurityException e11) {
            w wVarD2 = w.d();
            String str2 = SystemForegroundService.f4166e;
            if (wVarD2.f23766a <= 5) {
                Log.w(str2, "Unable to start foreground service", e11);
            }
        }
    }

    public static final ImageDecoder.Source z(r rVar, o oVar) {
        a0 a0VarH0;
        if (rVar.getFileSystem() == m.f23661a && (a0VarH0 = rVar.h0()) != null) {
            return ImageDecoder.createSource(a0VarH0.toFile());
        }
        na0.a metadata = rVar.getMetadata();
        if (metadata instanceof id.a) {
            return ImageDecoder.createSource(oVar.f40030a.getAssets(), ((id.a) metadata).f23778f);
        }
        if ((metadata instanceof g) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((g) metadata).f23791f;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new a40.r(assetFileDescriptor, 2));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof s) {
            s sVar = (s) metadata;
            if (Intrinsics.areEqual(sVar.f23809f, oVar.f40030a.getPackageName())) {
                return ImageDecoder.createSource(oVar.f40030a.getResources(), sVar.f23810g);
            }
        }
        if (metadata instanceof f) {
            return ImageDecoder.createSource(((f) metadata).f23790f);
        }
        return null;
    }
}

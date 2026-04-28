package i4;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static void a(Canvas canvas, boolean z11) {
        if (z11) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    public static final long b(c5.y yVar) {
        return yVar.getUniqueDrawingId();
    }

    public static void c(Paint paint, int i11) {
        paint.setBlendMode(d(i11));
    }

    public static final BlendMode d(int i11) {
        return i11 == 0 ? BlendMode.CLEAR : i11 == 1 ? BlendMode.SRC : i11 == 2 ? BlendMode.DST : i11 == 3 ? BlendMode.SRC_OVER : i11 == 4 ? BlendMode.DST_OVER : i11 == 5 ? BlendMode.SRC_IN : i11 == 6 ? BlendMode.DST_IN : i11 == 7 ? BlendMode.SRC_OUT : i11 == 8 ? BlendMode.DST_OUT : i11 == 9 ? BlendMode.SRC_ATOP : i11 == 10 ? BlendMode.DST_ATOP : i11 == 11 ? BlendMode.XOR : i11 == 12 ? BlendMode.PLUS : i11 == 13 ? BlendMode.MODULATE : i11 == 14 ? BlendMode.SCREEN : i11 == 15 ? BlendMode.OVERLAY : i11 == 16 ? BlendMode.DARKEN : i11 == 17 ? BlendMode.LIGHTEN : i11 == 18 ? BlendMode.COLOR_DODGE : i11 == 19 ? BlendMode.COLOR_BURN : i11 == 20 ? BlendMode.HARD_LIGHT : i11 == 21 ? BlendMode.SOFT_LIGHT : i11 == 22 ? BlendMode.DIFFERENCE : i11 == 23 ? BlendMode.EXCLUSION : i11 == 24 ? BlendMode.MULTIPLY : i11 == 25 ? BlendMode.HUE : i11 == 26 ? BlendMode.SATURATION : i11 == 27 ? BlendMode.COLOR : i11 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode e(int i11) {
        return i11 == 0 ? PorterDuff.Mode.CLEAR : i11 == 1 ? PorterDuff.Mode.SRC : i11 == 2 ? PorterDuff.Mode.DST : i11 == 3 ? PorterDuff.Mode.SRC_OVER : i11 == 4 ? PorterDuff.Mode.DST_OVER : i11 == 5 ? PorterDuff.Mode.SRC_IN : i11 == 6 ? PorterDuff.Mode.DST_IN : i11 == 7 ? PorterDuff.Mode.SRC_OUT : i11 == 8 ? PorterDuff.Mode.DST_OUT : i11 == 9 ? PorterDuff.Mode.SRC_ATOP : i11 == 10 ? PorterDuff.Mode.DST_ATOP : i11 == 11 ? PorterDuff.Mode.XOR : i11 == 12 ? PorterDuff.Mode.ADD : i11 == 14 ? PorterDuff.Mode.SCREEN : i11 == 15 ? PorterDuff.Mode.OVERLAY : i11 == 16 ? PorterDuff.Mode.DARKEN : i11 == 17 ? PorterDuff.Mode.LIGHTEN : i11 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}

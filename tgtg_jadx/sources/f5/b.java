package f5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.util.Log;
import android.util.Range;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
import com.braze.h2;
import e0.s;
import e0.v;
import f0.t0;
import i.d;
import i.e;
import i.f;
import i4.h;
import y.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static Context a(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static Icon b(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static String c(Context context) {
        return context.getAttributionTag();
    }

    public static final Range d(v vVar) {
        Float f11;
        Float fValueOf = Float.valueOf(1.0f);
        vVar.getClass();
        try {
            CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            key.getClass();
            t0 t0Var = (t0) vVar;
            Range range = (Range) t0Var.c(key);
            if (range == null) {
                if (wd.a.B(5, "CXCP")) {
                    Log.w("CXCP", "Failed to read CONTROL_ZOOM_RATIO_RANGE for " + ((Object) s.b(t0Var.f16904a)) + '!');
                }
                return new Range(fValueOf, fValueOf);
            }
            Object lower = range.getLower();
            lower.getClass();
            if (Math.abs(r13) >= ((double) Math.ulp(Math.abs(((Number) lower).floatValue()))) * 2.0d && ((Number) range.getLower()).floatValue() >= 0.0f) {
                f11 = (Float) range.getLower();
            } else {
                if (wd.a.B(5, "CXCP")) {
                    Log.w("CXCP", "Invalid lower zoom range detected: " + range.getLower());
                }
                f11 = fValueOf;
            }
            Object upper = range.getUpper();
            upper.getClass();
            if (Math.abs(r3) >= ((double) Math.ulp(Math.abs(((Number) upper).floatValue()))) * 2.0d && ((Number) range.getUpper()).floatValue() >= 0.0f) {
                fValueOf = (Float) range.getUpper();
            } else if (wd.a.B(5, "CXCP")) {
                Log.w("CXCP", "Invalid upper zoom range detected: " + range.getUpper());
            }
            return new Range(f11, fValueOf);
        } catch (AssertionError e5) {
            if (c.a().b(ControlZoomRatioRangeAssertionErrorQuirk.class) != null) {
                if (wd.a.B(3, "CXCP")) {
                    Log.d("CXCP", "Device is known to throw an exception while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE. CONTROL_ZOOM_RATIO_RANGE is not supported. [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "].");
                }
            } else if (wd.a.B(6, "CXCP")) {
                Log.e("CXCP", "Exception thrown while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE on devices not known to throw exceptions during this operation. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. CONTROL_ZOOM_RATIO_RANGE is not available.", e5);
            }
            if (!wd.a.B(5, "CXCP")) {
                return null;
            }
            Log.w("CXCP", "AssertionError: failed to get CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE", e5);
            return null;
        }
    }

    public static CharSequence e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static ResolveInfo f(Context context) {
        return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
    }

    public static String g(f fVar) {
        if (fVar instanceof d) {
            return "image/*";
        }
        if (fVar instanceof e) {
            return "image/jpeg";
        }
        if (fVar instanceof i.c) {
            return null;
        }
        e40.a.f();
        return null;
    }

    public static Insets h(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static boolean i() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            return true;
        }
        return i11 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }

    public static boolean j(Canvas canvas, float f11, float f12, float f13, float f14) {
        return canvas.quickReject(f11, f12, f13, f14);
    }

    public static boolean k(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static boolean l(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    public static void m(Window window, boolean z11) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z11 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z11);
    }

    public static void n(Window window, boolean z11) {
        window.setDecorFitsSystemWindows(z11);
    }

    public static void o(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void p(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void q(Outline outline, h hVar) {
        if (hVar instanceof h) {
            outline.setPath(hVar.f23258a);
        } else {
            h2.a("Unable to obtain android.graphics.Path");
        }
    }

    public static void r(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}

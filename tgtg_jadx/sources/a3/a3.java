package a3;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a3 {
    public static int A(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int B(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static void C(TextView textView, int i11) {
        textView.setFirstBaselineToTopHeight(i11);
    }

    public static void D(ViewStructure viewStructure, int i11) {
        viewStructure.setMaxTextLength(i11);
    }

    public static void E(int i11, View view) {
        view.setOutlineAmbientShadowColor(i11);
    }

    public static void F(int i11, View view) {
        view.setOutlineSpotShadowColor(i11);
    }

    public static final void G(StaticLayout.Builder builder) {
        builder.setUseLineSpacingFromFallbacks(true);
    }

    public static boolean H(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static String a(Context context) {
        context.getClass();
        q1.e eVar = new q1.e(0);
        boolean z11 = androidx.core.app.e.a(context, "android.permission.CAMERA") == 0;
        if (z11) {
            eVar = new q1.e(0);
            try {
                CameraManager cameraManager = (CameraManager) context.getApplicationContext().getSystemService("camera");
                if (cameraManager != null) {
                    String[] cameraIdList = cameraManager.getCameraIdList();
                    cameraIdList.getClass();
                    if (cameraIdList.length != 0) {
                        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraIdList[0]);
                        cameraCharacteristics.getClass();
                        eVar = d(cameraCharacteristics);
                    }
                }
            } catch (Exception unused) {
            }
        }
        Locale.getDefault();
        return "{\"auth\":\"" + z11 + "\", \"info\":\"" + eVar + "\"}";
    }

    public static final DisplayCutout b(Display display) throws Exception {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
            return null;
        } catch (Exception e5) {
            if (!(e5 instanceof ClassNotFoundException) && !(e5 instanceof NoSuchMethodException) && !(e5 instanceof NoSuchFieldException) && !(e5 instanceof IllegalAccessException) && !(e5 instanceof InvocationTargetException) && !(e5 instanceof InstantiationException)) {
                throw e5;
            }
            gb.b.f20340a.getClass();
            Log.w(gb.a.f20339b, e5);
            return null;
        }
    }

    public static final Number c(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.valueOf(packageInfo.getLongVersionCode()) : Integer.valueOf(packageInfo.versionCode);
    }

    public static q1.e d(CameraCharacteristics cameraCharacteristics) {
        q1.e eVar = new q1.e(0);
        if (Build.VERSION.SDK_INT >= 28) {
            eVar.put("name", (String) cameraCharacteristics.get(CameraCharacteristics.INFO_VERSION));
        }
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        eVar.put("flash", String.valueOf(bool != null ? bool.booleanValue() : false));
        return eVar;
    }

    public static Typeface e(Typeface typeface, int i11, boolean z11) {
        return Typeface.create(typeface, i11, z11);
    }

    public static Handler f(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler g(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static TextClassifier h(Context context, g0 g0Var) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int i11 = z2.$EnumSwitchMapping$0[g0Var.ordinal()];
        if (i11 == 1) {
            str = "edittext";
        } else {
            if (i11 != 2) {
                e40.a.f();
                return null;
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public static List i(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static String[] j(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static Executor k(Context context) {
        return context.getMainExecutor();
    }

    public static void l(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    public static int m(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String n(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int o(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int p(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int q(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int r(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static PrecomputedText.Params s(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextMetricsParams();
    }

    public static int t(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri u(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static ClassLoader v() {
        return WebView.getWebViewClassLoader();
    }

    public static boolean w(Handler handler, m0.u uVar, long j9) {
        return handler.postDelayed(uVar, "retry_token", j9);
    }

    public static void x(View view) {
        view.resetPivot();
    }

    public static int y(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int z(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }
}

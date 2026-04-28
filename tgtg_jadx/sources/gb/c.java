package gb;

import a3.a3;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import cb.i;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b, e, g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f20341c = new c(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f20342d = new c(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f20343e = new c(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f20344f = new c(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f20345g = new c(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20346b;

    public /* synthetic */ c(int i11) {
        this.f20346b = i11;
    }

    @Override // gb.b
    public Rect a(Activity activity) throws Exception {
        DisplayCutout displayCutoutB;
        switch (this.f20346b) {
            case 0:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", AnalyticsPlatformParams.channel);
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i11 = rect.bottom + dimensionPixelSize;
                    if (i11 == point.y) {
                        rect.bottom = i11;
                    } else {
                        int i12 = rect.right + dimensionPixelSize;
                        if (i12 == point.x) {
                            rect.right = i12;
                        }
                    }
                }
                return rect;
            case 1:
                Rect rect2 = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        objInvoke.getClass();
                        rect2.set((Rect) objInvoke);
                    } else {
                        Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        objInvoke2.getClass();
                        rect2.set((Rect) objInvoke2);
                    }
                    break;
                } catch (Exception e5) {
                    if (!(e5 instanceof NoSuchFieldException) && !(e5 instanceof NoSuchMethodException) && !(e5 instanceof IllegalAccessException) && !(e5 instanceof InvocationTargetException)) {
                        throw e5;
                    }
                    b.f20340a.getClass();
                    Log.w(a.f20339b, e5);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
                }
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", AnalyticsPlatformParams.channel);
                    int dimensionPixelSize2 = identifier2 > 0 ? resources2.getDimensionPixelSize(identifier2) : 0;
                    int i13 = rect2.bottom + dimensionPixelSize2;
                    if (i13 == point2.y) {
                        rect2.bottom = i13;
                    } else {
                        int i14 = rect2.right + dimensionPixelSize2;
                        if (i14 == point2.x) {
                            rect2.right = i14;
                        } else if (rect2.left == dimensionPixelSize2) {
                            rect2.left = 0;
                        }
                    }
                }
                if ((rect2.width() < point2.x || rect2.height() < point2.y) && !activity.isInMultiWindowMode() && (displayCutoutB = a3.b(defaultDisplay2)) != null) {
                    if (rect2.left == a3.z(displayCutoutB)) {
                        rect2.left = 0;
                    }
                    if (point2.x - rect2.right == a3.A(displayCutoutB)) {
                        rect2.right = a3.A(displayCutoutB) + rect2.right;
                    }
                    if (rect2.top == a3.B(displayCutoutB)) {
                        rect2.top = 0;
                    }
                    if (point2.y - rect2.bottom == a3.y(displayCutoutB)) {
                        rect2.bottom = a3.y(displayCutoutB) + rect2.bottom;
                    }
                }
                return rect2;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField2 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(configuration2);
                    Object objInvoke3 = obj2.getClass().getDeclaredMethod("getBounds", null).invoke(obj2, null);
                    objInvoke3.getClass();
                    return new Rect((Rect) objInvoke3);
                } catch (Exception e11) {
                    if (!(e11 instanceof NoSuchFieldException) && !(e11 instanceof NoSuchMethodException) && !(e11 instanceof IllegalAccessException) && !(e11 instanceof InvocationTargetException)) {
                        throw e11;
                    }
                    b.f20340a.getClass();
                    Log.w(a.f20339b, e11);
                    return f20342d.a(activity);
                }
        }
    }

    @Override // gb.g
    public i b(Context context, e eVar) {
        eVar.getClass();
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            return c((Activity) baseContext, eVar);
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            i4.a.f("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new i(new Rect(0, 0, point.x, point.y), eVar.d(context));
    }

    @Override // gb.g
    public i c(Activity activity, e eVar) {
        eVar.getClass();
        b.f20340a.getClass();
        return new i(new ab.b(a.a().a(activity)), eVar.d(activity));
    }

    @Override // gb.e
    public float d(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }
}

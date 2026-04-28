package qa;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class l0 extends s {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f36695k = true;
    public static boolean l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f36696m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f36697n = true;

    public void h(View view, int i11, int i12, int i13, int i14) {
        if (f36696m) {
            try {
                j0.b(view, i11, i12, i13, i14);
            } catch (NoSuchMethodError unused) {
                f36696m = false;
            }
        }
    }

    public void i(int i11, View view) {
        if (Build.VERSION.SDK_INT != 28) {
            if (f36697n) {
                try {
                    j0.d(i11, view);
                    return;
                } catch (NoSuchMethodError unused) {
                    f36697n = false;
                    return;
                }
            }
            return;
        }
        if (!s.f36728j) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                s.f36727i = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            s.f36728j = true;
        }
        Field field = s.f36727i;
        if (field != null) {
            try {
                s.f36727i.setInt(view, i11 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void j(View view, Matrix matrix) {
        if (f36695k) {
            try {
                j0.f(view, matrix);
            } catch (NoSuchMethodError unused) {
                f36695k = false;
            }
        }
    }

    public void k(ViewGroup viewGroup, Matrix matrix) {
        if (l) {
            try {
                j0.g(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                l = false;
            }
        }
    }
}

package h7;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends x1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Field f21603g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f21604h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Constructor f21605i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f21606j = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WindowInsets f21607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x6.d f21608f;

    public p1() {
        this.f21607e = j();
    }

    private static WindowInsets j() {
        if (!f21604h) {
            try {
                f21603g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e5);
            }
            f21604h = true;
        }
        Field field = f21603g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
            }
        }
        if (!f21606j) {
            try {
                f21605i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            f21606j = true;
        }
        Constructor constructor = f21605i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
            }
        }
        return null;
    }

    @Override // h7.x1
    public WindowInsetsCompat b() {
        a();
        WindowInsetsCompat windowInsetsCompatV = WindowInsetsCompat.v(this.f21607e);
        windowInsetsCompatV.f2741a.w(this.f21624b);
        x6.d dVar = this.f21608f;
        g2 g2Var = windowInsetsCompatV.f2741a;
        g2Var.z(dVar);
        g2Var.v(null);
        g2Var.B(this.f21625c);
        g2Var.C(this.f21626d);
        return windowInsetsCompatV;
    }

    @Override // h7.x1
    public void f(x6.d dVar) {
        this.f21608f = dVar;
    }

    @Override // h7.x1
    public void h(x6.d dVar) {
        WindowInsets windowInsets = this.f21607e;
        if (windowInsets != null) {
            this.f21607e = windowInsets.replaceSystemWindowInsets(dVar.f43873a, dVar.f43874b, dVar.f43875c, dVar.f43876d);
        }
    }

    public p1(WindowInsetsCompat windowInsetsCompat) {
        super(windowInsetsCompat);
        this.f21607e = windowInsetsCompat.u();
    }
}

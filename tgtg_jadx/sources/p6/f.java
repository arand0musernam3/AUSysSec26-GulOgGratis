package p6;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34503g;

    @Override // p6.g
    public final void d(View view, float f11) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).setProgress(a(f11));
            return;
        }
        if (this.f34503g) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f34503g = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(a(f11)));
            } catch (IllegalAccessException e5) {
                Log.e("ViewOscillator", "unable to setProgress", e5);
            } catch (InvocationTargetException e11) {
                Log.e("ViewOscillator", "unable to setProgress", e11);
            }
        }
    }
}

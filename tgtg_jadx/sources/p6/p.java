package p6;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f34523k;

    @Override // p6.q
    public final boolean d(float f11, long j9, View view, i6.e eVar) {
        Method method;
        p pVar;
        float fB;
        if (view instanceof MotionLayout) {
            float fB2 = b(f11, j9, view, eVar);
            pVar = this;
            ((MotionLayout) view).setProgress(fB2);
        } else {
            if (this.f34523k) {
                return false;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f34523k = true;
                method = null;
            }
            if (method != null) {
                try {
                    fB = b(f11, j9, view, eVar);
                    pVar = this;
                } catch (IllegalAccessException e5) {
                    e = e5;
                    pVar = this;
                } catch (InvocationTargetException e11) {
                    e = e11;
                    pVar = this;
                }
                try {
                    method.invoke(view, Float.valueOf(fB));
                } catch (IllegalAccessException e12) {
                    e = e12;
                    Log.e("ViewTimeCycle", "unable to setProgress", e);
                } catch (InvocationTargetException e13) {
                    e = e13;
                    Log.e("ViewTimeCycle", "unable to setProgress", e);
                }
            } else {
                pVar = this;
            }
        }
        return pVar.f34531h;
    }
}

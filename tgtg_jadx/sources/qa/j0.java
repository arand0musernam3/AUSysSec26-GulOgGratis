package qa;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    public static float a(View view) {
        return view.getTransitionAlpha();
    }

    public static void b(View view, int i11, int i12, int i13, int i14) {
        view.setLeftTopRightBottom(i11, i12, i13, i14);
    }

    public static void c(View view, float f11) {
        view.setTransitionAlpha(f11);
    }

    public static void d(int i11, View view) {
        view.setTransitionVisibility(i11);
    }

    public static void e(ViewGroup viewGroup, boolean z11) {
        viewGroup.suppressLayout(z11);
    }

    public static void f(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void g(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}

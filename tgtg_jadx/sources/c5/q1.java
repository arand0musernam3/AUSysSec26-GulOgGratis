package c5;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f7347a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f7348b = new int[2];

    @Override // c5.o1
    public void a(@NotNull View view, @NotNull float[] fArr) {
        Matrix matrix = this.f7347a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f7348b;
        view.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i11, iArr[1] - i12);
        i4.g0.w(matrix, fArr);
    }
}

package qa;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends l0 {
    @Override // qa.s
    public final float d(View view) {
        return view.getTransitionAlpha();
    }

    @Override // qa.s
    public final void f(View view, float f11) {
        view.setTransitionAlpha(f11);
    }

    @Override // qa.l0
    public final void h(View view, int i11, int i12, int i13, int i14) {
        view.setLeftTopRightBottom(i11, i12, i13, i14);
    }

    @Override // qa.l0
    public final void i(int i11, View view) {
        view.setTransitionVisibility(i11);
    }

    @Override // qa.l0
    public final void j(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // qa.l0
    public final void k(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}

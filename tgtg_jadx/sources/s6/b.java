package s6;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public boolean e(View view, Rect rect) {
        return false;
    }

    public boolean f(View view, View view2) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i11) {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13) {
        return false;
    }

    public boolean n(View view) {
        return false;
    }

    public void p(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13, int[] iArr) {
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z11) {
        return false;
    }

    public Parcelable s(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i11, int i12) {
        return false;
    }

    public boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public void j() {
    }

    public void g(e eVar) {
    }

    public void i(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void r(View view, Parcelable parcelable) {
    }

    public void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i11) {
    }

    public void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i11, int i12, int[] iArr, int i13) {
    }
}

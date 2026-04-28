package s6;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.timepicker.ClockFaceView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f38855b;

    public /* synthetic */ f(ViewGroup viewGroup, int i11) {
        this.f38854a = i11;
        this.f38855b = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f38854a) {
            case 0:
                ((CoordinatorLayout) this.f38855b).q(0);
                break;
            default:
                ClockFaceView clockFaceView = (ClockFaceView) this.f38855b;
                if (clockFaceView.isShown()) {
                    clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
                    clockFaceView.setRadius(((clockFaceView.getHeight() / 2) - clockFaceView.f12694d.f12715g) - clockFaceView.l);
                    break;
                }
                break;
        }
        return true;
    }
}

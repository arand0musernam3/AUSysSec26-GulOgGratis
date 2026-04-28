package p;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34028b;

    public /* synthetic */ u1(Object obj, int i11) {
        this.f34027a = i11;
        this.f34028b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f34027a) {
            case 0:
                v1 v1Var = (v1) this.f34028b;
                r1 r1Var = v1Var.f34056r;
                Handler handler = v1Var.f34060v;
                t tVar = v1Var.f34064z;
                int action = motionEvent.getAction();
                int x11 = (int) motionEvent.getX();
                int y5 = (int) motionEvent.getY();
                if (action == 0 && tVar != null && tVar.isShowing() && x11 >= 0 && x11 < tVar.getWidth() && y5 >= 0 && y5 < tVar.getHeight()) {
                    handler.postDelayed(r1Var, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                handler.removeCallbacks(r1Var);
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.f34028b).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}

package androidx.recyclerview.widget;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.braze.ui.contentcards.recycler.SimpleItemTouchHelperCallback;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3824a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f3825b;

    public n0(p0 p0Var) {
        this.f3825b = p0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewJ;
        r2 r2VarN;
        p0 p0Var = this.f3825b;
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = p0Var.f3861m;
        if (this.f3824a && (viewJ = p0Var.j(motionEvent)) != null && (r2VarN = p0Var.f3866r.N(viewJ)) != null && simpleItemTouchHelperCallback.hasDragFlag(p0Var.f3866r, r2VarN)) {
            int pointerId = motionEvent.getPointerId(0);
            int i11 = p0Var.l;
            if (pointerId == i11) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float y5 = motionEvent.getY(iFindPointerIndex);
                p0Var.f3853d = x11;
                p0Var.f3854e = y5;
                p0Var.f3858i = 0.0f;
                p0Var.f3857h = 0.0f;
                if (simpleItemTouchHelperCallback.isLongPressDragEnabled()) {
                    p0Var.n(r2VarN, 2);
                }
            }
        }
    }
}

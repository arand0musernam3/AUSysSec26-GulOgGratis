package androidx.recyclerview.widget;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f3770a;

    public i0(p0 p0Var) {
        this.f3770a = p0Var;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void a(MotionEvent motionEvent) {
        p0 p0Var = this.f3770a;
        a0 a0Var = p0Var.f3867s;
        p0Var.f3872x.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = p0Var.f3868t;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (p0Var.l == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(p0Var.l);
        if (iFindPointerIndex >= 0) {
            p0Var.g(actionMasked, iFindPointerIndex, motionEvent);
        }
        r2 r2Var = p0Var.f3852c;
        if (r2Var == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    p0Var.o(p0Var.f3863o, iFindPointerIndex, motionEvent);
                    p0Var.m(r2Var);
                    p0Var.f3866r.removeCallbacks(a0Var);
                    a0Var.run();
                    p0Var.f3866r.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == p0Var.l) {
                    p0Var.l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    p0Var.o(p0Var.f3863o, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = p0Var.f3868t;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        p0Var.n(null, 0);
        p0Var.l = -1;
    }

    @Override // androidx.recyclerview.widget.b2
    public final boolean d(MotionEvent motionEvent) {
        int iFindPointerIndex;
        p0 p0Var = this.f3770a;
        p0Var.f3872x.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        j0 j0Var = null;
        if (actionMasked == 0) {
            p0Var.l = motionEvent.getPointerId(0);
            p0Var.f3853d = motionEvent.getX();
            p0Var.f3854e = motionEvent.getY();
            VelocityTracker velocityTracker = p0Var.f3868t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            p0Var.f3868t = VelocityTracker.obtain();
            if (p0Var.f3852c == null) {
                ArrayList arrayList = p0Var.f3864p;
                if (!arrayList.isEmpty()) {
                    View viewJ = p0Var.j(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        j0 j0Var2 = (j0) arrayList.get(size);
                        if (j0Var2.f3780e.itemView == viewJ) {
                            j0Var = j0Var2;
                            break;
                        }
                        size--;
                    }
                }
                if (j0Var != null) {
                    r2 r2Var = j0Var.f3780e;
                    p0Var.f3853d -= j0Var.f3784i;
                    p0Var.f3854e -= j0Var.f3785j;
                    p0Var.i(r2Var, true);
                    if (p0Var.f3850a.remove(r2Var.itemView)) {
                        p0Var.f3861m.clearView(p0Var.f3866r, r2Var);
                    }
                    p0Var.n(r2Var, j0Var.f3781f);
                    p0Var.o(p0Var.f3863o, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            p0Var.l = -1;
            p0Var.n(null, 0);
        } else {
            int i11 = p0Var.l;
            if (i11 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i11)) >= 0) {
                p0Var.g(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = p0Var.f3868t;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return p0Var.f3852c != null;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void e(boolean z11) {
        if (z11) {
            this.f3770a.n(null, 0);
        }
    }
}

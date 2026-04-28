package c5;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f7244a;

    public h2(i2 i2Var) {
        this.f7244a = i2Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        i2 i2Var = this.f7244a;
        o oVar = (o) i2Var.f7255d;
        if (!i2Var.f7254c) {
            int i11 = i2Var.f7253b;
            if (i11 == 1) {
                if (Math.abs(f11) > Math.abs(f12)) {
                    ((g4.p) oVar.f7305b.getFocusOwner()).i(f11 > 0.0f ? 1 : 2, false);
                    return true;
                }
            } else if (i11 == 2 && Math.abs(f12) > Math.abs(f11)) {
                ((g4.p) oVar.f7305b.getFocusOwner()).i(f12 > 0.0f ? 1 : 2, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

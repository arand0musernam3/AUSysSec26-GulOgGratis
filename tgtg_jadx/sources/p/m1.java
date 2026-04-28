package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f33949b;

    public /* synthetic */ m1(n1 n1Var, int i11) {
        this.f33948a = i11;
        this.f33949b = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33948a) {
            case 0:
                ViewParent parent = this.f33949b.f33954d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                n1 n1Var = this.f33949b;
                n1Var.a();
                View view = n1Var.f33954d;
                if (view.isEnabled() && !view.isLongClickable() && n1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    n1Var.f33957g = true;
                    break;
                }
                break;
        }
    }
}

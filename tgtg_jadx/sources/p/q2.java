package p;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 extends TouchDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f33982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f33983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f33984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f33985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33987f;

    public q2(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f33986e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f33983b = rect3;
        Rect rect4 = new Rect();
        this.f33985d = rect4;
        Rect rect5 = new Rect();
        this.f33984c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i11 = -scaledTouchSlop;
        rect4.inset(i11, i11);
        rect5.set(rect2);
        this.f33982a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        int x11 = (int) motionEvent.getX();
        int y5 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z13 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z12 = this.f33987f;
                if (z12 && !this.f33985d.contains(x11, y5)) {
                    z13 = z12;
                    z11 = false;
                }
            } else {
                if (action == 3) {
                    z12 = this.f33987f;
                    this.f33987f = false;
                }
                z11 = true;
                z13 = false;
            }
            z13 = z12;
            z11 = true;
        } else if (this.f33983b.contains(x11, y5)) {
            this.f33987f = true;
            z11 = true;
        } else {
            z11 = true;
            z13 = false;
        }
        if (!z13) {
            return false;
        }
        Rect rect = this.f33984c;
        View view = this.f33982a;
        if (!z11 || rect.contains(x11, y5)) {
            motionEvent.setLocation(x11 - rect.left, y5 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}

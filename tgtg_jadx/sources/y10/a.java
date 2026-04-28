package y10;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dialog f45371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45374d;

    public a(Dialog dialog, Rect rect) {
        this.f45371a = dialog;
        this.f45372b = rect.left;
        this.f45373c = rect.top;
        this.f45374d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f45372b;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f45373c, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i11 = this.f45374d;
            motionEventObtain.setLocation((-i11) - 1, (-i11) - 1);
        }
        view.performClick();
        return this.f45371a.onTouchEvent(motionEventObtain);
    }
}

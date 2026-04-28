package ex;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fx.c f16532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f16533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f16534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View.OnTouchListener f16535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16536e = true;

    public h(fx.c cVar, View view, View view2) {
        this.f16532a = cVar;
        this.f16533b = new WeakReference(view2);
        this.f16534c = new WeakReference(view);
        this.f16535d = fx.h.g(view2);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getClass();
        motionEvent.getClass();
        View view2 = (View) this.f16534c.get();
        View view3 = (View) this.f16533b.get();
        if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
            c.c(this.f16532a, view2, view3);
        }
        View.OnTouchListener onTouchListener = this.f16535d;
        return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
    }
}

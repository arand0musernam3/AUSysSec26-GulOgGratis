package h7;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f21627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f21628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f21629c;

    public y(View view, Runnable runnable) {
        this.f21627a = view;
        this.f21628b = view.getViewTreeObserver();
        this.f21629c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            c50.w.l("view == null");
            return;
        }
        y yVar = new y(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(yVar);
        view.addOnAttachStateChangeListener(yVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.f21628b.isAlive()) {
            this.f21628b.removeOnPreDrawListener(this);
        } else {
            this.f21627a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f21627a.removeOnAttachStateChangeListener(this);
        this.f21629c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f21628b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f21628b.isAlive()) {
            this.f21628b.removeOnPreDrawListener(this);
        } else {
            this.f21627a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f21627a.removeOnAttachStateChangeListener(this);
    }
}

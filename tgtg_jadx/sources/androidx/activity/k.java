package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ComponentActivity.ReportFullyDrawnExecutor, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1733a = SystemClock.uptimeMillis() + ((long) 10000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f1734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f1736d;

    public k(ComponentActivity componentActivity) {
        this.f1736d = componentActivity;
    }

    @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
    public final void O(View view) {
        view.getClass();
        if (this.f1735c) {
            return;
        }
        this.f1735c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
    public final void e() {
        ComponentActivity componentActivity = this.f1736d;
        componentActivity.getWindow().getDecorView().removeCallbacks(this);
        componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.f1734b = runnable;
        View decorView = this.f1736d.getWindow().getDecorView();
        decorView.getClass();
        if (!this.f1735c) {
            decorView.postOnAnimation(new al.u(this, 1));
        } else if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z11;
        Runnable runnable = this.f1734b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1733a) {
                this.f1735c = false;
                this.f1736d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1734b = null;
        FullyDrawnReporter fullyDrawnReporter = this.f1736d.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f1697b) {
            z11 = fullyDrawnReporter.f1698c;
        }
        if (z11) {
            this.f1735c = false;
            this.f1736d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1736d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

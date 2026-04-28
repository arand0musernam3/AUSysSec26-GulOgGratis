package rx;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import m0.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f38258d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f38259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f38260b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f38261c = new AtomicBoolean(false);

    public e(Activity activity) {
        this.f38259a = new WeakReference(activity);
    }

    public final void a() {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            l lVar = new l(this, 14);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                lVar.run();
            } else {
                this.f38260b.post(lVar);
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            a();
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}

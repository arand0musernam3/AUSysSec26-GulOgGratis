package c9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Handler f7802g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f7808f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile i f7804b = i.PENDING;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f7805c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f7806d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f7803a = new g(this, new f(this, 0));

    public a(b bVar) {
        this.f7808f = bVar;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f7802g == null) {
                    f7802g = new Handler(Looper.getMainLooper());
                }
                handler = f7802g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new x0.f(this, obj, false, 5));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7807e = false;
        this.f7808f.executePendingTask();
    }
}

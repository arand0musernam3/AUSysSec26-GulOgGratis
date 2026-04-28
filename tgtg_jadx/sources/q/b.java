package q;

import a3.a3;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import h0.g;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m0.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f35697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ExecutorService f35698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile Handler f35699h;

    public b() {
        super(18);
        this.f35697f = new Object();
        this.f35698g = Executors.newFixedThreadPool(4, new m(1));
    }

    public static Handler H(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a3.g(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    public final boolean I() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}

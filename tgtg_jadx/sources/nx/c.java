package nx;

import android.app.Application;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m0.i1;
import tx.t;
import tx.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f31413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService f31414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ScheduledExecutorService f31415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile ScheduledFuture f31416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f31417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicInteger f31418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile androidx.recyclerview.widget.b f31419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f31420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f31421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static long f31422j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f31423k;
    public static WeakReference l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f31424m;

    static {
        String canonicalName = c.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f31413a = canonicalName;
        f31414b = Executors.newSingleThreadScheduledExecutor();
        f31415c = Executors.newSingleThreadScheduledExecutor();
        f31417e = new Object();
        f31418f = new AtomicInteger(0);
        f31420h = new AtomicBoolean(false);
    }

    public static void a() {
        ScheduledFuture scheduledFuture;
        synchronized (f31417e) {
            try {
                if (f31416d != null && (scheduledFuture = f31416d) != null) {
                    scheduledFuture.cancel(false);
                }
                f31416d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final UUID b() {
        androidx.recyclerview.widget.b bVar;
        if (f31419g == null || (bVar = f31419g) == null) {
            return null;
        }
        return (UUID) bVar.f3666d;
    }

    public static final void c(Application application, String str) {
        application.getClass();
        if (f31420h.compareAndSet(false, true)) {
            w.a(new i1(11), t.CodelessEvents);
            f31421i = str;
            application.registerActivityLifecycleCallbacks(new b(0));
        }
    }
}

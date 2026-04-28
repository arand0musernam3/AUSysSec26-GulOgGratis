package v30;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f41948e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f41949a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f41952d;

    public b(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        this.f41950b = str;
        this.f41951c = i11;
        this.f41952d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f41948e.newThread(new a(0, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f41950b + " Thread #" + this.f41949a.getAndIncrement());
        return threadNewThread;
    }
}

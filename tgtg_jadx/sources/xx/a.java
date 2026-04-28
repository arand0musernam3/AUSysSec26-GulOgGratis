package xx;

import java.lang.Thread;
import o30.f0;
import ox.h;
import p30.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l50.a f44499b = new l50.a(27);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f44500c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f44501a;

    public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f44501a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        thread.getClass();
        th2.getClass();
        Throwable th3 = null;
        Throwable cause = th2;
        loop0: while (true) {
            if (cause == null || cause == th3) {
                break;
            }
            StackTraceElement[] stackTrace = cause.getStackTrace();
            stackTrace.getClass();
            for (StackTraceElement stackTraceElement : stackTrace) {
                stackTraceElement.getClass();
                if (b.y(stackTraceElement)) {
                    f0.x(th2);
                    h.n(th2, vx.b.CrashReport).b();
                    break loop0;
                }
            }
            th3 = cause;
            cause = cause.getCause();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f44501a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }
}

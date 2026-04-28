package v80;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.LongCompanionObject;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends z0 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g0 f42097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f42098j;

    static {
        Long l;
        g0 g0Var = new g0();
        f42097i = g0Var;
        g0Var.C0(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f42098j = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // v80.z0
    public final void F0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.F0(runnable);
    }

    @Override // v80.z0
    public final Thread I0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f42097i.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // v80.z0
    public final void K0(long j9, x0 x0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // v80.z0, v80.k0
    public final r0 L(long j9, Runnable runnable, CoroutineContext coroutineContext) {
        long j11 = j9 > 0 ? j9 >= 9223372036854L ? LongCompanionObject.MAX_VALUE : 1000000 * j9 : 0L;
        if (j11 >= 4611686018427387903L) {
            return y1.f42177a;
        }
        long jNanoTime = System.nanoTime();
        w0 w0Var = new w0(runnable, j11 + jNanoTime);
        L0(jNanoTime, w0Var);
        return w0Var;
    }

    public final synchronized void M0() {
        int i11 = debugStatus;
        if (i11 == 2 || i11 == 3) {
            debugStatus = 3;
            z0.f42178f.set(this, null);
            z0.f42179g.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zJ0;
        f2.f42094a.set(this);
        try {
            synchronized (this) {
                int i11 = debugStatus;
                if (i11 == 2 || i11 == 3) {
                    if (zJ0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j9 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jD0 = D0();
                    if (jD0 == LongCompanionObject.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j9 == LongCompanionObject.MAX_VALUE) {
                            j9 = f42098j + jNanoTime;
                        }
                        long j11 = j9 - jNanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            M0();
                            if (J0()) {
                                return;
                            }
                            I0();
                            return;
                        }
                        if (jD0 > j11) {
                            jD0 = j11;
                        }
                    } else {
                        j9 = Long.MAX_VALUE;
                    }
                    if (jD0 > 0) {
                        int i12 = debugStatus;
                        if (i12 == 2 || i12 == 3) {
                            _thread = null;
                            M0();
                            if (J0()) {
                                return;
                            }
                            I0();
                            return;
                        }
                        LockSupport.parkNanos(this, jD0);
                    }
                }
            }
        } finally {
            _thread = null;
            M0();
            if (!J0()) {
                I0();
            }
        }
    }

    @Override // v80.z0, v80.u0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // v80.x
    public final String toString() {
        return "DefaultExecutor";
    }
}

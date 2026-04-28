package h40;

import a40.e0;
import android.os.SystemClock;
import android.util.Log;
import androidx.lifecycle.n1;
import com.google.firebase.messaging.r;
import d10.g;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ty.d;
import w2.z;
import zendesk.messaging.android.internal.conversationscreen.ConversationFragment;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f21402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f21403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f21407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f21408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f21409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z f21410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f21412k;

    public c(n1 n1Var, i40.b bVar, z zVar) {
        double d3 = bVar.f23344d;
        double d11 = bVar.f23345e;
        long j9 = ((long) bVar.f23346f) * 1000;
        this.f21402a = d3;
        this.f21403b = d11;
        this.f21404c = j9;
        this.f21409h = n1Var;
        this.f21410i = zVar;
        this.f21405d = SystemClock.elapsedRealtime();
        int i11 = (int) d3;
        this.f21406e = i11;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i11);
        this.f21407f = arrayBlockingQueue;
        this.f21408g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f21411j = 0;
        this.f21412k = 0L;
    }

    public final int a() {
        if (this.f21412k == 0) {
            this.f21412k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f21412k) / this.f21404c);
        int size = this.f21407f.size();
        int i11 = this.f21411j;
        int iMin = size == this.f21406e ? Math.min(100, i11 + iCurrentTimeMillis) : Math.max(0, i11 - iCurrentTimeMillis);
        if (this.f21411j != iMin) {
            this.f21411j = iMin;
            this.f21412k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(final a40.b bVar, final g gVar) {
        String str = "Sending report through Google DataTransport: " + bVar.f701b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        final boolean z11 = SystemClock.elapsedRealtime() - this.f21405d < ConversationFragment.COORDINATOR_INITIALIZATION_TIMEOUT;
        this.f21409h.y(new ty.a(bVar.f700a, d.HIGHEST, null), new ty.g() { // from class: h40.b
            @Override // ty.g
            public final void a(Exception exc) throws Throwable {
                g gVar2 = gVar;
                if (exc != null) {
                    gVar2.c(exc);
                    return;
                }
                if (z11) {
                    boolean z12 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new r(18, this.f21398a, countDownLatch)).start();
                    ExecutorService executorService = e0.f724a;
                    boolean z13 = false;
                    try {
                        long jNanoTime = 2000000000;
                        long jNanoTime2 = System.nanoTime() + 2000000000;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(jNanoTime, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    jNanoTime = jNanoTime2 - System.nanoTime();
                                    z13 = true;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (z12) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z13) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z12 = z13;
                    }
                }
                gVar2.d(bVar);
            }
        });
    }
}

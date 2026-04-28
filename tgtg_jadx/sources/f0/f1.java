package f0;

import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f16644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r80.a f16645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Surface f16646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f16647d;

    public f1(CountDownLatch countDownLatch, r80.a aVar, Surface surface, SurfaceTexture surfaceTexture) {
        this.f16644a = countDownLatch;
        this.f16645b = aVar;
        this.f16646c = surface;
        this.f16647d = surfaceTexture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f0.p1
    public final void c(q1 q1Var) throws Exception {
        boolean zIsTerminated;
        q1Var.getClass();
        Log.d("CXCP", "Empty capture session configured. Closing it");
        if (q1Var instanceof AutoCloseable) {
            q1Var.close();
        } else if (q1Var instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) q1Var;
            if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z11 = false;
                while (!zIsTerminated) {
                    try {
                        zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z11) {
                            executorService.shutdownNow();
                            z11 = true;
                        }
                    }
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
            }
        } else if (q1Var instanceof TypedArray) {
            ((TypedArray) q1Var).recycle();
        } else if (q1Var instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) q1Var).release();
        } else {
            if (!(q1Var instanceof MediaDrm)) {
                i4.a.h();
                return;
            }
            ((MediaDrm) q1Var).release();
        }
        this.f16644a.countDown();
    }

    @Override // f0.p1
    public final void d(q1 q1Var) {
        q1Var.getClass();
    }

    @Override // f0.p1
    public final void e(q1 q1Var) {
        q1Var.getClass();
    }

    @Override // f0.p1
    public final void f(q1 q1Var) {
        q1Var.getClass();
        Log.d("CXCP", "Empty capture session closed");
        if (this.f16645b.a()) {
            this.f16646c.release();
            this.f16647d.release();
        }
    }

    @Override // f0.p1
    public final void g(q1 q1Var) {
        q1Var.getClass();
        Log.d("CXCP", "Empty capture session configure failed");
        if (this.f16645b.a()) {
            this.f16646c.release();
            this.f16647d.release();
        }
        this.f16644a.countDown();
    }

    @Override // f0.p1
    public final void h(q1 q1Var) {
        q1Var.getClass();
    }

    @Override // f0.c4
    public final void a() {
    }

    @Override // f0.c4
    public final void b() {
    }
}

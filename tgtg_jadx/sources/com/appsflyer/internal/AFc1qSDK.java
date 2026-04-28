package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/appsflyer/internal/AFc1qSDK;", "Ljava/util/concurrent/ThreadPoolExecutor;", "", "p0", "p1", "", "p2", "Ljava/util/concurrent/TimeUnit;", "p3", "Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "p4", "Ljava/util/Queue;", "p5", "<init>", "(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/Queue;)V", "", "", "afterExecute", "(Ljava/lang/Runnable;Ljava/lang/Throwable;)V", "getCurrencyIso4217Code", "()V", "getMediationNetwork", "Ljava/util/Queue;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFc1qSDK extends ThreadPoolExecutor implements AutoCloseable {

    @NotNull
    private final Queue<Runnable> getMediationNetwork;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFc1qSDK(int i11, int i12, long j9, @NotNull TimeUnit timeUnit, @NotNull BlockingQueue<Runnable> blockingQueue, @NotNull final Queue<Runnable> queue) {
        super(i11, i12, j9, timeUnit, blockingQueue, new RejectedExecutionHandler() { // from class: com.appsflyer.internal.i
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AFc1qSDK.AFAdRevenueData(queue, runnable, threadPoolExecutor);
            }
        });
        timeUnit.getClass();
        blockingQueue.getClass();
        queue.getClass();
        this.getMediationNetwork = queue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(Queue queue, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        queue.getClass();
        runnable.getClass();
        threadPoolExecutor.getClass();
        queue.add(runnable);
    }

    private final void getCurrencyIso4217Code() {
        synchronized (this) {
            int size = this.getMediationNetwork.size();
            for (int i11 = 0; i11 < size; i11++) {
                Runnable runnablePoll = this.getMediationNetwork.poll();
                if (runnablePoll == null) {
                    break;
                }
                execute(runnablePoll);
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(@NotNull Runnable p02, @Nullable Throwable p12) {
        p02.getClass();
        super.afterExecute(p02, p12);
        p02.getClass();
        if (p12 == null) {
            try {
                getCurrencyIso4217Code();
                return;
            } catch (Throwable th2) {
                AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.AF_EXECUTOR, "Error while executing rejected tasks", th2, true, true, true, false, 64, null);
                return;
            }
        }
        AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.AF_EXECUTOR, "Error while executing task: " + p02, p12, true, true, true, false, 64, null);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z11 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z11) {
                    shutdownNow();
                    z11 = true;
                }
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    public /* synthetic */ AFc1qSDK(int i11, int i12, long j9, TimeUnit timeUnit, BlockingQueue blockingQueue, Queue queue, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, j9, timeUnit, blockingQueue, (i13 & 32) != 0 ? new ConcurrentLinkedQueue() : queue);
    }
}

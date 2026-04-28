package androidx.activity;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    private boolean isEnabled;

    @NotNull
    private final List<x> eventHandlers = new ArrayList();

    @NotNull
    private final CopyOnWriteArrayList<AutoCloseable> closeables = new CopyOnWriteArrayList<>();

    public y(boolean z11) {
        this.isEnabled = z11;
    }

    public final void addCloseable$activity(@NotNull AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        this.closeables.add(autoCloseable);
    }

    @NotNull
    public final x createNavigationEventHandler$activity(@NotNull q9.g gVar) {
        gVar.getClass();
        x xVar = new x(this, gVar);
        this.eventHandlers.add(xVar);
        return xVar;
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(@NotNull b bVar) {
        bVar.getClass();
    }

    public void handleOnBackStarted(@NotNull b bVar) {
        bVar.getClass();
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        boolean zIsTerminated;
        Iterator<AutoCloseable> it = this.closeables.iterator();
        it.getClass();
        while (it.hasNext()) {
            AutoCloseable next = it.next();
            if (next instanceof AutoCloseable) {
                next.close();
            } else if (next instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) next;
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
            } else if (next instanceof TypedArray) {
                ((TypedArray) next).recycle();
            } else if (next instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) next).release();
            } else {
                if (!(next instanceof MediaDrm)) {
                    i4.a.h();
                    return;
                }
                ((MediaDrm) next).release();
            }
        }
        this.closeables.clear();
        Iterator<x> it2 = this.eventHandlers.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        this.eventHandlers.clear();
    }

    public final void removeCloseable$activity(@NotNull AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        this.closeables.remove(autoCloseable);
    }

    public final void setEnabled(boolean z11) {
        this.isEnabled = z11;
        for (x xVar : this.eventHandlers) {
            xVar.g(xVar.f1762i && z11);
        }
    }

    public void handleOnBackCancelled() {
    }
}

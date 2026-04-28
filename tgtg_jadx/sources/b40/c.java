package b40;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import w.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f5737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5738b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Task f5739c = Tasks.d(null);

    public c(ExecutorService executorService) {
        this.f5737a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task taskJ;
        synchronized (this.f5738b) {
            taskJ = this.f5739c.j(this.f5737a, new z(runnable, 14));
            this.f5739c = taskJ;
        }
        return taskJ;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f5737a.execute(runnable);
    }
}

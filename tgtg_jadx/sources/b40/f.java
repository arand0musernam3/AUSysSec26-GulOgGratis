package b40;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f5741d = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f5742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f5744c;

    public f(ExecutorService executorService, ExecutorService executorService2) {
        executorService.getClass();
        executorService2.getClass();
        this.f5742a = new c(executorService);
        this.f5743b = new c(executorService);
        Tasks.d(null);
        this.f5744c = new c(executorService2);
    }

    public static final void a() {
        if (((Boolean) new d(0).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void b() {
        if (((Boolean) new d(1).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}

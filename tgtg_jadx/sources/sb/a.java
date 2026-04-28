package sb;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import rb.k;
import v80.f0;
import v80.x;
import w0.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f38956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f38957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f38958c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f38959d = new d(this, 2);

    public a(ExecutorService executorService) {
        k kVar = new k(executorService, 0);
        this.f38956a = kVar;
        this.f38957b = f0.q(kVar);
    }

    public final void a(Runnable runnable) {
        this.f38956a.execute(runnable);
    }
}

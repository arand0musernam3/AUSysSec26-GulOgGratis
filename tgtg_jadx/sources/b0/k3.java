package b0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a90.d f5265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f5266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0.g f5267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f5268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j3 f5269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a90.d f5270f;

    public k3(a90.d dVar, Executor executor, v80.x xVar) {
        executor.getClass();
        this.f5265a = dVar;
        this.f5266b = executor;
        new Handler(Looper.getMainLooper());
        this.f5267c = new w0.g(executor);
        this.f5268d = new ThreadLocal();
        j3 j3Var = new j3(this, 0);
        this.f5269e = j3Var;
        this.f5270f = v80.f0.b(dVar.f1015a.plus(v80.f0.d()).plus(v80.f0.q(j3Var)));
    }
}

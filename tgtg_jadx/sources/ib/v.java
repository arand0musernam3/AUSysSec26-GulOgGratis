package ib;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkerParameters f23761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f23762c = new AtomicInteger(-256);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23763d;

    public v(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            i4.a.f("Application Context is null");
            throw null;
        }
        if (workerParameters == null) {
            i4.a.f("WorkerParameters is null");
            throw null;
        }
        this.f23760a = context;
        this.f23761b = workerParameters;
    }

    public abstract e6.l a();

    public final boolean b() {
        return this.f23762c.get() != -256;
    }

    public abstract e6.l c();
}

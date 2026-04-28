package e0;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0.e f15310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15313d;

    public b0(g0.e eVar) {
        this.f15310a = eVar;
        r80.b bVar = c0.f15323a;
        bVar.getClass();
        this.f15311b = r80.b.f37780b.incrementAndGet(bVar);
        this.f15312c = new Object();
    }

    public final h0 a() {
        h0 h0Var;
        synchronized (this.f15312c) {
            if (this.f15313d) {
                throw new IllegalStateException("Check failed.");
            }
            h0Var = (h0) this.f15310a.f18051z.get();
        }
        return h0Var;
    }

    public final j0.b b() {
        j0.b bVar;
        synchronized (this.f15312c) {
            if (this.f15313d) {
                throw new IllegalStateException("Check failed.");
            }
            bVar = (j0.b) this.f15310a.f18049x.get();
        }
        return bVar;
    }

    public final i0.b c(n nVar, r rVar) {
        try {
            Trace.beginSection("CXCP#CameraGraph-" + ((Object) s.b(nVar.f15369a)));
            return (i0.b) new g0.d(this.f15310a.f18029c, new dn.k(nVar, rVar)).f18026s.get();
        } finally {
            Trace.endSection();
        }
    }

    public final String toString() {
        return "CameraPipe-" + this.f15311b;
    }
}

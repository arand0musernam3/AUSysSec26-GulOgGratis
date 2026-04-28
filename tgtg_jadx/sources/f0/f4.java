package f0;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0.v f16660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v80.b0 f16661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f16663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d4 f16665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y80.m1 f16666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y80.i f16667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v1 f16668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v80.b2 f16669k;
    public h0.e l;

    public f4(String str, i0.v vVar, v80.b0 b0Var) {
        str.getClass();
        b0Var.getClass();
        this.f16659a = str;
        this.f16660b = vVar;
        this.f16661c = b0Var;
        r80.b bVar = e4.f16631a;
        bVar.getClass();
        this.f16662d = r80.b.f37780b.incrementAndGet(bVar);
        this.f16663e = new Object();
        y80.m1 m1VarB = y80.r.b(1, 3, null, 4);
        this.f16666h = m1VarB;
        this.f16667i = y80.r.l(m1VarB);
        g2 g2Var = g2.f16684a;
        this.f16668j = g2Var;
        if (m1VarB.i(g2Var)) {
            return;
        }
        com.braze.h2.b("Check failed.");
        throw null;
    }

    public final void a(e0.l lVar) {
        v1 v1Var;
        synchronized (this.f16663e) {
            try {
                if (this.f16664f) {
                    return;
                }
                this.f16664f = true;
                Log.i("CXCP", "Disconnecting " + this);
                d4 d4Var = this.f16665g;
                if (d4Var != null) {
                    synchronized (d4Var.f16613b) {
                        d4Var.f16614c = true;
                    }
                }
                v80.b2 b2Var = this.f16669k;
                if (b2Var != null) {
                    b2Var.a(null);
                }
                h0.e eVar = this.l;
                if (eVar != null) {
                    eVar.b();
                }
                synchronized (this.f16663e) {
                    v1Var = this.f16668j;
                }
                if (!(v1Var instanceof w1)) {
                    if (!(v1Var instanceof x1)) {
                        b(new x1(null));
                    }
                    b(new w1(this.f16659a, u2.APP_DISCONNECTED, null, null, null, null, null, null, lVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(v1 v1Var) {
        this.f16668j = v1Var;
        if (this.f16666h.i(v1Var)) {
            return;
        }
        e40.a.i("Failed to emit ", v1Var, " in ", this);
    }

    public final String toString() {
        return "VirtualCamera-" + this.f16662d;
    }
}

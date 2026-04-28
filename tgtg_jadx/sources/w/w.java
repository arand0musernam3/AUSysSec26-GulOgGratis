package w;

import e0.h1;
import e0.i1;
import e0.j1;
import e0.k1;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f42790a;

    public w(AtomicReference atomicReference) {
        this.f42790a = atomicReference;
    }

    @Override // e0.h1
    public final void G(k1 k1Var, long j9, f0.n nVar) throws Exception {
        m0.n0 n0Var = (m0.n0) this.f42790a.getAndSet(null);
        if (n0Var != null) {
            n0Var.close();
        }
    }

    @Override // e0.h1
    public final void H(k1 k1Var, long j9, j1 j1Var) throws Exception {
        m0.n0 n0Var = (m0.n0) this.f42790a.getAndSet(null);
        if (n0Var != null) {
            n0Var.close();
        }
    }

    @Override // e0.h1
    public final void L(k1 k1Var, long j9, f0.n nVar) throws Exception {
        m0.n0 n0Var = (m0.n0) this.f42790a.getAndSet(null);
        if (n0Var != null) {
            n0Var.close();
        }
    }

    @Override // e0.h1
    public final void t(i1 i1Var) throws Exception {
        i1Var.getClass();
        m0.n0 n0Var = (m0.n0) this.f42790a.getAndSet(null);
        if (n0Var != null) {
            n0Var.close();
        }
    }
}

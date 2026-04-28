package b0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements e0.h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5483a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Map f5484b;

    public x0() {
        kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
        o0Var.getClass();
        this.f5484b = o0Var;
    }

    @Override // e0.h1
    public final void A(e0.k1 k1Var) {
        k1Var.getClass();
        for (Map.Entry entry : this.f5484b.entrySet()) {
            ((Executor) entry.getValue()).execute(new t0((e0.h1) entry.getKey(), k1Var, 0));
        }
    }

    @Override // e0.h1
    public final void G(e0.k1 k1Var, long j9, f0.n nVar) {
        for (Map.Entry entry : this.f5484b.entrySet()) {
            ((Executor) entry.getValue()).execute(new s0((e0.h1) entry.getKey(), k1Var, j9, nVar, 1));
        }
    }

    @Override // e0.h1
    public final void H(e0.k1 k1Var, long j9, e0.j1 j1Var) {
        for (Map.Entry entry : this.f5484b.entrySet()) {
            ((Executor) entry.getValue()).execute(new u0((e0.h1) entry.getKey(), k1Var, j9, j1Var, 0));
        }
    }

    @Override // e0.h1
    public final void I(final e0.k1 k1Var, final long j9, final int i11, final int i12) {
        for (Map.Entry entry : this.f5484b.entrySet()) {
            final e0.h1 h1Var = (e0.h1) entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: b0.v0
                @Override // java.lang.Runnable
                public final void run() {
                    h1Var.I(k1Var, j9, i11, i12);
                }
            });
        }
    }

    @Override // e0.h1
    public final void J(e0.k1 k1Var) {
        k1Var.getClass();
        for (Map.Entry entry : this.f5484b.entrySet()) {
            ((Executor) entry.getValue()).execute(new t0((e0.h1) entry.getKey(), k1Var, 2));
        }
    }

    @Override // e0.h1
    public final void L(e0.k1 k1Var, long j9, f0.n nVar) {
        for (Map.Entry entry : this.f5484b.entrySet()) {
            ((Executor) entry.getValue()).execute(new s0((e0.h1) entry.getKey(), k1Var, j9, nVar, 0));
        }
    }

    public final void a(e0.h1 h1Var, j3 j3Var) {
        j3Var.getClass();
        if (this.f5484b.containsKey(h1Var)) {
            throw new IllegalStateException((h1Var + " was already registered!").toString());
        }
        synchronized (this.f5483a) {
            this.f5483a.put(h1Var, j3Var);
            this.f5484b = kotlin.collections.x0.k(this.f5483a);
        }
    }

    public final void b(e0.h1 h1Var) {
        h1Var.getClass();
        synchronized (this.f5483a) {
            this.f5483a.remove(h1Var);
            this.f5484b = kotlin.collections.x0.k(this.f5483a);
        }
    }

    @Override // e0.h1
    public final void e(e0.k1 k1Var) {
        k1Var.getClass();
        for (Map.Entry entry : this.f5484b.entrySet()) {
            ((Executor) entry.getValue()).execute(new t0((e0.h1) entry.getKey(), k1Var, 1));
        }
    }

    @Override // e0.h1
    public final void g(e0.k1 k1Var, long j9) {
        k1Var.getClass();
        for (Map.Entry entry : this.f5484b.entrySet()) {
            ((Executor) entry.getValue()).execute(new d((e0.h1) entry.getKey(), k1Var, j9, 1));
        }
    }

    @Override // e0.h1
    public final void r(final e0.k1 k1Var, final long j9, final long j11) {
        k1Var.getClass();
        for (Map.Entry entry : this.f5484b.entrySet()) {
            final e0.h1 h1Var = (e0.h1) entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: b0.w0
                @Override // java.lang.Runnable
                public final void run() {
                    h1Var.r(k1Var, j9, j11);
                }
            });
        }
    }

    @Override // e0.h1
    public final void t(e0.i1 i1Var) {
        i1Var.getClass();
        for (Map.Entry entry : this.f5484b.entrySet()) {
            ((Executor) entry.getValue()).execute(new a40.l(19, (e0.h1) entry.getKey(), i1Var));
        }
    }

    @Override // e0.h1
    public final void u(e0.k1 k1Var, long j9, f0.o oVar) {
        k1Var.getClass();
        for (Map.Entry entry : this.f5484b.entrySet()) {
            ((Executor) entry.getValue()).execute(new u0((e0.h1) entry.getKey(), k1Var, j9, oVar, 1));
        }
    }
}

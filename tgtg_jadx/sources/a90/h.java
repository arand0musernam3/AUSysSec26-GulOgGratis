package a90;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import o30.m0;
import v80.h0;
import v80.k0;
import v80.r0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends v80.x implements k0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1024g = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f1025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v80.x f1026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f1028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f1029f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public h(v80.x xVar, int i11) {
        k0 k0Var = xVar instanceof k0 ? (k0) xVar : null;
        this.f1025b = k0Var == null ? h0.f42105a : k0Var;
        this.f1026c = xVar;
        this.f1027d = i11;
        this.f1028e = new m();
        this.f1029f = new Object();
    }

    public final Runnable A0() {
        while (true) {
            Runnable runnable = (Runnable) this.f1028e.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1029f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1024g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1028e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean B0() {
        synchronized (this.f1029f) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1024g;
            if (atomicIntegerFieldUpdater.get(this) >= this.f1027d) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // v80.k0
    public final r0 L(long j9, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f1025b.L(j9, runnable, coroutineContext);
    }

    @Override // v80.k0
    public final void r(long j9, v80.l lVar) {
        this.f1025b.r(j9, lVar);
    }

    @Override // v80.x
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1026c);
        sb2.append(".limitedParallelism(");
        return r8.k.o(sb2, this.f1027d, ')');
    }

    @Override // v80.x
    public final void u0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableA0;
        this.f1028e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1024g;
        if (atomicIntegerFieldUpdater.get(this) >= this.f1027d || !B0() || (runnableA0 = A0()) == null) {
            return;
        }
        try {
            g.i(this.f1026c, this, new m0(this, runnableA0, false, 1));
        } catch (Throwable th2) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // v80.x
    public final void x0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableA0;
        this.f1028e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1024g;
        if (atomicIntegerFieldUpdater.get(this) >= this.f1027d || !B0() || (runnableA0 = A0()) == null) {
            return;
        }
        try {
            this.f1026c.x0(this, new m0(this, runnableA0, false, 1));
        } catch (Throwable th2) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // v80.x
    public final v80.x z0(int i11) {
        g.c(i11);
        return i11 >= this.f1027d ? this : super.z0(i11);
    }
}

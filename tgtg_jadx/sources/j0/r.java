package j0;

import e0.y0;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends c5.b implements x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r80.b f24316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f24317f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, int i11, int i12, r80.b bVar) {
        super(3, false);
        this.f24317f = uVar;
        this.f24314c = i11;
        this.f24315d = i12;
        this.f24316e = bVar;
    }

    @Override // j0.x
    public final void a(Object obj) {
        Object obj2;
        s sVar;
        AutoCloseable autoCloseableA;
        boolean zIsTerminated;
        boolean z11 = obj instanceof y0;
        k0.g gVar = (k0.g) ((z11 || obj == null) ? null : obj);
        if (gVar != null) {
            if (gVar instanceof k0.h) {
                autoCloseableA = ((k0.h) gVar).a();
            } else {
                k0.h hVar = (k0.h) gVar.t(Reflection.getOrCreateKotlinClass(k0.h.class));
                autoCloseableA = hVar != null ? hVar.a() : new k0.h(gVar, new j30.g(gVar));
            }
            if (!((v80.q) this.f7114b).R(new b0(autoCloseableA))) {
                if (autoCloseableA instanceof AutoCloseable) {
                    autoCloseableA.close();
                } else {
                    if (!(autoCloseableA instanceof ExecutorService)) {
                        i4.a.h();
                        return;
                    }
                    ExecutorService executorService = (ExecutorService) autoCloseableA;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z12 = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z12) {
                                    executorService.shutdownNow();
                                    z12 = true;
                                }
                            }
                        }
                        if (z12) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        } else {
            ((v80.q) this.f7114b).R(new b0(new y0((z11 || obj == null) ? obj == null ? 2 : ((y0) obj).f15424a : 1)));
        }
        r80.b bVar = this.f24316e;
        bVar.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = r80.b.f37780b;
        if (atomicIntegerFieldUpdater.decrementAndGet(bVar) == 0) {
            Iterator it = this.f24317f.f24326h.iterator();
            it.getClass();
            if (it.hasNext()) {
                throw e0.f.e(it);
            }
            u uVar = this.f24317f;
            r80.b bVar2 = uVar.f24325g;
            bVar2.getClass();
            if (atomicIntegerFieldUpdater.decrementAndGet(bVar2) != 0) {
                return;
            }
            r80.d dVar = uVar.f24324f;
            do {
                obj2 = dVar.f37785a;
                s sVar2 = (s) obj2;
                int i11 = t.$EnumSwitchMapping$0[sVar2.ordinal()];
                if (i11 == 1) {
                    sVar = s.STREAM_RESULTS_COMPLETE;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("Unexpected frame state for " + uVar + "! State is " + sVar2 + ' ');
                    }
                    sVar = s.COMPLETE;
                }
            } while (!dVar.a(obj2, sVar));
            Iterator it2 = uVar.f24326h.iterator();
            it2.getClass();
            if (it2.hasNext()) {
                throw e0.f.e(it2);
            }
            if (sVar == s.COMPLETE) {
                Iterator it3 = uVar.f24326h.iterator();
                it3.getClass();
                if (it3.hasNext()) {
                    throw e0.f.e(it3);
                }
            }
        }
    }
}

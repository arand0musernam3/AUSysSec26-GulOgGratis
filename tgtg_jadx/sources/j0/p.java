package j0;

import android.util.Log;
import e0.p1;
import e0.x0;
import e0.y0;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f24310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f24311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r80.a f24312c;

    public p(u uVar) {
        v70.e eVar = uVar.f24323e;
        ArrayList arrayList = new ArrayList(e0.o(eVar, 10));
        ListIterator listIterator = eVar.listIterator(0);
        while (true) {
            v70.b bVar = (v70.b) listIterator;
            if (!bVar.hasNext()) {
                break;
            } else {
                arrayList.add(new p1(((r) bVar.next()).f24314c));
            }
        }
        Set setV0 = CollectionsKt.v0(arrayList);
        setV0.getClass();
        this.f24310a = uVar;
        this.f24311b = setV0;
        ArrayList arrayList2 = new ArrayList(e0.o(eVar, 10));
        ListIterator listIterator2 = eVar.listIterator(0);
        while (true) {
            v70.b bVar2 = (v70.b) listIterator2;
            if (!bVar2.hasNext()) {
                CollectionsKt.v0(arrayList2);
                this.f24312c = w.b.p(false);
                return;
            }
            arrayList2.add(new x0(((r) bVar2.next()).f24315d));
        }
    }

    public final boolean a() {
        boolean zIsTerminated;
        if (!this.f24312c.a()) {
            return false;
        }
        u uVar = this.f24310a;
        q qVar = uVar.f24322d;
        v70.e eVar = uVar.f24323e;
        r80.b bVar = (r80.b) qVar.f7113a;
        bVar.getClass();
        if (r80.b.f37780b.decrementAndGet(bVar) == 0) {
            ((v80.q) qVar.f7114b).R(new b0(new y0(2)));
        }
        int iB = eVar.b();
        for (int i11 = 0; i11 < iB; i11++) {
            r rVar = (r) eVar.get(i11);
            if (this.f24311b.contains(new p1(rVar.f24314c))) {
                r80.b bVar2 = (r80.b) rVar.f7113a;
                bVar2.getClass();
                if (r80.b.f37780b.decrementAndGet(bVar2) == 0) {
                    ((v80.q) rVar.f7114b).R(new b0(new y0(2)));
                    v80.q qVar2 = (v80.q) rVar.f7114b;
                    Object obj = null;
                    if (qVar2.a0() && !qVar2.isCancelled()) {
                        Object obj2 = ((b0) qVar2.C()).f24285a;
                        if (!(obj2 instanceof y0) && obj2 != null) {
                            obj = obj2;
                        }
                    }
                    k0.f fVar = (k0.h) obj;
                    if (fVar != null) {
                        if (fVar instanceof AutoCloseable) {
                            fVar.close();
                        } else if (fVar instanceof ExecutorService) {
                            ExecutorService executorService = (ExecutorService) fVar;
                            if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                                executorService.shutdown();
                                boolean z11 = false;
                                while (!zIsTerminated) {
                                    try {
                                        zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                    } catch (InterruptedException unused) {
                                        if (!z11) {
                                            executorService.shutdownNow();
                                            z11 = true;
                                        }
                                    }
                                }
                                if (z11) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                        } else {
                            i4.a.h();
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a();
    }

    public final void finalize() {
        if (a()) {
            Log.e("CXCP", "Failed to close " + this + "! This indicates a memory leak and could cause the camera to stall, or images to be lost.");
        }
    }

    public final String toString() {
        return this.f24310a.toString();
    }
}

package i0;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f22683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t70.a f22684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0.h0 f22685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f22686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f22687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f22688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f22689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22691i;

    public h0(g0 g0Var, ag.d dVar, e0.h0 h0Var, Map map) {
        dVar.getClass();
        map.getClass();
        this.f22683a = g0Var;
        this.f22684b = dVar;
        this.f22685c = h0Var;
        this.f22686d = map;
        this.f22687e = new Object();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ((k0.e) entry.getValue()).getClass();
            linkedHashMap.put(key, null);
        }
        this.f22688f = linkedHashMap;
        this.f22689g = new LinkedHashMap();
        this.f22690h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        r1 = kotlin.collections.o0.f26530a;
        r1.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f22687e
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L4f
            r1.<init>()     // Catch: java.lang.Throwable -> L4f
            i0.g0 r2 = r9.f22683a     // Catch: java.lang.Throwable -> L4f
            java.util.List r2 = r2.f22654c     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L4f
        L10:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L4d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L4f
            i0.d0 r3 = (i0.d0) r3     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList r4 = r3.l     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L4f
        L22:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r5 == 0) goto L10
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L4f
            e0.e0 r5 = (e0.e0) r5     // Catch: java.lang.Throwable -> L4f
            java.util.LinkedHashMap r6 = r9.f22688f     // Catch: java.lang.Throwable -> L4f
            int r7 = r5.f15329a     // Catch: java.lang.Throwable -> L4f
            e0.p1 r8 = new e0.p1     // Catch: java.lang.Throwable -> L4f
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r6 = r6.get(r8)     // Catch: java.lang.Throwable -> L4f
            android.view.Surface r6 = (android.view.Surface) r6     // Catch: java.lang.Throwable -> L4f
            if (r6 != 0) goto L51
            e0.e1 r5 = r3.f22616f     // Catch: java.lang.Throwable -> L4f
            if (r5 == 0) goto L45
            r5 = 1
            goto L46
        L45:
            r5 = 0
        L46:
            if (r5 != 0) goto L22
            kotlin.collections.o0 r1 = kotlin.collections.o0.f26530a     // Catch: java.lang.Throwable -> L4f
            r1.getClass()     // Catch: java.lang.Throwable -> L4f
        L4d:
            monitor-exit(r0)
            goto L5c
        L4f:
            r1 = move-exception
            goto L89
        L51:
            int r5 = r5.f15329a     // Catch: java.lang.Throwable -> L4f
            e0.p1 r7 = new e0.p1     // Catch: java.lang.Throwable -> L4f
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L4f
            r1.put(r7, r6)     // Catch: java.lang.Throwable -> L4f
            goto L22
        L5c:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L63
            goto L85
        L63:
            t70.a r0 = r9.f22684b
            java.lang.Object r0 = r0.get()
            e0.j r0 = (e0.j) r0
            f0.p0 r0 = (f0.p0) r0
            r0.getClass()
            java.lang.Object r2 = r0.f16829q
            monitor-enter(r2)
            boolean r3 = r0.e()     // Catch: java.lang.Throwable -> L86
            if (r3 == 0) goto L7b
            monitor-exit(r2)
            return
        L7b:
            r0.A = r1     // Catch: java.lang.Throwable -> L86
            f0.s2 r0 = r0.f16838z     // Catch: java.lang.Throwable -> L86
            monitor-exit(r2)
            if (r0 == 0) goto L85
            r0.k(r1)
        L85:
            return
        L86:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L89:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h0.a():void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean zIsTerminated;
        synchronized (this.f22687e) {
            if (this.f22691i) {
                return;
            }
            this.f22691i = true;
            this.f22688f.clear();
            List<AutoCloseable> listR0 = CollectionsKt.r0(this.f22689g.values());
            this.f22689g.clear();
            for (AutoCloseable autoCloseable : listR0) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
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
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else {
                    if (!(autoCloseable instanceof MediaDrm)) {
                        i4.a.h();
                        return;
                    }
                    ((MediaDrm) autoCloseable).release();
                }
            }
        }
    }

    public final void e() {
        synchronized (this.f22687e) {
            try {
                if (this.f22691i) {
                    throw new IllegalStateException("Check failed.");
                }
                for (Surface surface : this.f22688f.values()) {
                    this.f22689g.put(surface, this.f22685c.a(surface));
                }
                this.f22690h = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() throws Exception {
        List<AutoCloseable> listR0;
        boolean zIsTerminated;
        synchronized (this.f22687e) {
            this.f22690h = false;
            listR0 = CollectionsKt.r0(this.f22689g.values());
            this.f22689g.clear();
        }
        for (AutoCloseable autoCloseable : listR0) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
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
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    i4.a.h();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
    }
}

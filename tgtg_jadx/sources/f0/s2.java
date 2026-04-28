package f0;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import zendesk.messaging.android.internal.conversationscreen.ConversationFragment;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 implements p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0.v f16878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k2 f16879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.n1 f16880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0.h0 f16881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0.m f16882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e0.p f16883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0.g0 f16884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0.n f16885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v80.b0 f16886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f16887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f16888k;
    public final r80.d l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f16889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f16890n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h0.o f16891o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a50.c f16892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r1 f16893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l2 f16894r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Map f16895s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinkedHashMap f16896t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public m2 f16897u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CountDownLatch f16898v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f16899w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CountDownLatch f16900x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Map f16901y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LinkedHashMap f16902z;

    public s2(i0.v vVar, k2 k2Var, androidx.lifecycle.n1 n1Var, e0.h0 h0Var, h0.m mVar, e0.p pVar, y3 y3Var, i0.g0 g0Var, e0.q1 q1Var, h0.n nVar, v80.b0 b0Var) {
        k2Var.getClass();
        h0Var.getClass();
        mVar.getClass();
        pVar.getClass();
        q1Var.getClass();
        nVar.getClass();
        b0Var.getClass();
        this.f16878a = vVar;
        this.f16879b = k2Var;
        this.f16880c = n1Var;
        this.f16881d = h0Var;
        this.f16882e = mVar;
        this.f16883f = pVar;
        this.f16884g = g0Var;
        this.f16885h = nVar;
        this.f16886i = b0Var;
        r80.b bVar = t2.f16916a;
        bVar.getClass();
        this.f16887j = r80.b.f37780b.incrementAndGet(bVar);
        this.f16888k = new Object();
        this.l = w.b.r(Boolean.FALSE);
        this.f16889m = Collections.synchronizedMap(new HashMap());
        this.f16890n = Collections.synchronizedMap(new HashMap());
        this.f16892p = null;
        this.f16897u = m2.PENDING;
        this.f16898v = new CountDownLatch(1);
        this.f16900x = new CountDownLatch(1);
        this.f16902z = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, f0.r1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(f0.s2 r11, z70.c r12) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.s2.i(f0.s2, z70.c):java.lang.Object");
    }

    @Override // f0.c4
    public final void a() {
        if (this.l.a(Boolean.FALSE, Boolean.TRUE)) {
            Log.d("CXCP", this + " session finalizing");
            Trace.beginSection(this + "#onSessionFinalized");
            o();
            n(0L);
            Trace.endSection();
        }
    }

    @Override // f0.c4
    public final void b() {
        Log.d("CXCP", this + " session disconnecting");
        Trace.beginSection(this + "#onSessionDisconnected");
        l();
        try {
            Trace.beginSection(this + "#onSessionDisconnected Await");
            this.f16898v.await();
            Trace.endSection();
        } finally {
            Trace.endSection();
        }
    }

    @Override // f0.p1
    public final void c(q1 q1Var) {
        q1Var.getClass();
        Log.d("CXCP", this + " Configured");
        Trace.beginSection(this + "#configure");
        j(q1Var);
        this.f16900x.countDown();
        a50.c cVar = this.f16892p;
        if (cVar != null) {
            cVar.C();
        }
        Trace.endSection();
    }

    @Override // f0.p1
    public final void d(q1 q1Var) {
        q1Var.getClass();
        Log.d("CXCP", this + " Ready");
    }

    @Override // f0.p1
    public final void e(q1 q1Var) {
        q1Var.getClass();
        Log.d("CXCP", this + " CaptureQueueEmpty");
    }

    @Override // f0.p1
    public final void f(q1 q1Var) {
        q1Var.getClass();
        Log.d("CXCP", this + " Closed");
        Trace.beginSection(this + "#onClosed");
        o();
        this.f16900x.countDown();
        a50.c cVar = this.f16892p;
        if (cVar != null) {
            cVar.C();
        }
        Trace.endSection();
    }

    @Override // f0.p1
    public final void g(q1 q1Var) {
        q1Var.getClass();
        Log.w("CXCP", this + " Configuration Failed");
        Trace.beginSection(this + "#onConfigureFailed");
        this.f16878a.a(new e0.m0(9, false));
        o();
        this.f16900x.countDown();
        a50.c cVar = this.f16892p;
        if (cVar != null) {
            cVar.C();
        }
        Trace.endSection();
    }

    @Override // f0.p1
    public final void h(q1 q1Var) {
        q1Var.getClass();
        Log.d("CXCP", this + " Active");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(f0.q1 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Configured "
            java.lang.Object r1 = r9.f16888k
            monitor-enter(r1)
            f0.l2 r2 = r9.f16894r     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L2c
            if (r10 == 0) goto L2c
            androidx.lifecycle.n1 r2 = r9.f16880c     // Catch: java.lang.Throwable -> L29
            java.util.Map r3 = r9.f16889m     // Catch: java.lang.Throwable -> L29
            r3.getClass()     // Catch: java.lang.Throwable -> L29
            java.util.Map r4 = r9.f16890n     // Catch: java.lang.Throwable -> L29
            r4.getClass()     // Catch: java.lang.Throwable -> L29
            f0.x0 r2 = r2.j(r10, r3, r4)     // Catch: java.lang.Throwable -> L29
            f0.l2 r3 = new f0.l2     // Catch: java.lang.Throwable -> L29
            i0.w r4 = new i0.w     // Catch: java.lang.Throwable -> L29
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L29
            r3.<init>(r10, r4, r2)     // Catch: java.lang.Throwable -> L29
            r9.f16894r = r3     // Catch: java.lang.Throwable -> L29
            r2 = r3
            goto L2c
        L29:
            r10 = move-exception
            goto L9d
        L2c:
            f0.m2 r10 = r9.f16897u     // Catch: java.lang.Throwable -> L29
            f0.m2 r3 = f0.m2.CREATED     // Catch: java.lang.Throwable -> L29
            if (r10 != r3) goto L9b
            if (r2 != 0) goto L35
            goto L9b
        L35:
            java.util.Map r10 = r9.f16895s     // Catch: java.lang.Throwable -> L29
            r3 = 1
            r4 = 0
            if (r10 == 0) goto L41
            java.util.LinkedHashMap r10 = r9.f16896t     // Catch: java.lang.Throwable -> L29
            if (r10 == 0) goto L41
            r10 = r3
            goto L42
        L41:
            r10 = r4
        L42:
            monitor-exit(r1)
            if (r10 == 0) goto L48
            r9.m(r4)
        L48:
            java.lang.Object r10 = r9.f16888k
            monitor-enter(r10)
            java.lang.String r1 = "CXCP"
            h0.m r4 = r9.f16882e     // Catch: java.lang.Throwable -> L98
            r4.getClass()     // Catch: java.lang.Throwable -> L98
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L98
            h0.o r6 = r9.f16891o     // Catch: java.lang.Throwable -> L98
            r6.getClass()     // Catch: java.lang.Throwable -> L98
            long r6 = r6.f20991a     // Catch: java.lang.Throwable -> L98
            long r4 = r4 - r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L98
            r6.append(r9)     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = " in "
            r6.append(r0)     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = "%.3f ms"
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L98
            r7 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 / r7
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Throwable -> L98
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L98
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)     // Catch: java.lang.Throwable -> L98
            r4 = 0
            java.lang.String r0 = java.lang.String.format(r4, r0, r3)     // Catch: java.lang.Throwable -> L98
            r6.append(r0)     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L98
            android.util.Log.i(r1, r0)     // Catch: java.lang.Throwable -> L98
            i0.v r0 = r9.f16878a     // Catch: java.lang.Throwable -> L98
            i0.w r1 = r2.f16760b     // Catch: java.lang.Throwable -> L98
            r0.b(r1)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r10)
            return
        L98:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L9b:
            monitor-exit(r1)
            return
        L9d:
            monitor-exit(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.s2.j(f0.q1):void");
    }

    public final void k(Map map) {
        map.getClass();
        synchronized (this.f16888k) {
            try {
                m2 m2Var = this.f16897u;
                if (m2Var != m2.CLOSING && m2Var != m2.CLOSED) {
                    Map map2 = this.f16901y;
                    if (map2 == null) {
                        map2 = kotlin.collections.o0.f26530a;
                        map2.getClass();
                    }
                    p(map2, map);
                    this.f16901y = map;
                    Map map3 = this.f16895s;
                    x70.c cVar = null;
                    if (map3 != null && this.f16896t == null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (map3.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (linkedHashMap.size() == map3.size()) {
                            this.f16896t = linkedHashMap;
                            v80.f0.B(this.f16886i, null, null, new a3.y(this, cVar, 7), 3);
                        }
                    }
                    v80.f0.B(this.f16886i, null, null, new n2(this, cVar, 1), 3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l() {
        synchronized (this.f16888k) {
            try {
                m2 m2Var = this.f16897u;
                m2 m2Var2 = m2.CLOSING;
                if (m2Var != m2Var2 && m2Var != m2.CLOSED) {
                    this.f16897u = m2Var2;
                    l2 l2Var = this.f16894r;
                    x70.c cVar = null;
                    boolean z11 = false;
                    if (l2Var != null) {
                        this.f16894r = null;
                    } else {
                        if (this.f16883f.f15393d && this.f16899w) {
                            z11 = true;
                        }
                        l2Var = null;
                    }
                    a50.c cVar2 = this.f16892p;
                    if (cVar2 != null) {
                        cVar2.C();
                    }
                    if (z11) {
                        Log.d("CXCP", "Waiting for CameraCaptureSession configuration");
                        if (((Unit) this.f16885h.b(3000L, new p2(this, cVar, 0))) == null) {
                            Log.e("CXCP", "Waiting for CameraCaptureSession configuration timed out");
                        }
                        synchronized (this.f16888k) {
                            l2Var = this.f16894r;
                            this.f16894r = null;
                        }
                    }
                    Trace.beginSection(this.f16878a + "#onGraphStopping");
                    i0.v vVar = this.f16878a;
                    Log.d("CXCP", vVar + " onGraphStopping");
                    vVar.f22743e.j(e0.p0.f15396b);
                    vVar.f22741c.H(null);
                    for (w.e0 e0Var : vVar.f22742d) {
                        e0Var.f42674a.b(e0Var.a(), e0.p0.f15396b);
                    }
                    Trace.endSection();
                    if (l2Var != null) {
                        i0.w wVar = l2Var.f16760b;
                        Log.d("CXCP", this + " Shutdown");
                        Trace.beginSection(this + "#shutdown");
                        if (this.f16883f.f15390a && ((Unit) this.f16885h.b(ConversationFragment.COORDINATOR_INITIALIZATION_TIMEOUT, new o2(this, wVar, cVar, 1))) == null) {
                            Log.e("CXCP", "Failed to abort captures in 2000ms");
                        }
                        Trace.beginSection(this + "#disconnect");
                        l2Var.f16761c.c();
                        Trace.endSection();
                        if (this.f16883f.f15393d && ((Unit) this.f16885h.b(3000L, new o2(this, l2Var, cVar, 0))) == null) {
                            Log.e("CXCP", "Failed to close the capture session in 3000ms");
                        }
                        Trace.beginSection(this.f16878a + "#onGraphStopped");
                        this.f16878a.c();
                        Trace.endSection();
                        Trace.endSection();
                    } else {
                        Trace.beginSection(this.f16878a + "#onGraphStopped");
                        this.f16878a.c();
                        Trace.endSection();
                    }
                    this.f16898v.countDown();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(boolean z11) {
        l2 l2Var;
        Map map;
        LinkedHashMap linkedHashMap;
        boolean z12;
        synchronized (this.f16888k) {
            l2Var = this.f16894r;
            map = this.f16895s;
            linkedHashMap = this.f16896t;
        }
        if (l2Var == null || map == null || linkedHashMap == null) {
            return;
        }
        Trace.beginSection(this + "#finalizeOutputConfigurations");
        this.f16882e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        for (Map.Entry entry : map.entrySet()) {
            int i11 = ((e0.p1) entry.getKey()).f15397a;
            r rVar = (r) entry.getValue();
            Object obj = linkedHashMap.get(new e0.p1(i11));
            if (obj == null) {
                com.braze.h2.b("Required value was null.");
                return;
            } else {
                rVar.getClass();
                rVar.f16863a.addSurface((Surface) obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashSet.add((r) ((Map.Entry) it.next()).getValue());
        }
        l2Var.f16759a.c0(CollectionsKt.r0(linkedHashSet));
        synchronized (this.f16888k) {
            try {
                if (this.f16897u == m2.CREATED) {
                    this.f16889m.putAll(linkedHashMap);
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (true) {
                        z12 = true;
                        if (it2.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            int i12 = ((e0.p1) entry2.getKey()).f15397a;
                            Surface surface = (Surface) entry2.getValue();
                            e0.e0 e0VarA = this.f16884g.a(i12);
                            if (e0VarA == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            if (e0VarA.f15330b.size() != 1) {
                                throw new IllegalStateException("Cannot finalize a multi-output stream!");
                            }
                            Map map2 = this.f16890n;
                            map2.getClass();
                            map2.put(new e0.x0(((i0.e0) CollectionsKt.h0(e0VarA.f15330b)).f22625a), surface);
                        } else {
                            this.f16882e.getClass();
                            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Finalized ");
                            ArrayList arrayList = new ArrayList(map.size());
                            Iterator it3 = map.entrySet().iterator();
                            while (it3.hasNext()) {
                                arrayList.add(new e0.p1(((e0.p1) ((Map.Entry) it3.next()).getKey()).f15397a));
                            }
                            sb2.append(arrayList);
                            sb2.append(" for ");
                            sb2.append(this);
                            sb2.append(" in ");
                            sb2.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)));
                            Log.i("CXCP", sb2.toString());
                        }
                    }
                } else {
                    z12 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z12 && z11) {
            i0.v vVar = this.f16878a;
            Log.d("CXCP", vVar + " onGraphModified");
            vVar.f22741c.f22726g.C(i0.i.f22693b);
        }
        Trace.endSection();
    }

    public final void n(long j9) {
        List<AutoCloseable> listR0;
        boolean zIsTerminated;
        if (j9 != 0) {
            v80.f0.B(this.f16886i, null, null, new q2(j9, this, (x70.c) null), 3);
            return;
        }
        Log.d("CXCP", "Finalizing " + this);
        synchronized (this.f16888k) {
            listR0 = CollectionsKt.r0(this.f16902z.values());
            this.f16902z.clear();
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            r7 = this;
            r7.l()
            java.lang.Object r0 = r7.f16888k
            monitor-enter(r0)
            f0.m2 r1 = r7.f16897u     // Catch: java.lang.Throwable -> L25
            f0.m2 r2 = f0.m2.CLOSED     // Catch: java.lang.Throwable -> L25
            r3 = 0
            if (r1 == r2) goto L27
            f0.r1 r1 = r7.f16893q     // Catch: java.lang.Throwable -> L25
            r5 = 1
            if (r1 == 0) goto L28
            boolean r1 = r7.f16899w     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L18
            goto L28
        L18:
            e0.p r1 = r7.f16883f     // Catch: java.lang.Throwable -> L25
            int r1 = r1.f15392c     // Catch: java.lang.Throwable -> L25
            if (r1 != r5) goto L1f
            goto L28
        L1f:
            r6 = 2
            if (r1 != r6) goto L27
            r3 = 2000(0x7d0, double:9.88E-321)
            goto L28
        L25:
            r1 = move-exception
            goto L34
        L27:
            r5 = 0
        L28:
            r1 = 0
            r7.f16893q = r1     // Catch: java.lang.Throwable -> L25
            r7.f16897u = r2     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)
            if (r5 == 0) goto L33
            r7.n(r3)
        L33:
            return
        L34:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.s2.o():void");
    }

    public final void p(Map map, Map map2) throws Exception {
        Surface surface;
        AutoCloseable autoCloseable;
        boolean zIsTerminated;
        Set setV0 = CollectionsKt.v0(map.values());
        Set setV02 = CollectionsKt.v0(map2.values());
        Iterator it = kotlin.collections.i1.g(setV0, setV02).iterator();
        do {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this.f16902z;
            if (!zHasNext) {
                for (Surface surface2 : kotlin.collections.i1.g(setV02, setV0)) {
                    linkedHashMap.put(surface2, this.f16881d.a(surface2));
                }
                return;
            }
            surface = (Surface) it.next();
            autoCloseable = (AutoCloseable) linkedHashMap.remove(surface);
            if (autoCloseable == null) {
                autoCloseable = null;
            } else if (autoCloseable instanceof AutoCloseable) {
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
        } while (autoCloseable != null);
        qc.y.j("Surface ", surface, " doesn't have a matching surface token!");
    }

    public final String toString() {
        return "CaptureSessionState-" + this.f16887j;
    }
}

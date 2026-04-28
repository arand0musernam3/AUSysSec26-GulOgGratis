package i0;

import e0.e1;
import e0.o1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements AutoCloseable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r80.b f22644i = w.b.q(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r80.b f22645j = w.b.q(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final r80.b f22646k = w.b.q(0);
    public static final r80.b l = w.b.q(0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final r80.b f22647m = w.b.q(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f22648n = kotlin.collections.d0.h(e1.f15332b, e1.f15333c);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f0 f22649o = new f0(0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final List f22650p = kotlin.collections.d0.h(new o1(0), new o1(34));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f0 f22651q = new f0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0.n f22652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f22653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f22654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f22655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v70.i f22656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f22657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f22658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f22659h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7, types: [kotlin.collections.n0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g0(e0.v r28, e0.n r29, n20.f r30, ag.d r31) {
        /*
            Method dump skipped, instruction units count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.g0.<init>(e0.v, e0.n, n20.f, ag.d):void");
    }

    public final e0.e0 a(int i11) {
        Object next;
        Iterator it = this.f22658g.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((e0.e0) next).f15329a == i11) {
                break;
            }
        }
        return (e0.e0) next;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean zIsTerminated;
        for (AutoCloseable autoCloseable : (r3.i) this.f22656e.values()) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else {
                if (!(autoCloseable instanceof ExecutorService)) {
                    i4.a.h();
                    return;
                }
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
            }
        }
    }

    public final e0.d0 e(int i11) {
        Object next;
        Iterator it = this.f22653b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((e0.e0) ((Map.Entry) next).getValue()).f15329a == i11) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (e0.d0) entry.getKey();
        }
        return null;
    }

    public final String toString() {
        return "StreamGraph(" + this.f22653b + ')';
    }
}

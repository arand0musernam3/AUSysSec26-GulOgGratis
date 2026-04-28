package o30;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import o00.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a1 implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m1 f31844f = new m1(a1.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f31845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f31846b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z0 f31847c = z0.IDLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f31848d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0.f f31849e = new x0.f(this);

    public a1(Executor executor) {
        executor.getClass();
        this.f31845a = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0060  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            r8.getClass()
            java.util.ArrayDeque r0 = r7.f31846b
            monitor-enter(r0)
            o30.z0 r1 = r7.f31847c     // Catch: java.lang.Throwable -> L6c
            o30.z0 r2 = o30.z0.RUNNING     // Catch: java.lang.Throwable -> L6c
            if (r1 == r2) goto L6e
            o30.z0 r2 = o30.z0.QUEUED     // Catch: java.lang.Throwable -> L6c
            if (r1 != r2) goto L11
            goto L6e
        L11:
            long r3 = r7.f31848d     // Catch: java.lang.Throwable -> L6c
            o30.y0 r1 = new o30.y0     // Catch: java.lang.Throwable -> L6c
            r5 = 0
            r1.<init>(r5, r8)     // Catch: java.lang.Throwable -> L6c
            java.util.ArrayDeque r8 = r7.f31846b     // Catch: java.lang.Throwable -> L6c
            r8.add(r1)     // Catch: java.lang.Throwable -> L6c
            o30.z0 r8 = o30.z0.QUEUING     // Catch: java.lang.Throwable -> L6c
            r7.f31847c = r8     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            java.util.concurrent.Executor r0 = r7.f31845a     // Catch: java.lang.Throwable -> L45
            x0.f r5 = r7.f31849e     // Catch: java.lang.Throwable -> L45
            r0.execute(r5)     // Catch: java.lang.Throwable -> L45
            o30.z0 r0 = r7.f31847c
            if (r0 == r8) goto L2f
            goto L68
        L2f:
            java.util.ArrayDeque r0 = r7.f31846b
            monitor-enter(r0)
            long r5 = r7.f31848d     // Catch: java.lang.Throwable -> L3f
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L41
            o30.z0 r1 = r7.f31847c     // Catch: java.lang.Throwable -> L3f
            if (r1 != r8) goto L41
            r7.f31847c = r2     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r8 = move-exception
            goto L43
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r8
        L45:
            r8 = move-exception
            java.util.ArrayDeque r2 = r7.f31846b
            monitor-enter(r2)
            o30.z0 r0 = r7.f31847c     // Catch: java.lang.Throwable -> L54
            o30.z0 r3 = o30.z0.IDLE     // Catch: java.lang.Throwable -> L54
            if (r0 == r3) goto L56
            o30.z0 r3 = o30.z0.QUEUING     // Catch: java.lang.Throwable -> L54
            if (r0 != r3) goto L60
            goto L56
        L54:
            r8 = move-exception
            goto L6a
        L56:
            java.util.ArrayDeque r0 = r7.f31846b     // Catch: java.lang.Throwable -> L54
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L60
            r0 = 1
            goto L61
        L60:
            r0 = 0
        L61:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L69
            if (r0 != 0) goto L69
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
        L68:
            return
        L69:
            throw r8     // Catch: java.lang.Throwable -> L54
        L6a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            throw r8
        L6c:
            r8 = move-exception
            goto L75
        L6e:
            java.util.ArrayDeque r1 = r7.f31846b     // Catch: java.lang.Throwable -> L6c
            r1.add(r8)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            return
        L75:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o30.a1.execute(java.lang.Runnable):void");
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f31845a + "}";
    }
}

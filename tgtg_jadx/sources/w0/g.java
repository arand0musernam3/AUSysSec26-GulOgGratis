package w0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f42818b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f42817a = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a8.f f42819c = new a8.f(this, 18);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f42820d = f.IDLE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f42821e = 0;

    public g(Executor executor) {
        executor.getClass();
        this.f42818b = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0062  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            r8.getClass()
            java.util.ArrayDeque r0 = r7.f42817a
            monitor-enter(r0)
            w0.f r1 = r7.f42820d     // Catch: java.lang.Throwable -> L6e
            w0.f r2 = w0.f.RUNNING     // Catch: java.lang.Throwable -> L6e
            if (r1 == r2) goto L70
            w0.f r2 = w0.f.QUEUED     // Catch: java.lang.Throwable -> L6e
            if (r1 != r2) goto L11
            goto L70
        L11:
            long r3 = r7.f42821e     // Catch: java.lang.Throwable -> L6e
            o30.y0 r1 = new o30.y0     // Catch: java.lang.Throwable -> L6e
            r5 = 2
            r1.<init>(r5, r8)     // Catch: java.lang.Throwable -> L6e
            java.util.ArrayDeque r8 = r7.f42817a     // Catch: java.lang.Throwable -> L6e
            r8.add(r1)     // Catch: java.lang.Throwable -> L6e
            w0.f r8 = w0.f.QUEUING     // Catch: java.lang.Throwable -> L6e
            r7.f42820d = r8     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            java.util.concurrent.Executor r0 = r7.f42818b     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            a8.f r5 = r7.f42819c     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            r0.execute(r5)     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            w0.f r0 = r7.f42820d
            if (r0 == r8) goto L2f
            goto L6a
        L2f:
            java.util.ArrayDeque r0 = r7.f42817a
            monitor-enter(r0)
            long r5 = r7.f42821e     // Catch: java.lang.Throwable -> L3f
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L41
            w0.f r1 = r7.f42820d     // Catch: java.lang.Throwable -> L3f
            if (r1 != r8) goto L41
            r7.f42820d = r2     // Catch: java.lang.Throwable -> L3f
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
            goto L48
        L47:
            r8 = move-exception
        L48:
            java.util.ArrayDeque r2 = r7.f42817a
            monitor-enter(r2)
            w0.f r0 = r7.f42820d     // Catch: java.lang.Throwable -> L56
            w0.f r3 = w0.f.IDLE     // Catch: java.lang.Throwable -> L56
            if (r0 == r3) goto L58
            w0.f r3 = w0.f.QUEUING     // Catch: java.lang.Throwable -> L56
            if (r0 != r3) goto L62
            goto L58
        L56:
            r8 = move-exception
            goto L6c
        L58:
            java.util.ArrayDeque r0 = r7.f42817a     // Catch: java.lang.Throwable -> L56
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L62
            r0 = 1
            goto L63
        L62:
            r0 = 0
        L63:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L6b
            if (r0 != 0) goto L6b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L56
        L6a:
            return
        L6b:
            throw r8     // Catch: java.lang.Throwable -> L56
        L6c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L56
            throw r8
        L6e:
            r8 = move-exception
            goto L77
        L70:
            java.util.ArrayDeque r1 = r7.f42817a     // Catch: java.lang.Throwable -> L6e
            r1.add(r8)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            return
        L77:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.g.execute(java.lang.Runnable):void");
    }
}

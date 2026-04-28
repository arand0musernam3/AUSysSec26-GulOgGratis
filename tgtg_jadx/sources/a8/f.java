package a8;

import java.util.Objects;
import qz.j0;
import y00.c1;
import y00.l4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f970b;

    public f(jd.f fVar) {
        this.f969a = 12;
        Objects.requireNonNull(fVar);
        this.f970b = fVar;
    }

    private final void a() {
        try {
            b();
        } catch (Error e5) {
            synchronized (((w0.g) this.f970b).f42817a) {
                ((w0.g) this.f970b).f42820d = w0.f.IDLE;
                throw e5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r1 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        r3.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        wd.a.s("SequentialExecutor", "Exception while executing runnable " + r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r9.f970b     // Catch: java.lang.Throwable -> L51
            w0.g r2 = (w0.g) r2     // Catch: java.lang.Throwable -> L51
            java.util.ArrayDeque r2 = r2.f42817a     // Catch: java.lang.Throwable -> L51
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r9.f970b     // Catch: java.lang.Throwable -> L20
            w0.g r0 = (w0.g) r0     // Catch: java.lang.Throwable -> L20
            w0.f r3 = r0.f42820d     // Catch: java.lang.Throwable -> L20
            w0.f r4 = w0.f.RUNNING     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L6b
        L22:
            long r5 = r0.f42821e     // Catch: java.lang.Throwable -> L20
            r7 = 1
            long r5 = r5 + r7
            r0.f42821e = r5     // Catch: java.lang.Throwable -> L20
            r0.f42820d = r4     // Catch: java.lang.Throwable -> L20
            r0 = 1
        L2c:
            java.lang.Object r3 = r9.f970b     // Catch: java.lang.Throwable -> L20
            w0.g r3 = (w0.g) r3     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r3 = r3.f42817a     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L47
            java.lang.Object r0 = r9.f970b     // Catch: java.lang.Throwable -> L20
            w0.g r0 = (w0.g) r0     // Catch: java.lang.Throwable -> L20
            w0.f r3 = w0.f.IDLE     // Catch: java.lang.Throwable -> L20
            r0.f42820d = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L51
            r1 = r1 | r2
            r3.run()     // Catch: java.lang.Throwable -> L51 java.lang.RuntimeException -> L53
            goto L2
        L51:
            r0 = move-exception
            goto L6d
        L53:
            r2 = move-exception
            java.lang.String r4 = "SequentialExecutor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r5.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r6 = "Exception while executing runnable "
            r5.append(r6)     // Catch: java.lang.Throwable -> L51
            r5.append(r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L51
            wd.a.s(r4, r3, r2)     // Catch: java.lang.Throwable -> L51
            goto L2
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L51
        L6d:
            if (r1 == 0) goto L76
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L76:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.f.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01c5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.f.run():void");
    }

    public /* synthetic */ f(Object obj, int i11) {
        this.f969a = i11;
        this.f970b = obj;
    }

    public f(j0 j0Var) {
        this.f969a = 13;
        Objects.requireNonNull(j0Var);
        this.f970b = j0Var;
    }

    public f(c1 c1Var, boolean z11) {
        this.f969a = 23;
        this.f970b = c1Var;
    }

    public f(l4 l4Var, androidx.appcompat.view.a aVar) {
        this.f969a = 27;
        this.f970b = l4Var;
    }
}

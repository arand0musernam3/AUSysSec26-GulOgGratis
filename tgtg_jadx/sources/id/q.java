package id;

import ia0.a0;
import ia0.d0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f23802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ia0.m f23803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AutoCloseable f23805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f23806e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d0 f23808g;

    public q(a0 a0Var, ia0.m mVar, String str, AutoCloseable autoCloseable) {
        this.f23802a = a0Var;
        this.f23803b = mVar;
        this.f23804c = str;
        this.f23805d = autoCloseable;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f23806e
            monitor-enter(r0)
            r1 = 1
            r2.f23807f = r1     // Catch: java.lang.Throwable -> L1c
            ia0.d0 r1 = r2.f23808g     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L10
            r1.close()     // Catch: java.lang.RuntimeException -> Le java.lang.Exception -> L10 java.lang.Throwable -> L1c
            goto L10
        Le:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1c
        L10:
            java.lang.AutoCloseable r1 = r2.f23805d     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1a
            w.a0.z(r1)     // Catch: java.lang.RuntimeException -> L18 java.lang.Exception -> L1a java.lang.Throwable -> L1c
            goto L1a
        L18:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1c
        L1a:
            monitor-exit(r0)
            return
        L1c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: id.q.close():void");
    }

    @Override // id.r
    public final ia0.m getFileSystem() {
        return this.f23803b;
    }

    @Override // id.r
    public final na0.a getMetadata() {
        return null;
    }

    @Override // id.r
    public final a0 h0() {
        a0 a0Var;
        synchronized (this.f23806e) {
            if (this.f23807f) {
                throw new IllegalStateException("closed");
            }
            a0Var = this.f23802a;
        }
        return a0Var;
    }

    @Override // id.r
    public final ia0.i p0() {
        synchronized (this.f23806e) {
            if (this.f23807f) {
                throw new IllegalStateException("closed");
            }
            d0 d0Var = this.f23808g;
            if (d0Var != null) {
                return d0Var;
            }
            d0 d0VarC = ia0.b.c(this.f23803b.J(this.f23802a));
            this.f23808g = d0VarC;
            return d0VarC;
        }
    }
}

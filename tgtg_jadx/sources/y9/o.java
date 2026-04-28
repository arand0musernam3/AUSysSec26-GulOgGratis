package y9;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f45714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f45715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f45716d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f45718f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f45713a = new ReentrantLock();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReentrantLock f45717e = new ReentrantLock();

    public o(int i11) {
        this.f45714b = new long[i11];
        this.f45715c = new boolean[i11];
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int[] r13) {
        /*
            r12 = this;
            r13.getClass()
            java.util.concurrent.locks.ReentrantLock r0 = r12.f45713a
            r0.lock()
            int r1 = r13.length     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r3 = r2
            r4 = r3
        Lc:
            r5 = 1
            if (r3 >= r1) goto L29
            r6 = r13[r3]     // Catch: java.lang.Throwable -> L24
            long[] r7 = r12.f45714b     // Catch: java.lang.Throwable -> L24
            r8 = r7[r6]     // Catch: java.lang.Throwable -> L24
            r10 = 1
            long r10 = r10 + r8
            r7[r6] = r10     // Catch: java.lang.Throwable -> L24
            r6 = 0
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L26
            r12.f45716d = r5     // Catch: java.lang.Throwable -> L24
            r4 = r5
            goto L26
        L24:
            r13 = move-exception
            goto L38
        L26:
            int r3 = r3 + 1
            goto Lc
        L29:
            if (r4 != 0) goto L33
            boolean r13 = r12.f45716d     // Catch: java.lang.Throwable -> L24
            if (r13 != 0) goto L33
            boolean r13 = r12.f45718f     // Catch: java.lang.Throwable -> L24
            if (r13 == 0) goto L34
        L33:
            r2 = r5
        L34:
            r0.unlock()
            return r2
        L38:
            r0.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.o.a(int[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int[] r15) {
        /*
            r14 = this;
            r15.getClass()
            java.util.concurrent.locks.ReentrantLock r0 = r14.f45713a
            r0.lock()
            int r1 = r15.length     // Catch: java.lang.Throwable -> L23
            r2 = 0
            r3 = r2
            r4 = r3
        Lc:
            r5 = 1
            if (r3 >= r1) goto L28
            r6 = r15[r3]     // Catch: java.lang.Throwable -> L23
            long[] r7 = r14.f45714b     // Catch: java.lang.Throwable -> L23
            r8 = r7[r6]     // Catch: java.lang.Throwable -> L23
            r10 = 1
            long r12 = r8 - r10
            r7[r6] = r12     // Catch: java.lang.Throwable -> L23
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L25
            r14.f45716d = r5     // Catch: java.lang.Throwable -> L23
            r4 = r5
            goto L25
        L23:
            r15 = move-exception
            goto L37
        L25:
            int r3 = r3 + 1
            goto Lc
        L28:
            if (r4 != 0) goto L32
            boolean r15 = r14.f45716d     // Catch: java.lang.Throwable -> L23
            if (r15 != 0) goto L32
            boolean r15 = r14.f45718f     // Catch: java.lang.Throwable -> L23
            if (r15 == 0) goto L33
        L32:
            r2 = r5
        L33:
            r0.unlock()
            return r2
        L37:
            r0.unlock()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.o.b(int[]):boolean");
    }
}

package j1;

import al.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1.d f24367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f24368b;

    public c(l1.d dVar) {
        this.f24367a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(m1.c r9, z70.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof j1.a
            if (r0 == 0) goto L13
            r0 = r10
            j1.a r0 = (j1.a) r0
            int r1 = r0.f24364m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24364m = r1
            goto L18
        L13:
            j1.a r0 = new j1.a
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f24363k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f24364m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            m1.i r9 = r0.f24362j
            ba0.g.M(r10)     // Catch: java.lang.Throwable -> L2a
            goto L63
        L2a:
            r10 = move-exception
            goto L69
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L33:
            ba0.g.M(r10)
            al.n r10 = r8.f24368b
            if (r10 == 0) goto L6f
            java.lang.Object r2 = r9.a()
            android.view.Surface r2 = (android.view.Surface) r2
            if (r2 == 0) goto L6f
            m1.i r5 = new m1.i
            hi.d r6 = new hi.d
            r7 = 21
            r6.<init>(r9, r7)
            l1.d r9 = r8.f24367a
            r5.<init>(r2, r9, r6)
            h2.a0 r9 = new h2.a0     // Catch: java.lang.Throwable -> L67
            r2 = 12
            r9.<init>(r10, r5, r4, r2)     // Catch: java.lang.Throwable -> L67
            r0.f24362j = r5     // Catch: java.lang.Throwable -> L67
            r0.f24364m = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r9 = v80.f0.n(r9, r0)     // Catch: java.lang.Throwable -> L67
            if (r9 != r1) goto L62
            return r1
        L62:
            r9 = r5
        L63:
            w.b.y(r9, r4)
            goto L6f
        L67:
            r10 = move-exception
            r9 = r5
        L69:
            throw r10     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            w.b.y(r9, r10)
            throw r0
        L6f:
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.c.a(m1.c, z70.c):java.lang.Object");
    }
}

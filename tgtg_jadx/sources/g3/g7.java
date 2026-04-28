package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e90.c f18681a = e90.d.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.k1 f18682b = m3.i.w(null);

    public static Object c(g7 g7Var, String str, String str2, a7 a7Var, x70.c cVar, int i11) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            a7Var = str2 == null ? a7.Short : a7.Indefinite;
        }
        g7Var.getClass();
        return g7Var.b(new e7(str, str2, false, a7Var), cVar);
    }

    public final d7 a() {
        return (d7) this.f18682b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(g3.e7 r9, x70.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof g3.f7
            if (r0 == 0) goto L13
            r0 = r10
            g3.f7 r0 = (g3.f7) r0
            int r1 = r0.f18619n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18619n = r1
            goto L18
        L13:
            g3.f7 r0 = new g3.f7
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f18619n
            m3.k1 r3 = r8.f18682b
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L38
            if (r2 != r4) goto L31
            e90.a r9 = r0.f18617k
            ba0.g.M(r10)     // Catch: java.lang.Throwable -> L2f
            goto L78
        L2f:
            r10 = move-exception
            goto L85
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L38:
            e90.a r9 = r0.f18617k
            g3.e7 r2 = r0.f18616j
            ba0.g.M(r10)
            r10 = r9
            r9 = r2
            goto L54
        L42:
            ba0.g.M(r10)
            r0.f18616j = r9
            e90.c r10 = r8.f18681a
            r0.f18617k = r10
            r0.f18619n = r5
            java.lang.Object r2 = r10.g(r0)
            if (r2 != r1) goto L54
            goto L74
        L54:
            r0.f18616j = r9     // Catch: java.lang.Throwable -> L81
            r0.f18617k = r10     // Catch: java.lang.Throwable -> L81
            r0.f18619n = r4     // Catch: java.lang.Throwable -> L81
            v80.l r2 = new v80.l     // Catch: java.lang.Throwable -> L81
            x70.c r0 = y70.f.b(r0)     // Catch: java.lang.Throwable -> L81
            r2.<init>(r5, r0)     // Catch: java.lang.Throwable -> L81
            r2.t()     // Catch: java.lang.Throwable -> L81
            g3.d7 r0 = new g3.d7     // Catch: java.lang.Throwable -> L81
            r0.<init>(r9, r2)     // Catch: java.lang.Throwable -> L81
            r3.setValue(r0)     // Catch: java.lang.Throwable -> L81
            java.lang.Object r9 = r2.s()     // Catch: java.lang.Throwable -> L81
            if (r9 != r1) goto L75
        L74:
            return r1
        L75:
            r7 = r10
            r10 = r9
            r9 = r7
        L78:
            r3.setValue(r6)     // Catch: java.lang.Throwable -> L7f
            r9.e(r6)
            return r10
        L7f:
            r10 = move-exception
            goto L89
        L81:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L85:
            r3.setValue(r6)     // Catch: java.lang.Throwable -> L7f
            throw r10     // Catch: java.lang.Throwable -> L7f
        L89:
            r9.e(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.g7.b(g3.e7, x70.c):java.lang.Object");
    }
}

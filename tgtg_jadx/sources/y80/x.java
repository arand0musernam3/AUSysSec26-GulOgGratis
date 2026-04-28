package y80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class x {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(y80.c2 r4, i80.n r5, java.lang.Throwable r6, z70.c r7) {
        /*
            boolean r0 = r7 instanceof y80.s
            if (r0 == 0) goto L13
            r0 = r7
            y80.s r0 = (y80.s) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            y80.s r0 = new y80.s
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f45569k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.f45568j
            ba0.g.M(r7)     // Catch: java.lang.Throwable -> L29
            goto L40
        L29:
            r4 = move-exception
            goto L43
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L32:
            ba0.g.M(r7)
            r0.f45568j = r6     // Catch: java.lang.Throwable -> L29
            r0.l = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L40
            return r1
        L40:
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        L43:
            if (r6 == 0) goto L4a
            if (r6 == r4) goto L4a
            u70.e.a(r4, r6)
        L4a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.x.a(y80.c2, i80.n, java.lang.Throwable, z70.c):java.lang.Object");
    }
}

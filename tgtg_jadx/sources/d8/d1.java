package d8;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e90.c f14601a = e90.d.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final se.b f14602b = new se.b(14);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final at.o f14603c = new at.o(new c5.z0(2, null, 1));

    public d1(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // d8.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function2 r7, z70.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof d8.c1
            if (r0 == 0) goto L13
            r0 = r8
            d8.c1 r0 = (d8.c1) r0
            int r1 = r0.f14593n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14593n = r1
            goto L18
        L13:
            d8.c1 r0 = new d8.c1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f14593n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            boolean r7 = r0.f14591k
            e90.c r0 = r0.f14590j
            ba0.g.M(r8)     // Catch: java.lang.Throwable -> L2c
            goto L52
        L2c:
            r8 = move-exception
            goto L5c
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L35:
            ba0.g.M(r8)
            e90.c r8 = r6.f14601a
            boolean r2 = r8.tryLock()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L58
            r0.f14590j = r8     // Catch: java.lang.Throwable -> L58
            r0.f14591k = r2     // Catch: java.lang.Throwable -> L58
            r0.f14593n = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L58
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r0 = r8
            r8 = r7
            r7 = r2
        L52:
            if (r7 == 0) goto L57
            r0.e(r4)
        L57:
            return r8
        L58:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L5c:
            if (r7 == 0) goto L61
            r0.e(r4)
        L61:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.d1.a(kotlin.jvm.functions.Function2, z70.c):java.lang.Object");
    }

    @Override // d8.k0
    public final Object b(z70.c cVar) {
        return new Integer(((AtomicInteger) this.f14602b.f39010b).get());
    }

    @Override // d8.k0
    public final Object c(x xVar) {
        return new Integer(((AtomicInteger) this.f14602b.f39010b).incrementAndGet());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // d8.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.jvm.functions.Function1 r8, z70.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof d8.b1
            if (r0 == 0) goto L13
            r0 = r9
            d8.b1 r0 = (d8.b1) r0
            int r1 = r0.f14581n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14581n = r1
            goto L18
        L13:
            d8.b1 r0 = new d8.b1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f14581n
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f14578j
            e90.a r8 = (e90.a) r8
            ba0.g.M(r9)     // Catch: java.lang.Throwable -> L2f
            goto L66
        L2f:
            r9 = move-exception
            goto L6e
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L38:
            e90.c r8 = r0.f14579k
            java.lang.Object r2 = r0.f14578j
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            ba0.g.M(r9)
            r9 = r8
            r8 = r2
            goto L56
        L44:
            ba0.g.M(r9)
            r0.f14578j = r8
            e90.c r9 = r7.f14601a
            r0.f14579k = r9
            r0.f14581n = r4
            java.lang.Object r2 = r9.g(r0)
            if (r2 != r1) goto L56
            goto L62
        L56:
            r0.f14578j = r9     // Catch: java.lang.Throwable -> L6a
            r0.f14579k = r5     // Catch: java.lang.Throwable -> L6a
            r0.f14581n = r3     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6a
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            r6 = r9
            r9 = r8
            r8 = r6
        L66:
            r8.e(r5)
            return r9
        L6a:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L6e:
            r8.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.d1.d(kotlin.jvm.functions.Function1, z70.c):java.lang.Object");
    }

    @Override // d8.k0
    public final y80.i e() {
        return this.f14603c;
    }
}

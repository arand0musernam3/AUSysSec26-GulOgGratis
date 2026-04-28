package m3;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f29348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c40.q f29349b = new c40.q(5);

    public n1(x0 x0Var) {
        this.f29348a = x0Var;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // m3.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(kotlin.jvm.functions.Function1 r7, x70.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof m3.m1
            if (r0 == 0) goto L13
            r0 = r8
            m3.m1 r0 = (m3.m1) r0
            int r1 = r0.f29336m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29336m = r1
            goto L18
        L13:
            m3.m1 r0 = new m3.m1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f29335k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f29336m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r8)
            return r8
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L31:
            kotlin.jvm.functions.Function1 r7 = r0.f29334j
            ba0.g.M(r8)
            goto L78
        L37:
            ba0.g.M(r8)
            c40.q r8 = r6.f29349b
            r0.f29334j = r7
            r0.f29336m = r4
            java.lang.Object r2 = r8.f7093c
            monitor-enter(r2)
            boolean r5 = r8.f7092b     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r2)
            if (r5 == 0) goto L4b
            kotlin.Unit r8 = kotlin.Unit.f26487a
            goto L75
        L4b:
            v80.l r2 = new v80.l
            x70.c r5 = y70.f.b(r0)
            r2.<init>(r4, r5)
            r2.t()
            java.lang.Object r4 = r8.f7093c
            monitor-enter(r4)
            java.lang.Object r5 = r8.f7094d     // Catch: java.lang.Throwable -> L87
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L87
            r5.add(r2)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r4)
            ao.p2 r4 = new ao.p2
            r5 = 14
            r4.<init>(r5, r8, r2)
            r2.v(r4)
            java.lang.Object r8 = r2.s()
            if (r8 != r1) goto L73
            goto L75
        L73:
            kotlin.Unit r8 = kotlin.Unit.f26487a
        L75:
            if (r8 != r1) goto L78
            goto L85
        L78:
            m3.x0 r8 = r6.f29348a
            r2 = 0
            r0.f29334j = r2
            r0.f29336m = r3
            java.lang.Object r7 = r8.t(r7, r0)
            if (r7 != r1) goto L86
        L85:
            return r1
        L86:
            return r7
        L87:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L8a:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.n1.t(kotlin.jvm.functions.Function1, x70.c):java.lang.Object");
    }
}

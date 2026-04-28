package g3;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s3 implements z1.l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2.j f19468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w6 f19469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f19470c;

    public s3(a2.j jVar, w6 w6Var, Function0 function0) {
        this.f19468a = jVar;
        this.f19469b = w6Var;
        this.f19470c = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z1.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(z1.q2 r7, float r8, x70.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof g3.r3
            if (r0 == 0) goto L13
            r0 = r9
            g3.r3 r0 = (g3.r3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L1a
        L13:
            g3.r3 r0 = new g3.r3
            z70.c r9 = (z70.c) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.f19391j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            kotlin.jvm.functions.Function0 r3 = r6.f19470c
            g3.w6 r4 = r6.f19469b
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2f
            ba0.g.M(r9)     // Catch: java.lang.Throwable -> L2d
            goto L44
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L36:
            ba0.g.M(r9)
            a2.j r9 = r6.f19468a     // Catch: java.lang.Throwable -> L2d
            r0.l = r5     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r9 = r9.a(r7, r8, r0)     // Catch: java.lang.Throwable -> L2d
            if (r9 != r1) goto L44
            return r1
        L44:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> L2d
            float r7 = r9.floatValue()     // Catch: java.lang.Throwable -> L2d
            boolean r8 = r4.f()
            if (r8 != 0) goto L53
            r3.invoke()
        L53:
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        L59:
            boolean r8 = r4.f()
            if (r8 != 0) goto L62
            r3.invoke()
        L62:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.s3.a(z1.q2, float, x70.c):java.lang.Object");
    }
}

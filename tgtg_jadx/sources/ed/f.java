package ed;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, ae.h, androidx.lifecycle.d0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(androidx.lifecycle.Lifecycle r5, z70.c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof ed.e
            if (r0 == 0) goto L13
            r0 = r6
            ed.e r0 = (ed.e) r0
            int r1 = r0.f15925m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15925m = r1
            goto L18
        L13:
            ed.e r0 = new ed.e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f15925m
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.Ref$ObjectRef r5 = r0.f15924k
            androidx.lifecycle.Lifecycle r0 = r0.f15923j
            ba0.g.M(r6)     // Catch: java.lang.Throwable -> L2b
            goto L71
        L2b:
            r6 = move-exception
            goto L82
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L34:
            ba0.g.M(r6)
            androidx.lifecycle.Lifecycle$State r6 = r5.b()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r6 = r6.a(r2)
            if (r6 == 0) goto L46
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        L46:
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            r0.f15923j = r5     // Catch: java.lang.Throwable -> L7d
            r0.f15924k = r6     // Catch: java.lang.Throwable -> L7d
            r0.f15925m = r3     // Catch: java.lang.Throwable -> L7d
            v80.l r2 = new v80.l     // Catch: java.lang.Throwable -> L7d
            x70.c r0 = y70.f.b(r0)     // Catch: java.lang.Throwable -> L7d
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L7d
            r2.t()     // Catch: java.lang.Throwable -> L7d
            ae.h r0 = new ae.h     // Catch: java.lang.Throwable -> L7d
            r3 = 1
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L7d
            r6.element = r0     // Catch: java.lang.Throwable -> L7d
            r5.a(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r2.s()     // Catch: java.lang.Throwable -> L7d
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r0 = r5
            r5 = r6
        L71:
            T r5 = r5.element
            androidx.lifecycle.d0 r5 = (androidx.lifecycle.d0) r5
            if (r5 == 0) goto L7a
            r0.d(r5)
        L7a:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        L7d:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L82:
            T r5 = r5.element
            androidx.lifecycle.d0 r5 = (androidx.lifecycle.d0) r5
            if (r5 == 0) goto L8b
            r0.d(r5)
        L8b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.f.a(androidx.lifecycle.Lifecycle, z70.c):java.lang.Object");
    }
}

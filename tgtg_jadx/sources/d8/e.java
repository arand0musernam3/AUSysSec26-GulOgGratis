package d8;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0083 -> B:25:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0086 -> B:25:0x0066). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.util.List r6, d8.j0 r7, z70.c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof d8.d
            if (r0 == 0) goto L13
            r0 = r8
            d8.d r0 = (d8.d) r0
            int r1 = r0.f14596m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14596m = r1
            goto L18
        L13:
            d8.d r0 = new d8.d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f14596m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f14595k
            java.io.Serializable r7 = r0.f14594j
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            ba0.g.M(r8)     // Catch: java.lang.Throwable -> L30
            goto L66
        L30:
            r8 = move-exception
            goto L7f
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L39:
            java.io.Serializable r6 = r0.f14594j
            java.util.List r6 = (java.util.List) r6
            ba0.g.M(r8)
            goto L5d
        L41:
            ba0.g.M(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            al.j r2 = new al.j
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f14594j = r8
            r0.f14596m = r4
            d8.j r7 = (d8.j) r7
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L5c
            goto L94
        L5c:
            r6 = r8
        L5d:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L66:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8c
            java.lang.Object r8 = r6.next()
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r0.f14594j = r7     // Catch: java.lang.Throwable -> L30
            r0.f14595k = r6     // Catch: java.lang.Throwable -> L30
            r0.f14596m = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L66
            goto L94
        L7f:
            T r2 = r7.element
            if (r2 != 0) goto L86
            r7.element = r8
            goto L66
        L86:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            u70.e.a(r2, r8)
            goto L66
        L8c:
            T r6 = r7.element
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L95
            kotlin.Unit r1 = kotlin.Unit.f26487a
        L94:
            return r1
        L95:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.e.a(java.util.List, d8.j0, z70.c):java.lang.Object");
    }
}

package d8;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements kotlin.coroutines.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f14624a = new h1();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006f -> B:27:0x0072). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.io.FileOutputStream r12, z70.c r13) throws java.io.IOException {
        /*
            boolean r0 = r13 instanceof d8.n0
            if (r0 == 0) goto L13
            r0 = r13
            d8.n0 r0 = (d8.n0) r0
            int r1 = r0.f14661m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14661m = r1
            goto L18
        L13:
            d8.n0 r0 = new d8.n0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f14661m
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            long r4 = r0.f14660k
            java.io.FileOutputStream r12 = r0.f14659j
            ba0.g.M(r13)
            r13 = r0
            goto L72
        L2c:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            r12 = 0
            return r12
        L33:
            ba0.g.M(r13)
            r4 = 10
            r13 = r0
        L39:
            r6 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L77
            java.nio.channels.FileChannel r6 = r12.getChannel()     // Catch: java.io.IOException -> L55
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
            r7 = 0
            java.nio.channels.FileLock r0 = r6.lock(r7, r9, r11)     // Catch: java.io.IOException -> L55
            r0.getClass()     // Catch: java.io.IOException -> L55
            r1 = r0
            goto L8a
        L55:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            if (r2 == 0) goto L76
            java.lang.String r6 = "Resource deadlock would occur"
            r7 = 0
            boolean r2 = kotlin.text.StringsKt.z(r2, r6, r7)
            if (r2 != r3) goto L76
            r13.f14659j = r12
            r13.f14660k = r4
            r13.f14661m = r3
            java.lang.Object r0 = v80.f0.o(r4, r13)
            if (r0 != r1) goto L72
            goto L8a
        L72:
            r0 = 2
            long r6 = (long) r0
            long r4 = r4 * r6
            goto L39
        L76:
            throw r0
        L77:
            java.nio.channels.FileChannel r6 = r12.getChannel()
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
            r7 = 0
            java.nio.channels.FileLock r1 = r6.lock(r7, r9, r11)
            r1.getClass()
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.h1.a(java.io.FileOutputStream, z70.c):java.lang.Object");
    }
}

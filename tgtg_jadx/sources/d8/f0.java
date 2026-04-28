package d8;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f14610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f14611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f14612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f14613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f14614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e90.c f14615f;

    public f0(File file, x0 x0Var, k0 k0Var, b0 b0Var) {
        x0Var.getClass();
        k0Var.getClass();
        this.f14610a = file;
        this.f14611b = x0Var;
        this.f14612c = k0Var;
        this.f14613d = b0Var;
        this.f14614e = new AtomicBoolean(false);
        this.f14615f = e90.d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072 A[Catch: all -> 0x0073, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0073, blocks: (B:34:0x0072, B:43:0x0082, B:42:0x007f, B:39:0x007a), top: B:52:0x0022, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [d8.m] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(d8.m r10, z70.c r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof d8.d0
            if (r0 == 0) goto L13
            r0 = r11
            d8.d0 r0 = (d8.d0) r0
            int r1 = r0.f14600n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14600n = r1
            goto L18
        L13:
            d8.d0 r0 = new d8.d0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f14600n
            e90.c r3 = r9.f14615f
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 != r4) goto L30
            boolean r10 = r0.f14597j
            d8.a0 r0 = r0.f14598k
            ba0.g.M(r11)     // Catch: java.lang.Throwable -> L2e
            goto L64
        L2e:
            r11 = move-exception
            goto L7a
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
        L35:
            r10 = 0
            return r10
        L37:
            ba0.g.M(r11)
            java.util.concurrent.atomic.AtomicBoolean r11 = r9.f14614e
            boolean r11 = r11.get()
            if (r11 != 0) goto L8d
            boolean r11 = r3.tryLock()
            d8.a0 r2 = new d8.a0     // Catch: java.lang.Throwable -> L83
            java.io.File r6 = r9.f14610a     // Catch: java.lang.Throwable -> L83
            d8.x0 r7 = r9.f14611b     // Catch: java.lang.Throwable -> L83
            r2.<init>(r6, r7)     // Catch: java.lang.Throwable -> L83
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Throwable -> L75
            r0.f14598k = r2     // Catch: java.lang.Throwable -> L75
            r0.f14597j = r11     // Catch: java.lang.Throwable -> L75
            r0.f14600n = r4     // Catch: java.lang.Throwable -> L75
            java.lang.Object r10 = r10.invoke(r2, r6, r0)     // Catch: java.lang.Throwable -> L75
            if (r10 != r1) goto L60
            return r1
        L60:
            r0 = r11
            r11 = r10
            r10 = r0
            r0 = r2
        L64:
            r0.close()     // Catch: java.lang.Throwable -> L69
            r0 = r5
            goto L6a
        L69:
            r0 = move-exception
        L6a:
            if (r0 != 0) goto L72
            if (r10 == 0) goto L71
            r3.e(r5)
        L71:
            return r11
        L72:
            throw r0     // Catch: java.lang.Throwable -> L73
        L73:
            r11 = move-exception
            goto L87
        L75:
            r10 = move-exception
            r0 = r11
            r11 = r10
            r10 = r0
            r0 = r2
        L7a:
            r0.close()     // Catch: java.lang.Throwable -> L7e
            goto L82
        L7e:
            r0 = move-exception
            u70.e.a(r11, r0)     // Catch: java.lang.Throwable -> L73
        L82:
            throw r11     // Catch: java.lang.Throwable -> L73
        L83:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        L87:
            if (r10 == 0) goto L8c
            r3.e(r5)
        L8c:
            throw r11
        L8d:
            java.lang.String r10 = "StorageConnection has already been disposed."
            com.braze.h2.b(r10)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.f0.a(d8.m, z70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3 A[Catch: all -> 0x0101, IOException -> 0x0103, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0101, blocks: (B:42:0x00c3, B:45:0x00ca, B:51:0x00e2, B:52:0x0100, B:59:0x010d, B:66:0x011b, B:65:0x0118), top: B:80:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010d A[Catch: all -> 0x0101, IOException -> 0x0103, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0101, blocks: (B:42:0x00c3, B:45:0x00ca, B:51:0x00e2, B:52:0x0100, B:59:0x010d, B:66:0x011b, B:65:0x0118), top: B:80:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v3, types: [e90.a] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.File, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(d8.x r11, z70.c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.f0.b(d8.x, z70.c):java.lang.Object");
    }

    @Override // d8.a
    public final void close() {
        this.f14614e.set(true);
        this.f14613d.invoke();
    }
}

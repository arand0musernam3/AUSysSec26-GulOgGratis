package c50;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static d8.y b(d8.x0 x0Var, e8.a aVar, a90.d dVar, Function0 function0) {
        kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
        x70.c cVar = null;
        try {
            System.loadLibrary("datastore_shared_counter");
            n0Var.getClass();
            return new d8.y(new d8.c0(x0Var, new p(dVar, 10), function0), kotlin.collections.c0.c(new d8.c(n0Var, cVar, 0)), aVar, dVar);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            n0Var.getClass();
            return new d8.y(new d8.c0(x0Var, new cp.i(13), function0), kotlin.collections.c0.c(new d8.c(n0Var, cVar, 0)), aVar, dVar);
        }
    }

    public static void c(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && Intrinsics.areEqual(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            i4.a.l(parentFile, "Failed to delete conflicting file: ");
            return;
        }
        if (parentFile.isDirectory()) {
            return;
        }
        try {
            Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
        } catch (Exception e5) {
            throw new IOException("Failed to create directory: " + parentFile, e5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        if (r10 == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [u40.e] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(u40.e r9, z70.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof c50.z
            if (r0 == 0) goto L13
            r0 = r10
            c50.z r0 = (c50.z) r0
            int r1 = r0.f7667m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7667m = r1
            goto L18
        L13:
            c50.z r0 = new c50.z
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f7666k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f7667m
            java.lang.String r3 = "FirebaseSessions"
            r4 = 2
            r5 = 1
            java.lang.String r6 = ""
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L35
            java.lang.Object r9 = r0.f7665j
            java.lang.String r9 = (java.lang.String) r9
            ba0.g.M(r10)     // Catch: java.lang.Exception -> L32
            goto L88
        L32:
            r10 = move-exception
            goto L8f
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L3c:
            java.lang.Object r9 = r0.f7665j
            u40.e r9 = (u40.e) r9
            ba0.g.M(r10)     // Catch: java.lang.Exception -> L44
            goto L61
        L44:
            r10 = move-exception
            goto L6d
        L46:
            ba0.g.M(r10)
            r10 = r9
            u40.d r10 = (u40.d) r10     // Catch: java.lang.Exception -> L44
            d10.o r9 = r10.d()     // Catch: java.lang.Exception -> L44
            r9.getClass()     // Catch: java.lang.Exception -> L69
            r0.f7665j = r10     // Catch: java.lang.Exception -> L69
            r0.f7667m = r5     // Catch: java.lang.Exception -> L69
            java.lang.Object r9 = xz.b.k(r9, r0)     // Catch: java.lang.Exception -> L69
            if (r9 != r1) goto L5e
            goto L87
        L5e:
            r7 = r10
            r10 = r9
            r9 = r7
        L61:
            u40.a r10 = (u40.a) r10     // Catch: java.lang.Exception -> L44
            java.lang.String r10 = r10.f40739a     // Catch: java.lang.Exception -> L44
            r7 = r10
            r10 = r9
            r9 = r7
            goto L74
        L69:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L6d:
            java.lang.String r2 = "Error getting authentication token."
            android.util.Log.w(r3, r2, r10)
            r10 = r9
            r9 = r6
        L74:
            u40.d r10 = (u40.d) r10     // Catch: java.lang.Exception -> L32
            d10.o r10 = r10.c()     // Catch: java.lang.Exception -> L32
            r10.getClass()     // Catch: java.lang.Exception -> L32
            r0.f7665j = r9     // Catch: java.lang.Exception -> L32
            r0.f7667m = r4     // Catch: java.lang.Exception -> L32
            java.lang.Object r10 = xz.b.k(r10, r0)     // Catch: java.lang.Exception -> L32
            if (r10 != r1) goto L88
        L87:
            return r1
        L88:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L32
            if (r10 != 0) goto L8d
            goto L94
        L8d:
            r6 = r10
            goto L94
        L8f:
            java.lang.String r0 = "Error getting Firebase installation id ."
            android.util.Log.w(r3, r0, r10)
        L94:
            c50.a0 r10 = new c50.a0
            r10.<init>(r6, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c50.q.a(u40.e, z70.c):java.lang.Object");
    }
}

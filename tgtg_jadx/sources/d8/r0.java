package d8;

import a3.x1;
import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import com.braze.h2;
import java.io.File;
import java.io.IOException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f14687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f14688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y80.e f14689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e90.c f14693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u70.t f14694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u70.t f14695i;

    public r0(CoroutineContext coroutineContext, File file) {
        coroutineContext.getClass();
        file.getClass();
        this.f14687a = coroutineContext;
        this.f14688b = file;
        Object obj = t0.f14708b;
        this.f14689c = new y80.e(new x1(file, (x70.c) null, 16), kotlin.coroutines.g.f26549a, -2, x80.a.SUSPEND);
        this.f14690d = ".lock";
        this.f14691e = ".version";
        this.f14692f = "fcntl failed: EAGAIN";
        this.f14693g = e90.d.a();
        final int i11 = 0;
        this.f14694h = u70.l.b(new Function0(this) { // from class: d8.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f14656b;

            {
                this.f14656b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                ParcelFileDescriptor parcelFileDescriptorOpen;
                z0 z0Var;
                switch (i11) {
                    case 0:
                        r0 r0Var = this.f14656b;
                        File file2 = new File(r0Var.f14688b.getAbsolutePath() + r0Var.f14690d);
                        r0.f(file2);
                        return file2;
                    default:
                        a1.f14573a.getClass();
                        r0 r0Var2 = this.f14656b;
                        File file3 = new File(r0Var2.f14688b.getAbsolutePath() + r0Var2.f14691e);
                        r0.f(file3);
                        try {
                            parcelFileDescriptorOpen = ParcelFileDescriptor.open(file3, 939524096);
                            try {
                                parcelFileDescriptorOpen.getClass();
                                NativeSharedCounter nativeSharedCounter = y0.f14747b;
                                if (nativeSharedCounter != null) {
                                    int fd2 = parcelFileDescriptorOpen.getFd();
                                    if (nativeSharedCounter.nativeTruncateFile(fd2) == 0) {
                                        long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd2);
                                        if (jNativeCreateSharedCounter >= 0) {
                                            z0Var = new z0(nativeSharedCounter, jNativeCreateSharedCounter);
                                            parcelFileDescriptorOpen.close();
                                            return z0Var;
                                        }
                                        i4.a.k("Failed to mmap counter file");
                                    } else {
                                        i4.a.k("Failed to truncate counter file");
                                    }
                                } else {
                                    h2.b("DataStore failed to load the native library to create SharedCounter.");
                                }
                                z0Var = null;
                                parcelFileDescriptorOpen.close();
                                return z0Var;
                            } catch (Throwable th2) {
                                th = th2;
                                if (parcelFileDescriptorOpen != null) {
                                    parcelFileDescriptorOpen.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            parcelFileDescriptorOpen = null;
                        }
                        break;
                }
            }
        });
        final int i12 = 1;
        this.f14695i = u70.l.b(new Function0(this) { // from class: d8.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f14656b;

            {
                this.f14656b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                ParcelFileDescriptor parcelFileDescriptorOpen;
                z0 z0Var;
                switch (i12) {
                    case 0:
                        r0 r0Var = this.f14656b;
                        File file2 = new File(r0Var.f14688b.getAbsolutePath() + r0Var.f14690d);
                        r0.f(file2);
                        return file2;
                    default:
                        a1.f14573a.getClass();
                        r0 r0Var2 = this.f14656b;
                        File file3 = new File(r0Var2.f14688b.getAbsolutePath() + r0Var2.f14691e);
                        r0.f(file3);
                        try {
                            parcelFileDescriptorOpen = ParcelFileDescriptor.open(file3, 939524096);
                            try {
                                parcelFileDescriptorOpen.getClass();
                                NativeSharedCounter nativeSharedCounter = y0.f14747b;
                                if (nativeSharedCounter != null) {
                                    int fd2 = parcelFileDescriptorOpen.getFd();
                                    if (nativeSharedCounter.nativeTruncateFile(fd2) == 0) {
                                        long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd2);
                                        if (jNativeCreateSharedCounter >= 0) {
                                            z0Var = new z0(nativeSharedCounter, jNativeCreateSharedCounter);
                                            parcelFileDescriptorOpen.close();
                                            return z0Var;
                                        }
                                        i4.a.k("Failed to mmap counter file");
                                    } else {
                                        i4.a.k("Failed to truncate counter file");
                                    }
                                } else {
                                    h2.b("DataStore failed to load the native library to create SharedCounter.");
                                }
                                z0Var = null;
                                parcelFileDescriptorOpen.close();
                                return z0Var;
                            } catch (Throwable th2) {
                                th = th2;
                                if (parcelFileDescriptorOpen != null) {
                                    parcelFileDescriptorOpen.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            parcelFileDescriptorOpen = null;
                        }
                        break;
                }
            }
        });
    }

    public static void f(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                i4.a.l(file, "Unable to create parent directories of ");
                return;
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd A[Catch: all -> 0x00e1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e1, blocks: (B:60:0x00dd, B:72:0x00f8, B:73:0x00fb), top: B:83:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f8 A[Catch: all -> 0x00e1, TRY_ENTER, TryCatch #0 {all -> 0x00e1, blocks: (B:60:0x00dd, B:72:0x00f8, B:73:0x00fb), top: B:83:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0107  */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [d8.q0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [e90.a] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // d8.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function2 r19, z70.c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.r0.a(kotlin.jvm.functions.Function2, z70.c):java.lang.Object");
    }

    @Override // d8.k0
    public final Object b(z70.c cVar) {
        u70.t tVar = this.f14695i;
        if (tVar.a()) {
            z0 z0Var = (z0) ((a1) tVar.getValue());
            return new Integer(z0Var.f14749b.nativeGetCounterValue(z0Var.f14750c));
        }
        return v80.f0.K(this.f14687a, new o0(this, null, 0), cVar);
    }

    @Override // d8.k0
    public final Object c(x xVar) {
        u70.t tVar = this.f14695i;
        if (tVar.a()) {
            z0 z0Var = (z0) ((a1) tVar.getValue());
            return new Integer(z0Var.f14749b.nativeIncrementAndGetCounterValue(z0Var.f14750c));
        }
        return v80.f0.K(this.f14687a, new o0(this, null, 1), xVar);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3 A[Catch: all -> 0x00b7, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00b7, blocks: (B:41:0x00b3, B:55:0x00d1, B:56:0x00d4), top: B:72:0x0022, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #4 {all -> 0x00b7, blocks: (B:41:0x00b3, B:55:0x00d1, B:56:0x00d4), top: B:72:0x0022, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [e90.a] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [e90.a] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object, y70.a] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [e90.a] */
    @Override // d8.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.jvm.functions.Function1 r9, z70.c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.r0.d(kotlin.jvm.functions.Function1, z70.c):java.lang.Object");
    }

    @Override // d8.k0
    public final y80.i e() {
        return this.f14689c;
    }
}

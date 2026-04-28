package q90;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f36605a;

    static {
        ia0.j jVar = ia0.j.f23646d;
        jVar.getClass();
        ia0.g gVar = new ia0.g();
        gVar.y0(jVar);
        f36605a = new q0(null, jVar.f23647a.length, gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final byte[] a() throws IOException {
        long jE = e();
        if (jE > 2147483647L) {
            i4.a.k(e0.f.i(jE, "Cannot buffer entire body for content length: "));
            return null;
        }
        ia0.i iVarP0 = p0();
        byte[] th2 = null;
        try {
            byte[] bArrV = iVarP0.v();
            try {
                iVarP0.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            th = th2;
            th2 = bArrV;
        } catch (Throwable th4) {
            th = th4;
            if (iVarP0 != null) {
                try {
                    iVarP0.close();
                } catch (Throwable th5) {
                    u70.e.a(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th2.length;
        if (jE == -1 || jE == length) {
            return th2;
        }
        throw new IOException("Content-Length (" + jE + ") and stream length (" + length + ") disagree");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        r90.e.b(p0());
    }

    public abstract long e();

    public abstract z g();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013 A[Catch: all -> 0x0026, TryCatch #1 {all -> 0x0026, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0015, B:7:0x0013), top: B:24:0x0005 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String p() {
        /*
            r5 = this;
            ia0.i r0 = r5.p0()
            r1 = 0
            q90.z r2 = r5.g()     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L13
            kotlin.text.Regex r3 = q90.z.f36633e     // Catch: java.lang.Throwable -> L26
            java.nio.charset.Charset r2 = r2.a(r1)     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L15
        L13:
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Throwable -> L26
        L15:
            java.nio.charset.Charset r2 = r90.g.f(r0, r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r0.R(r2)     // Catch: java.lang.Throwable -> L26
            r0.close()     // Catch: java.lang.Throwable -> L21
            goto L22
        L21:
            r1 = move-exception
        L22:
            r4 = r2
            r2 = r1
            r1 = r4
            goto L31
        L26:
            r2 = move-exception
            if (r0 == 0) goto L31
            r0.close()     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r0 = move-exception
            u70.e.a(r2, r0)
        L31:
            if (r2 != 0) goto L34
            return r1
        L34:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q90.r0.p():java.lang.String");
    }

    public abstract ia0.i p0();
}

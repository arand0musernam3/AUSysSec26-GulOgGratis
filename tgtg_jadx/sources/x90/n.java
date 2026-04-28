package x90;

import androidx.lifecycle.n1;
import ia0.c0;
import ia0.d0;
import java.io.Closeable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import k.e0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements Closeable {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final z f44131z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f44132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f44133b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t90.e f44138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t90.c f44139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t90.c f44140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t90.c f44141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y f44142k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f44143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f44144n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f44145o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f44146p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z f44147q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z f44148r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e0 f44149s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f44150t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f44151u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t5.a f44152v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w f44153w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m f44154x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f44155y;

    static {
        z zVar = new z();
        zVar.b(4, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        zVar.b(5, BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE);
        f44131z = zVar;
    }

    public n(n1 n1Var) {
        this.f44132a = (l) n1Var.f3502d;
        String str = (String) n1Var.f3501c;
        t5.a aVar = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            str = null;
        }
        this.f44134c = str;
        this.f44136e = 3;
        t90.e eVar = (t90.e) n1Var.f3499a;
        this.f44138g = eVar;
        this.f44139h = eVar.d();
        this.f44140i = eVar.d();
        this.f44141j = eVar.d();
        this.f44142k = y.f44206a;
        this.f44146p = (c) n1Var.f3503e;
        z zVar = new z();
        zVar.b(4, 16777216);
        this.f44147q = zVar;
        this.f44148r = f44131z;
        this.f44149s = new e0(0);
        this.f44151u = r0.a();
        t5.a aVar2 = (t5.a) n1Var.f3500b;
        if (aVar2 != null) {
            aVar = aVar2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
        }
        this.f44152v = aVar;
        this.f44153w = new w((c0) aVar.f39793d);
        this.f44154x = new m(this, new r((d0) aVar.f39792c));
        this.f44155y = new LinkedHashSet();
    }

    public final void A(int i11, long j9) {
        t90.c.b(this.f44139h, this.f44134c + '[' + i11 + "] windowUpdate", 0L, new iw.a(this, i11, j9), 6);
    }

    public final void a(b bVar, b bVar2, IOException iOException) {
        int i11;
        Object[] array;
        bVar.getClass();
        bVar2.getClass();
        TimeZone timeZone = r90.g.f37815a;
        try {
            p(bVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f44133b.isEmpty()) {
                array = null;
            } else {
                array = this.f44133b.values().toArray(new v[0]);
                this.f44133b.clear();
            }
        }
        v[] vVarArr = (v[]) array;
        if (vVarArr != null) {
            for (v vVar : vVarArr) {
                try {
                    vVar.c(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f44153w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f44152v.cancel();
        } catch (IOException unused4) {
        }
        this.f44139h.f();
        this.f44140i.f();
        this.f44141j.f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(b.NO_ERROR, b.CANCEL, null);
    }

    public final v e(int i11) {
        v vVar;
        synchronized (this) {
            vVar = (v) this.f44133b.get(Integer.valueOf(i11));
        }
        return vVar;
    }

    public final void flush() {
        this.f44153w.flush();
    }

    public final v g(int i11) {
        v vVar;
        synchronized (this) {
            vVar = (v) this.f44133b.remove(Integer.valueOf(i11));
            notifyAll();
        }
        return vVar;
    }

    public final void p(b bVar) {
        bVar.getClass();
        synchronized (this.f44153w) {
            synchronized (this) {
                if (this.f44137f) {
                    return;
                }
                this.f44137f = true;
                this.f44153w.p(this.f44135d, bVar, r90.e.f37811a);
            }
        }
    }

    public final void r(long j9) {
        synchronized (this) {
            try {
                e0.c(this.f44149s, j9, 0L, 2);
                long jB = this.f44149s.b();
                if (jB >= this.f44147q.a() / 2) {
                    A(0, jB);
                    e0.c(this.f44149s, 0L, jB, 1);
                }
                c cVar = this.f44146p;
                e0 e0Var = this.f44149s;
                cVar.getClass();
                e0Var.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f44153w.f44200c);
        r6 = r2;
        r8.f44150t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(int r9, boolean r10, ia0.g r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            x90.w r12 = r8.f44153w
            r12.e(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f44150t     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f44151u     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f44133b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            x90.w r4 = r8.f44153w     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f44200c     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f44150t     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f44150t = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            x90.w r4 = r8.f44153w
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.e(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x90.n.t(int, boolean, ia0.g, long):void");
    }

    public final void u(int i11, b bVar) {
        bVar.getClass();
        t90.c.b(this.f44139h, this.f44134c + '[' + i11 + "] writeSynReset", 0L, new cp.j(this, i11, bVar, 3), 6);
    }
}

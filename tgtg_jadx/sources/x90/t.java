package x90;

import ia0.j0;
import ia0.l0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import k.e0;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f44179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ia0.g f44180c = new ia0.g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ia0.g f44181d = new ia0.g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f44183f;

    public t(v vVar, long j9, boolean z11) {
        this.f44183f = vVar;
        this.f44178a = j9;
        this.f44179b = z11;
    }

    @Override // ia0.j0
    public final long F(ia0.g gVar, long j9) throws Throwable {
        boolean z11;
        Throwable streamResetException;
        long jF;
        gVar.getClass();
        long j11 = 0;
        if (j9 < 0) {
            i4.a.i(e0.f.i(j9, "byteCount < 0: "));
            return 0L;
        }
        while (true) {
            v vVar = this.f44183f;
            synchronized (vVar) {
                vVar.f44186b.getClass();
                s sVar = vVar.f44193i;
                z11 = true;
                boolean z12 = sVar.f44176c || sVar.f44174a;
                if (z12) {
                    vVar.f44194j.i();
                }
                try {
                    if (vVar.f() == null || this.f44179b) {
                        streamResetException = null;
                    } else {
                        streamResetException = vVar.f44196m;
                        if (streamResetException == null) {
                            b bVarF = vVar.f();
                            bVarF.getClass();
                            streamResetException = new StreamResetException(bVarF);
                        }
                    }
                    if (this.f44182e) {
                        throw new IOException("stream closed");
                    }
                    ia0.g gVar2 = this.f44181d;
                    long j12 = gVar2.f23643b;
                    if (j12 > j11) {
                        jF = gVar2.F(gVar, Math.min(j9, j12));
                        e0.c(vVar.f44187c, jF, 0L, 2);
                        long jB = vVar.f44187c.b();
                        if (streamResetException == null && jB >= vVar.f44186b.f44147q.a() / 2) {
                            vVar.f44186b.A(vVar.f44185a, jB);
                            e0.c(vVar.f44187c, 0L, jB, 1);
                        }
                        z11 = false;
                    } else {
                        if (this.f44179b || streamResetException != null) {
                            z11 = false;
                        } else {
                            try {
                                vVar.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        jF = -1;
                    }
                } finally {
                    if (z12) {
                        vVar.f44194j.m();
                    }
                }
            }
            this.f44183f.f44186b.f44146p.getClass();
            if (!z11) {
                if (jF != -1) {
                    return jF;
                }
                if (streamResetException == null) {
                    return -1L;
                }
                throw streamResetException;
            }
            j11 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j9;
        v vVar = this.f44183f;
        synchronized (vVar) {
            this.f44182e = true;
            ia0.g gVar = this.f44181d;
            j9 = gVar.f23643b;
            gVar.a();
            vVar.notifyAll();
        }
        if (j9 > 0) {
            v vVar2 = this.f44183f;
            TimeZone timeZone = r90.g.f37815a;
            vVar2.f44186b.r(j9);
        }
        this.f44183f.a();
    }

    @Override // ia0.j0
    public final l0 i() {
        return this.f44183f.f44194j;
    }
}

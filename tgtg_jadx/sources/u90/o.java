package u90;

import androidx.lifecycle.n1;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.LongCompanionObject;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import q90.d0;
import q90.f0;
import q90.s0;
import x90.v;
import x90.w;
import x90.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends x90.l implements v90.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t90.e f40941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f40942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Socket f40943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Socket f40944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q90.s f40945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f0 f40946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t5.a f40947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x90.n f40948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f40949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f40950k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f40951m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f40952n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f40953o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f40954p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f40955q;

    public o(t90.e eVar, p pVar, s0 s0Var, Socket socket, Socket socket2, q90.s sVar, f0 f0Var, t5.a aVar) {
        eVar.getClass();
        pVar.getClass();
        s0Var.getClass();
        socket.getClass();
        socket2.getClass();
        f0Var.getClass();
        aVar.getClass();
        this.f40941b = eVar;
        this.f40942c = s0Var;
        this.f40943d = socket;
        this.f40944e = socket2;
        this.f40945f = sVar;
        this.f40946g = f0Var;
        this.f40947h = aVar;
        this.f40953o = 1;
        this.f40954p = new ArrayList();
        this.f40955q = LongCompanionObject.MAX_VALUE;
    }

    public static void c(d0 d0Var, s0 s0Var, IOException iOException) {
        d0Var.getClass();
        s0Var.getClass();
        iOException.getClass();
        if (s0Var.f36611b.type() != Proxy.Type.DIRECT) {
            q90.a aVar = s0Var.f36610a;
            aVar.f36407g.connectFailed(aVar.f36408h.i(), s0Var.f36611b.address(), iOException);
        }
        ky.o oVar = d0Var.C;
        synchronized (oVar) {
            ((LinkedHashSet) oVar.f26718b).add(s0Var);
        }
    }

    @Override // x90.l
    public final void a(x90.n nVar, z zVar) {
        zVar.getClass();
        synchronized (this) {
            this.f40953o = (zVar.f44207a & 8) != 0 ? zVar.f44208b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // x90.l
    public final void b(v vVar) {
        vVar.c(x90.b.REFUSED_STREAM, null);
    }

    @Override // v90.d
    public final void cancel() {
        r90.g.c(this.f40943d);
    }

    @Override // v90.d
    public final void d(n nVar, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.f40948i != null) || (iOException instanceof ConnectionShutdownException)) {
                        this.f40949j = true;
                        if (this.f40951m == 0) {
                            if (iOException != null) {
                                c(nVar.f40923a, this.f40942c, iOException);
                            }
                            this.l++;
                        }
                    }
                } else if (((StreamResetException) iOException).f32644a == x90.b.REFUSED_STREAM) {
                    int i11 = this.f40952n + 1;
                    this.f40952n = i11;
                    if (i11 > 1) {
                        this.f40949j = true;
                        this.l++;
                    }
                } else if (((StreamResetException) iOException).f32644a != x90.b.CANCEL || !nVar.f40938q) {
                    this.f40949j = true;
                    this.l++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v90.d
    public final void e() {
        synchronized (this) {
            this.f40949j = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(q90.a r10, java.util.List r11) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u90.o.f(q90.a, java.util.List):boolean");
    }

    @Override // v90.d
    public final s0 g() {
        return this.f40942c;
    }

    public final boolean h(boolean z11) {
        long j9;
        TimeZone timeZone = r90.g.f37815a;
        long jNanoTime = System.nanoTime();
        if (this.f40943d.isClosed() || this.f40944e.isClosed() || this.f40944e.isInputShutdown() || this.f40944e.isOutputShutdown()) {
            return false;
        }
        x90.n nVar = this.f40948i;
        if (nVar != null) {
            synchronized (nVar) {
                if (nVar.f44137f) {
                    return false;
                }
                if (nVar.f44144n < nVar.f44143m) {
                    if (jNanoTime >= nVar.f44145o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j9 = jNanoTime - this.f40955q;
        }
        if (j9 < 10000000000L || !z11) {
            return true;
        }
        Socket socket = this.f40944e;
        ia0.d0 d0Var = (ia0.d0) this.f40947h.f39792c;
        socket.getClass();
        d0Var.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !d0Var.a();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final void i() throws SocketException {
        this.f40955q = System.nanoTime();
        f0 f0Var = this.f40946g;
        if (f0Var == f0.HTTP_2 || f0Var == f0.H2_PRIOR_KNOWLEDGE) {
            this.f40944e.setSoTimeout(0);
            x90.c cVar = x90.c.f44088a;
            t90.e eVar = this.f40941b;
            eVar.getClass();
            n1 n1Var = new n1();
            n1Var.f3499a = eVar;
            n1Var.f3502d = x90.l.f44128a;
            n1Var.f3503e = x90.c.f44088a;
            t5.a aVar = this.f40947h;
            String str = this.f40942c.f36610a.f36408h.f36626d;
            aVar.getClass();
            str.getClass();
            n1Var.f3500b = aVar;
            n1Var.f3501c = r90.g.f37816b + ' ' + str;
            n1Var.f3502d = this;
            n1Var.f3503e = cVar;
            x90.n nVar = new x90.n(n1Var);
            this.f40948i = nVar;
            z zVar = x90.n.f44131z;
            this.f40953o = (zVar.f44207a & 8) != 0 ? zVar.f44208b[3] : Integer.MAX_VALUE;
            w wVar = nVar.f44153w;
            synchronized (wVar) {
                try {
                    if (wVar.f44201d) {
                        throw new IOException("closed");
                    }
                    Logger logger = w.f44197f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(r90.g.d(">> CONNECTION " + x90.h.f44115a.f(), new Object[0]));
                    }
                    wVar.f44198a.o0(x90.h.f44115a);
                    wVar.f44198a.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            w wVar2 = nVar.f44153w;
            z zVar2 = nVar.f44147q;
            wVar2.getClass();
            zVar2.getClass();
            synchronized (wVar2) {
                try {
                    if (wVar2.f44201d) {
                        throw new IOException("closed");
                    }
                    wVar2.g(0, Integer.bitCount(zVar2.f44207a) * 6, 4, 0);
                    for (int i11 = 0; i11 < 10; i11++) {
                        boolean z11 = true;
                        if (((1 << i11) & zVar2.f44207a) == 0) {
                            z11 = false;
                        }
                        if (z11) {
                            wVar2.f44198a.writeShort(i11);
                            wVar2.f44198a.writeInt(zVar2.f44208b[i11]);
                        }
                    }
                    wVar2.f44198a.flush();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (nVar.f44147q.a() != 65535) {
                nVar.f44153w.A(0, r2 - Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            }
            t90.c.b(nVar.f44138g.d(), nVar.f44134c, 0L, nVar.f44154x, 6);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Connection{");
        s0 s0Var = this.f40942c;
        sb2.append(s0Var.f36610a.f36408h.f36626d);
        sb2.append(':');
        sb2.append(s0Var.f36610a.f36408h.f36627e);
        sb2.append(", proxy=");
        sb2.append(s0Var.f36611b);
        sb2.append(" hostAddress=");
        sb2.append(s0Var.f36612c);
        sb2.append(" cipherSuite=");
        q90.s sVar = this.f40945f;
        sb2.append(sVar != null ? sVar.f36607b : "none");
        sb2.append(" protocol=");
        sb2.append(this.f40946g);
        sb2.append('}');
        return sb2.toString();
    }
}

package w90;

import androidx.recyclerview.widget.j;
import com.braze.h2;
import ia0.c0;
import ia0.h0;
import ia0.i;
import ia0.i0;
import ia0.j0;
import ia0.k;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import q90.d0;
import q90.f0;
import q90.g0;
import q90.n0;
import q90.o0;
import q90.p0;
import q90.t;
import q90.v;
import r90.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements v90.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f43341f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f43342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v90.d f43343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t5.a f43344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f43346e;

    static {
        t tVar = t.f36613b;
        f43341f = u00.d.L("OkHttp-Response-Body", "Truncated");
    }

    public f(d0 d0Var, v90.d dVar, t5.a aVar) {
        aVar.getClass();
        this.f43342a = d0Var;
        this.f43343b = dVar;
        this.f43344c = aVar;
        this.f43346e = new j((ia0.d0) aVar.f39792c);
    }

    @Override // v90.e
    public final void a() {
        ((c0) this.f43344c.f39793d).flush();
    }

    @Override // v90.e
    public final boolean b() {
        return this.f43345d == 6;
    }

    @Override // v90.e
    public final h0 c(g0 g0Var, long j9) throws ProtocolException {
        g0Var.getClass();
        n0 n0Var = g0Var.f36508d;
        if (n0Var != null && n0Var.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(g0Var.f36507c.b("Transfer-Encoding"))) {
            if (this.f43345d == 1) {
                this.f43345d = 2;
                return new b(this);
            }
            org.bouncycastle.jce.provider.a.d(this.f43345d, "state: ");
            return null;
        }
        if (j9 == -1) {
            h2.b("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.f43345d == 1) {
            this.f43345d = 2;
            return new k(this);
        }
        org.bouncycastle.jce.provider.a.d(this.f43345d, "state: ");
        return null;
    }

    @Override // v90.e
    public final void cancel() {
        this.f43343b.cancel();
    }

    @Override // v90.e
    public final o0 d(boolean z11) throws IOException {
        j jVar = this.f43346e;
        int i11 = this.f43345d;
        if (i11 != 0 && i11 != 1 && i11 != 2 && i11 != 3) {
            org.bouncycastle.jce.provider.a.d(this.f43345d, "state: ");
            return null;
        }
        try {
            String strD = ((i) jVar.f3775c).D(jVar.f3774b);
            jVar.f3774b -= (long) strD.length();
            a3.j jVarD = ex.i.D(strD);
            int i12 = jVarD.f398b;
            o0 o0Var = new o0();
            f0 f0Var = (f0) jVarD.f399c;
            f0Var.getClass();
            o0Var.f36568b = f0Var;
            o0Var.f36569c = i12;
            o0Var.f36570d = (String) jVarD.f400d;
            ax.g0 g0Var = new ax.g0(3);
            while (true) {
                String strD2 = ((i) jVar.f3775c).D(jVar.f3774b);
                jVar.f3774b -= (long) strD2.length();
                if (strD2.length() == 0) {
                    break;
                }
                g0Var.d(strD2);
            }
            o0Var.f36572f = g0Var.g().e();
            if (z11 && i12 == 100) {
                return null;
            }
            if (i12 == 100) {
                this.f43345d = 3;
                return o0Var;
            }
            if (102 > i12 || i12 >= 200) {
                this.f43345d = 4;
                return o0Var;
            }
            this.f43345d = 3;
            return o0Var;
        } catch (EOFException e5) {
            throw new IOException("unexpected end of stream on ".concat(this.f43343b.g().f36610a.f36408h.h()), e5);
        }
    }

    @Override // v90.e
    public final j0 e(p0 p0Var) {
        boolean zA = v90.f.a(p0Var);
        g0 g0Var = p0Var.f36582a;
        if (!zA) {
            return k(g0Var.f36505a, 0L);
        }
        if ("chunked".equalsIgnoreCase(p0.e("Transfer-Encoding", p0Var))) {
            v vVar = g0Var.f36505a;
            if (this.f43345d == 4) {
                this.f43345d = 5;
                return new c(this, vVar);
            }
            org.bouncycastle.jce.provider.a.d(this.f43345d, "state: ");
            return null;
        }
        long jE = g.e(p0Var);
        if (jE != -1) {
            return k(g0Var.f36505a, jE);
        }
        v vVar2 = g0Var.f36505a;
        if (this.f43345d != 4) {
            org.bouncycastle.jce.provider.a.d(this.f43345d, "state: ");
            return null;
        }
        this.f43345d = 5;
        this.f43343b.e();
        vVar2.getClass();
        return new e(this, vVar2);
    }

    @Override // v90.e
    public final void f() {
        ((c0) this.f43344c.f39793d).flush();
    }

    @Override // v90.e
    public final i0 g() {
        return this.f43344c;
    }

    @Override // v90.e
    public final v90.d h() {
        return this.f43343b;
    }

    @Override // v90.e
    public final long i(p0 p0Var) {
        if (!v90.f.a(p0Var)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(p0.e("Transfer-Encoding", p0Var))) {
            return -1L;
        }
        return g.e(p0Var);
    }

    @Override // v90.e
    public final void j(g0 g0Var) {
        g0Var.getClass();
        Proxy.Type type = this.f43343b.g().f36611b.type();
        type.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g0Var.f36506b);
        sb2.append(' ');
        v vVar = g0Var.f36505a;
        if (vVar.f() || type != Proxy.Type.HTTP) {
            String strB = vVar.b();
            String strD = vVar.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb2.append(strB);
        } else {
            sb2.append(vVar);
        }
        sb2.append(" HTTP/1.1");
        l(g0Var.f36507c, sb2.toString());
    }

    public final d k(v vVar, long j9) {
        if (this.f43345d == 4) {
            this.f43345d = 5;
            return new d(this, vVar, j9);
        }
        org.bouncycastle.jce.provider.a.d(this.f43345d, "state: ");
        return null;
    }

    public final void l(t tVar, String str) {
        tVar.getClass();
        if (this.f43345d != 0) {
            org.bouncycastle.jce.provider.a.d(this.f43345d, "state: ");
            return;
        }
        t5.a aVar = this.f43344c;
        c0 c0Var = (c0) aVar.f39793d;
        c0Var.M(str);
        c0Var.M("\r\n");
        int size = tVar.size();
        int i11 = 0;
        while (true) {
            c0 c0Var2 = (c0) aVar.f39793d;
            if (i11 >= size) {
                c0Var2.M("\r\n");
                this.f43345d = 1;
                return;
            } else {
                c0Var2.M(tVar.d(i11));
                c0Var2.M(": ");
                c0Var2.M(tVar.g(i11));
                c0Var2.M("\r\n");
                i11++;
            }
        }
    }
}

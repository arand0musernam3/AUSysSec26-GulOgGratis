package ia0;

import com.braze.h2;
import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23650a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f23653d;

    public k(w90.f fVar) {
        this.f23653d = fVar;
        this.f23652c = new q(((c0) fVar.f43344c.f39793d).f23611a.i());
    }

    public void a(boolean z11) throws IOException {
        e0 e0VarX0;
        int iDeflate;
        Deflater deflater = (Deflater) this.f23653d;
        c0 c0Var = (c0) this.f23652c;
        g gVar = c0Var.f23612b;
        while (true) {
            e0VarX0 = gVar.x0(1);
            byte[] bArr = e0VarX0.f23625a;
            int i11 = e0VarX0.f23627c;
            if (z11) {
                try {
                    iDeflate = deflater.deflate(bArr, i11, 8192 - i11, 2);
                } catch (NullPointerException e5) {
                    throw new IOException("Deflater already closed", e5);
                }
            } else {
                iDeflate = deflater.deflate(bArr, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                e0VarX0.f23627c += iDeflate;
                gVar.f23643b += (long) iDeflate;
                c0Var.a();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (e0VarX0.f23626b == e0VarX0.f23627c) {
            gVar.f23642a = e0VarX0.a();
            f0.a(e0VarX0);
        }
    }

    @Override // ia0.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws Throwable {
        switch (this.f23650a) {
            case 0:
                Deflater deflater = (Deflater) this.f23653d;
                if (this.f23651b) {
                    return;
                }
                try {
                    deflater.finish();
                    a(false);
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    deflater.end();
                    break;
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                try {
                    ((c0) this.f23652c).close();
                    break;
                } catch (Throwable th4) {
                    if (th == null) {
                        th = th4;
                    }
                }
                this.f23651b = true;
                if (th != null) {
                    throw th;
                }
                return;
            case 1:
                try {
                    ((h0) this.f23652c).close();
                    return;
                } catch (IOException e5) {
                    this.f23651b = true;
                    ((jd.a) this.f23653d).invoke(e5);
                    return;
                }
            default:
                w90.f fVar = (w90.f) this.f23653d;
                if (this.f23651b) {
                    return;
                }
                this.f23651b = true;
                q qVar = (q) this.f23652c;
                l0 l0Var = qVar.f23670e;
                qVar.f23670e = l0.f23657d;
                l0Var.a();
                l0Var.b();
                fVar.f43345d = 3;
                return;
        }
    }

    @Override // ia0.h0, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f23650a) {
            case 0:
                a(true);
                ((c0) this.f23652c).flush();
                break;
            case 1:
                try {
                    ((h0) this.f23652c).flush();
                } catch (IOException e5) {
                    this.f23651b = true;
                    ((jd.a) this.f23653d).invoke(e5);
                    return;
                }
                break;
            default:
                if (!this.f23651b) {
                    ((c0) ((w90.f) this.f23653d).f43344c.f39793d).flush();
                    break;
                }
                break;
        }
    }

    @Override // ia0.h0
    public final l0 i() {
        switch (this.f23650a) {
            case 0:
                return ((c0) this.f23652c).f23611a.i();
            case 1:
                return ((h0) this.f23652c).i();
            default:
                return (q) this.f23652c;
        }
    }

    public String toString() {
        switch (this.f23650a) {
            case 0:
                return "DeflaterSink(" + ((c0) this.f23652c) + ')';
            default:
                return super.toString();
        }
    }

    @Override // ia0.h0
    public final void x(g gVar, long j9) throws IOException {
        switch (this.f23650a) {
            case 0:
                Deflater deflater = (Deflater) this.f23653d;
                gVar.getClass();
                b.e(gVar.f23643b, 0L, j9);
                long j11 = j9;
                while (j11 > 0) {
                    e0 e0Var = gVar.f23642a;
                    e0Var.getClass();
                    int iMin = (int) Math.min(j11, e0Var.f23627c - e0Var.f23626b);
                    deflater.setInput(e0Var.f23625a, e0Var.f23626b, iMin);
                    a(false);
                    long j12 = iMin;
                    gVar.f23643b -= j12;
                    int i11 = e0Var.f23626b + iMin;
                    e0Var.f23626b = i11;
                    if (i11 == e0Var.f23627c) {
                        gVar.f23642a = e0Var.a();
                        f0.a(e0Var);
                    }
                    j11 -= j12;
                }
                deflater.setInput(ja0.q.f24848a, 0, 0);
                break;
            case 1:
                if (this.f23651b) {
                    gVar.skip(j9);
                } else {
                    try {
                        ((h0) this.f23652c).x(gVar, j9);
                    } catch (IOException e5) {
                        this.f23651b = true;
                        ((jd.a) this.f23653d).invoke(e5);
                        return;
                    }
                }
                break;
            default:
                gVar.getClass();
                if (!this.f23651b) {
                    r90.e.a(gVar.f23643b, 0L, j9);
                    ((c0) ((w90.f) this.f23653d).f43344c.f39793d).x(gVar, j9);
                } else {
                    h2.b("closed");
                }
                break;
        }
    }

    public k(g gVar, Deflater deflater) {
        this.f23652c = new c0(gVar);
        this.f23653d = deflater;
    }

    public k(h0 h0Var, jd.a aVar) {
        this.f23652c = h0Var;
        this.f23653d = aVar;
    }
}

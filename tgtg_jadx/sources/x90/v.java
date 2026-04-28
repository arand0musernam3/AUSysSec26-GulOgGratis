package x90;

import com.braze.h2;
import ia0.h0;
import ia0.i0;
import ia0.j0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import k.e0;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f44186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f44187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f44188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f44189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f44190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f44191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f44192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f44193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u f44194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f44195k;
    public b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IOException f44196m;

    public v(int i11, n nVar, boolean z11, boolean z12, q90.t tVar) {
        nVar.getClass();
        this.f44185a = i11;
        this.f44186b = nVar;
        this.f44187c = new e0(i11);
        this.f44189e = nVar.f44148r.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f44190f = arrayDeque;
        this.f44192h = new t(this, nVar.f44147q.a(), z12);
        this.f44193i = new s(this, z11);
        this.f44194j = new u(this);
        this.f44195k = new u(this);
        if (tVar == null) {
            if (g()) {
                return;
            }
            h2.b("remotely-initiated streams should have headers");
            throw null;
        }
        if (g()) {
            h2.b("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(tVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r2 = this;
            java.util.TimeZone r0 = r90.g.f37815a
            monitor-enter(r2)
            x90.t r0 = r2.f44192h     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f44179b     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.f44182e     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            x90.s r0 = r2.f44193i     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f44174a     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.f44176c     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.h()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            x90.b r0 = x90.b.CANCEL
            r1 = 0
            r2.c(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            x90.n r0 = r2.f44186b
            int r1 = r2.f44185a
            r0.g(r1)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x90.v.a():void");
    }

    public final void b() throws IOException {
        s sVar = this.f44193i;
        if (sVar.f44176c) {
            i4.a.k("stream closed");
            return;
        }
        if (sVar.f44174a) {
            i4.a.k("stream finished");
            return;
        }
        if (f() != null) {
            IOException iOException = this.f44196m;
            if (iOException != null) {
                throw iOException;
            }
            b bVarF = f();
            bVarF.getClass();
            throw new StreamResetException(bVarF);
        }
    }

    public final void c(b bVar, IOException iOException) {
        bVar.getClass();
        if (d(bVar, iOException)) {
            n nVar = this.f44186b;
            nVar.getClass();
            nVar.f44153w.u(this.f44185a, bVar);
        }
    }

    @Override // ia0.i0
    public final void cancel() {
        e(b.CANCEL);
    }

    public final boolean d(b bVar, IOException iOException) {
        TimeZone timeZone = r90.g.f37815a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            this.l = bVar;
            this.f44196m = iOException;
            notifyAll();
            if (this.f44192h.f44179b) {
                if (this.f44193i.f44174a) {
                    return false;
                }
            }
            this.f44186b.g(this.f44185a);
            return true;
        }
    }

    public final void e(b bVar) {
        bVar.getClass();
        if (d(bVar, null)) {
            this.f44186b.u(this.f44185a, bVar);
        }
    }

    public final b f() {
        b bVar;
        synchronized (this) {
            bVar = this.l;
        }
        return bVar;
    }

    public final boolean g() {
        boolean z11 = (this.f44185a & 1) == 1;
        this.f44186b.getClass();
        return true == z11;
    }

    @Override // ia0.i0
    public final j0 getSource() {
        return this.f44192h;
    }

    public final boolean h() {
        synchronized (this) {
            try {
                if (f() != null) {
                    return false;
                }
                t tVar = this.f44192h;
                if (tVar.f44179b || tVar.f44182e) {
                    s sVar = this.f44193i;
                    if (sVar.f44174a || sVar.f44176c) {
                        if (this.f44191g) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(q90.t tVar, boolean z11) {
        boolean zH;
        tVar.getClass();
        TimeZone timeZone = r90.g.f37815a;
        synchronized (this) {
            try {
                if (this.f44191g && tVar.b(":status") == null && tVar.b(":method") == null) {
                    this.f44192h.getClass();
                } else {
                    this.f44191g = true;
                    this.f44190f.add(tVar);
                }
                if (z11) {
                    this.f44192h.f44179b = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zH) {
            return;
        }
        this.f44186b.g(this.f44185a);
    }

    @Override // ia0.i0
    public final h0 n() {
        return this.f44193i;
    }
}

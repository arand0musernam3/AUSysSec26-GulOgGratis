package x90;

import ia0.h0;
import ia0.i0;
import ia0.j0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ConnectionShutdownException;
import q90.d0;
import q90.f0;
import q90.g0;
import q90.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements v90.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f44156g = r90.g.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f44157h = r90.g.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u90.o f44158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v90.g f44159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f44160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile v f44161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f0 f44162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f44163f;

    public o(d0 d0Var, u90.o oVar, v90.g gVar, n nVar) {
        d0Var.getClass();
        nVar.getClass();
        this.f44158a = oVar;
        this.f44159b = gVar;
        this.f44160c = nVar;
        List list = d0Var.f36480s;
        f0 f0Var = f0.H2_PRIOR_KNOWLEDGE;
        this.f44162e = list.contains(f0Var) ? f0Var : f0.HTTP_2;
    }

    @Override // v90.e
    public final void a() {
        v vVar = this.f44161d;
        vVar.getClass();
        vVar.f44193i.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // v90.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r5 = this;
            x90.v r0 = r5.f44161d
            r1 = 0
            if (r0 == 0) goto L20
            monitor-enter(r0)
            x90.t r2 = r0.f44192h     // Catch: java.lang.Throwable -> L17
            boolean r3 = r2.f44179b     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 == 0) goto L19
            ia0.g r2 = r2.f44181d     // Catch: java.lang.Throwable -> L17
            boolean r2 = r2.B()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L19
            r2 = r4
            goto L1a
        L17:
            r1 = move-exception
            goto L1e
        L19:
            r2 = r1
        L1a:
            monitor-exit(r0)
            if (r2 != r4) goto L20
            return r4
        L1e:
            monitor-exit(r0)
            throw r1
        L20:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x90.o.b():boolean");
    }

    @Override // v90.e
    public final h0 c(g0 g0Var, long j9) {
        g0Var.getClass();
        v vVar = this.f44161d;
        vVar.getClass();
        return vVar.f44193i;
    }

    @Override // v90.e
    public final void cancel() {
        this.f44163f = true;
        v vVar = this.f44161d;
        if (vVar != null) {
            vVar.e(b.CANCEL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    @Override // v90.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final q90.o0 d(boolean r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x90.o.d(boolean):q90.o0");
    }

    @Override // v90.e
    public final j0 e(p0 p0Var) {
        v vVar = this.f44161d;
        vVar.getClass();
        return vVar.f44192h;
    }

    @Override // v90.e
    public final void f() {
        this.f44160c.flush();
    }

    @Override // v90.e
    public final i0 g() {
        v vVar = this.f44161d;
        vVar.getClass();
        return vVar;
    }

    @Override // v90.e
    public final v90.d h() {
        return this.f44158a;
    }

    @Override // v90.e
    public final long i(p0 p0Var) {
        if (v90.f.a(p0Var)) {
            return r90.g.e(p0Var);
        }
        return 0L;
    }

    @Override // v90.e
    public final void j(g0 g0Var) throws IOException {
        int i11;
        v vVar;
        boolean z11;
        g0Var.getClass();
        if (this.f44161d != null) {
            return;
        }
        boolean z12 = g0Var.f36508d != null;
        q90.t tVar = g0Var.f36507c;
        ArrayList arrayList = new ArrayList(tVar.size() + 4);
        arrayList.add(new d(d.f44091f, g0Var.f36506b));
        ia0.j jVar = d.f44092g;
        q90.v vVar2 = g0Var.f36505a;
        vVar2.getClass();
        String strB = vVar2.b();
        String strD = vVar2.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new d(jVar, strB));
        String strB2 = g0Var.f36507c.b("Host");
        if (strB2 != null) {
            arrayList.add(new d(d.f44094i, strB2));
        }
        arrayList.add(new d(d.f44093h, vVar2.f36623a));
        int size = tVar.size();
        for (int i12 = 0; i12 < size; i12++) {
            String strD2 = tVar.d(i12);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strD2.toLowerCase(locale);
            lowerCase.getClass();
            if (!f44156g.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, "te") && Intrinsics.areEqual(tVar.g(i12), "trailers"))) {
                arrayList.add(new d(lowerCase, tVar.g(i12)));
            }
        }
        n nVar = this.f44160c;
        nVar.getClass();
        boolean z13 = !z12;
        synchronized (nVar.f44153w) {
            synchronized (nVar) {
                try {
                    if (nVar.f44136e > 1073741823) {
                        nVar.p(b.REFUSED_STREAM);
                    }
                    if (nVar.f44137f) {
                        throw new ConnectionShutdownException();
                    }
                    i11 = nVar.f44136e;
                    nVar.f44136e = i11 + 2;
                    vVar = new v(i11, nVar, z13, false, null);
                    z11 = !z12 || nVar.f44150t >= nVar.f44151u || vVar.f44188d >= vVar.f44189e;
                    if (vVar.h()) {
                        nVar.f44133b.put(Integer.valueOf(i11), vVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            nVar.f44153w.r(z13, i11, arrayList);
        }
        if (z11) {
            nVar.f44153w.flush();
        }
        this.f44161d = vVar;
        boolean z14 = this.f44163f;
        v vVar3 = this.f44161d;
        if (z14) {
            vVar3.getClass();
            vVar3.e(b.CANCEL);
            i4.a.k("Canceled");
            return;
        }
        vVar3.getClass();
        u uVar = vVar3.f44194j;
        long j9 = this.f44159b.f42192g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        uVar.g(j9, timeUnit);
        v vVar4 = this.f44161d;
        vVar4.getClass();
        vVar4.f44195k.g(this.f44159b.f42193h, timeUnit);
    }
}

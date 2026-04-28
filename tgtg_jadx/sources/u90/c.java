package u90;

import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.braze.h2;
import com.google.firebase.messaging.a0;
import ia0.c0;
import ia0.d0;
import ia0.l0;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import q90.e0;
import q90.f0;
import q90.g0;
import q90.o0;
import q90.p0;
import q90.s0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements t, v90.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t90.e f40874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f40875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f40879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f40880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f40881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q f40882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s0 f40883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f40884k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g0 f40885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f40886n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f40887o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f40888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Socket f40889q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Socket f40890r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public q90.s f40891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f0 f40892t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public t5.a f40893u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o f40894v;

    public c(t90.e eVar, p pVar, int i11, int i12, int i13, int i14, boolean z11, n nVar, q qVar, s0 s0Var, List list, int i15, g0 g0Var, int i16, boolean z12) {
        eVar.getClass();
        pVar.getClass();
        s0Var.getClass();
        this.f40874a = eVar;
        this.f40875b = pVar;
        this.f40876c = i11;
        this.f40877d = i12;
        this.f40878e = i13;
        this.f40879f = i14;
        this.f40880g = z11;
        this.f40881h = nVar;
        this.f40882i = qVar;
        this.f40883j = s0Var;
        this.f40884k = list;
        this.l = i15;
        this.f40885m = g0Var;
        this.f40886n = i16;
        this.f40887o = z12;
    }

    public static c k(c cVar, int i11, g0 g0Var, int i12, boolean z11, int i13) {
        return new c(cVar.f40874a, cVar.f40875b, cVar.f40876c, cVar.f40877d, cVar.f40878e, cVar.f40879f, cVar.f40880g, cVar.f40881h, cVar.f40882i, cVar.f40883j, cVar.f40884k, (i13 & 1) != 0 ? cVar.l : i11, (i13 & 2) != 0 ? cVar.f40885m : g0Var, (i13 & 4) != 0 ? cVar.f40886n : i12, (i13 & 8) != 0 ? cVar.f40887o : z11);
    }

    @Override // u90.t
    public final t a() {
        return new c(this.f40874a, this.f40875b, this.f40876c, this.f40877d, this.f40878e, this.f40879f, this.f40880g, this.f40881h, this.f40882i, this.f40883j, this.f40884k, this.l, this.f40885m, this.f40886n, this.f40887o);
    }

    @Override // u90.t
    public final o b() {
        ky.o oVar = this.f40881h.f40923a.C;
        s0 s0Var = this.f40883j;
        synchronized (oVar) {
            s0Var.getClass();
            ((LinkedHashSet) oVar.f26718b).remove(s0Var);
        }
        o oVar2 = this.f40894v;
        oVar2.getClass();
        this.f40883j.getClass();
        r rVarD = this.f40882i.d(this, this.f40884k);
        if (rVarD != null) {
            return rVarD.f40975a;
        }
        synchronized (oVar2) {
            p pVar = this.f40875b;
            pVar.getClass();
            TimeZone timeZone = r90.g.f37815a;
            pVar.f40959d.add(oVar2);
            pVar.f40957b.c(pVar.f40958c, 0L);
            this.f40881h.b(oVar2);
        }
        return oVar2;
    }

    @Override // u90.t
    public final s c() {
        Socket socket;
        Socket socket2;
        p pVar = this.f40875b;
        s0 s0Var = this.f40883j;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f40881h.f40940s;
        if (this.f40889q != null) {
            h2.b("TCP already connected");
            return null;
        }
        copyOnWriteArrayList.add(this);
        boolean z11 = false;
        try {
            try {
                s0Var.f36612c.getClass();
                pVar.getClass();
                h();
                z11 = true;
                s sVar = new s(this, null, null, 6);
                copyOnWriteArrayList.remove(this);
                return sVar;
            } catch (IOException e5) {
                q90.a aVar = s0Var.f36610a;
                if (s0Var.f36611b.type() != Proxy.Type.DIRECT) {
                    q90.a aVar2 = s0Var.f36610a;
                    aVar2.f36407g.connectFailed(aVar2.f36408h.i(), s0Var.f36611b.address(), e5);
                }
                s0Var.f36612c.getClass();
                pVar.getClass();
                s sVar2 = new s(this, null, e5, 2);
                copyOnWriteArrayList.remove(this);
                if (!z11 && (socket2 = this.f40889q) != null) {
                    r90.g.c(socket2);
                }
                return sVar2;
            }
        } catch (Throwable th2) {
            copyOnWriteArrayList.remove(this);
            if (!z11 && (socket = this.f40889q) != null) {
                r90.g.c(socket);
            }
            throw th2;
        }
    }

    @Override // u90.t, v90.d
    public final void cancel() {
        this.f40888p = true;
        Socket socket = this.f40889q;
        if (socket != null) {
            r90.g.c(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x013e  */
    @Override // u90.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u90.s f() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u90.c.f():u90.s");
    }

    @Override // v90.d
    public final s0 g() {
        return this.f40883j;
    }

    public final void h() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.f40883j.f36611b.type();
        int i11 = type == null ? -1 : b.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            socketCreateSocket = this.f40883j.f36610a.f36402b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.f40883j.f36611b);
        }
        this.f40889q = socketCreateSocket;
        if (this.f40888p) {
            i4.a.k(StatusResponseUtils.RESULT_CANCELED);
            return;
        }
        socketCreateSocket.setSoTimeout(this.f40879f);
        try {
            aa0.e eVar = aa0.e.f1191a;
            aa0.e.f1191a.e(socketCreateSocket, this.f40883j.f36612c, this.f40878e);
            try {
                this.f40893u = new t5.a(new a0(socketCreateSocket));
            } catch (NullPointerException e5) {
                if (Intrinsics.areEqual(e5.getMessage(), "throw with null exception")) {
                    throw new IOException(e5);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f40883j.f36612c);
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void i(SSLSocket sSLSocket, q90.m mVar) {
        f0 f0VarA;
        q90.a aVar = this.f40883j.f36610a;
        try {
            if (mVar.f36551b) {
                aa0.e eVar = aa0.e.f1191a;
                aa0.e.f1191a.d(sSLSocket, aVar.f36408h.f36626d, aVar.f36409i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            q90.s sVarU = pd.g.u(session);
            HostnameVerifier hostnameVerifier = aVar.f36404d;
            hostnameVerifier.getClass();
            if (hostnameVerifier.verify(aVar.f36408h.f36626d, session)) {
                q90.j jVar = aVar.f36405e;
                jVar.getClass();
                this.f40891s = new q90.s(sVarU.f36606a, sVarU.f36607b, sVarU.f36608c, new lw.o(jVar, sVarU, aVar, 24));
                aVar.f36408h.f36626d.getClass();
                Set set = jVar.f36517a;
                n0 n0Var = n0.f26529a;
                Iterator it = set.iterator();
                String strF = null;
                if (it.hasNext()) {
                    b3.i.A(it.next());
                    throw null;
                }
                n0Var.getClass();
                if (mVar.f36551b) {
                    aa0.e eVar2 = aa0.e.f1191a;
                    strF = aa0.e.f1191a.f(sSLSocket);
                }
                this.f40890r = sSLSocket;
                this.f40893u = new t5.a(new a0(sSLSocket));
                if (strF != null) {
                    f0.Companion.getClass();
                    f0VarA = e0.a(strF);
                } else {
                    f0VarA = f0.HTTP_1_1;
                }
                this.f40892t = f0VarA;
                aa0.e eVar3 = aa0.e.f1191a;
                aa0.e.f1191a.getClass();
                return;
            }
            List listA = sVarU.a();
            if (listA.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + aVar.f36408h.f36626d + " not verified (no certificates)");
            }
            Object obj = listA.get(0);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb2 = new StringBuilder("\n            |Hostname ");
            sb2.append(aVar.f36408h.f36626d);
            sb2.append(" not verified:\n            |    certificate: ");
            q90.j jVar2 = q90.j.f36516c;
            StringBuilder sb3 = new StringBuilder("sha256/");
            ia0.j jVar3 = ia0.j.f23646d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            sb3.append(r40.d.u(encoded).d("SHA-256").a());
            sb2.append(sb3.toString());
            sb2.append("\n            |    DN: ");
            sb2.append(x509Certificate.getSubjectDN().getName());
            sb2.append("\n            |    subjectAltNames: ");
            sb2.append(CollectionsKt.d0(ea0.c.a(x509Certificate, 2), ea0.c.a(x509Certificate, 7)));
            sb2.append("\n            ");
            throw new SSLPeerUnverifiedException(kotlin.text.s.d(sb2.toString()));
        } catch (Throwable th2) {
            aa0.e eVar4 = aa0.e.f1191a;
            aa0.e.f1191a.getClass();
            r90.g.c(sSLSocket);
            throw th2;
        }
    }

    @Override // u90.t
    public final boolean isReady() {
        return this.f40892t != null;
    }

    public final s j() throws IOException {
        g0 g0VarA;
        g0 g0Var = this.f40885m;
        g0Var.getClass();
        s0 s0Var = this.f40883j;
        q90.a aVar = s0Var.f36610a;
        InetSocketAddress inetSocketAddress = s0Var.f36612c;
        String str = "CONNECT " + r90.g.i(aVar.f36408h, true) + " HTTP/1.1";
        while (true) {
            t5.a aVar2 = this.f40893u;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("socket");
                aVar2 = null;
            }
            w90.f fVar = new w90.f(null, this, aVar2);
            t5.a aVar3 = this.f40893u;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("socket");
                aVar3 = null;
            }
            l0 l0VarI = ((d0) aVar3.f39792c).f23622a.i();
            long j9 = this.f40876c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            l0VarI.g(j9, timeUnit);
            t5.a aVar4 = this.f40893u;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("socket");
                aVar4 = null;
            }
            ((c0) aVar4.f39793d).f23611a.i().g(this.f40877d, timeUnit);
            fVar.l(g0Var.f36507c, str);
            fVar.a();
            o0 o0VarD = fVar.d(false);
            o0VarD.getClass();
            o0VarD.f36567a = g0Var;
            p0 p0VarA = o0VarD.a();
            int i11 = p0VarA.f36585d;
            long jE = r90.g.e(p0VarA);
            if (jE != -1) {
                w90.d dVarK = fVar.k(p0VarA.f36582a.f36505a, jE);
                r90.g.g(dVarK, Integer.MAX_VALUE);
                dVarK.close();
            }
            if (i11 == 200) {
                g0VarA = null;
                break;
            }
            if (i11 != 407) {
                i4.a.k(j4.s.f(i11, "Unexpected response code for CONNECT: "));
                return null;
            }
            g0VarA = s0Var.f36610a.f36406f.a(s0Var, p0VarA);
            if (g0VarA == null) {
                i4.a.k("Failed to authenticate with proxy");
                return null;
            }
            if ("close".equalsIgnoreCase(p0.e("Connection", p0VarA))) {
                break;
            }
            g0Var = g0VarA;
        }
        if (g0VarA == null) {
            return new s(this, null, null, 6);
        }
        Socket socket = this.f40889q;
        if (socket != null) {
            r90.g.c(socket);
        }
        int i12 = this.l + 1;
        if (i12 < 21) {
            inetSocketAddress.getClass();
            return new s(this, k(this, i12, g0VarA, 0, false, 12), null, 4);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        inetSocketAddress.getClass();
        this.f40875b.getClass();
        return new s(this, null, protocolException, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u90.c l(java.util.List r10, javax.net.ssl.SSLSocket r11) {
        /*
            r9 = this;
            r10.getClass()
            r11.getClass()
            int r0 = r9.f40886n
            int r1 = r0 + 1
            int r2 = r10.size()
            r6 = r1
        Lf:
            if (r6 >= r2) goto L57
            java.lang.Object r1 = r10.get(r6)
            q90.m r1 = (q90.m) r1
            r1.getClass()
            boolean r3 = r1.f36550a
            if (r3 != 0) goto L1f
            goto L43
        L1f:
            java.lang.String[] r3 = r1.f36553d
            if (r3 == 0) goto L33
            java.lang.String[] r4 = r11.getEnabledProtocols()
            w70.c r5 = w70.c.f43278a
            r5.getClass()
            boolean r3 = r90.e.h(r3, r4, r5)
            if (r3 != 0) goto L33
            goto L43
        L33:
            java.lang.String[] r1 = r1.f36552c
            if (r1 == 0) goto L46
            java.lang.String[] r3 = r11.getEnabledCipherSuites()
            q90.k r4 = q90.l.f36524c
            boolean r1 = r90.e.h(r1, r3, r4)
            if (r1 != 0) goto L46
        L43:
            int r6 = r6 + 1
            goto Lf
        L46:
            r10 = -1
            if (r0 == r10) goto L4c
            r10 = 1
        L4a:
            r7 = r10
            goto L4e
        L4c:
            r10 = 0
            goto L4a
        L4e:
            r8 = 3
            r4 = 0
            r5 = 0
            r3 = r9
            u90.c r10 = k(r3, r4, r5, r6, r7, r8)
            return r10
        L57:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: u90.c.l(java.util.List, javax.net.ssl.SSLSocket):u90.c");
    }

    public final c m(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        list.getClass();
        sSLSocket.getClass();
        if (this.f40886n != -1) {
            return this;
        }
        c cVarL = l(list, sSLSocket);
        if (cVarL != null) {
            return cVarL;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f40887o);
        sb2.append(", modes=");
        sb2.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String string = Arrays.toString(enabledProtocols);
        string.getClass();
        sb2.append(", supported protocols=");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    @Override // v90.d
    public final void e() {
    }

    @Override // v90.d
    public final void d(n nVar, IOException iOException) {
    }
}

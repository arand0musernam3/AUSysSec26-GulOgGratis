package u90;

import a60.y;
import androidx.lifecycle.n1;
import com.braze.h2;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.c0;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import m0.i1;
import q90.f0;
import q90.g0;
import q90.p0;
import q90.q0;
import q90.r0;
import q90.s0;
import q90.v;
import q90.v0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t90.e f40960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f40961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f40965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f40966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f40967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q90.a f40968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ky.o f40969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n f40970k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public y f40971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ld.k f40972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s0 f40973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kotlin.collections.t f40974p;

    public q(t90.e eVar, p pVar, int i11, int i12, int i13, int i14, boolean z11, boolean z12, q90.a aVar, ky.o oVar, n nVar, g0 g0Var) {
        eVar.getClass();
        pVar.getClass();
        oVar.getClass();
        this.f40960a = eVar;
        this.f40961b = pVar;
        this.f40962c = i11;
        this.f40963d = i12;
        this.f40964e = i13;
        this.f40965f = i14;
        this.f40966g = z11;
        this.f40967h = z12;
        this.f40968i = aVar;
        this.f40969j = oVar;
        this.f40970k = nVar;
        this.l = !Intrinsics.areEqual(g0Var.f36506b, "GET");
        this.f40974p = new kotlin.collections.t();
    }

    public final boolean a(o oVar) {
        ld.k kVar;
        s0 s0Var;
        if (this.f40974p.isEmpty() && this.f40973o == null) {
            if (oVar != null) {
                synchronized (oVar) {
                    s0Var = null;
                    if (oVar.l == 0 && oVar.f40949j && r90.g.a(oVar.f40942c.f36610a.f36408h, this.f40968i.f36408h)) {
                        s0Var = oVar.f40942c;
                    }
                }
                if (s0Var != null) {
                    this.f40973o = s0Var;
                    return true;
                }
            }
            y yVar = this.f40971m;
            if ((yVar == null || yVar.f941b >= yVar.f940a.size()) && (kVar = this.f40972n) != null) {
                return kVar.f();
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, java.util.List] */
    public final t b() {
        Socket socketL;
        r rVar;
        c cVarC;
        String hostAddress;
        int port;
        List listA;
        boolean zContains;
        o oVar = this.f40970k.f40931i;
        if (oVar == null) {
            rVar = null;
        } else {
            boolean zH = oVar.h(this.l);
            synchronized (oVar) {
                boolean z11 = oVar.f40949j;
                try {
                    if (!zH) {
                        oVar.f40949j = true;
                        socketL = this.f40970k.l();
                    } else if (!z11) {
                        v vVar = oVar.f40942c.f36610a.f36408h;
                        vVar.getClass();
                        v vVar2 = this.f40968i.f36408h;
                        socketL = !(vVar.f36627e == vVar2.f36627e && Intrinsics.areEqual(vVar.f36626d, vVar2.f36626d)) ? this.f40970k.l() : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f40970k.f40931i == null) {
                if (socketL != null) {
                    r90.g.c(socketL);
                }
                rVar = null;
            } else {
                if (socketL != null) {
                    h2.b("Check failed.");
                    return null;
                }
                rVar = new r(oVar);
            }
        }
        if (rVar != null) {
            return rVar;
        }
        r rVarD = d(null, null);
        if (rVarD != null) {
            return rVarD;
        }
        if (!this.f40974p.isEmpty()) {
            return (t) this.f40974p.removeFirst();
        }
        s0 s0Var = this.f40973o;
        if (s0Var != null) {
            this.f40973o = null;
            cVarC = c(s0Var, null);
        } else {
            y yVar = this.f40971m;
            if (yVar == null || yVar.f941b >= yVar.f940a.size()) {
                ld.k kVar = this.f40972n;
                if (kVar == null) {
                    kVar = new ld.k(this.f40968i, this.f40969j, this.f40970k, this.f40967h);
                    this.f40972n = kVar;
                }
                if (!kVar.f()) {
                    i4.a.k("exhausted all routes");
                    return null;
                }
                if (!kVar.f()) {
                    i1.c();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (kVar.f27645a < ((List) kVar.f27649e).size()) {
                    q90.a aVar = (q90.a) kVar.f27647c;
                    if (kVar.f27645a >= ((List) kVar.f27649e).size()) {
                        throw new SocketException("No route to " + aVar.f36408h.f36626d + "; exhausted proxy configurations: " + ((List) kVar.f27649e));
                    }
                    List list = (List) kVar.f27649e;
                    int i11 = kVar.f27645a;
                    kVar.f27645a = i11 + 1;
                    Proxy proxy = (Proxy) list.get(i11);
                    ArrayList arrayList2 = new ArrayList();
                    kVar.f27650f = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        v vVar3 = aVar.f36408h;
                        hostAddress = vVar3.f36626d;
                        port = vVar3.f36627e;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            i4.a.j(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                            return null;
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        InetAddress address = inetSocketAddress.getAddress();
                        if (address == null) {
                            hostAddress = inetSocketAddress.getHostName();
                            hostAddress.getClass();
                        } else {
                            hostAddress = address.getHostAddress();
                            hostAddress.getClass();
                        }
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
                    } else {
                        Regex regex = r90.d.f37810a;
                        hostAddress.getClass();
                        if (r90.d.f37810a.e(hostAddress)) {
                            listA = c0.c(InetAddress.getByName(hostAddress));
                        } else {
                            aVar.f36401a.getClass();
                            try {
                                InetAddress[] allByName = InetAddress.getAllByName(hostAddress);
                                allByName.getClass();
                                List listT = kotlin.collections.y.T(allByName);
                                if (listT.isEmpty()) {
                                    throw new UnknownHostException(aVar.f36401a + " returned no addresses for " + hostAddress);
                                }
                                listA = listT;
                            } catch (NullPointerException e5) {
                                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostAddress));
                                unknownHostException.initCause(e5);
                                throw unknownHostException;
                            }
                        }
                        if (kVar.f27646b) {
                            listA.getClass();
                            if (listA.size() >= 2) {
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj : listA) {
                                    if (((InetAddress) obj) instanceof Inet6Address) {
                                        arrayList3.add(obj);
                                    } else {
                                        arrayList4.add(obj);
                                    }
                                }
                                if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
                                    byte[] bArr = r90.e.f37811a;
                                    Iterator it = arrayList3.iterator();
                                    Iterator it2 = arrayList4.iterator();
                                    v70.e eVarB = c0.b();
                                    while (true) {
                                        if (!it.hasNext() && !it2.hasNext()) {
                                            break;
                                        }
                                        if (it.hasNext()) {
                                            eVarB.add(it.next());
                                        }
                                        if (it2.hasNext()) {
                                            eVarB.add(it2.next());
                                        }
                                    }
                                    listA = c0.a(eVarB);
                                }
                            }
                        }
                        Iterator it3 = listA.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new InetSocketAddress((InetAddress) it3.next(), port));
                        }
                    }
                    Iterator it4 = kVar.f27650f.iterator();
                    while (it4.hasNext()) {
                        s0 s0Var2 = new s0((q90.a) kVar.f27647c, proxy, (InetSocketAddress) it4.next());
                        ky.o oVar2 = (ky.o) kVar.f27648d;
                        synchronized (oVar2) {
                            zContains = ((LinkedHashSet) oVar2.f26718b).contains(s0Var2);
                        }
                        if (zContains) {
                            ((ArrayList) kVar.f27651g).add(s0Var2);
                        } else {
                            arrayList.add(s0Var2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    i0.s((ArrayList) kVar.f27651g, arrayList);
                    ((ArrayList) kVar.f27651g).clear();
                }
                y yVar2 = new y();
                yVar2.f940a = arrayList;
                this.f40971m = yVar2;
                if (this.f40970k.f40938q) {
                    i4.a.k("Canceled");
                    return null;
                }
                if (yVar2.f941b >= arrayList.size()) {
                    i1.c();
                    return null;
                }
                int i12 = yVar2.f941b;
                yVar2.f941b = i12 + 1;
                cVarC = c((s0) arrayList.get(i12), arrayList);
            } else {
                int i13 = yVar.f941b;
                ArrayList arrayList5 = yVar.f940a;
                if (i13 >= arrayList5.size()) {
                    i1.c();
                    return null;
                }
                int i14 = yVar.f941b;
                yVar.f941b = i14 + 1;
                cVarC = c((s0) arrayList5.get(i14), null);
            }
        }
        r rVarD2 = d(cVarC, cVarC.f40884k);
        return rVarD2 != null ? rVarD2 : cVarC;
    }

    public final c c(s0 s0Var, ArrayList arrayList) throws UnknownServiceException {
        s0Var.getClass();
        q90.a aVar = s0Var.f36610a;
        if (aVar.f36403c == null) {
            if (!aVar.f36410j.contains(q90.m.f36549h)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = s0Var.f36610a.f36408h.f36626d;
            aa0.e eVar = aa0.e.f1191a;
            if (!aa0.e.f1191a.h(str)) {
                throw new UnknownServiceException(a0.p("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (aVar.f36409i.contains(f0.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        g0 g0Var = null;
        if (s0Var.f36611b.type() == Proxy.Type.HTTP) {
            q90.a aVar2 = s0Var.f36610a;
            if (aVar2.f36403c != null || aVar2.f36409i.contains(f0.H2_PRIOR_KNOWLEDGE)) {
                n1 n1Var = new n1();
                v vVar = s0Var.f36610a.f36408h;
                vVar.getClass();
                n1Var.f3499a = vVar;
                n1Var.w("CONNECT", null);
                q90.a aVar3 = s0Var.f36610a;
                n1Var.u("Host", r90.g.i(aVar3.f36408h, true));
                n1Var.u("Proxy-Connection", "Keep-Alive");
                n1Var.u("User-Agent", "okhttp/5.3.2");
                g0 g0Var2 = new g0(n1Var);
                q0 q0Var = r0.f36605a;
                q90.q qVar = v0.f36632p0;
                ax.g0 g0Var3 = new ax.g0(3);
                f0 f0Var = f0.HTTP_1_1;
                f0Var.getClass();
                zz.f.u("Proxy-Authenticate");
                zz.f.v("OkHttp-Preemptive", "Proxy-Authenticate");
                g0Var3.i("Proxy-Authenticate");
                zz.f.k(g0Var3, "Proxy-Authenticate", "OkHttp-Preemptive");
                g0 g0VarA = aVar3.f36406f.a(s0Var, new p0(g0Var2, f0Var, "Preemptive Authenticate", 407, null, g0Var3.g(), q0Var, null, null, null, null, -1L, -1L, null, qVar));
                g0Var = g0VarA == null ? g0Var2 : g0VarA;
            }
        }
        return new c(this.f40960a, this.f40961b, this.f40962c, this.f40963d, this.f40964e, this.f40965f, this.f40966g, this.f40970k, this, s0Var, arrayList, 0, g0Var, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:14:0x0034, B:22:0x0041, B:25:0x0048), top: B:53:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u90.r d(u90.c r11, java.util.List r12) {
        /*
            r10 = this;
            u90.p r0 = r10.f40961b
            boolean r1 = r10.l
            q90.a r2 = r10.f40968i
            u90.n r3 = r10.f40970k
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.isReady()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            r0.getClass()
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.f40959d
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        L21:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L69
            java.lang.Object r7 = r0.next()
            u90.o r7 = (u90.o) r7
            r7.getClass()
            monitor-enter(r7)
            if (r6 == 0) goto L41
            x90.n r9 = r7.f40948i     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L3a
            r9 = r5
            goto L3b
        L3a:
            r9 = r4
        L3b:
            if (r9 != 0) goto L41
        L3d:
            r9 = r4
            goto L4c
        L3f:
            r11 = move-exception
            goto L67
        L41:
            boolean r9 = r7.f(r2, r12)     // Catch: java.lang.Throwable -> L3f
            if (r9 != 0) goto L48
            goto L3d
        L48:
            r3.b(r7)     // Catch: java.lang.Throwable -> L3f
            r9 = r5
        L4c:
            monitor-exit(r7)
            if (r9 == 0) goto L21
            boolean r9 = r7.h(r1)
            if (r9 == 0) goto L56
            goto L6a
        L56:
            monitor-enter(r7)
            r7.f40949j = r5     // Catch: java.lang.Throwable -> L64
            java.net.Socket r8 = r3.l()     // Catch: java.lang.Throwable -> L64
            monitor-exit(r7)
            if (r8 == 0) goto L21
            r90.g.c(r8)
            goto L21
        L64:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        L67:
            monitor-exit(r7)
            throw r11
        L69:
            r7 = r8
        L6a:
            if (r7 != 0) goto L6d
            return r8
        L6d:
            if (r11 == 0) goto L7a
            q90.s0 r12 = r11.f40883j
            r10.f40973o = r12
            java.net.Socket r11 = r11.f40890r
            if (r11 == 0) goto L7a
            r90.g.c(r11)
        L7a:
            u90.r r11 = new u90.r
            r11.<init>(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u90.q.d(u90.c, java.util.List):u90.r");
    }
}

package ga0;

import ia0.i0;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import q90.f0;
import q90.g0;
import q90.p0;
import q90.w0;
import q90.x0;
import u90.n;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements w0, i {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final List f20285x = c0.c(f0.HTTP_1_1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f20286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Random f20287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f20289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n f20293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f20294i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f20295j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f20296k;
    public final t90.c l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f20297m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t5.a f20298n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayDeque f20299o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayDeque f20300p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f20301q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f20302r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20303s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f20304t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f20305u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20306v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20307w;

    public g(t90.e eVar, g0 g0Var, x0 x0Var, Random random, long j9, long j11, long j12) {
        eVar.getClass();
        this.f20286a = x0Var;
        this.f20287b = random;
        this.f20288c = j9;
        this.f20289d = null;
        this.f20290e = j11;
        this.f20291f = j12;
        this.l = eVar.d();
        this.f20299o = new ArrayDeque();
        this.f20300p = new ArrayDeque();
        this.f20303s = -1;
        String str = g0Var.f36506b;
        if (!Intrinsics.areEqual("GET", str)) {
            i4.a.j(str, "Request must be GET: ");
            throw null;
        }
        ia0.j jVar = ia0.j.f23646d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f20292g = r40.d.u(bArr).a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, ga0.k] */
    public static void c(g gVar, Exception exc, p0 p0Var, int i11) {
        k kVar;
        if ((i11 & 2) != 0) {
            p0Var = null;
        }
        boolean z11 = (i11 & 4) == 0;
        gVar.getClass();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (gVar) {
            try {
                if (gVar.f20305u) {
                    return;
                }
                gVar.f20305u = true;
                t5.a aVar = gVar.f20298n;
                ?? r02 = gVar.f20296k;
                objectRef.element = r02;
                gVar.f20296k = null;
                if (!z11 && r02 != 0) {
                    t90.c.b(gVar.l, gVar.f20297m + " writer close", 0L, new c(objectRef, 0), 2);
                }
                gVar.l.f();
                try {
                    gVar.f20286a.onFailure(gVar, exc, p0Var);
                    if (aVar != null) {
                        aVar.cancel();
                    }
                    if (!z11 || (kVar = (k) objectRef.element) == null) {
                        return;
                    }
                    r90.e.b(kVar);
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final i0 a(p0 p0Var) {
        int i11 = p0Var.f36585d;
        if (i11 != 101) {
            StringBuilder sb2 = new StringBuilder("Expected HTTP 101 response but was '");
            sb2.append(i11);
            sb2.append(' ');
            throw new ProtocolException(l1.f(sb2, p0Var.f36584c, '\''));
        }
        String strE = p0.e("Connection", p0Var);
        if (!"Upgrade".equalsIgnoreCase(strE)) {
            throw new ProtocolException(e0.f.g('\'', "Expected 'Connection' header value 'Upgrade' but was '", strE));
        }
        String strE2 = p0.e("Upgrade", p0Var);
        if (!"websocket".equalsIgnoreCase(strE2)) {
            throw new ProtocolException(e0.f.g('\'', "Expected 'Upgrade' header value 'websocket' but was '", strE2));
        }
        String strE3 = p0.e("Sec-WebSocket-Accept", p0Var);
        ia0.j jVar = ia0.j.f23646d;
        String strA = r40.d.p(this.f20292g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").d(McElieceCCA2KeyGenParameterSpec.SHA1).a();
        if (Intrinsics.areEqual(strA, strE3)) {
            i0 i0Var = p0Var.f36589h;
            if (i0Var != null) {
                return i0Var;
            }
            throw new ProtocolException("Web Socket socket missing: bad interceptor?");
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA + "' but was '" + strE3 + '\'');
    }

    public final boolean b(int i11, String str) {
        String str2;
        long j9 = this.f20291f;
        synchronized (this) {
            ia0.j jVarP = null;
            try {
                if (i11 < 1000 || i11 >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i11;
                } else if ((1004 > i11 || i11 >= 1007) && (1015 > i11 || i11 >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i11 + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    ia0.j jVar = ia0.j.f23646d;
                    jVarP = r40.d.p(str);
                    if (jVarP.f23647a.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.f20305u && !this.f20302r) {
                    this.f20302r = true;
                    this.f20300p.add(new d(i11, j9, jVarP));
                    e();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r11 = this;
            monitor-enter(r11)
            int r0 = r11.f20303s     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r11.f20304t     // Catch: java.lang.Throwable -> L3f
            ga0.j r2 = r11.f20295j     // Catch: java.lang.Throwable -> L3f
            r3 = 0
            r11.f20295j = r3     // Catch: java.lang.Throwable -> L3f
            boolean r4 = r11.f20302r     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L46
            java.util.ArrayDeque r4 = r11.f20300p     // Catch: java.lang.Throwable -> L3f
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L46
            ga0.k r4 = r11.f20296k     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L41
            r11.f20296k = r3     // Catch: java.lang.Throwable -> L3f
            t90.c r5 = r11.l     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r3.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = r11.f20297m     // Catch: java.lang.Throwable -> L3f
            r3.append(r6)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = " writer close"
            r3.append(r6)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L3f
            cw.b r9 = new cw.b     // Catch: java.lang.Throwable -> L3f
            r3 = 20
            r9.<init>(r4, r3)     // Catch: java.lang.Throwable -> L3f
            r10 = 2
            r7 = 0
            t90.c.b(r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r0 = move-exception
            goto L67
        L41:
            t90.c r3 = r11.l     // Catch: java.lang.Throwable -> L3f
            r3.f()     // Catch: java.lang.Throwable -> L3f
        L46:
            boolean r3 = r11.f20305u     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L55
            ga0.k r3 = r11.f20296k     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L55
            int r3 = r11.f20303s     // Catch: java.lang.Throwable -> L3f
            r4 = -1
            if (r3 == r4) goto L55
            r3 = 1
            goto L56
        L55:
            r3 = 0
        L56:
            monitor-exit(r11)
            if (r3 == 0) goto L61
            q90.x0 r3 = r11.f20286a
            r1.getClass()
            r3.onClosed(r11, r0, r1)
        L61:
            if (r2 == 0) goto L66
            r90.e.b(r2)
        L66:
            return
        L67:
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ga0.g.d():void");
    }

    public final void e() {
        TimeZone timeZone = r90.g.f37815a;
        f fVar = this.f20294i;
        if (fVar != null) {
            this.l.c(fVar, 0L);
        }
    }

    public final boolean f() {
        k kVar;
        Object obj;
        String str;
        synchronized (this) {
            try {
                boolean z11 = false;
                if (this.f20305u) {
                    return false;
                }
                k kVar2 = this.f20296k;
                Object objPoll = this.f20299o.poll();
                String str2 = null;
                int i11 = -1;
                if (objPoll == null) {
                    Object objPoll2 = this.f20300p.poll();
                    if (objPoll2 instanceof d) {
                        int i12 = this.f20303s;
                        str = this.f20304t;
                        if (i12 != -1) {
                            k kVar3 = this.f20296k;
                            this.f20296k = null;
                            if (kVar3 != null && this.f20295j == null) {
                                z11 = true;
                            }
                            this.l.f();
                            kVar = kVar3;
                            i11 = i12;
                            obj = objPoll2;
                        } else {
                            long j9 = ((d) objPoll2).f20281c;
                            t90.c.b(this.l, this.f20297m + " cancel", TimeUnit.MILLISECONDS.toNanos(j9), new cw.b(this, 21), 4);
                            i11 = i12;
                            obj = objPoll2;
                            kVar = null;
                        }
                    } else {
                        if (objPoll2 == null) {
                            return false;
                        }
                        str = null;
                        obj = objPoll2;
                        kVar = null;
                    }
                } else {
                    kVar = null;
                    obj = null;
                    str = null;
                }
                try {
                    if (objPoll != null) {
                        kVar2.getClass();
                        kVar2.a(10, (ia0.j) objPoll);
                    } else if (obj instanceof e) {
                        kVar2.getClass();
                        kVar2.e(((e) obj).f20282a);
                        synchronized (this) {
                            this.f20301q -= (long) ((e) obj).f20282a.f23647a.length;
                        }
                    } else {
                        if (!(obj instanceof d)) {
                            throw new AssertionError();
                        }
                        kVar2.getClass();
                        int i13 = ((d) obj).f20279a;
                        ia0.j jVar = ((d) obj).f20280b;
                        ia0.j jVar2 = ia0.j.f23646d;
                        if (i13 < 1000 || i13 >= 5000) {
                            str2 = "Code must be in range [1000,5000): " + i13;
                        } else if ((1004 <= i13 && i13 < 1007) || (1015 <= i13 && i13 < 3000)) {
                            str2 = "Code " + i13 + " is reserved and may not be used.";
                        }
                        if (str2 != null) {
                            throw new IllegalArgumentException(str2.toString());
                        }
                        ia0.g gVar = new ia0.g();
                        gVar.D0(i13);
                        if (jVar != null) {
                            gVar.y0(jVar);
                        }
                        try {
                            kVar2.a(8, gVar.q(gVar.f23643b));
                            if (z11) {
                                x0 x0Var = this.f20286a;
                                str.getClass();
                                x0Var.onClosed(this, i11, str);
                            }
                        } finally {
                            kVar2.f20334h = true;
                        }
                    }
                    return true;
                } finally {
                    if (kVar != null) {
                        r90.e.b(kVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

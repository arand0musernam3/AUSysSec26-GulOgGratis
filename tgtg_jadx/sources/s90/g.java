package s90;

import c40.q;
import ia0.a0;
import ia0.c0;
import ia0.d0;
import ia0.m;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.y;
import m90.z0;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Closeable, Flushable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Regex f38930t = new Regex("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f38931u = "CLEAN";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f38932v = "DIRTY";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f38933w = "REMOVE";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f38934x = "READ";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f38935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f38936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f38938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f38939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f38940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f38941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c0 f38942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f38943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f38944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f38945k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f38946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f38947n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f38948o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f38949p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f38950q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t90.c f38951r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ga0.f f38952s;

    public g(m mVar, a0 a0Var, t90.e eVar) {
        mVar.getClass();
        eVar.getClass();
        this.f38935a = a0Var;
        this.f38936b = new f(mVar);
        this.f38937c = 20971520L;
        this.f38943i = new LinkedHashMap(0, 0.75f, true);
        this.f38951r = eVar.d();
        this.f38952s = new ga0.f(this, 1, k.p(new StringBuilder(), r90.g.f37816b, " Cache"));
        this.f38938d = a0Var.f("journal");
        this.f38939e = a0Var.f("journal.tmp");
        this.f38940f = a0Var.f("journal.bkp");
    }

    public static void J(String str) {
        if (f38930t.e(str)) {
            return;
        }
        i4.a.i(e0.f.g('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    public final void A() throws Throwable {
        f fVar = this.f38936b;
        a0 a0Var = this.f38938d;
        d0 d0VarC = ia0.b.c(fVar.J(a0Var));
        try {
            String strD = d0VarC.D(LongCompanionObject.MAX_VALUE);
            String strD2 = d0VarC.D(LongCompanionObject.MAX_VALUE);
            String strD3 = d0VarC.D(LongCompanionObject.MAX_VALUE);
            String strD4 = d0VarC.D(LongCompanionObject.MAX_VALUE);
            String strD5 = d0VarC.D(LongCompanionObject.MAX_VALUE);
            if (!Intrinsics.areEqual("libcore.io.DiskLruCache", strD) || !Intrinsics.areEqual("1", strD2) || !Intrinsics.areEqual(String.valueOf(201105), strD3) || !Intrinsics.areEqual(String.valueOf(2), strD4) || strD5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strD + ", " + strD2 + ", " + strD4 + ", " + strD5 + ']');
            }
            int i11 = 0;
            while (true) {
                try {
                    B(d0VarC.D(LongCompanionObject.MAX_VALUE));
                    i11++;
                } catch (EOFException unused) {
                    this.f38944j = i11 - this.f38943i.size();
                    if (d0VarC.a()) {
                        c0 c0Var = this.f38942h;
                        if (c0Var != null) {
                            r90.e.b(c0Var);
                        }
                        fVar.getClass();
                        a0Var.getClass();
                        this.f38942h = new c0(new rc.f(fVar.a(a0Var), (Function1) new z0(this, 29)));
                    } else {
                        G();
                    }
                    try {
                        d0VarC.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                d0VarC.close();
            } catch (Throwable th4) {
                u70.e.a(th, th4);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final void B(String str) throws IOException {
        String strSubstring;
        int iF = StringsKt.F(str, ' ', 0, false, 6);
        if (iF == -1) {
            i4.a.k("unexpected journal line: ".concat(str));
            return;
        }
        int i11 = iF + 1;
        int iF2 = StringsKt.F(str, ' ', i11, false, 4);
        LinkedHashMap linkedHashMap = this.f38943i;
        if (iF2 == -1) {
            strSubstring = str.substring(i11);
            String str2 = f38933w;
            if (iF == str2.length() && y.p(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i11, iF2);
        }
        d dVar = (d) linkedHashMap.get(strSubstring);
        if (dVar == null) {
            dVar = new d(this, strSubstring);
            linkedHashMap.put(strSubstring, dVar);
        }
        if (iF2 != -1) {
            String str3 = f38931u;
            if (iF == str3.length() && y.p(str, str3, false)) {
                List listS = StringsKt.S(str.substring(iF2 + 1), new char[]{' '}, 6);
                dVar.f38920e = true;
                dVar.f38922g = null;
                listS.getClass();
                int size = listS.size();
                dVar.f38925j.getClass();
                if (size != 2) {
                    i4.a.l(listS, "unexpected journal line: ");
                    return;
                }
                try {
                    int size2 = listS.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        dVar.f38917b[i12] = Long.parseLong((String) listS.get(i12));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    i4.a.l(listS, "unexpected journal line: ");
                    return;
                }
            }
        }
        if (iF2 == -1) {
            String str4 = f38932v;
            if (iF == str4.length() && y.p(str, str4, false)) {
                dVar.f38922g = new q(this, dVar);
                return;
            }
        }
        if (iF2 == -1) {
            String str5 = f38934x;
            if (iF == str5.length() && y.p(str, str5, false)) {
                return;
            }
        }
        i4.a.k("unexpected journal line: ".concat(str));
    }

    public final synchronized void G() {
        Throwable th2;
        try {
            c0 c0Var = this.f38942h;
            if (c0Var != null) {
                c0Var.close();
            }
            c0 c0VarB = ia0.b.b(this.f38936b.I(this.f38939e, false));
            try {
                c0VarB.M("libcore.io.DiskLruCache");
                c0VarB.writeByte(10);
                c0VarB.M("1");
                c0VarB.writeByte(10);
                c0VarB.s0(201105);
                c0VarB.writeByte(10);
                c0VarB.s0(2);
                c0VarB.writeByte(10);
                c0VarB.writeByte(10);
                for (Object obj : this.f38943i.values()) {
                    obj.getClass();
                    d dVar = (d) obj;
                    if (dVar.f38922g != null) {
                        c0VarB.M(f38932v);
                        c0VarB.writeByte(32);
                        c0VarB.M(dVar.f38916a);
                        c0VarB.writeByte(10);
                    } else {
                        c0VarB.M(f38931u);
                        c0VarB.writeByte(32);
                        c0VarB.M(dVar.f38916a);
                        for (long j9 : dVar.f38917b) {
                            c0VarB.writeByte(32);
                            c0VarB.s0(j9);
                        }
                        c0VarB.writeByte(10);
                    }
                }
                try {
                    c0VarB.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    c0VarB.close();
                } catch (Throwable th5) {
                    u70.e.a(th4, th5);
                }
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            boolean zU = this.f38936b.u(this.f38938d);
            f fVar = this.f38936b;
            if (zU) {
                fVar.e(this.f38938d, this.f38940f);
                this.f38936b.e(this.f38939e, this.f38938d);
                r90.e.d(this.f38936b, this.f38940f);
            } else {
                fVar.e(this.f38939e, this.f38938d);
            }
            c0 c0Var2 = this.f38942h;
            if (c0Var2 != null) {
                r90.e.b(c0Var2);
            }
            f fVar2 = this.f38936b;
            a0 a0Var = this.f38938d;
            fVar2.getClass();
            a0Var.getClass();
            this.f38942h = new c0(new rc.f(fVar2.a(a0Var), (Function1) new z0(this, 29)));
            this.f38945k = false;
            this.f38949p = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    public final void H(d dVar) {
        c0 c0Var;
        String str = dVar.f38916a;
        if (!this.l) {
            if (dVar.f38923h > 0 && (c0Var = this.f38942h) != null) {
                c0Var.M(f38932v);
                c0Var.writeByte(32);
                c0Var.M(str);
                c0Var.writeByte(10);
                c0Var.flush();
            }
            if (dVar.f38923h > 0 || dVar.f38922g != null) {
                dVar.f38921f = true;
                return;
            }
        }
        q qVar = dVar.f38922g;
        if (qVar != null) {
            qVar.d();
        }
        for (int i11 = 0; i11 < 2; i11++) {
            r90.e.d(this.f38936b, (a0) dVar.f38918c.get(i11));
            long j9 = this.f38941g;
            long[] jArr = dVar.f38917b;
            this.f38941g = j9 - jArr[i11];
            jArr[i11] = 0;
        }
        this.f38944j++;
        c0 c0Var2 = this.f38942h;
        if (c0Var2 != null) {
            c0Var2.M(f38933w);
            c0Var2.writeByte(32);
            c0Var2.M(str);
            c0Var2.writeByte(10);
        }
        this.f38943i.remove(str);
        if (t()) {
            this.f38951r.c(this.f38952s, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        H(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f38941g
            long r2 = r4.f38937c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2a
            java.util.LinkedHashMap r0 = r4.f38943i
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            r1.getClass()
            s90.d r1 = (s90.d) r1
            boolean r2 = r1.f38921f
            if (r2 != 0) goto L12
            r4.H(r1)
            goto L0
        L29:
            return
        L2a:
            r0 = 0
            r4.f38948o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s90.g.I():void");
    }

    public final synchronized void a() {
        if (this.f38947n) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f38946m && !this.f38947n) {
                Collection collectionValues = this.f38943i.values();
                collectionValues.getClass();
                for (d dVar : (d[]) collectionValues.toArray(new d[0])) {
                    dVar.getClass();
                    q qVar = dVar.f38922g;
                    if (qVar != null) {
                        qVar.d();
                    }
                }
                I();
                c0 c0Var = this.f38942h;
                if (c0Var != null) {
                    r90.e.b(c0Var);
                }
                this.f38942h = null;
                this.f38947n = true;
                return;
            }
            this.f38947n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e(q qVar, boolean z11) {
        d dVar = (d) qVar.f7093c;
        if (!Intrinsics.areEqual(dVar.f38922g, qVar)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z11 && !dVar.f38920e) {
            for (int i11 = 0; i11 < 2; i11++) {
                boolean[] zArr = (boolean[]) qVar.f7094d;
                zArr.getClass();
                if (!zArr[i11]) {
                    qVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!this.f38936b.u((a0) dVar.f38919d.get(i11))) {
                    qVar.a();
                    return;
                }
            }
        }
        for (int i12 = 0; i12 < 2; i12++) {
            a0 a0Var = (a0) dVar.f38919d.get(i12);
            if (!z11 || dVar.f38921f) {
                r90.e.d(this.f38936b, a0Var);
            } else if (this.f38936b.u(a0Var)) {
                a0 a0Var2 = (a0) dVar.f38918c.get(i12);
                this.f38936b.e(a0Var, a0Var2);
                long j9 = dVar.f38917b[i12];
                Long l = (Long) this.f38936b.B(a0Var2).f807e;
                long jLongValue = l != null ? l.longValue() : 0L;
                dVar.f38917b[i12] = jLongValue;
                this.f38941g = (this.f38941g - j9) + jLongValue;
            }
        }
        dVar.f38922g = null;
        if (dVar.f38921f) {
            H(dVar);
            return;
        }
        this.f38944j++;
        c0 c0Var = this.f38942h;
        c0Var.getClass();
        if (dVar.f38920e || z11) {
            dVar.f38920e = true;
            c0Var.M(f38931u);
            c0Var.writeByte(32);
            c0Var.M(dVar.f38916a);
            for (long j11 : dVar.f38917b) {
                c0Var.writeByte(32);
                c0Var.s0(j11);
            }
            c0Var.writeByte(10);
            if (z11) {
                long j12 = this.f38950q;
                this.f38950q = 1 + j12;
                dVar.f38924i = j12;
            }
        } else {
            this.f38943i.remove(dVar.f38916a);
            c0Var.M(f38933w);
            c0Var.writeByte(32);
            c0Var.M(dVar.f38916a);
            c0Var.writeByte(10);
        }
        c0Var.flush();
        if (this.f38941g > this.f38937c || t()) {
            this.f38951r.c(this.f38952s, 0L);
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f38946m) {
            a();
            I();
            c0 c0Var = this.f38942h;
            c0Var.getClass();
            c0Var.flush();
        }
    }

    public final synchronized q g(long j9, String str) {
        str.getClass();
        r();
        a();
        J(str);
        d dVar = (d) this.f38943i.get(str);
        if (j9 != -1 && (dVar == null || dVar.f38924i != j9)) {
            return null;
        }
        if ((dVar != null ? dVar.f38922g : null) != null) {
            return null;
        }
        if (dVar != null && dVar.f38923h != 0) {
            return null;
        }
        if (!this.f38948o && !this.f38949p) {
            c0 c0Var = this.f38942h;
            c0Var.getClass();
            c0Var.M(f38932v);
            c0Var.writeByte(32);
            c0Var.M(str);
            c0Var.writeByte(10);
            c0Var.flush();
            if (this.f38945k) {
                return null;
            }
            if (dVar == null) {
                dVar = new d(this, str);
                this.f38943i.put(str, dVar);
            }
            q qVar = new q(this, dVar);
            dVar.f38922g = qVar;
            return qVar;
        }
        this.f38951r.c(this.f38952s, 0L);
        return null;
    }

    public final synchronized e p(String str) {
        str.getClass();
        r();
        a();
        J(str);
        d dVar = (d) this.f38943i.get(str);
        if (dVar == null) {
            return null;
        }
        e eVarA = dVar.a();
        if (eVarA == null) {
            return null;
        }
        this.f38944j++;
        c0 c0Var = this.f38942h;
        c0Var.getClass();
        c0Var.M(f38934x);
        c0Var.writeByte(32);
        c0Var.M(str);
        c0Var.writeByte(10);
        if (t()) {
            this.f38951r.c(this.f38952s, 0L);
        }
        return eVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0066 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #3 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:16:0x002a, B:17:0x002f, B:38:0x006c, B:40:0x0078, B:50:0x00bb, B:44:0x0083, B:46:0x00b4, B:48:0x00b8, B:49:0x00ba, B:37:0x0066, B:53:0x00c2, B:28:0x0055, B:25:0x0050, B:45:0x00aa, B:19:0x0041), top: B:61:0x0003, inners: #1, #2, #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #3 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:16:0x002a, B:17:0x002f, B:38:0x006c, B:40:0x0078, B:50:0x00bb, B:44:0x0083, B:46:0x00b4, B:48:0x00b8, B:49:0x00ba, B:37:0x0066, B:53:0x00c2, B:28:0x0055, B:25:0x0050, B:45:0x00aa, B:19:0x0041), top: B:61:0x0003, inners: #1, #2, #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void r() {
        /*
            r7 = this;
            java.lang.String r0 = "DiskLruCache "
            monitor-enter(r7)
            java.util.TimeZone r1 = r90.g.f37815a     // Catch: java.lang.Throwable -> L27
            boolean r1 = r7.f38946m     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto Lb
            monitor-exit(r7)
            return
        Lb:
            s90.f r1 = r7.f38936b     // Catch: java.lang.Throwable -> L27
            ia0.a0 r2 = r7.f38940f     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.u(r2)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L2f
            s90.f r1 = r7.f38936b     // Catch: java.lang.Throwable -> L27
            ia0.a0 r2 = r7.f38938d     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.u(r2)     // Catch: java.lang.Throwable -> L27
            s90.f r2 = r7.f38936b
            ia0.a0 r3 = r7.f38940f
            if (r1 == 0) goto L2a
            r2.t(r3)     // Catch: java.lang.Throwable -> L27
            goto L2f
        L27:
            r0 = move-exception
            goto Lc3
        L2a:
            ia0.a0 r1 = r7.f38938d     // Catch: java.lang.Throwable -> L27
            r2.e(r3, r1)     // Catch: java.lang.Throwable -> L27
        L2f:
            s90.f r1 = r7.f38936b     // Catch: java.lang.Throwable -> L27
            ia0.a0 r2 = r7.f38940f     // Catch: java.lang.Throwable -> L27
            byte[] r3 = r90.e.f37811a     // Catch: java.lang.Throwable -> L27
            r1.getClass()     // Catch: java.lang.Throwable -> L27
            r2.getClass()     // Catch: java.lang.Throwable -> L27
            r3 = 0
            ia0.h0 r4 = r1.I(r2, r3)     // Catch: java.lang.Throwable -> L27
            r5 = 1
            ia0.m r6 = r1.f23667c     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L59
            r6.r(r2)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L59
            if (r4 == 0) goto L4b
            r4.close()     // Catch: java.lang.Throwable -> L4b
        L4b:
            r1 = r5
            goto L6c
        L4d:
            r6 = move-exception
            if (r4 == 0) goto L64
            r4.close()     // Catch: java.lang.Throwable -> L54
            goto L64
        L54:
            r4 = move-exception
            u70.e.a(r6, r4)     // Catch: java.lang.Throwable -> L27
            goto L64
        L59:
            if (r4 == 0) goto L62
            r4.close()     // Catch: java.lang.Throwable -> L5f
            goto L62
        L5f:
            r4 = move-exception
        L60:
            r6 = r4
            goto L64
        L62:
            r4 = 0
            goto L60
        L64:
            if (r6 != 0) goto Lc2
            ia0.m r1 = r1.f23667c     // Catch: java.lang.Throwable -> L27
            r1.r(r2)     // Catch: java.lang.Throwable -> L27
            r1 = r3
        L6c:
            r7.l = r1     // Catch: java.lang.Throwable -> L27
            s90.f r1 = r7.f38936b     // Catch: java.lang.Throwable -> L27
            ia0.a0 r2 = r7.f38938d     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.u(r2)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto Lbb
            r7.A()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L82
            r7.u()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L82
            r7.f38946m = r5     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L82
            monitor-exit(r7)
            return
        L82:
            r1 = move-exception
            aa0.e r2 = aa0.e.f1191a     // Catch: java.lang.Throwable -> L27
            aa0.e r2 = aa0.e.f1191a     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L27
            ia0.a0 r0 = r7.f38935a     // Catch: java.lang.Throwable -> L27
            r4.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = " is corrupt: "
            r4.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L27
            r4.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = ", removing"
            r4.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L27
            r4 = 5
            r2.i(r4, r0, r1)     // Catch: java.lang.Throwable -> L27
            r7.close()     // Catch: java.lang.Throwable -> Lb7
            s90.f r0 = r7.f38936b     // Catch: java.lang.Throwable -> Lb7
            ia0.a0 r1 = r7.f38935a     // Catch: java.lang.Throwable -> Lb7
            r90.e.c(r0, r1)     // Catch: java.lang.Throwable -> Lb7
            r7.f38947n = r3     // Catch: java.lang.Throwable -> L27
            goto Lbb
        Lb7:
            r0 = move-exception
            r7.f38947n = r3     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        Lbb:
            r7.G()     // Catch: java.lang.Throwable -> L27
            r7.f38946m = r5     // Catch: java.lang.Throwable -> L27
            monitor-exit(r7)
            return
        Lc2:
            throw r6     // Catch: java.lang.Throwable -> L27
        Lc3:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L27
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s90.g.r():void");
    }

    public final boolean t() {
        int i11 = this.f38944j;
        return i11 >= 2000 && i11 >= this.f38943i.size();
    }

    public final void u() {
        a0 a0Var = this.f38939e;
        f fVar = this.f38936b;
        r90.e.d(fVar, a0Var);
        Iterator it = this.f38943i.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            d dVar = (d) next;
            int i11 = 0;
            if (dVar.f38922g == null) {
                while (i11 < 2) {
                    this.f38941g += dVar.f38917b[i11];
                    i11++;
                }
            } else {
                dVar.f38922g = null;
                while (i11 < 2) {
                    r90.e.d(fVar, (a0) dVar.f38918c.get(i11));
                    r90.e.d(fVar, (a0) dVar.f38919d.get(i11));
                    i11++;
                }
                it.remove();
            }
        }
    }
}

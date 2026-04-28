package rc;

import c40.q;
import ia0.a0;
import ia0.c0;
import ia0.d0;
import ia0.m;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.y;
import m90.z0;
import v80.f0;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Closeable, Flushable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Regex f37871q = new Regex("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f37872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f37874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f37875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f37876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f37877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a90.d f37878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f37879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f37880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c0 f37881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f37882k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f37883m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f37884n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f37885o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f37886p;

    public e(long j9, m mVar, a0 a0Var, x xVar) {
        this.f37872a = a0Var;
        this.f37873b = j9;
        if (j9 <= 0) {
            i4.a.f("maxSize <= 0");
            throw null;
        }
        this.f37874c = a0Var.f("journal");
        this.f37875d = a0Var.f("journal.tmp");
        this.f37876e = a0Var.f("journal.bkp");
        this.f37877f = new LinkedHashMap(0, 0.75f, true);
        this.f37878g = f0.b(kotlin.coroutines.e.c(f0.d(), xVar.z0(1)));
        this.f37886p = new d(mVar);
    }

    public static void H(String str) {
        if (f37871q.e(str)) {
            return;
        }
        i4.a.i(e0.f.g('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0119 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003e, B:26:0x0058, B:30:0x0071, B:32:0x0081, B:34:0x0088, B:27:0x005c, B:29:0x006a, B:38:0x00a8, B:40:0x00af, B:43:0x00b4, B:45:0x00c5, B:48:0x00ca, B:53:0x0105, B:55:0x0110, B:59:0x0119, B:49:0x00e2, B:51:0x00f7, B:52:0x0102, B:37:0x0098, B:62:0x011e, B:63:0x0125), top: B:66:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(rc.e r9, c40.q r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.e.a(rc.e, c40.q, boolean):void");
    }

    public final void A(String str) throws IOException {
        String strSubstring;
        int iF = StringsKt.F(str, ' ', 0, false, 6);
        if (iF == -1) {
            i4.a.k("unexpected journal line: ".concat(str));
            return;
        }
        int i11 = iF + 1;
        int iF2 = StringsKt.F(str, ' ', i11, false, 4);
        LinkedHashMap linkedHashMap = this.f37877f;
        if (iF2 == -1) {
            strSubstring = str.substring(i11);
            if (iF == 6 && y.p(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i11, iF2);
        }
        Object bVar = linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(this, strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        b bVar2 = (b) bVar;
        if (iF2 == -1 || iF != 5 || !y.p(str, "CLEAN", false)) {
            if (iF2 == -1 && iF == 5 && y.p(str, "DIRTY", false)) {
                bVar2.f37865g = new q(this, bVar2);
                return;
            } else {
                if (iF2 == -1 && iF == 4 && y.p(str, "READ", false)) {
                    return;
                }
                i4.a.k("unexpected journal line: ".concat(str));
                return;
            }
        }
        List listS = StringsKt.S(str.substring(iF2 + 1), new char[]{' '}, 6);
        bVar2.f37863e = true;
        bVar2.f37865g = null;
        if (listS.size() != 2) {
            i4.a.l(listS, "unexpected journal line: ");
            return;
        }
        try {
            int size = listS.size();
            for (int i12 = 0; i12 < size; i12++) {
                bVar2.f37860b[i12] = Long.parseLong((String) listS.get(i12));
            }
        } catch (NumberFormatException unused) {
            i4.a.l(listS, "unexpected journal line: ");
        }
    }

    public final void B(b bVar) {
        c0 c0Var;
        int i11 = bVar.f37866h;
        String str = bVar.f37859a;
        if (i11 > 0 && (c0Var = this.f37881j) != null) {
            c0Var.M("DIRTY");
            c0Var.writeByte(32);
            c0Var.M(str);
            c0Var.writeByte(10);
            c0Var.flush();
        }
        if (bVar.f37866h > 0 || bVar.f37865g != null) {
            bVar.f37864f = true;
            return;
        }
        for (int i12 = 0; i12 < 2; i12++) {
            this.f37886p.t((a0) bVar.f37861c.get(i12));
            long j9 = this.f37879h;
            long[] jArr = bVar.f37860b;
            this.f37879h = j9 - jArr[i12];
            jArr[i12] = 0;
        }
        this.f37880i++;
        c0 c0Var2 = this.f37881j;
        if (c0Var2 != null) {
            c0Var2.M("REMOVE");
            c0Var2.writeByte(32);
            c0Var2.M(str);
            c0Var2.writeByte(10);
        }
        this.f37877f.remove(str);
        if (this.f37880i >= 2000) {
            r();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        B(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f37879h
            long r2 = r4.f37873b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f37877f
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            rc.b r1 = (rc.b) r1
            boolean r2 = r1.f37864f
            if (r2 != 0) goto L12
            r4.B(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f37884n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.e.G():void");
    }

    public final synchronized void I() {
        Throwable th2;
        try {
            c0 c0Var = this.f37881j;
            if (c0Var != null) {
                c0Var.close();
            }
            c0 c0VarB = ia0.b.b(this.f37886p.I(this.f37875d, false));
            try {
                c0VarB.M("libcore.io.DiskLruCache");
                c0VarB.writeByte(10);
                c0VarB.M("1");
                c0VarB.writeByte(10);
                c0VarB.s0(1);
                c0VarB.writeByte(10);
                c0VarB.s0(2);
                c0VarB.writeByte(10);
                c0VarB.writeByte(10);
                for (b bVar : this.f37877f.values()) {
                    if (bVar.f37865g != null) {
                        c0VarB.M("DIRTY");
                        c0VarB.writeByte(32);
                        c0VarB.M(bVar.f37859a);
                        c0VarB.writeByte(10);
                    } else {
                        c0VarB.M("CLEAN");
                        c0VarB.writeByte(32);
                        c0VarB.M(bVar.f37859a);
                        for (long j9 : bVar.f37860b) {
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
            boolean zU = this.f37886p.u(this.f37874c);
            d dVar = this.f37886p;
            if (zU) {
                dVar.e(this.f37874c, this.f37876e);
                this.f37886p.e(this.f37875d, this.f37874c);
                this.f37886p.t(this.f37876e);
            } else {
                dVar.e(this.f37875d, this.f37874c);
            }
            d dVar2 = this.f37886p;
            a0 a0Var = this.f37874c;
            dVar2.getClass();
            a0Var.getClass();
            this.f37881j = new c0(new f(dVar2.a(a0Var), new z0(this, 22)));
            this.f37880i = 0;
            this.f37882k = false;
            this.f37885o = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.l && !this.f37883m) {
                for (b bVar : (b[]) this.f37877f.values().toArray(new b[0])) {
                    q qVar = bVar.f37865g;
                    if (qVar != null) {
                        b bVar2 = (b) qVar.f7093c;
                        if (Intrinsics.areEqual(bVar2.f37865g, qVar)) {
                            bVar2.f37864f = true;
                        }
                    }
                }
                G();
                f0.j(this.f37878g, null);
                c0 c0Var = this.f37881j;
                c0Var.getClass();
                c0Var.close();
                this.f37881j = null;
                this.f37883m = true;
                return;
            }
            this.f37883m = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized q e(String str) {
        if (this.f37883m) {
            throw new IllegalStateException("cache is closed");
        }
        H(str);
        p();
        b bVar = (b) this.f37877f.get(str);
        if ((bVar != null ? bVar.f37865g : null) != null) {
            return null;
        }
        if (bVar != null && bVar.f37866h != 0) {
            return null;
        }
        if (!this.f37884n && !this.f37885o) {
            c0 c0Var = this.f37881j;
            c0Var.getClass();
            c0Var.M("DIRTY");
            c0Var.writeByte(32);
            c0Var.M(str);
            c0Var.writeByte(10);
            c0Var.flush();
            if (this.f37882k) {
                return null;
            }
            if (bVar == null) {
                bVar = new b(this, str);
                this.f37877f.put(str, bVar);
            }
            q qVar = new q(this, bVar);
            bVar.f37865g = qVar;
            return qVar;
        }
        r();
        return null;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.l) {
            if (this.f37883m) {
                throw new IllegalStateException("cache is closed");
            }
            G();
            c0 c0Var = this.f37881j;
            c0Var.getClass();
            c0Var.flush();
        }
    }

    public final synchronized c g(String str) {
        c cVarA;
        if (this.f37883m) {
            throw new IllegalStateException("cache is closed");
        }
        H(str);
        p();
        b bVar = (b) this.f37877f.get(str);
        if (bVar != null && (cVarA = bVar.a()) != null) {
            boolean z11 = true;
            this.f37880i++;
            c0 c0Var = this.f37881j;
            c0Var.getClass();
            c0Var.M("READ");
            c0Var.writeByte(32);
            c0Var.M(str);
            c0Var.writeByte(10);
            if (this.f37880i < 2000) {
                z11 = false;
            }
            if (z11) {
                r();
            }
            return cVarA;
        }
        return null;
    }

    public final synchronized void p() {
        try {
            if (this.l) {
                return;
            }
            this.f37886p.t(this.f37875d);
            if (this.f37886p.u(this.f37876e)) {
                boolean zU = this.f37886p.u(this.f37874c);
                d dVar = this.f37886p;
                a0 a0Var = this.f37876e;
                if (zU) {
                    dVar.t(a0Var);
                } else {
                    dVar.e(a0Var, this.f37874c);
                }
            }
            if (this.f37886p.u(this.f37874c)) {
                try {
                    u();
                    t();
                    this.l = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        android.support.v4.media.session.a.n(this.f37886p, this.f37872a);
                        this.f37883m = false;
                        I();
                        this.l = true;
                    } catch (Throwable th2) {
                        this.f37883m = false;
                        throw th2;
                    }
                }
            }
            I();
            this.l = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void r() {
        f0.B(this.f37878g, null, null, new a3.y(this, (x70.c) null, 23), 3);
    }

    public final void t() {
        Iterator it = this.f37877f.values().iterator();
        long j9 = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i11 = 0;
            if (bVar.f37865g == null) {
                while (i11 < 2) {
                    j9 += bVar.f37860b[i11];
                    i11++;
                }
            } else {
                bVar.f37865g = null;
                while (i11 < 2) {
                    a0 a0Var = (a0) bVar.f37861c.get(i11);
                    d dVar = this.f37886p;
                    dVar.t(a0Var);
                    dVar.t((a0) bVar.f37862d.get(i11));
                    i11++;
                }
                it.remove();
            }
        }
        this.f37879h = j9;
    }

    public final void u() throws Throwable {
        d dVar = this.f37886p;
        a0 a0Var = this.f37874c;
        d0 d0VarC = ia0.b.c(dVar.J(a0Var));
        try {
            String strD = d0VarC.D(LongCompanionObject.MAX_VALUE);
            String strD2 = d0VarC.D(LongCompanionObject.MAX_VALUE);
            String strD3 = d0VarC.D(LongCompanionObject.MAX_VALUE);
            String strD4 = d0VarC.D(LongCompanionObject.MAX_VALUE);
            String strD5 = d0VarC.D(LongCompanionObject.MAX_VALUE);
            if (!Intrinsics.areEqual("libcore.io.DiskLruCache", strD) || !Intrinsics.areEqual("1", strD2) || !Intrinsics.areEqual(String.valueOf(1), strD3) || !Intrinsics.areEqual(String.valueOf(2), strD4) || strD5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strD + ", " + strD2 + ", " + strD3 + ", " + strD4 + ", " + strD5 + ']');
            }
            int i11 = 0;
            while (true) {
                try {
                    A(d0VarC.D(LongCompanionObject.MAX_VALUE));
                    i11++;
                } catch (EOFException unused) {
                    this.f37880i = i11 - this.f37877f.size();
                    if (d0VarC.a()) {
                        dVar.getClass();
                        a0Var.getClass();
                        this.f37881j = new c0(new f(dVar.a(a0Var), new z0(this, 22)));
                    } else {
                        I();
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
}

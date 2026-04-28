package jd;

import c40.q;
import ia0.a0;
import ia0.c0;
import ia0.d0;
import ia0.k;
import ia0.m;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.y;
import v80.f0;
import v80.p0;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements AutoCloseable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Regex f24965r = new Regex("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f24966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f24968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f24969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f24970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f24971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a90.d f24972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f24973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f24974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c0 f24976k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f24977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f24978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24979o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f24980p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f24981q;

    public e(m mVar, a0 a0Var, CoroutineContext coroutineContext, long j9) {
        this.f24966a = a0Var;
        this.f24967b = j9;
        if (j9 <= 0) {
            i4.a.f("maxSize <= 0");
            throw null;
        }
        this.f24968c = a0Var.f("journal");
        this.f24969d = a0Var.f("journal.tmp");
        this.f24970e = a0Var.f("journal.bkp");
        this.f24971f = new LinkedHashMap(0, 0.75f, true);
        CoroutineContext coroutineContextPlus = coroutineContext.plus(f0.d());
        x xVar = (x) coroutineContext.get(x.f42171a);
        if (xVar == null) {
            c90.f fVar = p0.f42144a;
            xVar = c90.e.f7834b;
        }
        this.f24972g = f0.b(coroutineContextPlus.plus(xVar.z0(1)));
        this.f24973h = new Object();
        this.f24981q = new d(mVar);
    }

    public static void H(String str) {
        if (f24965r.e(str)) {
            return;
        }
        i4.a.i(w.a0.p("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0111 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:16:0x0032, B:24:0x0040, B:27:0x005a, B:29:0x0069, B:31:0x0079, B:33:0x0080, B:28:0x005e, B:37:0x00a0, B:39:0x00a7, B:42:0x00ac, B:44:0x00bd, B:47:0x00c2, B:52:0x00fd, B:54:0x0108, B:58:0x0111, B:48:0x00da, B:50:0x00ef, B:51:0x00fa, B:36:0x0090, B:61:0x0116, B:62:0x011d), top: B:65:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(jd.e r10, c40.q r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.e.a(jd.e, c40.q, boolean):void");
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
        LinkedHashMap linkedHashMap = this.f24971f;
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
                bVar2.f24959g = new q(this, bVar2);
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
        bVar2.f24957e = true;
        bVar2.f24959g = null;
        if (listS.size() != 2) {
            i4.a.l(listS, "unexpected journal line: ");
            return;
        }
        try {
            int size = listS.size();
            for (int i12 = 0; i12 < size; i12++) {
                bVar2.f24954b[i12] = Long.parseLong((String) listS.get(i12));
            }
        } catch (NumberFormatException unused) {
            i4.a.l(listS, "unexpected journal line: ");
        }
    }

    public final void B(b bVar) {
        c0 c0Var;
        int i11 = bVar.f24960h;
        String str = bVar.f24953a;
        if (i11 > 0 && (c0Var = this.f24976k) != null) {
            c0Var.M("DIRTY");
            c0Var.writeByte(32);
            c0Var.M(str);
            c0Var.writeByte(10);
            c0Var.flush();
        }
        if (bVar.f24960h > 0 || bVar.f24959g != null) {
            bVar.f24958f = true;
            return;
        }
        for (int i12 = 0; i12 < 2; i12++) {
            this.f24981q.t((a0) bVar.f24955c.get(i12));
            long j9 = this.f24974i;
            long[] jArr = bVar.f24954b;
            this.f24974i = j9 - jArr[i12];
            jArr[i12] = 0;
        }
        this.f24975j++;
        c0 c0Var2 = this.f24976k;
        if (c0Var2 != null) {
            c0Var2.M("REMOVE");
            c0Var2.writeByte(32);
            c0Var2.M(str);
            c0Var2.writeByte(10);
            c0Var2.flush();
        }
        this.f24971f.remove(str);
        if (this.f24975j >= 2000) {
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
            long r0 = r4.f24974i
            long r2 = r4.f24967b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f24971f
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            jd.b r1 = (jd.b) r1
            boolean r2 = r1.f24958f
            if (r2 != 0) goto L12
            r4.B(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f24979o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.e.G():void");
    }

    public final void I() {
        Throwable th2;
        synchronized (this.f24973h) {
            try {
                c0 c0Var = this.f24976k;
                if (c0Var != null) {
                    c0Var.close();
                }
                c0 c0VarB = ia0.b.b(this.f24981q.I(this.f24969d, false));
                try {
                    c0VarB.M("libcore.io.DiskLruCache");
                    c0VarB.writeByte(10);
                    c0VarB.M("1");
                    c0VarB.writeByte(10);
                    c0VarB.s0(3);
                    c0VarB.writeByte(10);
                    c0VarB.s0(2);
                    c0VarB.writeByte(10);
                    c0VarB.writeByte(10);
                    for (b bVar : this.f24971f.values()) {
                        if (bVar.f24959g != null) {
                            c0VarB.M("DIRTY");
                            c0VarB.writeByte(32);
                            c0VarB.M(bVar.f24953a);
                            c0VarB.writeByte(10);
                        } else {
                            c0VarB.M("CLEAN");
                            c0VarB.writeByte(32);
                            c0VarB.M(bVar.f24953a);
                            for (long j9 : bVar.f24954b) {
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
                boolean zU = this.f24981q.u(this.f24968c);
                d dVar = this.f24981q;
                if (zU) {
                    dVar.e(this.f24968c, this.f24970e);
                    this.f24981q.e(this.f24969d, this.f24968c);
                    this.f24981q.t(this.f24970e);
                } else {
                    dVar.e(this.f24969d, this.f24968c);
                }
                d dVar2 = this.f24981q;
                a0 a0Var = this.f24968c;
                dVar2.getClass();
                a0Var.getClass();
                this.f24976k = new c0(new k(dVar2.a(a0Var), new a(this, 0)));
                this.f24975j = 0;
                this.l = false;
                this.f24980p = false;
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f24973h) {
            try {
                if (this.f24977m && !this.f24978n) {
                    for (b bVar : (b[]) this.f24971f.values().toArray(new b[0])) {
                        q qVar = bVar.f24959g;
                        if (qVar != null) {
                            b bVar2 = (b) qVar.f7093c;
                            if (Intrinsics.areEqual(bVar2.f24959g, qVar)) {
                                bVar2.f24958f = true;
                            }
                        }
                    }
                    G();
                    f0.j(this.f24972g, null);
                    c0 c0Var = this.f24976k;
                    c0Var.getClass();
                    c0Var.close();
                    this.f24976k = null;
                    this.f24978n = true;
                    return;
                }
                this.f24978n = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final q e(String str) {
        synchronized (this.f24973h) {
            if (this.f24978n) {
                throw new IllegalStateException("cache is closed");
            }
            H(str);
            p();
            b bVar = (b) this.f24971f.get(str);
            if ((bVar != null ? bVar.f24959g : null) != null) {
                return null;
            }
            if (bVar != null && bVar.f24960h != 0) {
                return null;
            }
            if (!this.f24979o && !this.f24980p) {
                c0 c0Var = this.f24976k;
                c0Var.getClass();
                c0Var.M("DIRTY");
                c0Var.writeByte(32);
                c0Var.M(str);
                c0Var.writeByte(10);
                c0Var.flush();
                if (this.l) {
                    return null;
                }
                if (bVar == null) {
                    bVar = new b(this, str);
                    this.f24971f.put(str, bVar);
                }
                q qVar = new q(this, bVar);
                bVar.f24959g = qVar;
                return qVar;
            }
            r();
            return null;
        }
    }

    public final c g(String str) {
        c cVarA;
        synchronized (this.f24973h) {
            if (this.f24978n) {
                throw new IllegalStateException("cache is closed");
            }
            H(str);
            p();
            b bVar = (b) this.f24971f.get(str);
            if (bVar != null && (cVarA = bVar.a()) != null) {
                boolean z11 = true;
                this.f24975j++;
                c0 c0Var = this.f24976k;
                c0Var.getClass();
                c0Var.M("READ");
                c0Var.writeByte(32);
                c0Var.M(str);
                c0Var.writeByte(10);
                c0Var.flush();
                if (this.f24975j < 2000) {
                    z11 = false;
                }
                if (z11) {
                    r();
                }
                return cVarA;
            }
            return null;
        }
    }

    public final void p() {
        synchronized (this.f24973h) {
            try {
                if (this.f24977m) {
                    return;
                }
                this.f24981q.t(this.f24969d);
                if (this.f24981q.u(this.f24970e)) {
                    boolean zU = this.f24981q.u(this.f24968c);
                    d dVar = this.f24981q;
                    a0 a0Var = this.f24970e;
                    if (zU) {
                        dVar.t(a0Var);
                    } else {
                        dVar.e(a0Var, this.f24968c);
                    }
                }
                if (this.f24981q.u(this.f24968c)) {
                    try {
                        u();
                        t();
                        this.f24977m = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            ba0.g.l(this.f24981q, this.f24966a);
                            this.f24978n = false;
                            I();
                            this.f24977m = true;
                        } catch (Throwable th2) {
                            this.f24978n = false;
                            throw th2;
                        }
                    }
                }
                I();
                this.f24977m = true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void r() {
        f0.B(this.f24972g, null, null, new a3.y(this, (x70.c) null, 15), 3);
    }

    public final void t() {
        Iterator it = this.f24971f.values().iterator();
        long j9 = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i11 = 0;
            if (bVar.f24959g == null) {
                while (i11 < 2) {
                    j9 += bVar.f24954b[i11];
                    i11++;
                }
            } else {
                bVar.f24959g = null;
                while (i11 < 2) {
                    a0 a0Var = (a0) bVar.f24955c.get(i11);
                    d dVar = this.f24981q;
                    dVar.t(a0Var);
                    dVar.t((a0) bVar.f24956d.get(i11));
                    i11++;
                }
                it.remove();
            }
        }
        this.f24974i = j9;
    }

    public final void u() throws Throwable {
        d dVar = this.f24981q;
        a0 a0Var = this.f24968c;
        d0 d0VarC = ia0.b.c(dVar.J(a0Var));
        try {
            String strD = d0VarC.D(LongCompanionObject.MAX_VALUE);
            String strD2 = d0VarC.D(LongCompanionObject.MAX_VALUE);
            String strD3 = d0VarC.D(LongCompanionObject.MAX_VALUE);
            String strD4 = d0VarC.D(LongCompanionObject.MAX_VALUE);
            String strD5 = d0VarC.D(LongCompanionObject.MAX_VALUE);
            if (!Intrinsics.areEqual("libcore.io.DiskLruCache", strD) || !Intrinsics.areEqual("1", strD2) || !Intrinsics.areEqual(String.valueOf(3), strD3) || !Intrinsics.areEqual(String.valueOf(2), strD4) || strD5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strD + ", " + strD2 + ", " + strD3 + ", " + strD4 + ", " + strD5 + "]");
            }
            int i11 = 0;
            while (true) {
                try {
                    A(d0VarC.D(LongCompanionObject.MAX_VALUE));
                    i11++;
                } catch (EOFException unused) {
                    this.f24975j = i11 - this.f24971f.size();
                    if (d0VarC.a()) {
                        dVar.getClass();
                        a0Var.getClass();
                        this.f24976k = new c0(new k(dVar.a(a0Var), new a(this, 0)));
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

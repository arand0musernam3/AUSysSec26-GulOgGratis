package m3;

import android.util.Log;
import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f29225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j30.g f29226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f29227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v80.i1 f29228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Throwable f29229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f29230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f29231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q1.u0 f29232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o3.e f29233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f29234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f29235k;
    public final q1.t0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k8.d f29236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q1.t0 f29237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q1.t0 f29238o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f29239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinkedHashSet f29240q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v80.l f29241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m1.a f29242s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f29243t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final y80.a2 f29244u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t5.a f29245v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v80.j1 f29246w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CoroutineContext f29247x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f29248y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final y80.a2 f29224z = y80.r.c(s3.b.f38818e);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public b2(CoroutineContext coroutineContext) {
        e eVar = new e(new y1(this, 0));
        this.f29225a = eVar;
        this.f29226b = new j30.g(new y1(this, 1));
        this.f29227c = new Object();
        this.f29230f = new ArrayList();
        this.f29232h = new q1.u0();
        this.f29233i = new o3.e(new g0[16], 0);
        this.f29234j = new ArrayList();
        this.f29235k = new ArrayList();
        this.l = new q1.t0();
        this.f29236m = new k8.d(13);
        this.f29237n = new q1.t0();
        this.f29238o = new q1.t0();
        this.f29244u = y80.r.c(z1.Inactive);
        this.f29245v = new t5.a(3);
        v80.j1 j1Var = new v80.j1((v80.i1) coroutineContext.get(v80.h1.f42106a));
        j1Var.J(new jd.a(this, 26));
        this.f29246w = j1Var;
        this.f29247x = coroutineContext.plus(eVar).plus(j1Var);
        this.f29248y = new f(9);
    }

    public static final void B(b2 b2Var, a1 a1Var, a1 a1Var2) {
        List list = a1Var2.f29205h;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                a1 a1Var3 = (a1) list.get(i11);
                k8.d dVar = b2Var.f29236m;
                y0 y0Var = a1Var3.f29198a;
                o3.a.a((q1.t0) dVar.f26134b, y0Var, new c1(a1Var3, a1Var));
                o3.a.a((q1.t0) dVar.f26135c, a1Var, y0Var);
                B(b2Var, a1Var, a1Var3);
            }
        }
    }

    public static final void K(ArrayList arrayList, b2 b2Var, g0 g0Var) {
        arrayList.clear();
        synchronized (b2Var.f29227c) {
            Iterator it = b2Var.f29235k.iterator();
            while (it.hasNext()) {
                a1 a1Var = (a1) it.next();
                if (Intrinsics.areEqual(a1Var.f29200c, g0Var)) {
                    arrayList.add(a1Var);
                    it.remove();
                }
            }
        }
    }

    public static void z(z3.c cVar) {
        try {
            if (cVar.w() instanceof z3.h) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            cVar.c();
        }
    }

    public final void A() {
        synchronized (this.f29227c) {
            if (((z1) this.f29244u.getValue()).compareTo(z1.Idle) >= 0) {
                this.f29244u.j(z1.ShuttingDown);
            }
        }
        this.f29246w.a(null);
    }

    public final v80.k C() throws DispatchException {
        z1 z1Var;
        y80.a2 a2Var = this.f29244u;
        int iCompareTo = ((z1) a2Var.getValue()).compareTo(z1.ShuttingDown);
        ArrayList arrayList = this.f29235k;
        ArrayList arrayList2 = this.f29234j;
        o3.e eVar = this.f29233i;
        if (iCompareTo > 0) {
            if (this.f29242s != null) {
                z1Var = z1.Inactive;
            } else if (this.f29228d == null) {
                this.f29232h = new q1.u0();
                eVar.g();
                z1Var = (D() || F()) ? z1.InactivePendingWork : z1.Inactive;
            } else {
                z1Var = (eVar.f31832c != 0 || this.f29232h.c() || !arrayList2.isEmpty() || !arrayList.isEmpty() || D() || F() || this.l.f()) ? z1.PendingWork : z1.Idle;
            }
            a2Var.j(z1Var);
            if (z1Var != z1.PendingWork) {
                return null;
            }
            v80.l lVar = this.f29241r;
            this.f29241r = null;
            return lVar;
        }
        List listH = H();
        int size = listH.size();
        for (int i11 = 0; i11 < size; i11++) {
        }
        this.f29230f.clear();
        this.f29231g = kotlin.collections.n0.f26529a;
        this.f29232h = new q1.u0();
        eVar.g();
        arrayList2.clear();
        arrayList.clear();
        this.f29239p = null;
        v80.l lVar2 = this.f29241r;
        if (lVar2 != null) {
            lVar2.j(null);
        }
        this.f29241r = null;
        this.f29242s = null;
        return null;
    }

    public final boolean D() {
        return !this.f29243t && (this.f29225a.f29265b.f40643c.get() & 134217727) > 0;
    }

    public final boolean E() {
        return this.f29233i.f31832c != 0 || D() || F() || this.l.f();
    }

    public final boolean F() {
        return !this.f29243t && (((u3.c) this.f29226b.f24503c).f40643c.get() & 134217727) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f29227c
            monitor-enter(r0)
            q1.u0 r1 = r2.f29232h     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            o3.e r1 = r2.f29233i     // Catch: java.lang.Throwable -> L21
            int r1 = r1.f31832c     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L12
            goto L23
        L12:
            boolean r1 = r2.D()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            boolean r1 = r2.F()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L1f
            goto L23
        L1f:
            r1 = 0
            goto L24
        L21:
            r1 = move-exception
            goto L26
        L23:
            r1 = 1
        L24:
            monitor-exit(r0)
            return r1
        L26:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.b2.G():boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List H() {
        ?? r02 = this.f29231g;
        if (r02 != 0) {
            return r02;
        }
        ArrayList arrayList = this.f29230f;
        List arrayList2 = arrayList.isEmpty() ? kotlin.collections.n0.f26529a : new ArrayList(arrayList);
        this.f29231g = arrayList2;
        return arrayList2;
    }

    public final void I() {
        v80.k kVarC;
        synchronized (this.f29227c) {
            kVarC = C();
            if (((z1) this.f29244u.getValue()).compareTo(z1.ShuttingDown) <= 0) {
                Throwable th2 = this.f29229e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th2);
                throw cancellationException;
            }
        }
        if (kVarC != null) {
            u70.o oVar = u70.q.f40850b;
            ((v80.l) kVarC).resumeWith(Unit.f26487a);
        }
    }

    public final void J(g0 g0Var) {
        synchronized (this.f29227c) {
            ArrayList arrayList = this.f29235k;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (Intrinsics.areEqual(((a1) arrayList.get(i11)).f29200c, g0Var)) {
                    ArrayList arrayList2 = new ArrayList();
                    K(arrayList2, this, g0Var);
                    while (!arrayList2.isEmpty()) {
                        L(arrayList2, null);
                        K(arrayList2, this, g0Var);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0152, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0157, code lost:
    
        if (r4 >= r3) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0161, code lost:
    
        if (((kotlin.Pair) r10.get(r4)).f26486b == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0163, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0166, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0174, code lost:
    
        if (r8 >= r4) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0176, code lost:
    
        r11 = (kotlin.Pair) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017e, code lost:
    
        if (r11.f26486b != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0180, code lost:
    
        r11 = (m3.a1) r11.f26485a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0187, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0188, code lost:
    
        if (r11 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018a, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018d, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0190, code lost:
    
        r4 = r16.f29227c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0192, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0193, code lost:
    
        kotlin.collections.i0.s(r3, r16.f29235k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0198, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0199, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a7, code lost:
    
        if (r8 >= r4) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a9, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b2, code lost:
    
        if (((kotlin.Pair) r11).f26486b == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b4, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b7, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ba, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List L(java.util.List r17, q1.u0 r18) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.b2.L(java.util.List, q1.u0):java.util.List");
    }

    public final g0 M(g0 g0Var, q1.u0 u0Var) {
        z3.c cVarC;
        a0 a0Var = (a0) g0Var;
        if (a0Var.f29195v.F || a0Var.f29196w == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.f29240q;
        if (linkedHashSet == null || !linkedHashSet.contains(g0Var)) {
            jd.a aVar = new jd.a(g0Var, 25);
            m2.c2 c2Var = new m2.c2(3, g0Var, u0Var);
            z3.g gVarJ = z3.l.j();
            z3.c cVar = gVarJ instanceof z3.c ? (z3.c) gVarJ : null;
            if (cVar == null || (cVarC = cVar.C(aVar, c2Var)) == null) {
                com.braze.h2.b("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                z3.g gVarJ2 = cVarC.j();
                if (u0Var != null) {
                    try {
                        if (u0Var.c()) {
                            lw.b bVar = new lw.b(29, u0Var, g0Var);
                            s sVar = ((a0) g0Var).f29195v;
                            if (sVar.F) {
                                v.a("Preparing a composition while composing is not supported");
                            }
                            sVar.F = true;
                            try {
                                bVar.invoke();
                                sVar.F = false;
                            } catch (Throwable th2) {
                                sVar.F = false;
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        z3.g.q(gVarJ2);
                        throw th3;
                    }
                }
                boolean z11 = a0Var.z();
                z3.g.q(gVarJ2);
                if (z11) {
                    return g0Var;
                }
            } finally {
                z(cVarC);
            }
        }
        return null;
    }

    public final void N(Throwable th2, g0 g0Var) throws Throwable {
        if (!((Boolean) A.get()).booleanValue() || (th2 instanceof ComposeRuntimeError)) {
            synchronized (this.f29227c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th2);
                m1.a aVar = this.f29242s;
                if (aVar != null) {
                    throw ((Throwable) aVar.f28697a);
                }
                this.f29242s = new m1.a(th2);
            }
            throw th2;
        }
        synchronized (this.f29227c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th2);
                this.f29234j.clear();
                this.f29233i.g();
                this.f29232h = new q1.u0();
                this.f29235k.clear();
                this.l.g();
                this.f29237n.g();
                this.f29242s = new m1.a(th2);
                if (g0Var != null) {
                    P(g0Var);
                }
                C();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean O() {
        boolean zE;
        synchronized (this.f29227c) {
            if (this.f29232h.b()) {
                return E();
            }
            List listH = H();
            o3.h hVar = new o3.h(this.f29232h);
            this.f29232h = new q1.u0();
            try {
                int size = listH.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((a0) ((g0) listH.get(i11))).A(hVar);
                    if (((z1) this.f29244u.getValue()).compareTo(z1.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.f29227c) {
                    if (C() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zE = E();
                }
                return zE;
            } catch (Throwable th2) {
                synchronized (this.f29227c) {
                    q1.u0 u0Var = this.f29232h;
                    u0Var.getClass();
                    Iterator<E> it = hVar.iterator();
                    while (it.hasNext()) {
                        u0Var.j(it.next());
                    }
                    throw th2;
                }
            }
        }
    }

    public final void P(g0 g0Var) {
        ArrayList arrayList = this.f29239p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f29239p = arrayList;
        }
        if (!arrayList.contains(g0Var)) {
            arrayList.add(g0Var);
        }
        if (this.f29230f.remove(g0Var)) {
            this.f29231g = null;
        }
    }

    @Override // m3.x
    public final void a(g0 g0Var, Function2 function2) throws Throwable {
        z1 z1Var;
        boolean zContains;
        z3.c cVarC;
        boolean z11 = ((a0) g0Var).f29195v.F;
        synchronized (this.f29227c) {
            z1 z1Var2 = (z1) this.f29244u.getValue();
            z1Var = z1.ShuttingDown;
            zContains = z1Var2.compareTo(z1Var) > 0 ? true ^ H().contains(g0Var) : true;
        }
        try {
            jd.a aVar = new jd.a(g0Var, 25);
            m2.c2 c2Var = new m2.c2(3, g0Var, (Object) null);
            z3.g gVarJ = z3.l.j();
            z3.c cVar = gVarJ instanceof z3.c ? (z3.c) gVarJ : null;
            if (cVar == null || (cVarC = cVar.C(aVar, c2Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                z3.g gVarJ2 = cVarC.j();
                try {
                    a0 a0Var = (a0) g0Var;
                    a0Var.m(function2);
                    synchronized (this.f29227c) {
                        if (((z1) this.f29244u.getValue()).compareTo(z1Var) > 0 && !H().contains(g0Var)) {
                            this.f29230f.add(g0Var);
                            this.f29231g = null;
                        }
                    }
                    if (!z11) {
                        z3.l.j().m();
                    }
                    try {
                        J(g0Var);
                        try {
                            a0Var.g();
                            a0Var.i();
                            if (z11) {
                                return;
                            }
                            z3.l.j().m();
                        } catch (Throwable th2) {
                            N(th2, null);
                        }
                    } catch (Throwable th3) {
                        N(th3, g0Var);
                    }
                } finally {
                    z3.g.q(gVarJ2);
                }
            } finally {
                z(cVarC);
            }
        } catch (Throwable th4) {
            if (zContains) {
                synchronized (this.f29227c) {
                }
            }
            N(th4, g0Var);
        }
    }

    @Override // m3.x
    public final q1.i1 b(g0 g0Var, wy.o oVar, Function2 function2) {
        t5.a aVar = this.f29245v;
        try {
            a0 a0Var = (a0) g0Var;
            wy.o oVar2 = a0Var.f29189p;
            a0Var.f29189p = oVar;
            try {
                a(g0Var, function2);
                q1.u0 u0Var = (q1.u0) aVar.j();
                if (u0Var == null) {
                    u0Var = q1.j1.f35777a;
                    u0Var.getClass();
                }
                return u0Var;
            } finally {
                ((a0) g0Var).f29189p = oVar2;
            }
        } finally {
            aVar.I(null);
        }
    }

    @Override // m3.x
    public final void c(a1 a1Var) {
        v80.k kVarC;
        synchronized (this.f29227c) {
            try {
                o3.a.a(this.l, a1Var.f29198a, a1Var);
                if (a1Var.f29205h != null) {
                    B(this, a1Var, a1Var);
                }
                kVarC = C();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (kVarC != null) {
            u70.o oVar = u70.q.f40850b;
            ((v80.l) kVarC).resumeWith(Unit.f26487a);
        }
    }

    @Override // m3.x
    public final boolean e() {
        return ((Boolean) A.get()).booleanValue();
    }

    @Override // m3.x
    public final boolean f() {
        return false;
    }

    @Override // m3.x
    public final boolean g() {
        return false;
    }

    @Override // m3.x
    public final long h() {
        return 1000;
    }

    @Override // m3.x
    public final w i() {
        return null;
    }

    @Override // m3.x
    public final CoroutineContext k() {
        return this.f29247x;
    }

    @Override // m3.x
    public final boolean l() {
        return false;
    }

    @Override // m3.x
    public final void m(a1 a1Var) {
        v80.k kVarC;
        synchronized (this.f29227c) {
            this.f29235k.add(a1Var);
            kVarC = C();
        }
        if (kVarC != null) {
            u70.o oVar = u70.q.f40850b;
            ((v80.l) kVarC).resumeWith(Unit.f26487a);
        }
    }

    @Override // m3.x
    public final void n(g0 g0Var) {
        v80.k kVarC;
        synchronized (this.f29227c) {
            if (this.f29233i.h(g0Var)) {
                kVarC = null;
            } else {
                this.f29233i.b(g0Var);
                kVarC = C();
            }
        }
        if (kVarC != null) {
            u70.o oVar = u70.q.f40850b;
            ((v80.l) kVarC).resumeWith(Unit.f26487a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    @Override // m3.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(m3.a1 r18, m3.z0 r19, m3.c r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.Object r3 = r1.f29227c
            monitor-enter(r3)
            q1.t0 r4 = r1.f29237n     // Catch: java.lang.Throwable -> L7e
            r4.m(r0, r2)     // Catch: java.lang.Throwable -> L7e
            q1.t0 r4 = r1.f29238o     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r4.d(r0)     // Catch: java.lang.Throwable -> L7e
            if (r0 != 0) goto L1c
            q1.o0 r0 = q1.c1.f35731b     // Catch: java.lang.Throwable -> L7e
            r0.getClass()     // Catch: java.lang.Throwable -> L7e
            goto L2f
        L1c:
            boolean r4 = r0 instanceof q1.o0     // Catch: java.lang.Throwable -> L7e
            if (r4 == 0) goto L23
            q1.b1 r0 = (q1.b1) r0     // Catch: java.lang.Throwable -> L7e
            goto L2f
        L23:
            java.lang.Object[] r4 = q1.c1.f35730a     // Catch: java.lang.Throwable -> L7e
            q1.o0 r4 = new q1.o0     // Catch: java.lang.Throwable -> L7e
            r5 = 1
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L7e
            r4.g(r0)     // Catch: java.lang.Throwable -> L7e
            r0 = r4
        L2f:
            boolean r4 = r0.e()     // Catch: java.lang.Throwable -> L7e
            if (r4 == 0) goto L8b
            r4 = r20
            q1.t0 r0 = r2.b(r4, r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.Object[] r2 = r0.f35753b     // Catch: java.lang.Throwable -> L7e
            java.lang.Object[] r4 = r0.f35754c     // Catch: java.lang.Throwable -> L7e
            long[] r0 = r0.f35752a     // Catch: java.lang.Throwable -> L7e
            int r5 = r0.length     // Catch: java.lang.Throwable -> L7e
            int r5 = r5 + (-2)
            if (r5 < 0) goto L8b
            r6 = 0
            r7 = r6
        L48:
            r8 = r0[r7]     // Catch: java.lang.Throwable -> L7e
            long r10 = ~r8     // Catch: java.lang.Throwable -> L7e
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L86
            int r10 = r7 - r5
            int r10 = ~r10     // Catch: java.lang.Throwable -> L7e
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L62:
            if (r12 >= r10) goto L84
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L80
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]     // Catch: java.lang.Throwable -> L7e
            r13 = r4[r13]     // Catch: java.lang.Throwable -> L7e
            m3.z0 r13 = (m3.z0) r13     // Catch: java.lang.Throwable -> L7e
            m3.a1 r14 = (m3.a1) r14     // Catch: java.lang.Throwable -> L7e
            q1.t0 r15 = r1.f29237n     // Catch: java.lang.Throwable -> L7e
            r15.m(r14, r13)     // Catch: java.lang.Throwable -> L7e
            goto L80
        L7e:
            r0 = move-exception
            goto L8d
        L80:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L62
        L84:
            if (r10 != r11) goto L8b
        L86:
            if (r7 == r5) goto L8b
            int r7 = r7 + 1
            goto L48
        L8b:
            monitor-exit(r3)
            return
        L8d:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.b2.o(m3.a1, m3.z0, m3.c):void");
    }

    @Override // m3.x
    public final z0 p(a1 a1Var) {
        z0 z0Var;
        synchronized (this.f29227c) {
            z0Var = (z0) this.f29237n.k(a1Var);
        }
        return z0Var;
    }

    @Override // m3.x
    public final q1.i1 q(g0 g0Var, wy.o oVar, q1.i1 i1Var) {
        t5.a aVar = this.f29245v;
        try {
            O();
            a0 a0Var = (a0) g0Var;
            a0Var.A(new o3.h(i1Var));
            wy.o oVar2 = a0Var.f29189p;
            a0Var.f29189p = oVar;
            try {
                g0 g0VarM = M(a0Var, null);
                if (g0VarM != null) {
                    J(a0Var);
                    a0 a0Var2 = (a0) g0VarM;
                    a0Var2.g();
                    a0Var2.i();
                }
                q1.u0 u0Var = (q1.u0) aVar.j();
                if (u0Var == null) {
                    u0Var = q1.j1.f35777a;
                    u0Var.getClass();
                }
                return u0Var;
            } finally {
                a0Var.f29189p = oVar2;
            }
        } finally {
            aVar.I(null);
        }
    }

    @Override // m3.x
    public final void t(w1 w1Var) {
        t5.a aVar = this.f29245v;
        q1.u0 u0Var = (q1.u0) aVar.j();
        if (u0Var == null) {
            q1.u0 u0Var2 = q1.j1.f35777a;
            u0Var = new q1.u0();
            aVar.I(u0Var);
        }
        u0Var.d(w1Var);
    }

    @Override // m3.x
    public final void u(a0 a0Var) {
        synchronized (this.f29227c) {
            try {
                LinkedHashSet linkedHashSet = this.f29240q;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f29240q = linkedHashSet;
                }
                linkedHashSet.add(a0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m3.x
    public final g v(defpackage.a aVar) {
        j30.g gVar = this.f29226b;
        u3.c cVar = (u3.c) gVar.f24503c;
        d1 d1Var = new d1();
        d1Var.f29261a = aVar;
        return cVar.a(d1Var, (lw.b) gVar.f24504d);
    }

    @Override // m3.x
    public final void y(a0 a0Var) {
        synchronized (this.f29227c) {
            if (this.f29230f.remove(a0Var)) {
                this.f29231g = null;
            }
            this.f29233i.j(a0Var);
            this.f29234j.remove(a0Var);
        }
    }

    @Override // m3.x
    public final void r(Set set) {
    }
}

package y80;

import com.braze.h2;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class m1 extends z80.a implements e1, i, z80.q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x80.a f45531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f45532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f45533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f45534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45535k;
    public int l;

    public m1(int i11, int i12, x80.a aVar) {
        this.f45529e = i11;
        this.f45530f = i12;
        this.f45531g = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        if (r8 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        if (r8.g() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        throw r8.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        r0.f45514j = r5;
        r0.f45515k = r2;
        r0.l = r9;
        r0.f45516m = r8;
        r0.f45519p = 3;
        r10 = r2.emit(r10, r0);
        r2 = r2;
        r5 = r5;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
    
        if (r10 != r1) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0078, B:34:0x0080, B:38:0x0093, B:41:0x009a, B:42:0x009e, B:43:0x009f, B:22:0x004a), top: B:52:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091 A[EDGE_INSN: B:56:0x0091->B:37:0x0091 BREAK  A[LOOP:0: B:32:0x0078->B:59:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [y80.j] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [z80.a] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [y80.m1] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [y80.j] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [z80.c] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [y80.n1] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [y80.n1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ad -> B:16:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static y70.a k(y80.m1 r8, y80.j r9, x70.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof y80.l1
            if (r0 == 0) goto L13
            r0 = r10
            y80.l1 r0 = (y80.l1) r0
            int r1 = r0.f45519p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45519p = r1
            goto L18
        L13:
            y80.l1 r0 = new y80.l1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f45517n
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f45519p
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5d
            r8 = 1
            if (r2 == r8) goto L4e
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3b
            v80.i1 r8 = r0.f45516m
            y80.n1 r9 = r0.l
            y80.j r2 = r0.f45515k
            y80.m1 r5 = r0.f45514j
            ba0.g.M(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L75
        L38:
            r8 = move-exception
            goto Lb3
        L3b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L42:
            v80.i1 r8 = r0.f45516m
            y80.n1 r9 = r0.l
            y80.j r2 = r0.f45515k
            y80.m1 r5 = r0.f45514j
            ba0.g.M(r10)     // Catch: java.lang.Throwable -> L38
            goto L78
        L4e:
            y80.n1 r9 = r0.l
            y80.j r8 = r0.f45515k
            y80.m1 r2 = r0.f45514j
            ba0.g.M(r10)     // Catch: java.lang.Throwable -> L5a
            r10 = r8
            r8 = r2
            goto L69
        L5a:
            r8 = move-exception
            r5 = r2
            goto Lb3
        L5d:
            ba0.g.M(r10)
            z80.c r10 = r8.b()
            y80.n1 r10 = (y80.n1) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L69:
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lb0
            v80.h1 r5 = v80.h1.f42106a     // Catch: java.lang.Throwable -> Lb0
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lb0
            v80.i1 r2 = (v80.i1) r2     // Catch: java.lang.Throwable -> Lb0
        L75:
            r5 = r8
            r8 = r2
            r2 = r10
        L78:
            java.lang.Object r10 = r5.s(r9)     // Catch: java.lang.Throwable -> L38
            a90.v r6 = y80.r.f45562c     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L91
            r0.f45514j = r5     // Catch: java.lang.Throwable -> L38
            r0.f45515k = r2     // Catch: java.lang.Throwable -> L38
            r0.l = r9     // Catch: java.lang.Throwable -> L38
            r0.f45516m = r8     // Catch: java.lang.Throwable -> L38
            r0.f45519p = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.g(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L78
            goto Laf
        L91:
            if (r8 == 0) goto L9f
            boolean r6 = r8.g()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9a
            goto L9f
        L9a:
            java.util.concurrent.CancellationException r8 = r8.A()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        L9f:
            r0.f45514j = r5     // Catch: java.lang.Throwable -> L38
            r0.f45515k = r2     // Catch: java.lang.Throwable -> L38
            r0.l = r9     // Catch: java.lang.Throwable -> L38
            r0.f45516m = r8     // Catch: java.lang.Throwable -> L38
            r0.f45519p = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
        Laf:
            return r1
        Lb0:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb3:
            r5.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.m1.k(y80.m1, y80.j, x70.c):y70.a");
    }

    @Override // z80.q
    public final i a(CoroutineContext coroutineContext, int i11, x80.a aVar) {
        return r.t(this, coroutineContext, i11, aVar);
    }

    @Override // z80.a
    public final z80.c c() {
        n1 n1Var = new n1();
        n1Var.f45541a = -1L;
        return n1Var;
    }

    @Override // y80.i
    public final Object collect(j jVar, x70.c cVar) {
        return k(this, jVar, cVar);
    }

    @Override // z80.a
    public final z80.c[] d() {
        return new n1[2];
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) throws Throwable {
        Throwable th2;
        x70.c[] cVarArrN;
        j1 j1Var;
        if (i(obj)) {
            return Unit.f26487a;
        }
        v80.l lVar = new v80.l(1, y70.f.b(cVar));
        lVar.t();
        x70.c[] cVarArrN2 = z80.b.f47356a;
        synchronized (this) {
            try {
                if (q(obj)) {
                    try {
                        u70.o oVar = u70.q.f40850b;
                        lVar.resumeWith(Unit.f26487a);
                        cVarArrN = n(cVarArrN2);
                        j1Var = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        j1 j1Var2 = new j1(this, o() + ((long) (this.f45535k + this.l)), obj, lVar);
                        m(j1Var2);
                        this.l++;
                        if (this.f45530f == 0) {
                            cVarArrN2 = n(cVarArrN2);
                        }
                        cVarArrN = cVarArrN2;
                        j1Var = j1Var2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (j1Var != null) {
                    lVar.w(new v80.i(j1Var, 2));
                }
                for (x70.c cVar2 : cVarArrN) {
                    if (cVar2 != null) {
                        u70.o oVar2 = u70.q.f40850b;
                        cVar2.resumeWith(Unit.f26487a);
                    }
                }
                Object objS = lVar.s();
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                if (objS != aVar) {
                    objS = Unit.f26487a;
                }
                return objS == aVar ? objS : Unit.f26487a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final Object g(n1 n1Var, l1 l1Var) {
        v80.l lVar = new v80.l(1, y70.f.b(l1Var));
        lVar.t();
        synchronized (this) {
            try {
                if (r(n1Var) < 0) {
                    n1Var.f45542b = lVar;
                } else {
                    u70.o oVar = u70.q.f40850b;
                    lVar.resumeWith(Unit.f26487a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objS = lVar.s();
        return objS == y70.a.COROUTINE_SUSPENDED ? objS : Unit.f26487a;
    }

    @Override // y80.e1
    public final void h() throws Throwable {
        synchronized (this) {
            try {
                try {
                    t(o() + ((long) this.f45535k), this.f45534j, o() + ((long) this.f45535k), o() + ((long) this.f45535k) + ((long) this.l));
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // y80.e1
    public final boolean i(Object obj) {
        int i11;
        boolean z11;
        x70.c[] cVarArrN = z80.b.f47356a;
        synchronized (this) {
            if (q(obj)) {
                cVarArrN = n(cVarArrN);
                z11 = true;
            } else {
                z11 = false;
            }
        }
        for (x70.c cVar : cVarArrN) {
            if (cVar != null) {
                u70.o oVar = u70.q.f40850b;
                cVar.resumeWith(Unit.f26487a);
            }
        }
        return z11;
    }

    public final void j() {
        if (this.f45530f != 0 || this.l > 1) {
            Object[] objArr = this.f45532h;
            objArr.getClass();
            while (this.l > 0) {
                long jO = o();
                int i11 = this.f45535k;
                int i12 = this.l;
                if (objArr[((int) ((jO + ((long) (i11 + i12))) - 1)) & (objArr.length - 1)] != r.f45562c) {
                    return;
                }
                this.l = i12 - 1;
                r.d(objArr, o() + ((long) (this.f45535k + this.l)), null);
            }
        }
    }

    public final void l() {
        z80.c[] cVarArr;
        Object[] objArr = this.f45532h;
        objArr.getClass();
        r.d(objArr, o(), null);
        this.f45535k--;
        long jO = o() + 1;
        if (this.f45533i < jO) {
            this.f45533i = jO;
        }
        if (this.f45534j < jO) {
            if (this.f47353b != 0 && (cVarArr = this.f47352a) != null) {
                for (z80.c cVar : cVarArr) {
                    if (cVar != null) {
                        n1 n1Var = (n1) cVar;
                        long j9 = n1Var.f45541a;
                        if (j9 >= 0 && j9 < jO) {
                            n1Var.f45541a = jO;
                        }
                    }
                }
            }
            this.f45534j = jO;
        }
    }

    public final void m(Object obj) {
        int i11 = this.f45535k + this.l;
        Object[] objArrP = this.f45532h;
        if (objArrP == null) {
            objArrP = p(null, 0, 2);
        } else if (i11 >= objArrP.length) {
            objArrP = p(objArrP, i11, objArrP.length * 2);
        }
        r.d(objArrP, o() + ((long) i11), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [x70.c[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final x70.c[] n(x70.c[] cVarArr) {
        z80.c[] cVarArr2;
        n1 n1Var;
        v80.l lVar;
        int length = cVarArr.length;
        if (this.f47353b != 0 && (cVarArr2 = this.f47352a) != null) {
            int length2 = cVarArr2.length;
            int i11 = 0;
            cVarArr = cVarArr;
            while (i11 < length2) {
                z80.c cVar = cVarArr2[i11];
                if (cVar != null && (lVar = (n1Var = (n1) cVar).f45542b) != null && r(n1Var) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        cVarArr = Arrays.copyOf((Object[]) cVarArr, Math.max(2, cVarArr.length * 2));
                    }
                    ((x70.c[]) cVarArr)[length] = lVar;
                    n1Var.f45542b = null;
                    length++;
                }
                i11++;
                cVarArr = cVarArr;
            }
        }
        return (x70.c[]) cVarArr;
    }

    public final long o() {
        return Math.min(this.f45534j, this.f45533i);
    }

    public final Object[] p(Object[] objArr, int i11, int i12) {
        if (i12 <= 0) {
            h2.b("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i12];
        this.f45532h = objArr2;
        if (objArr != null) {
            long jO = o();
            for (int i13 = 0; i13 < i11; i13++) {
                long j9 = ((long) i13) + jO;
                r.d(objArr2, j9, objArr[((int) j9) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.f47353b
            int r2 = r12.f45529e
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L83
        Lb:
            r12.m(r13)
            int r1 = r12.f45535k
            int r1 = r1 + r9
            r12.f45535k = r1
            if (r1 <= r2) goto L18
            r12.l()
        L18:
            long r1 = r12.o()
            int r3 = r12.f45535k
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.f45534j = r1
            return r9
        L23:
            int r1 = r12.f45535k
            int r3 = r12.f45530f
            if (r1 < r3) goto L4b
            long r4 = r12.f45534j
            long r6 = r12.f45533i
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L4b
            int[] r1 = y80.k1.$EnumSwitchMapping$0
            x80.a r4 = r12.f45531g
            int r4 = r4.ordinal()
            r1 = r1[r4]
            if (r1 == r9) goto L49
            r4 = 2
            if (r1 == r4) goto L83
            r4 = 3
            if (r1 != r4) goto L44
            goto L4b
        L44:
            e40.a.f()
            r1 = 0
            return r1
        L49:
            r1 = 0
            return r1
        L4b:
            r12.m(r13)
            int r1 = r12.f45535k
            int r1 = r1 + r9
            r12.f45535k = r1
            if (r1 <= r3) goto L58
            r12.l()
        L58:
            long r3 = r12.o()
            int r1 = r12.f45535k
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.f45533i
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L83
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.f45534j
            long r5 = r12.o()
            int r7 = r12.f45535k
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.o()
            int r10 = r12.f45535k
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.l
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.t(r1, r3, r5, r7)
        L83:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.m1.q(java.lang.Object):boolean");
    }

    public final long r(n1 n1Var) {
        long j9 = n1Var.f45541a;
        if (j9 < o() + ((long) this.f45535k)) {
            return j9;
        }
        if (this.f45530f <= 0 && j9 <= o() && this.l != 0) {
            return j9;
        }
        return -1L;
    }

    public final Object s(n1 n1Var) {
        Object obj;
        x70.c[] cVarArrU = z80.b.f47356a;
        synchronized (this) {
            try {
                long jR = r(n1Var);
                if (jR < 0) {
                    obj = r.f45562c;
                } else {
                    long j9 = n1Var.f45541a;
                    Object[] objArr = this.f45532h;
                    objArr.getClass();
                    Object obj2 = objArr[((int) jR) & (objArr.length - 1)];
                    if (obj2 instanceof j1) {
                        obj2 = ((j1) obj2).f45496c;
                    }
                    n1Var.f45541a = jR + 1;
                    Object obj3 = obj2;
                    cVarArrU = u(j9);
                    obj = obj3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (x70.c cVar : cVarArrU) {
            if (cVar != null) {
                u70.o oVar = u70.q.f40850b;
                cVar.resumeWith(Unit.f26487a);
            }
        }
        return obj;
    }

    public final void t(long j9, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j9);
        for (long jO = o(); jO < jMin; jO++) {
            Object[] objArr = this.f45532h;
            objArr.getClass();
            r.d(objArr, jO, null);
        }
        this.f45533i = j9;
        this.f45534j = j11;
        this.f45535k = (int) (j12 - jMin);
        this.l = (int) (j13 - j12);
    }

    public final x70.c[] u(long j9) {
        long j11;
        long j12;
        long j13;
        x70.c[] cVarArr;
        x70.c[] cVarArr2;
        z80.c[] cVarArr3;
        a90.v vVar = r.f45562c;
        x70.c[] cVarArr4 = z80.b.f47356a;
        if (j9 <= this.f45534j) {
            long jO = o();
            long j14 = ((long) this.f45535k) + jO;
            int i11 = this.f45530f;
            if (i11 == 0 && this.l > 0) {
                j14++;
            }
            int i12 = 0;
            if (this.f47353b != 0 && (cVarArr3 = this.f47352a) != null) {
                for (z80.c cVar : cVarArr3) {
                    if (cVar != null) {
                        long j15 = ((n1) cVar).f45541a;
                        if (j15 >= 0 && j15 < j14) {
                            j14 = j15;
                        }
                    }
                }
            }
            if (j14 > this.f45534j) {
                long jO2 = o() + ((long) this.f45535k);
                int i13 = this.f47353b;
                int iMin = this.l;
                if (i13 > 0) {
                    j11 = 1;
                    iMin = Math.min(iMin, i11 - ((int) (jO2 - j14)));
                } else {
                    j11 = 1;
                }
                long j16 = ((long) this.l) + jO2;
                if (iMin > 0) {
                    Object[] objArr = this.f45532h;
                    objArr.getClass();
                    j12 = jO;
                    x70.c[] cVarArr5 = new x70.c[iMin];
                    long j17 = jO2;
                    while (true) {
                        if (jO2 >= j16) {
                            cVarArr2 = cVarArr5;
                            j13 = j14;
                            break;
                        }
                        cVarArr2 = cVarArr5;
                        Object obj = objArr[((int) jO2) & (objArr.length - 1)];
                        if (obj != vVar) {
                            obj.getClass();
                            j1 j1Var = (j1) obj;
                            j13 = j14;
                            int i14 = i12 + 1;
                            cVarArr2[i12] = j1Var.f45497d;
                            r.d(objArr, jO2, vVar);
                            r.d(objArr, j17, j1Var.f45496c);
                            j17 += j11;
                            if (i14 >= iMin) {
                                break;
                            }
                            i12 = i14;
                        } else {
                            j13 = j14;
                        }
                        jO2 += j11;
                        cVarArr5 = cVarArr2;
                        j14 = j13;
                    }
                    jO2 = j17;
                    cVarArr = cVarArr2;
                } else {
                    j12 = jO;
                    j13 = j14;
                    cVarArr = cVarArr4;
                }
                int i15 = (int) (jO2 - j12);
                long j18 = this.f47353b == 0 ? jO2 : j13;
                long jMax = Math.max(this.f45533i, jO2 - ((long) Math.min(this.f45529e, i15)));
                if (i11 == 0 && jMax < j16) {
                    Object[] objArr2 = this.f45532h;
                    objArr2.getClass();
                    if (Intrinsics.areEqual(objArr2[((int) jMax) & (objArr2.length - 1)], vVar)) {
                        jO2 += j11;
                        jMax += j11;
                    }
                }
                t(jMax, j18, jO2, j16);
                j();
                return cVarArr.length == 0 ? cVarArr : n(cVarArr);
            }
        }
        return cVarArr4;
    }
}

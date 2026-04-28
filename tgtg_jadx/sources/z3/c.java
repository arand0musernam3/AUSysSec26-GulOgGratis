package z3;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m3.s1;
import q1.j1;
import q1.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class c extends g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f46977n = new int[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f46978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function1 f46979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f46980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u0 f46981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f46982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f46983j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f46984k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f46985m;

    public c(long j9, k kVar, Function1 function1, Function1 function12) {
        super(j9, kVar);
        this.f46978e = function1;
        this.f46979f = function12;
        this.f46983j = k.f47025e;
        this.f46984k = f46977n;
        this.l = 1;
    }

    public final void A(long j9) {
        synchronized (l.f47038c) {
            this.f46983j = this.f46983j.h(j9);
        }
    }

    public void B(u0 u0Var) {
        this.f46981h = u0Var;
    }

    public c C(Function1 function1, Function1 function12) throws Throwable {
        if (this.f47003c) {
            s1.a("Cannot use a disposed snapshot");
        }
        if (this.f46985m && this.f47004d < 0) {
            s1.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = l.f47038c;
        synchronized (obj) {
            try {
                long j9 = l.f47040e;
                long j11 = 1;
                l.f47040e = j9 + j11;
                l.f47039d = l.f47039d.h(j9);
                k kVarD = d();
                r(kVarD.h(j9));
                try {
                    d dVar = new d(j9, l.d(kVarD, g() + j11, j9), l.k(function1, e(), true), l.l(function12, i()), this);
                    if (this.f46985m || this.f47003c) {
                        return dVar;
                    }
                    long jG = g();
                    synchronized (obj) {
                        long j12 = l.f47040e;
                        l.f47040e = j12 + j11;
                        s(j12);
                        l.f47039d = l.f47039d.h(g());
                    }
                    r(l.d(d(), jG + j11, g()));
                    return dVar;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // z3.g
    public final void b() {
        l.f47039d = l.f47039d.d(g()).b(this.f46983j);
    }

    @Override // z3.g
    public void c() {
        if (this.f47003c) {
            return;
        }
        this.f47003c = true;
        synchronized (l.f47038c) {
            o();
        }
        l();
    }

    @Override // z3.g
    public boolean f() {
        return false;
    }

    @Override // z3.g
    public int h() {
        return this.f46980g;
    }

    @Override // z3.g
    public Function1 i() {
        return this.f46979f;
    }

    @Override // z3.g
    public void k() {
        this.l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // z3.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.l
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            m3.s1.a(r1)
        Lc:
            int r1 = r0.l
            int r1 = r1 + (-1)
            r0.l = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.f46985m
            if (r1 != 0) goto L94
            q1.u0 r1 = r0.x()
            if (r1 == 0) goto L91
            boolean r2 = r0.f46985m
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            m3.s1.b(r2)
        L27:
            r2 = 0
            r0.B(r2)
            long r2 = r0.g()
            java.lang.Object[] r4 = r1.f35769b
            long[] r1 = r1.f35768a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            z3.d0 r13 = (z3.d0) r13
            z3.f0 r13 = r13.b()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.f46999a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            z3.k r6 = r0.f46983j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = kotlin.collections.CollectionsKt.I(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            yj.m r6 = z3.l.f47036a
            r14 = 0
            r13.f46999a = r14
        L83:
            z3.f0 r13 = r13.f47000b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.a()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.c.l():void");
    }

    @Override // z3.g
    public void m() {
        if (this.f46985m || this.f47003c) {
            return;
        }
        v();
    }

    @Override // z3.g
    public void n(d0 d0Var) {
        u0 u0VarX = x();
        if (u0VarX == null) {
            u0 u0Var = j1.f35777a;
            u0VarX = new u0();
            B(u0VarX);
        }
        u0VarX.d(d0Var);
    }

    @Override // z3.g
    public final void p() {
        int length = this.f46984k.length;
        for (int i11 = 0; i11 < length; i11++) {
            l.u(this.f46984k[i11]);
        }
        o();
    }

    @Override // z3.g
    public void t(int i11) {
        this.f46980g = i11;
    }

    @Override // z3.g
    public g u(Function1 function1) throws Throwable {
        if (this.f47003c) {
            s1.a("Cannot use a disposed snapshot");
        }
        if (this.f46985m && this.f47004d < 0) {
            s1.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = l.f47038c;
        synchronized (obj) {
            try {
                long j9 = l.f47040e;
                long j11 = 1;
                l.f47040e = j9 + j11;
                l.f47039d = l.f47039d.h(j9);
                try {
                    e eVar = new e(j9, l.d(d(), jG + j11, j9), l.k(function1, e(), true), this);
                    if (this.f46985m || this.f47003c) {
                        return eVar;
                    }
                    long jG2 = g();
                    synchronized (obj) {
                        long j12 = l.f47040e;
                        l.f47040e = j12 + j11;
                        s(j12);
                        l.f47039d = l.f47039d.h(g());
                    }
                    r(l.d(d(), jG2 + j11, g()));
                    return eVar;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void v() {
        long j9;
        A(g());
        if (this.f46985m || this.f47003c) {
            return;
        }
        long jG = g();
        synchronized (l.f47038c) {
            long j11 = l.f47040e;
            j9 = 1;
            l.f47040e = j11 + j9;
            s(j11);
            l.f47039d = l.f47039d.h(g());
        }
        r(l.d(d(), jG + j9, g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z3.v w() {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.c.w():z3.v");
    }

    public u0 x() {
        return this.f46981h;
    }

    @Override // z3.g
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Function1 e() {
        return this.f46978e;
    }

    public final v z(long j9, u0 u0Var, HashMap map, k kVar) {
        ArrayList arrayList;
        ArrayList arrayListD0;
        ArrayList arrayList2;
        k kVar2;
        Object[] objArr;
        long[] jArr;
        k kVar3;
        Object[] objArr2;
        long[] jArr2;
        int i11;
        long j11;
        ArrayList arrayList3;
        f0 f0VarD;
        k kVarG = d().h(g()).g(this.f46983j);
        Object[] objArr3 = u0Var.f35769b;
        long[] jArr3 = u0Var.f35768a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i12 = 0;
            arrayList2 = null;
            arrayListD0 = null;
            while (true) {
                long j12 = jArr3[i12];
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j12 & 255) < 128) {
                            objArr2 = objArr3;
                            d0 d0Var = (d0) objArr3[(i12 << 3) + i14];
                            jArr2 = jArr3;
                            f0 f0VarB = d0Var.b();
                            i11 = i14;
                            ArrayList arrayList4 = arrayList2;
                            f0 f0VarS = l.s(f0VarB, j9, kVar);
                            if (f0VarS == null) {
                                kVar3 = kVarG;
                                arrayList3 = arrayListD0;
                                j11 = j12;
                            } else {
                                arrayList3 = arrayListD0;
                                j11 = j12;
                                f0 f0VarS2 = l.s(f0VarB, g(), kVarG);
                                if (f0VarS2 == null) {
                                    kVar3 = kVarG;
                                } else {
                                    kVar3 = kVarG;
                                    if (f0VarS2.f46999a != 1 && !Intrinsics.areEqual(f0VarS, f0VarS2)) {
                                        f0 f0VarS3 = l.s(f0VarB, g(), d());
                                        if (f0VarS3 == null) {
                                            l.r();
                                            throw null;
                                        }
                                        if (map == null || (f0VarD = (f0) map.get(f0VarS)) == null) {
                                            f0VarD = d0Var.d(f0VarS2, f0VarS, f0VarS3);
                                        }
                                        if (f0VarD == null) {
                                            return new h(this);
                                        }
                                        if (!Intrinsics.areEqual(f0VarD, f0VarS3)) {
                                            if (Intrinsics.areEqual(f0VarD, f0VarS)) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList5.add(new Pair(d0Var, f0VarS.c(g())));
                                                arrayListD0 = arrayList3 == null ? new ArrayList() : arrayList3;
                                                arrayListD0.add(d0Var);
                                                arrayList2 = arrayList5;
                                            } else {
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(!Intrinsics.areEqual(f0VarD, f0VarS2) ? new Pair(d0Var, f0VarD) : new Pair(d0Var, f0VarS2.c(g())));
                                            }
                                        }
                                        arrayListD0 = arrayList3;
                                    }
                                }
                            }
                            arrayList2 = arrayList4;
                            arrayListD0 = arrayList3;
                        } else {
                            kVar3 = kVarG;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i11 = i14;
                            j11 = j12;
                        }
                        j12 = j11 >> 8;
                        i14 = i11 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        kVarG = kVar3;
                    }
                    kVar2 = kVarG;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i13 != 8) {
                        break;
                    }
                } else {
                    kVar2 = kVarG;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i12 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i12++;
                jArr3 = jArr;
                objArr3 = objArr;
                kVarG = kVar2;
            }
        } else {
            arrayList = null;
            arrayListD0 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i15 = 0; i15 < size; i15++) {
                Pair pair = (Pair) arrayList2.get(i15);
                d0 d0Var2 = (d0) pair.f26485a;
                f0 f0Var = (f0) pair.f26486b;
                f0Var.f46999a = j9;
                synchronized (l.f47038c) {
                    f0Var.f47000b = d0Var2.b();
                    d0Var2.e(f0Var);
                }
            }
        }
        if (arrayListD0 != null) {
            int size2 = arrayListD0.size();
            for (int i16 = 0; i16 < size2; i16++) {
                u0Var.l((d0) arrayListD0.get(i16));
            }
            ArrayList arrayList6 = this.f46982i;
            if (arrayList6 != null) {
                arrayListD0 = CollectionsKt.d0(arrayListD0, arrayList6);
            }
            this.f46982i = arrayListD0;
        }
        return i.f47013b;
    }
}

package z3;

import java.util.HashMap;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q1.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yj.m f47036a = new yj.m(13);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t5.a f47037b = new t5.a(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f47038c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static k f47039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f47040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ax.h f47041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a3.j f47042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Object f47043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Object f47044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f47045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final u3.a f47046k;

    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[], java.io.Serializable] */
    static {
        k kVar = k.f47025e;
        f47039d = kVar;
        long j9 = 1;
        f47040e = j9 + j9;
        ax.h hVar = new ax.h();
        hVar.f4910a = new long[16];
        hVar.f4914e = new int[16];
        ?? r52 = new int[16];
        int i11 = 0;
        while (i11 < 16) {
            int i12 = i11 + 1;
            r52[i11] = i12;
            i11 = i12;
        }
        hVar.f4913d = r52;
        f47041f = hVar;
        a3.j jVar = new a3.j(15, (char) 0);
        jVar.f399c = new int[16];
        jVar.f400d = new u3.l[16];
        f47042g = jVar;
        n0 n0Var = n0.f26529a;
        f47043h = n0Var;
        f47044i = n0Var;
        long j11 = f47040e;
        f47040e = j9 + j11;
        b bVar = new b(j11, kVar, null, new yj.m(12));
        f47039d = f47039d.h(bVar.f47002b);
        f47045j = bVar;
        f47046k = new u3.a(0);
    }

    public static final void a() {
        e(f47036a);
    }

    public static final HashMap b(long j9, c cVar, k kVar) {
        long[] jArr;
        k kVar2;
        long[] jArr2;
        k kVar3;
        int i11;
        int i12;
        f0 f0VarS;
        u0 u0VarX = cVar.x();
        if (u0VarX != null) {
            long jG = cVar.g();
            k kVarG = cVar.d().h(jG).g(cVar.f46983j);
            Object[] objArr = u0VarX.f35769b;
            long[] jArr3 = u0VarX.f35768a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i13 = 0;
                HashMap map = null;
                while (true) {
                    long j11 = jArr3[i13];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8;
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j11 & 255) < 128) {
                                d0 d0Var = (d0) objArr[(i13 << 3) + i16];
                                f0 f0VarB = d0Var.b();
                                jArr2 = jArr3;
                                i11 = i14;
                                i12 = i16;
                                f0 f0VarS2 = s(f0VarB, j9, kVar);
                                if (f0VarS2 == null || (f0VarS = s(f0VarB, jG, kVarG)) == null || Intrinsics.areEqual(f0VarS2, f0VarS)) {
                                    kVar3 = kVarG;
                                } else {
                                    kVar3 = kVarG;
                                    f0 f0VarS3 = s(f0VarB, jG, cVar.d());
                                    if (f0VarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    f0 f0VarD = d0Var.d(f0VarS, f0VarS2, f0VarS3);
                                    if (f0VarD == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(f0VarS2, f0VarD);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                kVar3 = kVarG;
                                i11 = i14;
                                i12 = i16;
                            }
                            j11 >>= i11;
                            i16 = i12 + 1;
                            i14 = i11;
                            jArr3 = jArr2;
                            kVarG = kVar3;
                        }
                        jArr = jArr3;
                        kVar2 = kVarG;
                        if (i15 != i14) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        kVar2 = kVarG;
                    }
                    if (i13 == length) {
                        return map;
                    }
                    i13++;
                    jArr3 = jArr;
                    kVarG = kVar2;
                }
            }
        }
        return null;
    }

    public static final void c(g gVar) {
        long j9;
        if (f47039d.e(gVar.g())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: snapshotId=");
        sb2.append(gVar.g());
        sb2.append(", disposed=");
        sb2.append(gVar.f47003c);
        sb2.append(", applied=");
        c cVar = gVar instanceof c ? (c) gVar : null;
        sb2.append(cVar != null ? Boolean.valueOf(cVar.f46985m) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (f47038c) {
            ax.h hVar = f47041f;
            j9 = hVar.f4911b > 0 ? ((long[]) hVar.f4910a)[0] : -1L;
        }
        sb2.append(j9);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final k d(k kVar, long j9, long j11) {
        while (Intrinsics.compare(j9, j11) < 0) {
            kVar = kVar.h(j9);
            j9 += (long) 1;
        }
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(kotlin.jvm.functions.Function1 r15) {
        /*
            z3.b r0 = z3.l.f47045j
            java.lang.Object r1 = z3.l.f47038c
            monitor-enter(r1)
            q1.u0 r2 = r0.f46981h     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            u3.a r3 = z3.l.f47046k     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L97
        L13:
            java.lang.Object r15 = v(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L44
            r3 = -1
            java.lang.Object r4 = z3.l.f47043h     // Catch: java.lang.Throwable -> L36
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L36
            r6 = r1
        L23:
            if (r6 >= r5) goto L38
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L36
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7     // Catch: java.lang.Throwable -> L36
            o3.h r8 = new o3.h     // Catch: java.lang.Throwable -> L36
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L36
            r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L36
            int r6 = r6 + 1
            goto L23
        L36:
            r15 = move-exception
            goto L3e
        L38:
            u3.a r0 = z3.l.f47046k
            r0.addAndGet(r3)
            goto L44
        L3e:
            u3.a r0 = z3.l.f47046k
            r0.addAndGet(r3)
            throw r15
        L44:
            java.lang.Object r0 = z3.l.f47038c
            monitor-enter(r0)
            f()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L93
            java.lang.Object[] r3 = r2.f35769b     // Catch: java.lang.Throwable -> L86
            long[] r2 = r2.f35768a     // Catch: java.lang.Throwable -> L86
            int r4 = r2.length     // Catch: java.lang.Throwable -> L86
            int r4 = r4 + (-2)
            if (r4 < 0) goto L93
            r5 = r1
        L56:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L86
            long r8 = ~r6     // Catch: java.lang.Throwable -> L86
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8e
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L86
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L70:
            if (r10 >= r8) goto L8c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L88
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L86
            z3.d0 r11 = (z3.d0) r11     // Catch: java.lang.Throwable -> L86
            q(r11)     // Catch: java.lang.Throwable -> L86
            goto L88
        L86:
            r15 = move-exception
            goto L95
        L88:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L70
        L8c:
            if (r8 != r9) goto L93
        L8e:
            if (r5 == r4) goto L93
            int r5 = r5 + 1
            goto L56
        L93:
            monitor-exit(r0)
            return r15
        L95:
            monitor-exit(r0)
            throw r15
        L97:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.l.e(kotlin.jvm.functions.Function1):java.lang.Object");
    }

    public static final void f() {
        a3.j jVar = f47042g;
        int i11 = jVar.f398b;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            u3.l lVar = ((u3.l[]) jVar.f400d)[i12];
            Object obj = lVar != null ? lVar.get() : null;
            if (obj != null && p((d0) obj)) {
                if (i13 != i12) {
                    ((u3.l[]) jVar.f400d)[i13] = lVar;
                    int[] iArr = (int[]) jVar.f399c;
                    iArr[i13] = iArr[i12];
                }
                i13++;
            }
            i12++;
        }
        for (int i14 = i13; i14 < i11; i14++) {
            ((u3.l[]) jVar.f400d)[i14] = null;
            ((int[]) jVar.f399c)[i14] = 0;
        }
        if (i13 != i11) {
            jVar.f398b = i13;
        }
    }

    public static final g g(g gVar, Function1 function1, boolean z11) {
        boolean z12 = gVar instanceof c;
        if (z12 || gVar == null) {
            return new k0(z12 ? (c) gVar : null, function1, null, false, z11);
        }
        return new l0(gVar, function1, false, z11);
    }

    public static final f0 h(f0 f0Var) {
        f0 f0VarS;
        g gVarJ = j();
        f0 f0VarS2 = s(f0Var, gVarJ.g(), gVarJ.d());
        if (f0VarS2 != null) {
            return f0VarS2;
        }
        synchronized (f47038c) {
            g gVarJ2 = j();
            f0VarS = s(f0Var, gVarJ2.g(), gVarJ2.d());
        }
        if (f0VarS != null) {
            return f0VarS;
        }
        r();
        throw null;
    }

    public static final f0 i(f0 f0Var, g gVar) {
        f0 f0VarS;
        f0 f0VarS2 = s(f0Var, gVar.g(), gVar.d());
        if (f0VarS2 != null) {
            return f0VarS2;
        }
        synchronized (f47038c) {
            f0VarS = s(f0Var, gVar.g(), gVar.d());
        }
        if (f0VarS != null) {
            return f0VarS;
        }
        r();
        throw null;
    }

    public static final g j() {
        g gVar = (g) f47037b.j();
        return gVar == null ? f47045j : gVar;
    }

    public static final Function1 k(Function1 function1, Function1 function12, boolean z11) {
        if (!z11) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new pm.p(function1, function12, 2);
    }

    public static final Function1 l(Function1 function1, Function1 function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new pm.p(function1, function12, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final z3.f0 m(z3.f0 r10, z3.d0 r11) {
        /*
            z3.f0 r0 = r11.b()
            long r1 = z3.l.f47040e
            ax.h r3 = z3.l.f47041f
            int r4 = r3.f4911b
            if (r4 <= 0) goto L14
            java.io.Serializable r1 = r3.f4910a
            long[] r1 = (long[]) r1
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L14:
            r3 = 1
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L19:
            if (r0 == 0) goto L4b
            long r5 = r0.f46999a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L24
            goto L44
        L24:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            int r7 = kotlin.jvm.internal.Intrinsics.compare(r5, r1)
            if (r7 > 0) goto L48
            z3.k r7 = z3.k.f47025e
            boolean r5 = r7.e(r5)
            if (r5 != 0) goto L48
            if (r4 != 0) goto L3a
            r4 = r0
            goto L48
        L3a:
            long r1 = r0.f46999a
            long r5 = r4.f46999a
            int r1 = kotlin.jvm.internal.Intrinsics.compare(r1, r5)
            if (r1 >= 0) goto L46
        L44:
            r3 = r0
            goto L4b
        L46:
            r3 = r4
            goto L4b
        L48:
            z3.f0 r0 = r0.f47000b
            goto L19
        L4b:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L55
            r3.f46999a = r0
            return r3
        L55:
            z3.f0 r10 = r10.c(r0)
            z3.f0 r0 = r11.b()
            r10.f47000b = r0
            r11.e(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.l.m(z3.f0, z3.d0):z3.f0");
    }

    public static final void n(g gVar, d0 d0Var) {
        gVar.t(gVar.h() + 1);
        Function1 function1I = gVar.i();
        if (function1I != null) {
            function1I.invoke(d0Var);
        }
    }

    public static final f0 o(f0 f0Var, e0 e0Var, g gVar, f0 f0Var2) {
        f0 f0VarM;
        if (gVar.f()) {
            gVar.n(e0Var);
        }
        long jG = gVar.g();
        if (f0Var2.f46999a == jG) {
            return f0Var2;
        }
        synchronized (f47038c) {
            f0VarM = m(f0Var, e0Var);
        }
        f0VarM.f46999a = jG;
        if (f0Var2.f46999a != 1) {
            gVar.n(e0Var);
        }
        return f0VarM;
    }

    public static final boolean p(d0 d0Var) {
        f0 f0Var;
        long j9 = f47040e;
        ax.h hVar = f47041f;
        if (hVar.f4911b > 0) {
            j9 = ((long[]) hVar.f4910a)[0];
        }
        f0 f0Var2 = null;
        f0 f0VarB = null;
        int i11 = 0;
        for (f0 f0VarB2 = d0Var.b(); f0VarB2 != null; f0VarB2 = f0VarB2.f47000b) {
            long j11 = f0VarB2.f46999a;
            if (j11 != 0) {
                if (Intrinsics.compare(j11, j9) >= 0) {
                    i11++;
                } else if (f0Var2 == null) {
                    i11++;
                    f0Var2 = f0VarB2;
                } else {
                    if (Intrinsics.compare(f0VarB2.f46999a, f0Var2.f46999a) < 0) {
                        f0Var = f0Var2;
                        f0Var2 = f0VarB2;
                    } else {
                        f0Var = f0VarB2;
                    }
                    if (f0VarB == null) {
                        f0VarB = d0Var.b();
                        f0 f0Var3 = f0VarB;
                        while (true) {
                            if (f0VarB == null) {
                                f0VarB = f0Var3;
                                break;
                            }
                            if (Intrinsics.compare(f0VarB.f46999a, j9) >= 0) {
                                break;
                            }
                            if (Intrinsics.compare(f0Var3.f46999a, f0VarB.f46999a) < 0) {
                                f0Var3 = f0VarB;
                            }
                            f0VarB = f0VarB.f47000b;
                        }
                    }
                    f0Var2.f46999a = 0L;
                    f0Var2.a(f0VarB);
                    f0Var2 = f0Var;
                }
            }
        }
        return i11 > 1;
    }

    public static final void q(d0 d0Var) {
        if (p(d0Var)) {
            a3.j jVar = f47042g;
            int i11 = jVar.f398b;
            int iIdentityHashCode = System.identityHashCode(d0Var);
            int i12 = -1;
            if (i11 > 0) {
                int i13 = jVar.f398b - 1;
                int i14 = 0;
                while (true) {
                    if (i14 > i13) {
                        i12 = -(i14 + 1);
                        break;
                    }
                    int i15 = (i14 + i13) >>> 1;
                    int i16 = ((int[]) jVar.f399c)[i15];
                    if (i16 < iIdentityHashCode) {
                        i14 = i15 + 1;
                    } else if (i16 > iIdentityHashCode) {
                        i13 = i15 - 1;
                    } else {
                        u3.l lVar = ((u3.l[]) jVar.f400d)[i15];
                        if (d0Var == (lVar != null ? lVar.get() : null)) {
                            i12 = i15;
                        } else {
                            for (int i17 = i15 - 1; -1 < i17 && ((int[]) jVar.f399c)[i17] == iIdentityHashCode; i17--) {
                                u3.l lVar2 = ((u3.l[]) jVar.f400d)[i17];
                                if ((lVar2 != null ? lVar2.get() : null) == d0Var) {
                                    i12 = i17;
                                    break;
                                }
                            }
                            i15++;
                            int i18 = jVar.f398b;
                            while (true) {
                                if (i15 >= i18) {
                                    i12 = -(jVar.f398b + 1);
                                    break;
                                } else {
                                    if (((int[]) jVar.f399c)[i15] != iIdentityHashCode) {
                                        i12 = -(i15 + 1);
                                        break;
                                    }
                                    u3.l lVar3 = ((u3.l[]) jVar.f400d)[i15];
                                    if ((lVar3 != null ? lVar3.get() : null) == d0Var) {
                                        break;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                            i12 = i15;
                        }
                    }
                }
                if (i12 >= 0) {
                    return;
                }
            }
            int i19 = -(i12 + 1);
            u3.l[] lVarArr = (u3.l[]) jVar.f400d;
            int length = lVarArr.length;
            if (i11 == length) {
                int i21 = length * 2;
                u3.l[] lVarArr2 = new u3.l[i21];
                int[] iArr = new int[i21];
                int i22 = i19 + 1;
                System.arraycopy(lVarArr, i19, lVarArr2, i22, i11 - i19);
                System.arraycopy((u3.l[]) jVar.f400d, 0, lVarArr2, 0, i19);
                kotlin.collections.x.f(i22, (int[]) jVar.f399c, i19, i11, iArr);
                kotlin.collections.x.j(0, (int[]) jVar.f399c, i19, 6, iArr);
                jVar.f400d = lVarArr2;
                jVar.f399c = iArr;
            } else {
                int i23 = i19 + 1;
                System.arraycopy(lVarArr, i19, lVarArr, i23, i11 - i19);
                int[] iArr2 = (int[]) jVar.f399c;
                kotlin.collections.x.f(i23, iArr2, i19, i11, iArr2);
            }
            ((u3.l[]) jVar.f400d)[i19] = new u3.l(d0Var);
            ((int[]) jVar.f399c)[i19] = iIdentityHashCode;
            jVar.f398b++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final f0 s(f0 f0Var, long j9, k kVar) {
        f0 f0Var2 = null;
        while (f0Var != null) {
            long j11 = f0Var.f46999a;
            if (j11 != 0 && Intrinsics.compare(j11, j9) <= 0 && !kVar.e(j11) && (f0Var2 == null || Intrinsics.compare(f0Var2.f46999a, f0Var.f46999a) < 0)) {
                f0Var2 = f0Var;
            }
            f0Var = f0Var.f47000b;
        }
        if (f0Var2 != null) {
            return f0Var2;
        }
        return null;
    }

    public static final f0 t(f0 f0Var, d0 d0Var) {
        f0 f0VarS;
        g gVarJ = j();
        Function1 function1E = gVarJ.e();
        if (function1E != null) {
            function1E.invoke(d0Var);
        }
        f0 f0VarS2 = s(f0Var, gVarJ.g(), gVarJ.d());
        if (f0VarS2 != null) {
            return f0VarS2;
        }
        synchronized (f47038c) {
            g gVarJ2 = j();
            f0 f0VarB = d0Var.b();
            f0VarB.getClass();
            f0VarS = s(f0VarB, gVarJ2.g(), gVarJ2.d());
            if (f0VarS == null) {
                r();
                throw null;
            }
        }
        return f0VarS;
    }

    public static final void u(int i11) {
        ax.h hVar = f47041f;
        int i12 = ((int[]) hVar.f4913d)[i11];
        hVar.d(i12, hVar.f4911b - 1);
        hVar.f4911b--;
        long[] jArr = (long[]) hVar.f4910a;
        long j9 = jArr[i12];
        int i13 = i12;
        while (i13 > 0) {
            int i14 = ((i13 + 1) >> 1) - 1;
            if (Intrinsics.compare(jArr[i14], j9) <= 0) {
                break;
            }
            hVar.d(i14, i13);
            i13 = i14;
        }
        long[] jArr2 = (long[]) hVar.f4910a;
        int i15 = hVar.f4911b >> 1;
        while (i12 < i15) {
            int i16 = (i12 + 1) << 1;
            int i17 = i16 - 1;
            if (i16 < hVar.f4911b && Intrinsics.compare(jArr2[i16], jArr2[i17]) < 0) {
                if (Intrinsics.compare(jArr2[i16], jArr2[i12]) >= 0) {
                    break;
                }
                hVar.d(i16, i12);
                i12 = i16;
            } else {
                if (Intrinsics.compare(jArr2[i17], jArr2[i12]) >= 0) {
                    break;
                }
                hVar.d(i17, i12);
                i12 = i17;
            }
        }
        ((int[]) hVar.f4913d)[i11] = hVar.f4912c;
        hVar.f4912c = i11;
    }

    public static final Object v(b bVar, Function1 function1) {
        long j9 = bVar.f47002b;
        Object objInvoke = function1.invoke(f47039d.d(j9));
        long j11 = f47040e;
        f47040e = ((long) 1) + j11;
        k kVarD = f47039d.d(j9);
        f47039d = kVarD;
        bVar.f47002b = j11;
        bVar.f47001a = kVarD;
        bVar.f46980g = 0;
        bVar.f46981h = null;
        bVar.o();
        f47039d = f47039d.h(j11);
        return objInvoke;
    }

    public static final f0 w(f0 f0Var, d0 d0Var, g gVar) {
        f0 f0VarS;
        if (gVar.f()) {
            gVar.n(d0Var);
        }
        long jG = gVar.g();
        f0 f0VarS2 = s(f0Var, jG, gVar.d());
        if (f0VarS2 == null) {
            r();
            throw null;
        }
        if (f0VarS2.f46999a == gVar.g()) {
            return f0VarS2;
        }
        synchronized (f47038c) {
            f0VarS = s(d0Var.b(), jG, gVar.d());
            if (f0VarS == null) {
                r();
                throw null;
            }
            if (f0VarS.f46999a != jG) {
                f0 f0VarM = m(f0VarS, d0Var);
                f0VarM.a(f0VarS);
                f0VarM.f46999a = gVar.g();
                f0VarS = f0VarM;
            }
        }
        if (f0VarS2.f46999a != 1) {
            gVar.n(d0Var);
        }
        return f0VarS;
    }
}

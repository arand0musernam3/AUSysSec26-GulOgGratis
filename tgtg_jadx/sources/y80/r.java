package y80;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w2.g0 f45560a = new w2.g0(11);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u60.a f45561b = new u60.a(23);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a90.v f45562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a90.v f45563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a90.v f45564e;

    static {
        int i11 = 0;
        f45562c = new a90.v("NO_VALUE", i11);
        f45563d = new a90.v("NONE", i11);
        f45564e = new a90.v("PENDING", i11);
    }

    public static final m1 a(int i11, int i12, x80.a aVar) {
        if (i11 < 0) {
            i4.a.i(j4.s.f(i11, "replay cannot be negative, but was "));
            return null;
        }
        if (i12 < 0) {
            i4.a.i(j4.s.f(i12, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i11 <= 0 && i12 <= 0 && aVar != x80.a.SUSPEND) {
            i4.a.j(aVar, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i13 = i12 + i11;
        if (i13 < 0) {
            i13 = Integer.MAX_VALUE;
        }
        return new m1(i11, i13, aVar);
    }

    public static /* synthetic */ m1 b(int i11, int i12, x80.a aVar, int i13) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            aVar = x80.a.SUSPEND;
        }
        return a(i11, i12, aVar);
    }

    public static final a2 c(Object obj) {
        if (obj == null) {
            obj = z80.b.f47357b;
        }
        return new a2(obj);
    }

    public static final void d(Object[] objArr, long j9, Object obj) {
        objArr[((int) j9) & (objArr.length - 1)] = obj;
    }

    public static i e(i iVar, int i11) {
        x80.a aVar = x80.a.SUSPEND;
        if (i11 < 0 && i11 != -2 && i11 != -1) {
            i4.a.i(j4.s.f(i11, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i11 == -1) {
            aVar = x80.a.DROP_OLDEST;
            i11 = 0;
        }
        int i12 = i11;
        x80.a aVar2 = aVar;
        return iVar instanceof z80.q ? z80.b.b((z80.q) iVar, null, i12, aVar2, 1) : new z80.h(iVar, null, i12, aVar2, 2);
    }

    public static final c f(Function2 function2) {
        return new c(function2, kotlin.coroutines.g.f26549a, -2, x80.a.SUSPEND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable g(y80.i r4, y80.j r5, z70.c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof y80.z
            if (r0 == 0) goto L13
            r0 = r6
            y80.z r0 = (y80.z) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            y80.z r0 = new y80.z
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f45621k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.Ref$ObjectRef r4 = r0.f45620j
            ba0.g.M(r6)     // Catch: java.lang.Throwable -> L29
            goto L4a
        L29:
            r5 = move-exception
            goto L4e
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L32:
            ba0.g.M(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            y80.b0 r2 = new y80.b0     // Catch: java.lang.Throwable -> L4c
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4c
            r0.f45620j = r6     // Catch: java.lang.Throwable -> L4c
            r0.l = r3     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L4c
            if (r4 != r1) goto L4a
            return r1
        L4a:
            r4 = 0
            return r4
        L4c:
            r5 = move-exception
            r4 = r6
        L4e:
            T r4 = r4.element
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L5a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r6 != 0) goto L7c
        L5a:
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            v80.h1 r0 = v80.h1.f42106a
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r0)
            v80.i1 r6 = (v80.i1) r6
            if (r6 == 0) goto L7d
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L6f
            goto L7d
        L6f:
            java.util.concurrent.CancellationException r6 = r6.A()
            if (r6 == 0) goto L7d
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r5)
            if (r6 != 0) goto L7c
            goto L7d
        L7c:
            throw r5
        L7d:
            if (r4 != 0) goto L80
            return r5
        L80:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L88
            u70.e.a(r4, r5)
            throw r4
        L88:
            u70.e.a(r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.r.g(y80.i, y80.j, z70.c):java.io.Serializable");
    }

    public static final Object h(i iVar, x70.c cVar) {
        Object objCollect = iVar.collect(z80.s.f47399a, cVar);
        return objCollect == y70.a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
    }

    public static final Object i(i iVar, Function2 function2, x70.c cVar) {
        int i11 = q0.f45559a;
        Object objH = h(e(y(iVar, new a70.b(function2, (x70.c) null)), 0), cVar);
        return objH == y70.a.COROUTINE_SUSPENDED ? objH : Unit.f26487a;
    }

    public static final oz.o j(i iVar) {
        x80.m.f44075b1.getClass();
        int i11 = x80.l.f44074b;
        if (1 >= i11) {
            i11 = 1;
        }
        int i12 = i11 - 1;
        if (iVar instanceof z80.d) {
            z80.d dVar = (z80.d) iVar;
            x80.a aVar = dVar.f47362c;
            i iVarE = dVar.e();
            if (iVarE != null) {
                int i13 = dVar.f47361b;
                if (i13 != -3 && i13 != -2 && i13 != 0) {
                    i12 = i13;
                } else if (aVar != x80.a.SUSPEND || i13 == 0) {
                    i12 = 0;
                }
                return new oz.o(i12, dVar.f47360a, aVar, iVarE);
            }
        }
        return new oz.o(i12, kotlin.coroutines.g.f26549a, x80.a.SUSPEND, iVar);
    }

    public static final i k(z80.q qVar, long j9) {
        if (j9 >= 0) {
            return j9 == 0 ? qVar : new at.o(new q(new cg.k(j9, 9), qVar, null), 10);
        }
        i4.a.f("Debounce timeout should not be negative");
        return null;
    }

    public static final i l(i iVar) {
        return iVar instanceof y1 ? iVar : m(iVar, f45560a, f45561b);
    }

    public static final h m(i iVar, Function1 function1, Function2 function2) {
        if (iVar instanceof h) {
            h hVar = (h) iVar;
            if (hVar.f45484b == function1 && hVar.f45485c == function2) {
                return hVar;
            }
        }
        return new h(iVar, function1, function2);
    }

    public static final Object n(j jVar, i iVar, x70.c cVar) throws Throwable {
        if (jVar instanceof c2) {
            throw ((c2) jVar).f45459a;
        }
        Object objCollect = iVar.collect(jVar, cVar);
        return objCollect == y70.a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002e, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:47:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(y80.j r6, x80.w r7, boolean r8, x70.c r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof y80.m
            if (r0 == 0) goto L13
            r0 = r9
            y80.m r0 = (y80.m) r0
            int r1 = r0.f45524o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45524o = r1
            goto L18
        L13:
            y80.m r0 = new y80.m
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f45523n
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f45524o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L36
            boolean r8 = r0.f45522m
            x80.b r6 = r0.l
            x80.w r7 = r0.f45521k
            y80.j r2 = r0.f45520j
            ba0.g.M(r9)     // Catch: java.lang.Throwable -> L34
        L31:
            r9 = r6
            r6 = r2
            goto L54
        L34:
            r6 = move-exception
            goto L8f
        L36:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L3d:
            boolean r8 = r0.f45522m
            x80.b r6 = r0.l
            x80.w r7 = r0.f45521k
            y80.j r2 = r0.f45520j
            ba0.g.M(r9)     // Catch: java.lang.Throwable -> L34
            goto L69
        L49:
            ba0.g.M(r9)
            boolean r9 = r6 instanceof y80.c2
            if (r9 != 0) goto L97
            x80.b r9 = r7.iterator()     // Catch: java.lang.Throwable -> L34
        L54:
            r0.f45520j = r6     // Catch: java.lang.Throwable -> L34
            r0.f45521k = r7     // Catch: java.lang.Throwable -> L34
            r0.l = r9     // Catch: java.lang.Throwable -> L34
            r0.f45522m = r8     // Catch: java.lang.Throwable -> L34
            r0.f45524o = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r9.b(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L65
            goto L85
        L65:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L69:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L86
            java.lang.Object r9 = r6.c()     // Catch: java.lang.Throwable -> L34
            r0.f45520j = r2     // Catch: java.lang.Throwable -> L34
            r0.f45521k = r7     // Catch: java.lang.Throwable -> L34
            r0.l = r6     // Catch: java.lang.Throwable -> L34
            r0.f45522m = r8     // Catch: java.lang.Throwable -> L34
            r0.f45524o = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L34
            if (r9 != r1) goto L31
        L85:
            return r1
        L86:
            if (r8 == 0) goto L8c
            r6 = 0
            r7.a(r6)
        L8c:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        L8f:
            throw r6     // Catch: java.lang.Throwable -> L90
        L90:
            r9 = move-exception
            if (r8 == 0) goto L96
            o00.x0.m(r7, r6)
        L96:
            throw r9
        L97:
            y80.c2 r6 = (y80.c2) r6
            java.lang.Throwable r6 = r6.f45459a
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.r.o(y80.j, x80.w, boolean, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, a90.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(y80.i r6, kotlin.jvm.functions.Function2 r7, x70.c r8) {
        /*
            a90.v r0 = z80.b.f47357b
            boolean r1 = r8 instanceof y80.u0
            if (r1 == 0) goto L15
            r1 = r8
            y80.u0 r1 = (y80.u0) r1
            int r2 = r1.f45589m
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f45589m = r2
            goto L1a
        L15:
            y80.u0 r1 = new y80.u0
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.l
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.f45589m
            r4 = 1
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2f
            a3.w1 r6 = r1.f45588k
            kotlin.jvm.internal.Ref$ObjectRef r7 = r1.f45587j
            ba0.g.M(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L65
        L2d:
            r8 = move-exception
            goto L5a
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
        L34:
            r6 = 0
            return r6
        L36:
            ba0.g.M(r8)
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            r8.element = r0
            a3.w1 r3 = new a3.w1
            r5 = 17
            r3.<init>(r5, r7, r8)
            r1.f45587j = r8     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r1.f45588k = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r1.f45589m = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            java.lang.Object r6 = r6.collect(r3, r1)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            if (r6 != r2) goto L54
            return r2
        L54:
            r7 = r8
            goto L65
        L56:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r3
        L5a:
            java.lang.Object r2 = r8.f26628a
            if (r2 != r6) goto L70
            kotlin.coroutines.CoroutineContext r6 = r1.getContext()
            v80.f0.p(r6)
        L65:
            T r6 = r7.element
            if (r6 == r0) goto L6a
            return r6
        L6a:
            java.lang.String r6 = "Expected at least one element matching the predicate"
            qc.y.h(r6)
            goto L34
        L70:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.r.p(y80.i, kotlin.jvm.functions.Function2, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, a90.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(y80.i r6, x70.c r7) {
        /*
            a90.v r0 = z80.b.f47357b
            boolean r1 = r7 instanceof y80.t0
            if (r1 == 0) goto L15
            r1 = r7
            y80.t0 r1 = (y80.t0) r1
            int r2 = r1.f45582m
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f45582m = r2
            goto L1a
        L15:
            y80.t0 r1 = new y80.t0
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.l
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.f45582m
            r4 = 1
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2f
            y80.r0 r6 = r1.f45581k
            kotlin.jvm.internal.Ref$ObjectRef r2 = r1.f45580j
            ba0.g.M(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L64
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
        L34:
            r6 = 0
            return r6
        L36:
            ba0.g.M(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r7.element = r0
            y80.r0 r3 = new y80.r0
            r5 = 0
            r3.<init>(r7, r5)
            r1.f45580j = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            r1.f45581k = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            r1.f45582m = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            java.lang.Object r6 = r6.collect(r3, r1)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            if (r6 != r2) goto L53
            return r2
        L53:
            r2 = r7
            goto L64
        L55:
            r6 = move-exception
            r2 = r7
            r7 = r6
            r6 = r3
        L59:
            java.lang.Object r3 = r7.f26628a
            if (r3 != r6) goto L6f
            kotlin.coroutines.CoroutineContext r6 = r1.getContext()
            v80.f0.p(r6)
        L64:
            T r6 = r2.element
            if (r6 == r0) goto L69
            return r6
        L69:
            java.lang.String r6 = "Expected at least one element"
            qc.y.h(r6)
            goto L34
        L6f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.r.q(y80.i, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(y80.i r5, x70.c r6) {
        /*
            boolean r0 = r6 instanceof y80.v0
            if (r0 == 0) goto L13
            r0 = r6
            y80.v0 r0 = (y80.v0) r0
            int r1 = r0.f45599m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45599m = r1
            goto L18
        L13:
            y80.v0 r0 = new y80.v0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f45599m
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            y80.r0 r5 = r0.f45598k
            kotlin.jvm.internal.Ref$ObjectRef r1 = r0.f45597j
            ba0.g.M(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L60
        L2b:
            r6 = move-exception
            goto L55
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L34:
            ba0.g.M(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            y80.r0 r2 = new y80.r0
            r4 = 1
            r2.<init>(r6, r4)
            r0.f45597j = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            r0.f45598k = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            r0.f45599m = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r1 = r6
            goto L60
        L51:
            r5 = move-exception
            r1 = r6
            r6 = r5
            r5 = r2
        L55:
            java.lang.Object r2 = r6.f26628a
            if (r2 != r5) goto L63
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            v80.f0.p(r5)
        L60:
            T r5 = r1.element
            return r5
        L63:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.r.r(y80.i, x70.c):java.lang.Object");
    }

    public static final i s(i iVar, CoroutineContext coroutineContext) {
        if (coroutineContext.get(v80.h1.f42106a) == null) {
            return Intrinsics.areEqual(coroutineContext, kotlin.coroutines.g.f26549a) ? iVar : iVar instanceof z80.q ? z80.b.b((z80.q) iVar, coroutineContext, 0, null, 6) : new z80.h(iVar, coroutineContext, 0, null, 12);
        }
        i4.a.j(coroutineContext, "Flow context cannot contain job in it. Had ");
        return null;
    }

    public static final i t(i1 i1Var, CoroutineContext coroutineContext, int i11, x80.a aVar) {
        return ((i11 == 0 || i11 == -3) && aVar == x80.a.SUSPEND) ? i1Var : new z80.h(i11, coroutineContext, aVar, i1Var);
    }

    public static final v80.b2 u(v80.b0 b0Var, i iVar) {
        return v80.f0.B(b0Var, null, null, new sf.a(iVar, null, 15), 3);
    }

    public static final e v(i... iVarArr) {
        int i11 = q0.f45559a;
        return new e(iVarArr.length == 0 ? kotlin.collections.n0.f26529a : new k90.g(iVarArr, 1), kotlin.coroutines.g.f26549a, -2, x80.a.SUSPEND);
    }

    public static final d w(x80.w wVar) {
        return new d(wVar, false);
    }

    public static final h1 x(i iVar, v80.b0 b0Var, q1 q1Var, Object obj) {
        oz.o oVarJ = j(iVar);
        a2 a2VarC = c(obj);
        v80.f0.A(b0Var, (CoroutineContext) oVarJ.f33847d, Intrinsics.areEqual(q1Var, p1.f45551a) ? v80.d0.DEFAULT : v80.d0.UNDISPATCHED, new os.c(q1Var, (i) oVarJ.f33845b, a2VarC, obj, (x70.c) null));
        return new h1(a2VarC);
    }

    public static final z80.l y(i iVar, i80.n nVar) {
        int i11 = q0.f45559a;
        return new z80.l(nVar, iVar, kotlin.coroutines.g.f26549a, -2, x80.a.SUSPEND);
    }
}

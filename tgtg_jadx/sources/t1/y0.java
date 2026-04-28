package t1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends h2.s0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f39604s = new k(0.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f39605t = new k(1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.k1 f39606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.k1 f39607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f39608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q1 f39609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f39610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rv.a f39611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m3.g1 f39612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v80.l f39613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e90.c f39614k;
    public final n0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f39615m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q1.o0 f39616n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r0 f39617o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q0 f39618p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f39619q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q0 f39620r;

    /* JADX WARN: Type inference failed for: r3v6, types: [t1.q0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [t1.q0] */
    public y0(Object obj) {
        super(2);
        this.f39606c = m3.i.w(obj);
        this.f39607d = m3.i.w(obj);
        this.f39608e = obj;
        this.f39611h = new rv.a(this, 8);
        this.f39612i = new m3.g1(0.0f);
        this.f39614k = e90.d.a();
        this.l = new n0();
        this.f39615m = Long.MIN_VALUE;
        this.f39616n = new q1.o0();
        final int i11 = 0;
        this.f39618p = new Function1(this) { // from class: t1.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0 f39536b;

            {
                this.f39536b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Long l = (Long) obj2;
                switch (i11) {
                    case 0:
                        this.f39536b.f39615m = l.longValue();
                        break;
                    default:
                        long jLongValue = l.longValue();
                        y0 y0Var = this.f39536b;
                        long j9 = jLongValue - y0Var.f39615m;
                        y0Var.f39615m = jLongValue;
                        long jC = j80.c.c(j9 / ((double) y0Var.f39619q));
                        q1.o0 o0Var = y0Var.f39616n;
                        if (o0Var.e()) {
                            Object[] objArr = o0Var.f35721a;
                            int i12 = o0Var.f35722b;
                            int i13 = 0;
                            for (int i14 = 0; i14 < i12; i14++) {
                                r0 r0Var = (r0) objArr[i14];
                                y0.x(r0Var, jC);
                                r0Var.f39556c = true;
                            }
                            q1 q1Var = y0Var.f39609f;
                            if (q1Var != null) {
                                q1Var.p();
                            }
                            int i15 = o0Var.f35722b;
                            Object[] objArr2 = o0Var.f35721a;
                            IntRange intRangeJ = n80.p.j(0, i15);
                            int i16 = intRangeJ.f26553a;
                            int i17 = intRangeJ.f26554b;
                            if (i16 <= i17) {
                                while (true) {
                                    objArr2[i16 - i13] = objArr2[i16];
                                    if (((r0) objArr2[i16]).f39556c) {
                                        i13++;
                                    }
                                    if (i16 != i17) {
                                        i16++;
                                    }
                                }
                            }
                            kotlin.collections.x.m(objArr2, i15 - i13, i15, null);
                            o0Var.f35722b -= i13;
                        }
                        r0 r0Var2 = y0Var.f39617o;
                        if (r0Var2 != null) {
                            r0Var2.f39560g = y0Var.f39610g;
                            y0.x(r0Var2, jC);
                            y0Var.A(r0Var2.f39557d);
                            if (r0Var2.f39557d == 1.0f) {
                                y0Var.f39617o = null;
                            }
                            y0Var.z();
                        }
                        break;
                }
                return Unit.f26487a;
            }
        };
        final int i12 = 1;
        this.f39620r = new Function1(this) { // from class: t1.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0 f39536b;

            {
                this.f39536b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Long l = (Long) obj2;
                switch (i12) {
                    case 0:
                        this.f39536b.f39615m = l.longValue();
                        break;
                    default:
                        long jLongValue = l.longValue();
                        y0 y0Var = this.f39536b;
                        long j9 = jLongValue - y0Var.f39615m;
                        y0Var.f39615m = jLongValue;
                        long jC = j80.c.c(j9 / ((double) y0Var.f39619q));
                        q1.o0 o0Var = y0Var.f39616n;
                        if (o0Var.e()) {
                            Object[] objArr = o0Var.f35721a;
                            int i122 = o0Var.f35722b;
                            int i13 = 0;
                            for (int i14 = 0; i14 < i122; i14++) {
                                r0 r0Var = (r0) objArr[i14];
                                y0.x(r0Var, jC);
                                r0Var.f39556c = true;
                            }
                            q1 q1Var = y0Var.f39609f;
                            if (q1Var != null) {
                                q1Var.p();
                            }
                            int i15 = o0Var.f35722b;
                            Object[] objArr2 = o0Var.f35721a;
                            IntRange intRangeJ = n80.p.j(0, i15);
                            int i16 = intRangeJ.f26553a;
                            int i17 = intRangeJ.f26554b;
                            if (i16 <= i17) {
                                while (true) {
                                    objArr2[i16 - i13] = objArr2[i16];
                                    if (((r0) objArr2[i16]).f39556c) {
                                        i13++;
                                    }
                                    if (i16 != i17) {
                                        i16++;
                                    }
                                }
                            }
                            kotlin.collections.x.m(objArr2, i15 - i13, i15, null);
                            o0Var.f35722b -= i13;
                        }
                        r0 r0Var2 = y0Var.f39617o;
                        if (r0Var2 != null) {
                            r0Var2.f39560g = y0Var.f39610g;
                            y0.x(r0Var2, jC);
                            y0Var.A(r0Var2.f39557d);
                            if (r0Var2.f39557d == 1.0f) {
                                y0Var.f39617o = null;
                            }
                            y0Var.z();
                        }
                        break;
                }
                return Unit.f26487a;
            }
        };
    }

    public static final void q(y0 y0Var) {
        m3.g1 g1Var = y0Var.f39612i;
        q1 q1Var = y0Var.f39609f;
        if (q1Var == null) {
            return;
        }
        r0 r0Var = y0Var.f39617o;
        if (r0Var == null) {
            if (y0Var.f39610g <= 0 || g1Var.h() == 1.0f || Intrinsics.areEqual(y0Var.f39607d.getValue(), y0Var.f39606c.getValue())) {
                r0Var = null;
            } else {
                r0Var = new r0();
                r0Var.f39557d = g1Var.h();
                long j9 = y0Var.f39610g;
                r0Var.f39560g = j9;
                r0Var.f39561h = j80.c.c((1.0d - ((double) g1Var.h())) * j9);
                r0Var.f39558e.e(g1Var.h(), 0);
            }
        }
        if (r0Var != null) {
            r0Var.f39560g = y0Var.f39610g;
            y0Var.f39616n.g(r0Var);
            q1Var.n(r0Var);
        }
        y0Var.f39617o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(t1.y0 r10, z70.c r11) {
        /*
            q1.o0 r0 = r10.f39616n
            boolean r1 = r11 instanceof t1.t0
            if (r1 == 0) goto L15
            r1 = r11
            t1.t0 r1 = (t1.t0) r1
            int r2 = r1.l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.l = r2
            goto L1a
        L15:
            t1.t0 r1 = new t1.t0
            r1.<init>(r10, r11)
        L1a:
            java.lang.Object r11 = r1.f39571j
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.l
            r4 = 2
            r5 = 1
            r6 = -9223372036854775808
            if (r3 == 0) goto L36
            if (r3 == r5) goto L32
            if (r3 != r4) goto L2b
            goto L32
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            r10 = 0
            return r10
        L32:
            ba0.g.M(r11)
            goto L74
        L36:
            ba0.g.M(r11)
            boolean r11 = r0.d()
            if (r11 == 0) goto L46
            t1.r0 r11 = r10.f39617o
            if (r11 != 0) goto L46
            kotlin.Unit r10 = kotlin.Unit.f26487a
            return r10
        L46:
            kotlin.coroutines.CoroutineContext r11 = r1.getContext()
            float r11 = t1.j1.h(r11)
            r3 = 0
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 != 0) goto L5b
            r10.w()
            r10.f39615m = r6
            kotlin.Unit r10 = kotlin.Unit.f26487a
            return r10
        L5b:
            long r8 = r10.f39615m
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 != 0) goto L74
            t1.q0 r11 = r10.f39618p
            r1.l = r5
            kotlin.coroutines.CoroutineContext r3 = r1.getContext()
            m3.x0 r3 = m3.i.u(r3)
            java.lang.Object r11 = r3.t(r11, r1)
            if (r11 != r2) goto L74
            goto L8c
        L74:
            boolean r11 = r0.e()
            if (r11 != 0) goto L84
            t1.r0 r11 = r10.f39617o
            if (r11 == 0) goto L7f
            goto L84
        L7f:
            r10.f39615m = r6
            kotlin.Unit r10 = kotlin.Unit.f26487a
            return r10
        L84:
            r1.l = r4
            java.lang.Object r11 = r10.u(r1)
            if (r11 != r2) goto L74
        L8c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.y0.r(t1.y0, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(t1.y0 r7, z70.c r8) {
        /*
            e90.c r0 = r7.f39614k
            boolean r1 = r8 instanceof t1.w0
            if (r1 == 0) goto L15
            r1 = r8
            t1.w0 r1 = (t1.w0) r1
            int r2 = r1.f39599m
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f39599m = r2
            goto L1a
        L15:
            t1.w0 r1 = new t1.w0
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.f39598k
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.f39599m
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2e
            java.lang.Object r0 = r1.f39597j
            ba0.g.M(r8)
            goto L70
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L35:
            java.lang.Object r3 = r1.f39597j
            ba0.g.M(r8)
            r8 = r3
            goto L50
        L3c:
            ba0.g.M(r8)
            m3.k1 r8 = r7.f39606c
            java.lang.Object r8 = r8.getValue()
            r1.f39597j = r8
            r1.f39599m = r5
            java.lang.Object r3 = r0.g(r1)
            if (r3 != r2) goto L50
            goto L6c
        L50:
            r1.f39597j = r8
            r1.f39599m = r4
            v80.l r3 = new v80.l
            x70.c r1 = y70.f.b(r1)
            r3.<init>(r5, r1)
            r3.t()
            r7.f39613j = r3
            r1 = 0
            r0.e(r1)
            java.lang.Object r0 = r3.s()
            if (r0 != r2) goto L6d
        L6c:
            return r2
        L6d:
            r6 = r0
            r0 = r8
            r8 = r6
        L70:
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r0)
            if (r8 == 0) goto L79
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        L79:
            r0 = -9223372036854775808
            r7.f39615m = r0
            java.util.concurrent.CancellationException r7 = new java.util.concurrent.CancellationException
            java.lang.String r8 = "targetState while waiting for composition"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.y0.s(t1.y0, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(t1.y0 r8, z70.c r9) {
        /*
            e90.c r0 = r8.f39614k
            boolean r1 = r9 instanceof t1.x0
            if (r1 == 0) goto L15
            r1 = r9
            t1.x0 r1 = (t1.x0) r1
            int r2 = r1.f39603m
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f39603m = r2
            goto L1a
        L15:
            t1.x0 r1 = new t1.x0
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.f39602k
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.f39603m
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2e
            java.lang.Object r0 = r1.f39601j
            ba0.g.M(r9)
            goto L7c
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L35:
            java.lang.Object r3 = r1.f39601j
            ba0.g.M(r9)
            r9 = r3
            goto L50
        L3c:
            ba0.g.M(r9)
            m3.k1 r9 = r8.f39606c
            java.lang.Object r9 = r9.getValue()
            r1.f39601j = r9
            r1.f39603m = r5
            java.lang.Object r3 = r0.g(r1)
            if (r3 != r2) goto L50
            goto L78
        L50:
            java.lang.Object r3 = r8.f39608e
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r3)
            r6 = 0
            if (r3 == 0) goto L5d
            r0.e(r6)
            goto L82
        L5d:
            r1.f39601j = r9
            r1.f39603m = r4
            v80.l r3 = new v80.l
            x70.c r1 = y70.f.b(r1)
            r3.<init>(r5, r1)
            r3.t()
            r8.f39613j = r3
            r0.e(r6)
            java.lang.Object r0 = r3.s()
            if (r0 != r2) goto L79
        L78:
            return r2
        L79:
            r7 = r0
            r0 = r9
            r9 = r7
        L7c:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r0)
            if (r1 == 0) goto L85
        L82:
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        L85:
            r1 = -9223372036854775808
            r8.f39615m = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = " instead of "
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.y0.t(t1.y0, z70.c):java.lang.Object");
    }

    public static Object v(y0 y0Var, Object obj, z70.i iVar) {
        q1 q1Var = y0Var.f39609f;
        if (q1Var == null) {
            return Unit.f26487a;
        }
        Object objA = n0.a(y0Var.l, new s0(q1Var, y0Var, obj, (x70.c) null), iVar);
        return objA == y70.a.COROUTINE_SUSPENDED ? objA : Unit.f26487a;
    }

    public static void x(r0 r0Var, long j9) {
        long j11 = r0Var.f39554a + j9;
        r0Var.f39554a = j11;
        long j12 = r0Var.f39561h;
        if (j11 >= j12) {
            r0Var.f39557d = 1.0f;
            return;
        }
        a2 a2Var = r0Var.f39555b;
        k kVar = r0Var.f39558e;
        if (a2Var == null) {
            float f11 = j11 / j12;
            r0Var.f39557d = (f11 * 1.0f) + ((1 - f11) * kVar.a(0));
            return;
        }
        k kVar2 = r0Var.f39559f;
        if (kVar2 == null) {
            kVar2 = f39604s;
        }
        r0Var.f39557d = n80.p.b(((k) a2Var.e(j11, kVar, f39605t, kVar2)).a(0), 0.0f, 1.0f);
    }

    public final void A(float f11) {
        this.f39612i.i(f11);
    }

    public final Object B(Object obj, z70.i iVar) {
        q1 q1Var = this.f39609f;
        if (q1Var == null) {
            return Unit.f26487a;
        }
        if (Intrinsics.areEqual(this.f39607d.getValue(), obj) && Intrinsics.areEqual(this.f39606c.getValue(), obj)) {
            return Unit.f26487a;
        }
        Object objA = n0.a(this.l, new s0(this, obj, q1Var, (x70.c) null), iVar);
        return objA == y70.a.COROUTINE_SUSPENDED ? objA : Unit.f26487a;
    }

    @Override // h2.s0
    public final Object j() {
        return this.f39607d.getValue();
    }

    @Override // h2.s0
    public final Object l() {
        return this.f39606c.getValue();
    }

    @Override // h2.s0
    public final void m(Object obj) {
        this.f39607d.setValue(obj);
    }

    @Override // h2.s0
    public final void n(q1 q1Var) {
        q1 q1Var2 = this.f39609f;
        if (q1Var2 != null && !Intrinsics.areEqual(q1Var, q1Var2)) {
            o0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f39609f + ", new instance: " + q1Var);
        }
        this.f39609f = q1Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, u70.j] */
    @Override // h2.s0
    public final void o() {
        this.f39609f = null;
        ((z3.x) t1.f39574b.getValue()).b(this);
    }

    public final Object u(z70.c cVar) {
        float fH = j1.h(cVar.getContext());
        if (fH <= 0.0f) {
            w();
            return Unit.f26487a;
        }
        this.f39619q = fH;
        Object objT = m3.i.u(cVar.getContext()).t(this.f39620r, cVar);
        return objT == y70.a.COROUTINE_SUSPENDED ? objT : Unit.f26487a;
    }

    public final void w() {
        q1 q1Var = this.f39609f;
        if (q1Var != null) {
            q1Var.c();
        }
        this.f39616n.j();
        if (this.f39617o != null) {
            this.f39617o = null;
            A(1.0f);
            z();
        }
    }

    public final Object y(float f11, Object obj, z70.i iVar) {
        if (0.0f > f11 || f11 > 1.0f) {
            o0.a("Expecting fraction between 0 and 1. Got " + f11);
        }
        q1 q1Var = this.f39609f;
        if (q1Var == null) {
            return Unit.f26487a;
        }
        Object objA = n0.a(this.l, new v0(obj, this.f39606c.getValue(), this, q1Var, f11, null), iVar);
        return objA == y70.a.COROUTINE_SUSPENDED ? objA : Unit.f26487a;
    }

    public final void z() {
        q1 q1Var = this.f39609f;
        if (q1Var == null) {
            return;
        }
        q1Var.m(j80.c.c(((double) this.f39612i.h()) * q1Var.g()));
    }
}

package i2;

import b5.m0;
import h2.t0;
import h2.v0;
import h2.w0;
import h2.x0;
import h2.z0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.LongCompanionObject;
import m3.b1;
import m3.g1;
import m3.h1;
import m3.k1;
import v1.j1;
import z1.h3;
import z4.o1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 implements h3 {
    public long A;
    public final v0 B;
    public final b1 C;
    public final b1 D;
    public final k1 E;
    public final k1 F;
    public final k1 G;
    public final k1 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f22820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f22821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f22822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f22826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f22827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f22828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z1.g0 f22829k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22830m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x0 f22831n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f22832o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k1 f22833p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z5.c f22834q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b2.l f22835r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h1 f22836s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h1 f22837t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z0 f22838u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f22839v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h2.o f22840w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h2.e f22841x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k1 f22842y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f2.a0 f22843z;

    public e0(float f11, int i11) {
        double d3 = f11;
        if (-0.5d > d3 || d3 > 0.5d) {
            c2.a.a("currentPageOffsetFraction " + f11 + " is not within the range -0.5 to 0.5");
        }
        this.f22821c = m3.i.w(new h4.b(0L));
        this.f22822d = new x(i11, f11, this);
        this.f22823e = i11;
        this.f22825g = LongCompanionObject.MAX_VALUE;
        final int i12 = 0;
        this.f22829k = new z1.g0(new Function1(this) { // from class: i2.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f22934b;

            {
                this.f22934b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Long] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                v vVar;
                switch (i12) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        e0 e0Var = this.f22934b;
                        long jQ = w0.e.q(e0Var);
                        float f12 = e0Var.f22827i + fFloatValue;
                        long jC = j80.c.c(f12);
                        e0Var.f22827i = f12 - jC;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j9 = jQ + jC;
                            long jD = n80.p.d(j9, e0Var.f22826h, e0Var.f22825g);
                            boolean z11 = j9 != jD;
                            long j11 = jD - jQ;
                            float f13 = j11;
                            e0Var.f22828j = f13;
                            if (Math.abs(j11) != 0) {
                                e0Var.G.setValue(Boolean.valueOf(f13 > 0.0f));
                                e0Var.H.setValue(Boolean.valueOf(f13 < 0.0f));
                            }
                            int i13 = (int) j11;
                            int i14 = -i13;
                            v vVarE = ((v) e0Var.f22833p.getValue()).e(i14);
                            if (vVarE != null && (vVar = e0Var.f22820b) != null) {
                                v vVarE2 = vVar.e(i14);
                                if (vVarE2 != null) {
                                    e0Var.f22820b = vVarE2;
                                } else {
                                    vVarE = null;
                                }
                            }
                            if (vVarE != null) {
                                e0Var.h(vVarE, e0Var.f22819a, true);
                                e0Var.C.setValue(Unit.f26487a);
                            } else {
                                x xVar = e0Var.f22822d;
                                e0 e0Var2 = (e0) xVar.f22928b;
                                g1 g1Var = (g1) xVar.f22930d;
                                g1Var.i(g1Var.h() + (e0Var2.q() != 0 ? i13 / e0Var2.q() : 0.0f));
                                o1 o1Var = (o1) e0Var.f22842y.getValue();
                                if (o1Var != null) {
                                    ((m0) o1Var).k();
                                }
                            }
                            if (z11) {
                                ValueOf = Long.valueOf(j11);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        e0 e0Var3 = this.f22934b;
                        w0 w0Var = (w0) obj;
                        z3.g gVarC = z3.v.c();
                        Function1 function1E = gVarC != null ? gVarC.e() : null;
                        z3.g gVarD = z3.v.d(gVarC);
                        try {
                            w0Var.a(e0Var3.f22823e);
                            z3.v.f(gVarC, gVarD, function1E);
                            return Unit.f26487a;
                        } catch (Throwable th2) {
                            z3.v.f(gVarC, gVarD, function1E);
                            throw th2;
                        }
                }
            }
        });
        this.l = true;
        this.f22830m = -1;
        this.f22833p = new k1(g0.f22859c, m3.f.f29272d);
        this.f22834q = g0.f22858b;
        this.f22835r = new b2.l();
        this.f22836s = new h1(-1);
        this.f22837t = new h1(i11);
        m3.f fVar = m3.f.f29275g;
        m3.i.r(new c(this, 2), fVar);
        m3.i.r(new c(this, 3), fVar);
        final int i13 = 1;
        this.f22838u = new z0(new Function1(this) { // from class: i2.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f22934b;

            {
                this.f22934b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Long] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                v vVar;
                switch (i13) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        e0 e0Var = this.f22934b;
                        long jQ = w0.e.q(e0Var);
                        float f12 = e0Var.f22827i + fFloatValue;
                        long jC = j80.c.c(f12);
                        e0Var.f22827i = f12 - jC;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j9 = jQ + jC;
                            long jD = n80.p.d(j9, e0Var.f22826h, e0Var.f22825g);
                            boolean z11 = j9 != jD;
                            long j11 = jD - jQ;
                            float f13 = j11;
                            e0Var.f22828j = f13;
                            if (Math.abs(j11) != 0) {
                                e0Var.G.setValue(Boolean.valueOf(f13 > 0.0f));
                                e0Var.H.setValue(Boolean.valueOf(f13 < 0.0f));
                            }
                            int i132 = (int) j11;
                            int i14 = -i132;
                            v vVarE = ((v) e0Var.f22833p.getValue()).e(i14);
                            if (vVarE != null && (vVar = e0Var.f22820b) != null) {
                                v vVarE2 = vVar.e(i14);
                                if (vVarE2 != null) {
                                    e0Var.f22820b = vVarE2;
                                } else {
                                    vVarE = null;
                                }
                            }
                            if (vVarE != null) {
                                e0Var.h(vVarE, e0Var.f22819a, true);
                                e0Var.C.setValue(Unit.f26487a);
                            } else {
                                x xVar = e0Var.f22822d;
                                e0 e0Var2 = (e0) xVar.f22928b;
                                g1 g1Var = (g1) xVar.f22930d;
                                g1Var.i(g1Var.h() + (e0Var2.q() != 0 ? i132 / e0Var2.q() : 0.0f));
                                o1 o1Var = (o1) e0Var.f22842y.getValue();
                                if (o1Var != null) {
                                    ((m0) o1Var).k();
                                }
                            }
                            if (z11) {
                                ValueOf = Long.valueOf(j11);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        e0 e0Var3 = this.f22934b;
                        w0 w0Var = (w0) obj;
                        z3.g gVarC = z3.v.c();
                        Function1 function1E = gVarC != null ? gVarC.e() : null;
                        z3.g gVarD = z3.v.d(gVarC);
                        try {
                            w0Var.a(e0Var3.f22823e);
                            z3.v.f(gVarC, gVarD, function1E);
                            return Unit.f26487a;
                        } catch (Throwable th2) {
                            z3.v.f(gVarC, gVarD, function1E);
                            throw th2;
                        }
                }
            }
        });
        i iVar = new i();
        new c(this, 4);
        this.f22839v = new l(iVar);
        this.f22840w = new h2.o();
        this.f22841x = new h2.e();
        this.f22842y = m3.i.w(null);
        this.f22843z = new f2.a0(this, 2);
        this.A = z5.b.b(0, 0, 15);
        this.B = new v0();
        this.C = h2.q.h();
        this.D = h2.q.h();
        Boolean bool = Boolean.FALSE;
        this.E = m3.i.w(bool);
        this.F = m3.i.w(bool);
        this.G = m3.i.w(bool);
        this.H = m3.i.w(bool);
    }

    public static int j(boolean z11, v vVar) {
        List list = vVar.f22906a;
        int i11 = vVar.f22913h;
        if (!z11) {
            return (((g) ((h) CollectionsKt.O(list))).f22846a - i11) - 1;
        }
        int i12 = i11 + 1;
        if (i12 < 0) {
            return Integer.MAX_VALUE;
        }
        return ((g) ((h) CollectionsKt.W(list))).f22846a + i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r8.a(r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object u(i2.e0 r5, v1.j1 r6, kotlin.jvm.functions.Function2 r7, z70.c r8) {
        /*
            boolean r0 = r8 instanceof i2.c0
            if (r0 == 0) goto L13
            r0 = r8
            i2.c0 r0 = (i2.c0) r0
            int r1 = r0.f22798o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22798o = r1
            goto L18
        L13:
            i2.c0 r0 = new i2.c0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f22796m
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f22798o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            i2.e0 r5 = r0.f22794j
            ba0.g.M(r8)
            goto L78
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L33:
            z70.i r5 = r0.l
            r7 = r5
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            v1.j1 r6 = r0.f22795k
            i2.e0 r5 = r0.f22794j
            ba0.g.M(r8)
            goto L55
        L40:
            ba0.g.M(r8)
            r0.f22794j = r5
            r0.f22795k = r6
            r8 = r7
            z70.i r8 = (z70.i) r8
            r0.l = r8
            r0.f22798o = r4
            java.lang.Object r8 = r5.i(r0)
            if (r8 != r1) goto L55
            goto L77
        L55:
            z1.g0 r8 = r5.f22829k
            boolean r8 = r8.b()
            if (r8 != 0) goto L66
            int r8 = r5.l()
            m3.h1 r2 = r5.f22837t
            r2.i(r8)
        L66:
            z1.g0 r8 = r5.f22829k
            r0.f22794j = r5
            r2 = 0
            r0.f22795k = r2
            r0.l = r2
            r0.f22798o = r3
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r1) goto L78
        L77:
            return r1
        L78:
            r6 = -1
            m3.h1 r5 = r5.f22836s
            r5.i(r6)
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.e0.u(i2.e0, v1.j1, kotlin.jvm.functions.Function2, z70.c):java.lang.Object");
    }

    @Override // z1.h3
    public final Object a(j1 j1Var, Function2 function2, z70.c cVar) {
        return u(this, j1Var, function2, cVar);
    }

    @Override // z1.h3
    public final boolean b() {
        return this.f22829k.b();
    }

    @Override // z1.h3
    public final boolean c() {
        return ((Boolean) this.F.getValue()).booleanValue();
    }

    @Override // z1.h3
    public final boolean d() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    @Override // z1.h3
    public final float e(float f11) {
        return this.f22829k.e(f11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
    
        if (a(v1.j1.Default, r5, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r12, t1.b1 r13, z70.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof i2.a0
            if (r0 == 0) goto L13
            r0 = r14
            i2.a0 r0 = (i2.a0) r0
            int r1 = r0.f22786n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22786n = r1
            goto L18
        L13:
            i2.a0 r0 = new i2.a0
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f22786n
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2d
            ba0.g.M(r14)
            r6 = r11
            goto Laa
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            r12 = 0
            return r12
        L34:
            int r12 = r0.f22783j
            t1.b1 r13 = r0.f22784k
            ba0.g.M(r14)
        L3b:
            r9 = r13
            goto L66
        L3d:
            ba0.g.M(r14)
            int r14 = r11.l()
            if (r12 != r14) goto L4f
            float r14 = r11.m()
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 != 0) goto L4f
            goto L55
        L4f:
            int r14 = r11.o()
            if (r14 != 0) goto L58
        L55:
            kotlin.Unit r12 = kotlin.Unit.f26487a
            return r12
        L58:
            r0.f22784k = r13
            r0.f22783j = r12
            r0.f22786n = r5
            java.lang.Object r14 = r11.i(r0)
            if (r14 != r1) goto L3b
            r6 = r11
            goto La9
        L66:
            double r13 = (double) r3
            r5 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r2 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r2 > 0) goto L74
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 > 0) goto L74
            goto L8a
        L74:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "pageOffsetFraction "
            r13.<init>(r14)
            r13.append(r3)
            java.lang.String r14 = " is not within the range -0.5 to 0.5"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            c2.a.a(r13)
        L8a:
            int r7 = r11.k(r12)
            int r12 = r11.q()
            float r12 = (float) r12
            float r8 = r3 * r12
            i2.b0 r5 = new i2.b0
            r10 = 0
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r12 = 0
            r0.f22784k = r12
            r0.f22786n = r4
            v1.j1 r12 = v1.j1.Default
            java.lang.Object r12 = r11.a(r12, r5, r0)
            if (r12 != r1) goto Laa
        La9:
            return r1
        Laa:
            kotlin.Unit r12 = kotlin.Unit.f26487a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.e0.f(int, t1.b1, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x011e A[Catch: all -> 0x016b, TryCatch #0 {all -> 0x016b, blocks: (B:53:0x00bd, B:57:0x00cc, B:60:0x00d5, B:63:0x00e2, B:65:0x00ee, B:77:0x0129, B:71:0x011e, B:68:0x0106), top: B:92:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0129 A[Catch: all -> 0x016b, TRY_LEAVE, TryCatch #0 {all -> 0x016b, blocks: (B:53:0x00bd, B:57:0x00cc, B:60:0x00d5, B:63:0x00e2, B:65:0x00ee, B:77:0x0129, B:71:0x011e, B:68:0x0106), top: B:92:0x00bd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(i2.v r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.e0.h(i2.v, boolean, boolean):void");
    }

    public final Object i(z70.c cVar) {
        if (this.f22833p.getValue() != g0.f22859c) {
            return Unit.f26487a;
        }
        Object objC = this.f22841x.c(cVar);
        return objC == y70.a.COROUTINE_SUSPENDED ? objC : Unit.f26487a;
    }

    public final int k(int i11) {
        if (o() > 0) {
            return n80.p.c(i11, 0, o() - 1);
        }
        return 0;
    }

    public final int l() {
        return ((h1) this.f22822d.f22929c).h();
    }

    public final float m() {
        return ((g1) this.f22822d.f22930d).h();
    }

    public final v n() {
        return (v) this.f22833p.getValue();
    }

    public abstract int o();

    public final int p() {
        return ((v) this.f22833p.getValue()).f22907b;
    }

    public final int q() {
        return ((v) this.f22833p.getValue()).f22908c + p();
    }

    public final long r() {
        return ((h4.b) this.f22821c.getValue()).f21378a;
    }

    public final boolean s() {
        return ((int) Float.intBitsToFloat((int) (r() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (r() & 4294967295L))) == 0;
    }

    public final void t(float f11, v vVar) {
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        List list = vVar.f22906a;
        if (this.l && !list.isEmpty()) {
            boolean z11 = f11 > 0.0f;
            int iJ = j(z11, vVar);
            if (iJ < 0 || iJ >= o()) {
                return;
            }
            if (iJ != this.f22830m) {
                if (this.f22832o != z11 && (x0Var3 = this.f22831n) != null) {
                    x0Var3.cancel();
                }
                this.f22832o = z11;
                this.f22830m = iJ;
                this.f22831n = this.f22838u.a(iJ, this.A, true, null);
            }
            if (z11) {
                if ((((g) ((h) CollectionsKt.W(list))).f22855j + (vVar.f22907b + vVar.f22908c)) - vVar.f22912g >= f11 || (x0Var2 = this.f22831n) == null) {
                    return;
                }
                x0Var2.a();
                return;
            }
            if (vVar.f22911f - ((g) ((h) CollectionsKt.O(list))).f22855j >= (-f11) || (x0Var = this.f22831n) == null) {
                return;
            }
            x0Var.a();
        }
    }

    public final void v(int i11, float f11, boolean z11) {
        x xVar = this.f22822d;
        h1 h1Var = (h1) xVar.f22929c;
        g1 g1Var = (g1) xVar.f22930d;
        if (h1Var.h() != i11 || g1Var.h() != f11) {
            this.f22839v.b();
        }
        ((h1) xVar.f22929c).i(i11);
        ((t0) xVar.f22932f).b(i11);
        g1Var.i(f11);
        xVar.f22931e = null;
        if (!z11) {
            this.D.setValue(Unit.f26487a);
            return;
        }
        o1 o1Var = (o1) this.f22842y.getValue();
        if (o1Var != null) {
            ((m0) o1Var).k();
        }
    }
}

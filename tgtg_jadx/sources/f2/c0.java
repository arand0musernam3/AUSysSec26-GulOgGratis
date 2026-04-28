package f2;

import a3.b2;
import b5.m0;
import h2.h0;
import h2.v0;
import h2.x0;
import h2.z0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import m3.b1;
import m3.k1;
import v1.j1;
import z1.h3;
import z4.o1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements h3 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ub.a f17087x = y3.j.b(new cn.u(23, 0), new cp.i(26));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f17088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f17090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f17092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f17093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2.l f17094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f17095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z1.g0 f17096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f17097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o1 f17098k;
    public final a0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h2.e f17099m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h0 f17100n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h2.o f17101o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z0 f17102p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z f17103q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v0 f17104r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b1 f17105s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k1 f17106t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final k1 f17107u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b1 f17108v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final dn.k f17109w;

    public c0(int i11, int i12) {
        a aVar = new a();
        aVar.f17053a = -1;
        aVar.f17055c = -1;
        this.f17088a = aVar;
        this.f17092e = new w(i11, i12, 0);
        this.f17093f = new k1(e0.f17114a, m3.f.f29272d);
        this.f17094g = new b2.l();
        this.f17096i = new z1.g0(new c50.p(this, 22));
        this.f17097j = true;
        this.l = new a0(this, 0);
        this.f17099m = new h2.e();
        this.f17100n = new h0();
        this.f17101o = new h2.o();
        this.f17102p = new z0(new y(this, i11));
        this.f17103q = new z(this);
        this.f17104r = new v0();
        this.f17105s = h2.q.h();
        Boolean bool = Boolean.FALSE;
        this.f17106t = m3.i.w(bool);
        this.f17107u = m3.i.w(bool);
        this.f17108v = h2.q.h();
        this.f17109w = new dn.k(16);
    }

    public static Object l(c0 c0Var, int i11, z70.i iVar) {
        c0Var.getClass();
        Object objA = c0Var.a(j1.Default, new b2(c0Var, i11, null, 20), iVar);
        return objA == y70.a.COROUTINE_SUSPENDED ? objA : Unit.f26487a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r5.f17096i.a(r6, r7, r0) == r1) goto L23;
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
    @Override // z1.h3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(v1.j1 r6, kotlin.jvm.functions.Function2 r7, z70.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof f2.b0
            if (r0 == 0) goto L13
            r0 = r8
            f2.b0 r0 = (f2.b0) r0
            int r1 = r0.f17074n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17074n = r1
            goto L18
        L13:
            f2.b0 r0 = new f2.b0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f17074n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r8)
            goto L6b
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L31:
            z70.i r6 = r0.f17072k
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            v1.j1 r6 = r0.f17071j
            ba0.g.M(r8)
            goto L5b
        L3c:
            ba0.g.M(r8)
            m3.k1 r8 = r5.f17093f
            java.lang.Object r8 = r8.getValue()
            f2.s r2 = f2.e0.f17114a
            if (r8 != r2) goto L5b
            r0.f17071j = r6
            r8 = r7
            z70.i r8 = (z70.i) r8
            r0.f17072k = r8
            r0.f17074n = r4
            h2.e r8 = r5.f17099m
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L5b
            goto L6a
        L5b:
            r8 = 0
            r0.f17071j = r8
            r0.f17072k = r8
            r0.f17074n = r3
            z1.g0 r8 = r5.f17096i
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.c0.a(v1.j1, kotlin.jvm.functions.Function2, z70.c):java.lang.Object");
    }

    @Override // z1.h3
    public final boolean b() {
        return this.f17096i.b();
    }

    @Override // z1.h3
    public final boolean c() {
        return ((Boolean) this.f17107u.getValue()).booleanValue();
    }

    @Override // z1.h3
    public final boolean d() {
        return ((Boolean) this.f17106t.getValue()).booleanValue();
    }

    @Override // z1.h3
    public final float e(float f11) {
        return this.f17096i.e(f11);
    }

    public final Object f(int i11, int i12, z70.i iVar) {
        Object objA = a(j1.Default, new b0.z0(i11, i12, this, (x70.c) null), iVar);
        return objA == y70.a.COROUTINE_SUSPENDED ? objA : Unit.f26487a;
    }

    public final void g(s sVar, boolean z11, boolean z12) {
        String str;
        long j9;
        List list = sVar.f17192k;
        int i11 = sVar.f17194n;
        int i12 = sVar.f17183b;
        t tVar = sVar.f17182a;
        this.f17102p.f21255e = list.size();
        dn.k kVar = this.f17109w;
        w wVar = this.f17092e;
        if (!z11 && this.f17089b) {
            this.f17090c = sVar;
            z3.g gVarC = z3.v.c();
            Function1 function1E = gVarC != null ? gVarC.e() : null;
            z3.g gVarD = z3.v.d(gVarC);
            try {
                if (((Number) ((t1.j) kVar.f15019c).f39464b.getValue()).floatValue() != 0.0f && tVar != null && tVar.f17199a == wVar.f17224b.h() && i12 == wVar.f17225c.h()) {
                    v80.b2 b2Var = (v80.b2) kVar.f15018b;
                    if (b2Var != null) {
                        b2Var.a(null);
                    }
                    FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                    kVar.f15019c = new t1.j(t1.c.f39389j, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                z3.v.f(gVarC, gVarD, function1E);
            }
        }
        if (z11) {
            this.f17089b = true;
        }
        this.f17107u.setValue(Boolean.valueOf(((tVar != null ? tVar.f17199a : 0) == 0 && i12 == 0) ? false : true));
        this.f17106t.setValue(Boolean.valueOf(sVar.f17184c));
        this.f17095h -= sVar.f17185d;
        this.f17093f.setValue(sVar);
        if (z12) {
            wVar.getClass();
            if (!(((float) i12) >= 0.0f)) {
                c2.a.c("scrollOffset should be non-negative");
            }
            wVar.f17225c.i(i12);
        } else {
            t tVar2 = (t) CollectionsKt.firstOrNull(list);
            t tVar3 = (t) CollectionsKt.X(list);
            if (tVar2 != null) {
                str = "scrollOffset should be non-negative";
                j9 = tVar2.f17199a;
            } else {
                str = "scrollOffset should be non-negative";
                j9 = -1;
            }
            b6.a.A(j9, "firstVisibleItem:index");
            b6.a.A(tVar3 != null ? tVar3.f17199a : -1L, "lastVisibleItem:index");
            wVar.getClass();
            wVar.f17227e = tVar != null ? tVar.l : null;
            if (wVar.f17226d || i11 > 0) {
                wVar.f17226d = true;
                if (!(((float) i12) >= 0.0f)) {
                    c2.a.c(str);
                }
                wVar.a(tVar != null ? tVar.f17199a : 0, i12);
            }
            if (this.f17097j) {
                a aVar = this.f17088a;
                int i13 = aVar.f17053a;
                boolean z13 = aVar.f17054b;
                if (i13 != -1 && !list.isEmpty() && i13 != a.b(sVar, z13)) {
                    aVar.f17053a = -1;
                    x0 x0Var = (x0) aVar.f17057e;
                    if (x0Var != null) {
                        x0Var.cancel();
                    }
                    aVar.f17057e = null;
                }
                int i14 = aVar.f17055c;
                if (i14 != -1 && aVar.f17056d != 0.0f && i14 != i11 && !list.isEmpty()) {
                    int iB = a.b(sVar, aVar.f17056d < 0.0f);
                    if (iB >= 0 && iB < i11) {
                        aVar.f17053a = iB;
                        aVar.f17057e = u.a(this.f17103q, iB);
                    }
                }
                aVar.f17055c = i11;
            }
        }
        if (z11) {
            kVar.B(sVar.f17187f, sVar.f17190i, sVar.f17189h);
        }
    }

    public final int h() {
        return this.f17092e.f17224b.h();
    }

    public final int i() {
        return this.f17092e.f17225c.h();
    }

    public final s j() {
        return (s) this.f17093f.getValue();
    }

    public final void k(float f11, s sVar) {
        x0 x0Var;
        x0 x0Var2;
        if (this.f17097j) {
            boolean zIsEmpty = sVar.f17192k.isEmpty();
            a aVar = this.f17088a;
            if (!zIsEmpty) {
                boolean z11 = f11 < 0.0f;
                int iB = a.b(sVar, z11);
                if (iB >= 0 && iB < sVar.f17194n) {
                    if (iB != aVar.f17053a) {
                        if (aVar.f17054b != z11) {
                            aVar.f17053a = -1;
                            x0 x0Var3 = (x0) aVar.f17057e;
                            if (x0Var3 != null) {
                                x0Var3.cancel();
                            }
                            aVar.f17057e = null;
                        }
                        aVar.f17054b = z11;
                        aVar.f17053a = iB;
                        aVar.f17057e = u.a(this.f17103q, iB);
                    }
                    List list = sVar.f17192k;
                    if (z11) {
                        t tVar = (t) ((m) CollectionsKt.W(list));
                        if (((tVar.f17213p + tVar.f17214q) + sVar.f17198r) - sVar.f17193m < (-f11) && (x0Var2 = (x0) aVar.f17057e) != null) {
                            x0Var2.a();
                        }
                    } else if (sVar.l - ((t) ((m) CollectionsKt.O(list))).f17213p < f11 && (x0Var = (x0) aVar.f17057e) != null) {
                        x0Var.a();
                    }
                }
            }
            aVar.f17056d = f11;
        }
    }

    public final void m(int i11, int i12) {
        w wVar = this.f17092e;
        if (wVar.f17224b.h() != i11 || wVar.f17225c.h() != i12) {
            h0 h0Var = this.f17100n;
            h0Var.e();
            h0Var.f21116b = null;
            h0Var.f21117c = -1;
        }
        wVar.a(i11, i12);
        wVar.f17227e = null;
        o1 o1Var = this.f17098k;
        if (o1Var != null) {
            ((m0) o1Var).k();
        }
    }
}

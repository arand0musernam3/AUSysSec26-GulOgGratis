package g2;

import h2.h0;
import h2.v0;
import h2.x0;
import h2.z0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import m3.b1;
import m3.k1;
import z1.g0;
import z1.h2;
import z1.h3;
import z4.o1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements h3 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ub.a f18125w = y3.j.b(new cn.u(26, 0), new q(1));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2.a f18126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f18128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f2.w f18129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f18130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2.l f18131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g0 f18133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f18134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o1 f18135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f2.a0 f18136k;
    public final h2.e l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h0 f18137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h2.o f18138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z0 f18139o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f18140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v0 f18141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b1 f18142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b1 f18143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k1 f18144t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final k1 f18145u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final dn.k f18146v;

    public b0(int i11, int i12) {
        f2.a aVar = new f2.a();
        aVar.f17053a = -1;
        aVar.f17057e = new o3.e(new x0[16], 0);
        aVar.f17055c = -1;
        this.f18126a = aVar;
        this.f18129d = new f2.w(i11, i12, 1);
        this.f18130e = new k1(c0.f18151a, m3.f.f29272d);
        this.f18131f = new b2.l();
        this.f18133h = new g0(new c50.p(this, 25));
        this.f18134i = true;
        this.f18136k = new f2.a0(this, 1);
        this.l = new h2.e();
        this.f18137m = new h0();
        this.f18138n = new h2.o();
        this.f18139o = new z0(new b3.q(this, i11, 2));
        this.f18140p = new z(this);
        this.f18141q = new v0();
        this.f18142r = h2.q.h();
        this.f18143s = h2.q.h();
        Boolean bool = Boolean.FALSE;
        this.f18144t = m3.i.w(bool);
        this.f18145u = m3.i.w(bool);
        this.f18146v = new dn.k(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r5.f18133h.a(r6, r7, r0) == r1) goto L23;
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
            boolean r0 = r8 instanceof g2.a0
            if (r0 == 0) goto L13
            r0 = r8
            g2.a0 r0 = (g2.a0) r0
            int r1 = r0.f18123n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18123n = r1
            goto L18
        L13:
            g2.a0 r0 = new g2.a0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f18123n
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
            z70.i r6 = r0.f18121k
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            v1.j1 r6 = r0.f18120j
            ba0.g.M(r8)
            goto L5b
        L3c:
            ba0.g.M(r8)
            m3.k1 r8 = r5.f18130e
            java.lang.Object r8 = r8.getValue()
            g2.r r2 = g2.c0.f18151a
            if (r8 != r2) goto L5b
            r0.f18120j = r6
            r8 = r7
            z70.i r8 = (z70.i) r8
            r0.f18121k = r8
            r0.f18123n = r4
            h2.e r8 = r5.l
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L5b
            goto L6a
        L5b:
            r8 = 0
            r0.f18120j = r8
            r0.f18121k = r8
            r0.f18123n = r3
            z1.g0 r8 = r5.f18133h
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.b0.a(v1.j1, kotlin.jvm.functions.Function2, z70.c):java.lang.Object");
    }

    @Override // z1.h3
    public final boolean b() {
        return this.f18133h.b();
    }

    @Override // z1.h3
    public final boolean c() {
        return ((Boolean) this.f18145u.getValue()).booleanValue();
    }

    @Override // z1.h3
    public final boolean d() {
        return ((Boolean) this.f18144t.getValue()).booleanValue();
    }

    @Override // z1.h3
    public final float e(float f11) {
        return this.f18133h.e(f11);
    }

    public final void f(r rVar, boolean z11, boolean z12) {
        s sVar;
        s sVar2;
        List list = rVar.f18219m;
        int i11 = rVar.f18222p;
        int i12 = rVar.f18209b;
        t tVar = rVar.f18208a;
        this.f18139o.f21255e = list.size();
        if (!z11 && this.f18127b) {
            this.f18128c = rVar;
            return;
        }
        if (z11) {
            this.f18127b = true;
        }
        this.f18132g -= rVar.f18211d;
        this.f18130e.setValue(rVar);
        this.f18145u.setValue(Boolean.valueOf(((tVar != null ? tVar.f18248a : 0) == 0 && i12 == 0) ? false : true));
        this.f18144t.setValue(Boolean.valueOf(rVar.f18210c));
        f2.w wVar = this.f18129d;
        if (z12) {
            wVar.getClass();
            if (!(((float) i12) >= 0.0f)) {
                c2.a.c("scrollOffset should be non-negative");
            }
            wVar.f17225c.i(i12);
        } else {
            wVar.getClass();
            wVar.f17227e = (tVar == null || (sVar2 = (s) kotlin.collections.y.y(tVar.f18249b)) == null) ? null : sVar2.f18227b;
            if (wVar.f17226d || i11 > 0) {
                wVar.f17226d = true;
                if (!(((float) i12) >= 0.0f)) {
                    c2.a.c("scrollOffset should be non-negative (" + i12 + ')');
                }
                wVar.a((tVar == null || (sVar = (s) kotlin.collections.y.y(tVar.f18249b)) == null) ? 0 : sVar.f18226a, i12);
            }
            if (this.f18134i) {
                f2.a aVar = this.f18126a;
                o3.e eVar = (o3.e) aVar.f17057e;
                int i13 = aVar.f17053a;
                boolean z13 = aVar.f17054b;
                if (i13 != -1 && !list.isEmpty() && i13 != f2.a.c(rVar, z13)) {
                    aVar.f17053a = -1;
                    Object[] objArr = eVar.f31830a;
                    int i14 = eVar.f31832c;
                    for (int i15 = 0; i15 < i14; i15++) {
                        ((x0) objArr[i15]).cancel();
                    }
                    eVar.g();
                }
                int i16 = aVar.f17055c;
                if (i16 != -1 && aVar.f17056d != 0.0f && i16 != i11 && !list.isEmpty()) {
                    int iC = f2.a.c(rVar, aVar.f17056d < 0.0f);
                    int iA = f2.a.a(rVar, aVar.f17056d < 0.0f);
                    if (iA >= 0 && iA < i11 && iC != aVar.f17053a && iC >= 0) {
                        aVar.f17053a = iC;
                        eVar.g();
                        eVar.c(eVar.f31832c, this.f18140p.a(iC));
                    }
                }
                aVar.f17055c = i11;
            }
        }
        if (z11) {
            this.f18146v.B(rVar.f18213f, rVar.f18216i, rVar.f18215h);
        }
    }

    public final r g() {
        return (r) this.f18130e.getValue();
    }

    public final void h(float f11, r rVar) {
        if (this.f18134i) {
            f2.a aVar = this.f18126a;
            o3.e eVar = (o3.e) aVar.f17057e;
            List list = rVar.f18219m;
            h2 h2Var = rVar.f18223q;
            if (!list.isEmpty()) {
                int i11 = 0;
                boolean z11 = f11 < 0.0f;
                int iC = f2.a.c(rVar, z11);
                int iA = f2.a.a(rVar, z11);
                if (iA >= 0 && iA < rVar.f18222p) {
                    if (iC != aVar.f17053a && iC >= 0) {
                        if (aVar.f17054b != z11) {
                            Object[] objArr = eVar.f31830a;
                            int i12 = eVar.f31832c;
                            for (int i13 = 0; i13 < i12; i13++) {
                                ((x0) objArr[i13]).cancel();
                            }
                        }
                        aVar.f17054b = z11;
                        aVar.f17053a = iC;
                        eVar.g();
                        eVar.c(eVar.f31832c, this.f18140p.a(iC));
                    }
                    List list2 = rVar.f18219m;
                    if (z11) {
                        j jVar = (j) CollectionsKt.W(list2);
                        if (((b0.z.x(jVar, h2Var) + ((int) (h2Var == h2.Vertical ? ((s) jVar).f18243s & 4294967295L : ((s) jVar).f18243s >> 32))) + rVar.f18225s) - rVar.f18221o < (-f11)) {
                            Object[] objArr2 = eVar.f31830a;
                            int i14 = eVar.f31832c;
                            while (i11 < i14) {
                                ((x0) objArr2[i11]).a();
                                i11++;
                            }
                        }
                    } else if (rVar.f18220n - b0.z.x((j) CollectionsKt.O(list2), h2Var) < f11) {
                        Object[] objArr3 = eVar.f31830a;
                        int i15 = eVar.f31832c;
                        while (i11 < i15) {
                            ((x0) objArr3[i11]).a();
                            i11++;
                        }
                    }
                }
            }
            aVar.f17056d = f11;
        }
    }
}

package v1;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import b5.i2;
import b5.l2;
import b5.q2;
import c5.u3;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KProperty;
import z1.r2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends b5.n implements i2, u4.e, l2, q2, b5.k, b5.y1, t4.c {
    public static final b L = new b();
    public b5.l A;
    public b2.n B;
    public b2.h C;
    public final q1.k0 D;
    public long E;
    public b2.n F;
    public b2.l G;
    public boolean H;
    public ub.a I;
    public v80.b2 J;
    public final b K;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b2.l f41721q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e1 f41722r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f41723s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f41724t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j5.j f41725u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f41726v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Function0 f41727w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p0 f41728x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e1 f41729y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public w4.m0 f41730z;

    public g(b2.l lVar, e1 e1Var, boolean z11, boolean z12, String str, j5.j jVar, Function0 function0) {
        this.f41721q = lVar;
        this.f41722r = e1Var;
        this.f41723s = z11;
        this.f41724t = str;
        this.f41725u = jVar;
        this.f41726v = z12;
        this.f41727w = function0;
        this.f41728x = new p0(lVar, 0, new al.d(1, this, g.class, "onFocusChange", "onFocusChange(Z)V", 0, 25));
        q1.k0 k0Var = q1.w.f35850a;
        this.D = new q1.k0();
        this.E = 0L;
        b2.l lVar2 = this.f41721q;
        this.G = lVar2;
        this.H = lVar2 == null;
        this.K = L;
    }

    public void F() {
        b2.h hVar;
        b2.l lVar = this.f41721q;
        if (lVar != null && (hVar = this.C) != null) {
            lVar.c(new b2.i(hVar));
        }
        this.C = null;
        w4.m0 m0Var = this.f41730z;
        if (m0Var != null) {
            m0Var.F();
        }
    }

    @Override // b5.l2
    public final boolean F0() {
        return true;
    }

    public abstract w4.m0 P0();

    public final boolean Q0() {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        b5.o.o(this, r2.f46667p, new a3.q1(booleanRef, 1));
        if (!booleanRef.element) {
            int i11 = c0.f41700b;
            ViewParent parent = b5.o.n(this).getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!viewGroup.shouldDelayChildPressedState()) {
                    parent = viewGroup.getParent();
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R0() {
        /*
            r17 = this;
            r0 = r17
            b2.l r1 = r0.f41721q
            q1.k0 r2 = r0.D
            if (r1 == 0) goto L76
            b2.n r3 = r0.B
            if (r3 == 0) goto L14
            b2.m r4 = new b2.m
            r4.<init>(r3)
            r1.c(r4)
        L14:
            b2.n r3 = r0.F
            if (r3 == 0) goto L20
            b2.m r4 = new b2.m
            r4.<init>(r3)
            r1.c(r4)
        L20:
            b2.h r3 = r0.C
            if (r3 == 0) goto L2c
            b2.i r4 = new b2.i
            r4.<init>(r3)
            r1.c(r4)
        L2c:
            java.lang.Object[] r3 = r2.f35836c
            long[] r4 = r2.f35834a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L76
            r6 = 0
            r7 = r6
        L37:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L71
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L51:
            if (r12 >= r10) goto L6f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L6b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            b2.n r13 = (b2.n) r13
            b2.m r14 = new b2.m
            r14.<init>(r13)
            r1.c(r14)
        L6b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L51
        L6f:
            if (r10 != r11) goto L76
        L71:
            if (r7 == r5) goto L76
            int r7 = r7 + 1
            goto L37
        L76:
            r1 = 0
            r0.B = r1
            r0.F = r1
            r0.C = r1
            r2.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.g.R0():void");
    }

    public final void S0(boolean z11) {
        b2.l lVar = this.f41721q;
        if (lVar != null) {
            v80.b2 b2Var = this.J;
            x70.c cVar = null;
            if (b2Var == null || !b2Var.g()) {
                b2.n nVar = z11 ? this.F : this.B;
                if (nVar != null) {
                    b2.m mVar = new b2.m(nVar);
                    v80.i1 i1Var = (v80.i1) getCoroutineScope().getCoroutineContext().get(v80.h1.f42106a);
                    v80.f0.B(getCoroutineScope(), null, null, new tg.g(lVar, mVar, i1Var != null ? i1Var.J(new ry.b(17, lVar, mVar)) : null, cVar, 4), 3);
                }
            } else {
                v80.b2 b2Var2 = this.J;
                if (b2Var2 != null) {
                    b2Var2.a(null);
                }
            }
            if (z11) {
                this.F = null;
            } else {
                this.B = null;
            }
        }
    }

    public final void T0(long j9, boolean z11) {
        b2.l lVar = this.f41721q;
        if (lVar != null) {
            v80.b2 b2Var = this.J;
            if (b2Var == null || !b2Var.g()) {
                b2.n nVar = z11 ? this.F : this.B;
                if (nVar != null) {
                    v80.f0.B(getCoroutineScope(), null, null, new d(nVar, lVar, (x70.c) null), 3);
                }
            } else {
                b2Var.a(null);
                v80.f0.B(getCoroutineScope(), null, null, new a3.w(b2Var, j9, lVar, (x70.c) null, 8), 3);
            }
            if (z11) {
                this.F = null;
            } else {
                this.B = null;
            }
        }
    }

    public final void U0(long j9, boolean z11) {
        b2.l lVar = this.f41721q;
        if (lVar != null) {
            b2.n nVar = new b2.n(j9);
            if (Q0()) {
                this.J = v80.f0.B(getCoroutineScope(), null, null, new ep.a0(lVar, nVar, z11, this, (x70.c) null, 8), 3);
                return;
            }
            if (z11) {
                this.F = nVar;
            } else {
                this.B = nVar;
            }
            v80.f0.B(getCoroutineScope(), null, null, new d(lVar, nVar, (x70.c) null), 3);
        }
    }

    public final void V0() {
        if (this.A != null) {
            return;
        }
        e1 e1Var = this.f41723s ? this.f41729y : this.f41722r;
        if (e1Var != null) {
            if (this.f41721q == null) {
                this.f41721q = new b2.l();
            }
            this.f41728x.Q0(this.f41721q);
            b2.l lVar = this.f41721q;
            lVar.getClass();
            b5.l lVarA = e1Var.a(lVar);
            L0(lVarA);
            this.A = lVarA;
        }
    }

    public abstract boolean X0(KeyEvent keyEvent);

    public abstract void Y0(KeyEvent keyEvent);

    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z0(b2.l r4, v1.e1 r5, boolean r6, boolean r7, java.lang.String r8, j5.j r9, kotlin.jvm.functions.Function0 r10) {
        /*
            r3 = this;
            b2.l r0 = r3.G
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.R0()
            r3.G = r4
            r3.f41721q = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            v1.e1 r0 = r3.f41722r
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r5)
            if (r0 != 0) goto L1f
            r3.f41722r = r5
            r4 = r1
        L1f:
            boolean r5 = r3.f41723s
            if (r5 == r6) goto L2b
            r3.f41723s = r6
            if (r6 == 0) goto L2a
            r3.l0()
        L2a:
            r4 = r1
        L2b:
            boolean r5 = r3.f41726v
            v1.p0 r6 = r3.f41728x
            if (r5 == r7) goto L46
            if (r7 == 0) goto L37
            r3.L0(r6)
            goto L3d
        L37:
            r3.M0(r6)
            r3.R0()
        L3d:
            b5.m0 r5 = b5.m.g(r3)
            r5.G()
            r3.f41726v = r7
        L46:
            java.lang.String r5 = r3.f41724t
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r8)
            if (r5 != 0) goto L57
            r3.f41724t = r8
            b5.m0 r5 = b5.m.g(r3)
            r5.G()
        L57:
            j5.j r5 = r3.f41725u
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r9)
            if (r5 != 0) goto L68
            r3.f41725u = r9
            b5.m0 r5 = b5.m.g(r3)
            r5.G()
        L68:
            r3.f41727w = r10
            boolean r5 = r3.H
            b2.l r7 = r3.G
            if (r7 != 0) goto L72
            r8 = r1
            goto L73
        L72:
            r8 = r2
        L73:
            if (r5 == r8) goto L81
            if (r7 != 0) goto L78
            r2 = r1
        L78:
            r3.H = r2
            if (r2 != 0) goto L81
            b5.l r5 = r3.A
            if (r5 != 0) goto L81
            goto L82
        L81:
            r1 = r4
        L82:
            if (r1 == 0) goto L97
            b5.l r4 = r3.A
            if (r4 != 0) goto L8c
            boolean r5 = r3.H
            if (r5 != 0) goto L97
        L8c:
            if (r4 == 0) goto L91
            r3.M0(r4)
        L91:
            r4 = 0
            r3.A = r4
            r3.V0()
        L97:
            b2.l r4 = r3.f41721q
            r6.Q0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.g.Z0(b2.l, v1.e1, boolean, boolean, java.lang.String, j5.j, kotlin.jvm.functions.Function0):void");
    }

    @Override // t4.c
    public final void d0() {
        ub.a aVar = this.I;
        if (aVar != null) {
            aVar.I();
        }
    }

    @Override // u4.e
    public final boolean e(KeyEvent keyEvent) {
        return false;
    }

    @Override // t4.c
    public final void f0(a3.j jVar, w4.o oVar) {
        ArrayList arrayList = (ArrayList) jVar.f399c;
        V0();
        if (this.f41726v) {
            if (this.I == null) {
                this.I = new ub.a(this, 2);
            }
            ub.a aVar = this.I;
            if (aVar != null) {
                Function0 function0 = this.f41727w;
                g gVar = (g) aVar.f40981b;
                int i11 = 0;
                if (oVar != w4.o.Main) {
                    if (oVar != w4.o.Final || ((t4.b) aVar.f40982c) == null) {
                        return;
                    }
                    int size = arrayList.size();
                    while (i11 < size) {
                        t4.b bVar = (t4.b) arrayList.get(i11);
                        if (bVar.f39788i && !Intrinsics.areEqual(bVar, (t4.b) aVar.f40982c)) {
                            aVar.I();
                            return;
                        }
                        i11++;
                    }
                    return;
                }
                t4.b bVar2 = (t4.b) aVar.f40982c;
                if (bVar2 == null) {
                    int size2 = arrayList.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        t4.b bVar3 = (t4.b) arrayList.get(i12);
                        if (!bVar3.f39787h && bVar3.f39783d) {
                            t4.b bVar4 = (t4.b) arrayList.get(0);
                            aVar.f40982c = bVar4;
                            gVar.U0(bVar4.f39782c, true);
                            bVar4.f39788i = true;
                            return;
                        }
                    }
                    return;
                }
                long j9 = bVar2.f39782c;
                int size3 = arrayList.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    t4.b bVar5 = (t4.b) arrayList.get(i13);
                    if (bVar5.f39787h && bVar5.f39783d) {
                        if (Math.abs(h4.b.c(h4.b.e(((t4.b) arrayList.get(0)).f39782c, j9))) > ((u3) b5.o.e(gVar, c5.x1.f7426s)).f()) {
                            aVar.I();
                            return;
                        }
                        return;
                    }
                }
                int size4 = arrayList.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    t4.b bVar6 = (t4.b) arrayList.get(i14);
                    if (bVar6.f39788i || !bVar6.f39787h || bVar6.f39783d) {
                        int size5 = arrayList.size();
                        while (i11 < size5) {
                            if (((t4.b) arrayList.get(i11)).f39788i) {
                                aVar.I();
                                return;
                            }
                            i11++;
                        }
                        return;
                    }
                }
                ((t4.b) arrayList.get(0)).f39788i = true;
                gVar.T0(j9, true);
                function0.invoke();
                aVar.f40982c = null;
            }
        }
    }

    @Override // b5.q2
    public final Object g() {
        return this.K;
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b5.l2
    public final void h0(j5.b0 b0Var) {
        j5.j jVar = this.f41725u;
        if (jVar != null) {
            j5.z.m(b0Var, jVar.f24632a);
        }
        String str = this.f41724t;
        a aVar = new a(this, 1);
        KProperty[] kPropertyArr = j5.z.f24734a;
        b0Var.b(j5.m.f24658b, new j5.a(str, aVar));
        if (this.f41726v) {
            this.f41728x.h0(b0Var);
        } else {
            b0Var.b(j5.x.f24715i, Unit.f26487a);
        }
        O0(b0Var);
    }

    @Override // b5.y1
    public final void l0() {
        if (this.f41723s) {
            b5.o.m(this, new a(this, 0));
        }
    }

    @Override // b4.s
    public final void onAttach() {
        l0();
        if (!this.H) {
            V0();
        }
        if (this.f41726v) {
            L0(this.f41728x);
        }
    }

    @Override // b4.s
    public final void onDetach() {
        R0();
        if (this.G == null) {
            this.f41721q = null;
        }
        b5.l lVar = this.A;
        if (lVar != null) {
            M0(lVar);
        }
        this.A = null;
    }

    public void p0(w4.n nVar, w4.o oVar, long j9) {
        w4.m0 m0VarP0;
        long j11 = ((j9 >> 33) << 32) | (((j9 << 32) >> 33) & 4294967295L);
        this.E = (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L);
        V0();
        if (this.f41726v && oVar == w4.o.Main) {
            int i11 = nVar.f43170f;
            x70.c cVar = null;
            if (i11 == 4) {
                v80.f0.B(getCoroutineScope(), null, null, new f(this, cVar, 0), 3);
            } else if (i11 == 5) {
                v80.f0.B(getCoroutineScope(), null, null, new f(this, cVar, 1), 3);
            }
        }
        if (this.f41730z == null && (m0VarP0 = P0()) != null) {
            L0(m0VarP0);
            this.f41730z = m0VarP0;
        }
        w4.m0 m0Var = this.f41730z;
        if (m0Var != null) {
            m0Var.p0(nVar, oVar, j9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // u4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(android.view.KeyEvent r11) {
        /*
            r10 = this;
            r10.V0()
            long r0 = u4.c.b(r11)
            boolean r2 = r10.f41726v
            r3 = 3
            r4 = 0
            q1.k0 r5 = r10.D
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4b
            int r2 = u4.c.c(r11)
            r8 = 2
            if (r2 != r8) goto L4b
            boolean r2 = androidx.compose.foundation.b.e(r11)
            if (r2 == 0) goto L4b
            boolean r2 = r5.a(r0)
            if (r2 != 0) goto L41
            b2.n r2 = new b2.n
            long r8 = r10.E
            r2.<init>(r8)
            r5.h(r0, r2)
            b2.l r0 = r10.f41721q
            if (r0 == 0) goto L3f
            v80.b0 r0 = r10.getCoroutineScope()
            v1.e r1 = new v1.e
            r5 = 2
            r1.<init>(r10, r2, r4, r5)
            v80.f0.B(r0, r4, r4, r1, r3)
        L3f:
            r0 = r6
            goto L42
        L41:
            r0 = r7
        L42:
            boolean r11 = r10.X0(r11)
            if (r11 != 0) goto L79
            if (r0 == 0) goto L7a
            goto L79
        L4b:
            boolean r2 = r10.f41726v
            if (r2 == 0) goto L7a
            int r2 = u4.c.c(r11)
            if (r2 != r6) goto L7a
            boolean r2 = androidx.compose.foundation.b.e(r11)
            if (r2 == 0) goto L7a
            java.lang.Object r0 = r5.g(r0)
            b2.n r0 = (b2.n) r0
            if (r0 == 0) goto L77
            b2.l r1 = r10.f41721q
            if (r1 == 0) goto L74
            v80.b0 r1 = r10.getCoroutineScope()
            v1.e r2 = new v1.e
            r5 = 3
            r2.<init>(r10, r0, r4, r5)
            v80.f0.B(r1, r4, r4, r2, r3)
        L74:
            r10.Y0(r11)
        L77:
            if (r0 == 0) goto L7a
        L79:
            return r6
        L7a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.g.w(android.view.KeyEvent):boolean");
    }

    public void W0() {
    }

    public void O0(j5.b0 b0Var) {
    }
}

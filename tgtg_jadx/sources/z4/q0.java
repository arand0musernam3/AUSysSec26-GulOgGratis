package z4;

import android.os.Handler;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m3.i2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements m3.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b5.m0 f47200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m3.x f47201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a2 f47202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q1.t0 f47205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q1.t0 f47206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l0 f47207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i0 f47208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q1.t0 f47209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q1.n1 f47210k;
    public final q1.t0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o3.e f47211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f47212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f47213o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f47214p;

    public q0(b5.m0 m0Var, a2 a2Var) {
        this.f47200a = m0Var;
        this.f47202c = a2Var;
        long[] jArr = q1.g1.f35760a;
        this.f47205f = new q1.t0();
        this.f47206g = new q1.t0();
        this.f47207h = new l0(this);
        this.f47208i = new i0(this);
        this.f47209j = new q1.t0();
        this.f47210k = new q1.n1();
        this.l = new q1.t0();
        this.f47211m = new o3.e(new Object[16], 0);
        this.f47214p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void d(j0 j0Var) {
        q1.u0 u0Var;
        m3.p1 p1Var = j0Var.f47154f;
        if (p1Var != null) {
            p1Var.f29370h.set(m3.q1.Cancelled);
            g0.c cVar = p1Var.f29373k;
            if (((q1.u0) cVar.f18001d).c()) {
                u0Var = (q1.u0) cVar.f18001d;
                q1.u0 u0Var2 = q1.j1.f35777a;
                cVar.f18001d = new q1.u0();
                ((o3.e) cVar.f18000c).g();
            } else {
                u0Var = null;
            }
            cVar.b();
            m3.a0 a0Var = p1Var.f29363a;
            a0Var.f29190q = null;
            if (u0Var != null) {
                a0Var.f29194u.f18008k = u0Var;
                a0Var.f29196w = 2;
            }
            j0Var.f47154f = null;
            i2 i2Var = j0Var.f47151c;
            if (i2Var != null) {
                ((m3.a0) i2Var).p();
            }
            j0Var.f47151c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    @Override // m3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            b5.m0 r2 = r0.f47200a
            r2.f5881r = r1
            q1.t0 r1 = r0.f47205f
            java.lang.Object[] r3 = r1.f35754c
            long[] r4 = r1.f35752a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L54
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4f
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L49
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            z4.j0 r13 = (z4.j0) r13
            m3.i2 r13 = r13.f47151c
            if (r13 == 0) goto L49
            m3.a0 r13 = (m3.a0) r13
            r13.p()
        L49:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4d:
            if (r10 != r11) goto L54
        L4f:
            if (r7 == r5) goto L54
            int r7 = r7 + 1
            goto L14
        L54:
            r2.S()
            r2.f5881r = r6
            r1.g()
            q1.t0 r1 = r0.f47206g
            r1.g()
            r0.f47213o = r6
            r0.f47212n = r6
            q1.t0 r1 = r0.f47209j
            r1.g()
            r0.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.q0.a():void");
    }

    @Override // m3.j
    public final void b() {
        h(true);
    }

    public final void c(j0 j0Var, boolean z11) {
        m3.p1 p1Var = j0Var.f47154f;
        if (p1Var != null) {
            z3.g gVarC = z3.v.c();
            Function1 function1E = gVarC != null ? gVarC.e() : null;
            z3.g gVarD = z3.v.d(gVarC);
            try {
                b5.m0 m0Var = this.f47200a;
                m0Var.f5881r = true;
                if (z11) {
                    while (!p1Var.c()) {
                        try {
                            p1Var.e(new wy.o(15));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                p1Var.a();
                j0Var.f47154f = null;
                m0Var.f5881r = false;
            } finally {
                z3.v.f(gVarC, gVarD, function1E);
            }
        }
    }

    public final w1 e(Object obj) {
        return !this.f47200a.I() ? new o0() : new p0(this, obj);
    }

    public final void f(int i11) {
        boolean z11;
        boolean z12 = false;
        this.f47212n = 0;
        List listO = this.f47200a.o();
        o3.b bVar = (o3.b) listO;
        int i12 = (((o3.e) bVar.f31822b).f31832c - this.f47213o) - 1;
        if (i11 <= i12) {
            this.f47210k.clear();
            if (i11 <= i12) {
                int i13 = i11;
                while (true) {
                    Object objD = this.f47205f.d((b5.m0) bVar.get(i13));
                    objD.getClass();
                    ((q1.p0) this.f47210k.f35797b).b(((j0) objD).f47149a);
                    if (i13 == i12) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.f47202c.g(this.f47210k);
            z3.g gVarC = z3.v.c();
            Function1 function1E = gVarC != null ? gVarC.e() : null;
            z3.g gVarD = z3.v.d(gVarC);
            z11 = false;
            while (i12 >= i11) {
                try {
                    b5.m0 m0Var = (b5.m0) ((o3.b) listO).get(i12);
                    Object objD2 = this.f47205f.d(m0Var);
                    objD2.getClass();
                    j0 j0Var = (j0) objD2;
                    Object obj = j0Var.f47149a;
                    if (((q1.p0) this.f47210k.f35797b).a(obj)) {
                        this.f47212n++;
                        if (((Boolean) j0Var.f47155g.getValue()).booleanValue()) {
                            b5.q0 q0Var = m0Var.H;
                            b5.f1 f1Var = q0Var.f5942p;
                            b5.j0 j0Var2 = b5.j0.NotUsed;
                            f1Var.l = j0Var2;
                            b5.z0 z0Var = q0Var.f5943q;
                            if (z0Var != null) {
                                z0Var.f6023j = j0Var2;
                            }
                            j(j0Var, false);
                            if (j0Var.f47156h) {
                                z11 = true;
                            }
                        }
                    } else {
                        b5.m0 m0Var2 = this.f47200a;
                        m0Var2.f5881r = true;
                        this.f47205f.k(m0Var);
                        i2 i2Var = j0Var.f47151c;
                        if (i2Var != null) {
                            ((m3.a0) i2Var).p();
                        }
                        this.f47200a.T(i12, 1);
                        m0Var2.f5881r = false;
                    }
                    this.f47206g.k(obj);
                    i12--;
                } catch (Throwable th2) {
                    z3.v.f(gVarC, gVarD, function1E);
                    throw th2;
                }
            }
            z3.v.f(gVarC, gVarD, function1E);
        } else {
            z11 = false;
        }
        if (z11) {
            synchronized (z3.l.f47038c) {
                q1.u0 u0Var = z3.l.f47045j.f46981h;
                if (u0Var != null) {
                    if (u0Var.c()) {
                        z12 = true;
                    }
                }
            }
            if (z12) {
                z3.l.a();
            }
        }
        g();
    }

    public final void g() {
        int i11 = ((o3.e) ((o3.b) this.f47200a.o()).f31822b).f31832c;
        q1.t0 t0Var = this.f47205f;
        if (t0Var.f35756e != i11) {
            y4.a.a("Inconsistency between the count of nodes tracked by the state (" + t0Var.f35756e + ") and the children count on the SubcomposeLayout (" + i11 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i11 - this.f47212n) - this.f47213o < 0) {
            StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Incorrect state. Total children ", ". Reusable children ");
            sbK.append(this.f47212n);
            sbK.append(". Precomposed children ");
            sbK.append(this.f47213o);
            y4.a.a(sbK.toString());
        }
        q1.t0 t0Var2 = this.f47209j;
        if (t0Var2.f35756e == this.f47213o) {
            return;
        }
        y4.a.a("Incorrect state. Precomposed children " + this.f47213o + ". Map size " + t0Var2.f35756e);
    }

    public final void h(boolean z11) {
        this.f47213o = 0;
        this.f47209j.g();
        List listO = this.f47200a.o();
        int i11 = ((o3.e) ((o3.b) listO).f31822b).f31832c;
        if (this.f47212n != i11) {
            this.f47212n = i11;
            z3.g gVarC = z3.v.c();
            Function1 function1E = gVarC != null ? gVarC.e() : null;
            z3.g gVarD = z3.v.d(gVarC);
            for (int i12 = 0; i12 < i11; i12++) {
                try {
                    b5.m0 m0Var = (b5.m0) ((o3.b) listO).get(i12);
                    j0 j0Var = (j0) this.f47205f.d(m0Var);
                    if (j0Var != null && ((Boolean) j0Var.f47155g.getValue()).booleanValue()) {
                        b5.q0 q0Var = m0Var.H;
                        b5.f1 f1Var = q0Var.f5942p;
                        b5.j0 j0Var2 = b5.j0.NotUsed;
                        f1Var.l = j0Var2;
                        b5.z0 z0Var = q0Var.f5943q;
                        if (z0Var != null) {
                            z0Var.f6023j = j0Var2;
                        }
                        j(j0Var, z11);
                        j0Var.f47149a = c0.f47094a;
                    }
                } catch (Throwable th2) {
                    z3.v.f(gVarC, gVarD, function1E);
                    throw th2;
                }
            }
            z3.v.f(gVarC, gVarD, function1E);
            this.f47206g.g();
        }
        g();
    }

    public final void i(int i11, int i12) {
        b5.m0 m0Var = this.f47200a;
        m0Var.f5881r = true;
        m0Var.M(i11, i12, 1);
        m0Var.f5881r = false;
    }

    public final void j(j0 j0Var, boolean z11) {
        i2 i2Var;
        if (z11 || !j0Var.f47156h) {
            j0Var.f47155g = m3.i.w(Boolean.FALSE);
        } else {
            j0Var.f47155g.setValue(Boolean.FALSE);
        }
        if (j0Var.f47154f != null) {
            d(j0Var);
            return;
        }
        if (z11) {
            i2 i2Var2 = j0Var.f47151c;
            if (i2Var2 != null) {
                ((m3.a0) i2Var2).o();
                return;
            }
            return;
        }
        b5.b2 outOfFrameExecutor = ((c5.y) b5.p0.a(this.f47200a)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (j0Var.f47156h || (i2Var = j0Var.f47151c) == null) {
                return;
            }
            ((m3.a0) i2Var).o();
            return;
        }
        ky.i iVar = new ky.i(j0Var, 29);
        c5.y yVar = (c5.y) outOfFrameExecutor;
        kotlin.collections.t tVar = yVar.f7440h;
        boolean zIsEmpty = tVar.isEmpty();
        tVar.addLast(iVar);
        if (zIsEmpty) {
            Handler handler = yVar.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(yVar.f7443i);
            } else {
                i4.a.f("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
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
    public final void k(b5.m0 r10, java.lang.Object r11, boolean r12, kotlin.jvm.functions.Function2 r13) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.q0.k(b5.m0, java.lang.Object, boolean, kotlin.jvm.functions.Function2):void");
    }

    public final b5.m0 l(Object obj) {
        q1.t0 t0Var;
        int i11;
        if (this.f47212n == 0) {
            return null;
        }
        o3.b bVar = (o3.b) this.f47200a.o();
        int i12 = ((o3.e) bVar.f31822b).f31832c - this.f47213o;
        int i13 = i12 - this.f47212n;
        int i14 = i12 - 1;
        int i15 = i14;
        while (true) {
            t0Var = this.f47205f;
            if (i15 < i13) {
                i11 = -1;
                break;
            }
            Object objD = t0Var.d((b5.m0) bVar.get(i15));
            objD.getClass();
            if (Intrinsics.areEqual(((j0) objD).f47149a, obj)) {
                i11 = i15;
                break;
            }
            i15--;
        }
        if (i11 == -1) {
            while (i14 >= i13) {
                Object objD2 = t0Var.d((b5.m0) bVar.get(i14));
                objD2.getClass();
                j0 j0Var = (j0) objD2;
                Object obj2 = j0Var.f47149a;
                if (obj2 == c0.f47094a || this.f47202c.d(obj, obj2)) {
                    j0Var.f47149a = obj;
                    i15 = i14;
                    i11 = i15;
                    break;
                }
                i14--;
            }
            i15 = i14;
        }
        if (i11 == -1) {
            return null;
        }
        if (i15 != i13) {
            i(i15, i13);
        }
        this.f47212n--;
        b5.m0 m0Var = (b5.m0) bVar.get(i13);
        Object objD3 = t0Var.d(m0Var);
        objD3.getClass();
        j0 j0Var2 = (j0) objD3;
        j0Var2.f47155g = m3.i.w(Boolean.TRUE);
        j0Var2.f47153e = true;
        j0Var2.f47152d = true;
        return m0Var;
    }
}

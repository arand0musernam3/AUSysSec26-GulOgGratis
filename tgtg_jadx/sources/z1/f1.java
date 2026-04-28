package z1;

import com.google.android.gms.internal.measurement.cg;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f1 extends b5.n implements b5.i2, t4.c, b5.k {
    public k0 A;
    public j0 B;
    public z3 C;
    public x0.e D;
    public androidx.recyclerview.widget.j F;
    public t1 G;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h2 f46497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Function1 f46498r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f46499s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b2.l f46500t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public x80.i f46501u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b2.b f46502v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f46503w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f46504x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i0 f46505y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public l0 f46506z;
    public long E = 9205357640488583168L;
    public long H = 0;

    public f1(Function1 function1, boolean z11, b2.l lVar, h2 h2Var) {
        this.f46497q = h2Var;
        this.f46498r = function1;
        this.f46499s = z11;
        this.f46500t = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O0(z1.f1 r5, z70.c r6) {
        /*
            boolean r0 = r6 instanceof z1.a1
            if (r0 == 0) goto L13
            r0 = r6
            z1.a1 r0 = (z1.a1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            z1.a1 r0 = new z1.a1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f46394j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L47
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            b2.b r6 = r5.f46502v
            if (r6 == 0) goto L4a
            b2.l r2 = r5.f46500t
            if (r2 == 0) goto L47
            b2.a r4 = new b2.a
            r4.<init>(r6)
            r0.l = r3
            java.lang.Object r6 = r2.b(r4, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6 = 0
            r5.f46502v = r6
        L4a:
            z1.p0 r6 = new z1.p0
            r0 = 0
            r2 = 0
            r6.<init>(r0, r2)
            r5.Y0(r6)
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.f1.O0(z1.f1, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P0(z1.f1 r6, z1.o0 r7, z70.c r8) {
        /*
            boolean r0 = r8 instanceof z1.b1
            if (r0 == 0) goto L13
            r0 = r8
            z1.b1 r0 = (z1.b1) r0
            int r1 = r0.f46414n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46414n = r1
            goto L18
        L13:
            z1.b1 r0 = new z1.b1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f46414n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            b2.b r7 = r0.f46412k
            z1.o0 r0 = r0.f46411j
            ba0.g.M(r8)
            goto L6e
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L35:
            z1.o0 r7 = r0.f46411j
            ba0.g.M(r8)
            goto L56
        L3b:
            ba0.g.M(r8)
            b2.b r8 = r6.f46502v
            if (r8 == 0) goto L56
            b2.l r2 = r6.f46500t
            if (r2 == 0) goto L56
            b2.a r5 = new b2.a
            r5.<init>(r8)
            r0.f46411j = r7
            r0.f46414n = r4
            java.lang.Object r8 = r2.b(r5, r0)
            if (r8 != r1) goto L56
            goto L6b
        L56:
            b2.b r8 = new b2.b
            r8.<init>()
            b2.l r2 = r6.f46500t
            if (r2 == 0) goto L70
            r0.f46411j = r7
            r0.f46412k = r8
            r0.f46414n = r3
            java.lang.Object r0 = r2.b(r8, r0)
            if (r0 != r1) goto L6c
        L6b:
            return r1
        L6c:
            r0 = r7
            r7 = r8
        L6e:
            r8 = r7
            r7 = r0
        L70:
            r6.f46502v = r8
            long r7 = r7.f46621a
            r6.X0(r7)
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.f1.P0(z1.f1, z1.o0, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q0(z1.f1 r5, z1.p0 r6, z70.c r7) {
        /*
            boolean r0 = r7 instanceof z1.c1
            if (r0 == 0) goto L13
            r0 = r7
            z1.c1 r0 = (z1.c1) r0
            int r1 = r0.f46436m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46436m = r1
            goto L18
        L13:
            z1.c1 r0 = new z1.c1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f46435k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f46436m
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            z1.p0 r6 = r0.f46434j
            ba0.g.M(r7)
            goto L4b
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L30:
            ba0.g.M(r7)
            b2.b r7 = r5.f46502v
            if (r7 == 0) goto L4e
            b2.l r2 = r5.f46500t
            if (r2 == 0) goto L4b
            b2.c r4 = new b2.c
            r4.<init>(r7)
            r0.f46434j = r6
            r0.f46436m = r3
            java.lang.Object r7 = r2.b(r4, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r7 = 0
            r5.f46502v = r7
        L4e:
            r5.Y0(r6)
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.f1.Q0(z1.f1, z1.p0, z70.c):java.lang.Object");
    }

    public static void V0(f1 f1Var, w4.v vVar, long j9, long j11, int i11) {
        if ((i11 & 4) != 0) {
            j11 = 0;
        }
        k0 k0Var = f1Var.A;
        if (k0Var == null) {
            k0Var = new k0();
            k0Var.f46570b = null;
            k0Var.f46571c = LongCompanionObject.MAX_VALUE;
            k0Var.f46572d = false;
            f1Var.A = k0Var;
        }
        k0Var.f46570b = vVar;
        k0Var.f46571c = j9;
        androidx.recyclerview.widget.j jVar = f1Var.F;
        h2 h2Var = f1Var.f46497q;
        if (jVar == null) {
            f1Var.F = new androidx.recyclerview.widget.j(h2Var, 2);
        } else {
            jVar.f3775c = h2Var;
            jVar.f3774b = j11;
        }
        k0Var.f46572d = false;
        f1Var.C = k0Var;
    }

    @Override // b5.i2
    public final void F() {
        if (this.f46504x) {
            T0();
            if (this.f46503w) {
                Z0().h(m0.f46600a);
            }
            this.D = null;
        }
        this.f46504x = false;
    }

    public final void R0() {
        b2.b bVar = this.f46502v;
        if (bVar != null) {
            b2.l lVar = this.f46500t;
            if (lVar != null) {
                lVar.c(new b2.a(bVar));
            }
            this.f46502v = null;
        }
    }

    public abstract Object S0(d1 d1Var, e1 e1Var);

    public final void T0() {
        i0 i0Var = this.f46505y;
        if (i0Var == null) {
            h0 h0Var = h0.NotInitialized;
            i0Var = new i0();
            i0Var.f46536b = h0Var;
            i0Var.f46537c = false;
            this.f46505y = i0Var;
        }
        i0Var.f46536b = h0.NotInitialized;
        i0Var.f46537c = false;
        this.C = i0Var;
    }

    public final void U0(w4.v vVar, long j9, androidx.recyclerview.widget.j jVar) {
        j0 j0Var = this.B;
        if (j0Var == null) {
            j0Var = new j0();
            j0Var.f46555b = null;
            j0Var.f46556c = LongCompanionObject.MAX_VALUE;
            this.B = j0Var;
        }
        j0Var.f46555b = vVar;
        j0Var.f46556c = j9;
        jVar.f3774b = 0L;
        this.C = j0Var;
    }

    public final void W0(q0 q0Var) {
        if ((q0Var instanceof o0) && !this.f46503w) {
            this.f46503w = true;
            e1();
        }
        Z0().h(q0Var);
    }

    public abstract void X0(long j9);

    public abstract void Y0(p0 p0Var);

    public final x80.m Z0() {
        x80.i iVar = this.f46501u;
        if (iVar != null) {
            return iVar;
        }
        i4.a.f("Events channel not initialized.");
        return null;
    }

    public final x0.e a1() {
        x0.e eVar = this.D;
        if (eVar != null) {
            return eVar;
        }
        i4.a.f("Velocity Tracker not initialized.");
        return null;
    }

    public final void b1(w4.v vVar, long j9) {
        long jZ = b5.m.f(getNode()).z(0L);
        if (!h4.b.b(this.E, 9205357640488583168L) && !h4.b.b(jZ, this.E)) {
            this.H = h4.b.f(this.H, h4.b.e(jZ, this.E));
        }
        this.E = jZ;
        ex.i.j(a1(), vVar, this.H);
        Z0().h(new n0(j9, false));
    }

    public final void c1(w4.v vVar, w4.v vVar2, long j9) {
        if (this.D == null) {
            this.D = new x0.e(1);
        }
        ex.i.j(a1(), vVar, 0L);
        long jE = h4.b.e(vVar2.f43180c, j9);
        this.H = 0L;
        if (((Boolean) this.f46498r.invoke(new w4.d0(vVar.f43186i))).booleanValue()) {
            if (!this.f46503w) {
                if (this.f46501u == null) {
                    this.f46501u = cg.a(Integer.MAX_VALUE, null, null, 6);
                }
                e1();
            }
            this.E = b5.m.f(this).z(0L);
            Z0().h(new o0(jE));
        }
    }

    @Override // t4.c
    public final void d0() {
        t1 t1Var = this.G;
        if (t1Var != null) {
            t1Var.a();
            f1 f1Var = t1Var.f46692a;
            if (f1Var.f46503w) {
                f1Var.W0(m0.f46600a);
            }
            t1Var.f46698g = null;
            a60.y yVar = t1Var.f46702k;
            yVar.f941b = 0;
            yVar.f940a.clear();
        }
    }

    public abstract boolean d1();

    public final void e1() {
        this.f46503w = true;
        if (this.f46501u == null) {
            this.f46501u = cg.a(Integer.MAX_VALUE, null, null, 6);
        }
        v80.f0.B(getCoroutineScope(), null, null, new e1(this, null), 3);
    }

    @Override // t4.c
    public final void f0(a3.j jVar, w4.o oVar) {
        Object obj;
        Object obj2;
        float f11;
        Object obj3;
        t4.b bVar;
        float fIntBitsToFloat;
        androidx.recyclerview.widget.j jVar2;
        Object obj4;
        Object obj5;
        int i11 = jVar.f398b;
        ArrayList arrayList = (ArrayList) jVar.f399c;
        if (this.f46499s) {
            if (this.G == null) {
                this.G = new t1(this);
            }
            t1 t1Var = this.G;
            if (t1Var != null) {
                f1 f1Var = t1Var.f46692a;
                if (t1Var.f46697f == null) {
                    o1 o1Var = t1Var.f46693b;
                    if (o1Var == null) {
                        n1 n1Var = n1.NotInitialized;
                        o1Var = new o1();
                        o1Var.f46622b = n1Var;
                        o1Var.f46623c = false;
                        t1Var.f46693b = o1Var;
                    }
                    t1Var.f46697f = o1Var;
                }
                z3 z3Var = t1Var.f46697f;
                if (z3Var == null) {
                    i4.a.f("currentDragState should not be null");
                    return;
                }
                boolean z11 = true;
                if (z3Var instanceof o1) {
                    o1 o1Var2 = (o1) z3Var;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        t4.b bVar2 = (t4.b) arrayList.get(i12);
                        if (bVar2.f39787h || !bVar2.f39783d) {
                            return;
                        }
                    }
                    t4.b bVar3 = (t4.b) CollectionsKt.O(arrayList);
                    n1 n1Var2 = s1.$EnumSwitchMapping$0[o1Var2.f46622b.ordinal()] == 1 ? !f1Var.d1() ? n1.Yes : n1.No : o1Var2.f46622b;
                    o1Var2.f46622b = n1Var2;
                    if (oVar == w4.o.Initial && n1Var2 == n1.No) {
                        bVar3.f39788i = true;
                        o1Var2.f46623c = true;
                    }
                    if (oVar == w4.o.Main) {
                        if (n1Var2 == n1.Yes) {
                            t1.c(t1Var, bVar3, bVar3.f39780a, 0L, 12);
                            return;
                        }
                        if (o1Var2.f46623c) {
                            t1Var.f(bVar3, bVar3, new t4.a(i11), 0L);
                            t1Var.e(bVar3, new t4.a(i11), 0L);
                            long j9 = bVar3.f39780a;
                            r1 r1Var = t1Var.f46694c;
                            if (r1Var == null) {
                                r1Var = new r1();
                                r1Var.f46666b = LongCompanionObject.MAX_VALUE;
                                t1Var.f46694c = r1Var;
                            }
                            r1Var.f46666b = j9;
                            t1Var.f46697f = r1Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!(z3Var instanceof q1)) {
                    if (z3Var instanceof p1) {
                        p1 p1Var = (p1) z3Var;
                        if (oVar != w4.o.Final) {
                            return;
                        }
                        int size2 = arrayList.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size2) {
                                break;
                            }
                            if (((t4.b) arrayList.get(i13)).f39788i) {
                                z11 = false;
                                break;
                            }
                            i13++;
                        }
                        int size3 = arrayList.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size3) {
                                break;
                            }
                            if (!((t4.b) arrayList.get(i14)).f39783d) {
                                i14++;
                            } else if (!arrayList.isEmpty()) {
                                if (z11) {
                                    long jF = z3.f((t4.b) CollectionsKt.O(arrayList), f1Var.f46497q, new t4.a(i11));
                                    t4.b bVar4 = p1Var.f46633b;
                                    bVar4.getClass();
                                    long jE = h4.b.e(jF, z3.f(bVar4, f1Var.f46497q, new t4.a(i11)));
                                    t4.b bVar5 = p1Var.f46633b;
                                    if (bVar5 != null) {
                                        t1.c(t1Var, bVar5, p1Var.f46634c, jE, 8);
                                        return;
                                    } else {
                                        i4.a.f("AwaitGesturePickup.initialDown was not initialized.");
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        t1Var.a();
                        return;
                    }
                    if (!(z3Var instanceof r1)) {
                        e40.a.f();
                        return;
                    }
                    r1 r1Var2 = (r1) z3Var;
                    if (oVar != w4.o.Main) {
                        return;
                    }
                    long j11 = r1Var2.f46666b;
                    int size4 = arrayList.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size4) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i15);
                        if (w4.u.e(((t4.b) obj).f39780a, j11)) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    t4.b bVar6 = (t4.b) obj;
                    if (bVar6 == null) {
                        return;
                    }
                    boolean zB = z3.b(bVar6);
                    m0 m0Var = m0.f46600a;
                    if (!zB) {
                        if (bVar6.f39788i) {
                            f1Var.W0(m0Var);
                            return;
                        }
                        h2 h2Var = f1Var.f46497q;
                        t4.a aVar = new t4.a(i11);
                        if (h4.b.c(h4.b.e(z3.f(bVar6, h2Var, aVar), z3.g(bVar6, h2Var, aVar))) == 0.0f) {
                            return;
                        }
                        h2 h2Var2 = f1Var.f46497q;
                        t4.a aVar2 = new t4.a(i11);
                        t1Var.e(bVar6, new t4.a(i11), bVar6.f39788i ? 0L : h4.b.e(z3.f(bVar6, h2Var2, aVar2), z3.g(bVar6, h2Var2, aVar2)));
                        bVar6.f39788i = true;
                        return;
                    }
                    int size5 = arrayList.size();
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size5) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i16);
                        if (((t4.b) obj2).f39783d) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                    t4.b bVar7 = (t4.b) obj2;
                    if (bVar7 != null) {
                        r1Var2.f46666b = bVar7.f39780a;
                        return;
                    }
                    if (bVar6.f39788i || !z3.b(bVar6)) {
                        f1Var.W0(m0Var);
                    } else {
                        z3.a(t1Var.d(), bVar6, f1Var.f46497q, new t4.a(i11), t1Var.f46701j, t1Var.l);
                        float fE = ((c5.u3) b5.o.e(f1Var, c5.x1.f7426s)).e();
                        long jB = t1Var.d().b(ba0.g.g(fE, fE));
                        x4.b bVar8 = (x4.b) t1Var.d().f43625b;
                        x4.e eVar = bVar8.f43824a;
                        x4.a[] aVarArr = eVar.f43830d;
                        kotlin.collections.x.m(aVarArr, 0, aVarArr.length, null);
                        eVar.f43831e = 0;
                        x4.e eVar2 = bVar8.f43825b;
                        x4.a[] aVarArr2 = eVar2.f43830d;
                        kotlin.collections.x.m(aVarArr2, 0, aVarArr2.length, null);
                        eVar2.f43831e = 0;
                        bVar8.f43826c = 0L;
                        f1Var.W0(new p0(j1.a(jB), true));
                    }
                    t1Var.a();
                    return;
                }
                q1 q1Var = (q1) z3Var;
                if (oVar == w4.o.Initial) {
                    return;
                }
                int size6 = arrayList.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size6) {
                        f11 = 0.0f;
                        obj3 = null;
                        break;
                    } else {
                        obj3 = arrayList.get(i17);
                        f11 = 0.0f;
                        if (w4.u.e(((t4.b) obj3).f39780a, q1Var.f46642c)) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                t4.b bVar9 = (t4.b) obj3;
                if (bVar9 == null) {
                    int size7 = arrayList.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= size7) {
                            obj5 = null;
                            break;
                        }
                        obj5 = arrayList.get(i18);
                        if (((t4.b) obj5).f39783d) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                    bVar9 = (t4.b) obj5;
                    if (bVar9 == null) {
                        t1Var.a();
                        return;
                    }
                    q1Var.f46642c = bVar9.f39780a;
                }
                t4.b bVar10 = bVar9;
                if (oVar != w4.o.Main) {
                    bVar = bVar10;
                } else if (bVar10.f39788i) {
                    bVar = bVar10;
                    t4.b bVar11 = q1Var.f46641b;
                    if (bVar11 == null) {
                        i4.a.f("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j12 = q1Var.f46642c;
                    androidx.recyclerview.widget.j jVar3 = t1Var.f46700i;
                    if (jVar3 == null) {
                        i4.a.f("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    t1Var.b(bVar11, j12, jVar3);
                } else if (z3.b(bVar10)) {
                    int size8 = arrayList.size();
                    int i19 = 0;
                    while (true) {
                        if (i19 >= size8) {
                            obj4 = null;
                            break;
                        }
                        Object obj6 = arrayList.get(i19);
                        if (((t4.b) obj6).f39783d) {
                            obj4 = obj6;
                            break;
                        }
                        i19++;
                    }
                    t4.b bVar12 = (t4.b) obj4;
                    if (bVar12 == null) {
                        t1Var.a();
                    } else {
                        q1Var.f46642c = bVar12.f39780a;
                    }
                    bVar = bVar10;
                } else {
                    c5.u3 u3Var = (c5.u3) b5.o.e(f1Var, c5.x1.f7426s);
                    float f12 = y0.f46771a;
                    float f13 = u3Var.f();
                    androidx.recyclerview.widget.j jVar4 = t1Var.f46700i;
                    if (jVar4 == null) {
                        i4.a.f("Touch slop detector not initialized.");
                        return;
                    }
                    long jF2 = z3.f(bVar10, f1Var.f46497q, new t4.a(i11));
                    h2 h2Var3 = f1Var.f46497q;
                    long jFloatToRawIntBits = bVar10.f39786g;
                    if (h2Var3 == null) {
                        jVar2 = jVar4;
                        bVar = bVar10;
                    } else {
                        if (i11 == 1) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                        } else if (i11 == 2) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                        } else {
                            bVar = bVar10;
                            jVar2 = jVar4;
                        }
                        if (h2Var3 == h2.Horizontal) {
                            bVar = bVar10;
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
                        } else {
                            bVar = bVar10;
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(f11)) << 32);
                        }
                        jVar2 = jVar4;
                    }
                    long jA = jVar2.a(jF2, jFloatToRawIntBits, f13);
                    if ((9223372034707292159L & jA) != 9205357640488583168L) {
                        bVar.f39788i = true;
                        t4.b bVar13 = q1Var.f46641b;
                        bVar13.getClass();
                        t1Var.f(bVar13, bVar, new t4.a(i11), jA);
                        t1Var.e(bVar, new t4.a(i11), jA);
                        long j13 = bVar.f39780a;
                        r1 r1Var3 = t1Var.f46694c;
                        if (r1Var3 == null) {
                            r1Var3 = new r1();
                            r1Var3.f46666b = LongCompanionObject.MAX_VALUE;
                            t1Var.f46694c = r1Var3;
                        }
                        r1Var3.f46666b = j13;
                        t1Var.f46697f = r1Var3;
                    } else {
                        q1Var.f46643d = true;
                    }
                }
                if (oVar == w4.o.Final && q1Var.f46643d) {
                    if (!bVar.f39788i) {
                        q1Var.f46643d = false;
                        return;
                    }
                    t4.b bVar14 = q1Var.f46641b;
                    if (bVar14 == null) {
                        i4.a.f("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j14 = q1Var.f46642c;
                    androidx.recyclerview.widget.j jVar5 = t1Var.f46700i;
                    if (jVar5 != null) {
                        t1Var.b(bVar14, j14, jVar5);
                    } else {
                        i4.a.f("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                }
            }
        }
    }

    public final void f1(Function1 function1, boolean z11, b2.l lVar, h2 h2Var, boolean z12) {
        this.f46498r = function1;
        boolean z13 = true;
        if (this.f46499s != z11) {
            this.f46499s = z11;
            if (!z11) {
                R0();
                this.G = null;
            }
            z12 = true;
        }
        if (!Intrinsics.areEqual(this.f46500t, lVar)) {
            R0();
            this.f46500t = lVar;
        }
        if (this.f46497q != h2Var) {
            this.f46497q = h2Var;
        } else {
            z13 = z12;
        }
        if (z13) {
            boolean z14 = this.f46504x;
            m0 m0Var = m0.f46600a;
            if (z14) {
                T0();
                if (this.f46503w) {
                    Z0().h(m0Var);
                }
                this.D = null;
            }
            t1 t1Var = this.G;
            if (t1Var != null) {
                t1Var.a();
                f1 f1Var = t1Var.f46692a;
                if (f1Var.f46503w) {
                    f1Var.W0(m0Var);
                }
                t1Var.f46698g = null;
                a60.y yVar = t1Var.f46702k;
                yVar.f941b = 0;
                yVar.f940a.clear();
            }
        }
    }

    @Override // b4.s
    public final void onDetach() {
        this.f46503w = false;
        R0();
        this.H = 0L;
    }

    @Override // b5.i2
    public void p0(w4.n nVar, w4.o oVar, long j9) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z11 = true;
        this.f46504x = true;
        if (this.f46499s) {
            if (this.C == null) {
                i0 i0Var = this.f46505y;
                if (i0Var == null) {
                    h0 h0Var = h0.NotInitialized;
                    i0Var = new i0();
                    i0Var.f46536b = h0Var;
                    i0Var.f46537c = false;
                    this.f46505y = i0Var;
                }
                this.C = i0Var;
            }
            z3 z3Var = this.C;
            if (z3Var == null) {
                i4.a.f("currentDragState should not be null");
                return;
            }
            if (z3Var instanceof i0) {
                i0 i0Var2 = (i0) z3Var;
                if (!nVar.f43165a.isEmpty() && y3.g(nVar, false, false)) {
                    w4.v vVar = (w4.v) CollectionsKt.O(nVar.f43165a);
                    h0 h0Var2 = z0.$EnumSwitchMapping$0[i0Var2.f46536b.ordinal()] == 1 ? !d1() ? h0.Yes : h0.No : i0Var2.f46536b;
                    i0Var2.f46536b = h0Var2;
                    if (oVar == w4.o.Initial && h0Var2 == h0.No) {
                        vVar.a();
                        i0Var2.f46537c = true;
                    }
                    if (oVar == w4.o.Main) {
                        if (h0Var2 == h0.Yes) {
                            V0(this, vVar, vVar.f43178a, 0L, 12);
                            return;
                        }
                        if (i0Var2.f46537c) {
                            c1(vVar, vVar, 0L);
                            b1(vVar, 0L);
                            long j11 = vVar.f43178a;
                            l0 l0Var = this.f46506z;
                            if (l0Var == null) {
                                l0Var = new l0();
                                l0Var.f46581b = LongCompanionObject.MAX_VALUE;
                                this.f46506z = l0Var;
                            }
                            l0Var.f46581b = j11;
                            this.C = l0Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            Object obj5 = null;
            if (z3Var instanceof k0) {
                k0 k0Var = (k0) z3Var;
                if (oVar == w4.o.Initial) {
                    return;
                }
                List list = nVar.f43165a;
                int size = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i11);
                    if (w4.u.e(((w4.v) obj3).f43178a, k0Var.f46571c)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                w4.v vVar2 = (w4.v) obj3;
                if (vVar2 == null) {
                    int size2 = list.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            obj4 = null;
                            break;
                        }
                        obj4 = list.get(i12);
                        if (((w4.v) obj4).f43181d) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    vVar2 = (w4.v) obj4;
                    if (vVar2 == null) {
                        T0();
                        return;
                    }
                    k0Var.f46571c = vVar2.f43178a;
                }
                if (oVar == w4.o.Main) {
                    if (vVar2.b()) {
                        w4.v vVar3 = k0Var.f46570b;
                        if (vVar3 == null) {
                            i4.a.f("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j12 = k0Var.f46571c;
                        androidx.recyclerview.widget.j jVar = this.F;
                        if (jVar == null) {
                            i4.a.f("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                        U0(vVar3, j12, jVar);
                    } else if (w4.u.d(vVar2)) {
                        int size3 = list.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size3) {
                                break;
                            }
                            Object obj6 = list.get(i13);
                            if (((w4.v) obj6).f43181d) {
                                obj5 = obj6;
                                break;
                            }
                            i13++;
                        }
                        w4.v vVar4 = (w4.v) obj5;
                        if (vVar4 == null) {
                            T0();
                        } else {
                            k0Var.f46571c = vVar4.f43178a;
                        }
                    } else {
                        float fH = y0.h((c5.u3) b5.o.e(this, c5.x1.f7426s), vVar2.f43186i);
                        androidx.recyclerview.widget.j jVar2 = this.F;
                        if (jVar2 == null) {
                            i4.a.f("Touch slop detector not initialized.");
                            return;
                        }
                        long jA = jVar2.a(vVar2.f43180c, vVar2.f43184g, fH);
                        if ((9223372034707292159L & jA) != 9205357640488583168L) {
                            vVar2.a();
                            w4.v vVar5 = k0Var.f46570b;
                            vVar5.getClass();
                            c1(vVar5, vVar2, jA);
                            b1(vVar2, jA);
                            long j13 = vVar2.f43178a;
                            l0 l0Var2 = this.f46506z;
                            if (l0Var2 == null) {
                                l0Var2 = new l0();
                                l0Var2.f46581b = LongCompanionObject.MAX_VALUE;
                                this.f46506z = l0Var2;
                            }
                            l0Var2.f46581b = j13;
                            this.C = l0Var2;
                        } else {
                            k0Var.f46572d = true;
                        }
                    }
                }
                if (oVar == w4.o.Final && k0Var.f46572d) {
                    if (!vVar2.b()) {
                        k0Var.f46572d = false;
                        return;
                    }
                    w4.v vVar6 = k0Var.f46570b;
                    if (vVar6 == null) {
                        i4.a.f("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j14 = k0Var.f46571c;
                    androidx.recyclerview.widget.j jVar3 = this.F;
                    if (jVar3 != null) {
                        U0(vVar6, j14, jVar3);
                        return;
                    } else {
                        i4.a.f("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                }
                return;
            }
            if (z3Var instanceof j0) {
                j0 j0Var = (j0) z3Var;
                if (oVar != w4.o.Final) {
                    return;
                }
                List list2 = nVar.f43165a;
                int size4 = list2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        break;
                    }
                    if (((w4.v) list2.get(i14)).b()) {
                        z11 = false;
                        break;
                    }
                    i14++;
                }
                int size5 = list2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        break;
                    }
                    if (!((w4.v) list2.get(i15)).f43181d) {
                        i15++;
                    } else if (!list2.isEmpty()) {
                        if (z11) {
                            long j15 = ((w4.v) CollectionsKt.O(list2)).f43180c;
                            w4.v vVar7 = j0Var.f46555b;
                            vVar7.getClass();
                            long jE = h4.b.e(j15, vVar7.f43180c);
                            w4.v vVar8 = j0Var.f46555b;
                            if (vVar8 != null) {
                                V0(this, vVar8, j0Var.f46556c, jE, 8);
                                return;
                            } else {
                                i4.a.f("AwaitGesturePickup.initialDown was not initialized.");
                                return;
                            }
                        }
                        return;
                    }
                }
                T0();
                return;
            }
            if (!(z3Var instanceof l0)) {
                e40.a.f();
                return;
            }
            l0 l0Var3 = (l0) z3Var;
            if (oVar != w4.o.Main) {
                return;
            }
            long j16 = l0Var3.f46581b;
            List list3 = nVar.f43165a;
            int size6 = list3.size();
            int i16 = 0;
            while (true) {
                if (i16 >= size6) {
                    obj = null;
                    break;
                }
                obj = list3.get(i16);
                if (w4.u.e(((w4.v) obj).f43178a, j16)) {
                    break;
                } else {
                    i16++;
                }
            }
            w4.v vVar9 = (w4.v) obj;
            if (vVar9 == null) {
                return;
            }
            boolean zD = w4.u.d(vVar9);
            m0 m0Var = m0.f46600a;
            if (!zD) {
                if (vVar9.b()) {
                    Z0().h(m0Var);
                    return;
                } else {
                    if (h4.b.c(w4.u.h(vVar9, true)) == 0.0f) {
                        return;
                    }
                    b1(vVar9, w4.u.h(vVar9, false));
                    vVar9.a();
                    return;
                }
            }
            List list4 = nVar.f43165a;
            int size7 = list4.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size7) {
                    obj2 = null;
                    break;
                }
                obj2 = list4.get(i17);
                if (((w4.v) obj2).f43181d) {
                    break;
                } else {
                    i17++;
                }
            }
            w4.v vVar10 = (w4.v) obj2;
            if (vVar10 != null) {
                l0Var3.f46581b = vVar10.f43178a;
                return;
            }
            if (vVar9.b() || !w4.u.d(vVar9)) {
                Z0().h(m0Var);
            } else {
                ex.i.j(a1(), vVar9, 0L);
                float fE = ((c5.u3) b5.o.e(this, c5.x1.f7426s)).e();
                long jB = a1().b(ba0.g.g(fE, fE));
                x4.b bVar = (x4.b) a1().f43625b;
                x4.e eVar = bVar.f43824a;
                x4.a[] aVarArr = eVar.f43830d;
                kotlin.collections.x.m(aVarArr, 0, aVarArr.length, null);
                eVar.f43831e = 0;
                x4.e eVar2 = bVar.f43825b;
                x4.a[] aVarArr2 = eVar2.f43830d;
                kotlin.collections.x.m(aVarArr2, 0, aVarArr2.length, null);
                eVar2.f43831e = 0;
                bVar.f43826c = 0L;
                Z0().h(new p0(j1.a(jB), false));
                this.f46504x = false;
            }
            T0();
        }
    }
}

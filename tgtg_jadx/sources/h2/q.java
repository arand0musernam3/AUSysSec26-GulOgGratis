package h2;

import android.view.View;
import com.app.tgtg.R;
import g3.q9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty0;
import m3.d3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import z1.h2;
import z4.y1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0[] f21208a = new b0[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a40.i f21209b = new a40.i(8);

    public static final void a(final Function0 function0, final b4.t tVar, final z0 z0Var, final p0 p0Var, m3.n nVar, final int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1055276397);
        int i12 = (sVar.h(function0) ? 4 : 2) | i11 | (sVar.f(tVar) ? 32 : 16) | (sVar.f(z0Var) ? 256 : 128) | (sVar.f(p0Var) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            final m3.b1 b1VarB = m3.i.B(function0, sVar);
            c(u3.e.e(-933153643, sVar, new i80.n() { // from class: h2.l0
                @Override // i80.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    b4.t tVarThen;
                    y3.b bVar = (y3.b) obj;
                    ((Integer) obj3).getClass();
                    m3.s sVar2 = (m3.s) ((m3.n) obj2);
                    Object objM = sVar2.M();
                    m3.f fVar = m3.m.f29332a;
                    if (objM == fVar) {
                        objM = new j0(bVar, new n0(b1VarB, 0));
                        sVar2.k0(objM);
                    }
                    final j0 j0Var = (j0) objM;
                    Object objM2 = sVar2.M();
                    if (objM2 == fVar) {
                        objM2 = new y1(new dn.k(j0Var));
                        sVar2.k0(objM2);
                    }
                    final y1 y1Var = (y1) objM2;
                    final z0 z0Var2 = z0Var;
                    if (z0Var2 != null) {
                        sVar2.a0(1743490539);
                        sVar2.a0(887527095);
                        final p1 p1Var = r1.f21214a;
                        if (p1Var != null) {
                            sVar2.a0(1345554384);
                            sVar2.q(false);
                        } else {
                            sVar2.a0(1345603457);
                            View view = (View) sVar2.j(c5.v0.f7394f);
                            boolean zF = sVar2.f(view);
                            Object objM3 = sVar2.M();
                            if (zF || objM3 == fVar) {
                                Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                                objM3 = tag instanceof p1 ? (p1) tag : null;
                                if (objM3 == null) {
                                    objM3 = new b(view);
                                    view.setTag(R.id.compose_prefetch_scheduler, objM3);
                                }
                                sVar2.k0(objM3);
                            }
                            p1Var = (p1) objM3;
                            sVar2.q(false);
                        }
                        sVar2.q(false);
                        Object[] objArr = {z0Var2, j0Var, y1Var, p1Var};
                        boolean zF2 = sVar2.f(z0Var2) | sVar2.h(j0Var) | sVar2.h(y1Var) | sVar2.h(p1Var);
                        Object objM4 = sVar2.M();
                        if (zF2 || objM4 == fVar) {
                            objM4 = new Function1() { // from class: h2.o0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    c40.q qVar = new c40.q(j0Var, y1Var, p1Var);
                                    z0 z0Var3 = z0Var2;
                                    z0Var3.f21253c = qVar;
                                    return new a3.v0(z0Var3, 8);
                                }
                            };
                            sVar2.k0(objM4);
                        }
                        m3.i.e(objArr, (Function1) objM4, sVar2);
                    } else {
                        sVar2.a0(1737291469);
                    }
                    sVar2.q(false);
                    int i13 = a1.f21032a;
                    b4.t tVar2 = tVar;
                    if (z0Var2 != null && (tVarThen = tVar2.then(new w1(z0Var2))) != null) {
                        tVar2 = tVarThen;
                    }
                    boolean zF3 = sVar2.f(j0Var);
                    p0 p0Var2 = p0Var;
                    boolean zF4 = zF3 | sVar2.f(p0Var2);
                    Object objM5 = sVar2.M();
                    if (zF4 || objM5 == fVar) {
                        objM5 = new gn.i(5, j0Var, p0Var2);
                        sVar2.k0(objM5);
                    }
                    z4.c0.c(y1Var, tVar2, (Function2) objM5, sVar2, 8);
                    return Unit.f26487a;
                }
            }), sVar, 6);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(tVar, z0Var, p0Var, i11) { // from class: h2.m0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b4.t f21171b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ z0 f21172c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ p0 f21173d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    q.a(this.f21170a, this.f21171b, this.f21172c, this.f21173d, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void b(Object obj, int i11, v0 v0Var, u3.d dVar, m3.n nVar, int i12) {
        int i13;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(872548579);
        if ((i12 & 6) == 0) {
            i13 = (sVar.h(obj) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.d(i11) ? 32 : 16;
        }
        if ((i12 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= sVar.h(v0Var) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.h(dVar) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            boolean zF = sVar.f(obj) | sVar.f(v0Var);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zF || objM == fVar) {
                objM = new u0(obj, v0Var);
                sVar.k0(objM);
            }
            u0 u0Var = (u0) objM;
            u0Var.f21233c = i11;
            m3.k1 k1Var = u0Var.f21237g;
            m3.e0 e0Var = z4.k1.f47165a;
            u0 u0Var2 = (u0) sVar.j(e0Var);
            z3.g gVarC = z3.v.c();
            Function1 function1E = gVarC != null ? gVarC.e() : null;
            z3.g gVarD = z3.v.d(gVarC);
            try {
                if (u0Var2 != ((u0) k1Var.getValue())) {
                    k1Var.setValue(u0Var2);
                    if (u0Var.f21234d > 0) {
                        u0 u0Var3 = u0Var.f21235e;
                        if (u0Var3 != null) {
                            u0Var3.b();
                        }
                        if (u0Var2 != null) {
                            u0Var2.a();
                        } else {
                            u0Var2 = null;
                        }
                        u0Var.f21235e = u0Var2;
                    }
                }
                z3.v.f(gVarC, gVarD, function1E);
                boolean zF2 = sVar.f(u0Var);
                Object objM2 = sVar.M();
                if (zF2 || objM2 == fVar) {
                    objM2 = new q9(u0Var, 11);
                    sVar.k0(objM2);
                }
                m3.i.d(u0Var, (Function1) objM2, sVar);
                m3.i.a(e0Var.a(u0Var), dVar, sVar, ((i13 >> 6) & 112) | 8);
            } catch (Throwable th2) {
                z3.v.f(gVarC, gVarD, function1E);
                throw th2;
            }
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bg.y0(obj, i11, v0Var, dVar, i12, 5);
        }
    }

    public static final void c(u3.d dVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-709502251);
        if (sVar.R(i11 & 1, (i11 & 3) != 2)) {
            d3 d3Var = y3.g.f45406a;
            y3.e eVar = (y3.e) sVar.j(d3Var);
            y3.c cVarF = y3.j.f(sVar);
            Object[] objArr = {eVar};
            ub.a aVar = new ub.a(28, new g60.a(9), new ek.a(25, eVar, cVarF));
            boolean zH = sVar.h(eVar) | sVar.h(cVarF);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new ep.l(20, eVar, cVarF);
                sVar.k0(objM);
            }
            l1 l1Var = (l1) y3.j.d(objArr, aVar, (Function0) objM, sVar, 0);
            m3.i.a(d3Var.a(l1Var), u3.e.e(-412824043, sVar, new gn.i(6, dVar, l1Var)), sVar, 56);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d2.m0(dVar, i11, 4);
        }
    }

    public static final void d(k0 k0Var, Object obj, int i11, Object obj2, m3.n nVar, int i12) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1439843069);
        int i13 = (sVar.f(k0Var) ? 4 : 2) | i12 | (sVar.f(obj) ? 32 : 16) | (sVar.d(i11) ? 256 : 128) | (sVar.f(obj2) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            ((y3.b) obj).e(obj2, u3.e.e(980966366, sVar, new bn.x(i11, k0Var, obj2)), sVar, 48);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(k0Var, obj, i11, obj2, i12);
        }
    }

    public static final int e(int i11, o3.e eVar) {
        int i12 = eVar.f31832c - 1;
        int i13 = 0;
        while (i13 < i12) {
            int iA = org.bouncycastle.jcajce.provider.asymmetric.a.a(i12, i13, 2, i13);
            Object[] objArr = eVar.f31830a;
            int i14 = ((j) objArr[iA]).f21139a;
            if (i14 != i11) {
                if (i14 < i11) {
                    i13 = iA + 1;
                    if (i11 < ((j) objArr[i13]).f21139a) {
                    }
                } else {
                    i12 = iA - 1;
                }
            }
            return iA;
        }
        return i13;
    }

    public static final List f(v1 v1Var, int i11, int i12, ArrayList arrayList, q1.m mVar, int i13, int i14, int i15, Function1 function1) {
        int i16;
        q1.f0 f0Var;
        long j9;
        long j11;
        int i17;
        Object obj;
        int i18;
        if (v1Var == null || arrayList.isEmpty() || (i16 = mVar.f35790b) == 0) {
            return kotlin.collections.n0.f26529a;
        }
        int i19 = -1;
        if (i12 - i11 < 0 || i16 == 0) {
            f0Var = q1.n.f35794a;
        } else {
            IntRange intRangeJ = n80.p.j(0, i16);
            int i21 = intRangeJ.f26553a;
            int i22 = intRangeJ.f26554b;
            int iA = -1;
            if (i21 <= i22) {
                while (mVar.a(i21) <= i11) {
                    iA = mVar.a(i21);
                    if (i21 == i22) {
                        break;
                    }
                    i21++;
                }
            }
            if (iA == -1) {
                f0Var = q1.n.f35794a;
            } else {
                q1.f0 f0Var2 = q1.n.f35794a;
                f0Var = new q1.f0(1);
                f0Var.c(iA);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i23 = 0; i23 < size; i23++) {
            Object obj2 = arrayList.get(i23);
            int index = ((r0) obj2).getIndex();
            int[] iArr = mVar.f35789a;
            int i24 = mVar.f35790b;
            int i25 = 0;
            while (true) {
                if (i25 >= i24) {
                    break;
                }
                if (iArr[i25] == index) {
                    arrayList3.add(obj2);
                    break;
                }
                i25++;
            }
        }
        int[] iArr2 = f0Var.f35789a;
        int i26 = f0Var.f35790b;
        int i27 = 0;
        while (i27 < i26) {
            int i28 = iArr2[i27];
            Iterator it = arrayList.iterator();
            int i29 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i29 = i19;
                    break;
                }
                if (((r0) it.next()).getIndex() == i28) {
                    break;
                }
                i29++;
            }
            r0 r0Var = i29 == i19 ? (r0) function1.invoke(Integer.valueOf(i28)) : (r0) arrayList.remove(i29);
            int iC = r0Var.c();
            if (i29 == i19) {
                j9 = 4294967295L;
                i17 = Integer.MIN_VALUE;
            } else {
                long j12 = r0Var.j(0);
                if (r0Var.h()) {
                    j9 = 4294967295L;
                    j11 = j12 & 4294967295L;
                } else {
                    j9 = 4294967295L;
                    j11 = j12 >> 32;
                }
                i17 = (int) j11;
            }
            int size2 = arrayList3.size();
            int i31 = 0;
            while (true) {
                if (i31 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i31);
                if (((r0) obj).getIndex() != i28) {
                    break;
                }
                i31++;
            }
            r0 r0Var2 = (r0) obj;
            if (r0Var2 != null) {
                long j13 = r0Var2.j(0);
                i18 = (int) (r0Var2.h() ? j13 & j9 : j13 >> 32);
            } else {
                i18 = Integer.MIN_VALUE;
            }
            int iMax = i17 == Integer.MIN_VALUE ? -i13 : Math.max(-i13, i17);
            if (i18 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i18 - iC);
            }
            r0Var.i();
            r0Var.l(iMax, 0, i14, i15);
            arrayList2.add(r0Var);
            i27++;
            i19 = -1;
        }
        return arrayList2;
    }

    public static final List g(k0 k0Var, v0 v0Var, o oVar) {
        IntRange intRange;
        o3.e eVar = oVar.f21199a;
        if (!(eVar.f31832c != 0) && v0Var.f21239a.isEmpty()) {
            return kotlin.collections.n0.f26529a;
        }
        ArrayList arrayList = new ArrayList();
        if (oVar.f21199a.f31832c != 0) {
            int i11 = eVar.f31832c;
            if (i11 == 0) {
                qc.y.h("MutableVector is empty.");
                return null;
            }
            Object[] objArr = eVar.f31830a;
            int i12 = ((n) objArr[0]).f21180a;
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = ((n) objArr[i13]).f21180a;
                if (i14 < i12) {
                    i12 = i14;
                }
            }
            if (i12 < 0) {
                c2.a.a("negative minIndex");
            }
            int i15 = eVar.f31832c;
            if (i15 == 0) {
                qc.y.h("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = eVar.f31830a;
            int i16 = ((n) objArr2[0]).f21181b;
            for (int i17 = 0; i17 < i15; i17++) {
                int i18 = ((n) objArr2[i17]).f21181b;
                if (i18 > i16) {
                    i16 = i18;
                }
            }
            intRange = new IntRange(i12, Math.min(i16, k0Var.a() - 1), 1);
        } else {
            IntRange.f26550e.getClass();
            intRange = IntRange.f26551f;
        }
        int size = v0Var.f21239a.size();
        for (int i19 = 0; i19 < size; i19++) {
            u0 u0Var = (u0) v0Var.get(i19);
            int i21 = i(u0Var.f21233c, k0Var, u0Var.f21231a);
            int i22 = intRange.f26553a;
            if ((i21 > intRange.f26554b || i22 > i21) && i21 >= 0 && i21 < k0Var.a()) {
                arrayList.add(Integer.valueOf(i21));
            }
        }
        int i23 = intRange.f26553a;
        int i24 = intRange.f26554b;
        if (i23 <= i24) {
            while (true) {
                arrayList.add(Integer.valueOf(i23));
                if (i23 == i24) {
                    break;
                }
                i23++;
            }
        }
        return arrayList;
    }

    public static m3.b1 h() {
        return new m3.k1(Unit.f26487a, m3.f.f29272d);
    }

    public static final int i(int i11, k0 k0Var, Object obj) {
        int iE;
        return (obj == null || k0Var.a() == 0 || (i11 < k0Var.a() && Intrinsics.areEqual(obj, k0Var.b(i11))) || (iE = k0Var.e(obj)) == -1) ? i11 : iE;
    }

    public static final b4.t m(v vVar, o oVar, boolean z11, h2 h2Var) {
        return new p(vVar, oVar, z11, h2Var);
    }

    public static final b4.t n(b4.t tVar, KProperty0 kProperty0, g1 g1Var, h2 h2Var, boolean z11, boolean z12) {
        return tVar.then(new h1(kProperty0, g1Var, h2Var, z11, z12));
    }

    public static final List o(int i11, int i12, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return kotlin.collections.n0.f26529a;
        }
        ArrayList arrayListT0 = CollectionsKt.t0(list);
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            r0 r0Var = (r0) arrayList.get(i13);
            int index = r0Var.getIndex();
            if (i11 <= index && index <= i12) {
                arrayListT0.add(r0Var);
            }
        }
        kotlin.collections.h0.r(arrayListT0, f21209b);
        return arrayListT0;
    }

    public Object j(int i11) {
        j jVarJ = k().j(i11);
        return jVarJ.f21141c.getType().invoke(Integer.valueOf(i11 - jVarJ.f21139a));
    }

    public abstract a3.j k();

    public Object l(int i11) {
        Object objInvoke;
        j jVarJ = k().j(i11);
        int i12 = i11 - jVarJ.f21139a;
        Function1 key = jVarJ.f21141c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i12))) == null) ? new h(i11) : objInvoke;
    }
}

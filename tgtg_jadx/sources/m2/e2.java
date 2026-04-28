package m2;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SpreadBuilder;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3.k1 f28843a = m3.i.w(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m5.h f28844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z3.r f28845c;

    public e2(m5.h hVar) {
        p1 p1Var = new p1(4);
        hVar.getClass();
        m5.e eVar = new m5.e(hVar);
        ArrayList arrayList = eVar.f29527c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list = (List) p1Var.invoke(((m5.d) arrayList.get(i11)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                m5.f fVar = (m5.f) list.get(i12);
                arrayList3.add(new m5.d(fVar.f29529a, fVar.f29530b, fVar.f29531c, fVar.f29532d));
            }
            kotlin.collections.i0.s(arrayList3, arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.f28844b = eVar.j();
        this.f28845c = new z3.r();
    }

    public static m5.f c(m5.f fVar, m5.q0 q0Var) {
        int iC = q0Var.f29618b.c(r4.f29628f - 1, false);
        if (fVar.f29530b < iC) {
            return m5.f.a(fVar, null, 0, Math.min(fVar.f29531c, iC), 11);
        }
        return null;
    }

    public final void a(m3.n nVar, int i11) {
        char c3;
        boolean z11;
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1154651354);
        char c7 = 2;
        int i13 = (sVar.h(this) ? 4 : 2) | i11;
        boolean z12 = false;
        if (sVar.R(i13 & 1, (i13 & 3) != 2)) {
            c5.f1 f1Var = (c5.f1) sVar.j(c5.x1.f7425r);
            m5.h hVar = this.f28844b;
            List listA = hVar.a(hVar.f29538b.length());
            int size = listA.size();
            int i14 = 0;
            while (i14 < size) {
                m5.f fVar = (m5.f) listA.get(i14);
                int i15 = fVar.f29530b;
                Object obj = fVar.f29529a;
                if (i15 != fVar.f29531c) {
                    sVar.a0(725478935);
                    Object objM = sVar.M();
                    m3.f fVar2 = m3.m.f29332a;
                    Object objG = objM;
                    if (objM == fVar2) {
                        objG = w.a0.g(sVar);
                    }
                    b2.l lVar = (b2.l) objG;
                    c3 = c7;
                    b4.t tVarP = i4.g0.p(b4.q.f5711a, new c2(this, fVar));
                    Object objM2 = sVar.M();
                    Object obj2 = objM2;
                    if (objM2 == fVar2) {
                        p1 p1Var = new p1(5);
                        sVar.k0(p1Var);
                        obj2 = p1Var;
                    }
                    b4.t tVarO = v1.n.o(j5.r.c(tVarP, z12, (Function1) obj2).then(new g2(new a50.d(23, this, fVar))), lVar);
                    w4.s.f43173a.getClass();
                    b4.t tVarG = w4.u.g(tVarO, w4.u.f43176c);
                    boolean zH = sVar.h(this) | sVar.f(fVar) | sVar.h(f1Var);
                    Object objM3 = sVar.M();
                    Object obj3 = objM3;
                    if (zH || objM3 == fVar2) {
                        lw.b bVar = new lw.b(this, fVar, f1Var);
                        sVar.k0(bVar);
                        obj3 = bVar;
                    }
                    d2.p.a(androidx.compose.foundation.b.d(tVarG, lVar, null, null, null, (Function0) obj3, 508), sVar, 0);
                    m5.o oVar = (m5.o) obj;
                    m5.r0 r0VarB = oVar.b();
                    if (r0VarB == null) {
                        z11 = false;
                        i12 = 716130110;
                    } else if (r0VarB.f29631a == null && r0VarB.f29632b == null && r0VarB.f29633c == null && r0VarB.f29634d == null) {
                        i12 = 716130110;
                        z11 = false;
                    } else {
                        sVar.a0(726303039);
                        Object objM4 = sVar.M();
                        Object obj4 = objM4;
                        if (objM4 == fVar2) {
                            g1 g1Var = new g1(lVar);
                            sVar.k0(g1Var);
                            obj4 = g1Var;
                        }
                        g1 g1Var2 = (g1) obj4;
                        Unit unit = Unit.f26487a;
                        Object objM5 = sVar.M();
                        boolean z13 = false;
                        Object obj5 = objM5;
                        if (objM5 == fVar2) {
                            h2.b1 b1Var = new h2.b1(g1Var2, z13 ? 1 : 0, 14);
                            sVar.k0(b1Var);
                            obj5 = b1Var;
                        }
                        m3.i.h(unit, (Function2) obj5, sVar);
                        m3.h1 h1Var = g1Var2.f28861b;
                        m3.h1 h1Var2 = g1Var2.f28861b;
                        Boolean boolValueOf = Boolean.valueOf((h1Var.h() & 2) != 0);
                        Boolean boolValueOf2 = Boolean.valueOf((h1Var2.h() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((h1Var2.h() & 4) != 0);
                        m5.r0 r0VarB2 = oVar.b();
                        m5.l0 l0Var = r0VarB2 != null ? r0VarB2.f29631a : null;
                        m5.r0 r0VarB3 = oVar.b();
                        m5.l0 l0Var2 = r0VarB3 != null ? r0VarB3.f29632b : null;
                        m5.r0 r0VarB4 = oVar.b();
                        m5.l0 l0Var3 = r0VarB4 != null ? r0VarB4.f29633c : null;
                        m5.r0 r0VarB5 = oVar.b();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, l0Var, l0Var2, l0Var3, r0VarB5 != null ? r0VarB5.f29634d : null};
                        boolean zH2 = sVar.h(this) | sVar.f(fVar);
                        Object objM6 = sVar.M();
                        Object obj6 = objM6;
                        if (zH2 || objM6 == fVar2) {
                            c2 c2Var = new c2(this, fVar, g1Var2);
                            sVar.k0(c2Var);
                            obj6 = c2Var;
                        }
                        b(objArr, (Function1) obj6, sVar, (i13 << 6) & 896);
                        z11 = false;
                        sVar.q(z11);
                    }
                    sVar.a0(i12);
                    sVar.q(z11);
                } else {
                    c3 = c7;
                    z11 = z12;
                    sVar.a0(716130110);
                }
                sVar.q(z11);
                i14++;
                z12 = z11;
                c7 = c3;
            }
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lk.a(this, i11, 12);
        }
    }

    public final void b(Object[] objArr, Function1 function1, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-2083052099);
        int i12 = (i11 & 48) == 0 ? (sVar.h(function1) ? 32 : 16) | i11 : i11;
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(this) ? 256 : 128;
        }
        sVar.Y(-358306546, Integer.valueOf(objArr.length));
        int i13 = i12 | (sVar.d(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i13 |= sVar.h(obj) ? 4 : 0;
        }
        sVar.q(false);
        if ((i13 & 14) == 0) {
            i13 |= 2;
        }
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(function1);
            spreadBuilder.addSpread(objArr);
            Object[] array = spreadBuilder.toArray(new Object[spreadBuilder.size()]);
            boolean zH = sVar.h(this) | ((i13 & 112) == 32);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new v(this, function1, 1);
                sVar.k0(objM);
            }
            m3.i.e(array, (Function1) objM, sVar);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(this, objArr, function1, i11, 13);
        }
    }
}

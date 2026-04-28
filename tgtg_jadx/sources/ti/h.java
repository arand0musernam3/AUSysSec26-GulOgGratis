package ti;

import android.content.Context;
import c5.v0;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.user.response.charity.LocalDivergenceDay;
import d2.g0;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.y;
import d2.z1;
import g3.d7;
import g3.g7;
import g3.r9;
import g3.s0;
import g3.x5;
import i4.r0;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.i1;
import kotlin.collections.n0;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import m3.b1;
import m3.c3;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import t1.w1;
import v80.b0;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static final void a(final List list, Set set, final Function1 function1, final Function2 function2, m3.n nVar, int i11) {
        list.getClass();
        set.getClass();
        function2.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1688428756);
        int i12 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.h(set) ? 32 : 16) | (sVar.h(function1) ? 256 : 128) | (sVar.h(function2) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            final Context context = (Context) sVar.j(v0.f7390b);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            final b1 b1Var = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new g7();
                sVar.k0(objM2);
            }
            final g7 g7Var = (g7) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
                sVar.k0(objM3);
            }
            final b0 b0Var = (b0) objM3;
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = m3.i.w(set);
                sVar.k0(objM4);
            }
            final b1 b1Var2 = (b1) objM4;
            Object objM5 = sVar.M();
            if (objM5 == fVar) {
                objM5 = m3.i.w(p0.f26531a);
                sVar.k0(objM5);
            }
            final b1 b1Var3 = (b1) objM5;
            Object objM6 = sVar.M();
            if (objM6 == fVar) {
                objM6 = m3.i.w(n0.f26529a);
                sVar.k0(objM6);
            }
            final b1 b1Var4 = (b1) objM6;
            final c3 c3VarA = t1.d.a(!((List) b1Var4.getValue()).isEmpty() ? lv.t.f28247a : 190, null, "", sVar, MLKEMEngine.KyberPolyBytes, 10);
            final c3 c3VarA2 = t1.d.a(((Boolean) b1Var.getValue()).booleanValue() ? lv.t.f28247a : 120, null, "", sVar, MLKEMEngine.KyberPolyBytes, 10);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Object objM7 = sVar.M();
            if (objM7 == fVar) {
                objM7 = m3.i.w(p0.f26531a);
                sVar.k0(objM7);
            }
            final b1 b1Var5 = (b1) objM7;
            x5.a(null, null, null, u3.e.e(842946894, sVar, new a(g7Var, objectRef, b1Var2, b1Var3, 0)), null, 0, lv.s.J, 0L, d2.c.g(lv.t.f28247a, 0.0f, 14), u3.e.e(-2060574619, sVar, new i80.n() { // from class: ti.c
                @Override // i80.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    z1 z1Var = (z1) obj;
                    m3.n nVar2 = (m3.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    b4.i iVar = b4.d.f5694m;
                    z1Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((m3.s) nVar2).f(z1Var) ? 4 : 2;
                    }
                    m3.s sVar2 = (m3.s) nVar2;
                    if (sVar2.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        b4.q qVar = b4.q.f5711a;
                        b4.t tVarY = d2.c.y(qVar, z1Var);
                        g0 g0Var = m2.f13850c;
                        b4.t tVarThen = tVarY.then(g0Var);
                        u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                        int iHashCode = Long.hashCode(sVar2.T);
                        u3.i iVarL = sVar2.l();
                        b4.t tVarC = b4.a.c(tVarThen, sVar2);
                        b5.j.R.getClass();
                        b5.h hVar = b5.i.f5839b;
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(hVar);
                        } else {
                            sVar2.n0();
                        }
                        b5.g gVar = b5.i.f5843f;
                        m3.i.C(u0VarD, gVar, sVar2);
                        b5.g gVar2 = b5.i.f5842e;
                        m3.i.C(iVarL, gVar2, sVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        b5.g gVar3 = b5.i.f5844g;
                        m3.i.v(sVar2, numValueOf, gVar3);
                        b5.d dVar = b5.i.f5845h;
                        m3.i.z(sVar2, dVar);
                        b5.g gVar4 = b5.i.f5841d;
                        m3.i.C(tVarC, gVar4, sVar2);
                        float f11 = lv.t.f28253g;
                        b4.t tVarZ = d2.c.z(g0Var, f11);
                        y yVarA = d2.w.a(d2.i.f13803c, iVar, sVar2, 0);
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        u3.i iVarL2 = sVar2.l();
                        b4.t tVarC2 = b4.a.c(tVarZ, sVar2);
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(hVar);
                        } else {
                            sVar2.n0();
                        }
                        m3.i.C(yVarA, gVar, sVar2);
                        m3.i.C(iVarL2, gVar2, sVar2);
                        a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
                        m3.i.C(tVarC2, gVar4, sVar2);
                        final b0 b0Var2 = b0Var;
                        Function1 function12 = function1;
                        final b1 b1Var6 = b1Var4;
                        final b1 b1Var7 = b1Var;
                        v1.n.d(x0.z(R.drawable.ic_close24, sVar2, 0), "CloseButton", b3.i.f(b4.d.f5696o, b4.a.a(qVar, c5.m2.f7291a, new f(b0Var2, function12, b1Var6, b1Var7, 1))), null, null, 0.0f, null, sVar2, 56, 120);
                        String strU = f0.U(sVar2, R.string.charity_calendar_screen_title);
                        m5.u0 u0Var = lv.v.f28271j;
                        long j9 = lv.s.C;
                        float f12 = lv.t.f28249c;
                        r9.d(strU, d2.c.D(qVar, 0.0f, f12, 0.0f, 0.0f, 13), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar2, 432, 12582912, 131064);
                        b4.j jVar = b4.d.f5693k;
                        b4.t tVarD = d2.c.D(m2.d(qVar, 1.0f), 0.0f, lv.t.f28252f, 0.0f, 0.0f, 13);
                        i2 i2VarA = h2.a(d2.i.f13801a, jVar, sVar2, 48);
                        int iHashCode3 = Long.hashCode(sVar2.T);
                        u3.i iVarL3 = sVar2.l();
                        b4.t tVarC3 = b4.a.c(tVarD, sVar2);
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(hVar);
                        } else {
                            sVar2.n0();
                        }
                        m3.i.C(i2VarA, gVar, sVar2);
                        m3.i.C(iVarL3, gVar2, sVar2);
                        a0.y(iHashCode3, sVar2, gVar3, sVar2, dVar);
                        m3.i.C(tVarC3, gVar4, sVar2);
                        b4.t tVarD2 = d2.c.D(m2.m(qVar, 10), f12, 0.0f, f11, 0.0f, 10);
                        Object objM8 = sVar2.M();
                        m3.f fVar2 = m3.m.f29332a;
                        if (objM8 == fVar2) {
                            objM8 = new w1(4);
                            sVar2.k0(objM8);
                        }
                        v1.n.c(tVarD2, (Function1) objM8, sVar2, 54);
                        r9.d(f0.U(sVar2, R.string.charity_calendar_screen_tip), d2.c.D(qVar, 6, 0.0f, 0.0f, 0.0f, 14), lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar2, 432, 12582912, 131064);
                        sVar2.q(true);
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(e0.o(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            String upperCase = ((DayOfWeek) it.next()).name().toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            arrayList.add(upperCase);
                        }
                        final b1 b1Var8 = b1Var2;
                        Set set2 = (Set) b1Var8.getValue();
                        Object objM9 = sVar2.M();
                        if (objM9 == fVar2) {
                            objM9 = new sn.c(b1Var6, 2);
                            sVar2.k0(objM9);
                        }
                        w.c(arrayList, set2, (Function1) objM9, (List) b1Var6.getValue(), sVar2, MLKEMEngine.KyberPolyBytes);
                        sVar2.q(true);
                        b4.i iVar2 = b4.d.f5695n;
                        d2.e eVar = d2.i.f13806f;
                        b4.t tVarE = m2.e(m2.d(d2.c.w(qVar, 0.0f, ((z5.f) c3VarA2.getValue()).f47277a, 1), 1.0f), 104);
                        b4.k kVar = b4.d.f5690h;
                        d2.u uVar = d2.u.f13938a;
                        b4.t tVarA = uVar.a(tVarE, kVar);
                        long j11 = lv.s.J;
                        r0 r0Var = i4.g0.f23254b;
                        b4.t tVarJ = v1.n.j(tVarA, j11, r0Var);
                        y yVarA2 = d2.w.a(eVar, iVar2, sVar2, 54);
                        int iHashCode4 = Long.hashCode(sVar2.T);
                        u3.i iVarL4 = sVar2.l();
                        b4.t tVarC4 = b4.a.c(tVarJ, sVar2);
                        b5.j.R.getClass();
                        b5.h hVar2 = b5.i.f5839b;
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(hVar2);
                        } else {
                            sVar2.n0();
                        }
                        b5.g gVar5 = b5.i.f5843f;
                        m3.i.C(yVarA2, gVar5, sVar2);
                        b5.g gVar6 = b5.i.f5842e;
                        m3.i.C(iVarL4, gVar6, sVar2);
                        Integer numValueOf2 = Integer.valueOf(iHashCode4);
                        b5.g gVar7 = b5.i.f5844g;
                        m3.i.v(sVar2, numValueOf2, gVar7);
                        b5.d dVar2 = b5.i.f5845h;
                        m3.i.z(sVar2, dVar2);
                        b5.g gVar8 = b5.i.f5841d;
                        m3.i.C(tVarC4, gVar8, sVar2);
                        b4.t tVarD3 = m2.d(qVar, 1.0f);
                        float f13 = 1;
                        long j12 = lv.s.H;
                        s0.g(tVarD3, f13, j12, sVar2, 438, 0);
                        String strU2 = f0.U(sVar2, R.string.charity_calendar_screen_save_button);
                        b4.t tVarD4 = m2.d(qVar, 1.0f);
                        float f14 = lv.t.f28253g;
                        b4.t tVarB = d2.c.B(tVarD4, f14, 0.0f, 2);
                        Function2 function22 = function2;
                        boolean zF = sVar2.f(function22) | sVar2.f(function12);
                        Object objM10 = sVar2.M();
                        final b1 b1Var9 = b1Var5;
                        if (zF || objM10 == fVar2) {
                            objM10 = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c(25, function22, function12, b1Var8, b1Var9);
                            sVar2.k0(objM10);
                        }
                        v0.n.l(tVarB, strU2, null, null, null, false, false, null, null, (Function0) objM10, sVar2, 6, 508);
                        sVar2.q(true);
                        b4.t tVarJ2 = v1.n.j(uVar.a(m2.e(m2.d(d2.c.w(qVar, 0.0f, ((z5.f) c3VarA.getValue()).f47277a, 1), 1.0f), 154), kVar), j11, r0Var);
                        y yVarA3 = d2.w.a(d2.i.f13803c, iVar, sVar2, 0);
                        int iHashCode5 = Long.hashCode(sVar2.T);
                        u3.i iVarL5 = sVar2.l();
                        b4.t tVarC5 = b4.a.c(tVarJ2, sVar2);
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(hVar2);
                        } else {
                            sVar2.n0();
                        }
                        m3.i.C(yVarA3, gVar5, sVar2);
                        m3.i.C(iVarL5, gVar6, sVar2);
                        a0.y(iHashCode5, sVar2, gVar7, sVar2, dVar2);
                        m3.i.C(tVarC5, gVar8, sVar2);
                        s0.g(m2.d(qVar, 1.0f), f13, j12, sVar2, 438, 0);
                        String strU3 = f0.U(sVar2, R.string.charity_calendar_screen_available_button);
                        b4.t tVarD5 = m2.d(d2.c.D(qVar, f14, lv.t.f28254h, f14, 0.0f, 8), 1.0f);
                        float f15 = lv.t.f28256j;
                        b4.t tVarE2 = m2.e(tVarD5, f15);
                        final int i13 = 0;
                        final Ref.ObjectRef objectRef2 = objectRef;
                        final g7 g7Var2 = g7Var;
                        final b1 b1Var10 = b1Var3;
                        final Context context2 = context;
                        v0.n.n(tVarE2, strU3, null, null, null, false, false, null, null, new Function0() { // from class: ti.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i13) {
                                    case 0:
                                        b1 b1Var11 = b1Var6;
                                        h.b(objectRef2, g7Var2, b0Var2, b1Var10, b1Var8, b1Var9, context2, (List) b1Var11.getValue(), true);
                                        b1Var11.setValue(n0.f26529a);
                                        b1Var7.setValue(Boolean.TRUE);
                                        break;
                                    default:
                                        b1 b1Var12 = b1Var6;
                                        h.b(objectRef2, g7Var2, b0Var2, b1Var10, b1Var8, b1Var9, context2, (List) b1Var12.getValue(), false);
                                        b1Var12.setValue(n0.f26529a);
                                        b1Var7.setValue(Boolean.TRUE);
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        }, sVar2, 0, 508);
                        final int i14 = 1;
                        v0.n.n(m2.e(m2.d(d2.c.D(qVar, f14, f14, f14, 0.0f, 8), 1.0f), f15), f0.U(sVar2, R.string.charity_calendar_screen_not_available_button), null, lv.q.DANGER, null, false, false, null, null, new Function0() { // from class: ti.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i14) {
                                    case 0:
                                        b1 b1Var11 = b1Var6;
                                        h.b(objectRef2, g7Var2, b0Var2, b1Var10, b1Var8, b1Var9, context2, (List) b1Var11.getValue(), true);
                                        b1Var11.setValue(n0.f26529a);
                                        b1Var7.setValue(Boolean.TRUE);
                                        break;
                                    default:
                                        b1 b1Var12 = b1Var6;
                                        h.b(objectRef2, g7Var2, b0Var2, b1Var10, b1Var8, b1Var9, context2, (List) b1Var12.getValue(), false);
                                        b1Var12.setValue(n0.f26529a);
                                        b1Var7.setValue(Boolean.TRUE);
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        }, sVar2, 3072, 500);
                        sVar2.q(true);
                        sVar2.q(true);
                    } else {
                        sVar2.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, 806882304, 183);
            sVar = sVar;
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lp.v(list, set, function1, function2, i11);
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [T, v80.b2] */
    public static final void b(Ref.ObjectRef objectRef, g7 g7Var, b0 b0Var, b1 b1Var, b1 b1Var2, b1 b1Var3, Context context, List list, boolean z11) {
        Object next;
        Object next2;
        b1Var.setValue(p0.f26531a);
        Iterator it = list.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            LocalDate localDate = (LocalDate) it.next();
            Iterator it2 = ((Set) b1Var2.getValue()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (Intrinsics.areEqual(((LocalDivergenceDay) next).getDate(), localDate)) {
                        break;
                    }
                }
            }
            if (((LocalDivergenceDay) next) == null) {
                b1Var2.setValue(i1.i((Set) b1Var2.getValue(), new LocalDivergenceDay(localDate, z11)));
                b1Var.setValue(i1.i((Set) b1Var.getValue(), new LocalDivergenceDay(localDate, z11)));
            } else {
                Set set = (Set) b1Var2.getValue();
                Iterator it3 = ((Set) b1Var2.getValue()).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it3.next();
                        if (Intrinsics.areEqual(((LocalDivergenceDay) next2).getDate(), localDate)) {
                            break;
                        }
                    }
                }
                next2.getClass();
                b1Var2.setValue(i1.f(set, next2));
                b1Var2.setValue(i1.i((Set) b1Var2.getValue(), new LocalDivergenceDay(localDate, z11)));
                Set set2 = (Set) b1Var.getValue();
                Iterator it4 = ((Set) b1Var2.getValue()).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next3 = it4.next();
                    if (Intrinsics.areEqual(((LocalDivergenceDay) next3).getDate(), localDate)) {
                        obj = next3;
                        break;
                    }
                }
                obj.getClass();
                b1Var.setValue(i1.f(set2, obj));
                b1Var.setValue(i1.i((Set) b1Var.getValue(), new LocalDivergenceDay(localDate, z11)));
            }
            b1Var3.setValue(i1.i((Set) b1Var3.getValue(), new LocalDivergenceDay(localDate, z11)));
        }
        v80.i1 i1Var = (v80.i1) objectRef.element;
        if (i1Var != null) {
            i1Var.a(null);
        }
        d7 d7VarA = g7Var.a();
        if (d7VarA != null) {
            d7VarA.a();
        }
        objectRef.element = v80.f0.B(b0Var, null, null, new g(list, z11, context, g7Var, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List c(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return n0.f26529a;
        }
        List listK0 = CollectionsKt.k0(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = listK0.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (arrayList2.isEmpty()) {
                arrayList2.add(listK0.get(i11));
            } else if (Intrinsics.areEqual(((LocalDate) CollectionsKt.W(arrayList2)).plusDays(1L), listK0.get(i11))) {
                arrayList2.add(listK0.get(i11));
            } else {
                arrayList.add(arrayList2);
                arrayList2 = d0.j(listK0.get(i11));
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(arrayList2);
        }
        return arrayList;
    }
}

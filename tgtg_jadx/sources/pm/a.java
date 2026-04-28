package pm;

import androidx.lifecycle.s1;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.braze.h2;
import com.google.android.gms.internal.measurement.cg;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b2;
import d2.i2;
import d2.m2;
import d2.w0;
import d40.t1;
import f2.c0;
import g3.r9;
import g3.s0;
import i4.g0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import m3.b1;
import m3.c3;
import m3.w1;
import o00.x0;
import o30.e0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f35489a = new u3.d(new p60.a(5), false, -666469736);

    /* JADX WARN: Removed duplicated region for block: B:145:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x045b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r39, int r40, com.google.firebase.messaging.a0 r41, tm.e r42, final boolean r43, kotlin.jvm.functions.Function2 r44, u3.d r45, m3.n r46, int r47) {
        /*
            Method dump skipped, instruction units count: 1165
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.a.a(int, int, com.google.firebase.messaging.a0, tm.e, boolean, kotlin.jvm.functions.Function2, u3.d, m3.n, int):void");
    }

    public static final void b(k kVar, m3.n nVar, int i11) {
        kVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-497896844);
        int i12 = (sVar.f(kVar) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            PantryThemeKt.PantryTheme(false, null, u3.e.e(731892082, sVar, new l(kVar)), sVar, 390, 2);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new l(kVar, i11);
        }
    }

    public static final void c(String str, n4.b bVar, Function0 function0, m3.n nVar, int i11) {
        int i12;
        str.getClass();
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-492147482);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar.f(bVar) : sVar.h(bVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function0) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            String strU = f0.U(sVar, R.string.browse_map_view_map_button);
            b4.t tVarA = m2.a(b4.q.f5711a, 88, 32);
            boolean zF = sVar.f(strU);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zF || objM == fVar) {
                objM = new gt.e(strU, 20);
                sVar.k0(objM);
            }
            b4.t tVarC = j5.r.c(tVarA, false, (Function1) objM);
            l2.f fVarB = l2.g.b(100);
            b2 b2Var = g3.p.f19253a;
            g3.o oVarA = g3.p.a(lv.s.f28217b, 0L, 0L, 0L, sVar, 14);
            boolean z11 = (i12 & 896) == 256;
            Object objM2 = sVar.M();
            if (z11 || objM2 == fVar) {
                objM2 = new oo.z(9, function0);
                sVar.k0(objM2);
            }
            s0.a((Function0) objM2, tVarC, false, fVarB, oVarA, null, null, null, null, u3.e.e(-485339402, sVar, new oo.s(3, bVar, str)), sVar, 805306368, 484);
            sVar = sVar;
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(str, bVar, function0, i11, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v47 */
    public static final void d(final y yVar, final Long l, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final Function1 function1, final Function1 function12, final Function1 function13, m3.n nVar, final int i11) {
        m3.f fVar;
        b4.q qVar;
        boolean z15;
        k kVar;
        z zVar;
        boolean z16;
        c0 c0Var;
        boolean z17;
        z zVar2;
        z zVar3;
        function1.getClass();
        function12.getClass();
        function13.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1564830917);
        int i12 = i11 | (sVar.h(yVar) ? 4 : 2) | (sVar.f(l) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.g(z12) ? NewHope.SENDB_BYTES : 1024) | (sVar.g(z13) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.g(z14) ? 131072 : 65536) | (sVar.h(function1) ? 1048576 : 524288) | (sVar.h(function12) ? 8388608 : 4194304) | (sVar.h(function13) ? 67108864 : 33554432);
        if (sVar.R(i12 & 1, (i12 & 38347923) != 38347922)) {
            s1 s1VarA = z8.a.a(sVar);
            if (s1VarA == null) {
                h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            b1 b1VarN = m3.i.n(((tm.e) t1.K(Reflection.getOrCreateKotlinClass(tm.e.class), s1VarA, e0.r(s1VarA, sVar), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar)).F, sVar, 0);
            x70.c cVar = null;
            List list = yVar != null ? yVar.f35566b : null;
            z zVar4 = yVar != null ? yVar.f35565a : null;
            List list2 = (List) b1VarN.getValue();
            boolean zH = sVar.h(yVar) | sVar.f(b1VarN);
            Object objM = sVar.M();
            m3.f fVar2 = m3.m.f29332a;
            if (zH || objM == fVar2) {
                objM = new is.h(yVar, b1VarN, cVar, 25);
                sVar.k0(objM);
            }
            m3.i.f(list, zVar4, list2, (Function2) objM, sVar);
            c0 c0VarA = f2.e0.a(0, 0, 0, 3, sVar);
            boolean zF = ((i12 & 112) == 32) | sVar.f(c0VarA);
            Object objM2 = sVar.M();
            if (zF || objM2 == fVar2) {
                objM2 = new mn.g(l, c0VarA, null, 16);
                sVar.k0(objM2);
            }
            m3.i.h(l, (Function2) objM2, sVar);
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            float f11 = mVar.l;
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarJ = v1.n.j(d2.c.D(qVar2, f11, 0.0f, f11, 0.0f, 10), hVar.G, g0.f23254b);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarJ, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            if ((yVar != null ? yVar.f35567c : null) == null) {
                sVar.a0(-909188292);
                b4.t tVarB = d2.c.B(qVar2, 0.0f, lv.t.f28253g, 1);
                b4.i iVar = b4.d.f5695n;
                fVar = fVar2;
                v1.n.d(x0.z(R.drawable.ic_line, sVar, 0), null, b3.i.f(iVar, tVarB), null, null, 0.0f, null, sVar, 56, 120);
                sVar = sVar;
                if (cg.q((yVar == null || (zVar3 = yVar.f35565a) == null) ? null : zVar3.f35568a)) {
                    sVar.a0(-908836876);
                    int i13 = (yVar == null || (zVar2 = yVar.f35565a) == null) ? 0 : zVar2.f35569b;
                    Object objM3 = sVar.M();
                    if (objM3 == fVar) {
                        objM3 = m3.i.w(Boolean.FALSE);
                        sVar.k0(objM3);
                    }
                    b1 b1Var = (b1) objM3;
                    Boolean boolValueOf = Boolean.valueOf(z12);
                    Boolean boolValueOf2 = Boolean.valueOf(z13);
                    Boolean boolValueOf3 = Boolean.valueOf(z14);
                    boolean z18 = ((i12 & 7168) == 2048) | ((458752 & i12) == 131072) | ((57344 & i12) == 16384);
                    Object objM4 = sVar.M();
                    if (z18 || objM4 == fVar) {
                        objM4 = new x(z14, z12, z13, b1Var, null);
                        sVar.k0(objM4);
                    }
                    m3.i.f(boolValueOf, boolValueOf2, boolValueOf3, (Function2) objM4, sVar);
                    kVar = null;
                    int i14 = i13;
                    c3 c3VarB = t1.d.b(!((Boolean) b1Var.getValue()).booleanValue() ? 1.0f : 0.0f, t1.c.k(300, 0, null, 6), "titleAlpha", null, sVar, 3120, 20);
                    b4.t tVarE = m2.e(new w0(iVar), 28);
                    u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    u3.i iVarL2 = sVar.l();
                    b4.t tVarC2 = b4.a.c(tVarE, sVar);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar2);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(u0VarD, gVar, sVar);
                    m3.i.C(iVarL2, gVar2, sVar);
                    a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
                    m3.i.C(tVarC2, gVar4, sVar);
                    qVar = qVar2;
                    r9.d(f0.G(R.plurals.map_sheet_bag_count, i14, new Object[]{i14 >= 1000 ? "1000+" : Integer.valueOf(i14)}, sVar), f4.g.a(d2.u.f13938a.a(m2.d(qVar, 1.0f), b4.d.f5687e), ((Number) c3VarB.getValue()).floatValue()), hVar.J, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, jVar.f43957f, sVar, 0, 0, 130040);
                    sVar = sVar;
                    z15 = true;
                    sVar.q(true);
                    z17 = false;
                    sVar.q(false);
                } else {
                    qVar = qVar2;
                    z15 = true;
                    z17 = false;
                    kVar = null;
                    sVar.a0(-906933135);
                    sVar.q(false);
                }
                sVar.q(z17);
            } else {
                fVar = fVar2;
                qVar = qVar2;
                z15 = true;
                kVar = null;
                sVar.a0(-906923215);
                sVar.q(false);
            }
            float f12 = lv.t.f28251e;
            d2.c.f(m2.e(qVar, f12), sVar);
            if ((yVar != null ? yVar.f35567c : kVar) != null) {
                sVar.a0(-906801354);
                k kVar2 = yVar.f35567c;
                kVar2.getClass();
                b(kVar2, sVar, 0);
                sVar.q(false);
            } else {
                if (cg.q(yVar != null ? yVar.f35566b : kVar)) {
                    sVar.a0(-906653546);
                    b4.t tVarD = d2.c.D(qVar, 0.0f, f12, 0.0f, 0.0f, 13);
                    boolean zH2 = sVar.h(yVar) | ((i12 & 896) == 256 ? z15 : false) | ((i12 & 3670016) == 1048576 ? z15 : false) | ((i12 & 29360128) == 8388608 ? z15 : false) | ((i12 & 234881024) == 67108864 ? z15 : false);
                    Object objM5 = sVar.M();
                    if (zH2 || objM5 == fVar) {
                        final int i15 = 0;
                        z16 = z15;
                        c0Var = c0VarA;
                        Function1 function14 = new Function1() { // from class: pm.u
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                z zVar5;
                                List list3;
                                f2.l lVar = (f2.l) obj;
                                switch (i15) {
                                    case 0:
                                        lVar.getClass();
                                        f2.l.q(lVar, null, new u3.d(new lp.n(yVar, z11, function1, function12, function13), true, -354445273), 3);
                                        break;
                                    default:
                                        lVar.getClass();
                                        final y yVar2 = yVar;
                                        Integer numValueOf2 = (yVar2 == null || (zVar5 = yVar2.f35565a) == null || (list3 = zVar5.f35568a) == null) ? null : Integer.valueOf(list3.size());
                                        numValueOf2.getClass();
                                        int iIntValue = numValueOf2.intValue();
                                        final boolean z19 = z11;
                                        final Function1 function15 = function1;
                                        final Function1 function16 = function12;
                                        final Function1 function17 = function13;
                                        f2.l.s(lVar, iIntValue, null, new u3.d(new i80.o() { // from class: pm.w
                                            @Override // i80.o
                                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                                int iIntValue2 = ((Integer) obj3).intValue();
                                                m3.n nVar2 = (m3.n) obj4;
                                                int iIntValue3 = ((Integer) obj5).intValue();
                                                ((f2.d) obj2).getClass();
                                                if ((iIntValue3 & 48) == 0) {
                                                    iIntValue3 |= ((m3.s) nVar2).d(iIntValue2) ? 32 : 16;
                                                }
                                                m3.s sVar2 = (m3.s) nVar2;
                                                if (sVar2.R(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                                    y yVar3 = yVar2;
                                                    List list4 = (List) yVar3.f35565a.f35568a.get(iIntValue2);
                                                    Function1 function18 = function15;
                                                    boolean zF2 = sVar2.f(function18);
                                                    Object objM6 = sVar2.M();
                                                    m3.f fVar3 = m3.m.f29332a;
                                                    if (zF2 || objM6 == fVar3) {
                                                        objM6 = new gn.n(function18, 5);
                                                        sVar2.k0(objM6);
                                                    }
                                                    Function1 function19 = (Function1) objM6;
                                                    Function1 function110 = function16;
                                                    boolean zF3 = sVar2.f(function110);
                                                    Object objM7 = sVar2.M();
                                                    if (zF3 || objM7 == fVar3) {
                                                        objM7 = new gn.n(function110, 6);
                                                        sVar2.k0(objM7);
                                                    }
                                                    a.e(list4, z19, function19, (Function1) objM7, function17, sVar2, 0);
                                                    if (iIntValue2 == yVar3.f35565a.f35568a.size() - 1) {
                                                        sVar2.a0(-1441688474);
                                                        b3.i.y(b4.q.f5711a, lv.t.f28253g, sVar2, false);
                                                    } else {
                                                        sVar2.a0(-1441583725);
                                                        sVar2.q(false);
                                                    }
                                                } else {
                                                    sVar2.U();
                                                }
                                                return Unit.f26487a;
                                            }
                                        }, true, 348410383), 6);
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar.k0(function14);
                        objM5 = function14;
                    } else {
                        z16 = z15;
                        c0Var = c0VarA;
                    }
                    m3.s sVar2 = sVar;
                    ox.h.c(tVarD, c0Var, null, null, null, null, false, null, (Function1) objM5, sVar2, 6, 508);
                    sVar = sVar2;
                    sVar.q(false);
                    z15 = z16;
                } else {
                    b4.q qVar3 = qVar;
                    boolean z19 = z15;
                    if (cg.q((yVar == null || (zVar = yVar.f35565a) == null) ? kVar : zVar.f35568a)) {
                        sVar.a0(-905824637);
                        b4.t tVarD2 = d2.c.D(qVar3, 0.0f, lv.t.f28252f, 0.0f, 0.0f, 13);
                        boolean zH3 = sVar.h(yVar) | ((i12 & 896) == 256 ? z19 : false) | ((i12 & 3670016) == 1048576 ? z19 : false) | ((i12 & 29360128) == 8388608 ? z19 : false) | ((i12 & 234881024) == 67108864 ? z19 : false);
                        Object objM6 = sVar.M();
                        if (zH3 || objM6 == fVar) {
                            final int i16 = 1;
                            Function1 function15 = new Function1() { // from class: pm.u
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    z zVar5;
                                    List list3;
                                    f2.l lVar = (f2.l) obj;
                                    switch (i16) {
                                        case 0:
                                            lVar.getClass();
                                            f2.l.q(lVar, null, new u3.d(new lp.n(yVar, z11, function1, function12, function13), true, -354445273), 3);
                                            break;
                                        default:
                                            lVar.getClass();
                                            final y yVar2 = yVar;
                                            Integer numValueOf2 = (yVar2 == null || (zVar5 = yVar2.f35565a) == null || (list3 = zVar5.f35568a) == null) ? null : Integer.valueOf(list3.size());
                                            numValueOf2.getClass();
                                            int iIntValue = numValueOf2.intValue();
                                            final boolean z192 = z11;
                                            final Function1 function152 = function1;
                                            final Function1 function16 = function12;
                                            final Function1 function17 = function13;
                                            f2.l.s(lVar, iIntValue, null, new u3.d(new i80.o() { // from class: pm.w
                                                @Override // i80.o
                                                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                                    int iIntValue2 = ((Integer) obj3).intValue();
                                                    m3.n nVar2 = (m3.n) obj4;
                                                    int iIntValue3 = ((Integer) obj5).intValue();
                                                    ((f2.d) obj2).getClass();
                                                    if ((iIntValue3 & 48) == 0) {
                                                        iIntValue3 |= ((m3.s) nVar2).d(iIntValue2) ? 32 : 16;
                                                    }
                                                    m3.s sVar22 = (m3.s) nVar2;
                                                    if (sVar22.R(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                                        y yVar3 = yVar2;
                                                        List list4 = (List) yVar3.f35565a.f35568a.get(iIntValue2);
                                                        Function1 function18 = function152;
                                                        boolean zF2 = sVar22.f(function18);
                                                        Object objM62 = sVar22.M();
                                                        m3.f fVar3 = m3.m.f29332a;
                                                        if (zF2 || objM62 == fVar3) {
                                                            objM62 = new gn.n(function18, 5);
                                                            sVar22.k0(objM62);
                                                        }
                                                        Function1 function19 = (Function1) objM62;
                                                        Function1 function110 = function16;
                                                        boolean zF3 = sVar22.f(function110);
                                                        Object objM7 = sVar22.M();
                                                        if (zF3 || objM7 == fVar3) {
                                                            objM7 = new gn.n(function110, 6);
                                                            sVar22.k0(objM7);
                                                        }
                                                        a.e(list4, z192, function19, (Function1) objM7, function17, sVar22, 0);
                                                        if (iIntValue2 == yVar3.f35565a.f35568a.size() - 1) {
                                                            sVar22.a0(-1441688474);
                                                            b3.i.y(b4.q.f5711a, lv.t.f28253g, sVar22, false);
                                                        } else {
                                                            sVar22.a0(-1441583725);
                                                            sVar22.q(false);
                                                        }
                                                    } else {
                                                        sVar22.U();
                                                    }
                                                    return Unit.f26487a;
                                                }
                                            }, true, 348410383), 6);
                                            break;
                                    }
                                    return Unit.f26487a;
                                }
                            };
                            sVar.k0(function15);
                            objM6 = function15;
                        }
                        m3.s sVar3 = sVar;
                        z15 = z19;
                        ox.h.c(tVarD2, c0VarA, null, null, null, null, false, null, (Function1) objM6, sVar3, 6, 508);
                        sVar = sVar3;
                        sVar.q(false);
                    } else {
                        z15 = z19;
                        sVar.a0(-904926319);
                        sVar.q(false);
                    }
                }
            }
            sVar.q(z15);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(l, z11, z12, z13, z14, function1, function12, function13, i11) { // from class: pm.v

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Long f35548b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f35549c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f35550d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f35551e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f35552f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Function1 f35553g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ Function1 f35554h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ Function1 f35555i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    a.d(this.f35547a, this.f35548b, this.f35549c, this.f35550d, this.f35551e, this.f35552f, this.f35553g, this.f35554h, this.f35555i, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void e(List list, boolean z11, Function1 function1, Function1 function12, Function1 function13, m3.n nVar, int i11) {
        list.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1241384961);
        boolean z12 = z11;
        int i12 = 256;
        int i13 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.g(z12) ? 32 : 16) | (sVar.h(function1) ? 256 : 128);
        boolean zH = sVar.h(function12);
        int i14 = NewHope.SENDB_BYTES;
        int i15 = i13 | (zH ? 2048 : 1024);
        boolean zH2 = sVar.h(function13);
        int i16 = BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
        int i17 = i15 | (zH2 ? 16384 : 8192);
        if (sVar.R(i17 & 1, (i17 & 9363) != 9362)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                BasicItem basicItem = (BasicItem) it.next();
                boolean z13 = ((i17 & 7168) == i14) | ((i17 & 896) == i12);
                Object objM = sVar.M();
                m3.f fVar = m3.m.f29332a;
                if (z13 || objM == fVar) {
                    objM = new p(function12, function1, 1);
                    sVar.k0(objM);
                }
                Function1 function14 = (Function1) objM;
                boolean zH3 = ((57344 & i17) == i16) | sVar.h(basicItem);
                Object objM2 = sVar.M();
                if (zH3 || objM2 == fVar) {
                    objM2 = new eg.k(function13, basicItem, 3);
                    sVar.k0(objM2);
                }
                t1.m(null, basicItem, false, false, false, z12, function14, (Function0) objM2, null, sVar, ((i17 << 12) & 458752) | MLKEMEngine.KyberPolyBytes, 281);
                z12 = z11;
                i14 = i14;
                i16 = i16;
                i12 = i12;
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bg.d(list, z11, function1, function12, function13, i11, 8);
        }
    }

    public static final void f(b4.t tVar, Function0 function0, boolean z11, u3.d dVar, m3.n nVar, int i11) {
        u3.d dVar2;
        b4.t tVar2;
        int i12;
        boolean z12;
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(47846082);
        int i13 = i11 | 6 | (sVar.h(function0) ? 32 : 16) | (sVar.g(z11) ? 256 : 128);
        if (sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar3 = b5.i.f5845h;
            m3.i.z(sVar, dVar3);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            if (z11) {
                sVar.a0(1524955448);
                i12 = 6;
                b4.t tVarD = m2.d(d2.c.D(qVar, 0.0f, 0.0f, lv.t.f28254h, 0.0f, 11), 1.0f);
                i2 i2VarA = d2.h2.a(d2.i.f13802b, b4.d.f5692j, sVar, 6);
                int iHashCode2 = Long.hashCode(sVar.T);
                u3.i iVarL2 = sVar.l();
                b4.t tVarC2 = b4.a.c(tVarD, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(i2VarA, gVar, sVar);
                m3.i.C(iVarL2, gVar2, sVar);
                a0.y(iHashCode2, sVar, gVar3, sVar, dVar3);
                m3.i.C(tVarC2, gVar4, sVar);
                c(f0.U(sVar, R.string.browse_tab_list), x0.z(R.drawable.list_icon, sVar, 0), function0, sVar, ((i13 << 3) & 896) | 64);
                z12 = true;
                sVar.q(true);
                sVar.q(false);
            } else {
                i12 = 6;
                z12 = true;
                sVar.a0(1525414806);
                sVar.q(false);
            }
            dVar2 = dVar;
            r8.k.w(i12, dVar2, sVar, z12);
            tVar2 = qVar;
        } else {
            dVar2 = dVar;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.c(tVar2, function0, z11, dVar2, i11, 7);
        }
    }

    public static final void g(List list, Function1 function1, Function1 function12, m3.n nVar, int i11) {
        list.getClass();
        function1.getClass();
        function12.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1986139672);
        int i12 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.h(function1) ? 32 : 16) | (sVar.h(function12) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            c0 c0VarA = f2.e0.a(0, 0, 0, 3, sVar);
            a2.j jVarG = b0.a0.G(c0VarA, sVar, 0, 2);
            b4.t tVarJ = v1.n.j(d2.c.D(m2.d(b4.q.f5711a, 1.0f), 0.0f, 0.0f, 0.0f, lv.t.f28249c, 7), lv.s.K, g0.f23254b);
            float f11 = lv.t.f28251e;
            float f12 = lv.t.f28252f;
            b2 b2Var = new b2(f12, f11, f12, f12);
            boolean zH = ((i12 & 112) == 32) | sVar.h(list) | ((i12 & 896) == 256);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new gn.k(list, function1, function12, 3);
                sVar.k0(objM);
            }
            ox.h.d(tVarJ, c0VarA, b2Var, false, null, null, jVarG, false, null, (Function1) objM, sVar, 6, 440);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.l(list, function1, function12, i11, 1);
        }
    }
}

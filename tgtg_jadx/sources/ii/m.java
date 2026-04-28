package ii;

import a3.t3;
import a3.u3;
import com.app.tgtg.R;
import com.tgtg.componentlibrary.component.chip.ComposableSingletons$DemoPantryChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.ComposableSingletons$DemoFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.variant.ComposableSingletons$AvatarFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.ComposableSingletons$DemoSelectionChipKt;
import d2.h2;
import d2.j2;
import d2.m2;
import d2.n1;
import g3.i2;
import g3.r9;
import g3.s0;
import i4.r0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m5.u0;
import o00.x0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23954a;

    public /* synthetic */ m(int i11) {
        this.f23954a = i11;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f23954a;
        d2.u uVar = d2.u.f13938a;
        b4.q qVar = b4.q.f5711a;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    r9.d(o30.f0.U(sVar, R.string.charity_home_title_available), d2.c.z(qVar, lv.t.f28253g), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28272k, sVar, 432, 12582912, 131064);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                b4.t tVar = (b4.t) obj;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ComposableSingletons$DemoPantryChipKt composableSingletons$DemoPantryChipKt = ComposableSingletons$DemoPantryChipKt.INSTANCE;
                tVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((m3.s) nVar2).f(tVar) ? 4 : 2;
                }
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    i2.a(x0.z(R.drawable.illustration, sVar2, 0), null, tVar, 0L, sVar2, 56 | ((iIntValue2 << 6) & 896), 8);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                b4.t tVar2 = (b4.t) obj;
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ComposableSingletons$DemoPantryChipKt composableSingletons$DemoPantryChipKt2 = ComposableSingletons$DemoPantryChipKt.INSTANCE;
                tVar2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((m3.s) nVar3).f(tVar2) ? 4 : 2;
                }
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    i2.a(x0.z(R.drawable.illustration, sVar3, 0), null, tVar2, 0L, sVar3, 56 | ((iIntValue3 << 6) & 896), 8);
                } else {
                    sVar3.U();
                }
                break;
            case 3:
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                m3.s sVar4 = (m3.s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    r9.d(o30.f0.U(sVar4, R.string.badges_info_bottomsheet_cta), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(lv.v.f28281u, lv.s.J, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar4, 0, 0, 131070);
                } else {
                    sVar4.U();
                }
                break;
            case 4:
                m3.n nVar5 = (m3.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((g2.l) obj).getClass();
                m3.s sVar5 = (m3.s) nVar5;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    s0.d(d2.c.z(qVar, o30.e0.s(sVar5, R.dimen.spacing_3)), 1, lv.s.H, sVar5, 432);
                } else {
                    sVar5.U();
                }
                break;
            case 5:
                m3.n nVar6 = (m3.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar6 = (m3.s) nVar6;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    b4.q qVar2 = b4.q.f5711a;
                    b4.t tVarT = m2.t(m2.d(qVar2, 1.0f), 3);
                    d2.i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar6, 0);
                    int iHashCode = Long.hashCode(sVar6.T);
                    u3.i iVarL = sVar6.l();
                    b4.t tVarC = b4.a.c(tVarT, sVar6);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(hVar);
                    } else {
                        sVar6.n0();
                    }
                    b5.g gVar = b5.i.f5843f;
                    m3.i.C(i2VarA, gVar, sVar6);
                    b5.g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL, gVar2, sVar6);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b5.g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar6, numValueOf, gVar3);
                    b5.d dVar = b5.i.f5845h;
                    m3.i.z(sVar6, dVar);
                    b5.g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC, gVar4, sVar6);
                    b4.t tVarZ = d2.c.z(qVar2, o30.e0.s(sVar6, R.dimen.spacing_2));
                    b4.j jVar = b4.d.f5693k;
                    v1.n.d(x0.z(R.drawable.gfx_badge, sVar6, 0), null, b3.i.g(jVar, tVarZ), null, null, 0.0f, null, sVar6, 56, 120);
                    b4.t tVarT2 = m2.t(m2.d(qVar2, 1.0f), 3);
                    if (1.0f <= 0.0d) {
                        e2.a.a("invalid weight; must be greater than zero");
                    }
                    b4.t tVarB = d2.c.B(tVarT2.then(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 0.0f, o30.e0.s(sVar6, R.dimen.spacing_2), 1);
                    d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar6, 0);
                    int iHashCode2 = Long.hashCode(sVar6.T);
                    u3.i iVarL2 = sVar6.l();
                    b4.t tVarC2 = b4.a.c(tVarB, sVar6);
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(hVar);
                    } else {
                        sVar6.n0();
                    }
                    m3.i.C(yVarA, gVar, sVar6);
                    m3.i.C(iVarL2, gVar2, sVar6);
                    w.a0.y(iHashCode2, sVar6, gVar3, sVar6, dVar);
                    m3.i.C(tVarC2, gVar4, sVar6);
                    String strU = o30.f0.U(sVar6, R.string.badges_page_recent_badge_empty_header);
                    u0 u0Var = lv.v.f28275o;
                    long j9 = lv.s.J;
                    r9.d(strU, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(u0Var, j9, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446), sVar6, 0, 0, 131070);
                    r9.d(o30.f0.U(sVar6, R.string.badges_page_recent_badge_empty_body), d2.c.D(qVar2, 0.0f, o30.e0.s(sVar6, R.dimen.spacing_0_5), 0.0f, 0.0f, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(lv.v.f28274n, j9, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446), sVar6, 0, 0, 131068);
                    sVar6.q(true);
                    v1.n.d(x0.z(R.drawable.ic_chevron_right, sVar6, 0), null, b3.i.g(jVar, d2.c.z(qVar2, o30.e0.s(sVar6, R.dimen.spacing_2))), null, null, 0.0f, null, sVar6, 56, 120);
                    sVar6.q(true);
                } else {
                    sVar6.U();
                }
                break;
            case 6:
                m3.n nVar7 = (m3.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar7 = (m3.s) nVar7;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    d2.c.f(m2.h(qVar, lv.t.f28251e), sVar7);
                } else {
                    sVar7.U();
                }
                break;
            case 7:
                m3.n nVar8 = (m3.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                m3.s sVar8 = (m3.s) nVar8;
                if (sVar8.R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    r9.d(o30.f0.U(sVar8, R.string.discover_not_live_here_insta_button), null, lv.s.J, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28281u, sVar8, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                } else {
                    sVar8.U();
                }
                break;
            case 8:
                m3.n nVar9 = (m3.n) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar9 = (m3.s) nVar9;
                if (sVar9.R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    d2.c.f(d2.c.t(m2.e(qVar, 120)), sVar9);
                } else {
                    sVar9.U();
                }
                break;
            case 9:
                m3.n nVar10 = (m3.n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                m3.s sVar10 = (m3.s) nVar10;
                if (sVar10.R(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    r9.d(o30.f0.U(sVar10, R.string.charity_item_pass), null, lv.s.f28217b, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28281u, sVar10, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                } else {
                    sVar10.U();
                }
                break;
            case 10:
                m3.n nVar11 = (m3.n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar11 = (m3.s) nVar11;
                if (!sVar11.R(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    sVar11.U();
                }
                break;
            case 11:
                m3.n nVar12 = (m3.n) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar12 = (m3.s) nVar12;
                if (sVar12.R(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    long j11 = lv.s.A;
                    r0 r0Var = i4.g0.f23254b;
                    b4.q qVar3 = b4.q.f5711a;
                    b4.t tVarJ = v1.n.j(qVar3, j11, r0Var);
                    z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                    int iHashCode3 = Long.hashCode(sVar12.T);
                    u3.i iVarL3 = sVar12.l();
                    b4.t tVarC3 = b4.a.c(tVarJ, sVar12);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar12.e0();
                    if (sVar12.S) {
                        sVar12.k(hVar2);
                    } else {
                        sVar12.n0();
                    }
                    b5.g gVar5 = b5.i.f5843f;
                    m3.i.C(u0VarD, gVar5, sVar12);
                    b5.g gVar6 = b5.i.f5842e;
                    m3.i.C(iVarL3, gVar6, sVar12);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    b5.g gVar7 = b5.i.f5844g;
                    m3.i.v(sVar12, numValueOf2, gVar7);
                    b5.d dVar2 = b5.i.f5845h;
                    m3.i.z(sVar12, dVar2);
                    b5.g gVar8 = b5.i.f5841d;
                    m3.i.C(tVarC3, gVar8, sVar12);
                    v1.n.d(x0.z(R.drawable.recipe_banner_mushroom, sVar12, 0), null, m2.g(m2.d(qVar3, 1.0f), 0.0f, 150, 1), null, z4.l.f47166a, 0.0f, null, sVar12, 25016, 104);
                    b4.t tVarD = m2.d(uVar.a(qVar3, b4.d.f5687e), 1.0f);
                    float f11 = lv.t.f28253g;
                    b4.t tVarB2 = d2.c.B(tVarD, f11, 0.0f, 2);
                    d2.y yVarA2 = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar12, 0);
                    int iHashCode4 = Long.hashCode(sVar12.T);
                    u3.i iVarL4 = sVar12.l();
                    b4.t tVarC4 = b4.a.c(tVarB2, sVar12);
                    sVar12.e0();
                    if (sVar12.S) {
                        sVar12.k(hVar2);
                    } else {
                        sVar12.n0();
                    }
                    m3.i.C(yVarA2, gVar5, sVar12);
                    m3.i.C(iVarL4, gVar6, sVar12);
                    w.a0.y(iHashCode4, sVar12, gVar7, sVar12, dVar2);
                    m3.i.C(tVarC4, gVar8, sVar12);
                    r9.d(o30.f0.U(sVar12, R.string.fridge_recipe_profile_promo_card_title), d2.c.D(qVar3, 0.0f, 0.0f, 0.0f, lv.t.f28251e, 7), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28265d, sVar12, 432, 12582912, 131064);
                    r9.d(o30.f0.U(sVar12, R.string.fridge_recipe_profile_promo_card_body), d2.c.D(qVar3, 0.0f, 0.0f, lv.t.f28254h, 0.0f, 11), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar12, 48, 12582912, 131068);
                    sVar12.q(true);
                    i2.a(x0.z(R.drawable.ic_arrow_green, sVar12, 0), null, d2.c.z(uVar.a(qVar3, b4.d.f5691i), f11), lv.s.f28217b, sVar12, 3128, 0);
                    sVar12.q(true);
                } else {
                    sVar12.U();
                }
                break;
            case 12:
                m3.n nVar13 = (m3.n) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar13 = (m3.s) nVar13;
                if (sVar13.R(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    d2.c.f(m2.e(qVar, lv.t.f28257k), sVar13);
                } else {
                    sVar13.U();
                }
                break;
            case 13:
                m3.n nVar14 = (m3.n) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar14 = (m3.s) nVar14;
                if (sVar14.R(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    d2.c.f(m2.e(qVar, lv.t.f28256j), sVar14);
                } else {
                    sVar14.U();
                }
                break;
            case 14:
                m3.n nVar15 = (m3.n) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar15 = (m3.s) nVar15;
                if (sVar15.R(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    d2.c.f(m2.e(qVar, lv.t.f28252f), sVar15);
                } else {
                    sVar15.U();
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                m3.n nVar16 = (m3.n) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar16 = (m3.s) nVar16;
                if (sVar16.R(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    lp.d.u(0, null, o30.f0.U(sVar16, R.string.fridge_recipe_list_title), o30.f0.U(sVar16, R.string.fridge_recipe_list_description), sVar16);
                } else {
                    sVar16.U();
                }
                break;
            case 16:
                m3.n nVar17 = (m3.n) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar17 = (m3.s) nVar17;
                if (sVar17.R(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    float f12 = lv.t.f28253g;
                    lp.d.n(d2.c.B(qVar, f12, 0.0f, 2), sVar17, 6);
                    d2.c.f(m2.e(qVar, f12), sVar17);
                } else {
                    sVar17.U();
                }
                break;
            case 17:
                m3.n nVar18 = (m3.n) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar18 = (m3.s) nVar18;
                if (sVar18.R(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    lp.d.u(0, null, o30.f0.U(sVar18, R.string.fridge_saved_list_title), o30.f0.U(sVar18, R.string.fridge_saved_list_description), sVar18);
                } else {
                    sVar18.U();
                }
                break;
            case 18:
                m3.n nVar19 = (m3.n) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar19 = (m3.s) nVar19;
                if (sVar19.R(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    b4.t tVarB3 = d2.c.B(m2.f13850c, lv.t.f28255i, 0.0f, 2);
                    z4.u0 u0VarD2 = d2.p.d(b4.d.f5683a, false);
                    int iHashCode5 = Long.hashCode(sVar19.T);
                    u3.i iVarL5 = sVar19.l();
                    b4.t tVarC5 = b4.a.c(tVarB3, sVar19);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar19.e0();
                    if (sVar19.S) {
                        sVar19.k(hVar3);
                    } else {
                        sVar19.n0();
                    }
                    b5.g gVar9 = b5.i.f5843f;
                    m3.i.C(u0VarD2, gVar9, sVar19);
                    b5.g gVar10 = b5.i.f5842e;
                    m3.i.C(iVarL5, gVar10, sVar19);
                    Integer numValueOf3 = Integer.valueOf(iHashCode5);
                    b5.g gVar11 = b5.i.f5844g;
                    m3.i.v(sVar19, numValueOf3, gVar11);
                    b5.d dVar3 = b5.i.f5845h;
                    m3.i.z(sVar19, dVar3);
                    b5.g gVar12 = b5.i.f5841d;
                    m3.i.C(tVarC5, gVar12, sVar19);
                    b4.t tVarA = uVar.a(qVar, b4.d.f5687e);
                    d2.y yVarA3 = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar19, 48);
                    int iHashCode6 = Long.hashCode(sVar19.T);
                    u3.i iVarL6 = sVar19.l();
                    b4.t tVarC6 = b4.a.c(tVarA, sVar19);
                    sVar19.e0();
                    if (sVar19.S) {
                        sVar19.k(hVar3);
                    } else {
                        sVar19.n0();
                    }
                    m3.i.C(yVarA3, gVar9, sVar19);
                    m3.i.C(iVarL6, gVar10, sVar19);
                    w.a0.y(iHashCode6, sVar19, gVar11, sVar19, dVar3);
                    m3.i.C(tVarC6, gVar12, sVar19);
                    d2.c.f(m2.e(qVar, lv.t.f28251e), sVar19);
                    r9.d(o30.f0.U(sVar19, R.string.fridge_history_description), null, lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar19, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                    d2.c.f(m2.e(qVar, lv.t.f28254h), sVar19);
                    sVar19.q(true);
                    sVar19.q(true);
                } else {
                    sVar19.U();
                }
                break;
            case 19:
                m3.n nVar20 = (m3.n) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar20 = (m3.s) nVar20;
                if (sVar20.R(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    d2.c.f(m2.e(qVar, lv.t.f28256j), sVar20);
                } else {
                    sVar20.U();
                }
                break;
            case 20:
                m3.n nVar21 = (m3.n) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar21 = (m3.s) nVar21;
                if (sVar21.R(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    b4.t tVarZ2 = d2.c.z(qVar, 16);
                    d2.i2 i2VarA2 = h2.a(d2.i.f13805e, b4.d.f5693k, sVar21, 54);
                    int iHashCode7 = Long.hashCode(sVar21.T);
                    u3.i iVarL7 = sVar21.l();
                    b4.t tVarC7 = b4.a.c(tVarZ2, sVar21);
                    b5.j.R.getClass();
                    b5.h hVar4 = b5.i.f5839b;
                    sVar21.e0();
                    if (sVar21.S) {
                        sVar21.k(hVar4);
                    } else {
                        sVar21.n0();
                    }
                    m3.i.C(i2VarA2, b5.i.f5843f, sVar21);
                    m3.i.C(iVarL7, b5.i.f5842e, sVar21);
                    m3.i.v(sVar21, Integer.valueOf(iHashCode7), b5.i.f5844g);
                    m3.i.z(sVar21, b5.i.f5845h);
                    m3.i.C(tVarC7, b5.i.f5841d, sVar21);
                    r9.d(o30.f0.U(sVar21, R.string.payment_method_snack_card_removed), null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar21, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                    sVar21.q(true);
                } else {
                    sVar21.U();
                }
                break;
            case 21:
                m3.n nVar22 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                float f13 = 16;
                s0.b(m2.d(d2.c.D(b4.q.f5711a, f13, 0.0f, f13, f13, 2), 1.0f), l2.g.b(12), s0.p(lv.s.J, nVar22, 6), s0.q(4, 0.0f, 0.0f, 0.0f, 62), null, ls.a.f28166a, nVar22, 196614, 16);
                break;
            case 22:
                b4.t tVar3 = (b4.t) obj;
                ((Integer) obj3).getClass();
                m3.s sVar22 = (m3.s) ((m3.n) obj2);
                sVar22.a0(-2126899193);
                long j12 = ((t3) sVar22.j(u3.f588a)).f578a;
                boolean zE = sVar22.e(j12);
                Object objM = sVar22.M();
                if (zE || objM == m3.m.f29332a) {
                    objM = new cg.k(j12, i);
                    sVar22.k0(objM);
                }
                b4.t tVarThen = tVar3.then(f4.g.e(qVar, (Function1) objM));
                sVar22.q(false);
                break;
            case 23:
                Function2 function2 = (Function2) obj;
                m3.n nVar23 = (m3.n) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                if ((iIntValue22 & 6) == 0) {
                    iIntValue22 |= ((m3.s) nVar23).h(function2) ? 4 : 2;
                }
                m3.s sVar23 = (m3.s) nVar23;
                if (sVar23.R(iIntValue22 & 1, (iIntValue22 & 19) != 18)) {
                    function2.invoke(sVar23, Integer.valueOf(iIntValue22 & 14));
                } else {
                    sVar23.U();
                }
                break;
            case 24:
                Function2 function22 = (Function2) obj;
                m3.n nVar24 = (m3.n) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                if ((iIntValue23 & 6) == 0) {
                    iIntValue23 |= ((m3.s) nVar24).h(function22) ? 4 : 2;
                }
                m3.s sVar24 = (m3.s) nVar24;
                if (sVar24.R(iIntValue23 & 1, (iIntValue23 & 19) != 18)) {
                    function22.invoke(sVar24, Integer.valueOf(iIntValue23 & 14));
                } else {
                    sVar24.U();
                }
                break;
            case 25:
                b4.t tVar4 = (b4.t) obj;
                m3.n nVar25 = (m3.n) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ComposableSingletons$DemoFilterChipKt composableSingletons$DemoFilterChipKt = ComposableSingletons$DemoFilterChipKt.INSTANCE;
                tVar4.getClass();
                if ((iIntValue24 & 6) == 0) {
                    iIntValue24 |= ((m3.s) nVar25).f(tVar4) ? 4 : 2;
                }
                m3.s sVar25 = (m3.s) nVar25;
                if (sVar25.R(iIntValue24 & 1, (iIntValue24 & 19) != 18)) {
                    i2.a(x0.z(R.drawable.illustration, sVar25, 0), null, tVar4, 0L, sVar25, 56 | ((iIntValue24 << 6) & 896), 8);
                } else {
                    sVar25.U();
                }
                break;
            case 26:
                b4.t tVar5 = (b4.t) obj;
                m3.n nVar26 = (m3.n) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ComposableSingletons$DemoFilterChipKt composableSingletons$DemoFilterChipKt2 = ComposableSingletons$DemoFilterChipKt.INSTANCE;
                tVar5.getClass();
                if ((iIntValue25 & 6) == 0) {
                    iIntValue25 |= ((m3.s) nVar26).f(tVar5) ? 4 : 2;
                }
                m3.s sVar26 = (m3.s) nVar26;
                if (sVar26.R(iIntValue25 & 1, (iIntValue25 & 19) != 18)) {
                    i2.a(x0.z(R.drawable.illustration, sVar26, 0), null, tVar5, 0L, sVar26, 56 | ((iIntValue25 << 6) & 896), 8);
                } else {
                    sVar26.U();
                }
                break;
            case 27:
                b4.t tVar6 = (b4.t) obj;
                m3.n nVar27 = (m3.n) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ComposableSingletons$AvatarFilterChipKt composableSingletons$AvatarFilterChipKt = ComposableSingletons$AvatarFilterChipKt.INSTANCE;
                tVar6.getClass();
                if ((iIntValue26 & 6) == 0) {
                    iIntValue26 |= ((m3.s) nVar27).f(tVar6) ? 4 : 2;
                }
                m3.s sVar27 = (m3.s) nVar27;
                if (sVar27.R(iIntValue26 & 1, (iIntValue26 & 19) != 18)) {
                    i2.a(x0.z(R.drawable.illustration, sVar27, 0), null, tVar6, 0L, sVar27, 56 | ((iIntValue26 << 6) & 896), 8);
                } else {
                    sVar27.U();
                }
                break;
            case 28:
                b4.t tVar7 = (b4.t) obj;
                m3.n nVar28 = (m3.n) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ComposableSingletons$DemoSelectionChipKt composableSingletons$DemoSelectionChipKt = ComposableSingletons$DemoSelectionChipKt.INSTANCE;
                tVar7.getClass();
                if ((iIntValue27 & 6) == 0) {
                    iIntValue27 |= ((m3.s) nVar28).f(tVar7) ? 4 : 2;
                }
                m3.s sVar28 = (m3.s) nVar28;
                if (sVar28.R(iIntValue27 & 1, (iIntValue27 & 19) != 18)) {
                    i2.a(x0.z(R.drawable.illustration, sVar28, 0), null, tVar7, 0L, sVar28, 56 | ((iIntValue27 << 6) & 896), 8);
                } else {
                    sVar28.U();
                }
                break;
            default:
                b4.t tVar8 = (b4.t) obj;
                m3.n nVar29 = (m3.n) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ComposableSingletons$DemoSelectionChipKt composableSingletons$DemoSelectionChipKt2 = ComposableSingletons$DemoSelectionChipKt.INSTANCE;
                tVar8.getClass();
                if ((iIntValue28 & 6) == 0) {
                    iIntValue28 |= ((m3.s) nVar29).f(tVar8) ? 4 : 2;
                }
                m3.s sVar29 = (m3.s) nVar29;
                if (sVar29.R(iIntValue28 & 1, (iIntValue28 & 19) != 18)) {
                    i2.a(x0.z(R.drawable.illustration, sVar29, 0), null, tVar8, 0L, sVar29, 56 | ((iIntValue28 << 6) & 896), 8);
                } else {
                    sVar29.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}

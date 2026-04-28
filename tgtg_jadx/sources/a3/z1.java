package a3;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import android.widget.Toast;
import com.app.tgtg.R;
import com.app.tgtg.feature.badges.ui.BadgesActivity;
import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.feature.tabprofile.impact.co2esaved.Co2eSavedActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.ManageAccountActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherExperienceActivity;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import mv.a0;
import mv.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z1 implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f647b;

    public /* synthetic */ z1(Object obj, int i11) {
        this.f646a = i11;
        this.f647b = obj;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11 = this.f646a;
        int i12 = 2;
        m3.f fVar = m3.m.f29332a;
        final int i13 = 0;
        Object obj5 = this.f647b;
        switch (i11) {
            case 0:
                j2 j2Var = (j2) obj5;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                z4.z zVar = (z4.z) obj2;
                h4.b bVar = (h4.b) obj3;
                j0 j0Var = (j0) obj4;
                long jU = zVar.u();
                h4.c cVar = new h4.c(0.0f, 0.0f, (int) (jU >> 32), (int) (jU & 4294967295L));
                boolean zA = l2.a(bVar.f21378a, cVar);
                long jI = bVar.f21378a;
                if (!zA) {
                    jI = w2.c0.i(jI, cVar);
                }
                long jA = j2Var.a(zVar, jI);
                if ((9223372034707292159L & jA) != 9205357640488583168L) {
                    j2Var.k(zBooleanValue);
                    j2Var.f420t = null;
                    j2Var.n(jA, 9205357640488583168L, false, j0Var);
                    g4.v.a(j2Var.f409h);
                    j2Var.f424x = false;
                    j2Var.o();
                    j2Var.f421u = true;
                }
                return Unit.f26487a;
            case 1:
                ((Integer) obj4).intValue();
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                dq.j.d((Function0) obj5, (m3.n) obj3, 0);
                return Unit.f26487a;
            case 2:
                i80.n nVar = (i80.n) obj5;
                Object obj6 = (f2.d) obj;
                ((Integer) obj2).intValue();
                m3.n nVar2 = (m3.n) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((m3.s) nVar2).f(obj6) ? 4 : 2;
                }
                m3.s sVar = (m3.s) nVar2;
                if (sVar.R(iIntValue & 1, (iIntValue & AppConstants.RESULT_CODE_ORDER_NOT_COLLECTED) != 130)) {
                    nVar.invoke(obj6, sVar, Integer.valueOf(iIntValue & 14));
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            case 3:
                u3.d dVar = (u3.d) obj5;
                Object obj7 = (g2.l) obj;
                ((Integer) obj2).getClass();
                m3.n nVar3 = (m3.n) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((m3.s) nVar3).f(obj7) ? 4 : 2;
                }
                m3.s sVar2 = (m3.s) nVar3;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & AppConstants.RESULT_CODE_ORDER_NOT_COLLECTED) != 130)) {
                    dVar.invoke(obj7, sVar2, Integer.valueOf(iIntValue2 & 14));
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
            case 4:
                CharityOrderActivity charityOrderActivity = (CharityOrderActivity) obj5;
                ((Integer) obj4).getClass();
                int i14 = CharityOrderActivity.f9162o;
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                m3.s sVar3 = (m3.s) ((m3.n) obj3);
                boolean zH = sVar3.h(charityOrderActivity);
                Object objM = sVar3.M();
                if (zH || objM == fVar) {
                    objM = new go.d(charityOrderActivity, i13);
                    sVar3.k0(objM);
                }
                ba0.g.b((Function0) objM, sVar3, 0);
                return Unit.f26487a;
            case 5:
                int i15 = 3;
                ManageAccountActivity manageAccountActivity = (ManageAccountActivity) obj5;
                ((Integer) obj4).getClass();
                int i16 = ManageAccountActivity.f9348i;
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                hr.i iVarA0 = manageAccountActivity.a0();
                m3.s sVar4 = (m3.s) ((m3.n) obj3);
                boolean zH2 = sVar4.h(manageAccountActivity);
                Object objM2 = sVar4.M();
                if (zH2 || objM2 == fVar) {
                    objM2 = new hr.b(manageAccountActivity, i13);
                    sVar4.k0(objM2);
                }
                Function0 function0 = (Function0) objM2;
                boolean zH3 = sVar4.h(manageAccountActivity);
                Object objM3 = sVar4.M();
                if (zH3 || objM3 == fVar) {
                    objM3 = new hr.a(manageAccountActivity, i15);
                    sVar4.k0(objM3);
                }
                Function1 function1 = (Function1) objM3;
                boolean zH4 = sVar4.h(manageAccountActivity);
                Object objM4 = sVar4.M();
                if (zH4 || objM4 == fVar) {
                    objM4 = new hr.b(manageAccountActivity, z ? 1 : 0);
                    sVar4.k0(objM4);
                }
                h0.g.j(iVarA0, function0, function1, (Function0) objM4, sVar4, 0);
                return Unit.f26487a;
            case 6:
                BadgesActivity badgesActivity = (BadgesActivity) obj5;
                m3.n nVar4 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                int i17 = BadgesActivity.f8964i;
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                gh.l lVar = (gh.l) m3.i.n(badgesActivity.a0().f23862j, nVar4, 0).getValue();
                m3.s sVar5 = (m3.s) nVar4;
                if (lVar == null) {
                    sVar5.a0(-211173304);
                    sVar5.q(false);
                } else {
                    sVar5.a0(-211173303);
                    ih.i iVarA02 = badgesActivity.a0();
                    boolean zH5 = sVar5.h(badgesActivity);
                    Object objM5 = sVar5.M();
                    if (zH5 || objM5 == fVar) {
                        objM5 = new hi.d(badgesActivity, i);
                        sVar5.k0(objM5);
                    }
                    Function0 function02 = (Function0) objM5;
                    boolean zH6 = sVar5.h(badgesActivity);
                    Object objM6 = sVar5.M();
                    if (zH6 || objM6 == fVar) {
                        objM6 = new ih.a(badgesActivity, z ? 1 : 0);
                        sVar5.k0(objM6);
                    }
                    Function1 function12 = (Function1) objM6;
                    boolean zH7 = sVar5.h(badgesActivity);
                    Object objM7 = sVar5.M();
                    if (zH7 || objM7 == fVar) {
                        objM7 = new ih.a(badgesActivity, i12);
                        sVar5.k0(objM7);
                    }
                    pd.g.b(iVarA02, lVar, function02, function12, (Function1) objM7, sVar5, 0);
                    sVar5.q(false);
                }
                return Unit.f26487a;
            case 7:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                ((ia.d) obj5).n(new ja.i(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 8:
                VoucherActivity voucherActivity = (VoucherActivity) obj5;
                ss.l1 l1Var = (ss.l1) obj2;
                m3.n nVar5 = (m3.n) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                int i18 = VoucherActivity.f9440h;
                ((s1.l) obj).getClass();
                l1Var.getClass();
                b4.t tVarE = d2.c.E(d2.m2.f13850c);
                z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                m3.s sVar6 = (m3.s) nVar5;
                int iHashCode = Long.hashCode(sVar6.T);
                u3.i iVarL = sVar6.l();
                b4.t tVarC = b4.a.c(tVarE, nVar5);
                b5.j.R.getClass();
                b5.h hVar = b5.i.f5839b;
                sVar6.e0();
                if (sVar6.S) {
                    sVar6.k(hVar);
                } else {
                    sVar6.n0();
                }
                m3.i.C(u0VarD, b5.i.f5843f, nVar5);
                m3.i.C(iVarL, b5.i.f5842e, nVar5);
                m3.i.v(nVar5, Integer.valueOf(iHashCode), b5.i.f5844g);
                m3.i.z(nVar5, b5.i.f5845h);
                m3.i.C(tVarC, b5.i.f5841d, nVar5);
                if (l1Var instanceof ss.g1) {
                    sVar6.a0(-1077878476);
                    cg.j.o(nVar5, 0);
                    sVar6.q(false);
                } else if (l1Var instanceof ss.k1) {
                    sVar6.a0(945592786);
                    us.a.D((ss.k1) l1Var, voucherActivity.b0().f37265c, nVar5, (iIntValue3 >> 3) & 14);
                    voucherActivity.b0().f37263a.c("CODE");
                    sVar6.q(false);
                } else if (l1Var instanceof ss.j1) {
                    sVar6.a0(945955238);
                    us.a.w((ss.j1) l1Var, voucherActivity.b0().f37265c, nVar5, (iIntValue3 >> 3) & 14);
                    sVar6.q(false);
                } else if (l1Var instanceof ss.i1) {
                    sVar6.a0(946275654);
                    us.a.t((ss.i1) l1Var, voucherActivity.b0().f37265c, nVar5, (iIntValue3 >> 3) & 14);
                    sVar6.q(false);
                } else if (l1Var instanceof ss.h1) {
                    sVar6.a0(946590118);
                    us.a.v((ss.h1) l1Var, voucherActivity.b0().f37265c, nVar5, (iIntValue3 >> 3) & 14);
                    sVar6.q(false);
                } else {
                    if (!(l1Var instanceof ss.f1)) {
                        throw e0.f.v(sVar6, -1077879388, false);
                    }
                    sVar6.a0(946882479);
                    sVar6.q(false);
                    if (!voucherActivity.isFinishing()) {
                        Toast.makeText(voucherActivity, R.string.generic_err_undefined_error, 0).show();
                        if (voucherActivity.isTaskRoot()) {
                            new mv.a0().c(voucherActivity);
                        } else {
                            voucherActivity.finish();
                        }
                    }
                }
                sVar6.q(true);
                return Unit.f26487a;
            case 9:
                VoucherExperienceActivity voucherExperienceActivity = (VoucherExperienceActivity) obj5;
                ss.e1 e1Var = (ss.e1) obj2;
                m3.n nVar6 = (m3.n) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                int i19 = VoucherExperienceActivity.f9443h;
                ((s1.l) obj).getClass();
                e1Var.getClass();
                b4.t tVarE2 = d2.c.E(d2.m2.f13850c);
                z4.u0 u0VarD2 = d2.p.d(b4.d.f5683a, false);
                m3.s sVar7 = (m3.s) nVar6;
                int iHashCode2 = Long.hashCode(sVar7.T);
                u3.i iVarL2 = sVar7.l();
                b4.t tVarC2 = b4.a.c(tVarE2, nVar6);
                b5.j.R.getClass();
                b5.h hVar2 = b5.i.f5839b;
                sVar7.e0();
                if (sVar7.S) {
                    sVar7.k(hVar2);
                } else {
                    sVar7.n0();
                }
                m3.i.C(u0VarD2, b5.i.f5843f, nVar6);
                m3.i.C(iVarL2, b5.i.f5842e, nVar6);
                m3.i.v(nVar6, Integer.valueOf(iHashCode2), b5.i.f5844g);
                m3.i.z(nVar6, b5.i.f5845h);
                m3.i.C(tVarC2, b5.i.f5841d, nVar6);
                if (e1Var instanceof ss.z0) {
                    sVar7.a0(-721693974);
                    cg.j.o(nVar6, 0);
                    sVar7.q(false);
                } else if (e1Var instanceof ss.d1) {
                    sVar7.a0(-897579310);
                    us.a.B((ss.d1) e1Var, voucherExperienceActivity.D().f37260c, nVar6, (iIntValue4 >> 3) & 14);
                    voucherExperienceActivity.D().f37258a.c("CODE");
                    sVar7.q(false);
                } else if (e1Var instanceof ss.c1) {
                    sVar7.a0(-897197018);
                    us.a.A((ss.c1) e1Var, voucherExperienceActivity.D().f37260c, nVar6, (iIntValue4 >> 3) & 14);
                    sVar7.q(false);
                } else if (e1Var instanceof ss.b1) {
                    sVar7.a0(-896856545);
                    us.a.u((ss.b1) e1Var, voucherExperienceActivity.D().f37260c, nVar6, (iIntValue4 >> 3) & 14);
                    sVar7.q(false);
                } else if (e1Var instanceof ss.a1) {
                    sVar7.a0(-896515514);
                    us.a.x((ss.a1) e1Var, voucherExperienceActivity.D().f37260c, nVar6, (iIntValue4 >> 3) & 14);
                    sVar7.q(false);
                } else {
                    if (!(e1Var instanceof ss.y0)) {
                        throw e0.f.v(sVar7, -721695099, false);
                    }
                    sVar7.a0(-896203623);
                    sVar7.q(false);
                    if (!voucherExperienceActivity.isFinishing()) {
                        Toast.makeText(voucherExperienceActivity, R.string.generic_err_undefined_error, 0).show();
                        if (voucherExperienceActivity.isTaskRoot()) {
                            new mv.a0().c(voucherExperienceActivity);
                        } else {
                            voucherExperienceActivity.finish();
                        }
                    }
                }
                sVar7.q(true);
                return Unit.f26487a;
            case 10:
                u5.d dVar2 = (u5.d) obj5;
                q5.g0 g0VarB = ((q5.j) dVar2.f40771e).b((q5.i) obj, (q5.r) obj2, ((q5.n) obj3).f36034a, ((q5.o) obj4).f36035a);
                if (g0VarB instanceof q5.f0) {
                    Object obj8 = ((q5.f0) g0VarB).f36015a;
                    obj8.getClass();
                    return (Typeface) obj8;
                }
                t5.a aVar = new t5.a(g0VarB, dVar2.f40776j);
                dVar2.f40776j = aVar;
                Object obj9 = aVar.f39793d;
                obj9.getClass();
                return (Typeface) obj9;
            case 11:
                final Co2eSavedActivity co2eSavedActivity = (Co2eSavedActivity) obj5;
                ((Integer) obj4).getClass();
                int i21 = Co2eSavedActivity.f9306g;
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                uq.e eVar = (uq.e) co2eSavedActivity.f9310e.getValue();
                m3.s sVar8 = (m3.s) ((m3.n) obj3);
                boolean zH8 = sVar8.h(co2eSavedActivity);
                Object objM8 = sVar8.M();
                if (zH8 || objM8 == fVar) {
                    objM8 = new Function0() { // from class: uq.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i22 = i13;
                            Co2eSavedActivity co2eSavedActivity2 = co2eSavedActivity;
                            switch (i22) {
                                case 0:
                                    int i23 = Co2eSavedActivity.f9306g;
                                    co2eSavedActivity2.getOnBackPressedDispatcher().d();
                                    break;
                                default:
                                    int i24 = Co2eSavedActivity.f9306g;
                                    a0 a0Var = new a0();
                                    z zVar2 = z.DISCOVER;
                                    zVar2.getClass();
                                    a0Var.f30138a = zVar2;
                                    a0Var.f30144g = true;
                                    a0Var.c(co2eSavedActivity2);
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    sVar8.k0(objM8);
                }
                Function0 function03 = (Function0) objM8;
                boolean zH9 = sVar8.h(co2eSavedActivity);
                Object objM9 = sVar8.M();
                if (zH9 || objM9 == fVar) {
                    final int i22 = z ? 1 : 0;
                    objM9 = new Function0() { // from class: uq.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i222 = i22;
                            Co2eSavedActivity co2eSavedActivity2 = co2eSavedActivity;
                            switch (i222) {
                                case 0:
                                    int i23 = Co2eSavedActivity.f9306g;
                                    co2eSavedActivity2.getOnBackPressedDispatcher().d();
                                    break;
                                default:
                                    int i24 = Co2eSavedActivity.f9306g;
                                    a0 a0Var = new a0();
                                    z zVar2 = z.DISCOVER;
                                    zVar2.getClass();
                                    a0Var.f30138a = zVar2;
                                    a0Var.f30144g = true;
                                    a0Var.c(co2eSavedActivity2);
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    sVar8.k0(objM9);
                }
                xz.b.b(eVar, function03, (Function0) objM9, sVar8, 0);
                return Unit.f26487a;
            default:
                ArrayList arrayList = (ArrayList) obj5;
                int iIntValue5 = ((Integer) obj2).intValue();
                m3.n nVar7 = (m3.n) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((f2.d) obj).getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= ((m3.s) nVar7).d(iIntValue5) ? 32 : 16;
                }
                m3.s sVar9 = (m3.s) nVar7;
                if (sVar9.R(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                    m0.c.S((BasketItem) arrayList.get(iIntValue5), sVar9, 0);
                } else {
                    sVar9.U();
                }
                return Unit.f26487a;
        }
    }
}

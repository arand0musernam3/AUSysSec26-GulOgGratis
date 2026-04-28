package ap;

import a3.u1;
import android.app.Activity;
import android.content.Context;
import ao.g3;
import b4.q;
import b4.t;
import c5.f1;
import c5.v0;
import c5.x1;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.fragments.discover.herocomponent.DiscoverSheetView;
import com.app.tgtg.feature.postpurchase.email.AddEmailFragment;
import com.app.tgtg.feature.postpurchase.specialrewards.SpecialRewardCelebrationFragment;
import com.app.tgtg.model.local.SnackBarInfo;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.CharityItem;
import com.app.tgtg.model.remote.item.response.HeroComponentResponse;
import com.app.tgtg.model.remote.item.response.ItemState;
import com.app.tgtg.model.remote.item.response.SortingChoice;
import com.app.tgtg.model.remote.order.Changes;
import com.app.tgtg.model.remote.order.OldValue;
import com.app.tgtg.model.remote.order.UpdateNotificationType;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureState;
import com.app.tgtg.model.remote.profile.response.SpecialRewardsCardDetails;
import com.app.tgtg.model.remote.profile.response.StoreSignupCardDetails;
import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import com.app.tgtg.model.remote.user.response.C2CReferralResponse;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import com.google.android.gms.internal.measurement.cg;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b2;
import d2.h2;
import d2.i2;
import d2.j2;
import d2.m2;
import d2.n1;
import d2.p;
import d2.w;
import d2.w0;
import d2.w2;
import d2.y;
import d2.z1;
import d40.t1;
import g3.r9;
import g3.s0;
import g9.f0;
import i4.g0;
import i4.k0;
import i4.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import lh.b0;
import lh.c0;
import lv.v;
import m2.h0;
import m3.b1;
import m3.c3;
import m3.d3;
import m3.h1;
import m3.s;
import m5.l0;
import m90.z;
import mv.p0;
import mv.u;
import o00.x0;
import o30.e0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import q5.o;
import ss.c1;
import vm.r;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4530d;

    public /* synthetic */ e(pi.m mVar, f0 f0Var, b1 b1Var) {
        this.f4527a = 29;
        this.f4529c = mVar;
        this.f4528b = f0Var;
        this.f4530d = b1Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        q qVar;
        s sVar;
        Function1 function1 = (Function1) this.f4528b;
        hr.i iVar = (hr.i) this.f4529c;
        b1 b1Var = (b1) this.f4530d;
        z1 z1Var = (z1) obj;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        z1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((s) nVar).f(z1Var) ? 4 : 2;
        }
        s sVar2 = (s) nVar;
        if (sVar2.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            long j9 = lv.s.J;
            r0 r0Var = g0.f23254b;
            q qVar2 = q.f5711a;
            t tVarR = d2.c.r(m2.c(m2.d(d2.c.y(v1.n.j(qVar2, j9, r0Var), z1Var), 1.0f), 1.0f));
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarR, sVar2);
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
            t tVarR2 = v1.n.r(m2.t(m2.d(d2.c.B(qVar2, e0.s(sVar2, R.dimen.spacing_3), 0.0f, 2), 1.0f), 3), v1.n.q(sVar2), true);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
            int iHashCode2 = Long.hashCode(sVar2.T);
            u3.i iVarL2 = sVar2.l();
            t tVarC2 = b4.a.c(tVarR2, sVar2);
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
            t tVarD = d2.c.D(qVar2, 0.0f, e0.s(sVar2, R.dimen.spacing_4), 0.0f, 0.0f, 13);
            String strU = o30.f0.U(sVar2, R.string.profile_settings_your_account_header);
            m5.u0 u0Var = v.f28279s;
            long j11 = lv.s.D;
            r9.d(strU, tVarD, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(u0Var, j11, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446), sVar2, 0, 0, 131068);
            boolean zF = sVar2.f(function1);
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (zF || objM == fVar) {
                objM = new defpackage.c(function1, 22);
                sVar2.k0(objM);
            }
            t1.d(null, R.string.profile_settings_details_caption, R.drawable.system_icon_account_details, null, (Function0) objM, sVar2, 0, 9);
            g3 g3Var = iVar.f22429a;
            g3 g3Var2 = iVar.f22429a;
            hv.b bVar = iVar.f22436h;
            i4.v vVar = g3Var.n().getHasExpiredPaymentMethods() ? new i4.v(lv.s.l) : null;
            boolean zF2 = sVar2.f(function1);
            Object objM2 = sVar2.M();
            if (zF2 || objM2 == fVar) {
                objM2 = new defpackage.c(function1, 14);
                sVar2.k0(objM2);
            }
            t1.d(null, R.string.profile_settings_payment_caption, R.drawable.system_icon_credit_card_neutral_80, vVar, (Function0) objM2, sVar2, 0, 1);
            i4.v vVar2 = ((Boolean) m3.i.n(iVar.f22446s, sVar2, 0).getValue()).booleanValue() ? new i4.v(lv.s.f28223e) : null;
            boolean zH = sVar2.h(iVar) | sVar2.f(function1);
            Object objM3 = sVar2.M();
            if (zH || objM3 == fVar) {
                objM3 = new z(3, iVar, function1);
                sVar2.k0(objM3);
            }
            t1.d(null, R.string.profile_settings_vouchers_caption, R.drawable.system_icon_add_voucher_neutral_80, vVar2, (Function0) objM3, sVar2, 0, 1);
            s sVar3 = sVar2;
            u uVar = iVar.f22439k;
            uVar.getClass();
            if (uVar.a(mv.k.APPTRK_RLX_VOUCHER_EXPERIENCE) != null) {
                sVar3.a0(1430584867);
                sVar3.q(false);
            } else {
                sVar3.a0(1430199506);
                boolean zF3 = sVar3.f(function1);
                Object objM4 = sVar3.M();
                if (zF3 || objM4 == fVar) {
                    objM4 = new defpackage.c(function1, 15);
                    sVar3.k0(objM4);
                }
                t1.d(null, R.string.profile_settings_special_rewards_caption, R.drawable.system_icon_special_reward, null, (Function0) objM4, sVar3, 0, 9);
                sVar3 = sVar3;
                sVar3.q(false);
            }
            boolean zF4 = sVar3.f(function1);
            Object objM5 = sVar3.M();
            if (zF4 || objM5 == fVar) {
                objM5 = new defpackage.c(function1, 16);
                sVar3.k0(objM5);
            }
            s sVar4 = sVar3;
            t1.d(null, R.string.profile_settings_notifications_caption, R.drawable.system_icon_notifications_settings, null, (Function0) objM5, sVar4, 0, 9);
            s sVar5 = sVar4;
            if (((hv.j) bVar).b()) {
                sVar5.a0(1431009629);
                i4.v vVar3 = ((Boolean) m3.i.n(iVar.f22447t, sVar5, 0).getValue()).booleanValue() ? new i4.v(lv.s.l) : null;
                boolean zF5 = sVar5.f(function1);
                Object objM6 = sVar5.M();
                if (zF5 || objM6 == fVar) {
                    objM6 = new defpackage.c(function1, 17);
                    sVar5.k0(objM6);
                }
                t1.d(null, R.string.profile_settings_support, R.drawable.cx_agent_icon, vVar3, (Function0) objM6, sVar5, 0, 1);
                sVar5 = sVar5;
                sVar5.q(false);
            } else {
                sVar5.a0(1431630435);
                sVar5.q(false);
            }
            s sVar6 = sVar5;
            r9.d(o30.f0.U(sVar5, R.string.profile_settings_community_header), d2.c.D(qVar2, 0.0f, e0.s(sVar5, R.dimen.spacing_4), 0.0f, 0.0f, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(u0Var, j11, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446), sVar6, 0, 0, 131068);
            s sVar7 = sVar6;
            C2CReferralResponse mobileC2CReferral = g3Var.n().getMobileC2CReferral();
            if ((mobileC2CReferral != null ? mobileC2CReferral.getType() : null) != null) {
                sVar7.a0(1432141966);
                boolean zF6 = sVar7.f(function1);
                Object objM7 = sVar7.M();
                if (zF6 || objM7 == fVar) {
                    objM7 = new defpackage.c(function1, 18);
                    sVar7.k0(objM7);
                }
                t1.d(null, R.string.c2c_v3_profile_settings_invite_friends_caption, R.drawable.system_icon_invite_friend, null, (Function0) objM7, sVar7, 0, 9);
                sVar7 = sVar7;
                sVar7.q(false);
            } else {
                sVar7.a0(1432531171);
                sVar7.q(false);
            }
            boolean zF7 = sVar7.f(function1);
            Object objM8 = sVar7.M();
            if (zF7 || objM8 == fVar) {
                objM8 = new defpackage.c(function1, 19);
                sVar7.k0(objM8);
            }
            s sVar8 = sVar7;
            t1.d(null, R.string.profile_settings_recommend_store_caption, R.drawable.system_icon_recommend_store, null, (Function0) objM8, sVar8, 0, 9);
            s sVar9 = sVar8;
            if (!g3Var2.n().isBusiness() || ft.c.C()) {
                sVar9.a0(1433336675);
                sVar9.q(false);
            } else {
                sVar9.a0(1432964768);
                boolean zF8 = sVar9.f(function1);
                Object objM9 = sVar9.M();
                if (zF8 || objM9 == fVar) {
                    objM9 = new defpackage.c(function1, 20);
                    sVar9.k0(objM9);
                }
                t1.d(null, R.string.profile_settings_go_to_mystore_caption, R.drawable.system_icon_swap, null, (Function0) objM9, sVar9, 0, 9);
                sVar9 = sVar9;
                sVar9.q(false);
            }
            if (g3Var2.n().isBusiness() || g3Var.n().getShouldVerifyEmail()) {
                sVar9.a0(1433804899);
                sVar9.q(false);
            } else {
                sVar9.a0(1433426265);
                boolean zF9 = sVar9.f(function1);
                Object objM10 = sVar9.M();
                if (zF9 || objM10 == fVar) {
                    objM10 = new defpackage.c(function1, 21);
                    sVar9.k0(objM10);
                }
                s sVar10 = sVar9;
                t1.d(null, R.string.profile_settings_signup_store_caption, R.drawable.system_icon_store_sign_up, null, (Function0) objM10, sVar10, 0, 9);
                sVar9 = sVar10;
                sVar9.q(false);
            }
            if (((hv.j) bVar).b()) {
                sVar9.a0(1433865287);
                boolean zF10 = sVar9.f(function1);
                Object objM11 = sVar9.M();
                if (zF10 || objM11 == fVar) {
                    objM11 = new defpackage.c(function1, 23);
                    sVar9.k0(objM11);
                }
                s sVar11 = sVar9;
                t1.d(null, R.string.profile_settings_careers_caption, R.drawable.system_icon_careers, null, (Function0) objM11, sVar11, 0, 9);
                sVar = sVar11;
                sVar.q(false);
                qVar = qVar2;
            } else {
                sVar9.a0(1434286422);
                qVar = qVar2;
                s sVar12 = sVar9;
                r9.d(o30.f0.U(sVar9, R.string.profile_settings_support_header), d2.c.D(qVar2, 0.0f, e0.s(sVar9, R.dimen.spacing_4), 0.0f, 0.0f, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(u0Var, j11, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446), sVar12, 0, 0, 131068);
                boolean zF11 = sVar12.f(function1);
                Object objM12 = sVar12.M();
                if (zF11 || objM12 == fVar) {
                    objM12 = new defpackage.c(function1, 24);
                    sVar12.k0(objM12);
                }
                t1.d(null, R.string.profile_settings_help_with_order_caption, R.drawable.system_icon_help_with_order, null, (Function0) objM12, sVar12, 0, 9);
                boolean zF12 = sVar12.f(function1);
                Object objM13 = sVar12.M();
                if (zF12 || objM13 == fVar) {
                    objM13 = new defpackage.c(function1, 25);
                    sVar12.k0(objM13);
                }
                t1.d(null, R.string.profile_settings_how_tgtg_works_caption, R.drawable.system_icon_help_center, null, (Function0) objM13, sVar12, 0, 9);
                boolean zF13 = sVar12.f(function1);
                Object objM14 = sVar12.M();
                if (zF13 || objM14 == fVar) {
                    objM14 = new defpackage.c(function1, 10);
                    sVar12.k0(objM14);
                }
                t1.d(null, R.string.profile_settings_careers_caption, R.drawable.system_icon_careers, null, (Function0) objM14, sVar12, 0, 9);
                sVar = sVar12;
                sVar.q(false);
            }
            s sVar13 = sVar;
            r9.d(o30.f0.U(sVar, R.string.profile_settings_other_header), d2.c.D(qVar, 0.0f, e0.s(sVar, R.dimen.spacing_4), 0.0f, 0.0f, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(u0Var, j11, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446), sVar13, 0, 0, 131068);
            boolean zF14 = sVar13.f(function1);
            Object objM15 = sVar13.M();
            if (zF14 || objM15 == fVar) {
                objM15 = new defpackage.c(function1, 11);
                sVar13.k0(objM15);
            }
            t1.d(null, R.string.profile_settings_hidden_stores_caption, R.drawable.system_icon_hidden_stores, null, (Function0) objM15, sVar13, 0, 9);
            boolean zF15 = sVar13.f(function1);
            Object objM16 = sVar13.M();
            if (zF15 || objM16 == fVar) {
                objM16 = new defpackage.c(function1, 12);
                sVar13.k0(objM16);
            }
            t1.d(null, R.string.profile_settings_blog_caption, R.drawable.system_icon_blog, null, (Function0) objM16, sVar13, 0, 9);
            boolean zF16 = sVar13.f(function1);
            Object objM17 = sVar13.M();
            if (zF16 || objM17 == fVar) {
                objM17 = new defpackage.c(function1, 13);
                sVar13.k0(objM17);
            }
            t1.d(null, R.string.profile_settings_legal_caption, R.drawable.system_icon_legal, null, (Function0) objM17, sVar13, 0, 9);
            t tVarD2 = m2.d(d2.c.B(qVar, 0.0f, lv.t.f28254h, 1).then(new w0(b4.d.f5695n)), 1.0f);
            lv.q qVar3 = lv.q.DANGER;
            String strU2 = o30.f0.U(sVar13, R.string.profile_settings_logout_cta);
            Object objM18 = sVar13.M();
            if (objM18 == fVar) {
                objM18 = new ms.a(b1Var, 0);
                sVar13.k0(objM18);
            }
            v0.n.n(tVarD2, strU2, null, qVar3, null, false, false, null, null, (Function0) objM18, sVar13, 805309440, 500);
            sVar13.q(true);
            sVar13.q(true);
        } else {
            sVar2.U();
        }
        return Unit.f26487a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        String strG;
        String count;
        boolean z11;
        int i11;
        int i12;
        Changes changes = (Changes) this.f4528b;
        Function0 function0 = (Function0) this.f4529c;
        Function1 function1 = (Function1) this.f4530d;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        s sVar = (s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            q qVar = q.f5711a;
            t tVarZ = d2.c.z(qVar, 16);
            b4.k kVar = b4.d.f5685c;
            u0 u0VarD = p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarZ, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            boolean zH = sVar.h(changes) | sVar.f(function0);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                objM = new z(15, changes, function0);
                sVar.k0(objM);
            }
            t tVarC2 = androidx.compose.foundation.b.c(qVar, false, null, null, (Function0) objM, 15);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC3 = b4.a.c(tVarC2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            t tVarD = m2.d(qVar, 1.0f);
            float f11 = 4;
            UpdateNotificationType type = changes.getType();
            UpdateNotificationType updateNotificationType = UpdateNotificationType.CANCELLED_BY_CHARITY;
            t tVarD2 = d2.c.D(tVarD, 0.0f, f11, (type == updateNotificationType || changes.getType() == UpdateNotificationType.CANCELLED_BY_STORE) ? 0 : 32, 0.0f, 9);
            int i13 = no.f.$EnumSwitchMapping$0[changes.getType().ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    z11 = false;
                    i11 = -103511836;
                    i12 = R.string.charity_order_time_changed_card;
                } else if (i13 == 3) {
                    z11 = false;
                    i11 = -103328161;
                    i12 = R.string.charity_order_charity_cancelled_card;
                } else if (i13 != 4) {
                    sVar.a0(-102992896);
                    sVar.q(false);
                    sa0.a.f38953a.c("Unexpected UpdateNotificationType: " + changes.getType(), new Object[0]);
                    strG = "";
                } else {
                    z11 = false;
                    i11 = -103141727;
                    i12 = R.string.charity_order_store_cancelled_card;
                }
                strG = b3.i.j(i11, i12, sVar, sVar, z11);
            } else {
                sVar.a0(-103928910);
                OldValue oldValue = changes.getOldValue();
                int i14 = (oldValue == null || (count = oldValue.getCount()) == null) ? 0 : Integer.parseInt(count);
                strG = o30.f0.G(R.plurals.charity_order_inventory_changed_card, i14, new Object[]{Integer.valueOf(i14)}, sVar);
                sVar.q(false);
            }
            m5.u0 u0Var = v.f28274n;
            long j9 = lv.s.C;
            r9.d(strG, tVarD2, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            if (changes.getType() == UpdateNotificationType.INVENTORY_CHANGED) {
                sVar.a0(-102607566);
                r9.d(o30.f0.U(sVar, R.string.charity_order_link_to_inventory), d2.c.D(qVar, 0.0f, 6, 0.0f, 0.0f, 13), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(v.f28275o, 0L, 0L, null, null, 0L, x5.l.f43854c, 0, 0L, null, null, 16773119), sVar, 432, 0, 131064);
                sVar.q(false);
            } else {
                sVar.a0(-102218764);
                sVar.q(false);
            }
            sVar.q(true);
            if (changes.getType() == updateNotificationType || changes.getType() == UpdateNotificationType.CANCELLED_BY_STORE) {
                sVar.a0(-262367734);
                sVar.q(false);
            } else {
                sVar.a0(-262729504);
                t tVarA = d2.u.f13938a.a(qVar, kVar);
                boolean zF = sVar.f(function1) | sVar.h(changes);
                Object objM2 = sVar.M();
                if (zF || objM2 == fVar) {
                    objM2 = new z(16, function1, changes);
                    sVar.k0(objM2);
                }
                v1.n.d(x0.z(R.drawable.system_icon_close_neutral_80, sVar, 0), null, androidx.compose.foundation.b.c(tVarA, false, null, null, (Function0) objM2, 15), null, null, 0.0f, null, sVar, 56, 120);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        x60.m mVar = (x60.m) this.f4528b;
        x60.j jVar = (x60.j) this.f4529c;
        x60.h hVar = (x60.h) this.f4530d;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        s sVar = (s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            q qVar = q.f5711a;
            t tVarT = m2.t(m2.d(qVar, 1.0f), 3);
            float f11 = mVar.f44011g;
            float f12 = mVar.f44015k;
            t tVarZ = d2.c.z(tVarT, f11);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarZ, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            r9.d(o30.f0.U(sVar, R.string.special_reward_screen_InfoBox_Title), null, hVar.J, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, jVar.f43957f, sVar, 0, 0, 130042);
            d2.c.f(m2.e(qVar, mVar.f44014j), sVar);
            os.a.i(R.drawable.ic_special_rewards_gifts, R.string.voucher_experience_how_it_works_title_1, R.string.voucher_experience_how_it_works_1, 3072, sVar);
            d2.c.f(m2.e(qVar, f12), sVar);
            os.a.i(R.drawable.ic_special_rewards_discount, R.string.voucher_experience_how_it_works_title_2, R.string.voucher_experience_how_it_works_2, 3072, sVar);
            d2.c.f(m2.e(qVar, f12), sVar);
            os.a.i(R.drawable.ic_special_rewards_gavel, R.string.voucher_experience_how_it_works_title_3, R.string.voucher_experience_how_it_works_3, 3072, sVar);
            d2.c.f(m2.e(qVar, f12), sVar);
            os.a.i(R.drawable.ic_special_rewards_timer, R.string.voucher_experience_how_it_works_title_4, R.string.voucher_experience_how_it_works_4, 3072, sVar);
            sVar.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        c0 c0Var = (c0) this.f4528b;
        jd.f fVar = (jd.f) this.f4529c;
        b1 b1Var = (b1) this.f4530d;
        z1 z1Var = (z1) obj;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        z1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((s) nVar).f(z1Var) ? 4 : 2;
        }
        s sVar = (s) nVar;
        if (!sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            sVar.U();
        } else if (c0Var instanceof lh.y) {
            sVar.a0(159077823);
            ph.g.b(((lh.y) c0Var).f27837a, sVar, 0);
            sVar.q(false);
        } else if (c0Var instanceof lh.z) {
            sVar.a0(159175752);
            ph.g.c(sVar, 0);
            sVar.q(false);
        } else if (c0Var instanceof b0) {
            sVar.a0(159275231);
            t tVarY = d2.c.y(q.f5711a, z1Var);
            qh.a aVar = ((b0) c0Var).f27779a;
            ph.g.e(tVarY, fVar, aVar, sVar, 0);
            String str = aVar.f37052a;
            if (str.length() <= 0) {
                str = null;
            }
            if (str == null) {
                str = (String) b1Var.getValue();
            }
            b1Var.setValue(str);
            sVar.q(false);
        } else {
            if (!Intrinsics.areEqual(c0Var, lh.a0.f27777a)) {
                throw e0.f.v(sVar, 420772465, false);
            }
            sVar.a0(159705387);
            ph.g.d(sVar, 0);
            sVar.q(false);
        }
        return Unit.f26487a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.f4528b;
        Function0 function02 = (Function0) this.f4529c;
        Function0 function03 = (Function0) this.f4530d;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        s sVar = (s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            q qVar = q.f5711a;
            t tVarT = d2.c.t(m2.t(m2.d(qVar, 1.0f), 3));
            float f11 = lv.t.f28251e;
            float f12 = lv.t.f28257k;
            t tVarD = d2.c.D(tVarT, 0.0f, f12, 0.0f, f11, 5);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            String strU = o30.f0.U(sVar, R.string.landing_store_option_button);
            m5.u0 u0Var = v.f28281u;
            long j9 = lv.s.F;
            t tVarE = m2.e(m2.d(qVar, 1.0f), f12);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = a0.g(sVar);
            }
            b2.l lVar = (b2.l) objM;
            boolean zF = sVar.f(function0);
            Object objM2 = sVar.M();
            if (zF || objM2 == fVar) {
                objM2 = new oo.z(18, function0);
                sVar.k0(objM2);
            }
            r9.d(strU, androidx.compose.foundation.b.b(tVarE, lVar, null, false, null, null, (Function0) objM2, 28), j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            String strU2 = o30.f0.U(sVar, R.string.landing_charity_option_button);
            t tVarE2 = m2.e(m2.d(qVar, 1.0f), f12);
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = a0.g(sVar);
            }
            b2.l lVar2 = (b2.l) objM3;
            boolean zF2 = sVar.f(function02);
            Object objM4 = sVar.M();
            if (zF2 || objM4 == fVar) {
                objM4 = new oo.z(19, function02);
                sVar.k0(objM4);
            }
            r9.d(strU2, androidx.compose.foundation.b.b(tVarE2, lVar2, null, false, null, null, (Function0) objM4, 28), j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            String strU3 = o30.f0.U(sVar, R.string.landing_cancel_option_button);
            t tVarE3 = m2.e(m2.d(qVar, 1.0f), f12);
            Object objM5 = sVar.M();
            if (objM5 == fVar) {
                objM5 = a0.g(sVar);
            }
            b2.l lVar3 = (b2.l) objM5;
            boolean zF3 = sVar.f(function03);
            Object objM6 = sVar.M();
            if (zF3 || objM6 == fVar) {
                objM6 = new oo.z(20, function03);
                sVar.k0(objM6);
            }
            r9.d(strU3, androidx.compose.foundation.b.b(tVarE3, lVar3, null, false, null, null, (Function0) objM6, 28), j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            sVar.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x038b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r42, java.lang.Object r43, java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ap.e.f(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        si.b bVar = (si.b) this.f4528b;
        c3 c3Var = (c3) this.f4529c;
        Activity activity = (Activity) this.f4530d;
        z1 z1Var = (z1) obj;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        z1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((s) nVar).f(z1Var) ? 4 : 2;
        }
        s sVar = (s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            f2.c0 c0VarA = f2.e0.a(0, 0, 0, 3, sVar);
            boolean zF = sVar.f(c0VarA) | sVar.h(bVar);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zF || objM == fVar) {
                objM = new mn.g(c0VarA, bVar, null, 25);
                sVar.k0(objM);
            }
            m3.i.h(c0VarA, (Function2) objM, sVar);
            t tVarY = d2.c.y(q.f5711a, z1Var);
            boolean zF2 = sVar.f(c3Var) | sVar.h(activity) | sVar.h(bVar);
            Object objM2 = sVar.M();
            if (zF2 || objM2 == fVar) {
                objM2 = new h0(bVar, c3Var, activity, 14);
                sVar.k0(objM2);
            }
            ox.h.c(tVarY, c0VarA, null, null, null, null, false, null, (Function1) objM2, sVar, 0, 508);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x040c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0428 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x045a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object h(java.lang.Object r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 1461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ap.e.h(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        s sVar;
        b1 b1Var = (b1) this.f4528b;
        c1 c1Var = (c1) this.f4529c;
        t5.a aVar = (t5.a) this.f4530d;
        z1 z1Var = (z1) obj;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        z1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((s) nVar).f(z1Var) ? 4 : 2;
        }
        s sVar2 = (s) nVar;
        if (sVar2.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            t tVarR = d2.c.r(m2.c(m2.d(d2.c.y(v1.n.j(q.f5711a, ((x60.h) sVar2.j(PantryThemeKt.getLocalPantryColor())).G, g0.f23254b), z1Var), 1.0f), 1.0f));
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarR, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            if (c1Var.f39144a instanceof DiscountVoucher) {
                sVar2.a0(-115809537);
                if (1.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                sVar = sVar2;
                us.a.f(c1Var, aVar, b1Var, new n1(1.0f, false), sVar, MLKEMEngine.KyberPolyBytes);
                sVar2.q(false);
            } else {
                sVar2.a0(-115800290);
                if (1.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                sVar = sVar2;
                us.a.p(c1Var, aVar, b1Var, new n1(1.0f, false), sVar, MLKEMEngine.KyberPolyBytes);
                sVar.q(false);
            }
            sVar.q(true);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(1142055638);
                Object objM = sVar.M();
                if (objM == m3.m.f29332a) {
                    objM = new pi.b(b1Var, 22);
                    sVar.k0(objM);
                }
                rs.k.d(c1Var, (Function0) objM, sVar, 48);
                sVar.q(false);
            } else {
                sVar.a0(1142268980);
                sVar.q(false);
            }
        } else {
            sVar2.U();
        }
        return Unit.f26487a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        x60.j jVar = (x60.j) this.f4528b;
        x60.h hVar = (x60.h) this.f4529c;
        String str = (String) this.f4530d;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((j2) obj).getClass();
        s sVar = (s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            r9.d(str, null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43975y, sVar, 0, 0, 131066);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        b1 b1Var = (b1) this.f4528b;
        le.p pVar = (le.p) this.f4529c;
        Function0 function0 = (Function0) this.f4530d;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        s sVar = (s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            q qVar = q.f5711a;
            t tVarT = m2.t(m2.d(qVar, 1.0f), 3);
            float f11 = lv.t.f28251e;
            float f12 = lv.t.f28253g;
            t tVarC = d2.c.C(tVarT, f11, f12, f12, f12);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC2 = b4.a.c(tVarC, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(i2VarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC2, gVar4, sVar);
            b4.j jVar = b4.d.f5693k;
            w2 w2Var = new w2(jVar);
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC3 = b4.a.c(w2Var, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            x0.f((he.k) pVar.getValue(), m2.m(qVar, 60), false, 0.0f, Integer.MAX_VALUE, false, null, sVar, 1572912, 0, 4194236);
            x0.f((he.k) pVar.getValue(), d2.c.D(m2.m(qVar, 120), f11, lv.t.f28256j, 0.0f, 0.0f, 12), ((Boolean) b1Var.getValue()).booleanValue(), 0.0f, Integer.MAX_VALUE, false, null, sVar, 1572912, 0, 4194232);
            sVar.q(true);
            t tVarG = b3.i.g(jVar, m2.d(qVar, 1.0f));
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            t tVarThen = tVarG.then(new n1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC4 = b4.a.c(tVarThen, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC4, gVar4, sVar);
            String strU = o30.f0.U(sVar, R.string.special_reward_profile_card_title);
            m5.u0 u0Var = v.l;
            long j9 = lv.s.f28217b;
            r9.d(strU, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            r9.d(o30.f0.U(sVar, R.string.special_reward_profile_card_body), d2.c.D(qVar, 0.0f, f11, 0.0f, 0.0f, 13), j9, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, v.f28276p, sVar, 432, 12582912, 130040);
            t tVarD = d2.c.D(qVar, 0.0f, f12, 0.0f, 0.0f, 13);
            String strU2 = o30.f0.U(sVar, R.string.special_reward_profile_card_cta);
            lv.q qVar2 = lv.q.REGULAR;
            lv.e eVar = lv.e.SMALL;
            boolean zF = sVar.f(function0);
            Object objM = sVar.M();
            if (zF || objM == m3.m.f29332a) {
                objM = new r(3, function0);
                sVar.k0(objM);
            }
            v0.n.l(tVarD, strU2, null, qVar2, eVar, false, false, null, null, (Function0) objM, sVar, 27654, 484);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f4528b;
        ProfileFeature profileFeature = (ProfileFeature) this.f4529c;
        Function1 function12 = (Function1) this.f4530d;
        m3.n nVar = (m3.n) obj2;
        ((Integer) obj3).getClass();
        ((s1.z) obj).getClass();
        function1.invoke(profileFeature.getFeatureState());
        int i11 = vn.a.$EnumSwitchMapping$0[profileFeature.getFeatureState().ordinal()];
        m3.f fVar = m3.m.f29332a;
        if (i11 == 1 || i11 == 2) {
            s sVar = (s) nVar;
            sVar.a0(-172142738);
            SpecialRewardsCardDetails specialRewardsDetails = profileFeature.getSpecialRewardsDetails();
            if (specialRewardsDetails == null) {
                sVar.a0(-172142739);
                sVar.q(false);
            } else {
                sVar.a0(-172142738);
                float f11 = lv.t.f28253g;
                t tVarC = d2.c.C(q.f5711a, f11, f11, f11, lv.t.f28249c);
                SpecialReward specialRewardMapProfileSpecialRewards = SpecialReward.INSTANCE.mapProfileSpecialRewards("CLAIMED", profileFeature.getFeatureState() == ProfileFeatureState.SINGLE_REWARD_CLOSE_TO_EXPIRE, specialRewardsDetails);
                boolean zF = sVar.f(function12) | sVar.f(specialRewardsDetails);
                Object objM = sVar.M();
                if (zF || objM == fVar) {
                    objM = new ry.b(21, function12, specialRewardsDetails);
                    sVar.k0(objM);
                }
                os.a.e(tVarC, specialRewardMapProfileSpecialRewards, false, (Function1) objM, sVar, 6, 4);
                sVar.q(false);
            }
            sVar.q(false);
        } else if (i11 != 3) {
            s sVar2 = (s) nVar;
            sVar2.a0(-170994932);
            sVar2.q(false);
        } else {
            s sVar3 = (s) nVar;
            sVar3.a0(-171185520);
            boolean zF2 = sVar3.f(function12);
            Object objM2 = sVar3.M();
            if (zF2 || objM2 == fVar) {
                objM2 = new qr.f(function12, 18);
                sVar3.k0(objM2);
            }
            cg.g((Function0) objM2, sVar3, 0);
            sVar3.q(false);
        }
        return Unit.f26487a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.f4528b;
        StoreSignupCardDetails storeSignupCardDetails = (StoreSignupCardDetails) this.f4529c;
        Function0 function02 = (Function0) this.f4530d;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        s sVar = (s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            k0 k0Var = new k0(d0.h(new i4.v(g0.d(4278220147L)), new i4.v(g0.d(4278215007L)), new i4.v(g0.d(4278208326L))), 0L, (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY))));
            q qVar = q.f5711a;
            t tVarI = v1.n.i(qVar, k0Var, 0.0f, 6);
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarI, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            t tVarD = m2.d(qVar, 1.0f);
            d2.d dVar2 = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            y yVarA = w.a(dVar2, iVar, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarD, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            t tVarZ = d2.c.z(m2.d(qVar, 1.0f), e0.s(sVar, R.dimen.spacing_2));
            d2.b bVar = d2.i.f13801a;
            b4.j jVar = b4.d.f5692j;
            i2 i2VarA = h2.a(bVar, jVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = b4.a.c(tVarZ, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            t tVarU = m2.u(qVar, null, 3);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            t tVarThen = tVarU.then(new n1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            y yVarA2 = w.a(dVar2, iVar, sVar, 0);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            t tVarC4 = b4.a.c(tVarThen, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL4, gVar2, sVar);
            a0.y(iHashCode4, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC4, gVar4, sVar);
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new w2.g0(1);
                sVar.k0(objM);
            }
            t tVarC5 = j5.r.c(qVar, false, (Function1) objM);
            String strU = o30.f0.U(sVar, R.string.profile_store_signup_header);
            m5.u0 u0Var = v.f28264c;
            long j9 = lv.s.J;
            r9.d(strU, tVarC5, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            d2.c.f(m2.m(qVar, lv.t.f28251e), sVar);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            r9.d(String.format(o30.f0.U(sVar, R.string.profile_store_signup_body), Arrays.copyOf(new Object[]{storeSignupCardDetails.getUserCount(), new Locale("", storeSignupCardDetails.getCountry()).getDisplayCountry(Locale.getDefault())}, 2)), qVar, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, 432, 12582912, 131064);
            sVar.q(true);
            d2.c.f(m2.q(qVar, lv.t.f28254h), sVar);
            v1.n.d(x0.z(R.drawable.ic_close_w_round_bg, sVar, 0), null, b4.a.a(b3.i.g(jVar, m2.m(qVar, 28)), c5.m2.f7291a, new on.l(22, function02)), null, null, 0.0f, null, sVar, 56, 120);
            sVar.q(true);
            t tVarD2 = m2.d(qVar, 1.0f);
            i2 i2VarA2 = h2.a(bVar, jVar, sVar, 0);
            int iHashCode5 = Long.hashCode(sVar.T);
            u3.i iVarL5 = sVar.l();
            t tVarC6 = b4.a.c(tVarD2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA2, gVar, sVar);
            m3.i.C(iVarL5, gVar2, sVar);
            a0.y(iHashCode5, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC6, gVar4, sVar);
            v1.n.d(x0.z(R.drawable.gfx_profile_store_card, sVar, 0), null, b3.i.g(b4.d.l, m2.e(m2.q(qVar, 113), 136)), null, null, 0.0f, null, sVar, 56, 120);
            sVar.q(true);
            sVar.q(true);
            v0.n.n(d2.u.f13938a.a(d2.c.z(qVar, lv.t.f28253g), b4.d.f5691i), o30.f0.U(sVar, R.string.profile_store_signup_cta), null, lv.q.INVERTED, lv.e.MEDIUM, false, false, null, null, function0, sVar, 27648, 484);
            sVar.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        boolean z11;
        int i11;
        int i12;
        q qVar;
        SpecialRewardCelebrationFragment specialRewardCelebrationFragment = (SpecialRewardCelebrationFragment) this.f4528b;
        b1 b1Var = (b1) this.f4529c;
        le.p pVar = (le.p) this.f4530d;
        z1 z1Var = (z1) obj;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        z1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((s) nVar).f(z1Var) ? 4 : 2;
        }
        s sVar = (s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            t tVarJ = v1.n.j(d2.c.y(m2.f13850c, z1Var), lv.s.f28217b, g0.f23254b);
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarJ, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            q qVar2 = q.f5711a;
            t tVarZ = d2.c.z(d2.u.f13938a.a(m2.d(qVar2, 1.0f), b4.d.f5687e), lv.t.f28253g);
            b4.i iVar = b4.d.f5695n;
            y yVarA = w.a(d2.i.f13803c, iVar, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarZ, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            t tVarF = b3.i.f(iVar, m2.d(qVar2, 1.0f));
            String strU = o30.f0.U(sVar, R.string.special_reward_celebration_title);
            m5.u0 u0Var = v.f28266e;
            long j9 = lv.s.f28235p;
            r9.d(strU, tVarF, j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            r9.d(o30.f0.U(sVar, R.string.special_reward_celebration_body), d2.c.D(b3.i.f(iVar, m2.d(qVar2, 1.0f)), 0.0f, lv.t.f28254h, 0.0f, 0.0f, 13), j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28278r, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            m3.f fVar = m3.m.f29332a;
            if (zBooleanValue) {
                sVar.a0(1442904397);
                SpecialReward specialReward = (SpecialReward) ((qo.h) specialRewardCelebrationFragment.f9225f.getValue()).f37208a.a("SPECIAL_REWARD");
                if (specialReward == null) {
                    sVar.a0(1442935055);
                    sVar.q(false);
                    qVar = qVar2;
                } else {
                    sVar.a0(1442935056);
                    Object objM = sVar.M();
                    if (objM == fVar) {
                        objM = m3.i.w(Boolean.FALSE);
                        sVar.k0(objM);
                    }
                    b1 b1Var2 = (b1) objM;
                    float f11 = ((Boolean) b1Var2.getValue()).booleanValue() ? 360.0f : 180.0f;
                    t1.r rVar = t1.w.f39594b;
                    c3 c3VarB = t1.d.b(f11, t1.c.k(500, 0, rVar, 2), "", null, sVar, 3072, 20);
                    c3 c3VarB2 = t1.d.b(((Boolean) b1Var2.getValue()).booleanValue() ? 1.0f : 0.0f, t1.c.k(500, 0, rVar, 2), "", null, sVar, 3072, 20);
                    Unit unit = Unit.f26487a;
                    Object objM2 = sVar.M();
                    if (objM2 == fVar) {
                        objM2 = new co.j(b1Var2, null, 5);
                        sVar.k0(objM2);
                    }
                    m3.i.h(unit, (Function2) objM2, sVar);
                    qVar = qVar2;
                    os.a.e(f4.g.a(f4.g.i(d2.c.D(qVar2, 0.0f, lv.t.f28255i, 0.0f, 0.0f, 13), ((Number) c3VarB.getValue()).floatValue()), ((Number) c3VarB2.getValue()).floatValue()), specialReward, false, null, sVar, 0, 12);
                    sVar = sVar;
                    sVar.q(false);
                }
                t tVarD = d2.c.D(b3.i.f(iVar, m2.u(qVar, null, 3)), 0.0f, lv.t.f28255i, 0.0f, 0.0f, 13);
                String strU2 = o30.f0.U(sVar, R.string.special_reward_celebration_cta_unwrapped);
                lv.q qVar3 = lv.q.INVERTED;
                boolean zH = sVar.h(specialRewardCelebrationFragment);
                Object objM3 = sVar.M();
                if (zH || objM3 == fVar) {
                    objM3 = new rv.a(specialRewardCelebrationFragment, 26);
                    sVar.k0(objM3);
                }
                v0.n.n(tVarD, strU2, null, qVar3, null, false, false, null, null, (Function0) objM3, sVar, 3072, 500);
                sVar.q(false);
            } else {
                sVar.a0(1445478203);
                t tVarF2 = b3.i.f(iVar, m2.u(qVar2, null, 3));
                float f12 = lv.t.f28255i;
                x0.f((he.k) pVar.getValue(), d2.c.D(tVarF2, 0.0f, f12, 0.0f, 0.0f, 13), false, 0.0f, Integer.MAX_VALUE, false, null, sVar, 1572864, 0, 4194236);
                t tVarD2 = d2.c.D(b3.i.f(iVar, m2.u(qVar2, null, 3)), 0.0f, f12, 0.0f, 0.0f, 13);
                if (((Boolean) b1Var.getValue()).booleanValue()) {
                    i11 = 1446301749;
                    i12 = R.string.special_reward_celebration_cta_unwrapped;
                    z11 = false;
                } else {
                    z11 = false;
                    i11 = 1446456191;
                    i12 = R.string.special_reward_celebration_cta;
                }
                String strJ = b3.i.j(i11, i12, sVar, sVar, z11);
                lv.q qVar4 = lv.q.INVERTED;
                boolean zH2 = sVar.h(specialRewardCelebrationFragment);
                Object objM4 = sVar.M();
                if (zH2 || objM4 == fVar) {
                    objM4 = new us.j(14, specialRewardCelebrationFragment, b1Var);
                    sVar.k0(objM4);
                }
                v0.n.l(tVarD2, strJ, null, qVar4, null, false, false, null, null, (Function0) objM4, sVar, 3072, 500);
                sVar.q(false);
            }
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v65 */
    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        ?? r22;
        Object obj4;
        String strJ;
        int i11 = this.f4527a;
        r0 r0Var = g0.f23254b;
        d2.u uVar = d2.u.f13938a;
        int i12 = 18;
        q qVar = q.f5711a;
        m3.f fVar = m3.m.f29332a;
        Object obj5 = this.f4530d;
        Object obj6 = this.f4528b;
        Object obj7 = this.f4529c;
        int i13 = 0;
        boolean z11 = false;
        boolean z12 = false;
        switch (i11) {
            case 0:
                f0 f0Var = (f0) obj6;
                n nVar = (n) obj7;
                Activity activity = (Activity) obj5;
                z1 z1Var = (z1) obj;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                z1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((s) nVar2).f(z1Var) ? 4 : 2;
                }
                s sVar = (s) nVar2;
                if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    long j9 = lv.s.J;
                    t tVarC = m2.c(m2.d(d2.c.r(d2.c.y(v1.n.j(qVar, j9, r0Var), z1Var)), 1.0f), 1.0f);
                    y yVarA = w.a(d2.i.f13805e, b4.d.f5695n, sVar, 54);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    t tVarC2 = b4.a.c(tVarC, sVar);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar);
                    bp.h hVar2 = bp.h.INSTANCE;
                    t tVarJ = v1.n.j(qVar, j9, r0Var);
                    boolean zH = sVar.h(nVar) | sVar.h(activity);
                    Object objM = sVar.M();
                    if (zH || objM == fVar) {
                        objM = new a3.p(7, nVar, activity);
                        sVar.k0(objM);
                    }
                    b0.z.g(f0Var, hVar2, tVarJ, null, null, nv.b.f31400a, nv.b.f31401b, nv.b.f31402c, nv.b.f31403d, (Function1) objM, sVar, 920125872, 1080);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            case 1:
                BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) obj6;
                String str2 = (String) obj7;
                String str3 = (String) obj5;
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                s sVar2 = (s) nVar3;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    t tVarZ = d2.c.z(qVar, lv.t.f28249c);
                    y yVarA2 = w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    u3.i iVarL2 = sVar2.l();
                    t tVarC3 = b4.a.c(tVarZ, sVar2);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar3);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(yVarA2, b5.i.f5843f, sVar2);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar2);
                    m3.i.v(sVar2, Integer.valueOf(iHashCode2), b5.i.f5844g);
                    m3.i.z(sVar2, b5.i.f5845h);
                    m3.i.C(tVarC3, b5.i.f5841d, sVar2);
                    m0.c.H(baseItemMnuV2, sVar2, 0);
                    m0.c.I(baseItemMnuV2, str2, str3, sVar2, 0);
                    sVar2.q(true);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
            case 2:
                SnackBarInfo snackBarInfo = (SnackBarInfo) obj6;
                String str4 = (String) obj7;
                SnackBarInfo snackBarInfo2 = (SnackBarInfo) obj5;
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                s sVar3 = (s) nVar4;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    float f11 = lv.t.f28253g;
                    t tVarZ2 = d2.c.z(qVar, f11);
                    i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar3, 48);
                    int iHashCode3 = Long.hashCode(sVar3.T);
                    u3.i iVarL3 = sVar3.l();
                    t tVarC4 = b4.a.c(tVarZ2, sVar3);
                    b5.j.R.getClass();
                    b5.h hVar4 = b5.i.f5839b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar4);
                    } else {
                        sVar3.n0();
                    }
                    m3.i.C(i2VarA, b5.i.f5843f, sVar3);
                    m3.i.C(iVarL3, b5.i.f5842e, sVar3);
                    m3.i.v(sVar3, Integer.valueOf(iHashCode3), b5.i.f5844g);
                    m3.i.z(sVar3, b5.i.f5845h);
                    m3.i.C(tVarC4, b5.i.f5841d, sVar3);
                    Integer icon = snackBarInfo.getIcon();
                    if (icon == null) {
                        sVar3.a0(-886228492);
                        sVar3.q(false);
                    } else {
                        sVar3.a0(-886228491);
                        v1.n.d(x0.z(icon.intValue(), sVar3, 0), null, null, null, null, 0.0f, null, sVar3, 56, 124);
                        sVar3.q(false);
                    }
                    d2.c.f(m2.q(qVar, f11), sVar3);
                    boolean zF = sVar3.f(str4);
                    Object objM2 = sVar3.M();
                    if (zF || objM2 == fVar) {
                        objM2 = new c60.e(str4, 2);
                        sVar3.k0(objM2);
                    }
                    r9.d(o30.f0.U(sVar3, snackBarInfo.getText()), j5.r.c(qVar, false, (Function1) objM2), snackBarInfo2.getTextColor(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar3, 0, 12582912, 131064);
                    d2.c.f(m2.q(qVar, f11), sVar3);
                    sVar3.q(true);
                } else {
                    sVar3.U();
                }
                return Unit.f26487a;
            case 3:
                List list = (List) obj6;
                String str5 = (String) obj7;
                Function2 function2 = (Function2) obj5;
                m3.n nVar5 = (m3.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                s sVar4 = (s) nVar5;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    t tVarD = m2.d(qVar, 1.0f);
                    float f12 = lv.t.f28253g;
                    t tVarB = d2.c.B(tVarD, f12, 0.0f, 2);
                    y yVarA3 = w.a(d2.i.f13803c, b4.d.f5694m, sVar4, 48);
                    int iHashCode4 = Long.hashCode(sVar4.T);
                    u3.i iVarL4 = sVar4.l();
                    t tVarC5 = b4.a.c(tVarB, sVar4);
                    b5.j.R.getClass();
                    b5.h hVar5 = b5.i.f5839b;
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(hVar5);
                    } else {
                        sVar4.n0();
                    }
                    b5.g gVar = b5.i.f5843f;
                    m3.i.C(yVarA3, gVar, sVar4);
                    b5.g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL4, gVar2, sVar4);
                    Integer numValueOf = Integer.valueOf(iHashCode4);
                    b5.g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar4, numValueOf, gVar3);
                    b5.d dVar = b5.i.f5845h;
                    m3.i.z(sVar4, dVar);
                    b5.g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC5, gVar4, sVar4);
                    t tVarD2 = m2.d(qVar, 1.0f);
                    String str6 = str5;
                    i2 i2VarA2 = h2.a(d2.i.f13801a, b4.d.f5692j, sVar4, 0);
                    int iHashCode5 = Long.hashCode(sVar4.T);
                    u3.i iVarL5 = sVar4.l();
                    t tVarC6 = b4.a.c(tVarD2, sVar4);
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(hVar5);
                    } else {
                        sVar4.n0();
                    }
                    m3.i.C(i2VarA2, gVar, sVar4);
                    m3.i.C(iVarL5, gVar2, sVar4);
                    a0.y(iHashCode5, sVar4, gVar3, sVar4, dVar);
                    m3.i.C(tVarC6, gVar4, sVar4);
                    if (str6 == null) {
                        sVar4.a0(-259729449);
                        sVar4.q(false);
                    } else {
                        sVar4.a0(-259729448);
                        r9.d(o30.f0.U(sVar4, R.string.mnu_feed_sorting_reset_cta), b4.a.a(qVar, c5.m2.f7291a, new cn.c0(1, function2)), lv.s.f28217b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar4, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                        sVar4.q(false);
                    }
                    t tVarE = m2.e(qVar, lv.t.f28251e);
                    if (1.0f <= 0.0d) {
                        e2.a.a("invalid weight; must be greater than zero");
                    }
                    d2.c.f(tVarE.then(new n1(1.0f, true)), sVar4);
                    v1.n.d(x0.z(R.drawable.system_icon_close_neutral_80, sVar4, 0), o30.f0.U(sVar4, R.string.voice_over_back), b4.a.a(qVar, c5.m2.f7291a, new cn.c0(0, function2)), null, null, 0.0f, null, sVar4, 8, 120);
                    sVar4.q(true);
                    d2.c.f(m2.e(qVar, f12), sVar4);
                    r9.d(o30.f0.U(sVar4, R.string.mnu_feed_sorting_title), null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28265d, sVar4, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                    sVar4.a0(920212896);
                    int i14 = 0;
                    for (Object obj8 : list) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            d0.n();
                            throw null;
                        }
                        if (i14 == list.size() - 1 && i14 % 2 == 0) {
                            sVar4.a0(1223013193);
                            SortingChoice sortingChoice = (SortingChoice) list.get(i14);
                            boolean zF2 = sVar4.f(function2);
                            Object objM3 = sVar4.M();
                            if (zF2 || objM3 == fVar) {
                                objM3 = new b3.n(3, function2);
                                sVar4.k0(objM3);
                            }
                            str = str6;
                            x0.k(sortingChoice, null, str, (Function2) objM3, sVar4, 48);
                            sVar4.q(false);
                        } else {
                            str = str6;
                            if (i14 % 2 == 1) {
                                sVar4.a0(1223478472);
                                SortingChoice sortingChoice2 = (SortingChoice) list.get(i14 - 1);
                                SortingChoice sortingChoice3 = (SortingChoice) list.get(i14);
                                boolean zF3 = sVar4.f(function2);
                                Object objM4 = sVar4.M();
                                if (zF3 || objM4 == fVar) {
                                    objM4 = new b3.n(4, function2);
                                    sVar4.k0(objM4);
                                }
                                x0.k(sortingChoice2, sortingChoice3, str, (Function2) objM4, sVar4, 0);
                                sVar4.q(false);
                            } else {
                                sVar4.a0(1223905156);
                                sVar4.q(false);
                            }
                        }
                        str6 = str;
                        i14 = i15;
                    }
                    sVar4.q(false);
                    d2.c.f(m2.e(qVar, lv.t.f28253g), sVar4);
                    sVar4.q(true);
                } else {
                    sVar4.U();
                }
                return Unit.f26487a;
            case 4:
                final DiscoverSheetView discoverSheetView = (DiscoverSheetView) obj6;
                final fn.c cVar = (fn.c) obj7;
                dn.k kVar = (dn.k) obj5;
                m3.n nVar6 = (m3.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i16 = DiscoverSheetView.f9147q;
                ((d2.t) obj).getClass();
                s sVar5 = (s) nVar6;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    List<nq.d> discoverRows = discoverSheetView.getDiscoverRows();
                    Function0 function0 = discoverSheetView.f9149j;
                    Function1 function1 = discoverSheetView.f9151m;
                    Function1 function12 = discoverSheetView.f9153o;
                    Function2 function22 = discoverSheetView.f9154p;
                    boolean zH2 = sVar5.h(discoverSheetView) | sVar5.h(cVar);
                    Object objM5 = sVar5.M();
                    if (zH2 || objM5 == fVar) {
                        final int i17 = 1;
                        objM5 = new Function1() { // from class: gn.h
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                int i18 = i17;
                                fn.c cVar2 = cVar;
                                DiscoverSheetView discoverSheetView2 = discoverSheetView;
                                mq.a aVar = (mq.a) obj9;
                                switch (i18) {
                                    case 0:
                                        int i19 = DiscoverSheetView.f9147q;
                                        aVar.getClass();
                                        Function1 function13 = discoverSheetView2.f9152n;
                                        if (function13 != null) {
                                            function13.invoke(aVar);
                                        }
                                        cVar2.D.k(Boolean.FALSE);
                                        break;
                                    default:
                                        int i21 = DiscoverSheetView.f9147q;
                                        aVar.getClass();
                                        Function1 function14 = discoverSheetView2.f9152n;
                                        if (function14 != null) {
                                            function14.invoke(aVar);
                                        }
                                        cVar2.D.k(Boolean.FALSE);
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar5.k0(objM5);
                    }
                    gn.a.m(0, kVar, cVar, discoverRows, function0, function1, (Function1) objM5, function12, function22, sVar5);
                } else {
                    sVar5.U();
                }
                return Unit.f26487a;
            case 5:
                c3 c3Var = (c3) obj6;
                final DiscoverSheetView discoverSheetView2 = (DiscoverSheetView) obj7;
                final fn.c cVar2 = (fn.c) obj5;
                m3.n nVar7 = (m3.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i18 = DiscoverSheetView.f9147q;
                ((d2.z) obj).getClass();
                s sVar6 = (s) nVar7;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    HeroComponentResponse heroComponentResponse = (HeroComponentResponse) c3Var.getValue();
                    if (heroComponentResponse == null) {
                        sVar6.a0(2070429317);
                        sVar6.q(false);
                    } else {
                        sVar6.a0(2070429318);
                        boolean zH3 = sVar6.h(discoverSheetView2) | sVar6.h(heroComponentResponse);
                        Object objM6 = sVar6.M();
                        Object obj9 = objM6;
                        if (zH3 || objM6 == fVar) {
                            ek.a aVar = new ek.a(17, discoverSheetView2, heroComponentResponse);
                            sVar6.k0(aVar);
                            obj9 = aVar;
                        }
                        Function1 function13 = (Function1) obj9;
                        boolean zH4 = sVar6.h(discoverSheetView2) | sVar6.h(cVar2);
                        Object objM7 = sVar6.M();
                        if (zH4 || objM7 == fVar) {
                            r22 = 0;
                            final boolean z13 = false ? 1 : 0;
                            Function1 function14 = new Function1() { // from class: gn.h
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj92) {
                                    int i182 = z13;
                                    fn.c cVar22 = cVar2;
                                    DiscoverSheetView discoverSheetView22 = discoverSheetView2;
                                    mq.a aVar2 = (mq.a) obj92;
                                    switch (i182) {
                                        case 0:
                                            int i19 = DiscoverSheetView.f9147q;
                                            aVar2.getClass();
                                            Function1 function132 = discoverSheetView22.f9152n;
                                            if (function132 != null) {
                                                function132.invoke(aVar2);
                                            }
                                            cVar22.D.k(Boolean.FALSE);
                                            break;
                                        default:
                                            int i21 = DiscoverSheetView.f9147q;
                                            aVar2.getClass();
                                            Function1 function142 = discoverSheetView22.f9152n;
                                            if (function142 != null) {
                                                function142.invoke(aVar2);
                                            }
                                            cVar22.D.k(Boolean.FALSE);
                                            break;
                                    }
                                    return Unit.f26487a;
                                }
                            };
                            sVar6.k0(function14);
                            obj4 = function14;
                        } else {
                            r22 = 0;
                            obj4 = objM7;
                        }
                        gn.a.g(heroComponentResponse, function13, (Function1) obj4, sVar6, r22);
                        sVar6.q(r22);
                    }
                } else {
                    sVar6.U();
                }
                return Unit.f26487a;
            case 6:
                ArrayList arrayList = (ArrayList) obj6;
                ArrayList arrayList2 = (ArrayList) obj7;
                ArrayList arrayList3 = (ArrayList) obj5;
                m3.n nVar8 = (m3.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                s sVar7 = (s) nVar8;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    ii.l.j(arrayList, null, sVar7, 0);
                    ii.l.o(arrayList2, null, sVar7, 0);
                    ii.l.c(arrayList3, null, sVar7, 0);
                } else {
                    sVar7.U();
                }
                return Unit.f26487a;
            case 7:
                Function0 function02 = (Function0) obj6;
                String str7 = (String) obj7;
                String strU = (String) obj5;
                m3.n nVar9 = (m3.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                s sVar8 = (s) nVar9;
                if (sVar8.R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    q qVar2 = q.f5711a;
                    t tVarT = m2.t(m2.d(qVar2, 1.0f), 3);
                    u0 u0VarD = p.d(b4.d.f5683a, false);
                    int iHashCode6 = Long.hashCode(sVar8.T);
                    u3.i iVarL6 = sVar8.l();
                    t tVarC7 = b4.a.c(tVarT, sVar8);
                    b5.j.R.getClass();
                    b5.h hVar6 = b5.i.f5839b;
                    sVar8.e0();
                    if (sVar8.S) {
                        sVar8.k(hVar6);
                    } else {
                        sVar8.n0();
                    }
                    b5.g gVar5 = b5.i.f5843f;
                    m3.i.C(u0VarD, gVar5, sVar8);
                    b5.g gVar6 = b5.i.f5842e;
                    m3.i.C(iVarL6, gVar6, sVar8);
                    Integer numValueOf2 = Integer.valueOf(iHashCode6);
                    b5.g gVar7 = b5.i.f5844g;
                    m3.i.v(sVar8, numValueOf2, gVar7);
                    b5.d dVar2 = b5.i.f5845h;
                    m3.i.z(sVar8, dVar2);
                    b5.g gVar8 = b5.i.f5841d;
                    m3.i.C(tVarC7, gVar8, sVar8);
                    v1.n.d(x0.z(R.drawable.system_icon_close_neutral_80, sVar8, 0), null, b4.a.a(uVar.a(d2.c.z(qVar2, e0.s(sVar8, R.dimen.spacing_2)), b4.d.f5685c), c5.m2.f7291a, new bm.f(18, function02)), null, null, 0.0f, null, sVar8, 56, 120);
                    t tVarZ3 = d2.c.z(m2.t(m2.d(qVar2, 1.0f), 3), e0.s(sVar8, R.dimen.spacing_3));
                    y yVarA4 = w.a(d2.i.f13803c, b4.d.f5694m, sVar8, 0);
                    int iHashCode7 = Long.hashCode(sVar8.T);
                    u3.i iVarL7 = sVar8.l();
                    t tVarC8 = b4.a.c(tVarZ3, sVar8);
                    sVar8.e0();
                    if (sVar8.S) {
                        sVar8.k(hVar6);
                    } else {
                        sVar8.n0();
                    }
                    m3.i.C(yVarA4, gVar5, sVar8);
                    m3.i.C(iVarL7, gVar6, sVar8);
                    a0.y(iHashCode7, sVar8, gVar7, sVar8, dVar2);
                    m3.i.C(tVarC8, gVar8, sVar8);
                    t tVarD3 = m2.d(qVar2, 1.0f);
                    String strU2 = o30.f0.U(sVar8, R.string.badges_page_info_header);
                    m5.u0 u0Var = v.f28271j;
                    long j11 = lv.s.C;
                    r9.d(strU2, tVarD3, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(u0Var, j11, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar8, 48, 0, 131068);
                    t tVarD4 = d2.c.D(m2.t(m2.d(qVar2, 1.0f), 3), 0.0f, e0.s(sVar8, R.dimen.spacing_2), 0.0f, 0.0f, 13);
                    d2.b bVar = d2.i.f13801a;
                    b4.j jVar = b4.d.f5692j;
                    i2 i2VarA3 = h2.a(bVar, jVar, sVar8, 0);
                    int iHashCode8 = Long.hashCode(sVar8.T);
                    u3.i iVarL8 = sVar8.l();
                    t tVarC9 = b4.a.c(tVarD4, sVar8);
                    sVar8.e0();
                    if (sVar8.S) {
                        sVar8.k(hVar6);
                    } else {
                        sVar8.n0();
                    }
                    m3.i.C(i2VarA3, gVar5, sVar8);
                    m3.i.C(iVarL8, gVar6, sVar8);
                    a0.y(iHashCode8, sVar8, gVar7, sVar8, dVar2);
                    m3.i.C(tVarC9, gVar8, sVar8);
                    t tVarD5 = d2.c.D(qVar2, 0.0f, 0.0f, e0.s(sVar8, R.dimen.spacing_2), 0.0f, 11);
                    b4.j jVar2 = b4.d.f5693k;
                    v1.n.d(x0.z(R.drawable.gfx_badges_info_dialog_body_1, sVar8, 0), null, b3.i.g(jVar2, tVarD5), null, null, 0.0f, null, sVar8, 56, 120);
                    w2 w2Var = new w2(jVar2);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    r9.d(String.format(o30.f0.U(sVar8, R.string.badges_page_info_body_1), Arrays.copyOf(new Object[]{str7}, 1)), w2Var, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(v.f28274n, j11, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446), sVar8, 0, 0, 131068);
                    sVar8.q(true);
                    t tVarD6 = d2.c.D(m2.t(m2.d(qVar2, 1.0f), 3), 0.0f, e0.s(sVar8, R.dimen.spacing_2), 0.0f, 0.0f, 13);
                    i2 i2VarA4 = h2.a(bVar, jVar, sVar8, 0);
                    int iHashCode9 = Long.hashCode(sVar8.T);
                    u3.i iVarL9 = sVar8.l();
                    t tVarC10 = b4.a.c(tVarD6, sVar8);
                    sVar8.e0();
                    if (sVar8.S) {
                        sVar8.k(hVar6);
                    } else {
                        sVar8.n0();
                    }
                    m3.i.C(i2VarA4, gVar5, sVar8);
                    m3.i.C(iVarL9, gVar6, sVar8);
                    a0.y(iHashCode9, sVar8, gVar7, sVar8, dVar2);
                    m3.i.C(tVarC10, gVar8, sVar8);
                    v1.n.d(x0.z(R.drawable.gfx_badges_info_dialog_body_2, sVar8, 0), null, b3.i.g(jVar2, d2.c.D(qVar2, 0.0f, 0.0f, e0.s(sVar8, R.dimen.spacing_2), 0.0f, 11)), null, null, 0.0f, null, sVar8, 56, 120);
                    String strU3 = o30.f0.U(sVar8, R.string.badges_page_info_body_2);
                    l0 l0Var = new l0(lv.s.f28217b, b0.a0.C(16), q5.r.f36046k, (q5.n) null, (o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (x5.p) null, (t5.c) null, 0L, (x5.l) null, (i4.u0) null, 65528);
                    sVar8.a0(-266120106);
                    if (strU.length() == 0) {
                        strU = o30.f0.U(sVar8, R.string.default_privacy_policy_link);
                    }
                    sVar8.q(false);
                    m5.h hVarB = d70.a.b(strU3, l0Var, strU, 0);
                    f1 f1Var = (f1) sVar8.j(x1.f7425r);
                    w2 w2Var2 = new w2(jVar2);
                    boolean zF4 = sVar8.f(hVarB) | sVar8.h(f1Var);
                    Object objM8 = sVar8.M();
                    Object obj10 = objM8;
                    if (zF4 || objM8 == fVar) {
                        hb0.o oVar = new hb0.o(17, hVarB, f1Var);
                        sVar8.k0(oVar);
                        obj10 = oVar;
                    }
                    m2.g0.c(hVarB, w2Var2, null, false, 0, 0, null, (Function1) obj10, sVar8, 0, 124);
                    e0.f.D(sVar8, true, true, true);
                } else {
                    sVar8.U();
                }
                return Unit.f26487a;
            case 8:
                List list2 = (List) obj6;
                g4.l lVar = (g4.l) obj7;
                Function2 function23 = (Function2) obj5;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                s sVar9 = (s) ((m3.n) obj2);
                if (list2 == null) {
                    sVar9.a0(-172530560);
                    sVar9.q(false);
                } else {
                    sVar9.a0(-172530559);
                    boolean zH5 = sVar9.h(lVar) | sVar9.f(function23);
                    Object objM9 = sVar9.M();
                    if (zH5 || objM9 == fVar) {
                        objM9 = new gn.i(25, lVar, function23);
                        sVar9.k0(objM9);
                    }
                    kg.a.c(list2, (Function2) objM9, sVar9, 0);
                    sVar9.q(false);
                }
                return Unit.f26487a;
            case 9:
                Function1 function15 = (Function1) obj6;
                Function0 function03 = (Function0) obj7;
                b1 b1Var = (b1) obj5;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                s sVar10 = (s) ((m3.n) obj2);
                boolean zF5 = sVar10.f(function15);
                Object objM10 = sVar10.M();
                if (zF5 || objM10 == fVar) {
                    objM10 = new defpackage.c(function15, 6);
                    sVar10.k0(objM10);
                }
                Function0 function04 = (Function0) objM10;
                boolean zF6 = sVar10.f(function03);
                Object objM11 = sVar10.M();
                if (zF6 || objM11 == fVar) {
                    objM11 = new js.b(function03, b1Var, 2);
                    sVar10.k0(objM11);
                }
                ki.j.i(null, function04, (Function0) objM11, sVar10, 0);
                p.a(v1.n.i(uVar.a(m2.e(m2.d(qVar, 1.0f), 5), b4.d.f5684b), qb.e.I(d0.h(new i4.v(i4.v.f23314g), new i4.v(g0.c(639970605))), 0.0f, 0.0f, 14), 0.0f, 6), sVar10, 0);
                return Unit.f26487a;
            case 10:
                b1 b1Var2 = (b1) obj6;
                CharityItem charityItem = (CharityItem) obj7;
                Function0 function05 = (Function0) obj5;
                m3.n nVar10 = (m3.n) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar11 = (s) nVar10;
                if (sVar11.R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    ki.j.m(4, ki.j.b(b1Var2), u3.e.e(838831848, sVar11, new u1(charityItem, function05, z11 ? 1 : 0, i12)), sVar11, 390);
                } else {
                    sVar11.U();
                }
                return Unit.f26487a;
            case 11:
                b1 b1Var3 = (b1) obj6;
                Function1 function16 = (Function1) obj7;
                String str8 = (String) obj5;
                m3.n nVar11 = (m3.n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar12 = (s) nVar11;
                if (sVar12.R(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    ki.j.m(7, ki.j.b(b1Var3), u3.e.e(1698084760, sVar12, new u1(function16, str8, z12 ? 1 : 0, 21)), sVar12, 390);
                } else {
                    sVar12.U();
                }
                return Unit.f26487a;
            case 12:
                CharityItem charityItem2 = (CharityItem) obj6;
                Function1 function17 = (Function1) obj7;
                Function1 function18 = (Function1) obj5;
                m3.n nVar12 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                StoreInformation storeInfoOrNull = charityItem2.getStoreInfoOrNull();
                String phoneNumber = storeInfoOrNull != null ? storeInfoOrNull.getPhoneNumber() : null;
                t tVarD7 = m2.d(m2.t(qVar, 3), 1.0f);
                if (mv.d.j(charityItem2) == ItemState.INACTIVE_TODAY || mv.d.l(charityItem2).getIntervalStart() == null || mv.d.l(charityItem2).getIntervalEnd() == null) {
                    s sVar13 = (s) nVar12;
                    strJ = b3.i.j(-1915654750, R.string.charity_pickup_unavailable, sVar13, sVar13, false);
                } else {
                    s sVar14 = (s) nVar12;
                    sVar14.a0(-1915550652);
                    if (p0.A(mv.d.l(charityItem2).getIntervalStart())) {
                        sVar14.a0(-1585810616);
                        strJ = o30.f0.T(R.string.charity_item_pickup_time_today, new Object[]{p0.u((Context) sVar14.j(v0.f7390b), mv.d.l(charityItem2))}, sVar14);
                        sVar14.q(false);
                    } else if (p0.C(mv.d.l(charityItem2).getIntervalStart())) {
                        sVar14.a0(-1585802613);
                        strJ = o30.f0.T(R.string.charity_item_pickup_time_tomorrow, new Object[]{p0.u((Context) sVar14.j(v0.f7390b), mv.d.l(charityItem2))}, sVar14);
                        sVar14.q(false);
                    } else {
                        sVar14.a0(-1585795483);
                        d3 d3Var = v0.f7390b;
                        strJ = o30.f0.T(R.string.charity_item_pickup_time_date, new Object[]{p0.e((Context) sVar14.j(d3Var), mv.d.l(charityItem2).getIntervalStart()), p0.u((Context) sVar14.j(d3Var), mv.d.l(charityItem2))}, sVar14);
                        sVar14.q(false);
                    }
                    sVar14.q(false);
                }
                String str9 = strJ;
                String streetAddress = charityItem2.getPickupLocation().getAddress().getStreetAddress();
                if (streetAddress == null) {
                    streetAddress = "";
                }
                String str10 = streetAddress;
                s sVar15 = (s) nVar12;
                boolean zF7 = sVar15.f(function17) | sVar15.h(charityItem2);
                Object objM12 = sVar15.M();
                if (zF7 || objM12 == fVar) {
                    objM12 = new ki.c(function17, charityItem2, i13);
                    sVar15.k0(objM12);
                }
                Function0 function06 = (Function0) objM12;
                boolean zF8 = sVar15.f(function18) | sVar15.f(phoneNumber);
                Object objM13 = sVar15.M();
                if (zF8 || objM13 == fVar) {
                    objM13 = new iq.e(function18, phoneNumber, 1);
                    sVar15.k0(objM13);
                }
                ki.j.g(tVarD7, str9, str10, phoneNumber, function06, (Function0) objM13, sVar15, 6);
                return Unit.f26487a;
            case 13:
                return a(obj, obj2, obj3);
            case 14:
                return b(obj, obj2, obj3);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return c(obj, obj2, obj3);
            case 16:
                return d(obj, obj2, obj3);
            case 17:
                return e(obj, obj2, obj3);
            case 18:
                return f(obj, obj2, obj3);
            case 19:
                return g(obj, obj2, obj3);
            case 20:
                return h(obj, obj2, obj3);
            case 21:
                AddEmailFragment addEmailFragment = (AddEmailFragment) obj6;
                b1 b1Var4 = (b1) obj7;
                h1 h1Var = (h1) obj5;
                m3.n nVar13 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                t tVarD8 = m2.d(uVar.a(d2.c.A(qVar, 16, 24), b4.d.f5690h), 1.0f);
                l2.f fVarB = l2.g.b(20);
                b2 b2Var = g3.p.f19253a;
                g3.o oVarA = g3.p.a(lv.s.f28217b, 0L, 0L, 0L, nVar13, 14);
                s sVar16 = (s) nVar13;
                boolean zH6 = sVar16.h(addEmailFragment);
                Object objM14 = sVar16.M();
                if (zH6 || objM14 == fVar) {
                    objM14 = new lw.o(addEmailFragment, b1Var4, h1Var, 22);
                    sVar16.k0(objM14);
                }
                s0.a((Function0) objM14, tVarD8, false, fVarB, oVarA, null, null, null, null, to.g.f40370b, sVar16, 805306368, 484);
                return Unit.f26487a;
            case 22:
                return i(obj, obj2, obj3);
            case 23:
                return j(obj, obj2, obj3);
            case 24:
                return k(obj, obj2, obj3);
            case 25:
                return l(obj, obj2, obj3);
            case 26:
                return m(obj, obj2, obj3);
            case 27:
                return n(obj, obj2, obj3);
            case 28:
                x80.i iVar = (x80.i) obj7;
                d90.e eVar = (d90.e) obj5;
                if (obj6 != x80.k.l) {
                    a90.g.a(iVar.f44052b, obj6, eVar.f14781a);
                }
                return Unit.f26487a;
            default:
                pi.m mVar = (pi.m) obj7;
                f0 f0Var2 = (f0) obj6;
                b1 b1Var5 = (b1) obj5;
                z1 z1Var2 = (z1) obj;
                m3.n nVar14 = (m3.n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                z1Var2.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= ((s) nVar14).f(z1Var2) ? 4 : 2;
                }
                s sVar17 = (s) nVar14;
                if (sVar17.R(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    t tVarJ2 = v1.n.j(qVar, lv.s.J, r0Var);
                    boolean zH7 = sVar17.h(f0Var2);
                    Object objM15 = sVar17.M();
                    if (zH7 || objM15 == fVar) {
                        objM15 = new dq.g(f0Var2, 23);
                        sVar17.k0(objM15);
                    }
                    Function0 function07 = (Function0) objM15;
                    boolean zF9 = sVar17.f(b1Var5);
                    Object objM16 = sVar17.M();
                    if (zF9 || objM16 == fVar) {
                        objM16 = new pi.b(b1Var5, 28);
                        sVar17.k0(objM16);
                    }
                    y9.w.c(tVarJ2, mVar, function07, z1Var2, (Function0) objM16, sVar17, ((iIntValue11 << 9) & 7168) | 6);
                } else {
                    sVar17.U();
                }
                return Unit.f26487a;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i11) {
        this.f4527a = i11;
        this.f4528b = obj;
        this.f4529c = obj2;
        this.f4530d = obj3;
    }
}

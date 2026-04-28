package pm;

import android.app.RemoteAction;
import android.content.ClipData;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.o0;
import b4.q;
import b4.t;
import bg.k0;
import c5.r1;
import com.app.tgtg.R;
import com.app.tgtg.feature.catering.ui.CateringItemDetailsActivity;
import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.app.tgtg.feature.locationpicker.newlocationpicker.NewLocationPicker;
import com.app.tgtg.feature.logincharity.ui.LoginCharityActivity;
import com.app.tgtg.feature.main.fragments.browse.map.bottomSheet.MapBottomSheet;
import com.app.tgtg.feature.main.fragments.delivery.basket.ui.ParcelBasketActivity;
import com.app.tgtg.feature.postpurchase.email.AddEmailFragment;
import com.app.tgtg.feature.postpurchase.notification.AddReminderFragment;
import com.app.tgtg.feature.postpurchase.phone.AddPhoneNumberFragment;
import com.app.tgtg.feature.postpurchase.specialrewards.SpecialRewardCelebrationFragment;
import com.app.tgtg.feature.postpurchase.success.purchase.ui.PurchaseSuccessFragment;
import com.app.tgtg.feature.tabprofile.c2creferral.ui.InviteFriendsActivity;
import com.app.tgtg.feature.tabprofile.impact.co2esaved.Co2eSavedActivity;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import com.app.tgtg.model.remote.voucher.VoucherMode;
import d2.b2;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.u;
import f2.c0;
import g3.d9;
import g3.g7;
import g3.o;
import g3.p;
import g3.q4;
import g3.r9;
import g3.u7;
import g3.x5;
import g3.z4;
import g9.t0;
import i4.g0;
import i4.r0;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import lv.v;
import m2.d1;
import m3.b1;
import m3.h1;
import m3.k1;
import m3.m;
import m3.n;
import m3.s;
import nk.s0;
import no.n0;
import o00.x0;
import o30.e0;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import rk.a0;
import s1.z;
import w2.e1;
import w2.s1;
import z4.u0;
import zendesk.ui.android.conversation.quickreply.QuickReplyView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35523b;

    public /* synthetic */ m(Object obj, int i11) {
        this.f35522a = i11;
        this.f35523b = obj;
    }

    private final Object a(Object obj, Object obj2) {
        n0 n0Var = (n0) this.f35523b;
        m3.n nVar = (m3.n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = m3.i.w(Boolean.TRUE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            int i11 = yn.r.$EnumSwitchMapping$0[n0Var.ordinal()];
            if (i11 == 1) {
                sVar.a0(-1952005432);
                sVar.q(false);
            } else if (i11 == 2) {
                sVar.a0(-1952003289);
                oo.a.K(b1Var, sVar, 6);
                sVar.q(false);
            } else if (i11 == 3) {
                sVar.a0(-1952000059);
                oo.a.x(b1Var, sVar, 6);
                sVar.q(false);
            } else {
                if (i11 != 4) {
                    throw e0.f.v(sVar, -1952007060, false);
                }
                sVar.a0(-1951997185);
                oo.a.U(b1Var, sVar, 6);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z11;
        boolean z12;
        final h1 h1Var;
        b4.t tVar;
        String string;
        int i11 = this.f35522a;
        int i12 = 5;
        int i13 = 27;
        d2.u uVar = d2.u.f13938a;
        r0 r0Var = g0.f23254b;
        int i14 = 9;
        m3.f fVar = m3.m.f29332a;
        Object obj3 = this.f35523b;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                int i15 = MapBottomSheet.f9095y;
                ((MapBottomSheet) obj3).a((m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 1:
                ItemViewActivity itemViewActivity = (ItemViewActivity) obj3;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = ItemViewActivity.f9011k;
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b1 b1VarN = m3.i.n(itemViewActivity.E().f37189d, sVar, 0);
                    Object objM = sVar.M();
                    Object obj4 = objM;
                    if (objM == fVar) {
                        g7 g7Var = new g7();
                        sVar.k0(g7Var);
                        obj4 = g7Var;
                    }
                    g7 g7Var2 = (g7) obj4;
                    Object objM2 = sVar.M();
                    Object obj5 = objM2;
                    if (objM2 == fVar) {
                        k1 k1VarW = m3.i.w(Boolean.FALSE);
                        sVar.k0(k1VarW);
                        obj5 = k1VarW;
                    }
                    b1 b1Var = (b1) obj5;
                    Object[] objArr = new Object[0];
                    ub.a aVar = c0.f17087x;
                    Object objM3 = sVar.M();
                    Object obj6 = objM3;
                    if (objM3 == fVar) {
                        q60.a aVar2 = new q60.a(15);
                        sVar.k0(aVar2);
                        obj6 = aVar2;
                    }
                    c0 c0Var = (c0) y3.j.d(objArr, aVar, (Function0) obj6, sVar, MLKEMEngine.KyberPolyBytes);
                    s0 s0Var = (s0) b1VarN.getValue();
                    boolean zF = sVar.f(b1VarN) | sVar.h(itemViewActivity);
                    Object objM4 = sVar.M();
                    x70.c cVar = null;
                    Object obj7 = objM4;
                    if (zF || objM4 == fVar) {
                        is.h hVar = new is.h(itemViewActivity, b1VarN, cVar, 26);
                        sVar.k0(hVar);
                        obj7 = hVar;
                    }
                    m3.i.h(s0Var, (Function2) obj7, sVar);
                    Unit unit = Unit.f26487a;
                    boolean zH = sVar.h(itemViewActivity);
                    Object objM5 = sVar.M();
                    if (zH || objM5 == fVar) {
                        nk.j jVar = new nk.j(itemViewActivity, g7Var2, b1Var, cVar, 13);
                        sVar.k0(jVar);
                        objM5 = jVar;
                    }
                    m3.i.h(unit, (Function2) objM5, sVar);
                    if (((Boolean) b1Var.getValue()).booleanValue()) {
                        sVar.a0(183371096);
                        m1.a aVar3 = itemViewActivity.E().f37190e;
                        Object objM6 = sVar.M();
                        Object obj8 = objM6;
                        if (objM6 == fVar) {
                            pi.b bVar = new pi.b(b1Var, 1);
                            sVar.k0(bVar);
                            obj8 = bVar;
                        }
                        rk.e.z(aVar3, (Function0) obj8, sVar, 48);
                        sVar.q(false);
                    } else {
                        sVar.a0(183597892);
                        sVar.q(false);
                    }
                    s0 s0Var2 = (s0) b1VarN.getValue();
                    Object objM7 = sVar.M();
                    Object obj9 = objM7;
                    if (objM7 == fVar) {
                        qb.r rVar = new qb.r(8);
                        sVar.k0(rVar);
                        obj9 = rVar;
                    }
                    Function1 function1 = (Function1) obj9;
                    Object objM8 = sVar.M();
                    Object obj10 = objM8;
                    if (objM8 == fVar) {
                        qb.r rVar2 = new qb.r(i14);
                        sVar.k0(rVar2);
                        obj10 = rVar2;
                    }
                    s1.i.a(s0Var2, null, function1, null, null, (Function1) obj10, u3.e.e(1073877298, sVar, new cn.v(itemViewActivity, g7Var2, c0Var, 3)), sVar, 1769856, 26);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            case 2:
                ((Integer) obj2).getClass();
                m3.s sVar2 = (m3.s) ((m3.n) obj);
                sVar2.a0(666084174);
                String str = ((p2.d) obj3).f34131b;
                sVar2.q(false);
                return str;
            case 3:
                ((Integer) obj2).getClass();
                m3.s sVar3 = (m3.s) ((m3.n) obj);
                sVar3.a0(950061013);
                String strValueOf = String.valueOf(((TextClassification) obj3).getLabel());
                sVar3.q(false);
                return strValueOf;
            case 4:
                ((Integer) obj2).intValue();
                m3.s sVar4 = (m3.s) ((m3.n) obj);
                sVar4.a0(-1376593684);
                String string2 = ((RemoteAction) obj3).getTitle().toString();
                sVar4.q(false);
                return string2;
            case 5:
                InviteFriendsActivity inviteFriendsActivity = (InviteFriendsActivity) obj3;
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = InviteFriendsActivity.f9301j;
                int i18 = 1;
                m3.s sVar5 = (m3.s) nVar2;
                if (sVar5.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    lv.w.a(false, u3.e.e(1786183787, sVar5, new a0(i18, inviteFriendsActivity, m3.i.n(inviteFriendsActivity.C().f38161c, sVar5, 0))), sVar5, MLKEMEngine.KyberPolyBytes);
                } else {
                    sVar5.U();
                }
                return Unit.f26487a;
            case 6:
                return QuickReplyView.addQuickReplyOption$lambda$5$lambda$4$lambda$3((QuickReplyView) obj3, (String) obj, (String) obj2);
            case 7:
                ((Integer) obj2).getClass();
                si.a.b((Pair) obj3, (m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 8:
                ((Integer) obj2).getClass();
                y9.w.g((List) obj3, (m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 9:
                ((Integer) obj2).getClass();
                ((t1.g0) obj3).a((m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 10:
                ((Integer) obj2).getClass();
                e0.h((nk.d) obj3, (m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 11:
                ((Integer) obj2).getClass();
                f0.q((nk.e) obj3, (m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 12:
                AddEmailFragment addEmailFragment = (AddEmailFragment) obj3;
                m3.n nVar3 = (m3.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                m3.s sVar6 = (m3.s) nVar3;
                if (sVar6.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objM9 = sVar6.M();
                    if (objM9 == fVar) {
                        objM9 = m3.i.w("");
                        sVar6.k0(objM9);
                    }
                    final b1 b1Var2 = (b1) objM9;
                    Object objM10 = sVar6.M();
                    if (objM10 == fVar) {
                        z11 = false;
                        objM10 = w.a0.s(0, sVar6);
                    } else {
                        z11 = false;
                    }
                    final h1 h1Var2 = (h1) objM10;
                    b4.q qVar = b4.q.f5711a;
                    b4.t tVarJ = v1.n.j(m2.c(m2.d(qVar, 1.0f), 1.0f), lv.s.J, r0Var);
                    u0 u0VarD = d2.p.d(b4.d.f5683a, z11);
                    int iHashCode = Long.hashCode(sVar6.T);
                    u3.i iVarL = sVar6.l();
                    b4.t tVarC = b4.a.c(tVarJ, sVar6);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(hVar2);
                    } else {
                        sVar6.n0();
                    }
                    b5.g gVar = b5.i.f5843f;
                    m3.i.C(u0VarD, gVar, sVar6);
                    b5.g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL, gVar2, sVar6);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b5.g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar6, numValueOf, gVar3);
                    b5.d dVar = b5.i.f5845h;
                    m3.i.z(sVar6, dVar);
                    b5.g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC, gVar4, sVar6);
                    float f11 = 24;
                    b4.t tVarT = m2.t(m2.d(d2.c.z(qVar, f11), 1.0f), 3);
                    d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar6, 0);
                    int iHashCode2 = Long.hashCode(sVar6.T);
                    u3.i iVarL2 = sVar6.l();
                    b4.t tVarC2 = b4.a.c(tVarT, sVar6);
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(hVar2);
                    } else {
                        sVar6.n0();
                    }
                    m3.i.C(yVarA, gVar, sVar6);
                    m3.i.C(iVarL2, gVar2, sVar6);
                    w.a0.y(iHashCode2, sVar6, gVar3, sVar6, dVar);
                    m3.i.C(tVarC2, gVar4, sVar6);
                    v1.n.d(x0.z(R.drawable.post_purchase_mail_icon, sVar6, 0), null, null, null, null, 0.0f, null, sVar6, 56, 124);
                    b4.t tVarD = d2.c.D(qVar, 0.0f, f11, 0.0f, 0.0f, 13);
                    String strU = f0.U(sVar6, R.string.post_purchase_add_email_title);
                    m5.u0 u0Var = lv.v.f28270i;
                    long j9 = lv.s.C;
                    r9.d(strU, tVarD, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar6, 432, 12582912, 131064);
                    r9.d(f0.U(sVar6, R.string.post_purchase_add_email_description), d2.c.D(qVar, 0.0f, 8, 0.0f, 0.0f, 13), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar6, 432, 12582912, 131064);
                    b4.t tVarD2 = d2.c.D(m2.d(qVar, 1.0f), 0.0f, f11, 0.0f, 0.0f, 13);
                    String str2 = (String) b1Var2.getValue();
                    l2.f fVarB = l2.g.b(12);
                    q4 q4Var = q4.f19349a;
                    d9 d9VarD = q4.d(j9, j9, j9, 0L, lv.s.f28231k, 0L, 0L, sVar6, 2147460863);
                    final int i19 = 0;
                    d1 d1Var = new d1(6, 0, AppConstants.RESULT_CODE_ORDER_CANCELLED);
                    boolean z13 = h1Var2.h() != 0;
                    Object objM11 = sVar6.M();
                    if (objM11 == fVar) {
                        objM11 = new Function1() { // from class: to.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                int i21 = i19;
                                String str3 = (String) obj11;
                                str3.getClass();
                                switch (i21) {
                                    case 0:
                                        b1Var2.setValue(str3);
                                        h1Var2.i(0);
                                        break;
                                    case 1:
                                        b1Var2.setValue(StringsKt.N(str3, "+"));
                                        h1Var2.i(0);
                                        break;
                                    default:
                                        b1Var2.setValue(str3);
                                        h1Var2.i(0);
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar6.k0(objM11);
                    }
                    z4.a(str2, (Function1) objM11, tVarD2, false, false, null, null, to.g.f40369a, null, u3.e.e(-616162010, sVar6, new Function2() { // from class: to.b
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj11, Object obj12) {
                            switch (i19) {
                                case 0:
                                    n nVar4 = (n) obj11;
                                    int iIntValue4 = ((Integer) obj12).intValue();
                                    s sVar7 = (s) nVar4;
                                    if (sVar7.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        h1 h1Var3 = h1Var2;
                                        if (h1Var3.h() != 0) {
                                            sVar7.a0(607878211);
                                            r9.d(f0.U(sVar7, h1Var3.h()), null, lv.s.f28231k, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28277q, sVar7, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                                            sVar7.q(false);
                                        } else {
                                            sVar7.a0(608151228);
                                            sVar7.q(false);
                                        }
                                    } else {
                                        sVar7.U();
                                    }
                                    break;
                                default:
                                    n nVar5 = (n) obj11;
                                    int iIntValue5 = ((Integer) obj12).intValue();
                                    s sVar8 = (s) nVar5;
                                    if (sVar8.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        h1 h1Var4 = h1Var2;
                                        if (h1Var4.h() != 0) {
                                            sVar8.a0(-1051854762);
                                            r9.d(f0.U(sVar8, h1Var4.h()), null, lv.s.f28231k, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28277q, sVar8, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                                            sVar8.q(false);
                                        } else {
                                            sVar8.a0(-1051562401);
                                            sVar8.q(false);
                                        }
                                    } else {
                                        sVar8.U();
                                    }
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    }), z13, null, d1Var, null, true, 0, 0, fVarB, d9VarD, sVar6, 12583344, 12779904, 1920888);
                    sVar6.q(true);
                    boolean z14 = ((String) b1Var2.getValue()).length() == 0;
                    b4.k kVar = b4.d.f5690h;
                    s1.y.d(z14, uVar.a(qVar, kVar), null, null, null, u3.e.e(-1733195957, sVar6, new a3.m2(addEmailFragment, 27)), sVar6, 196608, 28);
                    s1.y.d(((String) b1Var2.getValue()).length() > 0, uVar.a(qVar, kVar), null, null, null, u3.e.e(-1012494604, sVar6, new ap.e(addEmailFragment, b1Var2, h1Var2, 21)), sVar6, 196608, 28);
                    sVar6.q(true);
                } else {
                    sVar6.U();
                }
                return Unit.f26487a;
            case 13:
                CateringItemDetailsActivity cateringItemDetailsActivity = (CateringItemDetailsActivity) obj3;
                String str3 = (String) obj;
                String string3 = (String) obj2;
                int i21 = CateringItemDetailsActivity.f8972o;
                uh.g gVarF = cateringItemDetailsActivity.F();
                ct.a aVar4 = ct.a.FAQ_ITEM_MANUFACTURER;
                Integer numValueOf2 = Integer.valueOf(R.string.item_view_description_tab_text);
                if (string3 == null) {
                    string3 = cateringItemDetailsActivity.getString(R.string.item_view_description_tab_text);
                    string3.getClass();
                }
                aVar4.getClass();
                gVarF.f41157g.b(str3, aVar4, numValueOf2, true, string3);
                return Unit.f26487a;
            case 14:
                ParcelBasketActivity parcelBasketActivity = (ParcelBasketActivity) obj3;
                m3.n nVar4 = (m3.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i22 = ParcelBasketActivity.f9111k;
                m3.s sVar7 = (m3.s) nVar4;
                if (sVar7.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    na0.a.O(null, parcelBasketActivity, parcelBasketActivity, sVar7, 0);
                } else {
                    sVar7.U();
                }
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                final AddReminderFragment addReminderFragment = (AddReminderFragment) obj3;
                m3.n nVar5 = (m3.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                m3.s sVar8 = (m3.s) nVar5;
                if (sVar8.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    b1 b1VarN2 = m3.i.n(addReminderFragment.o().f41483f, sVar8, 0);
                    b1 b1VarN3 = m3.i.n(addReminderFragment.o().f41485h, sVar8, 0);
                    b1 b1VarN4 = m3.i.n(addReminderFragment.o().f41487j, sVar8, 0);
                    b4.q qVar2 = b4.q.f5711a;
                    b4.t tVarJ2 = v1.n.j(m2.c(m2.d(qVar2, 1.0f), 1.0f), lv.s.J, r0Var);
                    u0 u0VarD2 = d2.p.d(b4.d.f5683a, false);
                    int iHashCode3 = Long.hashCode(sVar8.T);
                    u3.i iVarL3 = sVar8.l();
                    b4.t tVarC3 = b4.a.c(tVarJ2, sVar8);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar8.e0();
                    if (sVar8.S) {
                        sVar8.k(hVar3);
                    } else {
                        sVar8.n0();
                    }
                    b5.g gVar5 = b5.i.f5843f;
                    m3.i.C(u0VarD2, gVar5, sVar8);
                    b5.g gVar6 = b5.i.f5842e;
                    m3.i.C(iVarL3, gVar6, sVar8);
                    Integer numValueOf3 = Integer.valueOf(iHashCode3);
                    b5.g gVar7 = b5.i.f5844g;
                    m3.i.v(sVar8, numValueOf3, gVar7);
                    b5.d dVar2 = b5.i.f5845h;
                    m3.i.z(sVar8, dVar2);
                    b5.g gVar8 = b5.i.f5841d;
                    m3.i.C(tVarC3, gVar8, sVar8);
                    b4.t tVarT2 = m2.t(m2.d(qVar2, 1.0f), 3);
                    d2.y yVarA2 = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar8, 0);
                    int iHashCode4 = Long.hashCode(sVar8.T);
                    u3.i iVarL4 = sVar8.l();
                    b4.t tVarC4 = b4.a.c(tVarT2, sVar8);
                    sVar8.e0();
                    if (sVar8.S) {
                        sVar8.k(hVar3);
                    } else {
                        sVar8.n0();
                    }
                    m3.i.C(yVarA2, gVar5, sVar8);
                    m3.i.C(iVarL4, gVar6, sVar8);
                    w.a0.y(iHashCode4, sVar8, gVar7, sVar8, dVar2);
                    m3.i.C(tVarC4, gVar8, sVar8);
                    v1.n.d(x0.z(R.drawable.collection_reminder_notification_icon, sVar8, 0), null, d2.c.z(qVar2, 24), null, null, 0.0f, null, sVar8, 440, 120);
                    boolean zBooleanValue = ((Boolean) b1VarN3.getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) b1VarN4.getValue()).booleanValue();
                    boolean zH2 = sVar8.h(addReminderFragment);
                    Object objM12 = sVar8.M();
                    if (zH2 || objM12 == fVar) {
                        final int i23 = 0;
                        objM12 = new Function1() { // from class: uo.b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                int i24 = i23;
                                AddReminderFragment addReminderFragment2 = addReminderFragment;
                                ((Boolean) obj11).getClass();
                                switch (i24) {
                                    case 0:
                                        if (Build.VERSION.SDK_INT < 33 || ft.c.E() || NotificationManagerCompat.from(addReminderFragment2.requireContext()).areNotificationsEnabled()) {
                                            k0 k0Var = new k0(addReminderFragment2.requireActivity());
                                            k0Var.f6171b = null;
                                            k0Var.a(R.string.notification_settings_push_notifications_body);
                                            k0Var.c(R.string.notification_settings_push_notifications_confirm_button);
                                            k0Var.l = new a(addReminderFragment2, 3);
                                            k0Var.b(R.string.notification_settings_push_notifications_cancel_button);
                                            k0Var.f6182n = new a(addReminderFragment2, 4);
                                            k0Var.f6183o = new a(addReminderFragment2, 5);
                                            k0Var.f();
                                        } else {
                                            ActivityResultLauncher activityResultLauncher = addReminderFragment2.f9209f;
                                            if (activityResultLauncher == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("requestPermissionLauncher");
                                                activityResultLauncher = null;
                                            }
                                            activityResultLauncher.a(new String[]{"android.permission.POST_NOTIFICATIONS"}, null);
                                        }
                                        break;
                                    default:
                                        o0 o0VarRequireActivity = addReminderFragment2.requireActivity();
                                        o0VarRequireActivity.getClass();
                                        ActivityResultLauncher activityResultLauncher2 = addReminderFragment2.f9209f;
                                        if (activityResultLauncher2 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("requestPermissionLauncher");
                                            activityResultLauncher2 = null;
                                        }
                                        mv.d.c(o0VarRequireActivity, activityResultLauncher2, null, new a(addReminderFragment2, 2));
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar8.k0(objM12);
                    }
                    Function1 function12 = (Function1) objM12;
                    boolean zH3 = sVar8.h(addReminderFragment);
                    Object objM13 = sVar8.M();
                    if (zH3 || objM13 == fVar) {
                        z12 = true;
                        final boolean z15 = true ? 1 : 0;
                        objM13 = new Function1() { // from class: uo.b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                int i24 = z15;
                                AddReminderFragment addReminderFragment2 = addReminderFragment;
                                ((Boolean) obj11).getClass();
                                switch (i24) {
                                    case 0:
                                        if (Build.VERSION.SDK_INT < 33 || ft.c.E() || NotificationManagerCompat.from(addReminderFragment2.requireContext()).areNotificationsEnabled()) {
                                            k0 k0Var = new k0(addReminderFragment2.requireActivity());
                                            k0Var.f6171b = null;
                                            k0Var.a(R.string.notification_settings_push_notifications_body);
                                            k0Var.c(R.string.notification_settings_push_notifications_confirm_button);
                                            k0Var.l = new a(addReminderFragment2, 3);
                                            k0Var.b(R.string.notification_settings_push_notifications_cancel_button);
                                            k0Var.f6182n = new a(addReminderFragment2, 4);
                                            k0Var.f6183o = new a(addReminderFragment2, 5);
                                            k0Var.f();
                                        } else {
                                            ActivityResultLauncher activityResultLauncher = addReminderFragment2.f9209f;
                                            if (activityResultLauncher == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("requestPermissionLauncher");
                                                activityResultLauncher = null;
                                            }
                                            activityResultLauncher.a(new String[]{"android.permission.POST_NOTIFICATIONS"}, null);
                                        }
                                        break;
                                    default:
                                        o0 o0VarRequireActivity = addReminderFragment2.requireActivity();
                                        o0VarRequireActivity.getClass();
                                        ActivityResultLauncher activityResultLauncher2 = addReminderFragment2.f9209f;
                                        if (activityResultLauncher2 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("requestPermissionLauncher");
                                            activityResultLauncher2 = null;
                                        }
                                        mv.d.c(o0VarRequireActivity, activityResultLauncher2, null, new a(addReminderFragment2, 2));
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar8.k0(objM13);
                    } else {
                        z12 = true;
                    }
                    oo.a.l(zBooleanValue, zBooleanValue2, function12, (Function1) objM13, sVar8, 0);
                    sVar8.q(z12);
                    boolean z16 = !((Boolean) b1VarN2.getValue()).booleanValue();
                    b4.k kVar2 = b4.d.f5690h;
                    b4.t tVarA = uVar.a(qVar2, kVar2);
                    final int i24 = 0;
                    s1.y.d(z16, tVarA, null, null, null, u3.e.e(1990708836, sVar8, new i80.n() { // from class: uo.c
                        @Override // i80.n
                        public final Object invoke(Object obj11, Object obj12, Object obj13) {
                            int i25 = i24;
                            m3.f fVar2 = m.f29332a;
                            AddReminderFragment addReminderFragment2 = addReminderFragment;
                            u uVar2 = u.f13938a;
                            switch (i25) {
                                case 0:
                                    ((Integer) obj13).getClass();
                                    ((z) obj11).getClass();
                                    t tVarA2 = uVar2.a(d2.c.D(q.f5711a, 0.0f, 0.0f, 0.0f, 24, 7), b4.d.f5690h);
                                    s sVar9 = (s) ((n) obj12);
                                    boolean zH4 = sVar9.h(addReminderFragment2);
                                    Object objM14 = sVar9.M();
                                    if (zH4 || objM14 == fVar2) {
                                        objM14 = new a(addReminderFragment2, 1);
                                        sVar9.k0(objM14);
                                    }
                                    r9.d(f0.U(sVar9, R.string.post_purchase_add_reminder_skip), androidx.compose.foundation.b.c(tVarA2, false, null, null, (Function0) objM14, 15), lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28281u, sVar9, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                                    break;
                                default:
                                    n nVar6 = (n) obj12;
                                    ((Integer) obj13).getClass();
                                    ((z) obj11).getClass();
                                    t tVarD3 = m2.d(uVar2.a(d2.c.A(q.f5711a, 16, 24), b4.d.f5690h), 1.0f);
                                    l2.f fVarB2 = l2.g.b(20);
                                    b2 b2Var = p.f19253a;
                                    o oVarA = p.a(lv.s.f28217b, 0L, 0L, 0L, nVar6, 14);
                                    s sVar10 = (s) nVar6;
                                    boolean zH5 = sVar10.h(addReminderFragment2);
                                    Object objM15 = sVar10.M();
                                    if (zH5 || objM15 == fVar2) {
                                        objM15 = new a(addReminderFragment2, 0);
                                        sVar10.k0(objM15);
                                    }
                                    g3.s0.a((Function0) objM15, tVarD3, false, fVarB2, oVarA, null, null, null, null, i.f41488a, sVar10, 805306368, 484);
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    }), sVar8, 196608, 28);
                    final int i25 = 1;
                    s1.y.d(((Boolean) b1VarN2.getValue()).booleanValue(), uVar.a(qVar2, kVar2), null, null, null, u3.e.e(-1379909285, sVar8, new i80.n() { // from class: uo.c
                        @Override // i80.n
                        public final Object invoke(Object obj11, Object obj12, Object obj13) {
                            int i252 = i25;
                            m3.f fVar2 = m.f29332a;
                            AddReminderFragment addReminderFragment2 = addReminderFragment;
                            u uVar2 = u.f13938a;
                            switch (i252) {
                                case 0:
                                    ((Integer) obj13).getClass();
                                    ((z) obj11).getClass();
                                    t tVarA2 = uVar2.a(d2.c.D(q.f5711a, 0.0f, 0.0f, 0.0f, 24, 7), b4.d.f5690h);
                                    s sVar9 = (s) ((n) obj12);
                                    boolean zH4 = sVar9.h(addReminderFragment2);
                                    Object objM14 = sVar9.M();
                                    if (zH4 || objM14 == fVar2) {
                                        objM14 = new a(addReminderFragment2, 1);
                                        sVar9.k0(objM14);
                                    }
                                    r9.d(f0.U(sVar9, R.string.post_purchase_add_reminder_skip), androidx.compose.foundation.b.c(tVarA2, false, null, null, (Function0) objM14, 15), lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28281u, sVar9, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                                    break;
                                default:
                                    n nVar6 = (n) obj12;
                                    ((Integer) obj13).getClass();
                                    ((z) obj11).getClass();
                                    t tVarD3 = m2.d(uVar2.a(d2.c.A(q.f5711a, 16, 24), b4.d.f5690h), 1.0f);
                                    l2.f fVarB2 = l2.g.b(20);
                                    b2 b2Var = p.f19253a;
                                    o oVarA = p.a(lv.s.f28217b, 0L, 0L, 0L, nVar6, 14);
                                    s sVar10 = (s) nVar6;
                                    boolean zH5 = sVar10.h(addReminderFragment2);
                                    Object objM15 = sVar10.M();
                                    if (zH5 || objM15 == fVar2) {
                                        objM15 = new a(addReminderFragment2, 0);
                                        sVar10.k0(objM15);
                                    }
                                    g3.s0.a((Function0) objM15, tVarD3, false, fVarB2, oVarA, null, null, null, null, i.f41488a, sVar10, 805306368, 484);
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    }), sVar8, 196608, 28);
                    sVar8.q(true);
                } else {
                    sVar8.U();
                }
                return Unit.f26487a;
            case 16:
                Co2eSavedActivity co2eSavedActivity = (Co2eSavedActivity) obj3;
                m3.n nVar6 = (m3.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i26 = Co2eSavedActivity.f9306g;
                m3.s sVar9 = (m3.s) nVar6;
                if (sVar9.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    g9.f0 f0VarI = a.a.I(new t0[0], sVar9);
                    b4.t tVarJ3 = v1.n.j(m2.f13850c, lv.s.J, r0Var);
                    boolean zH4 = sVar9.h(co2eSavedActivity);
                    Object objM14 = sVar9.M();
                    if (zH4 || objM14 == fVar) {
                        objM14 = new sg.c(co2eSavedActivity, 11);
                        sVar9.k0(objM14);
                    }
                    b0.z.h(f0VarI, "co2e_saved_overview", tVarJ3, null, null, null, null, null, null, (Function1) objM14, sVar9, MLKEMEngine.KyberPolyBytes, 1016);
                } else {
                    sVar9.U();
                }
                return Unit.f26487a;
            case 17:
                ((Integer) obj2).getClass();
                us.a.h((VoucherMode) obj3, (m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 18:
                t5.a aVar5 = (t5.a) obj3;
                m3.n nVar7 = (m3.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                m3.s sVar10 = (m3.s) nVar7;
                if (sVar10.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    String strU2 = f0.U(sVar10, R.string.voucher_title);
                    boolean zH5 = sVar10.h(aVar5);
                    Object objM15 = sVar10.M();
                    if (zH5 || objM15 == fVar) {
                        objM15 = new us.b(i12, aVar5);
                        sVar10.k0(objM15);
                    }
                    cg.j.s(strU2, null, 0L, 0L, (Function0) objM15, null, null, null, sVar10, 0, 238);
                } else {
                    sVar10.U();
                }
                return Unit.f26487a;
            case 19:
                ((Integer) obj2).getClass();
                m0.c.S((BasketItem) obj3, (m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 20:
                ((Integer) obj2).getClass();
                na0.a.M((u7) obj3, (m3.n) obj, m3.i.F(9));
                return Unit.f26487a;
            case 21:
                AddPhoneNumberFragment addPhoneNumberFragment = (AddPhoneNumberFragment) obj3;
                m3.n nVar8 = (m3.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                m3.s sVar11 = (m3.s) nVar8;
                if (sVar11.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    Object objM16 = sVar11.M();
                    if (objM16 == fVar) {
                        String phoneCountryCodeSuggestion = ((vo.e) addPhoneNumberFragment.f9218g.getValue()).f42501a.n().getPhoneCountryCodeSuggestion();
                        phoneCountryCodeSuggestion.getClass();
                        objM16 = m3.i.w(phoneCountryCodeSuggestion);
                        sVar11.k0(objM16);
                    }
                    final b1 b1Var3 = (b1) objM16;
                    Object objM17 = sVar11.M();
                    if (objM17 == fVar) {
                        objM17 = m3.i.w("");
                        sVar11.k0(objM17);
                    }
                    final b1 b1Var4 = (b1) objM17;
                    Object objM18 = sVar11.M();
                    if (objM18 == fVar) {
                        objM18 = w.a0.s(0, sVar11);
                    }
                    h1 h1Var3 = (h1) objM18;
                    b4.q qVar3 = b4.q.f5711a;
                    b4.t tVarJ4 = v1.n.j(m2.c(m2.d(qVar3, 1.0f), 1.0f), lv.s.J, r0Var);
                    u0 u0VarD3 = d2.p.d(b4.d.f5683a, false);
                    int iHashCode5 = Long.hashCode(sVar11.T);
                    u3.i iVarL5 = sVar11.l();
                    b4.t tVarC5 = b4.a.c(tVarJ4, sVar11);
                    b5.j.R.getClass();
                    b5.h hVar4 = b5.i.f5839b;
                    sVar11.e0();
                    if (sVar11.S) {
                        sVar11.k(hVar4);
                    } else {
                        sVar11.n0();
                    }
                    b5.g gVar9 = b5.i.f5843f;
                    m3.i.C(u0VarD3, gVar9, sVar11);
                    b5.g gVar10 = b5.i.f5842e;
                    m3.i.C(iVarL5, gVar10, sVar11);
                    Integer numValueOf4 = Integer.valueOf(iHashCode5);
                    b5.g gVar11 = b5.i.f5844g;
                    m3.i.v(sVar11, numValueOf4, gVar11);
                    b5.d dVar3 = b5.i.f5845h;
                    m3.i.z(sVar11, dVar3);
                    b5.g gVar12 = b5.i.f5841d;
                    m3.i.C(tVarC5, gVar12, sVar11);
                    float f12 = 24;
                    b4.t tVarT3 = m2.t(m2.d(d2.c.z(qVar3, f12), 1.0f), 3);
                    d2.y yVarA3 = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar11, 0);
                    int iHashCode6 = Long.hashCode(sVar11.T);
                    u3.i iVarL6 = sVar11.l();
                    b4.t tVarC6 = b4.a.c(tVarT3, sVar11);
                    sVar11.e0();
                    if (sVar11.S) {
                        sVar11.k(hVar4);
                    } else {
                        sVar11.n0();
                    }
                    m3.i.C(yVarA3, gVar9, sVar11);
                    m3.i.C(iVarL6, gVar10, sVar11);
                    w.a0.y(iHashCode6, sVar11, gVar11, sVar11, dVar3);
                    m3.i.C(tVarC6, gVar12, sVar11);
                    v1.n.d(x0.z(R.drawable.post_purchase_chat_icon, sVar11, 0), null, null, null, null, 0.0f, null, sVar11, 56, 124);
                    b4.t tVarD3 = d2.c.D(qVar3, 0.0f, f12, 0.0f, 0.0f, 13);
                    String strU3 = f0.U(sVar11, R.string.post_purchase_add_phone_number_title);
                    m5.u0 u0Var2 = lv.v.f28270i;
                    long j11 = lv.s.C;
                    r9.d(strU3, tVarD3, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar11, 432, 12582912, 131064);
                    r9.d(f0.U(sVar11, R.string.post_purchase_add_phone_number_description), d2.c.D(qVar3, 0.0f, 8, 0.0f, 0.0f, 13), j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar11, 432, 12582912, 131064);
                    b4.t tVarD4 = d2.c.D(m2.t(m2.d(qVar3, 1.0f), 3), 0.0f, f12, 0.0f, 0.0f, 13);
                    i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar11, 0);
                    int iHashCode7 = Long.hashCode(sVar11.T);
                    u3.i iVarL7 = sVar11.l();
                    b4.t tVarC7 = b4.a.c(tVarD4, sVar11);
                    sVar11.e0();
                    if (sVar11.S) {
                        sVar11.k(hVar4);
                    } else {
                        sVar11.n0();
                    }
                    m3.i.C(i2VarA, gVar9, sVar11);
                    m3.i.C(iVarL7, gVar10, sVar11);
                    w.a0.y(iHashCode7, sVar11, gVar11, sVar11, dVar3);
                    m3.i.C(tVarC7, gVar12, sVar11);
                    b4.t tVarQ = m2.q(qVar3, 65);
                    String strK = e0.f.k("+", (String) b1Var3.getValue());
                    float f13 = 12;
                    l2.f fVarB2 = l2.g.b(f13);
                    q4 q4Var2 = q4.f19349a;
                    long j12 = lv.s.f28231k;
                    d9 d9VarD2 = q4.d(j11, j11, j11, 0L, j12, 0L, 0L, sVar11, 2147460863);
                    d1 d1Var2 = new d1(4, 0, AppConstants.RESULT_CODE_ORDER_CANCELLED);
                    boolean z17 = h1Var3.h() != 0;
                    Object objM19 = sVar11.M();
                    if (objM19 == fVar) {
                        h1Var = h1Var3;
                        tVar = tVarQ;
                        final int i27 = 1;
                        objM19 = new Function1() { // from class: to.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                int i212 = i27;
                                String str32 = (String) obj11;
                                str32.getClass();
                                switch (i212) {
                                    case 0:
                                        b1Var3.setValue(str32);
                                        h1Var.i(0);
                                        break;
                                    case 1:
                                        b1Var3.setValue(StringsKt.N(str32, "+"));
                                        h1Var.i(0);
                                        break;
                                    default:
                                        b1Var3.setValue(str32);
                                        h1Var.i(0);
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar11.k0(objM19);
                    } else {
                        h1Var = h1Var3;
                        tVar = tVarQ;
                    }
                    z4.a(strK, (Function1) objM19, tVar, false, false, null, null, null, null, null, z17, null, d1Var2, null, true, 0, 0, fVarB2, d9VarD2, sVar11, 432, 12779520, 1925112);
                    b4.t tVarD5 = m2.d(qVar3, 1.0f);
                    if (1.0f <= 0.0d) {
                        e2.a.a("invalid weight; must be greater than zero");
                    }
                    b4.t tVarD6 = d2.c.D(b3.i.e(1.0f, tVarD5, true), 16, 0.0f, 0.0f, 0.0f, 14);
                    String str4 = (String) b1Var4.getValue();
                    l2.f fVarB3 = l2.g.b(f13);
                    d9 d9VarD3 = q4.d(j11, j11, j11, 0L, j12, 0L, 0L, sVar11, 2147460863);
                    d1 d1Var3 = new d1(4, 0, AppConstants.RESULT_CODE_ORDER_CANCELLED);
                    boolean z18 = h1Var.h() != 0;
                    Object objM20 = sVar11.M();
                    if (objM20 == fVar) {
                        final int i28 = 2;
                        objM20 = new Function1() { // from class: to.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                int i212 = i28;
                                String str32 = (String) obj11;
                                str32.getClass();
                                switch (i212) {
                                    case 0:
                                        b1Var4.setValue(str32);
                                        h1Var.i(0);
                                        break;
                                    case 1:
                                        b1Var4.setValue(StringsKt.N(str32, "+"));
                                        h1Var.i(0);
                                        break;
                                    default:
                                        b1Var4.setValue(str32);
                                        h1Var.i(0);
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar11.k0(objM20);
                    }
                    final int i29 = 1;
                    z4.a(str4, (Function1) objM20, tVarD6, false, false, null, null, vo.f.f42507a, null, u3.e.e(-1471722269, sVar11, new Function2() { // from class: to.b
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj11, Object obj12) {
                            switch (i29) {
                                case 0:
                                    n nVar42 = (n) obj11;
                                    int iIntValue42 = ((Integer) obj12).intValue();
                                    s sVar72 = (s) nVar42;
                                    if (sVar72.R(iIntValue42 & 1, (iIntValue42 & 3) != 2)) {
                                        h1 h1Var32 = h1Var;
                                        if (h1Var32.h() != 0) {
                                            sVar72.a0(607878211);
                                            r9.d(f0.U(sVar72, h1Var32.h()), null, lv.s.f28231k, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28277q, sVar72, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                                            sVar72.q(false);
                                        } else {
                                            sVar72.a0(608151228);
                                            sVar72.q(false);
                                        }
                                    } else {
                                        sVar72.U();
                                    }
                                    break;
                                default:
                                    n nVar52 = (n) obj11;
                                    int iIntValue52 = ((Integer) obj12).intValue();
                                    s sVar82 = (s) nVar52;
                                    if (sVar82.R(iIntValue52 & 1, (iIntValue52 & 3) != 2)) {
                                        h1 h1Var4 = h1Var;
                                        if (h1Var4.h() != 0) {
                                            sVar82.a0(-1051854762);
                                            r9.d(f0.U(sVar82, h1Var4.h()), null, lv.s.f28231k, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28277q, sVar82, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                                            sVar82.q(false);
                                        } else {
                                            sVar82.a0(-1051562401);
                                            sVar82.q(false);
                                        }
                                    } else {
                                        sVar82.U();
                                    }
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    }), z18, null, d1Var3, null, true, 0, 0, fVarB3, d9VarD3, sVar11, 12582960, 12779904, 1920888);
                    sVar11.q(true);
                    sVar11.q(true);
                    boolean z19 = ((String) b1Var3.getValue()).length() == 0 || ((String) b1Var4.getValue()).length() == 0;
                    b4.k kVar3 = b4.d.f5690h;
                    s1.y.d(z19, uVar.a(qVar3, kVar3), null, null, null, u3.e.e(-2018534013, sVar11, new tq.c(addPhoneNumberFragment, 4)), sVar11, 196608, 28);
                    s1.y.d(((String) b1Var3.getValue()).length() > 0 && ((String) b1Var4.getValue()).length() > 0, uVar.a(qVar3, kVar3), null, null, null, u3.e.e(-187600980, sVar11, new cn.x(28, addPhoneNumberFragment, b1Var3, b1Var4, h1Var)), sVar11, 196608, 28);
                    sVar11.q(true);
                } else {
                    sVar11.U();
                }
                return Unit.f26487a;
            case 22:
                ((Integer) obj2).getClass();
                e0.a((wq.a) obj3, (m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 23:
                e1 e1Var = (e1) obj3;
                e1Var.Q0();
                e1Var.f42880s.d();
                ClipData clipData = ((r1) obj).f7359a;
                int itemCount = clipData.getItemCount();
                int i31 = 0;
                boolean z21 = false;
                while (i31 < itemCount) {
                    boolean z22 = z21 || clipData.getItemAt(i31).getText() != null;
                    i31++;
                    z21 = z22;
                }
                if (z21) {
                    StringBuilder sb2 = new StringBuilder();
                    int itemCount2 = clipData.getItemCount();
                    int i32 = 0;
                    boolean z23 = false;
                    while (i32 < itemCount2) {
                        CharSequence text = clipData.getItemAt(i32).getText();
                        if (text != null) {
                            if (z23) {
                                sb2.append("\n");
                            }
                            sb2.append(text);
                            z23 = true;
                        }
                        i32++;
                        z23 = z23;
                    }
                    string = sb2.toString();
                } else {
                    string = null;
                }
                x1.a.a(e1Var);
                if (string != null) {
                    s1.h(e1Var.f42878q, string, null, false, 14);
                }
                return Boolean.TRUE;
            case 24:
                b2.l lVar = (b2.l) obj3;
                m3.n nVar9 = (m3.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                m3.s sVar12 = (m3.s) nVar9;
                if (sVar12.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    q4 q4Var3 = q4.f19349a;
                    long j13 = lv.s.G;
                    float f14 = 1;
                    q4Var3.b(true, lVar, q4.d(0L, j13, j13, j13, j13, 0L, 0L, sVar12, 2147452927), l2.g.b(8), f14, f14, sVar12, 14352822);
                } else {
                    sVar12.U();
                }
                return Unit.f26487a;
            case 25:
                LoginCharityActivity loginCharityActivity = (LoginCharityActivity) obj3;
                m3.n nVar10 = (m3.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i33 = LoginCharityActivity.f9074i;
                m3.s sVar13 = (m3.s) nVar10;
                if (sVar13.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    g9.f0 f0VarI2 = a.a.I(new t0[0], sVar13);
                    boolean zH6 = sVar13.h(loginCharityActivity);
                    Object objM21 = sVar13.M();
                    if (zH6 || objM21 == fVar) {
                        objM21 = new b40.d(loginCharityActivity, 19);
                        sVar13.k0(objM21);
                    }
                    Function0 function0 = (Function0) ((KFunction) objM21);
                    boolean zH7 = sVar13.h(loginCharityActivity);
                    Object objM22 = sVar13.M();
                    if (zH7 || objM22 == fVar) {
                        objM22 = new c6.y(loginCharityActivity, 5);
                        sVar13.k0(objM22);
                    }
                    Function2 function2 = (Function2) ((KFunction) objM22);
                    boolean zH8 = sVar13.h(loginCharityActivity);
                    Object objM23 = sVar13.M();
                    if (zH8 || objM23 == fVar) {
                        objM23 = new rv.a(loginCharityActivity, 25);
                        sVar13.k0(objM23);
                    }
                    b0.a0.e(f0VarI2, function0, function2, (Function0) objM23, sVar13, 0);
                } else {
                    sVar13.U();
                }
                return Unit.f26487a;
            case 26:
                SpecialRewardCelebrationFragment specialRewardCelebrationFragment = (SpecialRewardCelebrationFragment) obj3;
                m3.n nVar11 = (m3.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                m3.s sVar14 = (m3.s) nVar11;
                if (sVar14.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    Object objM24 = sVar14.M();
                    if (objM24 == fVar) {
                        objM24 = m3.i.w(Boolean.FALSE);
                        sVar14.k0(objM24);
                    }
                    x5.a(m2.f13850c, null, null, null, null, 0, 0L, 0L, null, u3.e.e(1249692019, sVar14, new ap.e(specialRewardCelebrationFragment, (b1) objM24, e0.D(new le.q("reward_box_open_beige.json"), sVar14, 6), i13)), sVar14, 805306374, 510);
                } else {
                    sVar14.U();
                }
                return Unit.f26487a;
            case 27:
                ((Integer) obj2).getClass();
                int i34 = NewLocationPicker.l;
                ((NewLocationPicker) obj3).a((m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 28:
                return a(obj, obj2);
            default:
                PurchaseSuccessFragment purchaseSuccessFragment = (PurchaseSuccessFragment) obj3;
                m3.n nVar12 = (m3.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                m3.s sVar15 = (m3.s) nVar12;
                if (sVar15.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    jb.u.r((yo.d) purchaseSuccessFragment.f9232g.getValue(), purchaseSuccessFragment.o(), sVar15, 0);
                } else {
                    sVar15.U();
                }
                return Unit.f26487a;
        }
    }

    public /* synthetic */ m(Object obj, int i11, int i12) {
        this.f35522a = i12;
        this.f35523b = obj;
    }
}

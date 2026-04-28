package no;

import androidx.lifecycle.m1;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.model.remote.brief.BriefStoreInfo;
import com.app.tgtg.model.remote.invitation.Invitation;
import com.app.tgtg.model.remote.invitation.InvitationFromDeeplinkResponse;
import com.app.tgtg.model.remote.invitation.OrderDataForInvitation;
import com.app.tgtg.model.remote.order.Order;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;
import mv.r0;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurpriseBagOrderActivity f31239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f31240c;

    public /* synthetic */ l(SurpriseBagOrderActivity surpriseBagOrderActivity, b1 b1Var, int i11) {
        this.f31238a = i11;
        this.f31239b = surpriseBagOrderActivity;
        this.f31240c = b1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String invitationId;
        OrderDataForInvitation orderDataForInvitation;
        BriefStoreInfo storeInfo;
        String strM328getStoreId7QsYvu8;
        Invitation invitation;
        int i11 = this.f31238a;
        int i12 = 1;
        b1 b1Var = this.f31240c;
        SurpriseBagOrderActivity surpriseBagOrderActivity = this.f31239b;
        switch (i11) {
            case 0:
                int i13 = SurpriseBagOrderActivity.f9178y;
                surpriseBagOrderActivity.C().t("Late_Confirmation");
                b1Var.setValue(Boolean.FALSE);
                surpriseBagOrderActivity.f9188t = true;
                break;
            case 1:
                int i14 = SurpriseBagOrderActivity.f9178y;
                surpriseBagOrderActivity.C().q();
                b1Var.setValue(Boolean.FALSE);
                break;
            case 2:
                int i15 = SurpriseBagOrderActivity.f9178y;
                if (surpriseBagOrderActivity.C().f31265s0) {
                    m0 m0VarC = surpriseBagOrderActivity.C();
                    Order order = (Order) m0VarC.f22215i.f45488a.getValue();
                    if (order != null) {
                        v80.f0.B(m1.d(m0VarC), null, null, new a0(m0VarC, order, null == true ? 1 : 0, i12), 3);
                    }
                } else {
                    m0 m0VarC2 = surpriseBagOrderActivity.C();
                    Order order2 = (Order) m0VarC2.f22215i.f45488a.getValue();
                    if (order2 != null && (invitationId = order2.getInvitationId()) != null) {
                        v80.f0.B(m1.d(m0VarC2), null, null, new k0(m0VarC2, invitationId, null == true ? 1 : 0, i12), 3);
                    }
                }
                b1Var.setValue(Boolean.FALSE);
                surpriseBagOrderActivity.f9188t = true;
                break;
            case 3:
                int i16 = SurpriseBagOrderActivity.f9178y;
                b1Var.setValue(Boolean.FALSE);
                surpriseBagOrderActivity.f9188t = true;
                break;
            case 4:
                int i17 = SurpriseBagOrderActivity.f9178y;
                b1Var.setValue(Boolean.FALSE);
                a2 a2Var = surpriseBagOrderActivity.C().f31259m0;
                a2Var.getClass();
                a2Var.k(null, 1);
                break;
            case 5:
                int i18 = SurpriseBagOrderActivity.f9178y;
                InvitationFromDeeplinkResponse invitationFromDeeplinkResponse = (InvitationFromDeeplinkResponse) b1Var.getValue();
                SurpriseBagOrderActivity.P(surpriseBagOrderActivity, null, invitationFromDeeplinkResponse != null ? invitationFromDeeplinkResponse.getOrderDataForInvitation() : null, 1);
                break;
            case 6:
                int i19 = SurpriseBagOrderActivity.f9178y;
                InvitationFromDeeplinkResponse invitationFromDeeplinkResponse2 = (InvitationFromDeeplinkResponse) b1Var.getValue();
                if (invitationFromDeeplinkResponse2 != null && (orderDataForInvitation = invitationFromDeeplinkResponse2.getOrderDataForInvitation()) != null && (storeInfo = orderDataForInvitation.getStoreInfo()) != null && (strM328getStoreId7QsYvu8 = storeInfo.m328getStoreId7QsYvu8()) != null) {
                    surpriseBagOrderActivity.Q(strM328getStoreId7QsYvu8);
                }
                break;
            case 7:
                int i21 = SurpriseBagOrderActivity.f9178y;
                surpriseBagOrderActivity.C().l(cv.i.ACTION_REMIND_ME_BUTTON, null);
                b1Var.setValue(Boolean.TRUE);
                break;
            case 8:
                int i22 = SurpriseBagOrderActivity.f9178y;
                Boolean bool = Boolean.TRUE;
                b1Var.setValue(bool);
                m0 m0VarC3 = surpriseBagOrderActivity.C();
                cv.i iVar = cv.i.ACTION_INITIATE_CANCELLATION;
                dv.a aVar = dv.a.SCREEN;
                dv.d dVar = dv.d.ORDER;
                m0VarC3.l(iVar, h0.g.E(new Pair(aVar, new dv.c(dVar != null ? dVar.a() : null))));
                b1Var.setValue(bool);
                break;
            default:
                int i23 = SurpriseBagOrderActivity.f9178y;
                if (r0.u(surpriseBagOrderActivity)) {
                    m0 m0VarC4 = surpriseBagOrderActivity.C();
                    InvitationFromDeeplinkResponse invitationFromDeeplinkResponse3 = (InvitationFromDeeplinkResponse) m0VarC4.N.f45488a.getValue();
                    if (invitationFromDeeplinkResponse3 != null && (invitation = invitationFromDeeplinkResponse3.getInvitation()) != null) {
                        v80.f0.B(m1.d(m0VarC4), null, null, new bn.e(m0VarC4, invitation, null == true ? 1 : 0, 5), 3);
                    }
                } else {
                    b1Var.setValue(oo.f.GENERIC);
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ l(b1 b1Var, SurpriseBagOrderActivity surpriseBagOrderActivity, int i11) {
        this.f31238a = i11;
        this.f31240c = b1Var;
        this.f31239b = surpriseBagOrderActivity;
    }
}

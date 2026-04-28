package a3;

import android.content.Context;
import android.net.Uri;
import com.app.tgtg.model.remote.invitation.InvitationState;
import g3.r9;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import zendesk.core.ui.android.internal.model.MessageActionSize;
import zendesk.core.ui.android.internal.model.MessageSourceType;
import zendesk.messaging.android.internal.conversationscreen.delegates.ImageMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.TextMessageContainerAdapterDelegate;
import zendesk.ui.android.conversation.actionbutton.ActionButtonRendering;
import zendesk.ui.android.conversation.imagecell.ImageCellRendering;
import zendesk.ui.android.conversation.textcell.TextCellRendering;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305a;

    public /* synthetic */ d0(int i11) {
        this.f305a = i11;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f305a) {
            case 0:
                return new b0((CoroutineContext) obj, (Context) obj2, (g0) obj3, (t5.c) obj4);
            case 1:
                ((Integer) obj4).intValue();
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                return Unit.f26487a;
            case 2:
                return ImageMessageContainerAdapterDelegate.ViewHolder.createImageCell$lambda$3((String) obj, (MessageActionSize) obj2, (String) obj3, (MessageSourceType) obj4);
            case 3:
                return TextMessageContainerAdapterDelegate.ViewHolder.createTextCell$lambda$9((String) obj, (MessageActionSize) obj2, (String) obj3, (MessageSourceType) obj4);
            case 4:
                Uri uri = (Uri) obj2;
                m3.n nVar = (m3.n) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((s1.l) obj).getClass();
                if (uri != null) {
                    m3.s sVar = (m3.s) nVar;
                    sVar.a0(-1399448362);
                    v1.n.d(gd.o.e(uri, sVar, (iIntValue >> 3) & 14), null, d2.m2.f13850c, null, z4.l.f47166a, 0.0f, null, sVar, 25008, 104);
                    sVar.q(false);
                } else {
                    m3.s sVar2 = (m3.s) nVar;
                    sVar2.a0(-1399202873);
                    sVar2.q(false);
                }
                return Unit.f26487a;
            case 5:
                String str = (String) obj2;
                m3.n nVar2 = (m3.n) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((s1.l) obj).getClass();
                str.getClass();
                b4.q qVar = b4.q.f5711a;
                b4.t tVarE = d2.m2.e(d2.m2.d(qVar, 1.0f), 150);
                z4.u0 u0VarD = d2.p.d(b4.d.f5690h, false);
                m3.s sVar3 = (m3.s) nVar2;
                int iHashCode = Long.hashCode(sVar3.T);
                u3.i iVarL = sVar3.l();
                b4.t tVarC = b4.a.c(tVarE, nVar2);
                b5.j.R.getClass();
                b5.h hVar = b5.i.f5839b;
                sVar3.e0();
                if (sVar3.S) {
                    sVar3.k(hVar);
                } else {
                    sVar3.n0();
                }
                m3.i.C(u0VarD, b5.i.f5843f, nVar2);
                m3.i.C(iVarL, b5.i.f5842e, nVar2);
                m3.i.v(nVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
                m3.i.z(nVar2, b5.i.f5845h);
                m3.i.C(tVarC, b5.i.f5841d, nVar2);
                r9.d(str, d2.m2.d(qVar, 1.0f), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28263b, nVar2, ((iIntValue2 >> 3) & 14) | 48, 12582912, 130044);
                sVar3.q(true);
                return Unit.f26487a;
            case 6:
                InvitationState invitationState = (InvitationState) obj2;
                m3.n nVar3 = (m3.n) obj3;
                ((Integer) obj4).intValue();
                ((s1.l) obj).getClass();
                if ((invitationState == null ? -1 : oo.b.$EnumSwitchMapping$0[invitationState.ordinal()]) == 1) {
                    m3.s sVar4 = (m3.s) nVar3;
                    sVar4.a0(643975232);
                    oo.a.o(sVar4, 0);
                    sVar4.q(false);
                } else {
                    m3.s sVar5 = (m3.s) nVar3;
                    sVar5.a0(643976421);
                    oo.a.p(sVar5, 0);
                    sVar5.q(false);
                }
                return Unit.f26487a;
            case 7:
                ((Integer) obj2).getClass();
                m3.n nVar4 = (m3.n) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((g2.l) obj).getClass();
                m3.s sVar6 = (m3.s) nVar4;
                if (sVar6.R(iIntValue3 & 1, (iIntValue3 & 129) != 128)) {
                    d2.c.f(d2.m2.m(b4.q.f5711a, 35), sVar6);
                } else {
                    sVar6.U();
                }
                return Unit.f26487a;
            case 8:
                return ActionButtonRendering.Builder.onWebViewActionButtonClicked$lambda$1((String) obj, (MessageActionSize) obj2, (String) obj3, (MessageSourceType) obj4);
            case 9:
                return ImageCellRendering.Builder.onWebViewActionButtonClicked$lambda$2((String) obj, (MessageActionSize) obj2, (String) obj3, (MessageSourceType) obj4);
            default:
                return TextCellRendering.Builder.onWebViewActionButtonClicked$lambda$4((String) obj, (MessageActionSize) obj2, (String) obj3, (MessageSourceType) obj4);
        }
    }
}

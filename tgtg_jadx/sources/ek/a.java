package ek;

import a3.v0;
import android.graphics.Color;
import android.text.Editable;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o0;
import androidx.lifecycle.m1;
import androidx.navigation.fragment.NavHostFragment;
import ao.g3;
import com.app.tgtg.R;
import com.app.tgtg.customview.BasketButtonRow;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.feature.helpdesk.HelpCenterActivity;
import com.app.tgtg.feature.login.email.EmailCodeAccessActivity;
import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import com.app.tgtg.feature.main.fragments.discover.herocomponent.DiscoverSheetView;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.local.BioData;
import com.app.tgtg.model.local.payment.ResumePaymentData;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.HeroComponentResponse;
import com.app.tgtg.model.remote.item.response.ManufacturerItem;
import com.google.android.material.textfield.TextInputEditText;
import d2.y2;
import fn.t;
import g2.y;
import g3.b2;
import g3.l2;
import g3.v3;
import g3.w6;
import g9.h0;
import g9.i0;
import g9.j0;
import g9.t0;
import g9.x;
import g9.z;
import gt.w;
import h2.l1;
import i4.g0;
import i4.s0;
import i4.v;
import i4.x0;
import j5.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lv.s;
import mv.r0;
import o80.r;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.a2;
import pg.b1;
import v80.f0;
import y00.d0;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.messaging.android.internal.UriHandler;
import zendesk.messaging.android.internal.conversationscreen.delegates.FileMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.ImageMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.MessageLoadMoreAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.QuickReplyAdapterDelegate;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.ui.android.common.loadmore.LoadMoreRendering;
import zendesk.ui.android.conversation.quickreply.QuickReplyState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16052c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f16050a = i11;
        this.f16051b = obj;
        this.f16052c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        z zVarC;
        int i11 = this.f16050a;
        final int i12 = 3;
        int i13 = 5;
        final int i14 = 1;
        final int i15 = 0;
        Object obj2 = this.f16052c;
        Object obj3 = this.f16051b;
        switch (i11) {
            case 0:
                HelpCenterActivity helpCenterActivity = (HelpCenterActivity) obj3;
                int i16 = HelpCenterActivity.f9006j;
                ((View) obj).getClass();
                if (!((NavHostFragment) obj2).o().g()) {
                    helpCenterActivity.finish();
                }
                return Unit.f26487a;
            case 1:
                a2 a2Var = (a2) obj3;
                final en.b bVar = (en.b) obj2;
                ((Animation) obj).getClass();
                ImageView imageView = a2Var.f34774w;
                imageView.getClass();
                imageView.setVisibility(0);
                en.o oVar = bVar.f16106b;
                g3 g3Var = oVar.f16169d;
                g3 g3Var2 = oVar.f16169d;
                if (g3Var.n().getUseManufacturerBasketFlow()) {
                    a2 a2Var2 = bVar.f16105a;
                    BasketButtonRow basketButtonRow = a2Var2.f34770s;
                    basketButtonRow.setAddQuantity(new Function0() { // from class: en.a
                        /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
                        @Override // kotlin.jvm.functions.Function0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke() {
                            /*
                                Method dump skipped, instruction units count: 318
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: en.a.invoke():java.lang.Object");
                        }
                    });
                    basketButtonRow.setRemoveQuantity(new Function0() { // from class: en.a
                        /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
                        @Override // kotlin.jvm.functions.Function0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke() {
                            /*
                                Method dump skipped, instruction units count: 318
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: en.a.invoke():java.lang.Object");
                        }
                    });
                    final int i17 = 2;
                    basketButtonRow.setOnReserveClick(new Function0() { // from class: en.a
                        /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
                        @Override // kotlin.jvm.functions.Function0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke() {
                            /*
                                Method dump skipped, instruction units count: 318
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: en.a.invoke():java.lang.Object");
                        }
                    });
                    basketButtonRow.setOnShowMaxLimitPopup(new Function0() { // from class: en.a
                        /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
                        @Override // kotlin.jvm.functions.Function0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke() {
                            /*
                                Method dump skipped, instruction units count: 318
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: en.a.invoke():java.lang.Object");
                        }
                    });
                    Integer num = bVar.f16115k;
                    if ((num != null ? num.intValue() : 0) > 0) {
                        bVar.b();
                    } else {
                        BasketButtonRow basketButtonRow2 = a2Var2.f34770s;
                        String string = a2Var2.f986f.getContext().getResources().getString(R.string.alert_box_close_btn);
                        string.getClass();
                        basketButtonRow2.setButtonText(string);
                        basketButtonRow2.setQuantity(0);
                    }
                    Integer num2 = bVar.f16115k;
                    basketButtonRow.setStock(num2 != null ? num2.intValue() : 0);
                }
                LinearLayout linearLayout = a2Var.f34771t;
                linearLayout.getClass();
                linearLayout.setVisibility(!g3Var2.n().getUseManufacturerBasketFlow() ? 0 : 8);
                LinearLayout linearLayout2 = a2Var.f34772u;
                linearLayout2.getClass();
                linearLayout2.setVisibility(g3Var2.n().getUseManufacturerBasketFlow() ? 0 : 8);
                return Unit.f26487a;
            case 2:
                int i18 = ManufacturerItemDetailsActivity.f9137q;
                ((View) obj).getClass();
                en.o oVarG = ((ManufacturerItemDetailsActivity) obj3).G();
                ct.a aVar = ct.a.FAQ_ITEM_MANUFACTURER;
                aVar.getClass();
                oVarG.f16172g.b("https://www.findsmiley.dk/1248444", aVar, null, true, (String) obj2);
                return Unit.f26487a;
            case 3:
                a2 a2Var3 = (a2) obj3;
                ManufacturerItemDetailsActivity manufacturerItemDetailsActivity = (ManufacturerItemDetailsActivity) obj2;
                int i19 = ManufacturerItemDetailsActivity.f9137q;
                ((View) obj).getClass();
                a2Var3.f34775x.setEnabled(false);
                manufacturerItemDetailsActivity.G().f29972b = false;
                manufacturerItemDetailsActivity.H();
                ManufacturerItem manufacturerItem = (ManufacturerItem) manufacturerItemDetailsActivity.G().f16177m.d();
                if (manufacturerItem != null) {
                    d0.c(manufacturerItem, AppConstants.RETURN_URL_MANUFACTURE_ADYEN, manufacturerItemDetailsActivity.G().b(), new se.b(a2Var3, 17), 8).show(manufacturerItemDetailsActivity.getSupportFragmentManager(), "CHECKOUT");
                }
                return Unit.f26487a;
            case 4:
                EmailCodeAccessActivity emailCodeAccessActivity = (EmailCodeAccessActivity) obj3;
                TextInputEditText textInputEditText = (TextInputEditText) obj2;
                Editable editable = (Editable) obj;
                int i21 = EmailCodeAccessActivity.f9048k;
                editable.getClass();
                if (editable.length() > 5) {
                    pg.b bVar2 = emailCodeAccessActivity.f9050g;
                    bVar2.getClass();
                    ((TGTGLoadingView) bVar2.f34790k).setVisibility(0);
                    al.p pVarA0 = emailCodeAccessActivity.a0();
                    String strValueOf = String.valueOf(textInputEditText.getText());
                    String str2 = pVarA0.f1583v;
                    if (str2 != null && (str = pVarA0.f1584w) != null) {
                        f0.B(m1.d(pVarA0), null, null, new al.j(pVarA0, str2, strValueOf, str, null, 0), 3);
                    }
                    r0.p(emailCodeAccessActivity);
                }
                return Unit.f26487a;
            case 5:
                int i22 = EmailCodeAccessActivity.f9048k;
                ((View) obj).getClass();
                ((PopupWindow) obj3).dismiss();
                ((EmailCodeAccessActivity) obj2).getOnBackPressedDispatcher().d();
                return Unit.f26487a;
            case 6:
                t tVar = (t) obj2;
                ((View) obj).getClass();
                ((ConstraintLayout) ((b1) obj3).f34796d).setVisibility(8);
                tVar.q(0);
                tVar.s().f17795b.f4278w = true;
                return Unit.f26487a;
            case 7:
                t tVar2 = (t) obj3;
                String str3 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    o0 o0VarRequireActivity = tVar2.requireActivity();
                    o0VarRequireActivity.getClass();
                    a70.a.t(o0VarRequireActivity, s.J);
                } else {
                    o0 o0VarRequireActivity2 = tVar2.requireActivity();
                    o0VarRequireActivity2.getClass();
                    a70.a.t(o0VarRequireActivity2, g0.c(Color.parseColor(str3)));
                }
                return Unit.f26487a;
            case 8:
                g2.o oVar2 = (g2.o) obj2;
                e7.h hVarB = ((y) obj3).b(((Integer) obj).intValue());
                int i23 = hVarB.f15830a;
                List list = hVarB.f15831b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i24 = 0;
                while (i15 < size) {
                    int i25 = (int) ((g2.b) list.get(i15)).f18124a;
                    arrayList.add(new Pair(Integer.valueOf(i23), new z5.a(oVar2.a(i24, i25))));
                    i23++;
                    i24 += i25;
                    i15++;
                }
                return arrayList;
            case 9:
                g2.o oVar3 = (g2.o) obj3;
                g2.n nVar = (g2.n) obj2;
                int iIntValue = ((Integer) obj).intValue();
                y yVar = oVar3.f18259e;
                int i26 = yVar.f18272i;
                int iE = yVar.e(iIntValue);
                return nVar.q(iIntValue, 0, iE, nVar.f18192e, oVar3.a(0, iE));
            case 10:
                return new v0(new b2((View) obj3, (Function0) obj2), i13);
            case 11:
                b5.o0 o0Var = (b5.o0) obj;
                o0Var.b();
                t1.b bVar3 = ((l2) obj2).f19006y;
                bVar3.getClass();
                k4.d.s(o0Var, (i4.h) obj3, new x0(((v) bVar3.d()).f23317a), 0.0f, null, 60);
                return Unit.f26487a;
            case 12:
                t1.b bVar4 = (t1.b) obj2;
                s0 s0Var = (s0) obj;
                float fH = ((w6) obj3).f19706e.f46655j.h();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (s0Var.f23297q & 4294967295L));
                if (!Float.isNaN(fH) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
                    float fFloatValue = ((Number) bVar4.d()).floatValue();
                    s0Var.o(v3.d(s0Var, fFloatValue));
                    s0Var.p(v3.e(s0Var, fFloatValue));
                    s0Var.w(g0.h(0.5f, (fH + fIntBitsToFloat) / fIntBitsToFloat));
                }
                return Unit.f26487a;
            case 13:
                b0 b0Var = (b0) obj;
                j5.z.r(b0Var, 1.0f);
                j5.z.h((String) obj3, b0Var);
                j5.z.c(b0Var, new ar.d(28, (Function0) obj2));
                return Unit.f26487a;
            case 14:
                ((i3.d0) obj3).f23107a.setValue(new d2.f0((y2) obj2, (y2) obj));
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                z zVar = (z) obj3;
                l9.f fVar = ((g9.p) obj2).f20186b;
                j0 j0Var = (j0) obj;
                j0Var.getClass();
                h0 h0Var = j0Var.f20154a;
                h0Var.f20131h = 0;
                h0Var.f20132i = 0;
                if (zVar instanceof g9.b0) {
                    int i27 = z.f20256f;
                    Iterator it = x.b(zVar).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z zVar2 = (z) it.next();
                            z zVarI = fVar.i();
                            if (Intrinsics.areEqual(zVar2, zVarI != null ? zVarI.f20259c : null)) {
                            }
                        } else {
                            int i28 = g9.b0.f20105h;
                            g9.b0 b0VarJ = fVar.j();
                            b0VarJ.getClass();
                            j0Var.a(((z) r.l(o80.o.d(b0VarJ, new g2.q(29)))).f20258b.f27563e);
                            j0Var.f20158e = false;
                            j0Var.f20159f = true;
                        }
                    }
                }
                return Unit.f26487a;
            case 16:
                t0 t0Var = (t0) obj3;
                i0 i0Var = (i0) obj2;
                g9.l lVar = (g9.l) obj;
                lVar.getClass();
                z zVar3 = lVar.f20163b;
                l9.c cVar = lVar.f20169h;
                if (zVar3 == null) {
                    zVar3 = null;
                }
                if (zVar3 == null || (zVarC = t0Var.c(zVar3, cVar.a(), i0Var)) == null) {
                    return null;
                }
                return Intrinsics.areEqual(zVarC, zVar3) ? lVar : t0Var.b().b(zVarC, zVarC.d(cVar.a()));
            case 17:
                BasicItem basicItem = (BasicItem) obj;
                int i29 = DiscoverSheetView.f9147q;
                basicItem.getClass();
                Function2 function2 = ((DiscoverSheetView) obj3).l;
                String displayType = ((HeroComponentResponse) obj2).getDisplayType();
                if (displayType == null) {
                    displayType = "";
                }
                function2.invoke(basicItem, displayType);
                return Unit.f26487a;
            case 18:
                ha.a aVar2 = (ha.a) obj;
                aVar2.getClass();
                ((gt.b) obj3).f20834b.v(aVar2, (BioData) obj2);
                return Unit.f26487a;
            case 19:
                ha.a aVar3 = (ha.a) obj;
                aVar3.getClass();
                ((gt.j) obj3).f20852b.u(aVar3, (List) obj2);
                return Unit.f26487a;
            case 20:
                ha.a aVar4 = (ha.a) obj;
                aVar4.getClass();
                ((gt.n) obj3).f20865b.v(aVar4, (cv.e) obj2);
                return Unit.f26487a;
            case 21:
                ha.a aVar5 = (ha.a) obj;
                aVar5.getClass();
                ((w) obj3).f20897c.d(aVar5, (ArrayList) obj2);
                return Unit.f26487a;
            case 22:
                ha.a aVar6 = (ha.a) obj;
                aVar6.getClass();
                ((gt.y) obj3).f20900b.v(aVar6, (ResumePaymentData) obj2);
                return Unit.f26487a;
            case 23:
                h2.d dVar = (h2.d) obj3;
                h2.e eVar = (h2.e) obj2;
                k5.d dVar2 = dVar.f21068o;
                if (dVar2 != null) {
                    dVar2.b();
                }
                dVar.f21068o = null;
                v80.q qVar = eVar.f21083c;
                if (qVar != null) {
                    qVar.R(Unit.f26487a);
                }
                eVar.f21083c = null;
                return Unit.f26487a;
            case 24:
                l1 l1Var = (l1) obj3;
                l1Var.f21166c.i(obj2);
                return new c5.s0(6, l1Var, obj2);
            case 25:
                return new l1((y3.e) obj3, (Map) obj, (y3.b) obj2);
            case 26:
                return FileMessageContainerAdapterDelegate.ViewHolder.renderContent$lambda$0((Function1) obj3, (MessageLogEntry.FileMessageContainer) obj2, (String) obj);
            case 27:
                return ImageMessageContainerAdapterDelegate.ViewHolder.createImageCell$lambda$12((UriHandler) obj3, (MessageContent.Image) obj2, (String) obj);
            case 28:
                return MessageLoadMoreAdapterDelegate.ViewHolder.bind$lambda$2((MessageLoadMoreAdapterDelegate.ViewHolder) obj3, (MessageLogEntry.LoadMore) obj2, (LoadMoreRendering) obj);
            default:
                return QuickReplyAdapterDelegate.ViewHolder.bind$lambda$4$lambda$1((MessageLogEntry.QuickReply) obj3, (QuickReplyAdapterDelegate.ViewHolder) obj2, (QuickReplyState) obj);
        }
    }
}

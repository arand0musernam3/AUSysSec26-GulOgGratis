package sr;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bg.k0;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderType;
import com.app.tgtg.model.remote.support.response.ConsumerSupportResponse;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mv.p0;
import mv.r0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContactUsActivity f39092b;

    public /* synthetic */ a(ContactUsActivity contactUsActivity, int i11) {
        this.f39091a = i11;
        this.f39092b = contactUsActivity;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        wr.b bVar;
        wr.e[] eVarArrF;
        Order order;
        String currentUrl;
        String currentUrl2;
        wr.e eVar;
        wr.b bVar2;
        String str;
        Object next;
        wr.h hVar;
        wr.b[] bVarArrA;
        int i11 = this.f39091a;
        pg.w wVar = null;
        com.google.android.material.bottomsheet.l lVar = null;
        int length = 0;
        length = 0;
        length = 0;
        ContactUsActivity contactUsActivity = this.f39092b;
        switch (i11) {
            case 0:
                int i12 = ContactUsActivity.f9367t;
                ((View) obj).getClass();
                wr.g gVarD = contactUsActivity.F().d();
                if (gVarD != null && (bVar = gVarD.f43524b) != null && (eVarArrF = bVar.f()) != null) {
                    length = eVarArrF.length;
                }
                if (length > 1) {
                    contactUsActivity.a0(R.string.contact_us_topic_spinner_title, e.TOPIC);
                }
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i13 = ContactUsActivity.f9367t;
                if (zBooleanValue) {
                    contactUsActivity.E();
                }
                break;
            case 2:
                m mVar = (m) obj;
                int i14 = ContactUsActivity.f9367t;
                mVar.getClass();
                contactUsActivity.I();
                k0 k0Var = new k0(contactUsActivity);
                k0Var.e(R.string.contact_us_wrong_topic_title);
                k0Var.a(mVar == m.CANCEL_ORDER ? R.string.contact_us_wrong_topic_cancel_order_description : R.string.contact_us_wrong_topic_missed_collection_description);
                k0Var.c(R.string.contact_us_wrong_topic_positive_btn);
                k0Var.l = new b(contactUsActivity, 4);
                k0Var.f();
                break;
            case 3:
                u70.t tVar = contactUsActivity.f9375n;
                ConsumerSupportResponse consumerSupportResponse = (ConsumerSupportResponse) obj;
                int i15 = ContactUsActivity.f9367t;
                consumerSupportResponse.getClass();
                String supportRequestState = consumerSupportResponse.getSupportRequestState();
                if (Intrinsics.areEqual(supportRequestState, "AUTO_REFUND_EXISTING_REQUESTS_FOR_RECEIPT_WAIT")) {
                    String supportRequestId = consumerSupportResponse.getSupportRequestId();
                    if (supportRequestId != null) {
                        contactUsActivity.I();
                        k0 k0Var2 = new k0(contactUsActivity);
                        k0Var2.e(R.string.contact_us_duplicate_message_title);
                        k0Var2.a(R.string.contact_us_duplicate_message_description);
                        k0Var2.c(R.string.contact_us_duplicate_message_positive_btn);
                        k0Var2.l = new qw.b(contactUsActivity, 19, supportRequestId);
                        k0Var2.b(R.string.contact_us_duplicate_message_negative_btn);
                        k0Var2.f6182n = new b(contactUsActivity, 5);
                        k0Var2.f6179j = false;
                        k0Var2.f();
                    } else {
                        contactUsActivity.G(consumerSupportResponse);
                    }
                } else if (Intrinsics.areEqual(supportRequestState, "ORDER_CANCELLED")) {
                    q qVar = (q) tVar.getValue();
                    d dVar = new d(contactUsActivity, 0);
                    qVar.getClass();
                    qVar.f39113b = dVar;
                    ((q) tVar.getValue()).a(f.CANCELLED);
                } else {
                    contactUsActivity.G(consumerSupportResponse);
                }
                break;
            case 4:
                List list = (List) obj;
                int i16 = ContactUsActivity.f9367t;
                wr.g gVarD2 = contactUsActivity.F().d();
                list.getClass();
                contactUsActivity.l = new br.i(contactUsActivity, contactUsActivity, (BriefOrder[]) list.toArray(new BriefOrder[0]));
                int i17 = 8;
                if (list.isEmpty()) {
                    pg.w wVar2 = contactUsActivity.f9369g;
                    if (wVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        wVar2 = null;
                    }
                    wVar2.f35212g.animate().setDuration(100L).alpha(0.0f).start();
                    pg.w wVar3 = contactUsActivity.f9369g;
                    if (wVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        wVar3 = null;
                    }
                    wVar3.f35211f.animate().setDuration(100L).alpha(0.0f).start();
                    new Handler(Looper.getMainLooper()).postDelayed(new d(contactUsActivity, 2), 200L);
                    if (gVarD2 != null) {
                        gVarD2.f43524b = wr.b.CONSUMER_GENERAL_QUESTION;
                    }
                    if (gVarD2 != null) {
                        gVarD2.f43526d = null;
                    }
                } else {
                    if (gVarD2 != null && (hVar = gVarD2.f43523a) != null && (bVarArrA = hVar.a()) != null) {
                        pg.w wVar4 = contactUsActivity.f9369g;
                        if (wVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            wVar4 = null;
                        }
                        mv.d.x(wVar4.f35228x, new a(contactUsActivity, i17));
                        contactUsActivity.f9372j = new br.i(contactUsActivity, contactUsActivity, (t40.b[]) Arrays.copyOf(bVarArrA, bVarArrA.length));
                    }
                    contactUsActivity.N(true);
                    if (gVarD2 == null || (str = gVarD2.f43531i) == null) {
                        str = null;
                    }
                    if (str != null && !StringsKt.H(str) && gVarD2.f43528f == null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                String strM321getOrderIdreIZeYA = ((BriefOrder) next).m321getOrderIdreIZeYA();
                                String str2 = gVarD2.f43531i;
                                if (str2 == null ? false : OrderId.m213equalsimpl0(strM321getOrderIdreIZeYA, str2)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        BriefOrder briefOrder = (BriefOrder) next;
                        contactUsActivity.F().f9392m = briefOrder;
                        OrderType orderType = briefOrder != null ? briefOrder.getOrderType() : null;
                        int i18 = orderType == null ? -1 : l.$EnumSwitchMapping$0[orderType.ordinal()];
                        if (i18 == 1) {
                            gVarD2.f43524b = wr.b.BAD_ORDER_EXPERIENCE;
                        } else if (i18 == 2) {
                            gVarD2.f43524b = wr.b.DELIVERY_ISSUE;
                        } else if (i18 == 3) {
                            gVarD2.f43524b = wr.b.CATERING_ISSUE;
                        }
                    }
                }
                if (gVarD2 != null && (bVar2 = gVarD2.f43524b) != null) {
                    contactUsActivity.J(bVar2, false);
                    contactUsActivity.S(bVar2);
                    if (gVarD2.f43525c) {
                        contactUsActivity.T();
                    }
                }
                if (gVarD2 != null && (eVar = gVarD2.f43526d) != null) {
                    contactUsActivity.L(eVar);
                    contactUsActivity.X(eVar);
                    if (gVarD2.f43527e) {
                        contactUsActivity.Y(false);
                    }
                }
                BriefOrder briefOrder2 = contactUsActivity.F().f9392m;
                if (briefOrder2 != null) {
                    contactUsActivity.V(true, gVarD2 != null ? gVarD2.f43529g : false);
                    contactUsActivity.F().f9392m = briefOrder2;
                    contactUsActivity.U(briefOrder2);
                    contactUsActivity.H();
                }
                if (gVarD2 != null && (order = gVarD2.f43528f) != null) {
                    contactUsActivity.V(true, gVarD2.f43529g);
                    pg.w wVar5 = contactUsActivity.f9369g;
                    if (wVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        wVar5 = null;
                    }
                    wVar5.f35217m.removeAllViews();
                    pg.w wVar6 = contactUsActivity.f9369g;
                    if (wVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        wVar6 = null;
                    }
                    LinearLayout linearLayout = wVar6.f35217m;
                    i iVar = new i(contactUsActivity, contactUsActivity);
                    OrderType orderType2 = order.getOrderType();
                    OrderType orderType3 = OrderType.MANUFACTURER;
                    pg.u uVar = iVar.f39105a;
                    if (orderType2 == orderType3) {
                        uVar.f35181e.setText(order.getItemName());
                        Picture storeLogo = order.getStoreLogo();
                        if (storeLogo == null || (currentUrl2 = storeLogo.getCurrentUrl()) == null) {
                            Picture itemLogo = order.getItemLogo();
                            currentUrl2 = itemLogo != null ? itemLogo.getCurrentUrl() : null;
                        }
                        r0.y(currentUrl2, uVar.f35179c, R.drawable.default_logo);
                    } else {
                        uVar.f35181e.setText(order.getStoreNameAndBranch());
                        Picture storeLogo2 = order.getStoreLogo();
                        if (storeLogo2 != null && (currentUrl = storeLogo2.getCurrentUrl()) != null) {
                            r0.y(currentUrl, uVar.f35179c, R.drawable.default_logo);
                        }
                    }
                    try {
                        TextView textView = uVar.f35180d;
                        Context context = iVar.getContext();
                        context.getClass();
                        textView.setText(p0.c(context, order.getTimeOfPurchase()));
                    } catch (ParseException e5) {
                        uVar.f35180d.setText(order.getTimeOfPurchase());
                        sa0.a.f38953a.d(e5);
                    }
                    linearLayout.addView(iVar);
                    contactUsActivity.H();
                }
                if ((gVarD2 != null ? gVarD2.f43526d : null) == wr.e.MISSED_COLLECTION_CONTACT_AGAIN) {
                    contactUsActivity.P(R.string.contact_us_helper_box_follow_up);
                    pg.w wVar7 = contactUsActivity.f9369g;
                    if (wVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        wVar7 = null;
                    }
                    wVar7.f35212g.setVisibility(8);
                    pg.w wVar8 = contactUsActivity.f9369g;
                    if (wVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        wVar8 = null;
                    }
                    wVar8.f35229y.setOnClickListener(null);
                    pg.w wVar9 = contactUsActivity.f9369g;
                    if (wVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        wVar = wVar9;
                    }
                    wVar.f35216k.setVisibility(8);
                }
                break;
            case 5:
                int i19 = ContactUsActivity.f9367t;
                ((View) obj).getClass();
                contactUsActivity.a0(R.string.contact_us_order_spinner_title, e.ORDER);
                break;
            case 6:
                int i21 = ContactUsActivity.f9367t;
                ((View) obj).getClass();
                com.google.android.material.bottomsheet.l lVar2 = contactUsActivity.f9374m;
                if (lVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    lVar = lVar2;
                }
                lVar.cancel();
                break;
            case 7:
                int i22 = ContactUsActivity.f9367t;
                ((View) obj).getClass();
                contactUsActivity.M();
                break;
            case 8:
                int i23 = ContactUsActivity.f9367t;
                ((View) obj).getClass();
                contactUsActivity.a0(R.string.contact_us_reason_spinner_title, e.REASON);
                break;
            case 9:
                int i24 = ContactUsActivity.f9367t;
                ((View) obj).getClass();
                contactUsActivity.K(false);
                break;
            case 10:
                int i25 = ContactUsActivity.f9367t;
                ((View) obj).getClass();
                contactUsActivity.getOnBackPressedDispatcher().d();
                break;
            case 11:
                Editable editable = (Editable) obj;
                int i26 = ContactUsActivity.f9367t;
                editable.getClass();
                contactUsActivity.c0(StringsKt.H(editable.toString()));
                break;
            case 12:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                int i27 = ContactUsActivity.f9367t;
                if (zBooleanValue2) {
                    contactUsActivity.b0();
                    contactUsActivity.D(false);
                } else {
                    contactUsActivity.I();
                    contactUsActivity.D(true);
                }
                break;
            case 13:
                Throwable th2 = (Throwable) obj;
                int i28 = ContactUsActivity.f9367t;
                th2.getClass();
                if (u00.d.F(413, th2)) {
                    k0 k0Var3 = new k0(contactUsActivity);
                    k0Var3.e(R.string.contact_us_error_submit_invalid_attachment);
                    k0Var3.a(R.string.contact_us_error_submit_failure_files_too_big);
                    k0Var3.c(R.string.contact_us_error_submit_popup_okay_btn);
                    k0Var3.f();
                    contactUsActivity.D(true);
                } else {
                    r0.o(contactUsActivity, th2);
                    contactUsActivity.D(true);
                }
                contactUsActivity.I();
                break;
            case 14:
                f fVar = (f) obj;
                int i29 = ContactUsActivity.f9367t;
                fVar.getClass();
                contactUsActivity.d0(fVar);
                break;
            default:
                ((Boolean) obj).getClass();
                int i31 = ContactUsActivity.f9367t;
                k0 k0Var4 = new k0(contactUsActivity);
                k0Var4.e(R.string.contact_us_error_submit_invalid_attachment);
                k0Var4.a(R.string.contact_us_error_submit_failure_files_too_big);
                k0Var4.c(R.string.contact_us_error_submit_popup_okay_btn);
                k0Var4.f();
                break;
        }
        return Unit.f26487a;
    }
}

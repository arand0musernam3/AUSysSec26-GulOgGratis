package bg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.adyen.checkout.card.internal.ui.model.CardBrandItem;
import com.adyen.checkout.card.internal.ui.view.CardBrandItemViewHolder;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerModel;
import com.adyen.checkout.issuerlist.internal.ui.view.IssuerListRecyclerAdapter;
import com.adyen.checkout.qrcode.internal.ui.QRCodeDelegate;
import com.adyen.checkout.qrcode.internal.ui.view.FullQRCodeView;
import com.adyen.checkout.qrcode.internal.ui.view.SimpleQRCodeView;
import com.adyen.checkout.ui.core.internal.ui.view.AddressLookupOptionsAdapter;
import com.adyen.checkout.ui.core.internal.ui.view.LookupOption;
import com.adyen.checkout.voucher.internal.ui.VoucherDelegate;
import com.adyen.checkout.voucher.internal.ui.view.FullVoucherView;
import com.adyen.checkout.voucher.internal.ui.view.SimpleVoucherView;
import com.app.tgtg.R;
import com.app.tgtg.customview.SearchAndFilterView;
import com.app.tgtg.customview.manufactureaddressfragment.AddressEditText;
import com.app.tgtg.feature.tabprofile.legal.privacy.trackingconsent.TrackingConsentActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.app.tgtg.model.remote.order.Order;
import com.braze.ui.inappmessage.views.InAppMessageFullView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.q3;
import pg.u2;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentItem;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6209c;

    public /* synthetic */ n0(Order order, u2 u2Var, br.m mVar) {
        this.f6207a = 3;
        this.f6208b = order;
        this.f6209c = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Exception {
        int i11 = this.f6207a;
        Unit unit = null;
        uk.c cVar = null;
        Object obj = this.f6209c;
        Object obj2 = this.f6208b;
        switch (i11) {
            case 0:
                pg.a aVar = (pg.a) obj;
                int i12 = SearchAndFilterView.f8913k;
                ((EditText) aVar.f34765g).setText("");
                ((ConstraintLayout) aVar.f34761c).setVisibility(8);
                Function0 function0 = ((SearchAndFilterView) obj2).f8919h;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 1:
                ((bl.d) obj2).p().c(((pg.z) obj).f35296v.isChecked());
                break;
            case 2:
                int i13 = bq.d.f6588c;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from((Context) obj2);
                layoutInflaterFrom.getClass();
                pg.c1 c1Var = ((bq.d) obj).f6589b;
                String string = c1Var.f986f.getResources().getString(R.string.flash_sales_popup_deals_title);
                string.getClass();
                String string2 = c1Var.f986f.getResources().getString(R.string.flash_sales_popup_deals_text);
                string2.getClass();
                ImageView imageView = c1Var.f34813t;
                imageView.getClass();
                View viewInflate = layoutInflaterFrom.inflate(R.layout.tooltip_green, (ViewGroup) null, false);
                int i14 = R.id.close;
                ImageView imageView2 = (ImageView) pd.g.t(R.id.close, viewInflate);
                if (imageView2 != null) {
                    i14 = R.id.dynamicPricingPopup;
                    if (((ConstraintLayout) pd.g.t(R.id.dynamicPricingPopup, viewInflate)) != null) {
                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                        int i15 = R.id.tooltipRoot;
                        if (((ConstraintLayout) pd.g.t(R.id.tooltipRoot, viewInflate)) != null) {
                            i15 = R.id.triangleBottom;
                            View viewT = pd.g.t(R.id.triangleBottom, viewInflate);
                            if (viewT != null) {
                                i15 = R.id.triangleTop;
                                View viewT2 = pd.g.t(R.id.triangleTop, viewInflate);
                                if (viewT2 != null) {
                                    i15 = R.id.tvBody;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) pd.g.t(R.id.tvBody, viewInflate);
                                    if (appCompatTextView != null) {
                                        i15 = R.id.tvTitle;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) pd.g.t(R.id.tvTitle, viewInflate);
                                        if (appCompatTextView2 != null) {
                                            i15 = R.id.verticalGuideline;
                                            Guideline guideline = (Guideline) pd.g.t(R.id.verticalGuideline, viewInflate);
                                            if (guideline != null) {
                                                appCompatTextView2.setText(string);
                                                appCompatTextView.setText(string2);
                                                PopupWindow popupWindow = new PopupWindow((View) frameLayout, -1, -2, true);
                                                popupWindow.setAnimationStyle(R.style.PopupWindowAnimation);
                                                int iB = d70.b.b(12);
                                                int[] iArr = {0, 0};
                                                imageView.getLocationOnScreen(iArr);
                                                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                                                Object[] objArr = (displayMetrics.heightPixels / 2) - iArr[1] > 0;
                                                viewT2.setVisibility(objArr != false ? 0 : 8);
                                                viewT.setVisibility(objArr == true ? 8 : 0);
                                                int iA = objArr != false ? (iArr[1] + iB) - d70.b.a(0) : (displayMetrics.heightPixels - iArr[1]) + iB + d70.b.a(0);
                                                guideline.setGuidelinePercent((iArr[0] + (imageView.getWidth() / 2)) / displayMetrics.widthPixels);
                                                popupWindow.showAtLocation(imageView, objArr != false ? 48 : 80, 0, iA);
                                                imageView2.setOnClickListener(new ax.s(popupWindow, 4));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i14 = i15;
                    }
                }
                c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i14)));
                break;
            case 3:
                Order order = (Order) obj2;
                br.m mVar = (br.m) obj;
                int i16 = br.m.f6646e;
                String invitationId = order.getInvitationId();
                if (invitationId != null) {
                    Function2 function2 = mVar.f6648b;
                    if (function2 != null) {
                        function2.invoke(invitationId, order.getOrderType());
                        unit = Unit.f26487a;
                    }
                    if (unit != null) {
                    }
                }
                Function2 function22 = mVar.f6649c;
                if (function22 != null) {
                    function22.invoke(OrderId.m209boximpl(order.m429getOrderIdreIZeYA()), order.getOrderType());
                }
                break;
            case 4:
                CardBrandItemViewHolder.bind$lambda$0((Function1) obj2, (CardBrandItem) obj, view);
                break;
            case 5:
                IssuerListRecyclerAdapter.IssuerViewHolder.bind$lambda$0((Function1) obj2, (IssuerModel) obj, view);
                break;
            case 6:
                FullQRCodeView.initView$lambda$1((QRCodeDelegate) obj2, (FullQRCodeView) obj, view);
                break;
            case 7:
                SimpleQRCodeView.initView$lambda$2((SimpleQRCodeView) obj2, (QRCodeDelegate) obj, view);
                break;
            case 8:
                AddressLookupOptionsAdapter.AddressLookupOptionViewHolder.bindItem$lambda$0((AddressLookupOptionsAdapter.AddressLookupOptionViewHolder) obj2, (LookupOption) obj, view);
                break;
            case 9:
                FullVoucherView.updateReadInstructionTextView$lambda$12$lambda$11((FullVoucherView) obj2, (String) obj, view);
                break;
            case 10:
                FullVoucherView.initView$lambda$2((FullVoucherView) obj2, (VoucherDelegate) obj, view);
                break;
            case 11:
                SimpleVoucherView.initView$lambda$1((VoucherDelegate) obj2, (SimpleVoucherView) obj, view);
                break;
            case 12:
                InAppMessageFullView.resetMessageMargins$lambda$3$lambda$2((InAppMessageFullView) obj2, (View) obj, view);
                break;
            case 13:
                int i17 = TrackingConsentActivity.f9336k;
                ((TrackingConsentActivity) obj2).a0().c(((q3) obj).f35084u.isChecked());
                break;
            case 14:
                int i18 = AddressEditText.f8926f;
                k0 k0Var = new k0((Activity) obj2);
                k0Var.e(R.string.mnu_checkout_address_change_email_popup_title);
                k0Var.a(R.string.mnu_checkout_address_change_email_popup_body_new);
                k0Var.c(R.string.mnu_checkout_address_change_email_popup_button);
                k0Var.l = new iu.a(25);
                View view2 = ((AddressEditText) obj).f8927a.f986f;
                view2.getClass();
                k0Var.f6184p = view2;
                k0Var.f();
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((nm.e) ((mm.b) ((k8.d) obj2).f26135c)).v((FlashSalesItem) obj);
                break;
            case 16:
                ((ax.s) obj).onClick(view);
                ((q20.h) obj2).a(1);
                break;
            case 17:
                ContactUsActivity contactUsActivity = (ContactUsActivity) obj2;
                BriefOrder briefOrder = (BriefOrder) obj;
                int i19 = ContactUsActivity.f9367t;
                contactUsActivity.F().f9392m = briefOrder;
                contactUsActivity.U(briefOrder);
                contactUsActivity.H();
                break;
            case 18:
                t40.b bVar = (t40.b) obj2;
                ContactUsActivity contactUsActivity2 = (ContactUsActivity) obj;
                if (bVar instanceof wr.b) {
                    int i21 = ContactUsActivity.f9367t;
                    contactUsActivity2.J((wr.b) bVar, true);
                } else if (bVar instanceof wr.e) {
                    int i22 = ContactUsActivity.f9367t;
                    contactUsActivity2.L((wr.e) bVar);
                }
                break;
            case 19:
                k.f fVar = (k.f) obj;
                uk.c cVar2 = ((uk.q) obj2).f41353f;
                if (cVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewFragment");
                } else {
                    cVar = cVar2;
                }
                ky.p pVarP = cVar.p();
                androidx.fragment.app.o0 o0VarRequireActivity = cVar.requireActivity();
                o0VarRequireActivity.getClass();
                pVarP.getClass();
                ky.p.r(o0VarRequireActivity);
                fVar.dismiss();
                break;
            default:
                ((Function1) obj2).invoke((ArticleAttachmentItem) obj);
                break;
        }
    }

    public /* synthetic */ n0(int i11, Object obj, Object obj2) {
        this.f6207a = i11;
        this.f6208b = obj;
        this.f6209c = obj2;
    }
}

package mr;

import android.app.ActivityOptions;
import android.content.Intent;
import android.webkit.WebView;
import android.widget.PopupWindow;
import androidx.activity.y;
import androidx.fragment.app.o0;
import androidx.viewpager2.widget.ViewPager2;
import com.app.tgtg.R;
import com.app.tgtg.feature.ServerMessageActivity;
import com.app.tgtg.feature.bucketlist.ui.BucketListActivity;
import com.app.tgtg.feature.catering.ui.CateringItemDetailsActivity;
import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.app.tgtg.feature.logincharity.ui.LoginCharityActivity;
import com.app.tgtg.feature.main.fragments.delivery.basket.ui.ParcelBasketActivity;
import com.app.tgtg.feature.main.fragments.delivery.parcelfeed.about.ManufacturerAboutActivity;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.feature.postpurchase.phone.AddPhoneNumberFragment;
import com.app.tgtg.feature.storeview.ui.StoreViewActivity;
import com.app.tgtg.feature.tabprofile.c2creferral.ui.InviteFriendsActivity;
import com.app.tgtg.feature.tabprofile.impact.co2esaved.Co2eSavedActivity;
import com.app.tgtg.feature.tabprofile.impact.moneysaved.MoneySavedActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.edit.EditDataActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.autorefund.AutoRefundActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.specialrewards.SpecialRewardsActivity;
import com.app.tgtg.feature.tabprofile.storelogin.ui.StoreLoginActivity;
import com.app.tgtg.model.local.AppConstants;
import kotlin.jvm.internal.Intrinsics;
import mv.a0;
import mv.r0;
import mv.z;
import o30.e0;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.f2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30082b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, int i11) {
        super(true);
        this.f30081a = i11;
        this.f30082b = obj;
    }

    @Override // androidx.activity.y
    public final void handleOnBackPressed() {
        int i11 = this.f30081a;
        Object obj = this.f30082b;
        switch (i11) {
            case 0:
                r0.m((EditDataActivity) obj, (6 & 2) == 0, (6 & 4) == 0);
                break;
            case 1:
                r0.m((SurpriseBagOrderActivity) obj, (6 & 2) == 0, (6 & 4) == 0);
                break;
            case 2:
                r0.m((SpecialRewardsActivity) obj, true, true);
                break;
            case 3:
                BucketListActivity bucketListActivity = (BucketListActivity) obj;
                bucketListActivity.setResult(-1, new Intent());
                bucketListActivity.finish();
                break;
            case 4:
                ItemViewActivity itemViewActivity = (ItemViewActivity) obj;
                itemViewActivity.C(itemViewActivity, itemViewActivity.isTaskRoot());
                break;
            case 5:
                r0.m((InviteFriendsActivity) obj, true, true);
                break;
            case 6:
                ServerMessageActivity serverMessageActivity = (ServerMessageActivity) obj;
                if (!serverMessageActivity.f8957c) {
                    serverMessageActivity.setResult(1);
                    serverMessageActivity.finish();
                }
                break;
            case 7:
                ContactUsActivity contactUsActivity = (ContactUsActivity) obj;
                int i12 = ContactUsActivity.f9367t;
                PopupWindow popupWindow = ((sr.q) contactUsActivity.f9375n.getValue()).f39115d;
                if (popupWindow == null || !popupWindow.isShowing()) {
                    if (contactUsActivity.isTaskRoot()) {
                        new a0().c(contactUsActivity);
                    } else {
                        contactUsActivity.finish();
                    }
                    if (!contactUsActivity.F().f9389i) {
                        contactUsActivity.overridePendingTransition(R.anim.slide_in_from_left_to_right, R.anim.slide_out_from_left_to_right);
                    } else {
                        contactUsActivity.overridePendingTransition(R.anim.stay, R.anim.slide_out_from_top_to_bottom);
                    }
                }
                break;
            case 8:
                AutoRefundActivity autoRefundActivity = (AutoRefundActivity) obj;
                int i13 = AutoRefundActivity.f9403j;
                PopupWindow popupWindow2 = ((sr.q) autoRefundActivity.f9410h.getValue()).f39115d;
                if (popupWindow2 != null) {
                    popupWindow2.dismiss();
                }
                autoRefundActivity.setResult(AppConstants.RESULT_CODE_AUTO_REFUND);
                autoRefundActivity.finish();
                ActivityOptions.makeCustomAnimation(autoRefundActivity, R.anim.stay, R.anim.slide_out_from_top_to_bottom).toBundle().getClass();
                break;
            case 9:
                CateringItemDetailsActivity cateringItemDetailsActivity = (CateringItemDetailsActivity) obj;
                cateringItemDetailsActivity.G();
                cateringItemDetailsActivity.C(cateringItemDetailsActivity, cateringItemDetailsActivity.isTaskRoot());
                break;
            case 10:
                ParcelBasketActivity parcelBasketActivity = (ParcelBasketActivity) obj;
                parcelBasketActivity.C(parcelBasketActivity, parcelBasketActivity.isTaskRoot());
                break;
            case 11:
                r0.m((Co2eSavedActivity) obj, true, true);
                break;
            case 12:
                qo.h.c((qo.h) ((AddPhoneNumberFragment) obj).f9217f.getValue());
                break;
            case 13:
                LoginCharityActivity loginCharityActivity = (LoginCharityActivity) obj;
                loginCharityActivity.finish();
                loginCharityActivity.overridePendingTransition(R.anim.slide_in_from_left_to_right, R.anim.slide_out_from_left_to_right);
                break;
            case 14:
                ManufacturerAboutActivity manufacturerAboutActivity = (ManufacturerAboutActivity) obj;
                f2 f2Var = manufacturerAboutActivity.f9121e;
                f2Var.getClass();
                if (f2Var.f34863t.getCurrentItem() != 0) {
                    f2 f2Var2 = manufacturerAboutActivity.f9121e;
                    f2Var2.getClass();
                    ViewPager2 viewPager2 = f2Var2.f34863t;
                    viewPager2.getClass();
                    pd.g.G(viewPager2);
                } else {
                    manufacturerAboutActivity.finish();
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                StoreViewActivity storeViewActivity = (StoreViewActivity) obj;
                if (storeViewActivity.isTaskRoot()) {
                    a0 a0Var = new a0();
                    z zVar = z.DISCOVER;
                    zVar.getClass();
                    a0Var.f30138a = zVar;
                    a0Var.f30144g = true;
                    a0Var.c(storeViewActivity);
                }
                storeViewActivity.finish();
                break;
            case 16:
                r0.m((MoneySavedActivity) obj, true, true);
                break;
            case 17:
                r0.m((StoreLoginActivity) obj, (6 & 2) == 0, (6 & 4) == 0);
                break;
            default:
                zs.j jVar = (zs.j) obj;
                WebView webView = jVar.f48090j;
                WebView webView2 = null;
                if (webView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webView");
                    webView = null;
                }
                if (!webView.canGoBack()) {
                    g9.p pVarT = e0.t(jVar);
                    o0 o0VarRequireActivity = jVar.requireActivity();
                    o0VarRequireActivity.getClass();
                    zs.j.s(pVarT, o0VarRequireActivity);
                } else {
                    WebView webView3 = jVar.f48090j;
                    if (webView3 != null) {
                        webView2 = webView3;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("webView");
                    }
                    webView2.goBack();
                }
                break;
        }
    }
}

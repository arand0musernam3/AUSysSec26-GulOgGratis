package k;

import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.appcompat.app.AppCompatDelegate;
import ao.g3;
import com.app.tgtg.feature.bucketlist.ui.BucketListActivity;
import com.app.tgtg.feature.catering.ui.CateringItemDetailsActivity;
import com.app.tgtg.feature.deeplink.DeepLinkActivity;
import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.app.tgtg.feature.locationpicker.LocationPickerActivity;
import com.app.tgtg.feature.login.optin.OptInActivity;
import com.app.tgtg.feature.login.terms.TermsAccessActivity;
import com.app.tgtg.feature.logincharity.ui.LoginCharityActivity;
import com.app.tgtg.feature.main.fragments.delivery.basket.ui.ParcelBasketActivity;
import com.app.tgtg.feature.main.fragments.delivery.parcelfeed.about.ManufacturerAboutActivity;
import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.feature.postpurchase.PostPurchaseActivity;
import com.app.tgtg.feature.storeview.ui.StoreViewActivity;
import com.app.tgtg.feature.tabprofile.c2creferral.ui.InviteFriendsActivity;
import com.app.tgtg.feature.tabprofile.impact.co2esaved.Co2eSavedActivity;
import com.app.tgtg.feature.tabprofile.impact.moneysaved.MoneySavedActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.edit.EditDataActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.autorefund.AutoRefundActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.paymentoptions.PaymentOptionsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.specialrewards.SpecialRewardsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherExperienceActivity;
import com.app.tgtg.feature.tabprofile.storelogin.ui.StoreLoginActivity;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements OnContextAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f25567b;

    public /* synthetic */ g(h hVar, int i11) {
        this.f25566a = i11;
        this.f25567b = hVar;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void a(ComponentActivity componentActivity) {
        switch (this.f25566a) {
            case 0:
                h hVar = this.f25567b;
                AppCompatDelegate delegate = hVar.getDelegate();
                delegate.o();
                delegate.t(hVar.getSavedStateRegistry().a("androidx:appcompat"));
                break;
            case 1:
                PaymentOptionsActivity paymentOptionsActivity = (PaymentOptionsActivity) this.f25567b;
                if (!paymentOptionsActivity.f9431d) {
                    paymentOptionsActivity.f9431d = true;
                    ((ks.f) paymentOptionsActivity.a()).getClass();
                }
                break;
            case 2:
                OptInActivity optInActivity = (OptInActivity) this.f25567b;
                if (!optInActivity.f1479e) {
                    optInActivity.f1479e = true;
                    optInActivity.f9060g = (e70.c) ((ag.b) ((ll.d) optInActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 3:
                ManufacturerOrderActivity manufacturerOrderActivity = (ManufacturerOrderActivity) this.f25567b;
                if (!manufacturerOrderActivity.f1479e) {
                    manufacturerOrderActivity.f1479e = true;
                    ag.b bVar = (ag.b) ((lo.n) manufacturerOrderActivity.a());
                    manufacturerOrderActivity.f9168f = (e70.c) bVar.f1288a.f1325h0.get();
                    manufacturerOrderActivity.f9175n = new se.d((g3) bVar.f1288a.J.get());
                }
                break;
            case 4:
                EditDataActivity editDataActivity = (EditDataActivity) this.f25567b;
                if (!editDataActivity.f1479e) {
                    editDataActivity.f1479e = true;
                    editDataActivity.f9360f = (e70.c) ((ag.b) ((mr.g) editDataActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 5:
                ((SurpriseBagOrderActivity) this.f25567b).D();
                break;
            case 6:
                SpecialRewardsActivity specialRewardsActivity = (SpecialRewardsActivity) this.f25567b;
                if (!specialRewardsActivity.f9437d) {
                    specialRewardsActivity.f9437d = true;
                    ((ns.d) specialRewardsActivity.a()).getClass();
                }
                break;
            case 7:
                BucketListActivity bucketListActivity = (BucketListActivity) this.f25567b;
                if (!bucketListActivity.f1479e) {
                    bucketListActivity.f1479e = true;
                    bucketListActivity.f8969f = (e70.c) ((ag.b) ((oh.b) bucketListActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 8:
                TermsAccessActivity termsAccessActivity = (TermsAccessActivity) this.f25567b;
                if (!termsAccessActivity.f1479e) {
                    termsAccessActivity.f1479e = true;
                    termsAccessActivity.f9065f = (e70.c) ((ag.b) ((pl.c) termsAccessActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 9:
                DeepLinkActivity deepLinkActivity = (DeepLinkActivity) this.f25567b;
                if (!deepLinkActivity.f1479e) {
                    deepLinkActivity.f1479e = true;
                    deepLinkActivity.f8991h = (e70.c) ((ag.b) ((qj.c) deepLinkActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 10:
                ((ItemViewActivity) this.f25567b).D();
                break;
            case 11:
                PostPurchaseActivity postPurchaseActivity = (PostPurchaseActivity) this.f25567b;
                if (!postPurchaseActivity.f1479e) {
                    postPurchaseActivity.f1479e = true;
                    postPurchaseActivity.f9194f = (e70.c) ((ag.b) ((qo.e) postPurchaseActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 12:
                VoucherActivity voucherActivity = (VoucherActivity) this.f25567b;
                if (!voucherActivity.f1479e) {
                    voucherActivity.f1479e = true;
                    voucherActivity.f9441f = (e70.c) ((ag.b) ((qs.d) voucherActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 13:
                VoucherExperienceActivity voucherExperienceActivity = (VoucherExperienceActivity) this.f25567b;
                if (!voucherExperienceActivity.f37249e) {
                    voucherExperienceActivity.f37249e = true;
                    voucherExperienceActivity.f9444f = (e70.c) ((ag.b) ((qs.g) voucherExperienceActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 14:
                InviteFriendsActivity inviteFriendsActivity = (InviteFriendsActivity) this.f25567b;
                if (!inviteFriendsActivity.f37249e) {
                    inviteFriendsActivity.f37249e = true;
                    ag.i iVar = ((ag.b) ((rq.b) inviteFriendsActivity.a())).f1288a;
                    inviteFriendsActivity.f9303g = (e70.c) iVar.f1325h0.get();
                    inviteFriendsActivity.f9304h = (f70.g) iVar.f1321f0.get();
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((en.g) this.f25567b).D();
                break;
            case 16:
                ContactUsActivity contactUsActivity = (ContactUsActivity) this.f25567b;
                if (!contactUsActivity.f37249e) {
                    contactUsActivity.f37249e = true;
                    contactUsActivity.f9368f = (e70.c) ((ag.b) ((sr.o) contactUsActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 17:
                AutoRefundActivity autoRefundActivity = (AutoRefundActivity) this.f25567b;
                if (!autoRefundActivity.f9406d) {
                    autoRefundActivity.f9406d = true;
                    ((tr.d) autoRefundActivity.a()).getClass();
                }
                break;
            case 18:
                ((CateringItemDetailsActivity) this.f25567b).D();
                break;
            case 19:
                LocationPickerActivity locationPickerActivity = (LocationPickerActivity) this.f25567b;
                if (!locationPickerActivity.f37249e) {
                    locationPickerActivity.f37249e = true;
                    ((uk.a) locationPickerActivity.a()).getClass();
                }
                break;
            case 20:
                ((ParcelBasketActivity) this.f25567b).D();
                break;
            case 21:
                Co2eSavedActivity co2eSavedActivity = (Co2eSavedActivity) this.f25567b;
                if (!co2eSavedActivity.f9309d) {
                    co2eSavedActivity.f9309d = true;
                    ((uq.c) co2eSavedActivity.a()).getClass();
                }
                break;
            case 22:
                LoginCharityActivity loginCharityActivity = (LoginCharityActivity) this.f25567b;
                if (!loginCharityActivity.f37249e) {
                    loginCharityActivity.f37249e = true;
                    loginCharityActivity.f9076g = (e70.c) ((ag.b) ((wl.b) loginCharityActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 23:
                ManufacturerAboutActivity manufacturerAboutActivity = (ManufacturerAboutActivity) this.f25567b;
                if (!manufacturerAboutActivity.f9120d) {
                    manufacturerAboutActivity.f9120d = true;
                }
                break;
            case 24:
                StoreViewActivity storeViewActivity = (StoreViewActivity) this.f25567b;
                if (!storeViewActivity.f37249e) {
                    storeViewActivity.f37249e = true;
                    storeViewActivity.f9250g = (e70.c) ((ag.b) ((zp.d) storeViewActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 25:
                MoneySavedActivity moneySavedActivity = (MoneySavedActivity) this.f25567b;
                if (!moneySavedActivity.f9315d) {
                    moneySavedActivity.f9315d = true;
                    ((zq.e) moneySavedActivity.a()).getClass();
                }
                break;
            default:
                StoreLoginActivity storeLoginActivity = (StoreLoginActivity) this.f25567b;
                if (!storeLoginActivity.f9452d) {
                    storeLoginActivity.f9452d = true;
                    ((zs.g) storeLoginActivity.a()).getClass();
                }
                break;
        }
    }
}

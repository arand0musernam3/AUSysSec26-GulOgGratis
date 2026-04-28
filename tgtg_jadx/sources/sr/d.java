package sr;

import androidx.lifecycle.m1;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel;
import com.app.tgtg.model.remote.brief.BriefOrder;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContactUsActivity f39098b;

    public /* synthetic */ d(ContactUsActivity contactUsActivity, int i11) {
        this.f39097a = i11;
        this.f39098b = contactUsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f39097a;
        ContactUsActivity contactUsActivity = this.f39098b;
        switch (i11) {
            case 0:
                int i12 = ContactUsActivity.f9367t;
                BriefOrder briefOrder = contactUsActivity.F().f9392m;
                if (briefOrder != null) {
                    String strM321getOrderIdreIZeYA = briefOrder.m321getOrderIdreIZeYA();
                    ContactUsViewModel contactUsViewModelF = contactUsActivity.F();
                    contactUsViewModelF.getClass();
                    strM321getOrderIdreIZeYA.getClass();
                    f0.B(m1.d(contactUsViewModelF), null, null, new t(contactUsViewModelF, strM321getOrderIdreIZeYA, null, 0), 3);
                }
                contactUsActivity.E();
                break;
            case 1:
                int i13 = ContactUsActivity.f9367t;
                contactUsActivity.E();
                break;
            default:
                int i14 = ContactUsActivity.f9367t;
                contactUsActivity.Q(R.string.contact_us_helper_box_general_title);
                contactUsActivity.P(R.string.contact_us_helper_box_general_description);
                contactUsActivity.C();
                break;
        }
    }
}

package sr;

import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.edit.EditDataActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContactUsActivity f39094b;

    public /* synthetic */ b(ContactUsActivity contactUsActivity, int i11) {
        this.f39093a = i11;
        this.f39094b = contactUsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f39093a;
        ContactUsActivity contactUsActivity = this.f39094b;
        switch (i11) {
            case 0:
                int i12 = ContactUsActivity.f9367t;
                ContactUsViewModel contactUsViewModelF = contactUsActivity.F();
                or.a aVar = or.a.EMAIL;
                contactUsViewModelF.getClass();
                aVar.getClass();
                vr.a aVar2 = contactUsViewModelF.f9388h;
                aVar2.getClass();
                aVar2.f42516a.a(new f70.b(EditDataActivity.class, jb.u.x(new Pair("DATA", aVar)), false, false, false, null, null, null, null, false, 1020));
                break;
            case 1:
                int i13 = ContactUsActivity.f9367t;
                break;
            case 2:
                int i14 = ContactUsActivity.f9367t;
                contactUsActivity.M();
                break;
            case 3:
                int i15 = ContactUsActivity.f9367t;
                contactUsActivity.K(true);
                break;
            case 4:
                int i16 = ContactUsActivity.f9367t;
                contactUsActivity.D(true);
                break;
            default:
                int i17 = ContactUsActivity.f9367t;
                contactUsActivity.D(true);
                break;
        }
        return Unit.f26487a;
    }
}

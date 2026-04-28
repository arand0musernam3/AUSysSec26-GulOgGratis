package sr;

import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContactUsActivity f39111b;

    public /* synthetic */ n(ContactUsActivity contactUsActivity, int i11) {
        this.f39110a = i11;
        this.f39111b = contactUsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f39110a) {
            case 0:
                return this.f39111b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f39111b.getViewModelStore();
            default:
                return this.f39111b.getDefaultViewModelCreationExtras();
        }
    }
}

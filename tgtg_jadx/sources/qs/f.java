package qs;

import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherExperienceActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VoucherExperienceActivity f37257b;

    public /* synthetic */ f(VoucherExperienceActivity voucherExperienceActivity, int i11) {
        this.f37256a = i11;
        this.f37257b = voucherExperienceActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37256a) {
            case 0:
                return this.f37257b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f37257b.getViewModelStore();
            default:
                return this.f37257b.getDefaultViewModelCreationExtras();
        }
    }
}

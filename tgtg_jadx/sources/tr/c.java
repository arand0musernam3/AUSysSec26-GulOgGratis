package tr;

import com.app.tgtg.feature.tabprofile.manageaccount.contactus.autorefund.AutoRefundActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AutoRefundActivity f40427b;

    public /* synthetic */ c(AutoRefundActivity autoRefundActivity, int i11) {
        this.f40426a = i11;
        this.f40427b = autoRefundActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40426a) {
            case 0:
                return this.f40427b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f40427b.getViewModelStore();
            default:
                return this.f40427b.getDefaultViewModelCreationExtras();
        }
    }
}

package ks;

import com.app.tgtg.feature.tabprofile.manageaccount.paymentoptions.PaymentOptionsActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentOptionsActivity f26664b;

    public /* synthetic */ e(PaymentOptionsActivity paymentOptionsActivity, int i11) {
        this.f26663a = i11;
        this.f26664b = paymentOptionsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f26663a) {
            case 0:
                return this.f26664b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f26664b.getViewModelStore();
            default:
                return this.f26664b.getDefaultViewModelCreationExtras();
        }
    }
}

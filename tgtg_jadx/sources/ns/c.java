package ns;

import com.app.tgtg.feature.tabprofile.manageaccount.specialrewards.SpecialRewardsActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SpecialRewardsActivity f31377b;

    public /* synthetic */ c(SpecialRewardsActivity specialRewardsActivity, int i11) {
        this.f31376a = i11;
        this.f31377b = specialRewardsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f31376a) {
            case 0:
                return this.f31377b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f31377b.getViewModelStore();
            default:
                return this.f31377b.getDefaultViewModelCreationExtras();
        }
    }
}

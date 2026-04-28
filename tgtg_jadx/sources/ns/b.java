package ns;

import androidx.lifecycle.m1;
import com.app.tgtg.feature.tabprofile.manageaccount.specialrewards.SpecialRewardsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SpecialRewardsActivity f31375b;

    public /* synthetic */ b(SpecialRewardsActivity specialRewardsActivity, int i11) {
        this.f31374a = i11;
        this.f31375b = specialRewardsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f31374a;
        SpecialRewardsActivity specialRewardsActivity = this.f31375b;
        switch (i11) {
            case 0:
                int i12 = SpecialRewardsActivity.f9434g;
                g gVarA = specialRewardsActivity.A();
                f0.B(m1.d(gVarA), null, null, new f(gVarA, null, 1), 3);
                break;
            case 1:
                int i13 = SpecialRewardsActivity.f9434g;
                specialRewardsActivity.getOnBackPressedDispatcher().d();
                break;
            default:
                int i14 = SpecialRewardsActivity.f9434g;
                specialRewardsActivity.getOnBackPressedDispatcher().d();
                break;
        }
        return Unit.f26487a;
    }
}

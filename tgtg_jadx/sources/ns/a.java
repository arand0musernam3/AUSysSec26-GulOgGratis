package ns;

import com.app.tgtg.feature.tabprofile.manageaccount.specialrewards.SpecialRewardsActivity;
import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SpecialRewardsActivity f31372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f31373c;

    public /* synthetic */ a(SpecialRewardsActivity specialRewardsActivity, b1 b1Var, int i11) {
        this.f31371a = i11;
        this.f31372b = specialRewardsActivity;
        this.f31373c = b1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f31371a;
        b1 b1Var = this.f31373c;
        SpecialRewardsActivity specialRewardsActivity = this.f31372b;
        SpecialReward specialReward = (SpecialReward) obj;
        switch (i11) {
            case 0:
                int i12 = SpecialRewardsActivity.f9434g;
                specialReward.getClass();
                specialRewardsActivity.A().f31386d = specialReward;
                specialRewardsActivity.A().b();
                b1Var.setValue(Boolean.TRUE);
                break;
            default:
                int i13 = SpecialRewardsActivity.f9434g;
                specialReward.getClass();
                specialRewardsActivity.A().f31386d = specialReward;
                specialRewardsActivity.A().b();
                b1Var.setValue(Boolean.TRUE);
                break;
        }
        return Unit.f26487a;
    }
}

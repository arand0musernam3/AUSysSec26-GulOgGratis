package rn;

import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProfileFeature f38152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f38153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f38154d;

    public /* synthetic */ e(ProfileFeature profileFeature, b1 b1Var, Function0 function0, int i11) {
        this.f38151a = i11;
        this.f38152b = profileFeature;
        this.f38153c = b1Var;
        this.f38154d = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f38151a) {
            case 0:
                if (this.f38152b.getFeatureType() == ProfileFeatureType.C2C_REFERRAL_ALWAYS_ON_INCENTIVIZED) {
                    ft.c.U("END");
                    this.f38153c.setValue(Boolean.TRUE);
                    this.f38154d.invoke();
                }
                break;
            default:
                if (this.f38152b.getFeatureType() == ProfileFeatureType.C2C_REFERRAL_ALWAYS_ON_INCENTIVIZED) {
                    ft.c.U("END");
                    this.f38153c.setValue(Boolean.TRUE);
                    this.f38154d.invoke();
                }
                break;
        }
        return Unit.f26487a;
    }
}

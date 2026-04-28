package rn;

import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProfileFeature f38149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f38150c;

    public /* synthetic */ d(ProfileFeature profileFeature, Function1 function1) {
        this.f38148a = 1;
        this.f38149b = profileFeature;
        this.f38150c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f38148a) {
            case 0:
                this.f38150c.invoke(this.f38149b.getFeatureState());
                break;
            case 1:
                ProfileFeature profileFeature = this.f38149b;
                if (profileFeature.getFeatureType() == ProfileFeatureType.C2C_REFERRAL_ALWAYS_ON_INCENTIVIZED) {
                    ft.c.U("ACTIVE");
                } else {
                    this.f38150c.invoke(profileFeature.getFeatureState());
                }
                break;
            default:
                this.f38150c.invoke(this.f38149b.getFeatureState());
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ d(Function1 function1, ProfileFeature profileFeature, int i11) {
        this.f38148a = i11;
        this.f38150c = function1;
        this.f38149b = profileFeature;
    }
}

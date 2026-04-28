package go;

import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharityOrderActivity f20738b;

    public /* synthetic */ m(CharityOrderActivity charityOrderActivity, int i11) {
        this.f20737a = i11;
        this.f20738b = charityOrderActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20737a) {
            case 0:
                return this.f20738b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f20738b.getViewModelStore();
            default:
                return this.f20738b.getDefaultViewModelCreationExtras();
        }
    }
}

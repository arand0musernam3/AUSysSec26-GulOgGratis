package um;

import com.app.tgtg.feature.main.fragments.delivery.basket.ui.ParcelBasketActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParcelBasketActivity f41398b;

    public /* synthetic */ j(ParcelBasketActivity parcelBasketActivity, int i11) {
        this.f41397a = i11;
        this.f41398b = parcelBasketActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41397a) {
            case 0:
                return this.f41398b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f41398b.getViewModelStore();
            default:
                return this.f41398b.getDefaultViewModelCreationExtras();
        }
    }
}

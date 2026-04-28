package en;

import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManufacturerItemDetailsActivity f16154b;

    public /* synthetic */ k(int i11, ManufacturerItemDetailsActivity manufacturerItemDetailsActivity) {
        this.f16153a = i11;
        this.f16154b = manufacturerItemDetailsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16153a) {
            case 0:
                return this.f16154b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f16154b.getViewModelStore();
            default:
                return this.f16154b.getDefaultViewModelCreationExtras();
        }
    }
}

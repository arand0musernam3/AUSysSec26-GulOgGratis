package dk;

import com.app.tgtg.feature.flashsales.list.FlashSalesListActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlashSalesListActivity f14953b;

    public /* synthetic */ c(FlashSalesListActivity flashSalesListActivity, int i11) {
        this.f14952a = i11;
        this.f14953b = flashSalesListActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f14952a) {
            case 0:
                return this.f14953b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f14953b.getViewModelStore();
            default:
                return this.f14953b.getDefaultViewModelCreationExtras();
        }
    }
}

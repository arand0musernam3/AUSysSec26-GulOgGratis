package um;

import com.app.tgtg.feature.main.fragments.delivery.basket.ui.ParcelBasketActivity;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.manufacturer.request.BasketBriefItem;
import java.util.List;
import yi.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ParcelBasketActivity f41396a;

    public /* synthetic */ h(ParcelBasketActivity parcelBasketActivity) {
        this.f41396a = parcelBasketActivity;
    }

    public void a() {
        int i11 = ParcelBasketActivity.f9111k;
        ParcelBasketActivity parcelBasketActivity = this.f41396a;
        BasketManager basketManager = parcelBasketActivity.E().f41434j;
        List<BasketBriefItem> basketItems = basketManager != null ? basketManager.getBasketItems() : null;
        if (basketItems == null || basketItems.isEmpty()) {
            parcelBasketActivity.getOnBackPressedDispatcher().d();
        } else {
            parcelBasketActivity.E().j();
        }
    }

    @Override // yi.v
    public void b() {
        int i11 = ParcelBasketActivity.f9111k;
        this.f41396a.E().i(true);
    }
}

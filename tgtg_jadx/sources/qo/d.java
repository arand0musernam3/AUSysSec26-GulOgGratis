package qo;

import com.app.tgtg.feature.postpurchase.PostPurchaseActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PostPurchaseActivity f37205b;

    public /* synthetic */ d(PostPurchaseActivity postPurchaseActivity, int i11) {
        this.f37204a = i11;
        this.f37205b = postPurchaseActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37204a) {
            case 0:
                return this.f37205b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f37205b.getViewModelStore();
            default:
                return this.f37205b.getDefaultViewModelCreationExtras();
        }
    }
}

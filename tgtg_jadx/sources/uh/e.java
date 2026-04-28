package uh;

import com.app.tgtg.feature.catering.ui.CateringItemDetailsActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CateringItemDetailsActivity f41152b;

    public /* synthetic */ e(CateringItemDetailsActivity cateringItemDetailsActivity, int i11) {
        this.f41151a = i11;
        this.f41152b = cateringItemDetailsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41151a) {
            case 0:
                return this.f41152b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f41152b.getViewModelStore();
            default:
                return this.f41152b.getDefaultViewModelCreationExtras();
        }
    }
}

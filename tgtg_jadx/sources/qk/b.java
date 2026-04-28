package qk;

import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ItemViewActivity f37166b;

    public /* synthetic */ b(ItemViewActivity itemViewActivity, int i11) {
        this.f37165a = i11;
        this.f37166b = itemViewActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37165a) {
            case 0:
                return this.f37166b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f37166b.getViewModelStore();
            default:
                return this.f37166b.getDefaultViewModelCreationExtras();
        }
    }
}

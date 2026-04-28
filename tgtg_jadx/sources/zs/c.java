package zs;

import bg.c0;
import com.app.tgtg.feature.tabprofile.storelogin.ui.RecommendStoreFragment;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecommendStoreFragment f48061b;

    public /* synthetic */ c(RecommendStoreFragment recommendStoreFragment, int i11) {
        this.f48060a = i11;
        this.f48061b = recommendStoreFragment;
    }

    @Override // bg.c0
    public final void h(String str) {
        int i11 = this.f48060a;
        str.getClass();
        switch (i11) {
            case 0:
                RecommendStoreFragment recommendStoreFragment = this.f48061b;
                recommendStoreFragment.u().f48067f = str;
                RecommendStoreFragment.t(recommendStoreFragment);
                break;
            default:
                RecommendStoreFragment recommendStoreFragment2 = this.f48061b;
                recommendStoreFragment2.u().f48071j = str;
                RecommendStoreFragment.t(recommendStoreFragment2);
                break;
        }
    }
}

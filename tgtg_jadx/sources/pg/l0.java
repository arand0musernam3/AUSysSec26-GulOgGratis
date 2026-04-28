package pg;

import android.view.View;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.quickFilters.FilterNoResultView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FilterNoResultView f34969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FilterNoResultView f34970b;

    public l0(FilterNoResultView filterNoResultView, FilterNoResultView filterNoResultView2) {
        this.f34969a = filterNoResultView;
        this.f34970b = filterNoResultView2;
    }

    @Override // sa.a
    public final View getRoot() {
        return this.f34969a;
    }
}

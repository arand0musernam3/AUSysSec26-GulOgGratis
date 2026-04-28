package pg;

import android.view.View;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.quickFilters.QuickFilterView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QuickFilterView f35145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final QuickFilterView f35146b;

    public s0(QuickFilterView quickFilterView, QuickFilterView quickFilterView2) {
        this.f35145a = quickFilterView;
        this.f35146b = quickFilterView2;
    }

    @Override // sa.a
    public final View getRoot() {
        return this.f35145a;
    }
}

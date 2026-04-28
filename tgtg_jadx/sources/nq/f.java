package nq;

import com.app.tgtg.R;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DiscoverBucket f31355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31357c = R.layout.discover_flash_sales_view;

    public f(DiscoverBucket discoverBucket) {
        this.f31355a = discoverBucket;
        this.f31356b = discoverBucket.getTitle();
    }

    @Override // nq.d
    public final int getLayoutFile() {
        return this.f31357c;
    }

    @Override // nq.d
    public final String getTitle() {
        return this.f31356b;
    }
}

package nq;

import com.app.tgtg.R;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DiscoverBucket f31348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31349b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31350c = R.layout.discover_delivery_card;

    public b(DiscoverBucket discoverBucket) {
        this.f31348a = discoverBucket;
    }

    @Override // nq.d
    public final int getLayoutFile() {
        return this.f31350c;
    }

    @Override // nq.d
    public final String getTitle() {
        return this.f31349b;
    }
}

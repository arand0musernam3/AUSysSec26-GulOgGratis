package nq;

import com.app.tgtg.R;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DiscoverBucket f31366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31367b = R.layout.discover_rating_compose;

    public k(DiscoverBucket discoverBucket) {
        this.f31366a = discoverBucket;
    }

    @Override // nq.d
    public final int getLayoutFile() {
        return this.f31367b;
    }
}

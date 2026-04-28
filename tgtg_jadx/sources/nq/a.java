package nq;

import com.app.tgtg.R;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DiscoverBucket f31345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31347c = R.layout.discover_almost_sold_out_view;

    public a(DiscoverBucket discoverBucket, boolean z11) {
        this.f31345a = discoverBucket;
        this.f31346b = z11;
    }

    @Override // nq.d
    public final boolean equals(Object obj) {
        return false;
    }

    @Override // nq.d
    public final int getLayoutFile() {
        return this.f31347c;
    }
}

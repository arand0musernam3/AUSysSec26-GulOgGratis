package pg;

import android.view.View;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.StoreReferralCardComposeView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends a8.k {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f35203u = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final StoreReferralCardComposeView f35204s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f35205t;

    public v0(a8.b bVar, View view, StoreReferralCardComposeView storeReferralCardComposeView) {
        super(0, view, bVar);
        this.f35204s = storeReferralCardComposeView;
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f35205t = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f35205t != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a8.k
    public final boolean c0(int i11, Object obj) {
        return false;
    }

    public final void f0() {
        synchronized (this) {
            this.f35205t = 1L;
        }
        e0();
    }
}

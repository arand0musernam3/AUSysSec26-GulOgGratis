package pg;

import android.util.SparseIntArray;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r3 extends q3 {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 1);
        sparseIntArray.put(R.id.topBar, 2);
        sparseIntArray.put(R.id.toolBarBorder, 3);
        sparseIntArray.put(R.id.scrollView, 4);
        sparseIntArray.put(R.id.tvTrackingConsentDesc, 5);
        sparseIntArray.put(R.id.view1, 6);
        sparseIntArray.put(R.id.tvMandatoryCookies, 7);
        sparseIntArray.put(R.id.tvTechnicallyNecessary, 8);
        sparseIntArray.put(R.id.technicallyNecessarySwitch, 9);
        sparseIntArray.put(R.id.tvTechnicallyNecessaryDesc, 10);
        sparseIntArray.put(R.id.tvTechnicallyNecessaryReadMore, 11);
        sparseIntArray.put(R.id.view2, 12);
        sparseIntArray.put(R.id.tvOptionalCookies, 13);
        sparseIntArray.put(R.id.tvMarketing, 14);
        sparseIntArray.put(R.id.marketingSwitch, 15);
        sparseIntArray.put(R.id.tvMarketingDesc, 16);
        sparseIntArray.put(R.id.tvMarketingReadMore, 17);
        sparseIntArray.put(R.id.view4, 18);
        sparseIntArray.put(R.id.llTrackingInfo, 19);
        sparseIntArray.put(R.id.trackingInfoIcon, 20);
        sparseIntArray.put(R.id.tvReadFull, 21);
        sparseIntArray.put(R.id.bottomView, 22);
        sparseIntArray.put(R.id.acceptAllContainer, 23);
        sparseIntArray.put(R.id.allowSelectionContainer, 24);
        sparseIntArray.put(R.id.bottomNavShadow, 25);
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.A = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.A != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a8.k
    public final boolean c0(int i11, Object obj) {
        return false;
    }
}

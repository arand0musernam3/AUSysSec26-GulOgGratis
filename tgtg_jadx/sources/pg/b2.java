package pg;

import android.util.SparseIntArray;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends a2 {
    public static final SparseIntArray L;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.mainContentModular, 2);
        sparseIntArray.put(R.id.coverImageMnu, 3);
        sparseIntArray.put(R.id.imageOverlayMnu, 4);
        sparseIntArray.put(R.id.collapsibleBottomShadowMnu, 5);
        sparseIntArray.put(R.id.tagLayout, 6);
        sparseIntArray.put(R.id.dietContainerMnu, 7);
        sparseIntArray.put(R.id.dietContainer, 8);
        sparseIntArray.put(R.id.tagLeaf1, 9);
        sparseIntArray.put(R.id.tagLeaf2, 10);
        sparseIntArray.put(R.id.dietMnuTv, 11);
        sparseIntArray.put(R.id.topNamesLayoutMnu, 12);
        sparseIntArray.put(R.id.itemNameTopTvMnu, 13);
        sparseIntArray.put(R.id.spacerMnu, 14);
        sparseIntArray.put(R.id.ibBackContainerMnu, 15);
        sparseIntArray.put(R.id.ibBackMnu, 16);
        sparseIntArray.put(R.id.ibShareContainerMnu, 17);
        sparseIntArray.put(R.id.ibShareMnu, 18);
        sparseIntArray.put(R.id.brandLogoContainer, 19);
        sparseIntArray.put(R.id.ivBrandLogo, 20);
        sparseIntArray.put(R.id.bottomNavMnu, 21);
        sparseIntArray.put(R.id.bottomNavShadowMnu, 22);
        sparseIntArray.put(R.id.bottomNavLayoutMnu, 23);
        sparseIntArray.put(R.id.btnPositiveMnu, 24);
        sparseIntArray.put(R.id.bottomNavLayoutMnuBasket, 25);
        sparseIntArray.put(R.id.basketButtonRow, 26);
        sparseIntArray.put(R.id.loadingView, 27);
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.K = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.K != 0;
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
            this.K = 1L;
        }
        e0();
    }
}

package pg;

import android.util.SparseIntArray;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends c2 {
    public static final SparseIntArray P;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(R.id.manuView, 1);
        sparseIntArray.put(R.id.tvTitle, 2);
        sparseIntArray.put(R.id.sortButtonLayout, 3);
        sparseIntArray.put(R.id.sortButton, 4);
        sparseIntArray.put(R.id.isSortingIV, 5);
        sparseIntArray.put(R.id.searchNavigation, 6);
        sparseIntArray.put(R.id.searchBackIv, 7);
        sparseIntArray.put(R.id.tvSearchTitle, 8);
        sparseIntArray.put(R.id.categoryCarousel, 9);
        sparseIntArray.put(R.id.swipeRefreshLayout, 10);
        sparseIntArray.put(R.id.translucentBackground, 11);
        sparseIntArray.put(R.id.collapsibleBottomShadowMnu, 12);
        sparseIntArray.put(R.id.manufacturerRv, 13);
        sparseIntArray.put(R.id.bannerLayout, 14);
        sparseIntArray.put(R.id.bannerProgressLayout, 15);
        sparseIntArray.put(R.id.bannerAddForDeliveryTv, 16);
        sparseIntArray.put(R.id.progressBar, 17);
        sparseIntArray.put(R.id.bannerBasketLayout, 18);
        sparseIntArray.put(R.id.basketWagonIV, 19);
        sparseIntArray.put(R.id.bannerTitleTv, 20);
        sparseIntArray.put(R.id.bannerSubtotalTv, 21);
        sparseIntArray.put(R.id.bannerItemCount, 22);
        sparseIntArray.put(R.id.sortingBs, 23);
        sparseIntArray.put(R.id.errorView, 24);
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.O = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.O != 0;
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
            this.O = 1L;
        }
        e0();
    }
}

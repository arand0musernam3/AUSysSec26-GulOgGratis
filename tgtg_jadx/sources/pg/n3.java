package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;
import com.app.tgtg.customview.FavoriteIconView;
import com.app.tgtg.customview.TagContainerView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n3 extends m3 {
    public static final SparseIntArray M;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(R.id.cvStore, 1);
        sparseIntArray.put(R.id.ivStoreCoverImage, 2);
        sparseIntArray.put(R.id.gradient, 3);
        sparseIntArray.put(R.id.ivStoreLogo, 4);
        sparseIntArray.put(R.id.cvTags, 5);
        sparseIntArray.put(R.id.favIcon, 6);
        sparseIntArray.put(R.id.storeName, 7);
        sparseIntArray.put(R.id.infoLayout, 8);
        sparseIntArray.put(R.id.itemName, 9);
        sparseIntArray.put(R.id.tvPickupTimes, 10);
        sparseIntArray.put(R.id.ratingIcon, 11);
        sparseIntArray.put(R.id.itemRating, 12);
        sparseIntArray.put(R.id.distanceSeparator, 13);
        sparseIntArray.put(R.id.space, 14);
        sparseIntArray.put(R.id.distance, 15);
        sparseIntArray.put(R.id.tvOldPrice, 16);
        sparseIntArray.put(R.id.tvPrice, 17);
        sparseIntArray.put(R.id.dynamicPricingImageView, 18);
        sparseIntArray.put(R.id.specialRewardsImageView, 19);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n3(View view) {
        Object[] objArrB0 = a8.k.b0(view, 20, null, M);
        CardView cardView = (CardView) objArrB0[1];
        TagContainerView tagContainerView = (TagContainerView) objArrB0[5];
        TextView textView = (TextView) objArrB0[15];
        View view2 = (View) objArrB0[13];
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArrB0[18];
        FavoriteIconView favoriteIconView = (FavoriteIconView) objArrB0[6];
        LinearLayout linearLayout = (LinearLayout) objArrB0[3];
        super(null, view, cardView, tagContainerView, textView, view2, appCompatImageView, favoriteIconView, linearLayout, (TextView) objArrB0[9], (TextView) objArrB0[12], (ImageView) objArrB0[2], (ImageView) objArrB0[4], (ImageView) objArrB0[11], (View) objArrB0[14], (AppCompatImageView) objArrB0[19], (TextView) objArrB0[7], (TextView) objArrB0[16], (TextView) objArrB0[10], (TextView) objArrB0[17]);
        this.L = -1L;
        ((ConstraintLayout) objArrB0[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.L = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.L = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.L != 0;
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

package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;
import com.app.tgtg.customview.FavoriteIconView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i {
    public static final SparseIntArray I;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.flash_sales_logo, 2);
        sparseIntArray.put(R.id.store_cover_image, 3);
        sparseIntArray.put(R.id.inactive_overlay, 4);
        sparseIntArray.put(R.id.gradient, 5);
        sparseIntArray.put(R.id.collect_within, 6);
        sparseIntArray.put(R.id.out_of_time, 7);
        sparseIntArray.put(R.id.collect_within_title, 8);
        sparseIntArray.put(R.id.space, 9);
        sparseIntArray.put(R.id.collect_timer, 10);
        sparseIntArray.put(R.id.fav_icon, 11);
        sparseIntArray.put(R.id.storeName, 12);
        sparseIntArray.put(R.id.ic_distance, 13);
        sparseIntArray.put(R.id.distance, 14);
        sparseIntArray.put(R.id.info_layout, 15);
        sparseIntArray.put(R.id.bagName, 16);
        sparseIntArray.put(R.id.price, 17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(View view) {
        Object[] objArrB0 = a8.k.b0(view, 18, null, I);
        TextView textView = (TextView) objArrB0[16];
        CardView cardView = (CardView) objArrB0[0];
        TextView textView2 = (TextView) objArrB0[10];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrB0[6];
        TextView textView3 = (TextView) objArrB0[8];
        TextView textView4 = (TextView) objArrB0[14];
        FavoriteIconView favoriteIconView = (FavoriteIconView) objArrB0[11];
        Object obj = objArrB0[2];
        j1 j1VarA = obj != null ? j1.a((View) obj) : null;
        LinearLayout linearLayout = (LinearLayout) objArrB0[4];
        super(null, view, textView, cardView, textView2, constraintLayout, textView3, textView4, favoriteIconView, j1VarA, linearLayout, (TextView) objArrB0[7], (TextView) objArrB0[17], (View) objArrB0[9], (ImageView) objArrB0[3], (TextView) objArrB0[12]);
        this.H = -1L;
        this.f34897t.setTag(null);
        ((ConstraintLayout) objArrB0[1]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.H = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.H = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.H != 0;
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
